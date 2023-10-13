package io.github.abelgomez.asyncapi.generator.target.channels

import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI
import io.github.abelgomez.asyncapi.generator.infra.IType
import io.github.abelgomez.asyncapi.generator.target.AbstractType
import java.util.Collections
import java.util.TreeSet

import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*
import static extension java.text.MessageFormat.*

class OperationInterface extends AbstractType implements IType {

	static class SubscriptionCallbackInterface extends AbstractType implements IType {
	
		OperationInterface operationInterface
	
		private new(OperationInterface operationInterface) {
			this.operationInterface = operationInterface
		}
	
		override name() {
			return "ISubscriptionCallback"
		}
		
		override pkg() {
			return operationInterface.pkg
		}
		
		override fqn() {
			return operationInterface.fqn + "." + name
		}
		
		override imports() {
			val result = new TreeSet
			return Collections.unmodifiableNavigableSet(result)
		}
		
		def messageInterface() {
			return operationInterface.api.transform.messageInterface
		}
		
		def parametersInterface() {
			return operationInterface.api.transform.parametersInterface
		}
		
		override serialize() '''
			/**
			 * Base interface for subscription Callbacks
			 */
			public interface «name»<T extends «messageInterface.name», U extends «parametersInterface.name»> {
				
				public void messageArrived(T message, U params);
				
			}
		'''
	}

	static class PublishOperationInterface extends AbstractType implements IType {
	
		OperationInterface operationInterface
	
		private new(OperationInterface operationInterface) {
			this.operationInterface = operationInterface
		}
	
		override name() {
			return "IPublishOperation"
		}
		
		override pkg() {
			return operationInterface.pkg
		}
		
		override fqn() {
			return operationInterface.fqn + "." + name
		}
		
		def channelPublishConfigurationInterface() {
			return operationInterface.api.transform.channelInterface.channelPublishConfigurationInterface
		}
		
		def messageInterface() {
			return operationInterface.api.transform.messageInterface
		}
		
		def serverExceptionClass() {
			return operationInterface.api.transform.serverInterface.serverExceptionClass
		}
		
		override serialize() '''
			/**
			 * Base interface for publish Operations 
			 */
			public interface «name» extends «operationInterface.api.transform.operationInterface.name» {
			
				/**
				 * Creates a new {@link «channelPublishConfigurationInterface.name»} for the {@link «operationInterface.api.transform.channelInterface.name»} for the 
				 * given {@link «operationInterface.api.transform.parametersInterface.name»} 
				 */
				public «channelPublishConfigurationInterface.name» newConfiguration(«operationInterface.api.transform.parametersInterface.name» params);
				
				public void publish(IServer server, «channelPublishConfigurationInterface.name» config, «messageInterface.name» message) throws «serverExceptionClass.name»;
			
			}
		'''
	}

	static class SubscribeOperationInterface extends AbstractType implements IType {
	
		OperationInterface operationInterface
	
		private new(OperationInterface operationInterface) {
			this.operationInterface = operationInterface
		}
	
		override name() {
			return "ISubscribeOperation"
		}
		
		override pkg() {
			return operationInterface.pkg
		}
		
		override fqn() {
			return operationInterface.fqn + "." + name
		}
		
		def channelPublishConfigurationInterface() {
			return operationInterface.api.transform.channelInterface.channelPublishConfigurationInterface
		}
		
		def messageInterface() {
			return operationInterface.api.transform.messageInterface
		}
		
		def parametersInterface() {
			return operationInterface.api.transform.parametersInterface
		}
		
		def serverInterface() {
			operationInterface.api.transform.serverInterface
		}
		
		def serverExceptionClass() {
			return serverInterface.serverExceptionClass
		}
		
		def callbackInterface(){
			return operationInterface.subscriptionCallbackInterface
		}
		
		def channelSubscribeConfigurationInterface() {
			return operationInterface.api.transform.channelInterface.channelSubscribeConfigurationInterface
		}
		
		
		override serialize() '''
			/**
			 * Base interface for subscribe Operations 
			 */
			public interface «name» extends «operationInterface.api.transform.operationInterface.name» {
				
				/**
				 * Creates a new {@link «channelSubscribeConfigurationInterface.name»} for the {@link «operationInterface.api.transform.channelInterface.name»} of this operation 
				 */
				public «channelSubscribeConfigurationInterface.name» newConfiguration();
				
				/**
				 * Register the {@link «callbackInterface.name»} callback to be called
				 * using the provided {@link «channelSubscribeConfigurationInterface.name»}
				 * when a message in the given {@link «serverInterface.name»} is published. 
				 * It returns the actual {@link Consumer} callback function that is registered 
				 * in the server, which is required for the unsubscription.
				 *
				 * @return the callback
				 */
				Consumer<«serverInterface.receivedClass.name»> subscribe(«serverInterface.name» server, «channelSubscribeConfigurationInterface.name» config, «callbackInterface.name»<«messageInterface.name», «parametersInterface.name»> callback) throws «serverExceptionClass.name»;
				
				/**
				 * Unregister the previously registered {@link «callbackInterface.name»} callback 
				 * from the given {@link «serverInterface.name»} 
				 */
				void unsubscribe(«serverInterface.name» server, Consumer<«serverInterface.receivedClass.name»> callback) throws «serverExceptionClass.name»;
			}
		'''
	}


	AsyncAPI api
	SubscriptionCallbackInterface subscriptionCallbackInterface
	PublishOperationInterface publishOperationInterface
	SubscribeOperationInterface subscribeOperationInterface

	static def OperationInterface createFrom(AsyncAPI api) {
		return new OperationInterface(api)
	}

	private new(AsyncAPI api) {
		this.api = api
		subscriptionCallbackInterface = new SubscriptionCallbackInterface(this)
		publishOperationInterface = new PublishOperationInterface(this)
		subscribeOperationInterface = new SubscribeOperationInterface(this)
	}

	override name() {
		return "IOperation"
	}
	
	override pkg() {
		return api.transform.fqn + "." + "infra"
	}
	
	override fqn() {
		return pkg + "." + name
	}
	
	override imports() {
		val result = new TreeSet
		result += "java.util.function.Consumer"
		result += subscriptionCallbackInterface.imports
		result += api.transform.channelInterface.channelPublishConfigurationInterface.fqn	
		result += api.transform.channelInterface.channelSubscribeConfigurationInterface.fqn		
		result += api.transform.serverInterface.serverExceptionClass.fqn		
		result += api.transform.serverInterface.receivedClass.fqn		
		return Collections.unmodifiableNavigableSet(result)
	}
	
	def subscriptionCallbackInterface() {
		return subscriptionCallbackInterface
	}
	
	def publishOperationInterface() {
		return publishOperationInterface
	}

	def subscribeOperationInterface() {
		return subscribeOperationInterface
	}
	
	override serialize() '''
		package «pkg»;
		«imports.join(System.lineSeparator, System.lineSeparator, "", [i | "import {0};".format(i)])»
		
		/**
		 * Base interface for Operations 
		 */
		public interface «name» {
			
			«subscriptionCallbackInterface.serialize»
			
			«publishOperationInterface.serialize»

			«subscribeOperationInterface.serialize»
		}
	'''
}
