package io.github.abelgomez.asyncapi.generator

import io.github.abelgomez.asyncapi.asyncApi.AbstractMessage
import io.github.abelgomez.asyncapi.asyncApi.AbstractSchema
import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI
import io.github.abelgomez.asyncapi.asyncApi.Channel
import io.github.abelgomez.asyncapi.asyncApi.Message
import io.github.abelgomez.asyncapi.asyncApi.NamedMessage
import io.github.abelgomez.asyncapi.asyncApi.NamedSchema
import io.github.abelgomez.asyncapi.asyncApi.Reference
import io.github.abelgomez.asyncapi.asyncApi.Schema
import io.github.abelgomez.asyncapi.asyncApi.Server
import io.github.abelgomez.asyncapi.asyncApi.Variable
import java.util.List
import java.util.Stack
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import io.github.abelgomez.asyncapi.asyncApi.Protocol
import io.github.abelgomez.asyncapi.asyncApi.Parameter
import io.github.abelgomez.asyncapi.asyncApi.NamedParameter
import java.util.Map
import java.util.HashMap
import java.util.regex.Pattern
import io.github.abelgomez.asyncapi.asyncApi.AbstractParameter

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
		for (ns : api.components.schemas) {
			if (!ns.schema.resolve.isBasicType) {
				fsa.generateFile("schemas/" + ns.toJavaType + ".java", ns.namedSchemaClassFile)
			}
		}
		fsa.generateFile("../ivy.xml", generateIvy)
	}
	
	def generateIvy() '''
	<ivy-module version="2.0">
	    <info organisation="com.example" module="mymodule"/>
	    <dependencies>
	        <dependency org="com.google.code.gson" name="gson" rev="2.8.5"/>
	        <dependency org="org.eclipse.paho" name="org.eclipse.paho.client.mqttv3" rev="1.2.1"/>
	    </dependencies>
	</ivy-module>
	'''
	
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
						
			public static final «c.publishPayloadClassName».«c.publishPayloadClassName»Builder payloadBuilder() {
				return «c.publishPayloadClassName».«c.publishPayloadClassName»Builder.newBuilder();
			}
			
			public static final void publish(«c.publishPayloadClassName» payload) throws MqttException {
				publish(payload, «c.publishMessageClassName»Params.create());
			}
			
			public static final void publish(«c.publishPayloadClassName» payload, «c.publishMessageClassName»Params params) throws MqttException {
				String broker = "«api.servers.get(0).expand»";
				String clientId = java.util.UUID.randomUUID().toString();
				MemoryPersistence persistence = new MemoryPersistence();
				
				try (MqttClient client = new MqttClient(broker, clientId, persistence);) {
				    
				    MqttConnectOptions connOpts = new MqttConnectOptions();
				    connOpts.setCleanSession(true);
				    
				    MqttMessage message = new MqttMessage(payload.toJson().getBytes());
				    message.setQos(QOS);
				    
				    client.connect(connOpts);
				    client.publish(expand(params), message);
				    client.disconnect();
				}
			}
			
				
			public static String expand(«c.publishMessageClassName»Params params) {
				return params.apply(TOPIC_ID);
			}
			«IF !c.parameters.empty»
			
			public static class «c.publishMessageClassName»Params {

				private Map<String, Object> parameters = new HashMap<>();
				
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
				
				public «c.publishMessageClassName»Params with«p.name.asJavaClassName»(«p.parameter.resolve.schema.resolve.toJavaType» «p.name.asJavaIdentifier») {
					this.parameters.put("«p.name.asJavaIdentifier»", «p.name.asJavaIdentifier»);
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
				String clientId = java.util.UUID.randomUUID().toString();
				MemoryPersistence persistence = new MemoryPersistence();
				try {
					client = new MqttClient(broker, clientId, persistence);
				} catch (MqttException e) {
					throw new RuntimeException(e);
				}
				Runtime.getRuntime().addShutdownHook(new Thread() {
					public void run() {
						try {
							client.close();
						} catch (MqttException e) {
						}
					}
				});
			}
			

			public static final void subscribe(I«c.subscribeMessageClassName»Callback callback) throws MqttException {
			    MqttConnectOptions connOpts = new MqttConnectOptions();
			    connOpts.setCleanSession(true);
			    client.setCallback(new MqttCallback() {
					@Override public void deliveryComplete(IMqttDeliveryToken token) {}
					@Override public void connectionLost(Throwable cause) {}
					@Override
					public void messageArrived(String topic, MqttMessage message) throws Exception {
						callback.messageArrived(new «c.subscribeMessageClassName»Params(topic), «c.subscribePayloadClassName».fromJson(new String(message.getPayload())));
					}
				});
			    client.connect(connOpts);
			    client.subscribe(TOPIC_PATTERN, QOS);
			}
			
			public static final void unsubscribe() throws MqttException {
			    client.unsubscribe(TOPIC_PATTERN);
				client.disconnect();
			}
			
			public interface I«c.subscribeMessageClassName»Callback {
				public void messageArrived(«c.subscribeMessageClassName»Params params, «c.subscribePayloadClassName» payload);
			}
			
			«IF !c.parameters.empty»
			public static class «c.subscribeMessageClassName»Params {
				
				private Map<String, Object> parameters = new HashMap<>();
				
				private «c.subscribeMessageClassName»Params(String topic) {
					String regex = TOPIC_ID;
					«FOR p : c.parameters»
					regex = regex.replaceAll("\\{«p.name.asJavaIdentifier»\\}", "(?<«p.name.asJavaIdentifier»>.+)");
					«ENDFOR»
					Pattern pattern = Pattern.compile(regex);
					Matcher matcher = pattern.matcher(topic);
					if (matcher.matches()) {
						«FOR p : c.parameters»
						this.parameters.put("«p.name.asJavaIdentifier»", matcher.group("«p.name.asJavaIdentifier»"));
						«ENDFOR»
					}
				}
				
				private «c.subscribeMessageClassName»Params(Map<String, Object> parameters) {
					this.parameters.putAll(parameters);
				}
				«FOR p : c.parameters»
				
				public «p.parameter.resolve.schema.resolve.toJavaType» get«p.name.asJavaClassName»() {
					return («p.parameter.resolve.schema.resolve.toJavaType») this.parameters.get("«p.name.asJavaIdentifier»");
				}
				«ENDFOR»
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
		«FOR p : s.properties.filter[p | p.schema.resolve.enumType]»
			«p.namedSchemaEnum»
		«ENDFOR»
		«FOR p : s.properties.filter[p | p.schema.resolve.objectType]»
			«p.namedSchemaClass»
		«ENDFOR»
		«FOR p : s.properties»
			«p.namedSchemaField»
		«ENDFOR»

			
		private «thisTypeName»() {
		}
			
		public static final «thisTypeName»Builder newBuilder() {
			return new «thisTypeName»Builder();
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
			clone.«p.friendlyName.asJavaIdentifier» = this.«p.friendlyName.asJavaIdentifier»;
			«ENDFOR»
			«FOR p : s.properties.filter[p | p.schema.resolve.objectType]»
			clone.«p.friendlyName.asJavaIdentifier» = («p.toJavaType») this.«p.friendlyName.asJavaIdentifier».clone();
			«ENDFOR»
			return clone;
		}
		
		public static class «thisTypeName»Builder {
			
			private «thisTypeName» instance = new «thisTypeName»();
			
			public static «thisTypeName»Builder newBuilder() {
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
		private «ns.toJavaType» «ns.friendlyName.asJavaIdentifier»;
	'''

	def namedSchemaBuilderMethods(NamedSchema ns, String thisTypeName) '''
	
		public «thisTypeName»Builder with«ns.friendlyName»(«ns.toJavaType» «ns.friendlyName.asJavaIdentifier») {
			this.instance.«ns.friendlyName.asJavaIdentifier» = «ns.friendlyName.asJavaIdentifier»;
			return this;
		}
	'''

	def namedSchemaGetterMethods(NamedSchema ns, String thisTypeName) '''
	
		public «ns.toJavaType» get«ns.friendlyName»() {
			«IF ns.schema.resolve.objectType»
			return («ns.toJavaType») this.«ns.friendlyName.asJavaIdentifier».clone();
			«ELSE»
			return this.«ns.friendlyName.asJavaIdentifier»;
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

	def friendlyName(NamedSchema ns) {
		return (if (ns.schema.resolve.title !== null) ns.schema.resolve.title else ns.name).asJavaClassName; 
	}
	
	def String publishMessageClassName(Channel c) {
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
			return ((s as Reference).resolve as NamedSchema).name;
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
		return if (!Character.isLowerCase(retVal.charAt(0))) "_" + retVal else retVal;	
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
			switch (schema.type.toLowerCase) {
				case "string": {
					return "String";
				}
				case "number": {
					return "Double";
				}
				case "integer": {
					return "Integer";
				}
				case "boolean": {
					return "Boolean";
				}
				case "null": {
					return "Object";
				}
				case "any": {
					return "Object";
				}
				case "array": {
					return "java.util.List<?>";
				}
			}
		}
	}

	def isObjectType(Schema s) {
		if (s.type == "object") {
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
		} else if (s !== null) {
			switch (s.type.toLowerCase) {
				case "string": {
					return true;
				}
				case "number": {
					return true;
				}
				case "integer": {
					return true;
				}
				case "boolean": {
					return true;
				}
				case "null": {
					return true;
				}
				case "any": {
					return true;
				}
				case "array": {
					return true;
				}
			}
		} 
		return false;
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
		val substs = new HashMap<String,String>
		for (NamedParameter p : channel.parameters) {
			substs.put(p.name, "+")
		}
		return channel.expand(substs);
	}
	
	static def String expand(Channel channel, Map<String, String> substs) {
		var result = channel.name;
		for (NamedParameter p : channel.parameters) {
			result = result.replaceAll("\\{" + p.name + "\\}", substs.get(p.name));
		}
		return result;
	}
	
	static def Map<String, String> match(Channel channel, String str) {
		val result = new HashMap<String,String>
		var regex = channel.name
		for (NamedParameter p : channel.parameters) {
			regex = regex.replaceAll("\\{" + p.name + "\\}", "(?<" + p.name + ">\\w+)");
		}
		val pattern = Pattern.compile(regex);
		val matcher = pattern.matcher(str)
		if (matcher.matches) {
			for (NamedParameter p : channel.parameters) {
				if (matcher.group(p.name) !== null) {
					result.put(p.name, matcher.group(p.name))
				}
			}
		}
		return result;
	}
	
}


