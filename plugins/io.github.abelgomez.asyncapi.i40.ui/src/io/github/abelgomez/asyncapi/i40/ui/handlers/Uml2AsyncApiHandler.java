package io.github.abelgomez.asyncapi.i40.ui.handlers;

import java.io.ByteArrayInputStream;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.uml2.uml.Model;

import io.github.abelgomez.asyncapi.generator.AsyncApi2Json;
import io.github.abelgomez.asyncapi.i40.m2m.Uml2AsyncApi;
import io.github.abelgomez.asyncapi.i40.ui.I40UiPlugin;
import io.github.abelgomez.asyncapi.ui.internal.AsyncapiActivator;

public class Uml2AsyncApiHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		ISelection selection = window.getSelectionService().getSelection();
		if (selection != null & selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			IFile file = ((IAdaptable) structuredSelection.getFirstElement()).getAdapter(IFile.class);
			
			Model model= Uml2AsyncApi.loadModel(file.getFullPath());
			if (model != null) {
				String message = Uml2AsyncApi.diagnose(model);
				if (message != null) {
					ErrorDialog.openError(window.getShell(), "Error loading UML file", "UML file is invalid",
							new Status(IStatus.ERROR, I40UiPlugin.PLUGIN_ID, message));
				} else {
					String resultFileName = file.getFullPath().removeFileExtension().lastSegment() + ".asyncapi";
					IFile resultFile = ResourcesPlugin.getWorkspace().getRoot().getFile(file.getFullPath().removeLastSegments(1).append(resultFileName));
					try {
						byte[] contents = AsyncApi2Json.generate(Uml2AsyncApi.asyncApi(model)).toString().getBytes();
						if (!resultFile.exists()) {
							resultFile.create(new ByteArrayInputStream(contents), IResource.FORCE | IResource.KEEP_HISTORY, new NullProgressMonitor());
						} else if (resultFile.exists() && MessageDialog.openQuestion(window.getShell(), "Target file already exists!", "Target file already exists. Overwrite?")) {
							resultFile.setContents(new ByteArrayInputStream(contents), IResource.FORCE | IResource.KEEP_HISTORY, new NullProgressMonitor());
						}
					} catch (CoreException e) {
						ErrorDialog.openError(window.getShell(), "Error", "Error while storing the AsyncAPI specification",
								new Status(IStatus.ERROR, AsyncapiActivator.PLUGIN_ID, e.getMessage(), e));
					}
				}
			} else {
				MessageDialog.openError(window.getShell(), "Error loading UML file", "Selected file does not seem to be a valid UML file (no profile application found)");
			}
		}
		return null;
	}
}
