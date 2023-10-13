package io.github.abelgomez.asyncapi.generator.target

import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI
import io.github.abelgomez.asyncapi.generator.target.monitor.metrics.QoSMetricClass
import io.github.abelgomez.asyncapi.generator.target.monitor.metrics.QoSMetricInterface
import java.util.ArrayList
import java.util.List
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

import static extension io.github.abelgomez.asyncapi.generator.ModelExtensions.*
import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*

class MetricsPackage extends AbstractPackage {

	AsyncAPI api

	QoSMetricInterface qoSMetricInterface
	List<QoSMetricClass> metricClasses = new ArrayList

	static def createFrom(AsyncAPI api) {
		return new MetricsPackage(api)
	}

	private new(AsyncAPI api) {
		this.api = api
		initialize()
	}

	def initialize() {
		qoSMetricInterface = QoSMetricInterface.createFrom(api)
		metricClasses.addAll(api?.components?.nestedMetrics.map[transform])
	}

	override name() {
		return "metrics"
	}

	override fqn() {
		return api.transform.monitoringPackage.fqn + "." + name
	}

	def qoSMetricInterface() {
		return qoSMetricInterface
	}

	override saveContents(IFileSystemAccess2 fsa, IGeneratorContext context) {
		qoSMetricInterface?.generate(fsa)
		metricClasses.forEach[m|m?.generate(fsa)]
	}
}
