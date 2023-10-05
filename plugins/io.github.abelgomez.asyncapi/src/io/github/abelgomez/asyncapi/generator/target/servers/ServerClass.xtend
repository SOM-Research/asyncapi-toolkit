package io.github.abelgomez.asyncapi.generator.target.servers

import io.github.abelgomez.asyncapi.asyncApi.Protocol
import io.github.abelgomez.asyncapi.asyncApi.Server
import io.github.abelgomez.asyncapi.generator.infra.IClass
import io.github.abelgomez.asyncapi.generator.target.AbstractType
import io.github.abelgomez.asyncapi.generator.utils.Assertions

import static extension io.github.abelgomez.asyncapi.generator.ModelExtensions.*
import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*
import static extension java.text.MessageFormat.*
import io.github.abelgomez.asyncapi.generator.AsyncApiGeneratorDelegate

abstract class ServerClass extends AbstractType implements IClass {

	protected Server server

	static def ServerClass createFrom(Server server) {
		switch (server.protocol) {
			case Protocol.MQTT,
			case Protocol.SECURE_MQTT:
				return new MqttServerClass(server)
			case Protocol.KAFKA,
			case Protocol.KAFKA_SECURE:
				return new KafkaServerClass(server)
			default:
				Assertions.fail("Unsupported protocol ''{0}'' for server ''{1}''".format(server.protocol, server))		
		}
	}

	protected new(Server server) {
		this.server = server
	}
	
	protected def serverExceptionClass() {
		return server.api.transform.serverInterface.serverExceptionClass
	}
	
	protected def serverInterface() {
		return server.api.transform.serverInterface
	}

	protected def monitoredServerInterface() {
		return server.api.transform.monitoredServerInterface
	}
	
	protected def channelInterface() {
		return server.api.transform.channelInterface
	}
	
	protected def messageInterface() {
		return server.api.transform.messageInterface
	}
	
	protected def operationInterface() {
		return server.api.transform.operationInterface
	}
	
	protected def channelPublishConfigurationInterface() {
		return server.api.transform.channelInterface.channelPublishConfigurationInterface
	} 

	protected def channelSubscribeConfigurationInterface() {
		return server.api.transform.channelInterface.channelSubscribeConfigurationInterface
	} 
	
	protected def receivedClass() {
		return server.api.transform.serverInterface.receivedClass
	}
	
	protected def sendMonitoringEventOperationClass() {
		return server.api.channels.findFirst[getName() == AsyncApiGeneratorDelegate.MONITORING_TOPIC]?.publish?.transform
	}
	
	protected def boolean isMonitored() {
		return server.isMonitored == io.github.abelgomez.asyncapi.asyncApi.Boolean._TRUE
	}
	
	protected def implementedInterface() {
		return isMonitored ? monitoredServerInterface : serverInterface
	}
	
	private def String getDefaultUserName() {
		return server.userName !== null ? '''"«server.userName»"'''  : "null";
	}

	private def String getDefaultPassword() {
		return server.password !== null ? '''"«server.password»"'''  : "null";
	}
	
	protected def monitoringProperties() '''
		«IF isMonitored»
			/**
			 * Server used to publish monitoring events
			 */
			private «serverInterface.name» monitoringServer;
			
		«ENDIF»
	'''

	protected def staticMethods() '''
		«IF isMonitored»
			/**
			 * Create a new {@link «name»} that will be monitored by <code>monitoredServer</code>
			 */
			public static «name» create(«serverInterface.name» monitoringServer) throws «serverExceptionClass.name» {
				«name» server = create(«defaultUserName», «defaultPassword», monitoringServer); 
				return server;
			}

			/**
			 * Create a new {@link «name»} that will be monitored by <code>monitoredServer</code>
			 * authenticating with the given <code>username</code> and <code>password</code>
			 */
			public static «name» create(String username, String password, «serverInterface.name» monitoringServer) throws «serverExceptionClass.name» {
				«name» server = new «name»(username, password);
				server.monitoringServer = monitoringServer;
				return server;
			}
		«ELSE»
			/**
			 * Create a new {@link «name»}
			 */
			public static «name» create() throws «serverExceptionClass.name» {
				return create(«defaultUserName», «defaultPassword»);
			}
			
			/**
			 * Create a new {@link «name»} authenticating with the given <code>username</code> and <code>password</code>
			 */
			public static «name» create(String username, String password) throws «serverExceptionClass.name» {
				return new «name»(username, password);
			}
		«ENDIF»
	'''

	protected def monitoringMethods() '''
«««		«IF isMonitored»
«««
«««			/**
«««			 * Return the {@link «serverInterface.name»} that should monitor this {@link «serverInterface.name»}
«««			 */
«««			public «serverInterface.name» getMonitoringServer() {
«««				return monitoringServer;
«««			}
«««		«ENDIF»
	'''
}
