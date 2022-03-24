package io.github.abelgomez.asyncapi.generator.target.channels

import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI
import io.github.abelgomez.asyncapi.generator.infra.IType
import io.github.abelgomez.asyncapi.generator.target.AbstractType
import java.util.Collections
import java.util.TreeSet

import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*
import static extension java.text.MessageFormat.*

class OperationInterface extends AbstractType implements IType {

	AsyncAPI api

	static def OperationInterface createFrom(AsyncAPI api) {
		return new OperationInterface(api)
	}

	private new(AsyncAPI api) {
		this.api = api
	}

	override name() {
		return "IOperation"
	}
	
	override pkg() {
		return api.transform.fqn + "." + "infra"
	}
	
	override fqn() {
		return pkg + "." + name
	}
	
	override serialize() '''
		package «pkg»;
		
		/**
		 * Base interface for Operations 
		 */
		public interface «name» {
		}
	'''
}
