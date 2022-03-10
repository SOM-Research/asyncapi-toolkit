package io.github.abelgomez.asyncapi.generator.infra

import org.eclipse.xtext.generator.IFileSystemAccess2

interface IGenerable {
	def String filename()
	def void generate(IFileSystemAccess2 fsa)
}
