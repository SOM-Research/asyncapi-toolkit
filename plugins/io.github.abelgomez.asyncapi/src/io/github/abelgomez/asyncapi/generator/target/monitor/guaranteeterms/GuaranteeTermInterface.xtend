package io.github.abelgomez.asyncapi.generator.target.monitor.guaranteeterms

import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI
import io.github.abelgomez.asyncapi.generator.infra.IType
import io.github.abelgomez.asyncapi.generator.target.AbstractType
import java.util.Collections
import java.util.TreeSet

import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*
import static extension java.text.MessageFormat.*

class GuaranteeTermInterface extends AbstractType implements IType {

	AsyncAPI api

	static def GuaranteeTermInterface createFrom(AsyncAPI api) {
		return new GuaranteeTermInterface(api)
	}

	private new(AsyncAPI api) {
		this.api = api
	}

	override name() {
		return "IGuaranteeTerm"
	}
	
	override pkg() {
		api.transform.guaranteeTermsPackage.fqn
	}
	
	override fqn() {
		pkg + "." + name
	}
	
	override imports() {
		val result = new TreeSet
		result += api.transform.serverInterface.serverExceptionClass.fqn
		result += api.transform.expressionsPackage.measurementBooleanExpressionInterface.measurementExpressionObserverInterface.fqn
		return Collections.unmodifiableNavigableSet(result)
	}
	
	override serialize() '''
		package «pkg»;
		«imports.join(System.lineSeparator, System.lineSeparator, "", [i | "import {0};".format(i)])»
		
		/**
		 * Base interface for guarantee terms
		 */
		public interface «name» extends «api.transform.expressionsPackage.measurementBooleanExpressionInterface.measurementExpressionObserverInterface.name» {
			
			/**
			 * Returns a friendly name for this {@link «name»}
			 */
			String getName();
		
			/**
			 * Starts the monitoring of this {@link «name»}. Every number of <code>period</code>
			 * seconds, all the SLOs will be checked. All SLOs whose last update are older
			 * than <code>timeout</code> will be logged.
			 * 
			 * @param period the number of seconds between checks of this
			 *               {@link «name»}
			 * @param 
			 * @throws «api.transform.serverInterface.serverExceptionClass.name»
			 */
			void start(int period, int timeout) throws ServerException;
		
			/**
			 * Stops the monitoring of this {@link «name»}
			 * 
			 * @throws «api.transform.serverInterface.serverExceptionClass.name»
			 */
			void stop() throws «api.transform.serverInterface.serverExceptionClass.name»;
			
		}
	'''
}
