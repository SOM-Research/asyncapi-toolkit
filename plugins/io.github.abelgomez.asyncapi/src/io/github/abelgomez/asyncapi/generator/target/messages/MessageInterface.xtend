package io.github.abelgomez.asyncapi.generator.target.messages

import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI
import io.github.abelgomez.asyncapi.generator.infra.IType
import io.github.abelgomez.asyncapi.generator.target.AbstractType
import java.util.Collections
import java.util.TreeSet

import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*

class MessageInterface extends AbstractType implements IType {

	static class PayloadInterface extends AbstractType implements IType {

		MessageInterface messageInterface
	
		static def PayloadInterface createFrom(MessageInterface messageInterface) {
			return new PayloadInterface(messageInterface)
		}
	
		private new(MessageInterface messageInterface) {
			this.messageInterface = messageInterface
		}
	
		override name() {
			return "IPayload"
		}
		
		override pkg() {
			messageInterface.pkg + "." + "infra"
		}
		
		override fqn() {
			messageInterface.fqn + "." + name
		}
		
		override serialize() '''
			/**
			 * Base interface for message payloads
			 */
			public interface «name» extends «messageInterface.api.transform.jsonSerializableInterface.name» {
			}
		'''
	}
	
	static class HeadersInterface extends AbstractType implements IType {

		MessageInterface messageInterface
	
		static def HeadersInterface createFrom(MessageInterface messageInterface) {
			return new HeadersInterface(messageInterface)
		}
	
		private new(MessageInterface messageInterface) {
			this.messageInterface = messageInterface
		}
	
		override name() {
			return "IHeaders"
		}
		
		override pkg() {
			messageInterface.pkg + "." + "infra"
		}
		
		override fqn() {
			messageInterface.fqn + "." + name
		}
		
		override serialize() '''
			/**
			 * Base interface for message headers
			 */
			public interface «name» extends «messageInterface.api.transform.jsonSerializableInterface.name» {
			}
		'''
	}

	AsyncAPI api
	PayloadInterface payloadInterface
	HeadersInterface headersInterface

	static def MessageInterface createFrom(AsyncAPI api) {
		return new MessageInterface(api)
	}

	private new(AsyncAPI api) {
		this.api = api
		headersInterface = new HeadersInterface(this)
		payloadInterface = new PayloadInterface(this)
	}

	override name() {
		return "IMessage"
	}
	
	override pkg() {
		api.transform.pkg + "." + "infra"
	}
	
	override fqn() {
		pkg + "." + name
	}
	
	def headersInterface() {
		return headersInterface
	}
	
	def payloadInterface() {
		return payloadInterface
	}
	
	override imports() {
		val result = new TreeSet		
		result.add(api.transform.jsonSerializableInterface.fqn)
		return Collections.unmodifiableNavigableSet(result)
	}
	
	override serialize() '''
		package «pkg»;
		
		/**
		 * Base interface for messages
		 */
		public interface «name» extends «api.transform.jsonSerializableInterface.name» {
			«headersInterface.serialize»
			«payloadInterface.serialize»
		}
	'''
}
