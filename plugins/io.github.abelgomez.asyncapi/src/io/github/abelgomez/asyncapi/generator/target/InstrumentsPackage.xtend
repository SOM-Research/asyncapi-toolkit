package io.github.abelgomez.asyncapi.generator.target

import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI
import io.github.abelgomez.asyncapi.generator.target.monitor.instruments.LatencyMeasurementInstrumentClass
import io.github.abelgomez.asyncapi.generator.target.monitor.instruments.MeasurementInstrumentAbstractClass
import io.github.abelgomez.asyncapi.generator.target.monitor.instruments.MeasurementInstrumentInterface
import io.github.abelgomez.asyncapi.generator.target.monitor.instruments.PeriodMeasurementInstrumentClass
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*

class InstrumentsPackage extends AbstractPackage {

	AsyncAPI api
	
	MeasurementInstrumentInterface measurementInstrumentInterface
	MeasurementInstrumentAbstractClass measurementInstrumentAbstractClass
	PeriodMeasurementInstrumentClass periodMeasurementInstrumentClass
	LatencyMeasurementInstrumentClass latencyMeasurementInstrumentClass
	
	static def createFrom(AsyncAPI api) {
		return new InstrumentsPackage(api)
	}

	private new(AsyncAPI api) {
		this.api = api
		initialize()
	}

	def initialize() {
		measurementInstrumentInterface = MeasurementInstrumentInterface.createFrom(api)
		measurementInstrumentAbstractClass = MeasurementInstrumentAbstractClass.createFrom(api)
		periodMeasurementInstrumentClass = PeriodMeasurementInstrumentClass.createFrom(api)
		latencyMeasurementInstrumentClass = LatencyMeasurementInstrumentClass.createFrom(api)
	}
	
	override name() {
		return "instruments"
	}
	
	override fqn() {
		return api.transform.monitoringPackage.fqn + "." + name
	}
	
	def measurementInstrumentInterface() {
		return measurementInstrumentInterface
	}
	
	def measurementInstrumentAbstractClass() {
		return measurementInstrumentAbstractClass
	}
	
	def periodMeasurementInstrumentClass() {
		return periodMeasurementInstrumentClass
	}

	def latencyMeasurementInstrumentClass() {
		return latencyMeasurementInstrumentClass
	}
	
	override saveContents(IFileSystemAccess2 fsa, IGeneratorContext context) {
		measurementInstrumentInterface?.generate(fsa)
		measurementInstrumentAbstractClass?.generate(fsa)
		periodMeasurementInstrumentClass?.generate(fsa)
		latencyMeasurementInstrumentClass?.generate(fsa)
	}
}
