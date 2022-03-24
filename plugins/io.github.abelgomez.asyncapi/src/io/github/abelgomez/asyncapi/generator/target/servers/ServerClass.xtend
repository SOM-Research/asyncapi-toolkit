package io.github.abelgomez.asyncapi.generator.target.servers

import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI
import io.github.abelgomez.asyncapi.asyncApi.Protocol
import io.github.abelgomez.asyncapi.asyncApi.Server
import io.github.abelgomez.asyncapi.generator.infra.IClass
import io.github.abelgomez.asyncapi.generator.target.AbstractType
import io.github.abelgomez.asyncapi.generator.utils.Assertions
import java.util.Collections
import java.util.TreeSet

import static extension io.github.abelgomez.asyncapi.generator.ModelExtensions.*
import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*
import static extension io.github.abelgomez.asyncapi.generator.utils.StringUtils.*
import static extension java.text.MessageFormat.*

abstract class ServerClass extends AbstractType implements IClass {

	protected Server server

	static def createFrom(Server server) {
		switch (server.protocol) {
			case Protocol.MQTTS,
			case Protocol.MQTT:
				return new MqttServerClass(server)
			default:
				Assertions.fail("Unsupported protocol ''{0}'' for server ''{1}''".format(server.protocol, server))		
		}
	}

	protected new(Server server) {
		this.server = server
	}
}

