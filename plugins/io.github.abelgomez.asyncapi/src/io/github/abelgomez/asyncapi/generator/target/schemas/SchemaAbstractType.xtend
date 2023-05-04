package io.github.abelgomez.asyncapi.generator.target.schemas

import io.github.abelgomez.asyncapi.asyncApi.Components
import io.github.abelgomez.asyncapi.asyncApi.Message
import io.github.abelgomez.asyncapi.asyncApi.NamedSchema
import io.github.abelgomez.asyncapi.asyncApi.Operation
import io.github.abelgomez.asyncapi.asyncApi.Schema
import io.github.abelgomez.asyncapi.generator.infra.IBuilder
import io.github.abelgomez.asyncapi.generator.infra.IInstantiableType
import io.github.abelgomez.asyncapi.generator.infra.IProperty
import io.github.abelgomez.asyncapi.generator.target.AbstractType
import io.github.abelgomez.asyncapi.generator.utils.Assertions
import java.util.ArrayList
import java.util.List

import static extension io.github.abelgomez.asyncapi.generator.ModelExtensions.*
import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*
import static extension io.github.abelgomez.asyncapi.generator.utils.StringUtils.*
import static extension java.text.MessageFormat.*

abstract class SchemaAbstractType extends AbstractType implements IInstantiableType {
	
	static class Property implements IProperty {
		protected Schema schema

		new(Schema schema) {
			this.schema = schema
		}

		override name() {
			return schema.friendlyName.asJavaIdentifier
		}

		override type() {
			return schema.transform.name
		}

		def declareJavadoc() '''
			«schema.transform.javadoc»
		''' 

		override declare() '''
			«declareJavadoc»
			@SerializedName("«schema.name»")
			private «type» «name»;
		'''

		override declareAs(String asName) '''
			«declareJavadoc»
			@SerializedName("«asName»")
			private «type» «name»;
		'''

		def getterJavadoc() '''
			/**
			 * Returns the <code>«name»</code> property
			 * 
			 * @return A {@link «type»}
			 */
		'''
		
		override getter() '''
			«getterJavadoc»
			public «type» get«name.asJavaClassName»() {
				return this.«name»;
			}
		'''

		def setterJavadoc(IBuilder builder) '''
			/**
			 * Sets the {@link «builder.type»#«name»} property in the {@link «builder.type»} built by 
			 * {@link «builder.name»}
			 * 
			 * @param «name»
			 *        A {@link «type»}
			 * @return A {@link «builder.name»}
			 */
		'''
		
		override setter(IBuilder builder) '''
			«setterJavadoc(builder)»
			public «builder.name» with«name.asJavaClassName»(«type» «name») {
				this.instance.«name» = «name»;
				return this;
			}
		'''
	}
	
	static class SchemaBuilder implements IBuilder {
		protected Schema schema

		new(Schema schema) {
			this.schema = schema
		}

		override pkg() {
			return schema.transform.pkg
		}

		override name() { 
			return schema.transform.name + "Builder"
		}
		
		override fqn() {
			return schema.transform.fqn + "." + name
		}

		override type() { 
			return schema.transform.name
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
				
				«schema.transform.referencedClasses.join(System.lineSeparator, [rc | rc.asProperty.setter(schema.transform.asBuilder)])»
				
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
	
	protected Schema schema
	protected List<SchemaAbstractType> nestedClasses = new ArrayList
	protected List<SchemaAbstractType> referencedClasses = new ArrayList
	protected List<SchemaAbstractType> referencedCompontentsClasses = new ArrayList
	
	static def SchemaAbstractType createFrom(Schema schema) {
		if (schema.isObjectType) {
			new SchemaClass(schema)
		} else if (schema.isEnumType) { 
			new SchemaEnum(schema) 
		} else if (schema.isArray) { 
			new SchemaArray(schema) 
		} else if (schema.isBasicType) {
			new SchemaPrimitiveType(schema) 
		} else {
			Assertions.fail("Can't handle Schema of type {0}".format(schema))
		}
	}
	
	protected new(Schema schema) {
		this.schema = schema
		initialize()
	}
	
	protected def void initialize() {
		if (schema.nestedItem !== null) nestedClasses.add(schema.nestedItem?.transform)
		nestedClasses.addAll(schema.nestedSchemas.filter[s | s.isObjectType || s.isEnumType || s.isArray].map[s|s.transform])
		referencedClasses.addAll(schema.properties.map[ns|ns.resolve.transform])
		referencedCompontentsClasses.addAll(schema.properties.filter[ns | ns.schema.isRef].map[ns|ns.resolve.transform])
	}
	
	override name() {
		return schema.name.asJavaClassName
	}
	
	override pkg() {
		var eContainer = schema.eContainer
		return switch (eContainer) {
			Operation: eContainer.transform.pkg
			Message: eContainer.transform.pkg
			NamedSchema: {
				eContainer = eContainer.eContainer
				switch (eContainer) {
					Components: eContainer.transform.fqn + ".schemas"
					Schema: eContainer.transform.pkg
					default: Assertions.fail("Can't determine package of container for Schema {0}".format(schema))
				}
			}
			default: Assertions.fail("Can't determine package of container for Schema {0}".format(schema))
		}
	}
	
	override fqn() {
		var eContainer = schema.eContainer
		return switch (eContainer) {
			Operation: pkg // TODO: Check if this is finally like this (or on the contrary, operations are defined inside the Channel)
			Message: eContainer.transform.fqn
			NamedSchema: {
				eContainer = eContainer.eContainer
				switch (eContainer) {
					Components: pkg
					Schema: eContainer.transform.fqn
					default: Assertions.fail("Can't determine fqn of container for Schema {0}".format(schema))
				}
			}
			default: Assertions.fail("Can't determine fqn of container for Schema {0}".format(schema))
		} + "." + name
	}
	
	override asProperty() {
		return new Property(schema);
	}

	override asBuilder() {
		return new SchemaBuilder(schema);
	}

	protected def javadoc() '''
		/**
		 «IF schema.title !== null»
		 * «schema.title»
		 *
		 «ENDIF»
		 * «schema.description ?: "<No description provided>"»
		 */
	'''
}









