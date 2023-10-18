package io.github.abelgomez.asyncapi.generator.target

import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI
import io.github.abelgomez.asyncapi.asyncApi.Boolean
import io.github.abelgomez.asyncapi.generator.target.channels.ChannelInterface
import io.github.abelgomez.asyncapi.generator.target.channels.OperationInterface
import io.github.abelgomez.asyncapi.generator.target.json.JsonSerializableInterface
import io.github.abelgomez.asyncapi.generator.target.messages.MessageInterface
import io.github.abelgomez.asyncapi.generator.target.parameters.ParametersInterface
import io.github.abelgomez.asyncapi.generator.target.servers.MonitoredServerInterface
import io.github.abelgomez.asyncapi.generator.target.servers.ServerInterface
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

import static extension io.github.abelgomez.asyncapi.generator.utils.StringUtils.*

class RootPackage extends AbstractPackage {

	AsyncAPI api
	
	ServersPackage serversPackage
	
	ServerInterface serverInterface
	MonitoredServerInterface monitoredServerInterface
	ChannelInterface channelInterface
	OperationInterface operationInterface
	ParametersInterface parametersInterface
	MessageInterface messageInterface
	JsonSerializableInterface jsonSerializableInterface

	MonitoringPackage monitoringPackage
	ExpressionsPackage expressionsPackage
	GuaranteeTermsPackage guaranteeTermsPackage
	MetricsPackage metricsPackage
	InstrumentsPackage instrumentsPackage

	static def createFrom(AsyncAPI api) {
		return new RootPackage(api)
	}

	private new(AsyncAPI api) {
		this.api = api
		initialize()
	}

	def initialize() {
		serversPackage = ServersPackage.createFrom(api.servers)
		serverInterface = ServerInterface.createFrom(api)
		monitoredServerInterface = MonitoredServerInterface.createFrom(api)
		channelInterface = ChannelInterface.createFrom(api)
		operationInterface = OperationInterface.createFrom(api)
		parametersInterface = ParametersInterface.createFrom(api)
		messageInterface = MessageInterface.createFrom(api)
		jsonSerializableInterface = JsonSerializableInterface.createFrom(api)

		if (api?.servers.exists[isMonitored == Boolean._TRUE]) {
			monitoringPackage = MonitoringPackage.createFrom(api)
			expressionsPackage = ExpressionsPackage.createFrom(api)
			metricsPackage = MetricsPackage.createFrom(api)
			instrumentsPackage = InstrumentsPackage.createFrom(api)
			guaranteeTermsPackage = GuaranteeTermsPackage.createFrom(api)
		}		
	}
	
	def serversPackage() {
		return serversPackage
	}

	def serverInterface() {
		return serverInterface
	}

	def monitoredServerInterface() {
		return monitoredServerInterface
	}

	def channelInterface() {
		return channelInterface
	}

	def operationInterface() {
		return operationInterface
	}

	def parametersInterface() {
		return parametersInterface
	}

	def messageInterface() {
		return messageInterface
	}

	def jsonSerializableInterface() {
		return jsonSerializableInterface
	}

	def monitoringPackage() {
		return monitoringPackage
	}
	
	def expressionsPackage() {
		return expressionsPackage
	}
	
	def guaranteeTermsPackage() {
		return guaranteeTermsPackage
	}

	def metricsPackage() {
		return metricsPackage
	}
	
	def instrumentsPackage() {
		return instrumentsPackage
	}

	override name() {
		return api?.info?.basePackage ?: api?.info?.title ?: ""
	}
	
	override fqn() {
		return name.toLowerCase.asPackageName
	}
	
	override saveContents(IFileSystemAccess2 fsa, IGeneratorContext context) {
		serversPackage.saveContents(fsa, context)
		serverInterface?.generate(fsa)
		monitoredServerInterface?.generate(fsa)
		channelInterface?.generate(fsa)
		operationInterface?.generate(fsa)
		parametersInterface?.generate(fsa)
		messageInterface?.generate(fsa)
		jsonSerializableInterface?.generate(fsa)

		monitoringPackage?.saveContents(fsa, context)
		expressionsPackage?.saveContents(fsa, context)
		guaranteeTermsPackage?.saveContents(fsa, context)
		metricsPackage?.saveContents(fsa, context)
		instrumentsPackage?.saveContents(fsa, context)

	}
}
