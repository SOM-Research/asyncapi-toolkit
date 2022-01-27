package io.github.abelgomez.asyncapi.generator.infra

interface IBuildableType {
	def IBuilder asBuilder()
}