package io.github.abelgomez.asyncapi.generator.target.messages

import io.github.abelgomez.asyncapi.asyncApi.Components
import io.github.abelgomez.asyncapi.asyncApi.Message
import io.github.abelgomez.asyncapi.asyncApi.MessageIdentifier
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
		result += "java.util.Optional"
		result += "com.google.gson.Gson"
		result += "com.google.gson.JsonElement"
		result += "com.google.gson.GsonBuilder"
		result += "com.google.gson.annotations.SerializedName"
		result += messageInterface.fqn
		if (message.headers.isRef) {
			result += message.headers.resolve.transform.fqn
		} else if (message.headers.isSchema) {
			result += message.headers.resolve.transform.imports
		} else {
			result += "java.lang.Void"
			Assertions.assertTrue(message.headers === null, "Only null headers are expected at this point");
		}
		if (message.payload.isRef) {
			result += message.payload.resolve.transform.fqn
		} else if (message.payload.isSchema) {
			result += message.payload.resolve.transform.imports
		} else {
			result += "java.lang.Void"
			Assertions.assertTrue(message.payload === null, "Only null payloads are expected at this point");
		}
		if (message.identifier === MessageIdentifier.GENERATED) {
			result += "java.util.UUID"
			result += "com.google.gson.JsonObject"
		} else if (message.identifier === MessageIdentifier.MD5 || message.identifier === MessageIdentifier.SHA256) {
			result += "org.apache.commons.codec.digest.DigestUtils"
			result += "org.apache.commons.codec.digest.MessageDigestAlgorithms"
		}
		return Collections.unmodifiableNavigableSet(result)
	}
	
	protected def messageInterface() {
		return message.api.transform.messageInterface
	}
	
	protected def jsonSerializableInterface() {
		return message.api.transform.jsonSerializableInterface
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

	private def isPayloadTheRawMessage() {
		return message.identifier !== MessageIdentifier.GENERATED 
					&& message.headers?.resolve === null
					&& message.payload?.resolve !== null
	}

	override serialize() '''
		«IF message.isReusable»
		package «pkg»;
		«IF !imports.empty»
		«imports.join(System.lineSeparator, System.lineSeparator, System.lineSeparator, [i | "import {0};".format(i)])»
		«ENDIF»
		
		«ENDIF»
		«javadoc»
		«classModifiers» class «name» implements «messageInterface.name» {
			«IF message.identifier === MessageIdentifier.GENERATED»
			
			/**
			 * Internal and automatically generated message ID. When serializing,
			 * it will be injected as a "regular" header in the «messageInterface.name».
			 */
			private transient String identifier = UUID.randomUUID().toString();
			«ENDIF»
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
			
			@Override
			«IF message.headers !== null»
			public Optional<«message.headers.resolve.transform.name»> getHeaders() {
				return Optional.of(headers);
			}
			«ELSE»
			public Optional<Void> getHeaders() {
				return Optional.empty();
			}
			«ENDIF»
			
			@Override
			«IF message.payload !== null»
			public Optional<«message.payload.resolve.transform.name»> getPayload() {
				return Optional.of(payload);
			}
			«ELSE»
			public Optional<Void> getPayload() {
				return Optional.empty();
			}
			«ENDIF»			

			@Override
			public Optional<String> getIdentifier() {
				«IF message.identifier === MessageIdentifier.GENERATED»
					return Optional.of(identifier);
				«ELSEIF message.identifier === MessageIdentifier.MD5»
					return Optional.of(new DigestUtils(MessageDigestAlgorithms.MD5).digestAsHex(this.toJson()));
				«ELSEIF message.identifier === MessageIdentifier.SHA256»
					return Optional.of(new DigestUtils(MessageDigestAlgorithms.SHA_256).digestAsHex(this.toJson()));
				«ELSE»
					return Optional.empty();
				«ENDIF»
			}
			
			/**
			 * Create a new «messageBuilder.name»
			 */
			public static «messageBuilder.name» newBuilder() {
				return «messageBuilder.name».newBuilder();
			}
			
			@Override
			public String toJson(boolean pretty) {
				Gson gson = pretty ? new GsonBuilder().setPrettyPrinting().create() : new Gson();
				«IF isPayloadTheRawMessage»
					JsonElement elt = gson.toJsonTree(payload);
				«ELSE»
					JsonElement elt = gson.toJsonTree(this);
					«IF message.identifier === MessageIdentifier.GENERATED»
					// We are using a generated UUID, we must inject it as a header before serializing
					// We inject it at this point to avoid client code to access the generated UUID 
					// as a "regular" header 
					JsonObject jsonObj = elt.getAsJsonObject();
					JsonElement headers = elt.getAsJsonObject().get("headers");
					if (headers == null) {
						// There are no headers, add a new header with the ID
						JsonObject newHeadersObj = new JsonObject();
						newHeadersObj.addProperty("x-aat-identifier", identifier);
						jsonObj.add("headers", newHeadersObj);
					} else if (headers.isJsonObject()) {
						// The headers are an object, add a new entry with the ID
						headers.getAsJsonObject().addProperty("x-aat-identifier", identifier);
					} else {
						// The headers are something else, create a new headers object with the ID, 
						// and add the existing headers as a nested property
						JsonObject newHeadersObj = new JsonObject();
						newHeadersObj.addProperty("x-aat-identifier", identifier);
						newHeadersObj.add("headers", headers);
						jsonObj.remove("headers");
						jsonObj.add("headers", newHeadersObj);
					}
					«ENDIF»
				«ENDIF»
				return elt.toString();
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
				«IF isPayloadTheRawMessage»
				«name» result = gson.fromJson("{ \"payload\" :" + json + " }", «name».class);
				«ELSE»
				«name» result = gson.fromJson(json, «name».class);
				«ENDIF»
				«IF message.identifier === MessageIdentifier.GENERATED»
				JsonObject jsonObj = gson.fromJson(json, JsonObject.class);
				try {
					result.identifier = jsonObj.get("headers").getAsJsonObject().get("x-aat-identifier").getAsString();
				} catch (Exception e) {
					// Fail silently
				}
				«ENDIF»
				return result;
			}
			
			«messageBuilder.serialize»
		}
	'''
}
