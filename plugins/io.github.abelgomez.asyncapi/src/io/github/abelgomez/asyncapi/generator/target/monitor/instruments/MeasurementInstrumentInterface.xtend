package io.github.abelgomez.asyncapi.generator.target.monitor.instruments

import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI
import io.github.abelgomez.asyncapi.generator.infra.IClass
import io.github.abelgomez.asyncapi.generator.infra.IType
import io.github.abelgomez.asyncapi.generator.target.AbstractType
import java.util.Collections
import java.util.TreeSet

import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*
import static extension java.text.MessageFormat.*

class MeasurementInstrumentInterface extends AbstractType implements IType {

	static class UnsupportedMetricTypeException extends AbstractType implements IClass {
		
		MeasurementInstrumentInterface measurementInstrumentInterface
	
		private new(MeasurementInstrumentInterface measurementInstrumentInterface) {
			this.measurementInstrumentInterface = measurementInstrumentInterface
		}
	
		override name() {
			return "UnsupportedMetricTypeException"
		}
		
		override pkg() {
			measurementInstrumentInterface.pkg
		}
		
		override fqn() {
			measurementInstrumentInterface.fqn + "." + name
		}
		
		override imports() {
			val result = new TreeSet
			return Collections.unmodifiableNavigableSet(result)
		}
		
		def qoSMetricInterface() {
			return measurementInstrumentInterface.api.transform.metricsPackage.qoSMetricInterface
		}
		
		override serialize() '''
			/**
			 * Unchecked exception that indicates that the given {@link «qoSMetricInterface.metricType.name»} is not
			 * yet supported
			 */
			public class «name» extends RuntimeException {
			
				private static final long serialVersionUID = 1L;
			
				public «name»(«qoSMetricInterface.metricType.name» metricType) {
					super("Unsupported metric type: " + metricType.toString());
				}
			}
		'''
	}

	static class MeasurementObserverInterface extends AbstractType implements IClass {
		
		MeasurementInstrumentInterface measurementInstrumentInterface
	
		private new(MeasurementInstrumentInterface measurementInstrumentInterface) {
			this.measurementInstrumentInterface = measurementInstrumentInterface
		}
	
		override name() {
			return "IMeasurementObserver"
		}
		
		override pkg() {
			measurementInstrumentInterface.pkg
		}
		
		override fqn() {
			measurementInstrumentInterface.fqn + "." + name
		}
		
		override imports() {
			val result = new TreeSet
			return Collections.unmodifiableNavigableSet(result)
		}
		
		def qoSMetricInterface() {
			return measurementInstrumentInterface.api.transform.metricsPackage.qoSMetricInterface
		}
		
		override serialize() '''
			/**
			 * Interface to implement the observer pattern
			 */
			public interface «name» {
			
				public void update(«measurementInstrumentInterface.name» measurementInstrument);
				
			}
		'''
	}


	AsyncAPI api
	UnsupportedMetricTypeException unsupportedMetricTypeException
	MeasurementObserverInterface measurementObserverInterface

	static def MeasurementInstrumentInterface createFrom(AsyncAPI api) {
		return new MeasurementInstrumentInterface(api)
	}

	private new(AsyncAPI api) {
		this.api = api
		unsupportedMetricTypeException = new UnsupportedMetricTypeException(this)
		measurementObserverInterface = new MeasurementObserverInterface(this)
	}

	override name() {
		return "IMeasurementInstrument"
	}
	
	override pkg() {
		api.transform.instrumentsPackage.fqn
	}
	
	override fqn() {
		pkg + "." + name
	}
	
	override imports() {
		val result = new TreeSet
		result += "java.math.BigDecimal"
		result += "java.util.Optional"
		result += "java.time.Instant"
		result += monitoredServerInterface.fqn
		result += subscribeOperationInterface.fqn
		result += qosMetricInterface.fqn
		result += qosMetricInterface.metricType.fqn
		return Collections.unmodifiableNavigableSet(result)
	}
	
	def unsupportedMetricTypeException() {
		return unsupportedMetricTypeException
	}
	
	def measurementObserverInterface() {
		return measurementObserverInterface
	}
	
	def serverInterface() {
		return api.transform.serverInterface
	}
	
	def monitoredServerInterface() {
		return api.transform.monitoredServerInterface
	}
	
	def subscribeOperationInterface() {
		return api.transform.operationInterface.subscribeOperationInterface
	}
	
	def qosMetricInterface() {
		return api.transform.metricsPackage.qoSMetricInterface
	}

	def latencyMeasurementInstrumentClass() {
		return api.transform.instrumentsPackage.latencyMeasurementInstrumentClass
	}
	
	def periodMeasurementInstrumentClass() {
		return api.transform.instrumentsPackage.periodMeasurementInstrumentClass
	}
	
	override serialize() '''
		package «pkg»;
		«imports.join(System.lineSeparator, System.lineSeparator, "", [i | "import {0};".format(i)])»
		
		/**
		 * Base interface for measurement instruments
		 */
		public interface «name» {
		
			/**
			 * Returns the {@link «qosMetricInterface.name»} that this {@link «name»}
			 * computes
			 */
			public «qosMetricInterface.name» getMetric();
		
			/**
			 * Return the actual measured value for the {@link «qosMetricInterface.name»} related to this
			 * {@link «name»}. The return value will be empty if it is not
			 * possible to calculate the measured value (e.g., because not enough data has
			 * been collected yet).
			 */
			public Optional<BigDecimal> getValue();
			
			/**
			 * Return when the value was update for the last time
			 */
			public Instant lastUpdated();
			
			/**
			 * Add an observer
			 */
			public void addObserver(«measurementObserverInterface.name» observer);

			/**
			 * Remove an observer
			 */
			public void removeObserver(«measurementObserverInterface.name» observer);
			
			/**
			 * Notify Observers
			 */
			public void notifyObservers();
			 
			/**
			 * Factory method to return the {@link «name»} suitable for the
			 * given {@link «qosMetricInterface.name»} based on its {@link «qosMetricInterface.metricType.name»}
			 * 
			 * @param metric
			 * @return
			 */
			public static «name» createInstrumentFor(«monitoredServerInterface.name» server, «subscribeOperationInterface.name» subscribeOperation, «qosMetricInterface.name» metric) {
				switch (metric.getType()) {
				case PERIOD:
					return new «periodMeasurementInstrumentClass.name»(server, subscribeOperation, metric);
				case LATENCY:
					return new «latencyMeasurementInstrumentClass.name»(server, subscribeOperation, metric);
				default:
					throw new «unsupportedMetricTypeException.name»(metric.getType());
				}
			}
		
			«unsupportedMetricTypeException.serialize»
			
			«measurementObserverInterface.serialize»
		}
	'''
}
