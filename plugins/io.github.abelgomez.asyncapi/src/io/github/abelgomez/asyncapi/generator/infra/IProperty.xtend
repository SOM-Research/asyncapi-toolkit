package io.github.abelgomez.asyncapi.generator.infra

interface IProperty {
	def String name()
	def String type()
	def CharSequence declare()
	def CharSequence declareAs(String name)
	def CharSequence getter()
	def CharSequence setter(IBuilder builder)
}