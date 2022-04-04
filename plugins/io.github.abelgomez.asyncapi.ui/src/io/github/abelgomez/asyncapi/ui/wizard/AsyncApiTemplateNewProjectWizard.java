package io.github.abelgomez.asyncapi.ui.wizard;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.xtext.ui.wizard.template.TemplateNewProjectWizard;

public class AsyncApiTemplateNewProjectWizard extends TemplateNewProjectWizard {

	@Override
	public boolean canFinish() {
		AbstractAsyncApiProjectTemplate selectedTemplate = (AbstractAsyncApiProjectTemplate) templatePage.getSelectedTemplate();
		IStatus status = selectedTemplate.validate();
		if (status != null && !status.isOK()) {
			if (templatePage == null) {
				templatePage.setErrorMessage(status.getMessage());
			}
			return false;
		}
		templatePage.setErrorMessage(null);
		return super.canFinish() && (templateParameterPage == null ? true : templateParameterPage.isPageComplete());
	}
	
	@Override
	public void createPageControls(Composite pageContainer) {
		super.createPageControls(pageContainer);
		getShell().setMinimumSize(610, 320);
	}
}
