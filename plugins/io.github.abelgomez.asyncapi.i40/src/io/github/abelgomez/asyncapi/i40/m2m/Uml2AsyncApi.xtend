package io.github.abelgomez.asyncapi.i40.m2m

import io.github.abelgomez.asyncapi.asyncApi.AbstractSchema
import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI
import io.github.abelgomez.asyncapi.asyncApi.AsyncApiFactory
import io.github.abelgomez.asyncapi.asyncApi.Channel
import io.github.abelgomez.asyncapi.asyncApi.JsonType
import io.github.abelgomez.asyncapi.asyncApi.NamedMessage
import io.github.abelgomez.asyncapi.asyncApi.NamedParameter
import io.github.abelgomez.asyncapi.asyncApi.NamedSchema
import io.github.abelgomez.asyncapi.asyncApi.Protocol
import io.github.abelgomez.asyncapi.asyncApi.Reference
import io.github.abelgomez.asyncapi.asyncApi.Schema
import io.github.abelgomez.asyncapi.asyncApi.Server
import io.github.abelgomez.asyncapi.asyncApi.VersionNumber
import io.github.abelgomez.asyncapi.i40.Broker
import io.github.abelgomez.asyncapi.i40.I40Architecture
import io.github.abelgomez.asyncapi.i40.Message
import io.github.abelgomez.asyncapi.i40.Parameter
import io.github.abelgomez.asyncapi.i40.RedefinableProperty
import io.github.abelgomez.asyncapi.i40.Topic
import java.io.InputStream
import java.util.ArrayList
import java.util.Collections
import java.util.List
import java.util.Stack
import org.eclipse.core.runtime.Assert
import org.eclipse.core.runtime.IPath
import org.eclipse.emf.common.util.Diagnostic
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.Diagnostician
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.uml2.common.util.UML2Util
import org.eclipse.uml2.uml.Class
import org.eclipse.uml2.uml.DataType
import org.eclipse.uml2.uml.Enumeration
import org.eclipse.uml2.uml.Model
import org.eclipse.uml2.uml.Property
import org.eclipse.uml2.uml.Signal
import org.eclipse.uml2.uml.StructuredClassifier
import org.eclipse.uml2.uml.Type
import org.eclipse.uml2.uml.UMLPackage
import org.eclipse.xtext.EcoreUtil2

import static extension org.eclipse.uml2.uml.util.UMLUtil.*

class Uml2AsyncApi {
	
	static final String COMPONENTS_URI = "#/components/"
	static final String MESSAGES_URI = COMPONENTS_URI + "messages/"
	static final String SCHEMAS_URI = COMPONENTS_URI + "schemas/"
	
	static def AsyncAPI asyncApi(Model model) {
		val architecture = model.getStereotypeApplication(I40Architecture)
		Assert.isNotNull(architecture, "UML Model must be an I4.0 Architecture")
		return AsyncApiFactory.eINSTANCE.createAsyncAPI => [
					version = VersionNumber._200
					info = AsyncApiFactory.eINSTANCE.createInfo => [
						title = architecture.name
						version = architecture.version
					]
					servers += model.servers
					channels += model.channels
					components = AsyncApiFactory.eINSTANCE.createComponents => [
						messages += model.messages
						schemas += model.schemas
				]
			]
	}
	
	static def Iterable<Server> servers(Model model) {
		return EcoreUtil2.getAllContentsOfType(model, Class)
			.map[ clazz | clazz.getStereotypeApplication(Broker)]
			.filterNull
			.map[ broker |
				AsyncApiFactory.eINSTANCE.createServer => [
					name = broker.name
					url = broker.url
					description = broker.description
					protocol = Protocol.getByName(broker.protocol.getName)
				]
			]
	}

	static def Iterable<Channel> channels(Model model) {
		return EcoreUtil2.getAllContentsOfType(model, Signal)
			.map[ signal | signal.getStereotypeApplication(Topic)]
			.filterNull
			.map[ topic |
				AsyncApiFactory.eINSTANCE.createChannel => [
					name = topic.name
					parameters += topic.parameters.map[parameter]
					publish = if (topic.publishOpId !== null) AsyncApiFactory.eINSTANCE.createOperation => [
						operationId = topic.publishOpId
						message = AsyncApiFactory.eINSTANCE.createReference => [
							uri = MESSAGES_URI + topic.publishes.name
						]
					]
					subscribe = if (topic.subscribeOpId !== null) AsyncApiFactory.eINSTANCE.createOperation => [
						operationId = topic.subscribeOpId
						message = AsyncApiFactory.eINSTANCE.createReference => [
							uri = MESSAGES_URI + topic.subscribes.name
						]
					]
				]
			]
	}
	
	static def NamedParameter parameter(Parameter parameter) {
		return AsyncApiFactory.eINSTANCE.createNamedParameter => [
			name = parameter.name
			parameter = AsyncApiFactory.eINSTANCE.createParameter => [
				schema = AsyncApiFactory.eINSTANCE.createSchema => [
					type = JsonType.getByName(parameter.name.toLowerCase)
					description = parameter.description
				]
			]
		]
	}

