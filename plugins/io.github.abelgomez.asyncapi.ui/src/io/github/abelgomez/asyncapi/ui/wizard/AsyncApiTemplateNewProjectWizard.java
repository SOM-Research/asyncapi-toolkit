package io.github.abelgomez.asyncapi.ui.wizard;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.xtext.ui.wizard.template.TemplateNewProjectWizard;

public class AsyncApiTemplateNewProjectWizard extends TemplateNewProjectWizard {

	@Override
	public boolean canFinish() {
		if (templatePage.getSelectedTemplate() instanceof EcoreAsyncApiProject) {
			EcoreAsyncApiProject selectedTemplate = (EcoreAsyncApiProject) templatePage.getSelectedTemplate();
			IStatus status = selectedTemplate.validate();
			if (status != null && !status.isOK()) { 
				templatePage.setErrorMessage(status.getMessage());
				return false;
			}
		}
		templatePage.setErrorMessage(null);
		return super.canFinish() && (templateParameterPage == null ? true : templateParameterPage.isPageComplete());
	}
}
