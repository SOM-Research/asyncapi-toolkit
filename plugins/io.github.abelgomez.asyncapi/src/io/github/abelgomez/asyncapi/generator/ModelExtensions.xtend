package io.github.abelgomez.asyncapi.generator

import io.github.abelgomez.asyncapi.asyncApi.AbstractMessage
import io.github.abelgomez.asyncapi.asyncApi.AbstractSchema
import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI
import io.github.abelgomez.asyncapi.asyncApi.Channel
import io.github.abelgomez.asyncapi.asyncApi.Components
import io.github.abelgomez.asyncapi.asyncApi.JsonType
import io.github.abelgomez.asyncapi.asyncApi.Message
import io.github.abelgomez.asyncapi.asyncApi.NamedMessage
import io.github.abelgomez.asyncapi.asyncApi.NamedParameter
import io.github.abelgomez.asyncapi.asyncApi.NamedSchema
import io.github.abelgomez.asyncapi.asyncApi.Operation
import io.github.abelgomez.asyncapi.asyncApi.Parameter
import io.github.abelgomez.asyncapi.asyncApi.Reference
import io.github.abelgomez.asyncapi.asyncApi.Schema
import io.github.abelgomez.asyncapi.asyncApi.Server
import io.github.abelgomez.asyncapi.asyncApi.Variable
import io.github.abelgomez.asyncapi.generator.infra.ITargetElement
import io.github.abelgomez.asyncapi.generator.utils.Assertions
import java.util.List
import java.util.Stack
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2

import static extension java.text.MessageFormat.*
import io.github.abelgomez.asyncapi.asyncApi.AbstractParameter

class ModelExtensions {
	
	public static val TOPIC_HIERARCHY_SEPARATOR = "/";

	static def String dir(ITargetElement elt) {
		return elt.pkg.replace(".", "/");
	}

	static def String expandUrl(Server server) {
		var result = server.url;
		for (Variable v : server.variables) {
			result = result.replaceAll("\\{" + v.name + "\\}", v.^default);
		}
		return result;
	}
	
	static def AsyncAPI api(EObject eObject) {
		val api = EcoreUtil2.getContainerOfType(eObject, AsyncAPI);
		Assertions.assertTrue(api !== null, "Unable to find AsyncAPI EObject for model EObject ''{0}''".format(eObject));
		return api;
	}
	
	static def Channel channel(Operation operation) {
		return operation.eContainer as Channel
	}
	
	static def isRef(AbstractParameter abstractParameter) {
		return abstractParameter instanceof Reference
	}
	
	static def isParameter(AbstractParameter abstractParameter) {
		return abstractParameter instanceof Parameter
	}
	
	static def isRef(AbstractSchema abstractSchema) {
		return abstractSchema instanceof Reference
	}
	
	static def isSchema(AbstractSchema abstractSchema) {
		return abstractSchema instanceof Schema
	}
	
	static def isRef(AbstractMessage abstractMessage) {
		return abstractMessage instanceof Reference
	}
	
	static def isMessage(AbstractMessage abstractMessage) {
		return abstractMessage instanceof Message
	}
	
	static def isPublish(Operation o) {
		return (o.eContainer as Channel)?.publish == o	
	}

	static def isSubscribe(Operation o) {
		return (o.eContainer as Channel)?.subscribe == o
	}
	
	static def Parameter resolve(NamedParameter nm) {
		nm.parameter.resolve
	}
	
	// TODO: make private again to check usages of this method
	static def Parameter resolve(AbstractParameter p) {
		return switch p {
			Parameter:
				p
			Reference:
				p.resolve(NamedParameter).parameter.resolve
			default:
				Assertions.fail("Unexpected abstract parameter: ''{0}''".format(p))
		}
	}
	
	static def Schema resolve(NamedSchema ns) {
		ns.schema.resolve
	}
	
	// TODO: make private again to check usages of this method
	static def Schema resolve(AbstractSchema s) {
		return switch s {
			Schema:
				s
			Reference:
				s.resolve(NamedSchema).schema.resolve
			default:
				Assertions.fail("Unexpected abstract schema: ''{0}''".format(s))
		}
	}
		
	static def Message resolve(NamedMessage nm) {
		nm.message.resolve
	}
	
	// TODO: make private again to check usages of this method
	static def Message resolve(AbstractMessage m) {
		return switch m {
			Message:
				m
			Reference:
				m.resolve(NamedMessage).message.resolve
			default:
				Assertions.fail("Unexpected abstract message: ''{0}''".format(m))
		}
	}
	
