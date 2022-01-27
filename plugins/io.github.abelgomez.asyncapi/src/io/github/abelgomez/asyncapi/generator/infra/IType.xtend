package io.github.abelgomez.asyncapi.generator.infra

import java.util.SortedSet

interface IType extends ITargetElement, ISerializable {
	def SortedSet<String> imports()
}
