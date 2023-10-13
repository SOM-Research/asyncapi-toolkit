package io.github.abelgomez.asyncapi.generator.target.servers

import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI
import io.github.abelgomez.asyncapi.generator.infra.IClass
import io.github.abelgomez.asyncapi.generator.target.AbstractType
import java.util.Collections
import java.util.TreeSet

import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*
import static extension java.text.MessageFormat.*

class MonitoredServerInterface extends AbstractType implements IClass {

	AsyncAPI api

	static def MonitoredServerInterface createFrom(AsyncAPI api) {
		return new MonitoredServerInterface(api)
	}

	private new(AsyncAPI api) {
		this.api = api
	}

	override name() {
		return "IMonitoredServer"
	}
	
	override pkg() {
		api.transform.fqn + "." + "infra"
	}
	
	override fqn() {
		pkg + "." + name
	}
	
	override imports() {
		val result = new TreeSet		
		return Collections.unmodifiableNavigableSet(result)
	}
	
	override serialize() '''
		package «pkg»;
		
		«imports.join(System.lineSeparator, [i | "import {0};".format(i)])»
		
		/**
		 * Base interface for asynchronous servers that can be monitored
		 */
		public interface «name» extends «api.transform.serverInterface.name» {
			
			/**
			 * Returns the {@link «api.transform.serverInterface.name»} where monitoring messages
			 * affecting this {@link «api.transform.serverInterface.name»} must be published 
			 */
			«api.transform.serverInterface.name» getMonitoringServer();
		}
	'''
}
