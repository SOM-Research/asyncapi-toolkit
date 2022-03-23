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
		result += "java.util.List"
		result += "java.util.Arrays"
		result += "java.util.ArrayList"
		result += "java.util.Map"
		result += "java.util.Map.Entry"
		result += "java.util.Optional"
		result += "java.util.HashMap"
		result += "java.util.function.Consumer"
		result += "java.util.stream.Collectors"
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
		result += server.api.transform.serverInterface.fqn
		result += server.api.transform.channelInterface.channelConfigurationInterface.fqn
		result += server.api.transform.channelInterface.channelPublishConfigurationInterface.fqn
		result += server.api.transform.channelInterface.channelSubscribeConfigurationInterface.fqn
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
	
	private def channelConfigurationInterface() {
		return server.api.transform.channelInterface.channelConfigurationInterface
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
		 * «server.description»
		 */
		public class «name» implements «serverInterface.name» {
			
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
			 * Connection client to Server
			 */
			private MqttClient client;
			
			/**
			 * Connection options
			 */
			MqttConnectOptions options = new MqttConnectOptions();
			
			/**
			 * MqttCallbacks
			 */
			List<Entry<IChannelSubscribeConfiguration, Consumer<Received>>> callbacks = new ArrayList<>();
			
			public static «name» create() throws «serverExceptionClass.name» {
				return new «name»();
			}
			
			private «name»() throws «serverExceptionClass.name» {
			    options.setCleanSession(true);
				String broker = SCHEME + "://" + URL;
				String clientId = MqttClient.generateClientId();
				MemoryPersistence persistence = new MemoryPersistence();
				try {
					client = new MqttClient(broker, clientId, persistence);
					client.setCallback(new MqttCallback() {
						@Override public void deliveryComplete(IMqttDeliveryToken token) {}
						@Override public void connectionLost(Throwable cause) {}
						@Override public void messageArrived(String topic, MqttMessage message) throws Exception {
							for (Entry<IChannelSubscribeConfiguration, Consumer<Received>> entry : callbacks) {
								IChannelSubscribeConfiguration config = entry.getKey();
								Consumer<Received> callback = entry.getValue();
								Optional<Map<String, String>> params = parseParams(topic, config.getChannelName(), config.getParameterLiterals());
								params.ifPresent(p -> callback.accept(Received.from(message.getPayload(), p)));
							}
						}
					});
				} catch (MqttException e) {
					throw new ServerException(e);
				} 
			}
			
			@Override
			public void connect() throws «serverExceptionClass.name» {
				if (!isConnected()) {
					try {
				    	client.connect();
					} catch (MqttException e) {
						throw new ServerException(e);
					}	
				} 
			}
			
			@Override
			public boolean isConnected() {
			    return client.isConnected();
			}
			
			@Override
			public void disconnect() throws «serverExceptionClass.name» {
				try {
					client.disconnect();
				} catch (MqttException e) {
					throw new ServerException(e);
				} 
			}
			
			@Override
			public void publish(«channelPublishConfigurationInterface.name» config, byte[] data) throws «serverExceptionClass.name» {
			    MqttMessage mqttMessage = new MqttMessage(data);
			    mqttMessage.setQos(DEFAULT_QOS);
			    if (!isConnected()) {
					connect();
				}
				try {
					client.publish(retrieveTopicName(config), mqttMessage);
				} catch (MqttException e) {
					throw new «serverExceptionClass.name»(e);
				}
			
			}
			
			@Override
			public void subscribe(«channelSubscribeConfigurationInterface.name» config, Consumer<«receivedClass.name»> callback) throws «serverExceptionClass.name» {
			    if (!isConnected()) {
					connect();
			    }
			    callbacks.add(Map.entry(config, callback));
				try {
			    	client.subscribe(config.getSubscriptionPattern(), DEFAULT_QOS);
				} catch (MqttException e) {
					throw new ServerException(e);
				}
			}
			
			@Override
			public void unsubscribe(«channelSubscribeConfigurationInterface.name» config) throws «serverExceptionClass.name» {
			    if (!isConnected()) {
					connect();
			    }
				try {
			    	client.unsubscribe(config.getSubscriptionPattern());
				} catch (MqttException e) {
					throw new ServerException(e);
				}
			}

			/**
			 * Computes the actual topic name for the given {@link «channelConfigurationInterface.name»}
			 * in this {@link «serverInterface.name»}
			 */
			public static String retrieveTopicName(«channelConfigurationInterface.name» config) {
				String topic = config.getChannelName();
				if (config instanceof «channelPublishConfigurationInterface.name») {
					«channelPublishConfigurationInterface.name» publishConfig = («channelPublishConfigurationInterface.name») config;
					Map<String, String> parameters = publishConfig.getParameters();
					for (Entry<String, String> entry : parameters.entrySet()) {
						topic = topic.replaceAll("\\{" + entry.getKey() + "\\}", entry.getValue());
					}
				}
				return topic;
			}

			/**
			 * Returns a {@link Map} containing the parsed parameters if <code>actualTopic</code> 
			 * matches the <code>topicId</code> pattern.
			 * 
			 * The returned {@link Optional} will be empty if the pattern does not match
			 */
			private static Optional<Map<String, String>> parseParams(String actualTopic, String topicId, IParameterLiteral[] parameters) {
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
					return Optional.of(result);
				} else {
					return Optional.empty();
				}
			}
		}
	'''
}
