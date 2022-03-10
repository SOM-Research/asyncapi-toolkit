package io.github.abelgomez.asyncapi.generator.target.json

import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI
import io.github.abelgomez.asyncapi.generator.infra.IType
import io.github.abelgomez.asyncapi.generator.target.AbstractType
import java.util.Collections
import java.util.TreeSet

import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*
import static extension java.text.MessageFormat.*

class JsonSerializableInterface extends AbstractType implements IType {

	AsyncAPI api

	static def JsonSerializableInterface createFrom(AsyncAPI api) {
		return new JsonSerializableInterface(api)
	}

	private new(AsyncAPI api) {
		this.api = api
	}

	override name() {
		return "IJsonSerializable"
	}
	
	override pkg() {
		api.transform.fqn + "." + "infra"
	}
	
	override fqn() {
		pkg + "." + name
	}
	
	override imports() {
		val result = new TreeSet		
		result.add("com.google.gson.Gson")
		result.add("com.google.gson.GsonBuilder")
		return Collections.unmodifiableNavigableSet(result)
	}
	
	override serialize() '''
		package «pkg»;
		
		«imports.join(System.lineSeparator, [i | "import {0};".format(i)])»
				
		/**
		 * Base interface for classes serializable as JSON 
		 */
		public interface «name» {
			/**
			 * Serialize this instance of {@link «name»} as a JSON {@link String}
			 * 
			 * @return A JSON {@link String}
			 */
			public default String toJson() {
				return toJson(false);
			}
			
			/**
			 * Serialize this instance of {@link «name»} as a JSON {@link String}.
			 * If <code>pretty</code> is true, the JSON {@link String} will be properly 
			 * indented to be more readable.
			 *
			 * @param pretty
			 *        Whether the JSON {@link String} should be pretty printed
			 * @return A JSON {@link String}
			 */
			public default String toJson(boolean pretty) {
				Gson gson = pretty ? new GsonBuilder().setPrettyPrinting().create() : new Gson();
				return gson.toJson(this);
			}
		}
	'''
}
