package io.github.abelgomez.asyncapi.generator

import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI
import io.github.abelgomez.asyncapi.asyncApi.AsyncApiFactory
import io.github.abelgomez.asyncapi.asyncApi.Boolean
import io.github.abelgomez.asyncapi.asyncApi.Channel
import io.github.abelgomez.asyncapi.asyncApi.Components
import io.github.abelgomez.asyncapi.asyncApi.GuaranteeTerm
import io.github.abelgomez.asyncapi.asyncApi.JsonType
import io.github.abelgomez.asyncapi.asyncApi.Message
import io.github.abelgomez.asyncapi.asyncApi.Operation
import io.github.abelgomez.asyncapi.asyncApi.QoSMetric
import io.github.abelgomez.asyncapi.asyncApi.Schema
import io.github.abelgomez.asyncapi.asyncApi.Server
import io.github.abelgomez.asyncapi.generator.infra.ITargetElement
import io.github.abelgomez.asyncapi.generator.target.ChannelPackage
import io.github.abelgomez.asyncapi.generator.target.ComponentsPackage
import io.github.abelgomez.asyncapi.generator.target.PomFile
import io.github.abelgomez.asyncapi.generator.target.RootPackage
import io.github.abelgomez.asyncapi.generator.target.channels.OperationClass
import io.github.abelgomez.asyncapi.generator.target.messages.MessageClass
import io.github.abelgomez.asyncapi.generator.target.monitor.guaranteeterms.GuaranteeTermClass
import io.github.abelgomez.asyncapi.generator.target.schemas.SchemaAbstractType
import io.github.abelgomez.asyncapi.generator.target.servers.ServerClass
import java.util.HashMap
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*
import io.github.abelgomez.asyncapi.generator.target.monitor.metrics.QoSMetricClass

class AsyncApiGeneratorDelegate {

	public static val SRC_FOLDER = "src/main/java" 
	public static val MONITORING_TOPIC = "infra/monitoring/events"
	

	val IFileSystemAccess2 fsa
	val IGeneratorContext generatorContext

	val AsyncAPI api

	new(IFileSystemAccess2 fsa, IGeneratorContext context, AsyncAPI api) {
		this.fsa = fsa
		this.generatorContext = context
		this.api = api
	}

	def generate() {
		TransformationContext.initialize()
		try {
			if (!api?.servers?.filter[isMonitored == Boolean._TRUE].empty) {
				api.injectMonitoringInfrastructure
			}
			api?.transform?.saveContents(fsa, generatorContext)
			api?.channels?.forEach[c | c.transform?.saveContents(fsa, generatorContext)]
			api?.components?.transform?.saveContents(fsa, generatorContext)
			PomFile.createFrom(api).generate(fsa)
		} finally {
			TransformationContext.cleanup()
		}
	}

	static def injectMonitoringInfrastructure(AsyncAPI api) {
		val msg = AsyncApiFactory.eINSTANCE.createMessage => [
			description = "Message of a monitoring event. This is an internal class of the AsyncAPI Toolkit."
			payload = AsyncApiFactory.eINSTANCE.createSchema => [
				description = "Payload of a monitoring event"
				properties += AsyncApiFactory.eINSTANCE.createNamedSchema => [
					name = "timestamp"
					schema = AsyncApiFactory.eINSTANCE.createSchema => [
						description = "Timestamp of the exact moment where the event took place."
						type = JsonType.STRING
					]
				]
				properties += AsyncApiFactory.eINSTANCE.createNamedSchema => [
					name = "clientId"
					schema = AsyncApiFactory.eINSTANCE.createSchema => [
						description = "Identifier of the client generating the event."
						type = JsonType.STRING
					]
				]
				properties += AsyncApiFactory.eINSTANCE.createNamedSchema => [
					name = "messageId"
					schema = AsyncApiFactory.eINSTANCE.createSchema => [
						description = "Identifier of the message involved in the event. It may be null if the " 
								+ "event is not associated to a message, or the message involved does not specify an ID."
						type = JsonType.STRING
					]
				]
				properties += AsyncApiFactory.eINSTANCE.createNamedSchema => [
					name = "event"
					schema = AsyncApiFactory.eINSTANCE.createSchema => [
						description = "Event type"
						type = JsonType.STRING
						enum += "client-connected"
						enum += "client-disconnected"
						enum += "client-subscribed"
						enum += "client-unsubscribed"
						enum += "message-sent"
						enum += "message-received"
					]
				]
			]
		]
		api.channels += AsyncApiFactory.eINSTANCE.createChannel => [
			name = MONITORING_TOPIC
			publish = AsyncApiFactory.eINSTANCE.createOperation => [
				operationId = "SendMonitoringEvent"
				description = "Class to publish a monitoring event. This is an internal class of the AsyncAPI Toolkit and should not be used by the clients."
				message = EcoreUtil.copy(msg)
			]
			subscribe = AsyncApiFactory.eINSTANCE.createOperation => [
				operationId = "ReceiveMonitoringEvent"
				description = "Class to publish a monitoring event. This is an internal class of the AsyncAPI Toolkit and should not be used by the clients."
				message = EcoreUtil.copy(msg)
			]
		]
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

	static def QoSMetricClass transform(QoSMetric metric) {
		traces.get().putIfAbsent(metric, QoSMetricClass.createFrom(metric))
		return traces.get().get(metric) as QoSMetricClass
	}

	static def GuaranteeTermClass transform(GuaranteeTerm guaranteeTerm) {
		traces.get().putIfAbsent(guaranteeTerm, GuaranteeTermClass.createFrom(guaranteeTerm))
		return traces.get().get(guaranteeTerm) as GuaranteeTermClass
	}

	static def cleanup() {
		traces.get().clear()
	}
}
