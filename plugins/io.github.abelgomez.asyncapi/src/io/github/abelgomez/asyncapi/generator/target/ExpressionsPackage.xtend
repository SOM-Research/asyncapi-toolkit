package io.github.abelgomez.asyncapi.generator.target

import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI
import io.github.abelgomez.asyncapi.generator.target.monitor.expressions.AndBooleanExpressionClass
import io.github.abelgomez.asyncapi.generator.target.monitor.expressions.BooleanExpressionAbstractClass
import io.github.abelgomez.asyncapi.generator.target.monitor.expressions.ComparisonExpressionClass
import io.github.abelgomez.asyncapi.generator.target.monitor.expressions.MeasurementBooleanExpressionInterface
import io.github.abelgomez.asyncapi.generator.target.monitor.expressions.OrBooleanExpressionClass
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*

class ExpressionsPackage extends AbstractPackage {

	AsyncAPI api
	
	MeasurementBooleanExpressionInterface measurementBooleanExpressionInterface
	BooleanExpressionAbstractClass booleanExpressionAbstractClass
	AndBooleanExpressionClass andBooleanExpressionClass
	OrBooleanExpressionClass orBooleanExpressionClass
	ComparisonExpressionClass comparisonExpressionClass
	
	static def createFrom(AsyncAPI api) {
		return new ExpressionsPackage(api)
	}

	private new(AsyncAPI api) {
		this.api = api
		initialize()
	}

	def initialize() {
		measurementBooleanExpressionInterface = MeasurementBooleanExpressionInterface.createFrom(api)
		booleanExpressionAbstractClass = BooleanExpressionAbstractClass.createFrom(api)
		andBooleanExpressionClass = AndBooleanExpressionClass.createFrom(api)
		orBooleanExpressionClass = OrBooleanExpressionClass.createFrom(api)
		comparisonExpressionClass = ComparisonExpressionClass.createFrom(api)
	}
	
	override name() {
		return "expressions"
	}
	
	override fqn() {
		return api.transform.monitoringPackage.fqn + "." + name
	}
	
	def measurementBooleanExpressionInterface() {
		return measurementBooleanExpressionInterface
	}
	
	def booleanExpressionAbstractClass() {
		return booleanExpressionAbstractClass
	}
	
	def andBooleanExpressionClass() {
		return andBooleanExpressionClass
	}
	
	def orBooleanExpressionClass() {
		return orBooleanExpressionClass
	}
	
	def comparisonExpressionClass() {
		return comparisonExpressionClass
	}
	
	override saveContents(IFileSystemAccess2 fsa, IGeneratorContext context) {
		measurementBooleanExpressionInterface?.generate(fsa)
		booleanExpressionAbstractClass?.generate(fsa)
		andBooleanExpressionClass?.generate(fsa)
		orBooleanExpressionClass?.generate(fsa)
		comparisonExpressionClass?.generate(fsa)
	}
}
