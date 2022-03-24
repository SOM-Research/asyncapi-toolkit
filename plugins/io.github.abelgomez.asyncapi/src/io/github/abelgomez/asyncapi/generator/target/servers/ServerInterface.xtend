package io.github.abelgomez.asyncapi.generator.target.servers

import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI
import io.github.abelgomez.asyncapi.generator.infra.IClass
import io.github.abelgomez.asyncapi.generator.target.AbstractType
import java.util.Collections
import java.util.TreeSet

import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*
import static extension java.text.MessageFormat.*

class ServerInterface extends AbstractType implements IClass {

	static class ReceivedClass extends AbstractType implements IClass {
		
		ServerInterface serverInterface
	
		private new(ServerInterface serverInterface) {
			this.serverInterface = serverInterface
		}
	
		override name() {
			return "Received"
		}
		
		override pkg() {
			serverInterface.pkg + "." + "infra"
		}
		
		override fqn() {
			serverInterface.fqn + "." + name
		}
		
		override imports() {
			val result = new TreeSet
			result += "java.util.Map"
			result += "java.util.HashMap"
			result += "java.util.Collections"
			result += "java.util.List"
			result += "java.util.ArrayList"
			return Collections.unmodifiableNavigableSet(result)
		}
		
		override serialize() '''
			/**
			 * Simple class storing data received from a {@link «serverInterface.name»}
			 */
			public final class «name» {
				
				private final byte[] data;

				private final Map<String, String> parameters = new HashMap<>();;

				/**
				 * Creates a new instance of {@link «name»}
				 */
				public static «name» from(byte[] data, Map<String, String> parameters) {
					return new «name»(data, parameters);
				}
				
				/**
				 * Private constructor. Use the {@link #from} method instead
				 */
				private «name»(byte[] data, Map<String, String> parameters) {
					this.data = data;
					if (parameters != null) {
						this.parameters.putAll(parameters);
					}
				}
				
				/**
				 * Returns the raw data received
				 *
				 * @return The data
				 */
				public byte[] getData() {
					return data;
				}
				
				/**
				 * Returns a {@link Map} of {@link String}s with the parameter names and 
				 * values (also as {@link String}s) recovered from the received message
				 *
				 * @return The parameters and their values
				 */
				public Map<String, String> getParameters() {
					return Collections.unmodifiableMap(parameters);
				}
			}
		'''
	}

	static class ServerExceptionClass extends AbstractType implements IClass {
		
		ServerInterface serverInterface
	
		private new(ServerInterface serverInterface) {
			this.serverInterface = serverInterface
		}
	
		override name() {
			return "ServerException"
		}
		
		override pkg() {
			serverInterface.pkg + "." + "infra"
		}
		
		override fqn() {
			serverInterface.fqn + "." + name
		}
		
		override serialize() '''
			/**
			 * Wrapper class for technology-dependent {@link Exception}s
			 */
			public class «name» extends Exception {
				
				private static final long serialVersionUID = 1L;
				
				private List<Exception> exceptions = new ArrayList<Exception>();
				    
				public List<Exception> getExceptions() {
					return Collections.unmodifiableList(exceptions);
				}
				
				public «name»() {
					super();
				}

				public «name»(Throwable t) {
					super(t);
				}
				
				public void addException(Exception e) {
					exceptions.add(e);
				}
			}
		'''
	}

	
	AsyncAPI api
	ReceivedClass receivedClass
	ServerExceptionClass serverExceptionClass

	static def ServerInterface createFrom(AsyncAPI api) {
		return new ServerInterface(api)
	}

	private new(AsyncAPI api) {
		this.api = api
		receivedClass = new ReceivedClass(this)
		serverExceptionClass = new ServerExceptionClass(this)
	}

	override name() {
		return "IServer"
	}
	
	override pkg() {
		api.transform.fqn + "." + "infra"
	}
	
	override fqn() {
		pkg + "." + name
	}
	
	def receivedClass() {
		return receivedClass
	}
	
	def serverExceptionClass() {
		return serverExceptionClass
	}
	
	override imports() {
		val result = new TreeSet		
		result += "java.util.function.Consumer"
		result += channelPublishConfigurationInterface.fqn
		result += channelSubscribeConfigurationInterface.fqn
		result += receivedClass.imports
		return Collections.unmodifiableNavigableSet(result)
	}
	
	private def channelPublishConfigurationInterface() {
		return api.transform.channelInterface.channelPublishConfigurationInterface
	} 

	private def channelSubscribeConfigurationInterface() {
		return api.transform.channelInterface.channelSubscribeConfigurationInterface
	} 
	
