/*
 * generated by Xtext 2.16.0
 */
package io.github.abelgomez.asyncapi.ui.wizard

import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.core.runtime.Platform
import org.eclipse.xtext.ui.wizard.template.AbstractProjectTemplate
import org.eclipse.xtext.ui.wizard.template.IProjectTemplateProvider
import java.util.ArrayList

/**
 * Create a list with all project templates to be shown in the template new project wizard.
 * 
 * Each template is able to generate one or more projects. Each project can be configured such that any number of files are included.
 */
class AsyncApiProjectTemplateProvider implements IProjectTemplateProvider {
	
	static final String PROJECT_TEMPLATE_ID = "io.github.abelgomez.asyncapi.ui.projectTemplate"
	
	override getProjectTemplates() {
		#[new EmptyAsyncApiProject, new StreetlightsApiProject, new StreetlightsQoSProject, new EcoreAsyncApiProject, new ExampleEcoreAsyncApiProject] + contributedProjectTemplates
	}
	
	def AbstractProjectTemplate[] contributedProjectTemplates() {
		val templates = new ArrayList
		val IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(PROJECT_TEMPLATE_ID)
        for (IConfigurationElement e : config) {
            templates += e.createExecutableExtension("class") as AbstractProjectTemplate
        }
        
        return templates
	}
}

