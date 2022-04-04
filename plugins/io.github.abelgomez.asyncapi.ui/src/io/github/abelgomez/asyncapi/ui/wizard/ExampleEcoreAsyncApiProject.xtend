package io.github.abelgomez.asyncapi.ui.wizard

import io.github.abelgomez.asyncapi.ui.internal.AsyncapiActivator

import static extension io.github.abelgomez.asyncapi.generator.AsyncApi2Json.*
import static extension io.github.abelgomez.asyncapi.m2m.Ecore2AsyncApi.*

final class ExampleEcoreAsyncApiProject extends AbstractAsyncApiProjectTemplate {
	
	override getLabel() {
		"Example AsyncAPI Project from Ecore"
	}

	override getDescription() {
		"<p><b>Example Ecore project</b></p><p>Creates a new AsyncAPI v2.0.0 project using an example Ecore file. You can set the package the file is created in.</p>"
	}

	override createProjectFactory() {
		super.createProjectFactory => [
			addFile('''«SRC_JAVA»/«path»/Events.ecore''', AsyncapiActivator.instance.bundle.getResource("resources/example.ecore.project/Events.ecore").readContents)
			addFile('''«SRC_JAVA»/«path»/Events.asyncapi''', AsyncapiActivator.instance.bundle.getResource("resources/example.ecore.project/Events.ecore").openStream.loadEPackage.asyncApi.generate)
			addFile('''«SRC_JAVA»/main/MainExample.java''', AsyncapiActivator.instance.bundle.getResource("resources/example.ecore.project/MainExample.java").readContents)
		]
	}
	
	def ecoreFileContents() '''

			'''
}
