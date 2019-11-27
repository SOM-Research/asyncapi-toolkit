package io.github.abelgomez.asyncapi.ui.handlers;

import java.io.ByteArrayInputStream;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import io.github.abelgomez.asyncapi.generator.Ecore2AsyncApi;
import io.github.abelgomez.asyncapi.ui.internal.AsyncapiActivator;

public class GenerateAsyncApiHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		ISelection selection = window.getSelectionService().getSelection();
		if (selection != null & selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			IFile file = (IFile) structuredSelection.getFirstElement();
			EPackage ePackage = Ecore2AsyncApi.loadEPackage(file.getFullPath());
			if (ePackage != null) {
				String message = Ecore2AsyncApi.diagnose(ePackage);
				if (message != null) {
					ErrorDialog.openError(window.getShell(), "Error loading Ecore file", "Ecore file is invalid",
							new Status(IStatus.ERROR, AsyncapiActivator.PLUGIN_ID, message));
				} else {
					String resultFileName = ePackage.getName() + ".asyncapi";
					IFile resultFile = ResourcesPlugin.getWorkspace().getRoot().getFile(file.getFullPath().removeLastSegments(1).append(resultFileName));
					try {
						if (!resultFile.exists()) {
							resultFile.create(new ByteArrayInputStream(Ecore2AsyncApi.generate(ePackage).toString().getBytes()), IResource.FORCE | IResource.KEEP_HISTORY, new NullProgressMonitor());
						} else if (resultFile.exists() && MessageDialog.openQuestion(window.getShell(), "Target file already exists!", "Target file already exists. Overwrite?")) {
							resultFile.setContents(new ByteArrayInputStream(Ecore2AsyncApi.generate(ePackage).toString().getBytes()), IResource.FORCE | IResource.KEEP_HISTORY, new NullProgressMonitor());
						}
					} catch (CoreException e) {
						ErrorDialog.openError(window.getShell(), "Error", "Error while storing the AsyncAPI specification",
								new Status(IStatus.ERROR, AsyncapiActivator.PLUGIN_ID, e.getMessage(), e));
					}
				}
			} else {
				MessageDialog.openError(window.getShell(), "Error loading Ecore file", "Selected file does not seem to be a valid Ecore file (no EPackage found)");
			}
		}
		return null;
	}
}
