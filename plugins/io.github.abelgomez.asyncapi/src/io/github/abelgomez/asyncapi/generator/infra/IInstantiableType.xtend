package io.github.abelgomez.asyncapi.generator.infra

interface IInstantiableType extends IBuildableType {
	def IProperty asProperty()
}