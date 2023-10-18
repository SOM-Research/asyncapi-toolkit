package io.github.abelgomez.asyncapi.generator.target.monitor.expressions

import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI
import io.github.abelgomez.asyncapi.generator.infra.IType
import io.github.abelgomez.asyncapi.generator.target.AbstractType
import java.util.Collections
import java.util.TreeSet

import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*
import static extension java.text.MessageFormat.*

class AndBooleanExpressionClass extends AbstractType implements IType {

	AsyncAPI api

	static def AndBooleanExpressionClass createFrom(AsyncAPI api) {
		return new AndBooleanExpressionClass(api)
	}

	private new(AsyncAPI api) {
		this.api = api
	}

	override name() {
		return "AndBooleanExpression"
	}
	
	override pkg() {
		api.transform.expressionsPackage.fqn
	}
	
	override fqn() {
		pkg + "." + name
	}
	
	override imports() {
		val result = new TreeSet
		result += "java.util.stream.Collectors"
		return Collections.unmodifiableNavigableSet(result)
	}
	
	def measurementBooleanExpressionInterface() {
		api.transform.expressionsPackage.measurementBooleanExpressionInterface
	}
	
	def booleanExpressionAbstractClass() {
		api.transform.expressionsPackage.booleanExpressionAbstractClass
	}
	
	override serialize() '''
		package «pkg»;
		«imports.join(System.lineSeparator, System.lineSeparator, "", [i | "import {0};".format(i)])»
		
		/**
		 * AND boolean expression
		 */
		public class «name» extends «booleanExpressionAbstractClass.name» {
			
			public static final «name» of(«measurementBooleanExpressionInterface.name»... expressions) {
				return new «name»(expressions);
			}
				
			protected «name»(«measurementBooleanExpressionInterface.name»... expressions) {
				super(expressions);
			}
			
			@Override
			public boolean isTrue() {
				return expressions.stream().allMatch(e -> e.isTrue());
			}
			
			@Override
			public String toString() {
				return expressions.stream().map(e -> e.toString()).collect(Collectors.joining("(", " AND ", ")"));
			}
		}
	'''
}
