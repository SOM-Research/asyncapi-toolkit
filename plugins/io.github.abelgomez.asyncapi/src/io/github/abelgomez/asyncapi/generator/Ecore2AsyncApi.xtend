package io.github.abelgomez.asyncapi.generator

import io.github.abelgomez.asyncapi.asyncApi.AbstractSchema
import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI
import io.github.abelgomez.asyncapi.asyncApi.AsyncApiFactory
import io.github.abelgomez.asyncapi.asyncApi.Channel
import io.github.abelgomez.asyncapi.asyncApi.Components
import io.github.abelgomez.asyncapi.asyncApi.Info
import io.github.abelgomez.asyncapi.asyncApi.JsonType
import io.github.abelgomez.asyncapi.asyncApi.NamedMessage
import io.github.abelgomez.asyncapi.asyncApi.NamedSchema
import io.github.abelgomez.asyncapi.asyncApi.Operation
import io.github.abelgomez.asyncapi.asyncApi.Protocol
import io.github.abelgomez.asyncapi.asyncApi.Reference
import io.github.abelgomez.asyncapi.asyncApi.Schema
import io.github.abelgomez.asyncapi.asyncApi.Server
import io.github.abelgomez.asyncapi.asyncApi.VersionNumber
import java.io.InputStream
import java.util.Collections
import org.eclipse.core.runtime.IPath
import org.eclipse.emf.common.util.Diagnostic
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.Diagnostician
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl
import org.eclipse.xtext.EcoreUtil2
import io.github.abelgomez.asyncapi.asyncApi.Parameter
import io.github.abelgomez.asyncapi.asyncApi.NamedParameter
import io.github.abelgomez.asyncapi.asyncApi.AbstractParameter
import java.util.List

class Ecore2AsyncApi {

	public static final String BASE_EANNOTATION_URI = "http://io.github.abelgomez/asyncapi/eAnnotations/"

	public static final String EANNOTATION_SERVER = BASE_EANNOTATION_URI + "Server"

	public static final String EANNOTATION_SERVER_NAME = "name"
	public static final String EANNOTATION_SERVER_URL = "url"
	public static final String EANNOTATION_SERVER_PROTOCOL = "protocol"

	public static final String EANNOTATION_CHANNEL = BASE_EANNOTATION_URI + "Channel"
	public static final String EANNOTATION_CHANNEL_NAME = "name"
	public static final String EANNOTATION_CHANNEL_DESCRIPTION = "description"
	public static final String EANNOTATION_CHANNEL_PUBLISH = "publish"
	public static final String EANNOTATION_CHANNEL_SUBSCRIBE = "subscribe"
	public static final String EANNOTATION_CHANNEL_PARAMETERS= "parameters"

	public static final String EANNOTATION_MESSAGE = BASE_EANNOTATION_URI + "Message"
	public static final String EANNOTATION_MESSAGE_NAME = "name"

	public static final String EANNOTATION_SCHEMA = BASE_EANNOTATION_URI + "Schema"
	public static final String EANNOTATION_SCHEMA_NAME = "name"
	public static final String EANNOTATION_SCHEMA_TITLE = "title"

	static def CharSequence generate(EPackage ePackage) {
		return ePackage.asyncApi.generate
	}

	/**
	 * Generate the textual representation of an AsyncAPI instance. Although
	 * we can use an XtextResource for the serialization, until we have a
	 * proper formatter this is the most direct way to get a properly
	 * formatted specification
	 */
	static def CharSequence generate(AsyncAPI asyncAPI) '''
		{
			"asyncapi": "2.0.0",
			"info": «asyncAPI.info.generate»,
			«IF !asyncAPI.servers.empty»
			"servers": {
				«asyncAPI.servers.map[generate].join(",\n")»
			},
			«ENDIF»
			«IF !asyncAPI.channels.empty»
			"channels": {
				«asyncAPI.channels.map[generate].join(",\n")»
			},
			«ENDIF»
			"components": «asyncAPI.components.generate»
		}
	'''

	static def CharSequence generate(Info i) '''
	{
		"title" : "«i.title»",
		"version" : "«i.version»"
	}'''

	static def CharSequence generate(Server s) '''
	"«s.name»" : {
		"url" : "«s.url»",
		"protocol" : "«s.protocol.getName»"
	}'''

