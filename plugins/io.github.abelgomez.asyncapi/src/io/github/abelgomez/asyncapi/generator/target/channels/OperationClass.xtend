package io.github.abelgomez.asyncapi.generator.target.channels

import io.github.abelgomez.asyncapi.asyncApi.Channel
import io.github.abelgomez.asyncapi.asyncApi.Operation
import io.github.abelgomez.asyncapi.generator.infra.IClass
import io.github.abelgomez.asyncapi.generator.infra.ISerializable
import io.github.abelgomez.asyncapi.generator.target.AbstractType
import io.github.abelgomez.asyncapi.generator.target.messages.MessageClass
import java.util.Collections
import java.util.TreeSet

import static extension io.github.abelgomez.asyncapi.generator.ModelExtensions.*
import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*
import static extension io.github.abelgomez.asyncapi.generator.utils.StringUtils.*
import static extension java.text.MessageFormat.*
import io.github.abelgomez.asyncapi.generator.utils.Assertions
import io.github.abelgomez.asyncapi.generator.infra.IType

abstract class OperationClass extends AbstractType implements IClass, ISerializable {
	
	protected Operation operation
	protected MessageClass nestedMessage
	
	static def OperationClass createFrom(Operation operation) {
		return if (operation.isPublish) {
			new PublishOperationClass(operation)
		} else if (operation.isSubscribe) {
			new SubscribeOperationClass(operation)
		} else {
			Assertions.fail("Unknown type of operation ({0})".format(operation))
		}
	}
	
	protected new(Operation operation) {
		this.operation = operation
		initialize()
	}
	
	protected def initialize() {
		nestedMessage = operation.nestedMessage?.transform
	}
	
	override name() {
		return (operation?.operationId ?: operation.eContainingFeature.name).asJavaClassName + "Operation"
	}
	
	override pkg() {
		(operation.eContainer as Channel).transform.fqn
	}
	
	override fqn() {
		pkg + "." + name
	}

	protected def channel() {
		return operation.channel
	}

	protected def message() {
		return operation.message.resolve
	}
	
	protected def channelInterface() {
		return channel.api.transform.channelInterface
	}
	
	protected def channelPublishConfigurationInterface() {
		return channel.api.transform.channelInterface.channelPublishConfigurationInterface
	}

	protected def channelSubscribeConfigurationInterface() {
		return channel.api.transform.channelInterface.channelSubscribeConfigurationInterface
	}

	protected def channelClass() {
		return operation.channel.transform.channelClass
	}

	protected def messageClass() {
		return operation.message.resolve.transform
	}
	
	protected def parametersClass() {
		return operation.channel.transform.channelClass.parametersClass
	}
	
	protected def serverInterface() {
		return operation.api.transform.serverInterface
	}

	protected def serverExceptionClass() {
		return operation.api.transform.serverInterface.serverExceptionClass
	}
	
	protected def messageInterface() {
		return operation.api.transform.messageInterface
	}

	override imports() {
		val result = new TreeSet		
		result.add(serverInterface.fqn)
		result.add(serverExceptionClass.fqn)
		result.add(message.resolve.transform.asBuilder.fqn)
		if (nestedMessage !== null) {
			result.addAll(nestedMessage.imports)
		} else if (operation.message.isRef) {
			result.add(operation.message.resolve.transform.fqn)
		}
		if (parametersClass !== null) {
			result.add(parametersClass.fqn)
		}
		return Collections.unmodifiableNavigableSet(result)
	}

	abstract protected def CharSequence configMethods();
	abstract protected def CharSequence serverMethods();

	override serialize() '''
		package «pkg»;
		«imports.join(System.lineSeparator, System.lineSeparator, "", [i | "import {0};".format(i)])»
		
		/**
		 *
		 «IF operation.summary !== null»
		 * «operation.summary»
		 *
		 «ENDIF»
		 «IF operation.description !== null»
		 * «operation.description»
		 *
		 «ENDIF»
		 */
		public class «name» {
			«IF nestedMessage !== null»
			
			«nestedMessage.serialize»
			«ENDIF»
			
			/**
			 * Creates a new {@link «message.transform.asBuilder.name»}
			 */
			public static «message.transform.asBuilder.name» newMessageBuilder() {
				return «message.transform.name».newBuilder();
			}
			
			«configMethods»
			
			«serverMethods»
		}
	'''
}

class PublishOperationClass extends OperationClass {
	protected new(Operation operation) {
		super(operation)
	}
	
	override imports() {
		val result = new TreeSet		
		result.addAll(super.imports)
		result.add(channelPublishConfigurationInterface.fqn)
		result.add(messageInterface.fqn)
		if (parametersClass !== null) {
			result.add(parametersClass.asBuilder.fqn)
		}
		if (message.payload !== null) {
			result.add(message.payload.resolve.transform.fqn)
		}
		return Collections.unmodifiableNavigableSet(result)
	}
	
	override protected configMethods() '''
		«IF channel.parameters.isEmpty»
		/**
		 * Creates a new {@link «channelPublishConfigurationInterface.name»} for the {@link «channelInterface.name»} of this operation 
		 */
		public static «channelPublishConfigurationInterface.name» newConfiguration() {
			return «channelClass.name».newPublishConfiguration();
		}
		«ELSE»
		/**
		 * Creates a new {@link «channelPublishConfigurationInterface.name»} for the {@link «channelInterface.name»} for the 
		 * given {@link «parametersClass.name»} 
		 */
		public static «channelPublishConfigurationInterface.name» newConfiguration(«parametersClass.name» params) {
			return «channelClass.name».newPublishConfiguration(params);
		}
		
		/**
		 * Creates a new {@link «parametersClass.asBuilder.name»} for the {@link «channelInterface.name»} of this operation 
		 */
		public static «parametersClass.asBuilder.name» newParametersBuilder() {
			return «channelClass.name».newParametersBuilder();
		}
		«ENDIF»
	'''
	
