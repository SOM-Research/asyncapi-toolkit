package io.github.abelgomez.asyncapi.generator.target.monitor.instruments

import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI
import io.github.abelgomez.asyncapi.generator.infra.IType
import io.github.abelgomez.asyncapi.generator.target.AbstractType
import java.util.Collections
import java.util.TreeSet

import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*
import static extension java.text.MessageFormat.*

class MeasurementInstrumentAbstractClass extends AbstractType implements IType {

	AsyncAPI api

	static def MeasurementInstrumentAbstractClass createFrom(AsyncAPI api) {
		return new MeasurementInstrumentAbstractClass(api)
	}

	private new(AsyncAPI api) {
		this.api = api
	}

	override name() {
		return "AbstractMeasurementInstrument"
	}
	
	override pkg() {
		api.transform.instrumentsPackage.fqn
	}
	
	override fqn() {
		pkg + "." + name
	}
	
	override imports() {
		val result = new TreeSet
		result += "java.util.Optional"
		result += "java.math.BigDecimal"
		result += "java.time.Instant"
		result += "java.util.List"
		result += "java.util.ArrayList"
		result += monitoredServerInterface.fqn
		result += qosMetricInterface.fqn
		result += subscribeOperationInterface.fqn
		return Collections.unmodifiableNavigableSet(result)
	}
	
	def subscribeOperationInterface() {
		return api.transform.operationInterface.subscribeOperationInterface
	}
	
	def measurementInstrumentInterface() {
		return api.transform.instrumentsPackage.measurementInstrumentInterface
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
		«imports.join(System.lineSeparator, System.lineSeparator, "", [i | "import {0};".format(i)])»
		
		/**
		 * Base class for measurement instruments
		 */
		abstract class «name» implements «measurementInstrumentInterface.name» {
		
			protected List<«measurementInstrumentInterface.measurementObserverInterface.name»> observers = new ArrayList<>();
		
			protected Instant lastUpdated = Instant.MIN;
		
			protected «subscribeOperationInterface.name» subscribeOperation;
		
			protected «qosMetricInterface.name» metric;
			
			protected «name»(«monitoredServerInterface.name» server, «subscribeOperationInterface.name» subscribeOperation, «qosMetricInterface.name» metric) {
				this.metric = metric;
				this.subscribeOperation = subscribeOperation;
			}
		
			@Override
			public «qosMetricInterface.name» getMetric() {
				return metric;
			}
			
			@Override
			public Optional<BigDecimal> getValue() {
				return Optional.empty();
			}
			
			@Override
			public Instant lastUpdated() {
				return lastUpdated;
			}
			
			@Override
			public void addObserver(«measurementInstrumentInterface.measurementObserverInterface.name» observer) {
				observers.add(observer);
			};
			
			@Override
			public void removeObserver(«measurementInstrumentInterface.measurementObserverInterface.name» observer) {
				observers.remove(observer);
			};
			
			@Override
			public void notifyObservers() {
				observers.stream().forEach(o -> o.update(this));
			}
			
			@Override
			public String toString() {
				return (getValue().isPresent() ? getValue().get() : "<null>") + " " + metric.getUnit().toString().toLowerCase();
			}
		}
	'''
}
