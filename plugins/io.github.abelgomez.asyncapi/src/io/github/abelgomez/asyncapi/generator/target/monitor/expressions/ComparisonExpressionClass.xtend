package io.github.abelgomez.asyncapi.generator.target.monitor.expressions

import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI
import io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage
import io.github.abelgomez.asyncapi.generator.infra.IClass
import io.github.abelgomez.asyncapi.generator.infra.IType
import io.github.abelgomez.asyncapi.generator.target.AbstractType
import java.util.Collections
import java.util.TreeSet

import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*
import static extension java.text.MessageFormat.*

class ComparisonExpressionClass extends AbstractType implements IType {

	static class OperatorType extends AbstractType implements IClass {
		
		ComparisonExpressionClass comparisonExpressionClass
	
		private new(ComparisonExpressionClass comparisonExpressionClass) {
			this.comparisonExpressionClass = comparisonExpressionClass
		}
	
		override name() {
			return "Operator"
		}
		
		override pkg() {
			comparisonExpressionClass.pkg
		}
		
		override fqn() {
			comparisonExpressionClass.fqn + "." + name
		}
		
		override imports() {
			val result = new TreeSet
			return Collections.unmodifiableNavigableSet(result)
		}
		
		override serialize() '''
			/**
			 * Operator types
			 */
			public enum «name» {
				«AsyncApiPackage.Literals.OPERATOR.ELiterals.join("", "," + System.lineSeparator, ";", [l | l.name.toUpperCase + "(" + l.literal + ")"])»
				
				private String symbol;
				
				private «name»(String symbol) {
					this.symbol = symbol;
				}
				
				public String getSymbol() {
					return symbol;
				}
			}
		'''
	}

	AsyncAPI api
	OperatorType operatorType

	static def ComparisonExpressionClass createFrom(AsyncAPI api) {
		return new ComparisonExpressionClass(api)
	}

	private new(AsyncAPI api) {
		this.api = api
		operatorType = new OperatorType(this)
	}

	override name() {
		return "ComparisonExpression"
	}
	
	override pkg() {
		api.transform.expressionsPackage.fqn
	}
	
	override fqn() {
		pkg + "." + name
	}
	
	override imports() {
		val result = new TreeSet
		result += "java.math.BigDecimal"
		result += "java.util.List"
		result += "java.util.ArrayList"
		result += "java.time.Instant"
		result += "java.util.logging.Logger"
		result += "java.text.MessageFormat"
		result += measurementInstrumentInterface.fqn
		result += measurementInstrumentInterface.measurementObserverInterface.fqn
		result += qosMetricInterface.fqn
		result += subscribeOperationInterface.fqn
		result += monitoredServerInterface.fqn
		return Collections.unmodifiableNavigableSet(result)
	}
	
	def subscribeOperationInterface() {
		return api.transform.operationInterface.subscribeOperationInterface
	}
	
	def operatorType() {
		return operatorType
	}
	
	def measurementBooleanExpressionInterface() {
		return api.transform.expressionsPackage.measurementBooleanExpressionInterface
	}
	
	def measurementInstrumentInterface() {
		return api.transform.instrumentsPackage.measurementInstrumentInterface
	}
	
	def qosMetricInterface() {
		return api.transform.metricsPackage.qoSMetricInterface
	}
	
	def serverInterface() {
		return api.transform.serverInterface
	}
	
	def monitoredServerInterface() {
		return api.transform.monitoredServerInterface
	}
	
	override serialize() '''
		package «pkg»;
		«imports.join(System.lineSeparator, System.lineSeparator, "", [i | "import {0};".format(i)])»
		
		/**
		 * Comparison expression
		 */
		public class «name» implements «measurementBooleanExpressionInterface.name», «measurementInstrumentInterface.measurementObserverInterface.name» {
			
			«operatorType.serialize»
			
			private Logger logger = Logger.getLogger(«name».class.getName());
			
			
			protected List<«measurementBooleanExpressionInterface.measurementExpressionObserverInterface.name»> observers = new ArrayList<>();
			
			protected «measurementInstrumentInterface.name» measurementInstrument;
			
			protected Operator operator;
			
			protected BigDecimal targetValue;
			
			public static final «name» of(«operatorType.name» operator, BigDecimal targetValue, «monitoredServerInterface.name» server, «subscribeOperationInterface.name» subscribeOperation, «qosMetricInterface.name» metric) {
				return new «name»(operator, targetValue, server, subscribeOperation, metric);
			}
			
			private «name»(Operator operator, BigDecimal targetValue, «monitoredServerInterface.name» server, «subscribeOperationInterface.name» subscribeOperation, «qosMetricInterface.name» metric) {
				this.operator = operator;
				this.targetValue = targetValue;
				this.measurementInstrument = «measurementInstrumentInterface.name».createInstrumentFor(server, subscribeOperation, metric);
				this.measurementInstrument.addObserver(this);
			}
			
			@Override
			public boolean isTrue() {
				if (measurementInstrument.getValue().isPresent()) {
					BigDecimal measured = measurementInstrument.getValue().get();
					switch (operator) {
						case GREATER:
							return measured.compareTo(targetValue) > 0;
						case GREATER_EQUAL:
							return measured.compareTo(targetValue) >= 0;
						case EQUAL:
							return measured.compareTo(targetValue) == 0;
						case LESS_EQUAL:
							return measured.compareTo(targetValue) <= 0;
						case LESS:
							return measured.compareTo(targetValue) < 0;
					}
				}
				return false;
			}

			@Override
			public Instant lastUpdated() {
				return measurementInstrument.lastUpdated();
			}
			
			@Override
			public void update(«measurementInstrumentInterface.name» measurementInstrument) {
				String msg = MessageFormat.format("Reevaluating comparison expression of measurement instrument ''{0}'': {1}",
								measurementInstrument.getClass().getSimpleName(), this.toString());
				if (isTrue()) {
					logger.fine(msg);
				} else {
					logger.severe(msg);
				}
				notifyObservers();
			}
			
			@Override
			public void addObserver(«measurementBooleanExpressionInterface.measurementExpressionObserverInterface.name» observer) {
				observers.add(observer);
			};
			
			@Override
			public void removeObserver(«measurementBooleanExpressionInterface.measurementExpressionObserverInterface.name» observer) {
				observers.remove(observer);
			};
			
			@Override
			public void notifyObservers() {
				observers.stream().forEach(o -> o.update(this));
			}
			
			@Override
			public String toString() {
				return String.format("(%s %s %s %s ? %b)",
					measurementInstrument.toString(),
					operator.getSymbol(),
					targetValue,
					measurementInstrument.getMetric().getUnit().toString().toLowerCase(),
					isTrue());
			} 
		}
	'''
}