	static def CharSequence generate(Channel c) '''
	"«c.name»" : {
		"description" : "«c.description»"«
		IF !c.parameters.empty»,
		"parameters" : {
			«c.parameters.map[generate].join(",\n")»
		}«ENDIF»«
		IF c.publish !== null»,
		"publish" : «c.publish.generate»«ENDIF»«
		IF c.subscribe !== null»,
		"subscribe" : «c.subscribe.generate»«ENDIF»
	}'''

	static def CharSequence generate(NamedParameter np) '''
	"«np.name»" : «np.parameter.generate»'''

	static def CharSequence generate(AbstractParameter abp) '''
		«if (abp instanceof Parameter)
			abp.generate
		else if (abp instanceof Reference)
			abp.generate
		»'''

	static def CharSequence generate(Parameter p) '''
	{
		"schema" : «p.schema.generate»«
		IF p.description !== null»,
		"description" : "«p.description»"«ENDIF»«
		IF p.location !== null»,
		"location" : «p.location»«ENDIF»
	}'''

	static def CharSequence generate(Operation o) '''
	{
		"operationId" : "«o.operationId»",
		"message": {
			"$ref" : "«(o.message as Reference).uri»"
		}
	}'''

	static def CharSequence generate(Components c) '''
	{
		«IF !c.messages.empty»
		"messages": {
			«c.messages.map[generate].join(",\n")»
		},
		«ENDIF»
		«IF !c.messages.empty»
		"schemas": {
			«c.schemas.map[generate].join(",\n")»
		}
		«ENDIF»
	}'''

	static def CharSequence generate(NamedMessage nm) '''
	"«nm.name»" : {
		"name" : "«nm.name»",
		"payload" : {
			"$ref" : "«(nm.message as Reference).uri»"
		}
	}'''

	static def CharSequence generate(NamedSchema ns) '''
	"«ns.name»" : «ns.schema.generate»'''
	
	static def CharSequence generate(AbstractSchema abs) '''
		«if (abs instanceof Schema)
			abs.generate
		else if (abs instanceof Reference)
			abs.generate
		»'''
	
	static def CharSequence generate(Schema s) '''
	{
		"type" : "«s.type.getName»"«
		IF s.title !== null»,
		"title" : "«s.title»"«ENDIF»«
		IF !s.properties.empty»,
		"properties" : {
			«s.properties.map[generate].join(",\n")»
		}«ENDIF»«
		IF !s.enum.empty»,
		"enum" : «s.enum.join("[\n\t", ",\n\t", "\n]", [quote])»«ENDIF»«
		IF s.items !== null»,
		"items" : «s.items.generate»«ENDIF»«
		IF s.type === JsonType.ARRAY && s.minItems > 0»,
		"minItems" : «s.minItems»«ENDIF»«
		IF s.type === JsonType.ARRAY && s.maxItems >= 0»,
		"maxItems" : «s.maxItems»«ENDIF»
	}'''
	
	static def CharSequence quote(String s) '''
	"«s»"'''
	
	static def CharSequence generate(Reference r) '''
	{
		"$ref" : "«r.uri»"
	}'''
	
	static def AsyncAPI asyncApi(EPackage ePackage) {
		return AsyncApiFactory.eINSTANCE.createAsyncAPI => [
			version = VersionNumber._200
			info = AsyncApiFactory.eINSTANCE.createInfo => [
				title = ePackage.nsPrefix
				version = "1.0.0"
			]
			servers += ePackage.allServers
			channels += ePackage.allChannels
			components = AsyncApiFactory.eINSTANCE.createComponents => [
				messages += ePackage.allMessages
				schemas += ePackage.allSchemas
			]
		]
	}

