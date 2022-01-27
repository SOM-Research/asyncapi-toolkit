package io.github.abelgomez.asyncapi.generator.infra

import org.eclipse.xtext.generator.IFileSystemAccess2

interface IGenerable {
	def void generate(IFileSystemAccess2 fsa)
}
