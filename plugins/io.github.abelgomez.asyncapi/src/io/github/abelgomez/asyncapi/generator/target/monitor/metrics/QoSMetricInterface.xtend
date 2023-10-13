package io.github.abelgomez.asyncapi.generator.target.monitor.metrics

import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI
import io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage
import io.github.abelgomez.asyncapi.generator.infra.IClass
import io.github.abelgomez.asyncapi.generator.infra.IType
import io.github.abelgomez.asyncapi.generator.target.AbstractType
import java.util.Collections
import java.util.TreeSet

import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*
import static extension java.text.MessageFormat.*

class QoSMetricInterface extends AbstractType implements IType {

	static class MetricType extends AbstractType implements IClass {
		
		QoSMetricInterface qoSMetricInterface
	
		private new(QoSMetricInterface qoSMetricInterface) {
			this.qoSMetricInterface = qoSMetricInterface
		}
	
		override name() {
			return "MetricType"
		}
		
		override pkg() {
			qoSMetricInterface.pkg
		}
		
		override fqn() {
			qoSMetricInterface.fqn + "." + name
		}
		
		override imports() {
			val result = new TreeSet
			return Collections.unmodifiableNavigableSet(result)
		}
		
		override serialize() '''
			/**
			 * Supported metric types
			 */
			public enum MetricType {
				«AsyncApiPackage.Literals.QO_SMETRIC_TYPE.ELiterals.join("", "," + System.lineSeparator, "", [l | l.name.toUpperCase])»
			}
		'''
	}
	
	static class MetricUnit extends AbstractType implements IClass {
		
		QoSMetricInterface qoSMetricInterface
	
		private new(QoSMetricInterface qoSMetricInterface) {
			this.qoSMetricInterface = qoSMetricInterface
		}
	
		override name() {
			return "MetricUnit"
		}
		
		override pkg() {
			qoSMetricInterface.pkg
		}
		
		override fqn() {
			qoSMetricInterface.fqn + "." + name
		}
		
		override imports() {
			val result = new TreeSet
			return Collections.unmodifiableNavigableSet(result)
		}
		
		override serialize() '''
			/**
			 * Supported metric types
			 */
			public enum MetricUnit {
				«AsyncApiPackage.Literals.QO_SMETRIC_UNIT.ELiterals.join("", "," + System.lineSeparator, "", [l | l.name.toUpperCase])»
			}
		'''
	}

	AsyncAPI api
	MetricType metricType
	MetricUnit metricUnit

	static def QoSMetricInterface createFrom(AsyncAPI api) {
		return new QoSMetricInterface(api)
	}

	private new(AsyncAPI api) {
		this.api = api
		metricType = new MetricType(this);
		metricUnit = new MetricUnit(this);
	}

	override name() {
		return "IQoSMetric"
	}
	
	override pkg() {
		api.transform.fqn + ".infra.monitoring.metrics"
	}
	
	override fqn() {
		pkg + "." + name
	}
	
	override imports() {
		val result = new TreeSet
		return Collections.unmodifiableNavigableSet(result)
	}
	
	def metricType() {
		return metricType
	}
	
	def metricUnit() {
		return metricUnit
	}
		
	override serialize() '''
		package «pkg»;
		«imports.join(System.lineSeparator, System.lineSeparator, "", [i | "import {0};".format(i)])»
		
		/**
		 * Base interface for metrics
		 */
		public interface «name» {
			
			«metricType.serialize»
			
			«metricUnit.serialize»
			
			/**
			 * Return the metric type
			 */
			public «metricType.name» getType();
			
			/**
			 * Return the metric unit
			 */
			public «metricUnit.name» getUnit();

			/**
			 * Return the <code>groupedByEvent</code> flag
			 */
			public boolean getGroupedByEvent();
		}
	'''
}