	// TODO: Re-check all the conditions below... 
	override protected serverMethods() '''
		public static void publish(IServer server, «channelPublishConfigurationInterface.name» config, «messageInterface.name» message) throws «serverExceptionClass.name» {
		    if (!server.isConnected()) {
				server.connect();
			}
			server.publish(config, message.toJson().getBytes());
		}
		
		«IF channel.parameters.isEmpty»
		public static void publish(IServer server, «messageInterface.name» message) throws «serverExceptionClass.name» {
			«channelPublishConfigurationInterface.name» config = newConfiguration();
		«ELSE»
		public static void publish(IServer server, «parametersClass.name» params, «messageInterface.name» message) throws «serverExceptionClass.name» {
			«channelPublishConfigurationInterface.name» config = newConfiguration(params);
		«ENDIF»
		    publish(server, config, message);
		}
		
		«IF message.payload !== null»
		«IF channel.parameters.isEmpty»
		public static void publish(IServer server, «message.payload.resolve.transform.name» payload) throws «serverExceptionClass.name» {
			«messageClass.name» message = «messageClass.name».newBuilder().withPayload(payload).build();
			publish(server, message);
		}
		«ELSE»
		public static void publish(IServer server, «channelPublishConfigurationInterface.name» config, «message.payload.resolve.transform.name» payload) throws «serverExceptionClass.name» {
			«messageClass.name» message = «messageClass.name».newBuilder().withPayload(payload).build();
			publish(server, config, message);
		}
		
		public static void publish(IServer server, «parametersClass.name» params, «message.payload.resolve.transform.name» payload) throws «serverExceptionClass.name» {
			«messageClass.name» message = «messageClass.name».newBuilder().withPayload(payload).build();
			publish(server, params, message);
		}
		«ENDIF»
		«ENDIF»
	'''
}

class SubscribeOperationClass extends OperationClass {
	
	static class CallbackInterface extends AbstractType implements IType {
		
		SubscribeOperationClass subscribeOperationClass
	
		private new(SubscribeOperationClass subscribeOperationClass) {
			this.subscribeOperationClass = subscribeOperationClass
		}
	
		override name() {
			return "I" + subscribeOperationClass.name + "Callback"
		}
		
		override pkg() {
			subscribeOperationClass.pkg + "." + "infra"
		}
		
		override fqn() {
			subscribeOperationClass.fqn + "." + name
		}
		
		override serialize() '''
			/**
			 * Interface that must be implemented for subscribing to the
			 * {@link «subscribeOperationClass.channel.name»} channel
			 */
			public interface «name» {
				«IF subscribeOperationClass.parametersClass === null»
				public void messageArrived(«subscribeOperationClass.message.resolve.transform.name» message);
				«ELSE»
				public void messageArrived(«subscribeOperationClass.message.resolve.transform.name» message, «subscribeOperationClass.parametersClass.name» params);
				«ENDIF»
			}
		'''
	}
	
	CallbackInterface callbackInterface
	
	protected new(Operation operation) {
		super(operation)
		callbackInterface = new CallbackInterface(this)
	}
	
	override imports() {
		val result = new TreeSet		
		result.addAll(super.imports)
		result.add(channelSubscribeConfigurationInterface.fqn)
		result.add(channelSubscribeConfigurationInterface.fqn)
		return Collections.unmodifiableNavigableSet(result)
	}
	
	override protected configMethods() '''
		/**
		 * Creates a new {@link «channelSubscribeConfigurationInterface.name»} for the {@link «channelInterface.name»} of this operation 
		 */
		public static «channelSubscribeConfigurationInterface.name» newConfiguration() {
			return «channelClass.name».newSubscribeConfiguration();
		}
	'''
	
	override protected serverMethods() '''
		public static void subscribe(IServer server, «callbackInterface.name» callback) throws «serverExceptionClass.name» {
			«channelSubscribeConfigurationInterface.name» config = newConfiguration();
		    subscribe(server, config, callback);
		}
		
		public static void subscribe(IServer server, «channelSubscribeConfigurationInterface.name» config, «callbackInterface.name» callback) throws «serverExceptionClass.name» {
		    if (!server.isConnected()) {
				server.connect();
		    }
		    server.subscribe(config, (received) -> {
		    	«messageClass.name» message = «messageClass.name».fromJson(new String(received.getData())); 
		    	«IF parametersClass === null»
		    	callback.messageArrived(message);
		    	«ELSE»
		    	«parametersClass.name» parameters = new «parametersClass.name»(received.getParameters());
		    	callback.messageArrived(message, parameters);
		    	«ENDIF»
		    });
		}
		
		public static void unsubscribe(IServer server) throws «serverExceptionClass.name» {
			«channelSubscribeConfigurationInterface.name» config = newConfiguration();
		    if (!server.isConnected()) {
				server.connect();
		    }
		    server.unsubscribe(config);
		}
		
		«callbackInterface.serialize»
	'''
}
