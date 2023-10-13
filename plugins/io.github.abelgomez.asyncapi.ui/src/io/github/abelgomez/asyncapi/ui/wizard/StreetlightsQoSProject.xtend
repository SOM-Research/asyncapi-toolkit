package io.github.abelgomez.asyncapi.ui.wizard

import io.github.abelgomez.asyncapi.ui.internal.AsyncapiActivator

final class StreetlightsQoSProject extends AbstractAsyncApiProjectTemplate {
	def StreetlightsQoSProject() {
		path.value = "streetlights/qos"
	}

	override getLabel() {
		"Streetlights API with QoS Example Project"
	}

	override getDescription() {
		"<p><b>Streetlights API with QoS</b></p><p>This is an example for AsyncApi v2.0.0 demonstrating how Quality of Service (QoS) properties can be defined and monitored. "
		+ "You can set the package the file is created in.</p>"
	}

	override protected updateVariables() {
		super.updateVariables
		if (!advanced.value) {
			path.value = "streetlights/qos"
		}
	}


	override createProjectFactory() {
		super.createProjectFactory => [
			addFile('''«SRC_JAVA»/«path»/StreetlightsQoS.asyncapi''', AsyncapiActivator.instance.bundle.getResource("resources/streetlights.qos.project/StreetlightsQoS.asyncapi").readContents)
			addFile('''«SRC_JAVA»/main/MainExample.java''', AsyncapiActivator.instance.bundle.getResource("resources/streetlights.qos.project/MainExample.java").readContents)
			addFile('''«SRC_JAVA»/main/MainMonitorExample.java''', AsyncapiActivator.instance.bundle.getResource("resources/streetlights.qos.project/MainMonitorExample.java").readContents)
			addFile('''«TEST_JAVA»/main/TestMainExample.java''', AsyncapiActivator.instance.bundle.getResource("resources/streetlights.qos.project/TestMainExample.java").readContents)
			addFile('''config/moquette.conf''', AsyncapiActivator.instance.bundle.getResource("resources/streetlights.qos.project/moquette.conf").readContents)
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
