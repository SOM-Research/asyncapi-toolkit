package io.github.abelgomez.asyncapi.generator.target

import io.github.abelgomez.asyncapi.generator.AsyncApiGeneratorDelegate
import io.github.abelgomez.asyncapi.generator.infra.IGenerable
import io.github.abelgomez.asyncapi.generator.infra.IType
import java.io.File
import java.util.Collections
import org.eclipse.xtext.generator.IFileSystemAccess2

import static extension io.github.abelgomez.asyncapi.generator.ModelExtensions.*

abstract class AbstractType implements IType, IGenerable {
	
	override filename() {
		AsyncApiGeneratorDelegate.SRC_FOLDER + File.separatorChar + this.dir + File.separatorChar + name + ".java"
	}
	
	override imports() {
		Collections.emptyNavigableSet()
	}
		
	override generate(IFileSystemAccess2 fsa) {
		fsa.generateFile(filename, serialize)
	}
}