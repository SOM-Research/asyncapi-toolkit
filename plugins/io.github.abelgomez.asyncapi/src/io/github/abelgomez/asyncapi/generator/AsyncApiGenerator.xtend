package io.github.abelgomez.asyncapi.generator

import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class AsyncApiGenerator extends AbstractGenerator {

	AsyncAPI api;

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		api = resource.contents.findFirst[a | a instanceof AsyncAPI] as AsyncAPI;
		val delegate = new AsyncApiGeneratorDelegate(fsa, context, api);
		delegate.generate()
	}
}


