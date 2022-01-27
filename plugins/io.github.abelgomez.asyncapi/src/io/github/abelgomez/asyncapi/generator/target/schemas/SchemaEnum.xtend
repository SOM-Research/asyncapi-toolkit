package io.github.abelgomez.asyncapi.generator.target.schemas;

import io.github.abelgomez.asyncapi.asyncApi.Schema

import static extension io.github.abelgomez.asyncapi.generator.utils.StringUtils.*

class SchemaEnum extends SchemaAbstractType {
	protected new(Schema schema) {
		super(schema)
	}
	
	override serialize() '''
		«javadoc»
		public enum «name» {
			«schema.enum.join("," + System.lineSeparator, [e | e.replace("\"","").asJavaConstantName])»
		}
	'''
}
