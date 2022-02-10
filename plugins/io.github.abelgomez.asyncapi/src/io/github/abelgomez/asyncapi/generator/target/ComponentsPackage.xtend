package io.github.abelgomez.asyncapi.generator.target

import io.github.abelgomez.asyncapi.asyncApi.Components
import io.github.abelgomez.asyncapi.generator.target.messages.MessageClass
import io.github.abelgomez.asyncapi.generator.target.schemas.SchemaAbstractType
import io.github.abelgomez.asyncapi.generator.utils.Assertions
import java.util.ArrayList
import java.util.List
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

import static extension io.github.abelgomez.asyncapi.generator.ModelExtensions.*
import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*

class ComponentsPackage extends AbstractPackage {
		
	Components components
	List<MessageClass> messageClasses = new ArrayList
	List<SchemaAbstractType> schemasClasses = new ArrayList
	
	static def createFrom(Components components) {
		return new ComponentsPackage(components)
	}
	
	private new(Components components) {
		this.components = components
		initialize()
	}
	
	def initialize() {
		messageClasses.addAll(components?.nestedMessages.map[nm | nm.transform])
		schemasClasses.addAll(components?.nestedSchemas.map[ns | ns.transform])
		Assertions.assertTrue(!components?.nestedParameters.exists[p | !p.schema.resolve.isBasicType], "Parameters of non-primitive types are not supported")
	}

	override name() {
		return "components"
	}
	
	override fqn() {
		return components.api.transform.fqn + "." + name
	}
	
	override saveContents(IFileSystemAccess2 fsa, IGeneratorContext context) {
		schemasClasses.forEach[s | s?.generate(fsa)]
		messageClasses.forEach[m | m?.generate(fsa)]
	}
}