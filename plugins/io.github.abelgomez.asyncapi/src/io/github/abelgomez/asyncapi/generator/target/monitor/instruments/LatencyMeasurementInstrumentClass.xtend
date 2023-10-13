package io.github.abelgomez.asyncapi.generator.target.monitor.instruments

import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI
import io.github.abelgomez.asyncapi.generator.AsyncApiGeneratorDelegate
import io.github.abelgomez.asyncapi.generator.infra.IClass
import io.github.abelgomez.asyncapi.generator.target.AbstractType
import java.util.Collections
import java.util.TreeSet

import static extension io.github.abelgomez.asyncapi.generator.ModelExtensions.*
import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*
import static extension java.text.MessageFormat.*

class LatencyMeasurementInstrumentClass extends AbstractType implements IClass {

	AsyncAPI api

	static def createFrom(AsyncAPI api) {
		return new LatencyMeasurementInstrumentClass(api)
	}

	protected new(AsyncAPI api) {
		this.api = api
	}

	override name() {
		return "LatencyMeasurementInstrument"
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
		result += "java.util.Iterator"
		result += "java.util.LinkedHashMap"
		result += "java.math.BigDecimal"
		result += qosMetricInterface.fqn
		result += subscribeOperationInterface.fqn
		result += serverInterface.fqn
		result += monitoredServerInterface.fqn
		result += serverInterface.serverExceptionClass.fqn
		result += monitoringEventChannelClass.fqn
		result += monitoringEventPayloadClass.fqn
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
	
	protected def monitoringEventChannelClass() {
		return api.channels.findFirst[getName() == AsyncApiGeneratorDelegate.MONITORING_TOPIC]?.transform.channelClass
	}

	protected def monitoringEventPayloadClass() {
		return api.channels.findFirst[getName() == AsyncApiGeneratorDelegate.MONITORING_TOPIC]?.subscribe.message.resolve.payload.resolve.transform
	}
	
	override serialize() '''
		package «pkg»;
		
		«imports.join(System.lineSeparator, [i | "import {0};".format(i)])»
		
		/**
		 * Measurement instrument for latencies
		 */
		class «name» extends «measurementInstrumentAbstractClass.name» {
			
			private Logger logger = Logger.getLogger(«name».class.getName());
			
			private BigDecimal latency;
			
			// We use a FifoMap to limit the number of messages we're tracking the latency
			// Tracking the latency of a maximum of 100 messages at the same time seems fair and safe enough...
			private FifoMap<String, Instant> sentAtMap = new FifoMap<>(100);
			
			/**
			 * Constructor
			 */
			protected «name»(«monitoredServerInterface.name» server, «subscribeOperationInterface.name» subscribeOperation, «qosMetricInterface.name» metric) {
				super(server, subscribeOperation, metric);
				«serverInterface.name» monitoringServer = server.getMonitoringServer();
				if (metric.getGroupedByEvent()) {
					logger.warning("The '«name»' does not support the 'groupedByEvent' option yet. Ignoring it.");
				}
				try {
					«monitoringEventChannelClass.name».ReceiveMonitoringEventOperation.subscribe(monitoringServer, (msg, params) -> {
						«monitoringEventPayloadClass.name» payload = msg.getPayload().get();
						if (payload.getMessageId() == null) {
							// Latencies require that message identifiers are defined
							// To avoid flooding the log, notify about this contition only when messages are being sent
							if (payload.getEvent() == «monitoringEventPayloadClass.name».Event.MESSAGE_SENT) {
								logger.severe(MessageFormat.format("Unable to calculate message latencies in ''{0}'' since messages don''t have an identifier.", 
										subscribeOperation.newConfiguration().getChannel().getName()));
							}
							return;
						}
						String id = payload.getMessageId();
						Instant now = Instant.now();
						if (payload.getEvent() == «monitoringEventPayloadClass.name».Event.MESSAGE_SENT) {
							sentAtMap.put(id, Instant.parse(payload.getTimestamp()));
						} else if (payload.getEvent() == «monitoringEventPayloadClass.name».Event.MESSAGE_RECEIVED) {
							Instant sentAt = sentAtMap.get(id);
							if (sentAt == null) {
								logger.severe(MessageFormat.format("Unable to determine when the message with id ''{0}'' was sent", id));
								return;
							}
							Duration duration = Duration.between(sentAt, Instant.parse(payload.getTimestamp()));
							switch (metric.getUnit()) {
								case MILLISECONDS:
									latency = new BigDecimal(duration.abs().toMillis());
									break;
								case SECONDS:
									latency = new BigDecimal(duration.abs().toSeconds());
									break;
								case MINUTES:
									latency = new BigDecimal(duration.abs().toMinutes());
									break;
								case HOURS:
									latency = new BigDecimal(duration.abs().toHours());
									break;
								default:
									logger.warning(MessageFormat.format("Unexpected unit time: ''{0}''", metric.getUnit().toString()));
							}
							logger.fine(MessageFormat.format("New ''latency'' value in channel ''{0}'' is ''{1}'' ''{2}''", 
									subscribeOperation.newConfiguration().getChannel().getName(), latency, metric.getUnit().toString().toLowerCase()));
							lastUpdated = now;
							notifyObservers();
						}
					});
				} catch (ServerException e) {
					logger.severe(MessageFormat.format("Unable to subscribe to ''{0}''", subscribeOperation.newConfiguration().getSubscriptionPattern()));
				}
			}
			
			@Override
			public Optional<BigDecimal> getValue() {
				return Optional.ofNullable(latency);
			}
			
			private class FifoMap<T, U> extends LinkedHashMap<T, U> {
			
			    private static final long serialVersionUID = 1L;
		
			    private int max;
			
			    public FifoMap(int max){
			        super(max + 1);
			        this.max = max;
			    }
			
			    @Override
			    public U put(T key, U value) {
			        U retVal = super.put(key, value);
			        if (super.size() > max){
			            removeEldest();
			        }
			        return retVal;
			    }
			
			    private void removeEldest() {
			        Iterator<T> iterator = this.keySet().iterator();
			        if (iterator.hasNext()){
			            this.remove(iterator.next());
			        }
			    }
			}
		}
	'''
}