	static def Iterable<Server> allServers(EPackage ePackage) {
		return #[
			ePackage.servers,
			EcoreUtil2.getAllContentsOfType(ePackage, EPackage).map[servers].flatten
		].flatten
	}

	static def Iterable<Server> servers(EPackage ePackage) {
		return ePackage.EAnnotations.filter[source == EANNOTATION_SERVER].map [
			val details = details
			AsyncApiFactory.eINSTANCE.createServer => [
				name = details.get("name")
				url = details.get("url")
				protocol = Protocol.getByName(details.get("protocol"))
			]
		]
	}

	static def Iterable<Channel> allChannels(EPackage ePackage) {
		return EcoreUtil2.getAllContentsOfType(ePackage, EClass).filter [
			EAnnotations.exists[source == EANNOTATION_CHANNEL]
		].map [
			val eClass = it
			AsyncApiFactory.eINSTANCE.createChannel => [
				name = eClass.channelName
				description = eClass.channelDescription
				if (eClass.channelParameters !== null) {
					parameters += eClass.channelParameters.map[namedParameter]
				}
				if (eClass.channelPublishOp !== null) {
					publish = AsyncApiFactory.eINSTANCE.createOperation => [
						operationId = eClass.channelPublishOp
						message = AsyncApiFactory.eINSTANCE.createReference => [
							uri = "#/components/messages/" + eClass.messageName
						]
					]
				}
				if (eClass.channelSubscribeOp !== null) {
					subscribe = AsyncApiFactory.eINSTANCE.createOperation => [
						operationId = eClass.channelSubscribeOp
						message = AsyncApiFactory.eINSTANCE.createReference => [
							uri = "#/components/messages/" + eClass.messageName
						]
					]
				}
			]
		]
	}

	static def Iterable<NamedMessage> allMessages(EPackage ePackage) {
		return EcoreUtil2.getAllContentsOfType(ePackage, EClass).filter [
			EAnnotations.exists [
				source == EANNOTATION_CHANNEL 
					&& (details.get(EANNOTATION_CHANNEL_PUBLISH) !== null 
						|| details.get(EANNOTATION_CHANNEL_SUBSCRIBE) !== null
					)
			]
		].map [
			val eClass = it
			AsyncApiFactory.eINSTANCE.createNamedMessage => [
				name = eClass.messageName
				message = AsyncApiFactory.eINSTANCE.createReference => [
					uri = "#/components/schemas/" + eClass.schemaName
				]
			]
		]
	}

	static def Iterable<NamedSchema> allSchemas(EPackage ePackage) {
		return EcoreUtil2.getAllContentsOfType(ePackage, EClass).map [
			val eClass = it
			AsyncApiFactory.eINSTANCE.createNamedSchema => [
				name = eClass.schemaName
				schema = AsyncApiFactory.eINSTANCE.createSchema => [
					type = JsonType.OBJECT
					title = eClass.schemaTitle
					properties += eClass.EAllStructuralFeatures.map[schema]
				]
			]
		]
	}

	static def NamedParameter namedParameter(String parameterName) {
		return AsyncApiFactory.eINSTANCE.createNamedParameter => [
			name = parameterName
			parameter = AsyncApiFactory.eINSTANCE.createParameter => [
				schema = AsyncApiFactory.eINSTANCE.createSchema => [
					type = JsonType.STRING
				]
			]
		]
	}
	
	static def NamedSchema schema(EStructuralFeature eStructuralFeature) {
		return AsyncApiFactory.eINSTANCE.createNamedSchema => [
			name = eStructuralFeature.name
			if (!eStructuralFeature.many) {
				schema = eStructuralFeature.EType.schema
			} else {
				schema = AsyncApiFactory.eINSTANCE.createSchema => [
					type = JsonType.ARRAY
					items = eStructuralFeature.EType.schema
					minItems = eStructuralFeature.lowerBound
					maxItems = eStructuralFeature.upperBound
				]
			}
			if (eStructuralFeature.schemaTitle !== null && schema instanceof Schema) {
				(schema as Schema).title = eStructuralFeature.schemaTitle
			}
		]
	}
	
	static def AbstractSchema schema(EClassifier eClassifier) {
		if (eClassifier instanceof EDataType) {
			return eClassifier.schema
		} else if (eClassifier instanceof EClass) {
			return eClassifier.schema
		}
	}
	
	static def Schema schema(EDataType eDataType) {
		AsyncApiFactory.eINSTANCE.createSchema => [
			type = switch (eDataType.name) {
				case "EBigDecimal": JsonType.NUMBER
				case "EBigInteger": JsonType.INTEGER
				case "EBoolean": JsonType.BOOLEAN
				case "EBooleanObject": JsonType.BOOLEAN
				case "EByte": JsonType.INTEGER
				case "EByteArray": JsonType.ARRAY
				case "EChar": JsonType.STRING
				case "ECharObject": JsonType.STRING
				case "EDate": JsonType.STRING
				case "EDouble": JsonType.NUMBER
				case "EDoubleObject": JsonType.NUMBER
				case "EFloat": JsonType.NUMBER
				case "EFloatObject": JsonType.NUMBER
				case "EInt": JsonType.INTEGER
				case "EIntegerObject": JsonType.INTEGER
				case "EJavaClass": JsonType.ANY
				case "EJavaObject": JsonType.ANY
				case "ELong": JsonType.INTEGER
				case "ELongObject": JsonType.INTEGER
				case "EShort": JsonType.INTEGER
				case "EShortObject": JsonType.INTEGER
				case "EString": JsonType.STRING
				default: JsonType.OBJECT
			}
			if (eDataType instanceof EEnum) {
				type = JsonType.STRING
				enum += (eDataType as EEnum).ELiterals.map[name]  
			}
		]
	}

	static def Reference schema(EClass eClass) {
		return AsyncApiFactory.eINSTANCE.createReference => [
			uri = "#/components/schemas/" + eClass.name
		]
	}
	
	static def NamedSchema schema(EReference eReference) {

	}

	static def String channelName(EClass eClass) {
		return EcoreUtil.getAnnotation(eClass, EANNOTATION_CHANNEL, EANNOTATION_CHANNEL_NAME)
	}
	
	static def String channelDescription(EClass eClass) {
		return EcoreUtil.getAnnotation(eClass, EANNOTATION_CHANNEL, EANNOTATION_CHANNEL_DESCRIPTION)
	}
	
	static def List<String> channelParameters(EClass eClass) {
		return EcoreUtil.getAnnotation(eClass, EANNOTATION_CHANNEL, EANNOTATION_CHANNEL_PARAMETERS)?.split(",")?.map[trim]
	}
	
	static def String channelPublishOp(EClass eClass) {
		return EcoreUtil.getAnnotation(eClass, EANNOTATION_CHANNEL, EANNOTATION_CHANNEL_PUBLISH)
	}
	
	static def String channelSubscribeOp(EClass eClass) {
		return EcoreUtil.getAnnotation(eClass, EANNOTATION_CHANNEL, EANNOTATION_CHANNEL_SUBSCRIBE)
	}
	
	static def String messageName(EClass eClass) {
		return EcoreUtil.getAnnotation(eClass, EANNOTATION_MESSAGE, EANNOTATION_MESSAGE_NAME) ?: eClass.name
	}

	static def String schemaName(EClass eClass) {
		return EcoreUtil.getAnnotation(eClass, EANNOTATION_SCHEMA, EANNOTATION_SCHEMA_NAME) ?: eClass.name
	}

	static def String schemaTitle(EClass eClass) {
		return EcoreUtil.getAnnotation(eClass, EANNOTATION_SCHEMA, EANNOTATION_SCHEMA_TITLE)
	}
	
	static def String schemaTitle(EStructuralFeature eStructuralFeature) {
		return EcoreUtil.getAnnotation(eStructuralFeature, EANNOTATION_SCHEMA, EANNOTATION_SCHEMA_TITLE)
	}

	// Utility public methods
	static def String diagnoseEcoreFile(IPath path) {
		val ePackage = path.loadEPackage
		if (ePackage === null) {
			return "Selected file is not a valid Ecore file"
		} else {
			return ePackage.diagnose
		}
	}

	static def String diagnose(EPackage ePackage) {
		val diagnostic = Diagnostician.INSTANCE.validate(ePackage)
		if (diagnostic.severity != Diagnostic.OK) {
			return diagnostic.children.map[message].join(", ")
		} else {
			return null
		}
	}

	static def EPackage loadEPackage(IPath path) {
		try {
			val uri = URI.createPlatformResourceURI(path.toString, true)
			val resourceSet = new ResourceSetImpl()
			val resource = resourceSet.getResource(uri, true)
			if (resource !== null && resource.contents.get(0) instanceof EPackage) {
				return resource.contents.get(0) as EPackage
			}
		} catch (Exception e) {
		}
		return null
	}
	
	static def EPackage loadEPackage(InputStream stream) {
		try {
			val resource = new XMIResourceImpl()
			resource.load(stream, Collections.emptyMap())
			if (resource.contents.get(0) instanceof EPackage) {
				return resource.contents.get(0) as EPackage
			}
		} catch (Exception e) {
		}
		return null
	}
}
