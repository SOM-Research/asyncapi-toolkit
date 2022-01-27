package io.github.abelgomez.asyncapi.generator.target

import io.github.abelgomez.asyncapi.generator.infra.IType
import java.io.File
import java.util.Collections
import org.eclipse.xtext.generator.IFileSystemAccess2
import io.github.abelgomez.asyncapi.generator.infra.IGenerable

import static extension io.github.abelgomez.asyncapi.generator.ModelExtensions.*

abstract class AbstractType implements IType, IGenerable {
	
	override imports() {
		return Collections.emptyNavigableSet()
	}
	
	override generate(IFileSystemAccess2 fsa) {
		fsa.generateFile(this.dir + File.separatorChar + name + ".java", serialize)
	}
}