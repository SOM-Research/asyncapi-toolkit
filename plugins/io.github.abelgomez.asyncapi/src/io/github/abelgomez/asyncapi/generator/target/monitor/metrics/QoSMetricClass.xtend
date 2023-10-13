package io.github.abelgomez.asyncapi.generator.target.monitor.metrics

import io.github.abelgomez.asyncapi.asyncApi.QoSMetric
import io.github.abelgomez.asyncapi.generator.infra.IType
import io.github.abelgomez.asyncapi.generator.target.AbstractType
import java.util.Collections
import java.util.TreeSet

import static extension io.github.abelgomez.asyncapi.generator.ModelExtensions.*
import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*
import static extension io.github.abelgomez.asyncapi.generator.utils.StringUtils.*
import static extension java.text.MessageFormat.*

class QoSMetricClass extends AbstractType implements IType {

	QoSMetric metric

	static def QoSMetricClass createFrom(QoSMetric metric) {
		return new QoSMetricClass(metric)
	}

	private new(QoSMetric metric) {
		this.metric = metric
	}

	override name() {
		return metric.name.asJavaClassName + "Metric"
	}
	
	override pkg() {
		metric.api.transform.metricsPackage.fqn
	}
	
	override fqn() {
		pkg + "." + name
	}
	
	override imports() {
		val result = new TreeSet
		return Collections.unmodifiableNavigableSet(result)
	}
	
	def qoSMetricInterface() {
		return metric.api.transform.metricsPackage.qoSMetricInterface
	}
	
	override serialize() '''
		«IF metric.isReusable»
		package «pkg»;
		
		«imports.join(System.lineSeparator, [i | "import {0};".format(i)])»
		
		«ENDIF»
		/**
		 * Metric for «metric.name»
		 */
		public class «name» implements «qoSMetricInterface.name» {
			
			@Override
			public «qoSMetricInterface.metricType.name» getType() {
				return «qoSMetricInterface.metricType.name».«metric.metricType.literal.toUpperCase.replace("\"", "").replace("-", "_")»;
			}

			@Override
			public «qoSMetricInterface.metricUnit.name» getUnit() {
				return «qoSMetricInterface.metricUnit.name».«metric.unit.literal.toUpperCase.replace("\"", "").replace("-", "_")»;
			}

			@Override
			public boolean getGroupedByEvent() {
				return «metric.groupedByEvent»;
			}
		}
	'''
}
