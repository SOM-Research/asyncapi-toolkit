package io.github.abelgomez.asyncapi.ui.wizard

import org.eclipse.core.runtime.Path
import org.eclipse.core.runtime.Status
import org.eclipse.jdt.core.JavaCore
import org.eclipse.xtext.ui.XtextProjectHelper
import org.eclipse.xtext.ui.util.PluginProjectFactory
import org.eclipse.xtext.ui.wizard.template.IProjectGenerator
import org.eclipse.xtext.ui.wizard.template.ProjectTemplate

import static org.eclipse.core.runtime.IStatus.*

@ProjectTemplate(label="Empty AsyncAPI Project", icon="asyncapi_project_template.png", description="<p><b>Empty project</b></p>
<p>This an empty project to start designing with AsyncAPI v2.0.0. You can set the package the file is created in.</p>")
final class EmptyAsyncAPIProject {
	val advanced = check("Advanced:", false)
	val advancedGroup = group("Properties")
	val path = text("Package:", "example", "The package path to place the files in", advancedGroup)

	override protected updateVariables() {
		path.enabled = advanced.value
		if (!advanced.value) {
			path.value = "example"
		}
	}

	override protected validate() {
		if (path.value.matches('[a-z][a-z0-9_]*(/[a-z][a-z0-9_]*)*'))
			null
		else
			new Status(ERROR, "Wizard", "'" + path + "' is not a valid package name")
	}

	override generateProjects(IProjectGenerator generator) {
		generator.generate(new PluginProjectFactory => [
			projectName = projectInfo.projectName
			location = projectInfo.locationPath
			projectDefaultCharset = "UTF-8"
			projectNatures += #[JavaCore.NATURE_ID, "org.eclipse.pde.PluginNature", XtextProjectHelper.NATURE_ID]
			builderIds += #[JavaCore.BUILDER_ID, XtextProjectHelper.BUILDER_ID]
			folders += "src"
			folders += "src-gen"
			addFile('''src/«path»/example.asyncapi''', '''
				{
				  "asyncapi": "2.0.0",
				  "info": {
				    "title": "Example API",
				    "version": "1.0.0"
				  },
				  "servers": {
				    "production": {
				      "url": "localhost:1883",
				      "protocol": "mqtt"
				    }
				  }
				}
			''')
			addFile('''src/main/Main.java''', '''
				package main;
				
				public class Main {
					public static void main(String[] args) throws Exception {
						// TODO: Put your code here
					}
				}
			''')
			addFile('''ivy.xml''', '''
				<ivy-module version="2.0">
				    <info organisation="com.example" module="mymodule"/>
				    <dependencies>
				        <dependency org="com.google.code.gson" name="gson" rev="2.8.5"/>
				        <dependency org="org.eclipse.paho" name="org.eclipse.paho.client.mqttv3" rev="1.2.1"/>
				    </dependencies>
				</ivy-module>
			''')
			addClasspathEntries = JavaCore.newContainerEntry(new Path("org.apache.ivyde.eclipse.cpcontainer.IVYDE_CONTAINER/?project=" + projectInfo.projectName + "&ivyXmlPath=ivy.xml&confs=*&acceptedTypes=jar%2Cbundle%2Cejb%2Cmaven-plugin%2Ceclipse-plugin&alphaOrder=false&resolveInWorkspace=false&transitiveResolve=true&readOSGiMetadata=false&retrievedClasspath=false"))
		])
	}
}
