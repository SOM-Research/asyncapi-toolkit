package io.github.abelgomez.asyncapi.generator.infra

interface ITargetElement {
	def String pkg()
	def String name()
	def String fqn()
}
