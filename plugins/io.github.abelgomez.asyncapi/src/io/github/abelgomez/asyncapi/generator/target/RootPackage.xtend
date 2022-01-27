package io.github.abelgomez.asyncapi.generator.target

import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI
import io.github.abelgomez.asyncapi.generator.target.channels.ChannelInterface
import io.github.abelgomez.asyncapi.generator.target.json.JsonSerializableInterface
import io.github.abelgomez.asyncapi.generator.target.messages.MessageInterface
import io.github.abelgomez.asyncapi.generator.target.parameters.ParametersInterface
import io.github.abelgomez.asyncapi.generator.target.servers.ServerInterface
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

import static extension io.github.abelgomez.asyncapi.generator.utils.StringUtils.*

class RootPackage extends AbstractPackage {

	AsyncAPI api
	ServersPackage serversPackage
	ServerInterface serverInterface
	ChannelInterface channelInterface
	ParametersInterface parametersInterface
	MessageInterface messageInterface
	JsonSerializableInterface jsonSerializableInterface
	

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
		channelInterface = ChannelInterface.createFrom(api)
		parametersInterface = ParametersInterface.createFrom(api)
		messageInterface = MessageInterface.createFrom(api)
		jsonSerializableInterface = JsonSerializableInterface.createFrom(api)
	}
	
	def serversPackage() {
		return serversPackage
	}

	def serverInterface() {
		return serverInterface
	}

	def channelInterface() {
		return channelInterface
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

	override name() {
		return api?.info?.basePackage ?: api?.info?.title ?: ""
	}
	
	override fqn() {
		return name.toLowerCase.asPackageName
	}
	
	override saveContents(IFileSystemAccess2 fsa, IGeneratorContext context) {
		serversPackage.saveContents(fsa, context)
		serverInterface?.generate(fsa)
		channelInterface?.generate(fsa)
		parametersInterface?.generate(fsa)
		messageInterface?.generate(fsa)
		jsonSerializableInterface?.generate(fsa)
	}
}
