package io.github.abelgomez.asyncapi.generator.infra

interface IBuilder extends ISerializable, ITargetElement {
	override String name()
	def String type()
}