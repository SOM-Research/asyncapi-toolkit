package io.github.abelgomez.asyncapi.generator.target.messages

import io.github.abelgomez.asyncapi.asyncApi.Components
import io.github.abelgomez.asyncapi.asyncApi.Message
import io.github.abelgomez.asyncapi.asyncApi.NamedMessage
import io.github.abelgomez.asyncapi.asyncApi.Operation
import io.github.abelgomez.asyncapi.generator.infra.IBuildableType
import io.github.abelgomez.asyncapi.generator.infra.IBuilder
import io.github.abelgomez.asyncapi.generator.infra.IClass
import io.github.abelgomez.asyncapi.generator.target.AbstractType
import io.github.abelgomez.asyncapi.generator.target.schemas.SchemaAbstractType
import io.github.abelgomez.asyncapi.generator.utils.Assertions
import java.util.Collections
import java.util.TreeSet

import static extension io.github.abelgomez.asyncapi.generator.ModelExtensions.*
import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*
import static extension io.github.abelgomez.asyncapi.generator.utils.StringUtils.*
import static extension java.text.MessageFormat.*

class MessageClass extends AbstractType implements IClass, IBuildableType {
	
	protected static class MessageBuilder implements IBuilder {
		protected Message message

		new(Message message) {
			this.message = message
		}
		
		override pkg() {
			return message.transform.pkg
		}

		override name() { 
			return message.transform.name + "Builder"
		}
		
		override fqn() {
			return message.transform.fqn + "." + name
		}

		override type() { 
			return message.transform.name
		}

		override serialize() '''
			public static class «name» {
				
				/**
				 * A {@link «type»} to hold temporal data
				 */
				private «type» instance = new «type»();
				
				/**
				 * Create a new {@link «name»} to build new {@link «type»}
				 *
				 * @return A {@link «name»}
				 */
				private static «name» newBuilder() {
					return new «name»();
				}
				«IF message.headers !== null»

				public «name» withHeaders(«message.headers.resolve.transform.asProperty.type» headers) {
					instance.headers = headers;
					return this;
				}
				«ENDIF»
				«IF message.payload !== null»

				public «name» withPayload(«message.payload.resolve.transform.asProperty.type» payload) {
					instance.payload = payload;
					return this;
				}
				«ENDIF»
				
				/**
				 * Builds a new instance of {@link «type»}
				 * 
				 * @return A {@link «type»}
				 */ 
				public «type» build() {
					return instance;
				}
			}
		'''
	}
	
	Message message
	SchemaAbstractType nestedPayload
	SchemaAbstractType nestedHeaders
	MessageBuilder messageBuilder

	static def createFrom(Message message) {
		return new MessageClass(message)
	}
	
	private new(Message message) {
		this.message = message
		initialize()
	}
	
	def initialize() {
		nestedPayload = message.nestedPayload?.transform
		nestedHeaders = message.nestedHeaders?.transform
		messageBuilder = new MessageBuilder(message);
	}
	
	override name() {
		return message.name().asJavaClassName
	}
	
	override pkg() {
		var eContainer = message.eContainer
		return switch (eContainer) {
			Operation: eContainer.transform.pkg
			NamedMessage: {
				eContainer = eContainer.eContainer
				switch (eContainer) {
					Components: eContainer.transform.fqn + ".messages"
					default: Assertions.fail("Can't determine package of container for Message {0}".format(message))
				}
			}
			default: Assertions.fail("Can't determine package of container for Message {0}".format(message))
		}
	}
	
	override fqn() {
		var eContainer = message.eContainer
		return switch (eContainer) {
			Operation: eContainer.transform.fqn
			NamedMessage: {
				eContainer = eContainer.eContainer
				switch (eContainer) {
					Components: pkg
					default: Assertions.fail("Can't determine fqn of container for Message {0}".format(message))
				}
			}
			default: Assertions.fail("Can't determine fqn of container for Message {0}".format(message))
		} + "." + name
	}

	override asBuilder() {
		return messageBuilder
	}

	override imports() {
		val result = new TreeSet		
		result += "com.google.gson.Gson"
		result += "com.google.gson.annotations.SerializedName"
		result += message.api.transform.messageInterface.fqn
		if (message.headers.isRef) {
			result += message.headers.resolve.transform.fqn
		} else if (message.headers.isSchema) {
			result += message.headers.resolve.transform.imports
		} else {
			Assertions.assertTrue(message.headers === null, "Only null headers are expected at this point");
		}
		if (message.payload.isRef) {
			result += message.payload.resolve.transform.fqn
		} else if (message.payload.isSchema) {
			result += message.payload.resolve.transform.imports
		} else {
			Assertions.assertTrue(message.payload === null, "Only null payloads are expected at this point");
		}
		return Collections.unmodifiableNavigableSet(result)
	}

	
	private def classModifiers() {
		return if (message.isReusable) 
			"public"
		else
			"public static"
	}

	private def javadoc() '''
		/**
		 «IF message.title !== null»
		 * «message.title»
		 *
		 «ENDIF»
		 * «message.description ?: "<No description provided>"»
		 */
	'''

	override serialize() '''
		«IF message.isReusable»
		package «pkg»;
		«IF !imports.empty»
		«imports.join(System.lineSeparator, System.lineSeparator, System.lineSeparator, [i | "import {0};".format(i)])»
		«ENDIF»
		
		«ENDIF»
		«javadoc»
		«classModifiers» class «name» implements «message.api.transform.messageInterface.name» {
			«IF nestedHeaders !== null»
				
			«nestedHeaders.serialize»
			«ENDIF»
			«IF nestedPayload !== null»
				
			«nestedPayload.serialize»
			«ENDIF»
			«IF message.headers !== null»
				
			/**
			 * Message headers
			 */
			@SerializedName("headers")
			private «message.headers.resolve.transform.name» headers;
			«ENDIF»
			«IF message.payload !== null»
			
			/**
			 * Message payload
			 */			
			@SerializedName("payload")
			private «message.payload.resolve.transform.name» payload;
			«ENDIF»
			
			«IF message.headers !== null»
			public «message.headers.resolve.transform.asProperty.type» getHeaders() {
				return headers;
			}
			
			«ENDIF»
			«IF message.payload !== null»
			public «message.payload.resolve.transform.asProperty.type» getPayload() {
				return payload;
			}
			
			«ENDIF»			
			/**
			 * Create a new «messageBuilder.name»
			 */
			public static «messageBuilder.name» newBuilder() {
				return «messageBuilder.name».newBuilder();
			}
		
			/**
			 * Parses the given {@link «name»} represented as a JSON {@link String} passed
			 * as an argument.
			 *
			 * @param json
			 *        A JSON {@link String}
			 * @return A new {@link «name»}
			 */
			public static «name» fromJson(String json) {
				Gson gson = new Gson();
				return gson.fromJson(json, «name».class);
			}
			
			«messageBuilder.serialize»
		}
	'''
}
