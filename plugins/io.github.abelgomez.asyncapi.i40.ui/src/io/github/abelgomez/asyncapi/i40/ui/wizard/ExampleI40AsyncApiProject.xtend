package io.github.abelgomez.asyncapi.i40.ui.wizard

import io.github.abelgomez.asyncapi.i40.ui.I40UiPlugin
import io.github.abelgomez.asyncapi.ui.wizard.AbstractAsyncApiProjectTemplate

import static extension io.github.abelgomez.asyncapi.generator.AsyncApi2Json.*
import static extension io.github.abelgomez.asyncapi.i40.m2m.Uml2AsyncApi.*

final class ExampleI40AsyncApiProject extends AbstractAsyncApiProjectTemplate {
	
	override getLabel() {
		"Example AsyncAPI Project from I4.0 UML model"
	}

	override getDescription() {
		"<p><b>Example I4.0 UML project</b></p><p>Creates a new AsyncAPI v2.0.0 project from an example I4.0 UML model file. You can set the package the file is created in.</p>"
	}

	override createProjectFactory() {
		super.createProjectFactory => [
			addFile('''«SRC_JAVA»/«path»/I40.uml''', I40UiPlugin.^default.bundle.getResource("resources/example.i40.project/I40.uml").readContents)
			addFile('''«SRC_JAVA»/«path»/I40.di''', I40UiPlugin.^default.bundle.getResource("resources/example.i40.project/I40.di").readContents)
			addFile('''«SRC_JAVA»/«path»/I40.notation''', I40UiPlugin.^default.bundle.getResource("resources/example.i40.project/I40.notation").readContents)
			addFile('''«SRC_JAVA»/«path»/I40.asyncapi''', I40UiPlugin.^default.bundle.getResource("resources/example.i40.project/I40.uml").openStream.loadModel.asyncApi.generate)
			addFile('''«SRC_JAVA»/main/SubscribeExample.java''', I40UiPlugin.^default.bundle.getResource("resources/example.i40.project/SubscribeExample.java").readContents)
			addFile('''«SRC_JAVA»/main/PublishExample.java''', I40UiPlugin.^default.bundle.getResource("resources/example.i40.project/PublishExample.java").readContents)
		]
	}
}
