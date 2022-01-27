package io.github.abelgomez.asyncapi.generator.target

import io.github.abelgomez.asyncapi.generator.infra.IPackage

abstract class AbstractPackage implements IPackage {

	override pkg() {
		return if (fqn.contains(".")) fqn.substring(0, fqn.lastIndexOf(".")) else ""
	}
}
