package io.github.abelgomez.asyncapi.ui.wizard;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.WorkbenchException;
import org.eclipse.ui.progress.UIJob;
import org.eclipse.xtext.ui.wizard.IProjectInfo;
import org.eclipse.xtext.ui.wizard.template.TemplateNewProjectWizard;

import io.github.abelgomez.asyncapi.ui.internal.AsyncapiActivator;

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
		getShell().setSize(610, getShell().getSize().y);
	}
	
	@Override
	protected void doFinish(IProjectInfo projectInfo, IProgressMonitor monitor) {
		super.doFinish(projectInfo, monitor);
		new UIJob("Switching to Java perspective") {
			@Override
			public IStatus runInUIThread(IProgressMonitor monitor) {
				IWorkbench workbench = PlatformUI.getWorkbench();
				IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
				try {
					if (!JavaUI.ID_PERSPECTIVE.equals(window.getActivePage().getPerspective().getId()) &&
							MessageDialog.openQuestion(window.getShell(), "Switch to Java Perspective?", "This project type is associated to the Java perspective. Do you want to switch to it?")) {
						workbench.showPerspective(JavaUI.ID_PERSPECTIVE, window);
					}
				} catch (WorkbenchException e) {
					Status status = new Status(IStatus.ERROR, AsyncapiActivator.PLUGIN_ID, e.getMessage(), e);
					ErrorDialog.openError(window.getShell(), "Error", "Error while switching to the Java perspective", status);
					return status;
				}
				return Status.OK_STATUS;
			}
		}.schedule();
	}
}
