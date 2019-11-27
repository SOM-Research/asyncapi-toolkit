package io.github.abelgomez.asyncapi.ui.wizard

import io.github.abelgomez.asyncapi.generator.Ecore2AsyncApi
import org.eclipse.core.resources.IContainer
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.Path
import org.eclipse.core.runtime.Status
import org.eclipse.jdt.core.JavaCore
import org.eclipse.jface.viewers.Viewer
import org.eclipse.jface.viewers.ViewerFilter
import org.eclipse.swt.SWT
import org.eclipse.swt.events.SelectionAdapter
import org.eclipse.swt.events.SelectionEvent
import org.eclipse.swt.layout.GridLayout
import org.eclipse.swt.widgets.Button
import org.eclipse.swt.widgets.Composite
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog
import org.eclipse.ui.dialogs.ISelectionStatusValidator
import org.eclipse.ui.model.BaseWorkbenchContentProvider
import org.eclipse.ui.model.WorkbenchLabelProvider
import org.eclipse.xtext.ui.XtextProjectHelper
import org.eclipse.xtext.ui.util.PluginProjectFactory
import org.eclipse.xtext.ui.wizard.template.ContainerTemplateVariable
import org.eclipse.xtext.ui.wizard.template.GroupTemplateVariable
import org.eclipse.xtext.ui.wizard.template.IProjectGenerator
import org.eclipse.xtext.ui.wizard.template.ParameterComposite
import org.eclipse.xtext.ui.wizard.template.ProjectTemplate
import org.eclipse.xtext.ui.wizard.template.StringTemplateVariable

import static io.github.abelgomez.asyncapi.generator.Ecore2AsyncApi.*
import static org.eclipse.core.runtime.IStatus.*
import org.eclipse.core.runtime.NullProgressMonitor
import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.stream.Collectors

@ProjectTemplate(label="AsyncAPI Project from Ecore", icon="asyncapi_project_template.png", description="<p><b>Ecore project</b></p>
<p>Creates a new AsyncAPI v2.0.0 project from an AsyncAPI-annotated Ecore file. You can set the package the file is created in.</p>")
final class EcoreAsyncAPIProject {
	val inputGroup = group3("Input file")
	val file = file("Ecore:", "", "Input Ecore file", inputGroup)
	val advanced = check("Advanced:", false)
	val advancedGroup = group("Properties")
	val path = text("Package:", "example", "The package path to place the files in", advancedGroup)

	override getVariables() {
		super.getVariables()
	}

	override protected updateVariables() {
		file.enabled = false
		path.enabled = advanced.value
		if (!advanced.value) {
			path.value = "example"
		}
	}

	override validate() {
		if (file.value.trim.isEmpty) {
			return new Status(ERROR, "Wizard", "Please specify an Ecore file")
		} else {
			val diagnose = diagnoseEcoreFile(new Path(file.value))
			if (diagnose !== null) {
				return new Status(ERROR, "Wizard", "'" + file + "' is not a valid Ecore file: " + diagnose)
			} else if (!path.value.matches('[a-z][a-z0-9_]*(/[a-z][a-z0-9_]*)*')) {
				return new Status(ERROR, "Wizard", "'" + path + "' is not a valid package name")
			} else {
				return null
			}
		}
	}

	override generateProjects(IProjectGenerator generator) {
		val ePackage = loadEPackage(new Path(file.value))
		generator.generate(new PluginProjectFactory => [
			projectName = projectInfo.projectName
			location = projectInfo.locationPath
			projectDefaultCharset = "UTF-8"
			projectNatures += #[JavaCore.NATURE_ID, "org.eclipse.pde.PluginNature", XtextProjectHelper.NATURE_ID]
			builderIds += #[JavaCore.BUILDER_ID, XtextProjectHelper.BUILDER_ID]
			folders += "src"
			folders += "src-gen"
			addFile('''src/«path»/«new Path(file.value).lastSegment»''',
				new BufferedReader(
					new InputStreamReader(ResourcesPlugin.workspace.root.getFile(new Path(file.value)).contents)).lines.
					collect(Collectors.joining(System.lineSeparator)))
			addFile('''src/«path»/«ePackage.name».asyncapi''', Ecore2AsyncApi.generate(ePackage))
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
			addClasspathEntries = JavaCore.newContainerEntry(
				new Path("org.apache.ivyde.eclipse.cpcontainer.IVYDE_CONTAINER/?project=" + projectInfo.projectName +
					"&ivyXmlPath=ivy.xml&confs=*&acceptedTypes=jar%2Cbundle%2Cejb%2Cmaven-plugin%2Ceclipse-plugin&alphaOrder=false&resolveInWorkspace=false&transitiveResolve=true&readOSGiMetadata=false&retrievedClasspath=false"))
		])
	}

	protected def Group3TemplateVariable group3(String name) {
		val variable = new Group3TemplateVariable(name, null, null);
		variables.add(variable);
		return variable;
	}

	protected def file(String name, String defaultValue, String description, ContainerTemplateVariable container) {
		val variable = new FileTemplateVariable(name, defaultValue, description, container);
		variables.add(variable);
		return variable;
	}

	static class Group3TemplateVariable extends GroupTemplateVariable {

		new(String label, String description, ContainerTemplateVariable container) {
			super(label, description, container)
		}

		override createWidget(ParameterComposite parameterComposite, Composite parent) {
			super.createWidget(parameterComposite, parent)
			widget.setLayout(new GridLayout(3, false))
		}
	}

	static class FileTemplateVariable extends StringTemplateVariable {

		Button button

		new(String label, String defaultValue, String description, ContainerTemplateVariable container) {
			super(label, defaultValue, description, container)
		}

		override createWidget(ParameterComposite parameterComposite, Composite parent) {
			super.createWidget(parameterComposite, parent)
			button = new Button(parent, SWT.NONE);
			button.text = "Browse..."
			button.addSelectionListener(new SelectionAdapter() {
				override widgetSelected(SelectionEvent e) {
					val dialog = new ElementTreeSelectionDialog(parent.shell, new WorkbenchLabelProvider(),
						new BaseWorkbenchContentProvider());
					dialog.title = "Select Ecore file..."
					dialog.allowMultiple = false
					dialog.addFilter(new ViewerFilter() {
						override select(Viewer viewer, Object parentElement, Object element) {
							return element instanceof IContainer || (element as IResource).fileExtension == "ecore"
						}
					})
					dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
					if (!value.empty) {
						dialog.initialSelection = ResourcesPlugin.workspace.root.getFile(new Path(value))
					}
					dialog.validator = new ISelectionStatusValidator() {
						override validate(Object[] selection) {
							if (selection.size == 1 && selection.get(0) instanceof IFile &&
								(selection.get(0) as IFile).fileExtension == "ecore") {
								return new Status(IStatus.OK, "Wizard", "")
							} else {
								return new Status(IStatus.ERROR, "Wizard", "Please, select an Ecore file")
							}
						}
					}
					dialog.open();
					if (dialog.firstResult !== null) {
						value = (dialog.firstResult as IResource).fullPath.toString
						refresh
					}
				}
			})
		}
	}
}
