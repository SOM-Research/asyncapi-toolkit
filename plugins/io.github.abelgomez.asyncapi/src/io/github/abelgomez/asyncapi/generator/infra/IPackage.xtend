package io.github.abelgomez.asyncapi.generator.infra

import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

interface IPackage extends ITargetElement {
	def void saveContents(IFileSystemAccess2 fsa, IGeneratorContext context)
}
