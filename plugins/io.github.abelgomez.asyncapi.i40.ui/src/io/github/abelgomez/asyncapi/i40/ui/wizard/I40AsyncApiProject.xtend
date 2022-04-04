package io.github.abelgomez.asyncapi.i40.ui.wizard

import io.github.abelgomez.asyncapi.i40.ui.I40UiPlugin
import io.github.abelgomez.asyncapi.ui.wizard.AbstractAsyncApiProjectTemplate
import org.eclipse.core.resources.IContainer
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.Path
import org.eclipse.core.runtime.Status
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
import org.eclipse.xtext.ui.wizard.template.ContainerTemplateVariable
import org.eclipse.xtext.ui.wizard.template.GroupTemplateVariable
import org.eclipse.xtext.ui.wizard.template.ParameterComposite
import org.eclipse.xtext.ui.wizard.template.StringTemplateVariable

import static org.eclipse.core.runtime.IStatus.*

import static extension io.github.abelgomez.asyncapi.generator.AsyncApi2Json.*
import static extension io.github.abelgomez.asyncapi.i40.m2m.Uml2AsyncApi.*

final class I40AsyncApiProject extends AbstractAsyncApiProjectTemplate  {
	val inputGroup = group3("Input file")
	val file = file("UML:", "", "Input UML file", inputGroup)

	override getLabel() {
		"AsyncAPI Project from I4.0 UML Model"
	}
	
	override getDescription() {
		"<p><b>I4.0 UML project</b></p><p>Creates a new AsyncAPI v2.0.0 project from an I4.0-annotated UML file. You can set the package the file is created in.</p>"
	}

	override protected updateVariables() {
		super.updateVariables
		file.enabled = false
	}

	override validate() {
		if (file.value.trim.isEmpty) {
			return new Status(ERROR, "Wizard", "Please specify a UML file")
		} else {
			val diagnose = diagnoseUmlFile(new Path(file.value))
			if (diagnose !== null) {
				return new Status(ERROR, "Wizard", "'" + file + "' is not a valid UML file: " + diagnose)
			} else {
				return super.validate
			}
		}
	}

	override createProjectFactory() {
		val modelFilePath = new Path(file.value)
		val diFilePath = modelFilePath.removeFileExtension.addFileExtension("di")
		val notationFilePath = modelFilePath.removeFileExtension.addFileExtension("notation")
		val model = loadModel(modelFilePath)
		super.createProjectFactory => [
			addFile('''«SRC_JAVA»/«path»/«modelFilePath.lastSegment»''', ResourcesPlugin.workspace.root.getFile(modelFilePath).readContents)
			if (ResourcesPlugin.workspace.root.getFile(diFilePath).exists) {
				addFile('''«SRC_JAVA»/«path»/«diFilePath.lastSegment»''', ResourcesPlugin.workspace.root.getFile(diFilePath).readContents)
				
			}
			if (ResourcesPlugin.workspace.root.getFile(notationFilePath).exists) {
				addFile('''«SRC_JAVA»/«path»/«notationFilePath.lastSegment»''', ResourcesPlugin.workspace.root.getFile(notationFilePath).readContents)
				
			}
			addFile('''«SRC_JAVA»/«path»/«model.name».asyncapi''', model.asyncApi.generate)
			addFile('''«SRC_JAVA»/main/Main.java''', I40UiPlugin.^default.bundle.getResource("resources/i40.project/Main.java").readContents)
		]
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
					dialog.title = "Select UML file..."
					dialog.allowMultiple = false
					dialog.addFilter(new ViewerFilter() {
						override select(Viewer viewer, Object parentElement, Object element) {
							return element instanceof IContainer || (element as IResource).fileExtension == "uml"
						}
					})
					dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
					if (!value.empty) {
						dialog.initialSelection = ResourcesPlugin.workspace.root.getFile(new Path(value))
					}
					dialog.validator = new ISelectionStatusValidator() {
						override validate(Object[] selection) {
							if (selection.size == 1 && selection.get(0) instanceof IFile &&
								(selection.get(0) as IFile).fileExtension == "uml") {
								return new Status(IStatus.OK, "Wizard", "")
							} else {
								return new Status(IStatus.ERROR, "Wizard", "Please, select a UML file")
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