	override serialize() '''
		package «pkg»;
		
		«imports.join(System.lineSeparator, [i | "import {0};".format(i)])»
		
		/**
		 * Base interface for parameters
		 */
		public interface «name» {
			
			/**
			 * Creates a connection to this {@link «name»} for the given {@link «api.transform.operationInterface.name»}
			 * 
			 * @throws «serverExceptionClass.name»
			 *         if any error prevents from connecting. The underlying cause may be 
			 *         wrapped in this {@link Exception}
			 */
			void connect(Class <? extends «api.transform.operationInterface.name»> operation) throws «serverExceptionClass.name»;
			
			/**
			 * Checks if theres an open connection to this {@link «name»} for the given {@link «api.transform.operationInterface.name»}
			 */
			boolean isConnected(Class <? extends «api.transform.operationInterface.name»> operation);
			
			/**
			 * Closes the connection to this {@link «name»} for the given {@link «api.transform.operationInterface.name»}
			 * 
			 * @throws «serverExceptionClass.name»
			 *         if any error prevents from disconnecting. The underlying cause may be 
			 *         wrapped in this {@link Exception}
			 */
			void disconnect(Class <? extends «api.transform.operationInterface.name»> operation) throws «serverExceptionClass.name»;
			

			/**
			 * Gracefully disconnect this {@link «name»} for all {@link «api.transform.operationInterface.name»}s
			 * 
			 * @throws «serverExceptionClass.name»
			 *         if any error prevents from disconnecting on any {@link «api.transform.operationInterface.name»}.
			 *         In any case, all clients will be attemted for disconnection.
			 *         The underlying causes will be wrapped in this {@link Exception}. In
			 *         such a case, client code can examine the actual {@link Exception}s
			 *         by calling {@link «serverExceptionClass.name»#getExceptions()}
			 */
			void disconnect() throws «serverExceptionClass.name»;

			/**
			 * Disconnect this {@link «name»} for all {@link «api.transform.operationInterface.name»}s.
			 * The disconnection will be forced if <code>force</code> is <code>true</code>
			 * 
			 * @throws «serverExceptionClass.name»
			 *         if any error prevents from disconnecting on any {@link «api.transform.operationInterface.name»}.
			 *         In any case, all clients will be attemted for disconnection.
			 *         The underlying causes will be wrapped in this {@link Exception}. In
			 *         such a case, client code can examine the actual {@link Exception}s
			 *         by calling {@link «serverExceptionClass.name»#getExceptions()}
			 */
			void disconnect(boolean force) throws «serverExceptionClass.name»;

			/**
			 * Silently try to disconnect this {@link «name»} for all {@link «api.transform.operationInterface.name»}s.
			 * If any error ocurrs while trying to disconnect, it will be ignored and the program will continue.
			 */
			void disconnectSilently();
			
			/**
			 * Publish the given <code>data</code> in the {@link «name»} according to the
			 * given {@link «channelPublishConfigurationInterface.name»}. If {@link «name»}
			 * is not connected to {@link «channelPublishConfigurationInterface.name»}, a connection 
			 * is done prior to the publication. 
			 * 
			 * @throws «serverExceptionClass.name»
			 *         if any error prevents from publishing. The underlying cause may be 
			 *         wrapped in this {@link Exception}
			 */
			void publish(«channelPublishConfigurationInterface.name» config, byte[] data) throws «serverExceptionClass.name»;
			
			/**
			 * Subscribes to the events specified in the given {@link «channelSubscribeConfigurationInterface.name»}
			 * in the {@link «name»}. If {@link «name»} is not connected to 
			 * {@link «channelPublishConfigurationInterface.name»}, a connection is done prior to the subscription.
			 * 
			 * @throws «serverExceptionClass.name»
			 *         if any error prevents from subscribing. The underlying cause may be 
			 *         wrapped in this {@link Exception}
			 * @throws IllegalStateException if a {@link Consumer<«receivedClass.name»>} callback is already registered.
			 *                               In such a case, it is necessary to call
			 *                               {@link #unsubscribe(«name»)} first
			 */
			void subscribe(«channelSubscribeConfigurationInterface.name» config, Consumer<«receivedClass.name»> callback) throws «serverExceptionClass.name»;
			
			/**
			 * Unsubscribes from the events specified in the given {@link «channelSubscribeConfigurationInterface.name»}
			 * in the {@link «name»}. If {@link «name»} is not connected to 
			 * {@link «channelPublishConfigurationInterface.name»}, a connection is done prior to the unsubscription.
			 * 
			 * @throws «serverExceptionClass.name»
			 *         if any error prevents from unsubscribing. The underlying cause may be 
			 *         wrapped in this {@link Exception}
			 */
			void unsubscribe(«channelSubscribeConfigurationInterface.name» config) throws «serverExceptionClass.name»;
			
			«receivedClass.serialize»
			
			«serverExceptionClass.serialize»

		}
	'''
}
