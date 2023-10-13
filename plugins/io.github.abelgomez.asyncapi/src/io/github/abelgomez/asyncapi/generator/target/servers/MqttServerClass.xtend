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
		result += "java.util.Map"
		result += "java.util.HashMap"
		result += "java.util.function.Consumer"
		result += "java.util.function.Function"
		result += "java.util.regex.Pattern"
		result += "java.util.regex.Matcher"
		result += "com.google.common.collect.Multimap"
		result += "com.google.common.collect.MultimapBuilder"
		result += "org.eclipse.paho.client.mqttv3.MqttClient"
		result += "org.eclipse.paho.client.mqttv3.MqttConnectOptions"
		result += "org.eclipse.paho.client.mqttv3.MqttException"
		result += "org.eclipse.paho.client.mqttv3.MqttMessage"
		result += "org.eclipse.paho.client.mqttv3.MqttCallback"
		result += "org.eclipse.paho.client.mqttv3.IMqttDeliveryToken"
		result += "org.eclipse.paho.client.mqttv3.persist.MemoryPersistence"
		result += server.api.transform.parametersInterface.parameterLiteralInterface.fqn
		result += implementedInterface.fqn
		result += serverInterface.fqn
		result += messageInterface.fqn
		result += operationInterface.fqn
		result += channelInterface.fqn
		result += channelPublishConfigurationInterface.fqn
		result += channelSubscribeConfigurationInterface.fqn
		if (isMonitored) {
			result += "java.util.Calendar"
			result += monitoringEventChannelClass.fqn
			result += monitoringEventChannelClass.publishOperationClass.fqn
		}
		return Collections.unmodifiableNavigableSet(result)
	}
	
	private def scheme() {
		return switch (server.protocol) {
			case Protocol.MQTT: "tcp"
			case Protocol.SECURE_MQTT: "ssl"
			default: server.protocol.getName
		}
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
		public class «name» implements «implementedInterface.name» {
			
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
			private Map<Class <? extends «operationInterface.name»>, MqttClient> clients = new HashMap<>();

			/**
			 * Map containing the registered {@link MqttCallbacks}s for the different {@link MqttClients}s
			 */
			private Multimap<MqttClient, Consumer<Received>> callbacks = MultimapBuilder.hashKeys().arrayListValues().build();
			
			«monitoringProperties»
			«staticMethods»

			private «name»(String username, String password) throws «serverExceptionClass.name» {
				options.setCleanSession(true);
				if (username != null) {
					options.setUserName(username);
				}
				if (password != null) {
					options.setPassword(password.toCharArray());
				}
			}
			
			@Override
			public void connect(Class <? extends «operationInterface.name»> operation) throws «serverExceptionClass.name» {
				if (!isConnected(operation)) {
					MqttClient client = getClientFor(operation);
					try {
				    	client.connect(options);
					} catch (MqttException e) {
						throw new ServerException(e);
					}
					«IF isMonitored»
					// Notify that the client has successfully connected
					«monitoringEventChannelClass.name».«monitoringEventChannelClass.publishOperationClass.name».publish(monitoringServer, 
						SendMonitoringEventOperation.Message.Payload.newBuilder()
							.withTimestamp(Calendar.getInstance().toInstant().toString())
							.withClientId(client.getClientId())
							.withEvent(«monitoringEventChannelClass.publishOperationClass.name».Message.Payload.Event.CLIENT_CONNECTED)
							.build());
					«ENDIF»
				} 
			}
			
			@Override
			public boolean isConnected(Class <? extends «operationInterface.name»> operation) {
				MqttClient client = clients.get(operation);
			    return client != null ? client.isConnected() : false;
			}

			@Override
			public void disconnect(Class <? extends «operationInterface.name»> operation) throws «serverExceptionClass.name» {
				if (isConnected(operation)) {
					MqttClient client = getClientFor(operation);
					try {
				    	client.disconnect();
					} catch (MqttException e) {
						throw new ServerException(e);
					}
					«IF isMonitored»
					// Notify that the client has cleanly disconnected
					«monitoringEventChannelClass.name».«monitoringEventChannelClass.publishOperationClass.name».publish(monitoringServer, 
						«monitoringEventChannelClass.publishOperationClass.name».Message.Payload.newBuilder()
							.withTimestamp(Calendar.getInstance().toInstant().toString())
							.withClientId(client.getClientId())
							.withEvent(«monitoringEventChannelClass.publishOperationClass.name».Message.Payload.Event.CLIENT_DISCONNECTED)
							.build());
					«ENDIF»
				} 
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
			public void publish(«channelPublishConfigurationInterface.name» config, «messageInterface.name» message) throws «serverExceptionClass.name» {
			    MqttMessage mqttMessage = new MqttMessage(message.toJson().getBytes());
			    mqttMessage.setQos(DEFAULT_QOS);
				MqttClient client = getClientFor(config.getOperation());
				connect(config.getOperation());
				try {
					client.publish(config.getActualChannelName(), mqttMessage);
				} catch (MqttException e) {
					throw new «serverExceptionClass.name»(e);
				}
				«IF isMonitored»
				// Notify that a message has been sent
				«monitoringEventChannelClass.name».«monitoringEventChannelClass.publishOperationClass.name».publish(monitoringServer, 
					«monitoringEventChannelClass.publishOperationClass.name».Message.Payload.newBuilder()
						.withTimestamp(Calendar.getInstance().toInstant().toString())
						.withClientId(client.getClientId())
						.withMessageId(message.getIdentifier().orElse(null))
						.withEvent(«monitoringEventChannelClass.publishOperationClass.name».Message.Payload.Event.MESSAGE_SENT)
						.build());
				«ENDIF»
			}
			
			@Override
			public void subscribe(«channelSubscribeConfigurationInterface.name» config, Consumer<«receivedClass.name»> callback, Function<String, «server.api.transform.messageInterface.name»> reifyMessageFunction) throws «serverExceptionClass.name» {
			    MqttClient client = getClientFor(config.getOperation());
				connect(config.getOperation());
				if (callbacks.get(client).isEmpty()) {
					MqttCallback mqttCallback = new MqttCallback() {
						@Override
						public void messageArrived(String topic, MqttMessage message) throws Exception {
							Received received = Received.from(message.getPayload(),
									parseParams(topic, config.getChannel().getName(), config.getChannel().getParameterLiterals()));
							«IF isMonitored»
							// Notify that a message has been received
							«monitoringEventChannelClass.name».«monitoringEventChannelClass.publishOperationClass.name».publish(monitoringServer, 
								«monitoringEventChannelClass.publishOperationClass.name».Message.Payload.newBuilder()
									.withTimestamp(Calendar.getInstance().toInstant().toString())
									.withClientId(client.getClientId())
									.withMessageId(reifyMessageFunction.apply(new String(received.getRawData())).getIdentifier().orElse(null))
									.withEvent(«monitoringEventChannelClass.publishOperationClass.name».Message.Payload.Event.MESSAGE_RECEIVED)
									.build());
							«ENDIF»
							callbacks.get(client).stream().forEach(c -> c.accept(received));
						}
						@Override
						public void deliveryComplete(IMqttDeliveryToken token) {
						}
						@Override
						public void connectionLost(Throwable cause) {
						}
					};
					client.setCallback(mqttCallback);
					// Clients may subscribe multiple times to the same topic with different callbacks
					// We only issue a new subscription the first time a callback is registered for 
					// a given topic pattern
					try {
				    	client.subscribe(config.getSubscriptionPattern(), DEFAULT_QOS);
						«IF isMonitored»
						// Notify that a client has subscribed
						«monitoringEventChannelClass.name».«monitoringEventChannelClass.publishOperationClass.name».publish(monitoringServer, 
							«monitoringEventChannelClass.publishOperationClass.name».Message.Payload.newBuilder()
								.withTimestamp(Calendar.getInstance().toInstant().toString())
								.withClientId(client.getClientId())
								.withEvent(«monitoringEventChannelClass.publishOperationClass.name».Message.Payload.Event.CLIENT_SUBSCRIBED)
								.build());
						«ENDIF»
					} catch (MqttException e) {
						throw new ServerException(e);
					}
				}
				callbacks.put(client, callback);

			}
			
			@Override
			public void unsubscribe(«channelSubscribeConfigurationInterface.name» config, Consumer<«serverInterface.receivedClass.name»> callback) throws «serverExceptionClass.name» {
				MqttClient client = getClientFor(config.getOperation());
				connect(config.getOperation());
				try {
					// Clients may subscribe multiple times to the same topic with different callbacks
					// We only issue a complete unsubscription when all callbacks have been de-registered.
					if (callbacks.get(client).isEmpty()) {
			    		client.unsubscribe(config.getSubscriptionPattern());
						«IF isMonitored»
						// Notify that a client has unsubscribed
						«monitoringEventChannelClass.name».«monitoringEventChannelClass.publishOperationClass.name».publish(monitoringServer, 
							«monitoringEventChannelClass.publishOperationClass.name».Message.Payload.newBuilder()
								.withTimestamp(Calendar.getInstance().toInstant().toString())
								.withClientId(client.getClientId())
								.withEvent(«monitoringEventChannelClass.publishOperationClass.name».Message.Payload.Event.CLIENT_UNSUBSCRIBED)
								.build());
						«ENDIF»
			    	}
			    	callbacks.remove(client, callback);
				} catch (MqttException e) {
					throw new ServerException(e);
				}
			}
			
			private MqttClient getClientFor(Class <? extends «operationInterface.name»> operation) throws «serverExceptionClass.name» {
				MqttClient client = clients.get(operation);
				if (client == null) {
					String broker = SCHEME + "://" + URL;
					String clientId = MqttClient.generateClientId();
					try {
						MemoryPersistence persistence = new MemoryPersistence();
						client = new MqttClient(broker, clientId, persistence);
						clients.put(operation, client);
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
			«monitoringMethods»
		}
	'''
}
