package io.github.abelgomez.asyncapi.generator.target.monitor

import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI
import io.github.abelgomez.asyncapi.generator.infra.IClass
import io.github.abelgomez.asyncapi.generator.target.AbstractType
import java.util.Collections
import java.util.TreeSet

import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*
import static extension java.text.MessageFormat.*

class MonitorClass extends AbstractType implements IClass {

	AsyncAPI api

	static def createFrom(AsyncAPI api) {
		return new MonitorClass(api)
	}

	protected new(AsyncAPI api) {
		this.api = api
	}

	override name() {
		return "Monitor"
	}
	
	override pkg() {
		api.transform.monitoringPackage.fqn
	}
	
	override fqn() {
		pkg + "." + name
	}
	
	override imports() {
		val result = new TreeSet
		result += "java.util.ArrayList"
		result += "java.util.List"
		result += "java.util.logging.Logger"
		result += api.transform.monitoredServerInterface.fqn
		result += api.transform.serverInterface.serverExceptionClass.fqn
		result += api.transform.guaranteeTermsPackage.guaranteeTermInterface.fqn
		if (api.sla !== null) {
			result += api.sla.guaranteeTerms.map[transform.fqn]
		}
		return Collections.unmodifiableNavigableSet(result)
	}
	
	override serialize() '''
		package «pkg»;
		«imports.join(System.lineSeparator, System.lineSeparator, "", [i | "import {0};".format(i)])»
		
		/**
		 * Main class of the Monitor App that will be in charge of checking the 
		 * guarantee terms specified in the SLA of the AsyncAPI specification
		 */
		public class «name» {
			
			private final Logger logger = Logger.getLogger(«name».class.getName());
			
			private final List<«api.transform.guaranteeTermsPackage.guaranteeTermInterface.name»> terms = new ArrayList<>();
		
			/**
			 * Constructor
			 */
			public «name»(«api.transform.monitoredServerInterface.name» server) {
				«IF api?.sla !== null»
				«FOR guaranteeTerm : api?.sla?.guaranteeTerms»
				terms.add(new «guaranteeTerm.transform.name»(server));
				«ENDFOR»
				«ENDIF»
			}
			
			/**
			 * Start the monitoring loop
			 */
			public void start() {
				terms.stream().forEach(t -> {
					try {
						t.start(60, 60);
					} catch («api.transform.serverInterface.serverExceptionClass.name» e) {
						logger.severe("Unable to start monitoring guarantee term " + t.getName());
					}
				});
			}
			
			/**
			 * Stop the monitoring loop
			 */
			public void stop() {
				terms.stream().forEach(t -> {
					try {
						t.stop();
					} catch («api.transform.serverInterface.serverExceptionClass.name» e) {
						logger.severe("Unable to stop monitoring guarantee term " + t.getName());
					}
				});
			}
		}

	'''
}
