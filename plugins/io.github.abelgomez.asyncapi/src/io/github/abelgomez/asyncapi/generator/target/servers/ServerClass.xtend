package io.github.abelgomez.asyncapi.generator.target.servers

import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI
import io.github.abelgomez.asyncapi.asyncApi.Server
import io.github.abelgomez.asyncapi.generator.infra.IClass
import io.github.abelgomez.asyncapi.generator.target.AbstractType
import java.util.Collections
import java.util.TreeSet

import static extension io.github.abelgomez.asyncapi.generator.ModelExtensions.*
import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*
import static extension io.github.abelgomez.asyncapi.generator.utils.StringUtils.*
import static extension java.text.MessageFormat.*
import io.github.abelgomez.asyncapi.asyncApi.Protocol
import io.github.abelgomez.asyncapi.generator.utils.Assertions

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
		result.add("java.util.List")
		result.add("java.util.Arrays")
		result.add("java.util.Map")
		result.add("java.util.HashMap")
		result.add("java.util.function.Consumer")
		result.add("java.util.stream.Collectors")
		result.add("java.util.regex.Pattern")
		result.add("java.util.regex.Matcher")
		result.add("org.eclipse.paho.client.mqttv3.MqttClient")
		result.add("org.eclipse.paho.client.mqttv3.MqttConnectOptions")
		result.add("org.eclipse.paho.client.mqttv3.MqttException")
		result.add("org.eclipse.paho.client.mqttv3.MqttMessage")
		result.add("org.eclipse.paho.client.mqttv3.MqttCallback")
		result.add("org.eclipse.paho.client.mqttv3.IMqttDeliveryToken")
		result.add("org.eclipse.paho.client.mqttv3.persist.MemoryPersistence")
		result.add(server.api.transform.serverInterface.fqn)
		result.add(server.api.transform.channelInterface.channelPublishConfigurationInterface.fqn)
		result.add(server.api.transform.channelInterface.channelSubscribeConfigurationInterface.fqn)
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
		public class «name» implements «server.api.transform.serverInterface.name» {
			
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
					client.publish(config.getTopic(), mqttMessage);
				} catch (MqttException e) {
					throw new «serverExceptionClass.name»(e);
				}
			
			}
			
			@Override
			public void subscribe(«channelSubscribeConfigurationInterface.name» config, Consumer<«receivedClass.name»> callback) throws «serverExceptionClass.name» {
			    if (!isConnected()) {
					connect();
			    }
			    client.setCallback(new MqttCallback() {
					@Override public void deliveryComplete(IMqttDeliveryToken token) {}
					@Override public void connectionLost(Throwable cause) {}
					@Override public void messageArrived(String topic, MqttMessage message) throws Exception {
						List<String> parameters = Arrays.asList(config.getParameterLiterals()).stream().map(p -> p.getName()).collect(Collectors.toList());
						callback.accept(«receivedClass.name».from(message.getPayload(), parseParams(topic, config.getTopic(), parameters)));
					}
				});
				try {
			    	client.subscribe(config.getTopicPattern(), DEFAULT_QOS);
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
			    	client.unsubscribe(config.getTopicPattern());
				} catch (MqttException e) {
					throw new ServerException(e);
				}
			}
			
			private static Map<String, String> parseParams(String actualTopic, String topicId, List<String> parameters) {
				Map<String, String> result = new HashMap<>();
				String regex = topicId;
				for (String param : parameters) {
					regex = regex.replaceAll(String.format("\\{%s\\}", param), String.format("(?<%s>.+)", param));
				}
				Matcher matcher = Pattern.compile(regex).matcher(actualTopic);
				if (matcher.matches()) {
					for (String p : parameters) {
						result.put(p, matcher.group(p));
					}
				}
				return result;
			}
		}
	'''
}
