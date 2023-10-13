package io.github.abelgomez.asyncapi.generator.target.monitor.instruments

import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI
import io.github.abelgomez.asyncapi.generator.infra.IClass
import io.github.abelgomez.asyncapi.generator.target.AbstractType
import java.util.Collections
import java.util.TreeSet

import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*
import static extension java.text.MessageFormat.*

class PeriodMeasurementInstrumentClass extends AbstractType implements IClass {

	AsyncAPI api

	static def createFrom(AsyncAPI api) {
		return new PeriodMeasurementInstrumentClass(api)
	}

	protected new(AsyncAPI api) {
		this.api = api
	}

	override name() {
		return "PeriodMeasurementInstrument"
	}
	
	override pkg() {
		api.transform.instrumentsPackage.fqn
	}
	
	override fqn() {
		pkg + "." + name
	}
		
	override imports() {
		val result = new TreeSet
		result += "java.util.logging.Logger"
		result += "java.text.MessageFormat"
		result += "java.time.Instant"
		result += "java.time.Duration"
		result += "java.util.Optional"
		result += "java.math.BigDecimal"
		result += qosMetricInterface.fqn
		result += subscribeOperationInterface.fqn
		result += monitoredServerInterface.fqn
		result += serverInterface.serverExceptionClass.fqn
		return Collections.unmodifiableNavigableSet(result)
	}
		
	def subscribeOperationInterface() {
		return api.transform.operationInterface.subscribeOperationInterface
	}
	
	def measurementInstrumentAbstractClass() {
		return api.transform.instrumentsPackage.measurementInstrumentAbstractClass
	}
	
	def qosMetricInterface() {
		return api.transform.metricsPackage.qoSMetricInterface
	}
	
	def serverInterface() {
		return api.transform.serverInterface
	}
	
	def monitoredServerInterface() {
		return api.transform.monitoredServerInterface
	}
	
	override serialize() '''
		package «pkg»;
		
		«imports.join(System.lineSeparator, [i | "import {0};".format(i)])»
		
		/**
		 * Measurement instrument for periods
		 */
		class «name» extends «measurementInstrumentAbstractClass.name» {

			private Logger logger = Logger.getLogger(«name».class.getName());

			private Optional<String> lastMessageId;
			private BigDecimal period;
		
			/**
			 * Constructor
			 */
			protected «name»(«monitoredServerInterface.name» server, «subscribeOperationInterface.name» subscribeOperation, «qosMetricInterface.name» metric) {
				super(server, subscribeOperation, metric);
				if (metric.getGroupedByEvent()) {
					logger.warning("The '«name»' does not support the 'groupedByEvent' option. Ignoring it.");
				}
				try {
					subscribeOperation.subscribe(server, subscribeOperation.newConfiguration(), (msg, params) -> {
						if (msg.getIdentifier().isEmpty() || !msg.getIdentifier().equals(lastMessageId)) {  
							Instant now = Instant.now();
							Duration duration = Duration.between(lastUpdated, now);
							switch (metric.getUnit()) {
								case MILLISECONDS:
									period = new BigDecimal(duration.abs().toMillis());
									break;
								case SECONDS:
									period = new BigDecimal(duration.abs().toSeconds());
									break;
								case MINUTES:
									period = new BigDecimal(duration.abs().toMinutes());
									break;
								case HOURS:
									period = new BigDecimal(duration.abs().toHours());
									break;
								default:
									logger.warning(MessageFormat.format("Unexpected unit time: ''{0}''", metric.getUnit().toString()));
							}
							logger.fine(MessageFormat.format("New ''period'' value in channel ''{0}'' is ''{1}'' ''{2}''", 
									subscribeOperation.newConfiguration().getChannel().getName(), duration, metric.getUnit().toString().toLowerCase()));
							lastUpdated = now;
							notifyObservers();
						}
						lastMessageId = msg.getIdentifier();
					});
				} catch (ServerException e) {
					logger.severe(MessageFormat.format("Unable to subscribe to ''{0}''", subscribeOperation.newConfiguration().getSubscriptionPattern()));
				}
			}
		
			@Override
			public Optional<BigDecimal> getValue() {
				return Optional.ofNullable(period);
			}
		}
	'''
}
