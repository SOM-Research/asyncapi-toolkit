package io.github.abelgomez.asyncapi.generator

import io.github.abelgomez.asyncapi.asyncApi.AbstractMessage
import io.github.abelgomez.asyncapi.asyncApi.AbstractParameter
import io.github.abelgomez.asyncapi.asyncApi.AbstractSchema
import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI
import io.github.abelgomez.asyncapi.asyncApi.Channel
import io.github.abelgomez.asyncapi.asyncApi.Message
import io.github.abelgomez.asyncapi.asyncApi.NamedMessage
import io.github.abelgomez.asyncapi.asyncApi.NamedParameter
import io.github.abelgomez.asyncapi.asyncApi.NamedSchema
import io.github.abelgomez.asyncapi.asyncApi.Parameter
import io.github.abelgomez.asyncapi.asyncApi.Protocol
import io.github.abelgomez.asyncapi.asyncApi.Reference
import io.github.abelgomez.asyncapi.asyncApi.Schema
import io.github.abelgomez.asyncapi.asyncApi.Server
import io.github.abelgomez.asyncapi.asyncApi.Variable
import java.util.Collection
import java.util.Collections
import java.util.List
import java.util.Stack
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import io.github.abelgomez.asyncapi.asyncApi.JsonType
import java.util.regex.Matcher

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class AsyncApiGenerator extends AbstractGenerator {

	AsyncAPI api;

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		api = resource.contents.findFirst[a | a instanceof AsyncAPI] as AsyncAPI;
		for (t : api.channels) {
			t.messageClasses(fsa)
		}
		for (ns : api.schemas) {
			if (ns.schema.resolve.isObjectType) {
				fsa.generateFile("schemas/" + ns.toJavaType + ".java", ns.namedSchemaClassFile)
			} else if (ns.schema.resolve.isEnumType) {
				fsa.generateFile("schemas/" + ns.toJavaType + ".java", ns.namedSchemaEnumFile)
			}
		}
	}
	
	def void messageClasses(Channel c, IFileSystemAccess2 fsa) {
		if (c.publish !== null && c.publish.message !== null) {
			fsa.generateFile(c.path + "/" + c.publishMessageClassName + ".java", c.publishClass);
		}
		if (c.subscribe !== null && c.subscribe.message !== null) {
			fsa.generateFile(c.path + "/" + c.subscribeMessageClassName + ".java", c.subscribeClass);
		}
	}

	def gsonImports() '''
		import com.google.gson.Gson;
		import com.google.gson.GsonBuilder;
		import com.google.gson.annotations.SerializedName;
	'''

	def publishClass(Channel c) '''
		package «c.packageName»;
		
		import java.util.HashMap;
		import java.util.Map;
		import java.util.Map.Entry;
		
		«IF c.publish.message.resolve.payload.isNamedSchema»
		import schemas.«c.publishPayloadClassName»;
		«ELSE»
		«gsonImports»
		«ENDIF»
		
		import org.eclipse.paho.client.mqttv3.MqttClient;
		import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
		import org.eclipse.paho.client.mqttv3.MqttException;
		import org.eclipse.paho.client.mqttv3.MqttMessage;
		import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
		
		/**
		«IF c.publish.summary!== null»
		 * «c.publish.summary»
		«ENDIF»
		«IF c.publish.description!== null»
		 * «c.publish.description»
		«ENDIF»
		 */
		public class «c.publishMessageClassName» {
			
			public static final String TOPIC_ID = "«c.name»";
			
			private static final int QOS = 2;
			
			/**
			 * Creates a new builder that can be used to build the payload necessary to
			 * publish in the «c.publishMessageClassName» channel
			 * 
			 * @return the builder
			 */
			public static final «c.publishPayloadClassName».«c.publishPayloadClassName»Builder payloadBuilder() {
				return «c.publishPayloadClassName».newBuilder();
			}
			
			/**
			 * Publishes the given {@link «c.publishPayloadClassName»} in the channel with 
			 * no parameters
			 * 
			 * @param payload
			 * @throws MqttException
			 */
			«IF !c.parameters.empty»
			public static final void publish(«c.publishPayloadClassName» payload) throws MqttException {
				publish(payload, «c.publishMessageClassName»Params.create());
			}
			
			/**
			 * Publishes the given {@link «c.publishPayloadClassName»} in the channel 
			 * configured with the given {@link «c.publishMessageClassName»Params}
			 * 
			 * @param payload
			 * @throws MqttException
			 */
			public static final void publish(«c.publishPayloadClassName» payload, «c.publishMessageClassName»Params params) throws MqttException {
				String topic = expand(params);
			«ELSE»
			public static final void publish(«c.publishPayloadClassName» payload) throws MqttException {
				String topic = TOPIC_ID;
			«ENDIF»
				String broker = "«api.servers.get(0).expand»";
				String clientId = MqttClient.generateClientId();
				MemoryPersistence persistence = new MemoryPersistence();
				
				try (MqttClient client = new MqttClient(broker, clientId, persistence);) {
				    
				    MqttConnectOptions connOpts = new MqttConnectOptions();
				    connOpts.setCleanSession(true);
				    
				    MqttMessage message = new MqttMessage(payload.toJson().getBytes());
				    message.setQos(QOS);
				    
				    client.connect(connOpts);
				    client.publish(topic, message);
				    client.disconnect();
				}
			}
			«IF !c.parameters.empty»
			
			/**
			 * Expands the parameters of the {@link #TOPIC_ID} with the values given 
			 * in {@link «c.publishMessageClassName»Params}
			 * 
			 * @param params
			 * @return
			 */
			public static String expand(«c.publishMessageClassName»Params params) {
				return params.apply(TOPIC_ID);
			}
			
			/**
			 * Utility class to set the parameters that can be used to configure the
			 * {@link «c.publishMessageClassName»} channel
			 */
			public static class «c.publishMessageClassName»Params {

				private Map<String, Object> parameters = new HashMap<>();
				
				/**
				 * Method to create a new instance of «c.publishMessageClassName»Params
				 * 
				 * @return a new «c.publishMessageClassName»Params
				 */
				public static «c.publishMessageClassName»Params create() {
					return new «c.publishMessageClassName»Params();
				}

				private String apply(String topic) {
					for (Entry<String, Object> entry : parameters.entrySet()) {
						topic = topic.replaceAll("\\{" + entry.getKey() + "\\}", entry.getValue().toString());
					}
					return topic;
				}
				«FOR p : c.parameters»
				
				/**
				 * Set the <code>«p.name»</code> parameter
				 */ 
				public «c.publishMessageClassName»Params with«p.name.asJavaClassName»(«p.parameter.resolve.schema.resolve.toJavaType» «p.name.asJavaIdentifier») {
					this.parameters.put("«p.name»", «p.name.asJavaIdentifier»);
					return this;
				}
				«ENDFOR»
			} 
			«ENDIF»
			«IF !c.publish.message.resolve.payload.isNamedSchema»
			
			«c.publish.message.resolve.payload.resolve.unnamedSchemaClass»
			«ENDIF»
		}
	'''

	def subscribeClass(Channel c) '''
		package «c.packageName»;
		
		import java.util.HashMap;
		import java.util.Map;
		import java.util.regex.Matcher;
		import java.util.regex.Pattern;
		
		«IF c.subscribe.message.resolve.payload.isNamedSchema»
		import schemas.«c.subscribePayloadClassName»;
		«ELSE»
		«gsonImports»
		«ENDIF»
		
		import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
		import org.eclipse.paho.client.mqttv3.MqttCallback;
		import org.eclipse.paho.client.mqttv3.MqttClient;
		import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
		import org.eclipse.paho.client.mqttv3.MqttException;
		import org.eclipse.paho.client.mqttv3.MqttMessage;
		import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

		
		/**
		«IF c.subscribe.summary!== null»
		 * «c.subscribe.summary»
		«ENDIF»
		«IF c.subscribe.description!== null»
		 * «c.subscribe.description»
		«ENDIF»
		 */
		public class «c.subscribeMessageClassName» {
			
			public static final String TOPIC_ID = "«c.name»";
			public static final String TOPIC_PATTERN = "«c.wildcardify»";
			
			private static final int QOS = 2;
			
			private static MqttClient client;
				
			static {
				String broker = "«api.servers.get(0).expand»";
				String clientId = MqttClient.generateClientId();
				MemoryPersistence persistence = new MemoryPersistence();
				try {
					client = new MqttClient(broker, clientId, persistence);
				} catch (MqttException e) {
					throw new RuntimeException(e);
				}
			}
			
			/**
			 * Subscribes to the given channel with the given
			 * {@link I«c.subscribeMessageClassName»Callback}. Only a single subscription and
			 * callback method is allowed per channel. If multiple subscriptions are
			 * solicited, only the latest registered callback will be honored.
			 * 
			 * @param callback
			 * @throws MqttException
			 */
			public static final void subscribe(I«c.subscribeMessageClassName»Callback callback) throws MqttException {
			    if (!client.isConnected()) {
				    MqttConnectOptions connOpts = new MqttConnectOptions();
				    connOpts.setCleanSession(true);
				    client.connect(connOpts);
			    }
			    client.setCallback(new MqttCallback() {
					@Override public void deliveryComplete(IMqttDeliveryToken token) {}
					@Override public void connectionLost(Throwable cause) {}
					@Override
					public void messageArrived(String topic, MqttMessage message) throws Exception {
					«IF !c.parameters.empty»
						callback.messageArrived(«c.subscribePayloadClassName».fromJson(new String(message.getPayload())), new «c.subscribeMessageClassName»Params(topic));
					«ELSE»
						callback.messageArrived(«c.subscribePayloadClassName».fromJson(new String(message.getPayload())));
					«ENDIF»
					}
				});
			    client.subscribe(TOPIC_PATTERN, QOS);
			}
			
			/**
			 * Unsubscribes from the given channel and closes the connection if a
			 * subscription was previously registered
			 * 
			 * @throws MqttException
			 */
			public static final void unsubscribe() throws MqttException {
				if (client.isConnected()) {
				    client.unsubscribe(TOPIC_PATTERN);
					client.disconnect();
				}
			}
			
			«IF !c.parameters.empty»
			/**
			 * Interface that must be implemented for subscribing to the
			 * {@link «c.subscribeMessageClassName»} channel
			 */
			public interface I«c.subscribeMessageClassName»Callback {
				public void messageArrived(«c.subscribePayloadClassName» payload, «c.subscribeMessageClassName»Params params);
			}
			
			/**
			 * Utility class that can be used to retrieve the parameters used to 
			 * configure the {@link «c.subscribeMessageClassName»} channel
			 */
			public static class «c.subscribeMessageClassName»Params {
				
				private Map<String, Object> parameters = new HashMap<>();
				
				private «c.subscribeMessageClassName»Params(String topic) {
					String regex = TOPIC_ID;
					«FOR p : c.parameters»
					regex = regex.replaceAll("\\{«p.name»\\}", "(?<«p.name»>.+)");
					«ENDFOR»
					Pattern pattern = Pattern.compile(regex);
					Matcher matcher = pattern.matcher(topic);
					if (matcher.matches()) {
						«FOR p : c.parameters»
						this.parameters.put("«p.name»", matcher.group("«p.name»"));
						«ENDFOR»
					}
				}
				
				private «c.subscribeMessageClassName»Params(Map<String, Object> parameters) {
					this.parameters.putAll(parameters);
				}
				«FOR p : c.parameters»
				
				/**
				 * Getter for the <code>«p.name»</code> parameter
				 *
				 * @return «p.name»
				 */ 
				public «p.parameter.resolve.schema.resolve.toJavaType» get«p.name.asJavaClassName»() {
					return («p.parameter.resolve.schema.resolve.toJavaType») this.parameters.get("«p.name»");
				}
				«ENDFOR»
			}
			«ELSE»
			/**
			 * Interface that must be implemented for subscribing to the
			 * {@link «c.subscribeMessageClassName»} channel
			 */
			public interface I«c.subscribeMessageClassName»Callback {
				public void messageArrived(«c.subscribePayloadClassName» payload);
			}
			«ENDIF»
			«IF !c.subscribe.message.resolve.payload.isNamedSchema»
			
			«c.subscribe.message.resolve.payload.resolve.unnamedSchemaClass»
			«ENDIF»
		}
	'''
	
	def summary(AbstractMessage m) {
		return m.resolve.summary;
	}
	
	def description(AbstractMessage m) {
		return m.resolve.description;
	}
	
	def namedSchemaClassFile(NamedSchema ns) '''
		package schemas;
		
		«gsonImports»
		
		«ns.namedSchemaClass»
	'''

	def namedSchemaEnumFile(NamedSchema ns) '''
		package schemas;
		
		«ns.namedSchemaEnum»
	'''
	
	def String namedSchemaClass(NamedSchema ns) '''
		/**
		 «IF ns.title !== null»
		 * «ns.title»
		 «ENDIF»
		 «IF ns.description !== null»
		 * «ns.description»
		 «ENDIF»
		 */
		public «IF ns.eContainer instanceof Schema»static «ENDIF»class «ns.toJavaType» implements Cloneable {
			«ns.schema.resolve.schemaClassBody(ns.toJavaType)»
		}
	'''
	
	def String unnamedSchemaClass(Schema s) '''
		/**
		 «IF s.title !== null»
		 * «s.title»
		 «ENDIF»
		 «IF s.description !== null»
		 * «s.description»
		 «ENDIF»
		 */
		public static class Payload {
			«s.schemaClassBody("Payload")»
		}
	'''

	def String schemaClassBody(Schema s, String thisTypeName) '''
		«FOR p : s.properties.filter[p | p.schema instanceof Schema && p.schema.resolve.enumType]»
		
		«p.namedSchemaEnum»
		«ENDFOR»
		«FOR p : s.properties.filter[p | p.schema instanceof Schema && p.schema.resolve.objectType]»
		
		«p.namedSchemaClass»
		«ENDFOR»
		«FOR p : s.properties»
		
		«p.namedSchemaField»
		«ENDFOR»

			
		private «thisTypeName»() {
		}
			
		public static final «thisTypeName»Builder newBuilder() {
			return «thisTypeName»Builder.newBuilder();
		}
		
		public String toJson() {
			return toJson(false);
		}

		public String toJson(boolean pretty) {
			Gson gson = pretty ? new GsonBuilder().setPrettyPrinting().create() : new Gson();
			return gson.toJson(this);
		}
		
		public static «thisTypeName» fromJson(String json) {
			Gson gson = new Gson();
			return gson.fromJson(json, «thisTypeName».class);
		}
		«FOR p : s.properties»
		
		«p.namedSchemaGetterMethods(thisTypeName)»
		«ENDFOR»

		protected Object clone() throws CloneNotSupportedException {
			«thisTypeName» clone = new «thisTypeName»();
			«FOR p : s.properties.filter[p | !p.schema.resolve.objectType]»
			clone.«p.friendlyIdentifierName» = this.«p.friendlyIdentifierName»;
			«ENDFOR»
			«FOR p : s.properties.filter[p | p.schema.resolve.objectType]»
			clone.«p.friendlyIdentifierName» = («p.toJavaType») this.«p.friendlyIdentifierName».clone();
			«ENDFOR»
			return clone;
		}
		
		public static class «thisTypeName»Builder {
			
			private «thisTypeName» instance = new «thisTypeName»();
			
			private static «thisTypeName»Builder newBuilder() {
				return new «thisTypeName»Builder();
			}
			«FOR p : s.properties»
			
			«p.namedSchemaBuilderMethods(thisTypeName)»
			«ENDFOR»
			
			public «thisTypeName» build() {
				try {
					return («thisTypeName») instance.clone();
				} catch (CloneNotSupportedException e) {
					throw new RuntimeException("Unable to build: " + this, e);
				}
			}
		}
	'''

	def namedSchemaEnum(NamedSchema ns) '''
		/**
		 «IF ns.title !== null»
		 * «ns.title»
		 «ENDIF»
		 «IF ns.description !== null»
		 * «ns.description»
		 «ENDIF»
		 */
		public enum «ns.toJavaType» {
			«ns.enum_.join(", ")»;
		}
	'''

	def namedSchemaField(NamedSchema ns) '''
		/**
		 * «ns.title»
		 «IF ns.description !== null»
		 * «ns.description»
		 «ENDIF»
		 */
		@SerializedName("«ns.name»")
		«IF ns.schema.resolve.type === JsonType.ARRAY»
		private «ns.toJavaType» «ns.friendlyIdentifierName» = new java.util.ArrayList<«ns.schema.resolve.items.resolve.toJavaType»>();
		«ELSE»
		private «ns.toJavaType» «ns.friendlyIdentifierName»;
		«ENDIF»
	'''

	def namedSchemaBuilderMethods(NamedSchema ns, String thisTypeName) '''
		«IF ns.schema.resolve.type === JsonType.ARRAY»
		public «thisTypeName»Builder addTo«ns.friendlyClassName»(«ns.schema.resolve.items.resolve.toJavaType» «ns.friendlyIdentifierName»Elt) {
			this.instance.«ns.friendlyIdentifierName».add(«ns.friendlyIdentifierName»Elt);
			return this;
		}
		«ELSE»
		public «thisTypeName»Builder with«ns.friendlyClassName»(«ns.toJavaType» «ns.friendlyIdentifierName») {
			this.instance.«ns.friendlyIdentifierName» = «ns.friendlyIdentifierName»;
			return this;
		}
		«ENDIF»
	'''

	def namedSchemaGetterMethods(NamedSchema ns, String thisTypeName) '''
		public «ns.toJavaType» get«ns.friendlyClassName»() {
			«IF ns.schema.resolve.objectType»
			try {
				return («ns.toJavaType») this.«ns.friendlyIdentifierName».clone();
			} catch (CloneNotSupportedException e) {
				throw new RuntimeException("Unable to clone: " + «ns.friendlyIdentifierName», e);
			}
			«ELSE»
			return this.«ns.friendlyIdentifierName»;
			«ENDIF»
		}
	'''

	def title(NamedSchema ns) {
		return ns.schema.resolve.title;
	}	

	def description(NamedSchema ns) {
		return ns.schema.resolve.description;
	}
	
	def enum_(NamedSchema ns) {
		return ns.schema.resolve.enum.map[e | e.replaceAll("\"", "").asJavaClassName];
	}

	def friendlyClassName(NamedSchema ns) {
		return (if (ns.schema.resolve.title !== null) ns.schema.resolve.title else ns.name).asJavaClassName; 
	}
	
	def friendlyIdentifierName(NamedSchema ns) {
		return (if (ns.schema.resolve.title !== null) ns.schema.resolve.title else ns.name).asJavaIdentifier; 
	}
	
	def String publishMessageClassName(Channel c) {
		if (c.publish.operationId !== null) {
			return c.publish.operationId.asJavaClassName; 
		}
		val m = c.publish.message;
		if (m === null) {
			throw new RuntimeException("Unexpected type of publish Message: " + m);
		} else if (m.isNamedMessage) {
			return "Publish" + m.name.asJavaClassName
		} else {
			return "Publish";
		}
	}

	def String publishPayloadClassName(Channel c) {
		if (c.publish.message.resolve.payload.isNamedSchema) {
			return c.publish.message.resolve.payload.name.asJavaClassName
		} else {
			return "Payload"
		}
	}
	
	def String subscribeMessageClassName(Channel c) {
		if (c.subscribe.operationId !== null) {
			return c.subscribe.operationId.asJavaClassName; 
		}
		val m = c.subscribe.message;
		if (m === null) {
			throw new RuntimeException("Unexpected type of subscribe Message: " + m);
		} else if (m.isNamedMessage) {
			return "Subscribe" + m.name.asJavaClassName
		} else {
			return "Subscribe";
		}
	}

	def String subscribePayloadClassName(Channel c) {
		if (c.subscribe.message.resolve.payload.isNamedSchema) {
			return c.subscribe.message.resolve.payload.name.asJavaClassName;
		} else {
			return "Payload";
		}
	}
	
	def isNamedMessage(AbstractMessage am) {
		return (am instanceof Reference);
	}

	def isNamedSchema(AbstractSchema s) {
		return (s instanceof Reference);
	}

	def name(AbstractMessage am) {
		if (am instanceof Reference) {
			return ((am as Reference).resolve as NamedMessage).name;
		} else {
			throw new RuntimeException("Unexpected type of Message (expecting a Reference): " + am);
		}
	}
	
	def name(AbstractSchema s) {
		if (s instanceof Reference) {
			return ((s as Reference).resolve as NamedSchema).friendlyClassName;
		} else {
			throw new RuntimeException("Unexpected type of Schema (expecting a Reference): " + s);
		}
	}
	
	def String packageName(Channel c) {
		var segments = c.name.split("/");
		return segments.filter[s | s.length > 0].map[s | s.asJavaIdentifier].join(".");
	}
	
	def String path(Channel c) {
		return c.packageName.replaceAll("\\.", "/") ;
	}

	def String asJavaIdentifier(String s) {
		val builder = new StringBuilder();
		var nextUpper = false;
		for (char c : s.toCharArray) {
			if (Character.isDigit(c)) {
				builder.append(c);
			} else if (Character.isAlphabetic(c)) {
				if (nextUpper) {
					builder.append(Character.toUpperCase(c));
					nextUpper = false;
				} else {
					builder.append(c);
				}
			} else if (c == Character.valueOf('-') || c == Character.valueOf('_')) {
				nextUpper = true;
			} else {
				builder.append("_");
			}
		}
		val retVal = builder.toString()
		return if (!Character.isJavaIdentifierStart(retVal.charAt(0))) "_" + retVal else retVal;	
	}

	def String asJavaClassName(String s) {
		val builder = new StringBuilder();
		var nextUpper = true;
		for (char c : s.toCharArray) {
			if (Character.isDigit(c)) {
				builder.append(c);
				nextUpper = true;
			} else if (Character.isAlphabetic(c)) {
				if (nextUpper) {
					builder.append(Character.toUpperCase(c));
					nextUpper = false;
				} else {
					builder.append(c);
				}
			} else if (c == Character.valueOf('-') || c == Character.valueOf('_')) {
				nextUpper = true;
			} else {
				nextUpper = true;
				builder.append("_");
			}
		}
		val retVal = builder.toString()
		return if (Character.isDigit(retVal.charAt(0))) "_" + retVal else retVal;	
	}
	
	def Collection<NamedSchema> schemas(AsyncAPI api) {
		if (api.components !== null) {
			return api.components.schemas
		} else {
			return Collections.emptyList
		}
	}

	def Message resolve(AbstractMessage m) {
		if (m instanceof Message) {
			return m;
		} else if (m instanceof Reference) {
			return (m.resolve as NamedMessage).message.resolve;
		} else {
			throw new RuntimeException("Unexpected abstract message: " + m);
		}
	}
	
	def Schema resolve(AbstractSchema s) {
		if (s instanceof Schema) {
			return s;
		} else if (s instanceof Reference) {
			return (s.resolve as NamedSchema).schema.resolve;
		} else {
			throw new RuntimeException("Unexpected abstract schema: " + s);
		}
	}
	
	def Parameter resolve(AbstractParameter p) {
		if (p instanceof Parameter) {
			return p;
		} else if (p instanceof Reference) {
			return (p.resolve as NamedParameter).parameter.resolve;
		} else {
			throw new RuntimeException("Unexpected abstract parameter: " + p);
		}
	}
	
	
	def EObject resolve(Reference r) {
		var stack = new Stack();
		stack.addAll(r.uri.split("/").reverse);
		if (stack.pop != "#") {
			throw new RuntimeException("Only relative references allowed: " + r.uri);
		}
		var elt = api as EObject;
		while (!stack.isEmpty) {
			val eClass = elt.eClass;
			val featureName = stack.pop;
			var featureValue = elt.eGet(eClass.EAllReferences.findFirst[ref | ref.name == featureName]);
			if (featureValue instanceof EObject) {
				elt = featureValue as EObject;
			} else if (featureValue instanceof List) {
				val list = featureValue as List<EObject>;
				val eltName = stack.pop;
				elt = list.findFirst[eo | eo.eGet(eo.eClass.EAllAttributes.findFirst[at | at.name == "name"]) == eltName]
			} else {
				throw new RuntimeException("Unexpected feature value: " + featureValue);
			}
		}
		if (elt === null) {
			throw new RuntimeException("Unable to resolve Reference: " + r);
		} else {
			return elt;
		}
	}

	def String toJavaType(NamedSchema s) {
		s.schema.resolve.toJavaType;
	}
	
	def String toJavaType(Schema schema) {
//		if (schema.type === null) {
//			throw new RuntimeException("Unexpected JSON type (null) for NamedSchema: " + s);
//		} else 
		if (schema.objectType || schema.enumType) {
			if (schema.title !== null) {
				return schema.title.asJavaClassName;
			} else if (schema.eContainer instanceof NamedSchema) {
				return (schema.eContainer as NamedSchema).name.asJavaClassName;
			} else {
				return "TYPE"
			}
		} else {
			switch (schema.type) {
				case JsonType.STRING: {
					return "String";
				}
				case JsonType.NUMBER: {
					return "Double";
				}
				case JsonType.INTEGER: {
					return "Integer";
				}
				case JsonType.BOOLEAN: {
					return "Boolean";
				}
				case JsonType.NULL: {
					return "Object";
				}
				case JsonType.ANY: {
					return "Object";
				}
				case JsonType.ARRAY: {
					return "java.util.List<" + schema.items.resolve.toJavaType + ">";
				}
			}
		}
	}

	def isObjectType(Schema s) {
		if (s.type == JsonType.OBJECT) {
			return true;
		} else if (!s.properties.isEmpty) {
			return true;
		} else {
			return false;
		}
	}
	
	def isEnumType(Schema s) {
		if (!s.enum.empty) {
			return true;
		} else {
			return false;
		}
	}

	def isBasicType(Schema s) {
		if (s.isObjectType) {
			return false;
		} else {
			return true;
		} 
	}
	
	static def String expand(Server server) {
		var result = server.url;
		for (Variable v : server.variables) {
			result = result.replaceAll("\\{" + v.name + "\\}", v.^default);
		}
		val protocol = switch (server.protocol) {
			case Protocol.MQTT: "tcp"
			case Protocol.MQTTS: "ssl"
			default: server.protocol.literal
		}
		return protocol + "://" + result;
	}
	
	static def String wildcardify(Channel channel) {
		var result = channel.name;
		for (NamedParameter p : channel.parameters) {
			result = result.replaceAll("/[^/]*\\{" + p.name + "\\}[^/]*", "/+");
		}
		return result;
	}
}


