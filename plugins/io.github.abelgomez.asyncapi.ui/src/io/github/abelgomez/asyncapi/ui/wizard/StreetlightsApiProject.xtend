package io.github.abelgomez.asyncapi.ui.wizard

import io.github.abelgomez.asyncapi.ui.internal.AsyncapiActivator

final class StreetlightsApiProject extends AbstractAsyncApiProjectTemplate {
	def StreetlightsApiProject() {
		path.value = "streetlights"
	}

	override getLabel() {
		"Streetlights API Example Project"
	}

	override getDescription() {
		"<p><b>Streetlights API</b></p><p>This is an example for AsyncApi v2.0.0. You can set the package the file is created in.</p>"
	}

	override protected updateVariables() {
		super.updateVariables
		if (!advanced.value) {
			path.value = "streetlights"
		}
	}


	override createProjectFactory() {
		super.createProjectFactory => [
			addFile('''«SRC_JAVA»/«path»/StreetlightsAPI.asyncapi''', AsyncapiActivator.instance.bundle.getResource("resources/streetlights.project/StreetlightsAPI.asyncapi").readContents)
			addFile('''«SRC_JAVA»/main/MainExample.java''', AsyncapiActivator.instance.bundle.getResource("resources/streetlights.project/MainExample.java").readContents)
			addFile('''«TEST_JAVA»/main/TestMainExample.java''', AsyncapiActivator.instance.bundle.getResource("resources/streetlights.project/TestMainExample.java").readContents)
			addFile('''config/moquette.conf''', AsyncapiActivator.instance.bundle.getResource("resources/streetlights.project/moquette.conf").readContents)
		]
	}
	
	override pomDependencies() '''
		<dependency>
		      <groupId>io.moquette</groupId>
		      <artifactId>moquette-broker</artifactId>
		      <version>0.15</version>
		</dependency>
		«super.pomDependencies»
	'''
}
