package io.github.abelgomez.asyncapi.generator.target

import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*
import io.github.abelgomez.asyncapi.generator.target.monitor.MonitorClass

class MonitoringPackage extends AbstractPackage {

	AsyncAPI api
	
	MonitorClass monitorClass
	
	static def createFrom(AsyncAPI api) {
		return new MonitoringPackage(api)
	}

	private new(AsyncAPI api) {
		this.api = api
		initialize()
	}

	def initialize() {
		monitorClass = MonitorClass.createFrom(api)
	}
	
	override name() {
		return "monitoring"
	}
	
	override fqn() {
		return api.transform.fqn + ".infra." + name
	}
	
	def monitorClass() {
		return monitorClass
	}
	
	override saveContents(IFileSystemAccess2 fsa, IGeneratorContext context) {
		monitorClass?.generate(fsa)
	}
}
