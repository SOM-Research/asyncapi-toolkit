package io.github.abelgomez.asyncapi.generator.target.monitor.guaranteeterms

import io.github.abelgomez.asyncapi.asyncApi.AndExpression
import io.github.abelgomez.asyncapi.asyncApi.BooleanExpression
import io.github.abelgomez.asyncapi.asyncApi.ComparisonExpression
import io.github.abelgomez.asyncapi.asyncApi.GuaranteeTerm
import io.github.abelgomez.asyncapi.asyncApi.NamedQoSMetric
import io.github.abelgomez.asyncapi.asyncApi.OrExpression
import io.github.abelgomez.asyncapi.asyncApi.QoSMetric
import io.github.abelgomez.asyncapi.asyncApi.Reference
import io.github.abelgomez.asyncapi.asyncApi.Scope
import io.github.abelgomez.asyncapi.asyncApi.Slo
import io.github.abelgomez.asyncapi.generator.infra.IClass
import io.github.abelgomez.asyncapi.generator.target.AbstractType
import io.github.abelgomez.asyncapi.generator.target.channels.ChannelClass
import java.util.Collections
import java.util.TreeSet

import static extension io.github.abelgomez.asyncapi.generator.ModelExtensions.*
import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*
import static extension io.github.abelgomez.asyncapi.generator.utils.StringUtils.*
import static extension java.text.MessageFormat.*

class GuaranteeTermClass extends AbstractType implements IClass {

	GuaranteeTerm guaranteeTerm

	static def createFrom(GuaranteeTerm guaranteeTerm) {
		return new GuaranteeTermClass(guaranteeTerm)
	}

	protected new(GuaranteeTerm guaranteeTerm) {
		this.guaranteeTerm = guaranteeTerm
	}

	override name() {
		return guaranteeTerm.name.asJavaClassName
	}
	
	override pkg() {
		guaranteeTerm.api.transform.guaranteeTermsPackage.fqn
	}
	
	override fqn() {
		pkg + "." + name
	}
	
	override imports() {
		val result = new TreeSet
		result += "java.time.Instant"
		result += "java.time.Duration"
		result += "java.text.MessageFormat"
		result += "java.util.Timer"
		result += "java.util.TimerTask"
		result += "java.util.logging.Logger"
		result += monitoredServerInterface.fqn 
		result += serverInterface.serverExceptionClass.fqn
		result += measurementBooleanExpressionInterface.fqn
		if (guaranteeTerm.eAllContents.exists[e | e instanceof AndExpression]) {
			result += guaranteeTerm.api.transform.expressionsPackage.andBooleanExpressionClass.fqn
		}
		if (guaranteeTerm.eAllContents.exists[e | e instanceof OrExpression]) {
			result += guaranteeTerm.api.transform.expressionsPackage.orBooleanExpressionClass.fqn
		}
		if (guaranteeTerm.eAllContents.exists[e | e instanceof ComparisonExpression]) {
			result += "java.math.BigDecimal"
			result += guaranteeTerm.scopes.map[reference.transform.channelClass.fqn]
			result += guaranteeTerm.api.transform.expressionsPackage.comparisonExpressionClass.fqn
			result += guaranteeTerm.api.transform.expressionsPackage.comparisonExpressionClass.operatorType.fqn
		}
		if (guaranteeTerm.eAllContents.exists[e | e instanceof QoSMetric]) {
			result += guaranteeTerm.api.transform.metricsPackage.qoSMetricInterface.fqn
		}
		result += guaranteeTerm.eAllContents.filter(ComparisonExpression).map[qosMetric]
					.filter(Reference).map[r | r.resolve(NamedQoSMetric)].map[qosMetric.resolve.transform.fqn].toIterable
		return Collections.unmodifiableNavigableSet(result)
	}

	static def String toValueInitialization(AndExpression and, ChannelClass channelClass) '''
		AndBooleanExpression.of(
			«and.conditions.map[toValueInitialization(channelClass)].join("," + System.lineSeparator)»
		)'''
	
	static def String toValueInitialization(OrExpression or, ChannelClass channelClass) '''
		OrBooleanExpression.of(
			«or.conditions.map[toValueInitialization(channelClass)].join("," + System.lineSeparator)»
		)'''

