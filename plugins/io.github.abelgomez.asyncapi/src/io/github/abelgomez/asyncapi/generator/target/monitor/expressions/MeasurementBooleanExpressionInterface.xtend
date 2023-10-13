package io.github.abelgomez.asyncapi.generator.target.monitor.expressions

import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI
import io.github.abelgomez.asyncapi.generator.infra.IClass
import io.github.abelgomez.asyncapi.generator.infra.IType
import io.github.abelgomez.asyncapi.generator.target.AbstractType
import java.util.Collections
import java.util.TreeSet

import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*
import static extension java.text.MessageFormat.*

class MeasurementBooleanExpressionInterface extends AbstractType implements IType {

	static class MeasurementExpressionObserverInterface extends AbstractType implements IClass {
		
		MeasurementBooleanExpressionInterface measurementBooleanExpressionInterface
	
		private new(MeasurementBooleanExpressionInterface measurementBooleanExpressionInterface) {
			this.measurementBooleanExpressionInterface = measurementBooleanExpressionInterface
		}
	
		override name() {
			return "IMeasurementExpressionObserver"
		}
		
		override pkg() {
			measurementBooleanExpressionInterface.pkg
		}
		
		override fqn() {
			measurementBooleanExpressionInterface.fqn + "." + name
		}
		
		override imports() {
			val result = new TreeSet
			return Collections.unmodifiableNavigableSet(result)
		}
		
		def qoSMetricInterface() {
			return measurementBooleanExpressionInterface.api.transform.metricsPackage.qoSMetricInterface
		}
		
		override serialize() '''
			/**
			 * Interface to implement the observer pattern
			 */
			public interface «name» {
			
				public void update(«measurementBooleanExpressionInterface.name» measurementBooleanExpression);
				
			}
		'''
	}


	AsyncAPI api
	MeasurementExpressionObserverInterface measurementExpressionObserverInterface

	static def MeasurementBooleanExpressionInterface createFrom(AsyncAPI api) {
		return new MeasurementBooleanExpressionInterface(api)
	}

	private new(AsyncAPI api) {
		this.api = api
		measurementExpressionObserverInterface = new MeasurementExpressionObserverInterface(this)
	}

	override name() {
		return "IMeasurementBooleanExpression"
	}
	
	override pkg() {
		api.transform.expressionsPackage.fqn
	}
	
	override fqn() {
		pkg + "." + name
	}
	
	override imports() {
		val result = new TreeSet
		result += "java.time.Instant"
		return Collections.unmodifiableNavigableSet(result)
	}
	
	def measurementExpressionObserverInterface() {
		return measurementExpressionObserverInterface;
	}
	
	override serialize() '''
		package «pkg»;
		«imports.join(System.lineSeparator, System.lineSeparator, "", [i | "import {0};".format(i)])»
		
		/**
		 * Base interface for measurement expressions
		 */
		public interface «name» {
		
			/**
			 * Return whether this {@link «name»} is true
			 */
			boolean isTrue();
		
			/**
			 * Return when the value was update for the last time
			 */
			public Instant lastUpdated();
			
			/**
			 * Add an observer
			 */
			public void addObserver(«measurementExpressionObserverInterface.name» observer);

			/**
			 * Remove an observer
			 */
			public void removeObserver(«measurementExpressionObserverInterface.name» observer);
			
			/**
			 * Notify Observers
			 */
			public void notifyObservers();
			
			«measurementExpressionObserverInterface.serialize»
		}
	'''
}
