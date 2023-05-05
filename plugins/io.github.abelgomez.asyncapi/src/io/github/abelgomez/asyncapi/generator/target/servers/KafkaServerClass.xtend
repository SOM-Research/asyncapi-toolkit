package io.github.abelgomez.asyncapi.generator.target.servers;

import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI
import io.github.abelgomez.asyncapi.asyncApi.Protocol
import io.github.abelgomez.asyncapi.asyncApi.Server
import io.github.abelgomez.asyncapi.generator.infra.IClass
import java.util.Collections
import java.util.TreeSet

import static extension io.github.abelgomez.asyncapi.generator.ModelExtensions.*
import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*
import static extension io.github.abelgomez.asyncapi.generator.utils.StringUtils.*
import static extension java.text.MessageFormat.*

class KafkaServerClass extends ServerClass implements IClass {

	protected new(Server server) {
		super(server)
	}

	override name() {
		return server.name.asJavaClassName + "Server"
	}
	
	override pkg() {
		(server.eContainer as AsyncAPI).transform.serversPackage.fqn
	}
	
	override fqn() {
		pkg + "." + name
	}
	
		
	override imports() {
		val result = new TreeSet		
		result += "java.text.MessageFormat"
		result += "java.util.List"
		result += "java.util.Map"
		result += "java.util.HashMap"
		result += "java.util.function.Consumer"
		result += "java.util.regex.Pattern"
		result += "java.util.regex.Matcher"
		result += "java.util.Properties"
		result += server.api.transform.parametersInterface.parameterLiteralInterface.fqn
		result += messageInterface.fqn
		result += operationInterface.fqn
		result += channelInterface.fqn
		result += serverInterface.fqn
		result += channelPublishConfigurationInterface.fqn
		result += channelSubscribeConfigurationInterface.fqn
		return Collections.unmodifiableNavigableSet(result)
	}
	
	private def scheme() {
		return switch (server.protocol) {
			case Protocol.KAFKA: "tcp"
			case Protocol.KAFKA_SECURE: "ssl"
			default: server.protocol.getName
		}
	}
	
	private def serverExceptionClass() {
		return server.api.transform.serverInterface.serverExceptionClass
	}
	
	private def serverInterface() {
		return server.api.transform.serverInterface
	}
	
	private def channelInterface() {
		return server.api.transform.channelInterface
	}
	
	private def operationInterface() {
		return server.api.transform.operationInterface
	}
	
	private def messageInterface() {
		return server.api.transform.messageInterface
	}
	
	private def channelPublishConfigurationInterface() {
		return server.api.transform.channelInterface.channelPublishConfigurationInterface
	} 

	private def channelSubscribeConfigurationInterface() {
		return server.api.transform.channelInterface.channelSubscribeConfigurationInterface
	} 
	
	private def receivedClass() {
		return server.api.transform.serverInterface.receivedClass
	}
	
	override serialize() '''
		package «pkg»;
		
		«imports.join(System.lineSeparator, [i | "import {0};".format(i)])»
		
		/**
		 *
		 * <code>«server.name»</code> server at <code>«scheme»:«server.expandUrl»</code>.
		 «IF server.description !== null»
		 *
		 * «server.description»
		 «ENDIF»
		 *
		 */
		public class «name» implements «serverInterface.name» {
			
			/**
			 * Server name
			 */
			public static final String NAME = "«server.name»";
		
			/**
			 * Server protocol
			 */
			public static final String PROTOCOL = "«server.protocol.getName»";
		
			/**
			 * Protocol scheme
			 */
			public static final String SCHEME = "«scheme»";
		
			/**
			 * Server URL
			 */
			public static final String URL = "«server.expandUrl»";

			/**
			 * Connection options
			 */
			private Properties options = new Properties();

			public static «name» create() throws «serverExceptionClass.name» {
				return create(null, null);
			}
			
			public static «name» create(String username, String password) throws «serverExceptionClass.name» {
				return new «name»(username, password);
			}
			
			private «name»(String username, String password) throws «serverExceptionClass.name» {
				throw new UnsupportedOperationException("Not implemented yet");
«««				if (username != null && password != null) {
«««					options.put("security.protocol", "SASL_PLAINTEXT");
«««					options.put("sasl.mechanism", "PLAIN");
«««					options.put("sasl.jaas.config", PlainLoginModule.class.getName() + " required username=\"" + KAFKA_USER + "\" password=\"" + KAFKA_PASSWORD + "\";")
«««				}
«««				options.setProperty("bootstrap.servers", "localhost:9092");
«««				options.setProperty("enable.auto.commit", "true");
«««				options.setProperty("auto.commit.interval.ms", "1000");
«««				options.setProperty("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
«««				options.setProperty("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
			}
			
			@Override
			public void connect(Class <? extends «operationInterface.name»> operation) throws «serverExceptionClass.name» {
				throw new UnsupportedOperationException("Not implemented yet");
			}
			
			@Override
			public boolean isConnected(Class <? extends «operationInterface.name»> operation) {
				throw new UnsupportedOperationException("Not implemented yet");
			}

			@Override
			public void disconnect(Class <? extends «operationInterface.name»> operation) throws «serverExceptionClass.name» {
				throw new UnsupportedOperationException("Not implemented yet");
			}
			
			@Override
			public void disconnect() throws «serverExceptionClass.name» {
				disconnect(false);
			}

			@Override
			public void disconnect(boolean force) throws «serverExceptionClass.name» {
				throw new UnsupportedOperationException("Not implemented yet");
			}

			@Override
			public void disconnectSilently() {
				throw new UnsupportedOperationException("Not implemented yet");
			}
			
			@Override
			public void publish(«channelPublishConfigurationInterface.name» config, «messageInterface.name» message) throws «serverExceptionClass.name» {
				throw new UnsupportedOperationException("Not implemented yet");
			}
			
			@Override
			public void subscribe(«channelSubscribeConfigurationInterface.name» config, Consumer<«receivedClass.name»> callback) throws «serverExceptionClass.name» {
				throw new UnsupportedOperationException("Not implemented yet");
			}
			
			@Override
			public void unsubscribe(«channelSubscribeConfigurationInterface.name» config) throws «serverExceptionClass.name» {
				throw new UnsupportedOperationException("Not implemented yet");
			}
		}
	'''
}
