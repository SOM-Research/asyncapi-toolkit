package io.github.abelgomez.asyncapi.generator.target

import io.github.abelgomez.asyncapi.asyncApi.Channel
import io.github.abelgomez.asyncapi.generator.target.channels.ChannelClass
import io.github.abelgomez.asyncapi.generator.target.channels.OperationClass
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

import static extension io.github.abelgomez.asyncapi.generator.ModelExtensions.*
import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*
import static extension io.github.abelgomez.asyncapi.generator.utils.StringUtils.*

class ChannelPackage extends AbstractPackage {
		
	Channel channel
	ChannelClass channelClass
	OperationClass publishOperationClass
	OperationClass subscribeOperationClass
	
	static def createFrom(Channel channel) {
		return new ChannelPackage(channel)
	}
	
	private new(Channel channel) {
		this.channel = channel
		initialize()
	}
	
	private def initialize() {
		channelClass = ChannelClass.createFrom(channel)
		publishOperationClass = channel.publish?.transform
		subscribeOperationClass = channel.subscribe?.transform
	}
	
	override name() {
		return channel.name.asPackageName
	}
	
	override fqn() {
		return channel.api.transform.fqn + "." + name
	}
	
	def channelClass() {
		channelClass
	}
	
	def publishOperationClass() {
		publishOperationClass
	}

	def subscribeOperationClass() {
		subscribeOperationClass
	}
	
	override saveContents(IFileSystemAccess2 fsa, IGeneratorContext context) {
		channelClass?.generate(fsa)
		publishOperationClass?.generate(fsa)
		subscribeOperationClass?.generate(fsa)
	}
}
