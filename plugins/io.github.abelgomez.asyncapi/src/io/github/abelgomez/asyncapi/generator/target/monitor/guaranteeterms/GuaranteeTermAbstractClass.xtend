package io.github.abelgomez.asyncapi.generator.target.monitor.guaranteeterms

import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI
import io.github.abelgomez.asyncapi.generator.infra.IType
import io.github.abelgomez.asyncapi.generator.target.AbstractType
import java.util.Collections
import java.util.TreeSet

import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*
import static extension java.text.MessageFormat.*

class GuaranteeTermAbstractClass extends AbstractType implements IType {

	AsyncAPI api

	static def GuaranteeTermAbstractClass createFrom(AsyncAPI api) {
		return new GuaranteeTermAbstractClass(api)
	}

	private new(AsyncAPI api) {
		this.api = api
	}

	override name() {
		return "AbstractGuaranteeTerm"
	}
	
	override pkg() {
		api.transform.guaranteeTermsPackage.fqn
	}
	
	override fqn() {
		pkg + "." + name
	}
	
	override imports() {
		val result = new TreeSet
		result += api.transform.monitoredServerInterface.fqn
		return Collections.unmodifiableNavigableSet(result)
	}
	
	def guaranteeTermInterface() {
		api.transform.guaranteeTermsPackage.guaranteeTermInterface
	}
	
	override serialize() '''
		package «pkg»;
		«imports.join(System.lineSeparator, System.lineSeparator, "", [i | "import {0};".format(i)])»
		
		/**
		 * Base class for {@link «guaranteeTermInterface.name»}
		 */
		abstract class «name» implements «guaranteeTermInterface.name» {
			
			protected IMonitoredServer server;
			
			protected «name»(IMonitoredServer server) {
				this.server = server;
			}

		}
	'''
}
