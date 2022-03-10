package io.github.abelgomez.asyncapi.generator.target.schemas;

import io.github.abelgomez.asyncapi.asyncApi.Schema
import io.github.abelgomez.asyncapi.generator.infra.IBuilder
import java.util.NavigableSet
import java.util.TreeSet

import static extension io.github.abelgomez.asyncapi.generator.ModelExtensions.*

import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*
import static extension io.github.abelgomez.asyncapi.generator.utils.StringUtils.*

class SchemaArray extends SchemaAbstractType {
	protected SchemaAbstractType items
	
	protected new(Schema schema) {
		super(schema)
	}
	
	override protected initialize() {
		items = schema.nestedItem?.transform 
	}
	
	override fqn() {
		return "java.util.ArrayList"
	}

	override imports() {
		val NavigableSet<String> result = new TreeSet
		result += "java.util.List"
		result += "java.util.ArrayList"
		result += "java.util.Collections"
		result += "com.google.gson.annotations.SerializedName"
		return result
	}

	override asProperty() {
		return new ArrayProperty(schema)
	}

	override serialize() '''
		«IF items !== null»
			«items.serialize»
		«ENDIF»
	'''
	
	static class ArrayProperty extends Property {
		new(Schema schema) {
			super(schema)
		}

		def listType() {
			return schema.items.resolve.transform.name
		}

		override type() {
			return '''List<«listType»>'''
		}

		override declare() '''
			«declareJavadoc»
			@SerializedName("«schema.name»")
			private «type» «name» = new ArrayList<>();
		'''

		override getter() '''
			«getterJavadoc»
			public «type» get«name.asJavaClassName»() {
				return Collections.unmodifiableList(this.«name»);
			}
		'''
		
		override setterJavadoc(IBuilder builder) '''
			/**
			 * Adds a new {@link «listType»} to the {@link «builder.type»#«name»} property 
			 * in the {@link «builder.type»} built by {@link «builder.name»}
			 * 
			 * @param «name»Elt
			 *        A {@link «listType»}
			 * @return A {@link «builder.name»}
			 */
		'''
		
		override setter(IBuilder builder) '''
			«setterJavadoc(builder)»
			public «builder.name» addTo«name.asJavaClassName»(«listType» «name»Elt) {
				this.instance.«name».add(«name»Elt);
				return this;
			}
		'''
	}
	
}
