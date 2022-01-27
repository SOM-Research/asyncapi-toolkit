package io.github.abelgomez.asyncapi.generator.target.schemas;

import io.github.abelgomez.asyncapi.asyncApi.Schema

import static extension io.github.abelgomez.asyncapi.generator.utils.StringUtils.*

class SchemaPrimitiveType extends SchemaAbstractType {
	protected new(Schema schema) {
		super(schema)
	}
	
	override name() {
		return schema.type.getName.asJavaClassName
	}
	
	override pkg() {
		return "java.lang"
	}
	
	
	override fqn() {
		return pkg + "." + name
	}
	
	override serialize() {
		// Classes of primitive types are not serialized since they are part of the language
		return ""
	}
}