	static def name(Message m) {
		val eContainer = m.eContainer
		return m.name ?: switch (eContainer) {
			NamedMessage: eContainer.name
			default: m?.eContainmentFeature?.name
		}
	}
	
	static def name(Schema s) {
		val eContainer = s.eContainer
		return switch (eContainer) {
			NamedSchema: eContainer.name
			Parameter: (eContainer.eContainer as NamedParameter).name
			//Message: eContainer.eContainmentFeature.name
			default: s?.eContainmentFeature?.name
		}
	}
	
	static def String wildcardify(Channel channel) {
		var result = channel.name;
		for (NamedParameter p : channel.parameters) {
			result = result.replaceAll("[^/]*\\{" + p.name + "\\}[^/]*", "+");
		}
		return result;
	}
	
	static def friendlyName(Schema s) {
		return s.title ?: s.name
	}
	
	static def nestedMessage(Operation o) {
		return if (o.message.isMessage) o.message as Message
	}

	static def nestedParameters(Components c) {
		return c.parameters.filter[np | np.parameter.isParameter].map[np | np.parameter as Parameter]
	}

	static def nestedMessages(Components c) {
		return c.messages.filter[nm | nm.message.isMessage].map[nm | nm.message as Message]
	}

	static def nestedSchemas(Components c) {
		return c.schemas.filter[ns | ns.schema.isSchema].map[ns | ns.schema as Schema].filter[s | s.isObjectType || s.isEnumType]
	}

	static def nestedPayload(Message m) {
		return if (m.payload.isSchema) m.payload as Schema
	}
	
	static def nestedHeaders(Message m) {
		return if (m.headers.isSchema) m.headers as Schema
	}
	
	static def nestedSchemas(Schema s) {
		return s.properties.filter[ns | ns.schema.isSchema].map[ns | ns.schema as Schema]
	}

	static def nestedItem(Schema s) {
		return if (s.items.isSchema) s.items as Schema
	}
	
	static def isReusable(Message m) {
		return m?.eContainer instanceof NamedMessage && m?.eContainer?.eContainer instanceof Components  
	}
	
	static def isReusable(Schema s) {
		return s?.eContainer instanceof NamedSchema && s?.eContainer?.eContainer instanceof Components  
	}
	
	static def isObjectType(Schema s) {
		return s.type == JsonType.OBJECT || !s.properties.empty
	}
	
	static def isEnumType(Schema s) {
		return !s.enum.empty
	}
	
	static def isBasicType(Schema s) {
		return s.isString || s.isNumber || s.isInteger || s.isBoolean || s.isNull || s.isAny || s.isArray;
	}

	static def isString(Schema s) {
		return s.type == JsonType.STRING;
	}
	
	static def isNumber(Schema s) {
		return s.type == JsonType.NUMBER
	}
	
	static def isInteger(Schema s) {
		return s.type == JsonType.INTEGER;
	}
	
	static def isBoolean(Schema s) {
		return s.type == JsonType.BOOLEAN
	}
	
	static def isNull(Schema s) {
		return s.type == JsonType.NULL
	}
	
	static def isAny(Schema s) {
		return s.type == JsonType.ANY
	}
	
	static def isArray(Schema s) {
		return s.type == JsonType.ARRAY
	}

	static def <T> T resolve(Reference r, Class<T> type) {
		
		var stack = new Stack()
		stack.addAll(r.uri.split("/").reverse)
		Assertions.assertTrue(stack.pop == "#", "Only relative references allowed: ''{0}''".format(r.uri))

		var elt = EcoreUtil2.getRootContainer(r)
		Assertions.assertTrue(elt instanceof AsyncAPI, "Root EObject is expected to be an instance of AsyncAPI, but found ''{0}''".format(elt))
		
		while (!stack.isEmpty) {
			val eClass = elt.eClass
			val featureName = stack.pop
			var featureValue = elt.eGet(eClass.EAllReferences.findFirst[ref | ref.name == featureName])
			switch featureValue {
				EObject:
					elt = featureValue
				List<EObject>: {
					val eltName = stack.pop
					elt = featureValue.findFirst [ eo |eo.eGet(eo.eClass.EAllAttributes.findFirst[at|at.name == "name"]) == eltName]
				}
				default:
					Assertions.fail("Unexpected feature value: ''{0}''".format(featureValue))
			}
		}
		Assertions.assertTrue(elt !== null, "Unable to resolve Reference: ''{0}''".format(r));
		return type.cast(elt);
	}

}
