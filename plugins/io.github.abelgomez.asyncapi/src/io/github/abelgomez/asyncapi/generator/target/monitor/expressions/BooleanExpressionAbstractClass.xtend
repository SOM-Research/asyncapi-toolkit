package io.github.abelgomez.asyncapi.generator.target.monitor.expressions

import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI
import io.github.abelgomez.asyncapi.generator.infra.IType
import io.github.abelgomez.asyncapi.generator.target.AbstractType
import java.util.Collections
import java.util.TreeSet

import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*
import static extension java.text.MessageFormat.*

class BooleanExpressionAbstractClass extends AbstractType implements IType {

	AsyncAPI api

	static def BooleanExpressionAbstractClass createFrom(AsyncAPI api) {
		return new BooleanExpressionAbstractClass(api)
	}

	private new(AsyncAPI api) {
		this.api = api
	}

	override name() {
		return "AbstractBooleanExpression"
	}
	
	override pkg() {
		api.transform.expressionsPackage.fqn
	}
	
	override fqn() {
		pkg + "." + name
	}
	
	override imports() {
		val result = new TreeSet
		result += "java.util.Arrays"
		result += "java.util.List"
		result += "java.util.ArrayList"
		result += "java.time.Instant"
		result += measurementBooleanExpressionInterface.measurementExpressionObserverInterface.fqn
		return Collections.unmodifiableNavigableSet(result)
	}
	
	def measurementBooleanExpressionInterface() {
		return api.transform.expressionsPackage.measurementBooleanExpressionInterface
	}

	override serialize() '''
		package «pkg»;
		«imports.join(System.lineSeparator, System.lineSeparator, "", [i | "import {0};".format(i)])»
		
		/**
		 * Base class for {@link «measurementBooleanExpressionInterface.name»}
		 */
		abstract class «name» implements «measurementBooleanExpressionInterface.name», «measurementBooleanExpressionInterface.measurementExpressionObserverInterface.name»  {
			
			protected List<«measurementBooleanExpressionInterface.measurementExpressionObserverInterface.name»> observers = new ArrayList<>();
			
			protected List<«measurementBooleanExpressionInterface.name»> expressions;
			
			protected «name»(«measurementBooleanExpressionInterface.name»... expressions) {
				this.expressions = Arrays.asList(expressions);
				this.expressions.stream().forEach(e -> e.addObserver(this));
			}
			
			@Override
			public boolean isTrue() {
				return expressions.stream().allMatch(e -> e.isTrue());
			}
			
			@Override
			public Instant lastUpdated() {
				return expressions.stream().map(e -> e.lastUpdated()).max(Instant::compareTo).get();
			}
			
			@Override
			public void addObserver(«measurementBooleanExpressionInterface.measurementExpressionObserverInterface.name» observer) {
				observers.add(observer);
			};
			
			@Override
			public void removeObserver(«measurementBooleanExpressionInterface.measurementExpressionObserverInterface.name» observer) {
				observers.remove(observer);
			};
			
			@Override
			public void notifyObservers() {
				observers.stream().forEach(o -> o.update(this));
			}
			
			@Override
			public void update(IMeasurementBooleanExpression measurementBooleanExpression) {
				notifyObservers();
			}
		}
	'''
}
