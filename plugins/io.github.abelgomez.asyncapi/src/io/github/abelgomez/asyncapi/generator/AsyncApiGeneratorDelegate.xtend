package io.github.abelgomez.asyncapi.generator

import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI
import io.github.abelgomez.asyncapi.asyncApi.Channel
import io.github.abelgomez.asyncapi.asyncApi.Components
import io.github.abelgomez.asyncapi.asyncApi.Message
import io.github.abelgomez.asyncapi.asyncApi.Operation
import io.github.abelgomez.asyncapi.asyncApi.Schema
import io.github.abelgomez.asyncapi.asyncApi.Server
import io.github.abelgomez.asyncapi.generator.infra.ITargetElement
import io.github.abelgomez.asyncapi.generator.target.ChannelPackage
import io.github.abelgomez.asyncapi.generator.target.ComponentsPackage
import io.github.abelgomez.asyncapi.generator.target.RootPackage
import io.github.abelgomez.asyncapi.generator.target.channels.OperationClass
import io.github.abelgomez.asyncapi.generator.target.messages.MessageClass
import io.github.abelgomez.asyncapi.generator.target.schemas.SchemaAbstractType
import io.github.abelgomez.asyncapi.generator.target.servers.ServerClass
import java.util.HashMap
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*

class AsyncApiGeneratorDelegate {

	val IFileSystemAccess2 fsa
	val IGeneratorContext context

	val AsyncAPI api

	new(IFileSystemAccess2 fsa, IGeneratorContext context, AsyncAPI api) {
		this.fsa = fsa
		this.context = context
		this.api = api
	}

	def generate() {
		TransformationContext.initialize()
		try {
			api?.transform?.saveContents(fsa, context)
			api?.channels?.forEach[c | c.transform?.saveContents(fsa, context)]
			api?.components?.transform?.saveContents(fsa, context)
		} finally {
			TransformationContext.cleanup()
		}
	}

}

class TransformationContext {
	
	static ThreadLocal<HashMap<EObject, ITargetElement>> traces = ThreadLocal.withInitial([new HashMap]);

	static def initialize() {
		traces.get().clear()
	}

	static def RootPackage transform(AsyncAPI api) {
		traces.get().putIfAbsent(api, RootPackage.createFrom(api))
		return traces.get().get(api) as RootPackage
	}
	
	static def ServerClass transform(Server server) {
		traces.get().putIfAbsent(server, ServerClass.createFrom(server))
		return traces.get().get(server) as ServerClass
	}

	static def ComponentsPackage transform(Components components) {
		traces.get().putIfAbsent(components, ComponentsPackage.createFrom(components))
		return traces.get().get(components) as ComponentsPackage
	}

	static def ChannelPackage transform(Channel channel) {
		traces.get().putIfAbsent(channel, ChannelPackage.createFrom(channel))
		return traces.get().get(channel) as ChannelPackage
	}

	static def OperationClass transform(Operation operation) {
		traces.get().putIfAbsent(operation, OperationClass.createFrom(operation))
		return traces.get().get(operation) as OperationClass
	}

	static def SchemaAbstractType transform(Schema schema) {
		traces.get().putIfAbsent(schema, SchemaAbstractType.createFrom(schema))
		return traces.get().get(schema) as SchemaAbstractType
	}

	static def MessageClass transform(Message message) {
		traces.get().putIfAbsent(message, MessageClass.createFrom(message))
		return traces.get().get(message) as MessageClass
	}

	static def cleanup() {
		traces.get().clear()
	}
}