class MqttServerClass extends ServerClass implements IClass {

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
		result += "java.util.Map.Entry"
		result += "java.util.HashMap"
		result += "java.util.function.Consumer"
		result += "java.util.regex.Pattern"
		result += "java.util.regex.Matcher"
		result += "org.eclipse.paho.client.mqttv3.MqttClient"
		result += "org.eclipse.paho.client.mqttv3.MqttConnectOptions"
		result += "org.eclipse.paho.client.mqttv3.MqttException"
		result += "org.eclipse.paho.client.mqttv3.MqttMessage"
		result += "org.eclipse.paho.client.mqttv3.MqttCallback"
		result += "org.eclipse.paho.client.mqttv3.IMqttDeliveryToken"
		result += "org.eclipse.paho.client.mqttv3.persist.MemoryPersistence"
		result += server.api.transform.parametersInterface.parameterLiteralInterface.fqn
		result += channelInterface.fqn
		result += serverInterface.fqn
		result += channelPublishConfigurationInterface.fqn
		result += channelSubscribeConfigurationInterface.fqn
		return Collections.unmodifiableNavigableSet(result)
	}
	
	private def scheme() {
		return switch (server.protocol) {
			case Protocol.MQTT: "tcp"
			case Protocol.MQTTS: "ssl"
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
			
			private enum Operation { PUBLISH, SUBSCRIBE };
			
			private static final int DEFAULT_QOS = 2;
			
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
			MqttConnectOptions options = new MqttConnectOptions();

			/**
			 * Map containing the registered {@link MqttClient}s for the different {@link «channelInterface.name»}s
			 */
			private Map<Entry<«channelInterface.name», Operation>, MqttClient> clients = new HashMap<>();

			/**
			 * Map containing the registered {@link MqttCallbacks}s for the different {@link MqttClients}s
			 */
			private Map<MqttClient, Consumer<«receivedClass.name»>> callbacks = new HashMap<>();
			
			
			public static «name» create() throws «serverExceptionClass.name» {
				return new «name»();
			}
			
			private «name»() throws «serverExceptionClass.name» {
				options.setCleanSession(true);
			}
			
			private void connect(«channelInterface.name» channel, Operation operation) throws «serverExceptionClass.name» {
				if (!isConnected(channel, operation)) {
					MqttClient client = getClientFor(channel, operation);
					try {
				    	client.connect(options);
					} catch (MqttException e) {
						throw new ServerException(e);
					}	
				} 
			}
			
			private boolean isConnected(«channelInterface.name» channel, Operation operation) {
				MqttClient client = clients.get(Map.entry(channel, operation));
			    return client != null ? client.isConnected() : false;
			}
			
			@Override
			public void disconnect() throws «serverExceptionClass.name» {
				disconnect(false);
			}

			@Override
			public void disconnect(boolean force) throws «serverExceptionClass.name» {
				ServerException failure = new ServerException();
				for (MqttClient client : clients.values()) {
					try {
						if (force) { 
							client.disconnectForcibly();
						} else {
							client.disconnect();
						}
					} catch (MqttException e) {
						failure.addException(e); 
					}
				} 
				if (!failure.getExceptions().isEmpty()) {
					throw failure;
				}
			}

			@Override
			public void disconnectSilently() {
				for (MqttClient client : clients.values()) {
					try {
				    	client.disconnect();
					} catch (MqttException e) {
					}
				} 
			}
			
			@Override
			public void publish(«channelPublishConfigurationInterface.name» config, byte[] data) throws «serverExceptionClass.name» {
			    MqttMessage mqttMessage = new MqttMessage(data);
			    mqttMessage.setQos(DEFAULT_QOS);
				MqttClient client = getClientFor(config.getChannel(), Operation.PUBLISH);
				connect(config.getChannel(), Operation.PUBLISH);
				try {
					client.publish(config.getActualChannelName(), mqttMessage);
				} catch (MqttException e) {
					throw new «serverExceptionClass.name»(e);
				}
			
			}
			
			@Override
			public void subscribe(«channelSubscribeConfigurationInterface.name» config, Consumer<«receivedClass.name»> callback) throws «serverExceptionClass.name» {
			    MqttClient client = getClientFor(config.getChannel(), Operation.SUBSCRIBE);
			    if (callbacks.containsKey(client)) {
			    	throw new IllegalStateException(
			    		MessageFormat.format("Callback function already registered for ''{0}''. Unsubscribe from ''{0}'' before trying to register a new callback.", 
			    		config.getChannel().getName()));
			    }
				connect(config.getChannel(), Operation.SUBSCRIBE);
				client.setCallback(new MqttCallback() {
					@Override
					public void messageArrived(String topic, MqttMessage message) throws Exception {
						callback.accept(Received.from(message.getPayload(),
						parseParams(topic, config.getChannel().getName(), config.getChannel().getParameterLiterals())));
					}
					@Override
					public void deliveryComplete(IMqttDeliveryToken token) {
					}
					@Override
					public void connectionLost(Throwable cause) {
					}
				});
				callbacks.put(client, callback);

				try {
			    	client.subscribe(config.getSubscriptionPattern(), DEFAULT_QOS);
				} catch (MqttException e) {
					throw new ServerException(e);
				}
			}
			
			@Override
			public void unsubscribe(«channelSubscribeConfigurationInterface.name» config) throws «serverExceptionClass.name» {
				MqttClient client = getClientFor(config.getChannel(), Operation.SUBSCRIBE);
				connect(config.getChannel(), Operation.SUBSCRIBE);
				try {
			    	client.unsubscribe(config.getSubscriptionPattern());
			    	client.setCallback(null);
			    	callbacks.remove(client);
				} catch (MqttException e) {
					throw new ServerException(e);
				}
			}
			
			private MqttClient getClientFor(«channelInterface.name» channel, Operation operation) throws «serverExceptionClass.name» {
				MqttClient client = clients.get(Map.entry(channel, operation));
				if (client == null) {
					String broker = SCHEME + "://" + URL;
					String clientId = MqttClient.generateClientId();
					try {
						MemoryPersistence persistence = new MemoryPersistence();
						client = new MqttClient(broker, clientId, persistence);
						clients.put(Map.entry(channel, operation), client);
					} catch (Exception e) {
						throw new «serverExceptionClass.name»(e);
					}
				}
				return client;
			}

			/**
			 * Returns a {@link Map} containing the parsed parameters if <code>actualTopic</code> 
			 * matches the <code>topicId</code> pattern.
			 */
			private static Map<String, String> parseParams(String actualTopic, String topicId, List<IParameterLiteral> parameters) {
				Map<String, String> result = new HashMap<>();
				String regex = topicId;
				for (IParameterLiteral param : parameters) {
					regex = regex.replaceAll(String.format("\\{%s\\}", param.getName()), String.format("(?<%s>.+)", param.getName()));
				}
				Matcher matcher = Pattern.compile(regex).matcher(actualTopic);
				if (matcher.matches()) {
					for (IParameterLiteral param : parameters) {
						result.put(param.getName(), matcher.group(param.getName()));
					}
				}
				return result;
			}
		}
	'''
}