	static def Iterable<NamedMessage> messages(Model model) {
		return EcoreUtil2.getAllContentsOfType(model, StructuredClassifier)
			.map[ structuredClassifier | structuredClassifier.getStereotypeApplication(Message) ]
			.filterNull
			.map[ msg |
				AsyncApiFactory.eINSTANCE.createNamedMessage => [
					name = msg.name
					message = AsyncApiFactory.eINSTANCE.createMessage => [
						name = msg.name
						payload = AsyncApiFactory.eINSTANCE.createReference => [
							uri = SCHEMAS_URI + msg.base_StructuredClassifier.name
						]
					]
				]
			]
	}

	static def Iterable<NamedSchema> schemas(Model model) {
		var Stack<StructuredClassifier> candidates = new Stack
		var List<StructuredClassifier> classifiers = new ArrayList

		candidates += EcoreUtil2.getAllContentsOfType(model, StructuredClassifier)
			.filter[ structuredClassifier | structuredClassifier.getStereotypeApplication(Message) !== null ]
		
		while (!candidates.isEmpty) {
			val classifier = candidates.pop
			classifiers += classifier
			candidates += classifier.attributes.map[ attribute | attribute.type ].filter(StructuredClassifier)
		}
			
		return classifiers.map[ structuredClassifier |
				AsyncApiFactory.eINSTANCE.createNamedSchema => [
					name = structuredClassifier.name
					schema = AsyncApiFactory.eINSTANCE.createSchema => [
						type = JsonType.OBJECT
						properties += structuredClassifier.attributes.map[schema]
					]
				]
			]
	}
	
	static def NamedSchema schema(Property property) {
		return AsyncApiFactory.eINSTANCE.createNamedSchema => [
			name = if (property.getStereotypeApplication(RedefinableProperty) !== null) property.getStereotypeApplication(RedefinableProperty).title else property.name
			if (!property.multivalued) {
				schema = property.type.schema
			} else {
				schema = AsyncApiFactory.eINSTANCE.createSchema => [
					type = JsonType.ARRAY
					items = property.type.schema
					minItems = property.lowerBound
					maxItems = property.upperBound
				]
			}
		]
	}
	
	static def AbstractSchema schema(Type type) {
		if (type instanceof DataType) {
			return type.schema
		} else if (type instanceof Class) {
			return type.schema
		}
	}
	
	static def Schema schema(DataType dataType) {
		AsyncApiFactory.eINSTANCE.createSchema => [
			type = switch (dataType.name) {
				case "Boolean": JsonType.BOOLEAN
				case "Integer": JsonType.INTEGER
				case "Real": JsonType.NUMBER
				case "Number": JsonType.NUMBER
				case "String": JsonType.STRING
				case "UnlimitedNatural": JsonType.INTEGER
				default: JsonType.STRING
			}
			if (dataType instanceof Enumeration) {
				type = JsonType.STRING
				enum += dataType.ownedLiterals.map[name]  
			}
		]
	}

	static def Reference schema(Class clazz) {
		return AsyncApiFactory.eINSTANCE.createReference => [
			uri = "#/components/schemas/" + clazz.name
		]
	}
	
	static def String diagnoseUmlFile(IPath path) {
		val model = path.loadModel
		if (model === null) {
			return "Selected file is not a valid UML model"
		} else {
			return model.diagnose
		}
	}

	static def String diagnose(Model model) {
		if (model.getStereotypeApplication(I40Architecture) === null) {
			return "Selected file is not a valid I4.0 Architecture UML model"
		} 
		val diagnostic = Diagnostician.INSTANCE.validate(model)
		if (diagnostic.severity != Diagnostic.OK) {
			return diagnostic.children.map[message].join(", ")
		} else {
			return null
		}
	}

	static def Model loadModel(IPath path) {
		val uri = URI.createPlatformResourceURI(path.toString, true)
		val resourceSet = new ResourceSetImpl()
		val Model model = UML2Util.load(resourceSet, uri, UMLPackage.eINSTANCE.getModel)
		Assert.isNotNull(model, "Unable to find a UML Model")
		Assert.isNotNull(model.getStereotypeApplication(I40Architecture), "UML Model must be an I4.0 Architecture")
		return model
	}
	
	static def Model loadModel(InputStream stream) {
		val resourceSet = new ResourceSetImpl()
		resourceSet.resourceFactoryRegistry.protocolToFactoryMap.put("in-memory", new XMIResourceFactoryImpl)
		val resource = resourceSet.createResource(URI.createURI("in-memory:model"))
		resource.load(stream, Collections.emptyMap())
		val model = EcoreUtil.getObjectByType(resource.contents, UMLPackage.eINSTANCE.getModel) as Model
		Assert.isNotNull(model, "Unable to find a UML Model")
		Assert.isNotNull(model.getStereotypeApplication(I40Architecture), "UML Model must be an I4.0 Architecture")
		return model
	}
}