	static def String toValueInitialization(ComparisonExpression comp, ChannelClass channelClass) '''
		ComparisonExpression.of(Operator.«comp.operator.getName().toUpperCase», new BigDecimal(«comp.value»), server, «channelClass.name».«channelClass.subscribeOperationClass.name», new «comp.qosMetric.resolve.transform.name»())'''
	
	static def toValueInitialization(BooleanExpression e, ChannelClass channelClass) {
		if (e instanceof AndExpression) e.toValueInitialization(channelClass)
		else if (e instanceof OrExpression) e.toValueInitialization(channelClass)
		else if (e instanceof ComparisonExpression) e.toValueInitialization(channelClass)
		else throw new RuntimeException("Unknow type of Boolean expression: " + e);
	}
	
	def monitoredServerInterface() {
		return guaranteeTerm.api.transform.monitoredServerInterface
	}
	
	def serverInterface() {
		return guaranteeTerm.api.transform.serverInterface
	}
	
	def measurementBooleanExpressionInterface() {
		return guaranteeTerm.api.transform.expressionsPackage.measurementBooleanExpressionInterface
	}
	
	static def expressionName(Slo slo, Scope scope) {
		return scope.name.asJavaIdentifier + slo.name.asJavaClassName + "Expression"
	}
	
	override serialize() '''
		package «pkg»;
		
		«imports.join(System.lineSeparator, [i | "import {0};".format(i)])»
		
		public class «name» extends «guaranteeTerm.api.transform.guaranteeTermsPackage.guaranteeTermAbstractClass.name» {
			
			private Logger logger = Logger.getLogger(«name».class.getName());
			«FOR metric : guaranteeTerm.nestedMetrics»

			«metric.transform.serialize»
			«ENDFOR»
			«FOR scope : guaranteeTerm.scopes»
				«FOR slo : guaranteeTerm.slos»

				private «measurementBooleanExpressionInterface.name» «slo.expressionName(scope)» = 
						«slo.condition.toValueInitialization(scope.reference.transform.channelClass)»;
				«ENDFOR»
			«ENDFOR»

			private Timer timer;
			
			public «name»(«monitoredServerInterface.name» server) {
				super(server);
			}
			
			@Override
			public String getName() {
				return "«guaranteeTerm.name»";
			}
			
			@Override
			public void start(int period, int timeout) throws ServerException {
				timer = new Timer(getName());
				timer.schedule(new TimerTask()  {
					@Override
					public void run() {
						Instant now = Instant.now();
						«FOR scope : guaranteeTerm.scopes»
							«FOR slo : guaranteeTerm.slos»
							if (Duration.between(«slo.expressionName(scope)».lastUpdated(), now).abs().toSeconds() > timeout) {
								logger.warning(MessageFormat.format("SLO ''«slo.expressionName(scope)»'' has not been evaluated since ''{0}''", «slo.expressionName(scope)».lastUpdated()));
							}
							«ENDFOR»
						«ENDFOR»
					}
				}, period * 1000, period * 1000);

				«FOR scope : guaranteeTerm.scopes»
					«FOR slo : guaranteeTerm.slos»
					«slo.expressionName(scope)».addObserver(this);
					«ENDFOR»
				«ENDFOR»
			}
		
			@Override
			public void stop() throws «serverInterface.serverExceptionClass.name» {
				«FOR scope : guaranteeTerm.scopes»
					«FOR slo : guaranteeTerm.slos»
					«slo.expressionName(scope)».removeObserver(this);
					«ENDFOR»
				«ENDFOR»
				timer.cancel();
			}
			
			«FOR scope : guaranteeTerm.scopes»
				«FOR slo : guaranteeTerm.slos»
				public boolean «slo.expressionName(scope)»Complies() {
					return «slo.expressionName(scope)».isTrue();
				}

				«ENDFOR»
			«ENDFOR»
			@Override
			public void update(«measurementBooleanExpressionInterface.name» measurementBooleanExpression) {
				if (!measurementBooleanExpression.isTrue()) {
					logger.severe(MessageFormat.format("Guarantee term ''{0}'' does not comply with the defined SLO: {1}", getName(), measurementBooleanExpression));
				}
			}
		}
	'''
}
