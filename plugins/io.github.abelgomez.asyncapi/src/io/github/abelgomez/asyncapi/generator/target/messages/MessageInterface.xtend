package io.github.abelgomez.asyncapi.generator.target.messages

import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI
import io.github.abelgomez.asyncapi.generator.infra.IType
import io.github.abelgomez.asyncapi.generator.target.AbstractType
import java.util.Collections
import java.util.TreeSet

import static extension java.text.MessageFormat.*
import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*

class MessageInterface extends AbstractType implements IType {

	AsyncAPI api

	static def MessageInterface createFrom(AsyncAPI api) {
		return new MessageInterface(api)
	}

	private new(AsyncAPI api) {
		this.api = api
	}

	override name() {
		return "IMessage"
	}
	
	override pkg() {
		api.transform.fqn + "." + "infra"
	}
	
	override fqn() {
		pkg + "." + name
	}
	
	override imports() {
		val result = new TreeSet
		result += "java.util.Optional"
		return Collections.unmodifiableNavigableSet(result)
	}
	
	private def jsonSerializableInterface() {
		return api.transform.jsonSerializableInterface
	}
	
	override serialize() '''
		package «pkg»;
		«imports.join(System.lineSeparator, System.lineSeparator, "", [i | "import {0};".format(i)])»
		
		/**
		 * Base interface for messages
		 */
		public interface «name» {

			/**
			 * Returns the headers of the {@link «name»}
			 */
			Optional<? extends «jsonSerializableInterface.name»> getHeaders();
			
			/**
			 * Returns the payload of the {@link «name»}
			 */
			Optional<? extends «jsonSerializableInterface.name»> getPayload();
		}
	'''
}
