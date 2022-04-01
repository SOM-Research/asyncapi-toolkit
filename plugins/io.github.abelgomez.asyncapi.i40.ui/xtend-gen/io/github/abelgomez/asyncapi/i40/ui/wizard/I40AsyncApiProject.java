package io.github.abelgomez.asyncapi.i40.ui.wizard;

import com.google.common.base.Objects;
import io.github.abelgomez.asyncapi.generator.AsyncApi2Json;
import io.github.abelgomez.asyncapi.i40.m2m.Uml2AsyncApi;
import io.github.abelgomez.asyncapi.ui.wizard.AbstractAsyncApiProjectTemplate;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.uml2.uml.Model;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.ui.util.PluginProjectFactory;
import org.eclipse.xtext.ui.wizard.template.ContainerTemplateVariable;
import org.eclipse.xtext.ui.wizard.template.GroupTemplateVariable;
import org.eclipse.xtext.ui.wizard.template.ParameterComposite;
import org.eclipse.xtext.ui.wizard.template.StringTemplateVariable;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public final class I40AsyncApiProject extends AbstractAsyncApiProjectTemplate {
  public static class Group3TemplateVariable extends GroupTemplateVariable {
    public Group3TemplateVariable(final String label, final String description, final ContainerTemplateVariable container) {
      super(label, description, container);
    }
    
    @Override
    public void createWidget(final ParameterComposite parameterComposite, final Composite parent) {
      super.createWidget(parameterComposite, parent);
      Composite _widget = this.getWidget();
      GridLayout _gridLayout = new GridLayout(3, false);
      _widget.setLayout(_gridLayout);
    }
  }
  
  public static class FileTemplateVariable extends StringTemplateVariable {
    private Button button;
    
    public FileTemplateVariable(final String label, final String defaultValue, final String description, final ContainerTemplateVariable container) {
      super(label, defaultValue, description, container);
    }
    
    @Override
    public void createWidget(final ParameterComposite parameterComposite, final Composite parent) {
      super.createWidget(parameterComposite, parent);
      Button _button = new Button(parent, SWT.NONE);
      this.button = _button;
      this.button.setText("Browse...");
      this.button.addSelectionListener(new SelectionAdapter() {
        @Override
        public void widgetSelected(final SelectionEvent e) {
          Shell _shell = parent.getShell();
          WorkbenchLabelProvider _workbenchLabelProvider = new WorkbenchLabelProvider();
          BaseWorkbenchContentProvider _baseWorkbenchContentProvider = new BaseWorkbenchContentProvider();
          final ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(_shell, _workbenchLabelProvider, _baseWorkbenchContentProvider);
          dialog.setTitle("Select UML file...");
          dialog.setAllowMultiple(false);
          dialog.addFilter(new ViewerFilter() {
            @Override
            public boolean select(final Viewer viewer, final Object parentElement, final Object element) {
              return ((element instanceof IContainer) || Objects.equal(((IResource) element).getFileExtension(), "uml"));
            }
          });
          dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
          boolean _isEmpty = FileTemplateVariable.this.getValue().isEmpty();
          boolean _not = (!_isEmpty);
          if (_not) {
            IWorkspaceRoot _root = ResourcesPlugin.getWorkspace().getRoot();
            String _value = FileTemplateVariable.this.getValue();
            Path _path = new Path(_value);
            dialog.setInitialSelection(_root.getFile(_path));
          }
          dialog.setValidator(new ISelectionStatusValidator() {
            @Override
            public IStatus validate(final Object[] selection) {
              if ((((((List<Object>)Conversions.doWrapArray(selection)).size() == 1) && (selection[0] instanceof IFile)) && 
                Objects.equal(((IFile) selection[0]).getFileExtension(), "uml"))) {
                return new Status(IStatus.OK, "Wizard", "");
              } else {
                return new Status(IStatus.ERROR, "Wizard", "Please, select a UML file");
              }
            }
          });
          dialog.open();
          Object _firstResult = dialog.getFirstResult();
          boolean _tripleNotEquals = (_firstResult != null);
          if (_tripleNotEquals) {
            Object _firstResult_1 = dialog.getFirstResult();
            FileTemplateVariable.this.setValue(((IResource) _firstResult_1).getFullPath().toString());
            FileTemplateVariable.this.refresh();
          }
        }
      });
    }
  }
  
  private final I40AsyncApiProject.Group3TemplateVariable inputGroup = this.group3("Input file");
  
  private final I40AsyncApiProject.FileTemplateVariable file = this.file("UML:", "", "Input UML file", this.inputGroup);
  
  @Override
  public String getLabel() {
    return "AsyncAPI Project from I4.0 UML Model";
  }
  
  @Override
  public String getDescription() {
    return "<p><b>I4.0 UML project</b></p><p>Creates a new AsyncAPI v2.0.0 project from an I4.0-annotated UML file. You can set the package the file is created in.</p>";
  }
  
  @Override
  protected void updateVariables() {
    super.updateVariables();
    this.file.setEnabled(false);
  }
  
  @Override
  public IStatus validate() {
    boolean _isEmpty = this.file.getValue().trim().isEmpty();
    if (_isEmpty) {
      return new Status(IStatus.ERROR, "Wizard", "Please specify a UML file");
    } else {
      String _value = this.file.getValue();
      Path _path = new Path(_value);
      final String diagnose = Uml2AsyncApi.diagnoseUmlFile(_path);
      if ((diagnose != null)) {
        return new Status(IStatus.ERROR, "Wizard", ((("\'" + this.file) + "\' is not a valid UML file: ") + diagnose));
      } else {
        return super.validate();
      }
    }
  }
  
  @Override
  public PluginProjectFactory createProjectFactory() {
    PluginProjectFactory _xblockexpression = null;
    {
      String _value = this.file.getValue();
      final Path modelFilePath = new Path(_value);
      final IPath diFilePath = modelFilePath.removeFileExtension().addFileExtension("di");
      final IPath notationFilePath = modelFilePath.removeFileExtension().addFileExtension("notation");
      final Model model = Uml2AsyncApi.loadModel(modelFilePath);
      PluginProjectFactory _createProjectFactory = super.createProjectFactory();
      final Procedure1<PluginProjectFactory> _function = new Procedure1<PluginProjectFactory>() {
        @Override
        public void apply(final PluginProjectFactory it) {
          try {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("�SRC_JAVA�/�path�/�modelFilePath.lastSegment�");
            InputStream _contents = ResourcesPlugin.getWorkspace().getRoot().getFile(modelFilePath).getContents();
            InputStreamReader _inputStreamReader = new InputStreamReader(_contents);
            I40AsyncApiProject.this.addFile(it, _builder, 
              new BufferedReader(_inputStreamReader).lines().collect(Collectors.joining(System.lineSeparator())));
            boolean _exists = ResourcesPlugin.getWorkspace().getRoot().getFile(diFilePath).exists();
            if (_exists) {
              StringConcatenation _builder_1 = new StringConcatenation();
              _builder_1.append("�SRC_JAVA�/�path�/�diFilePath.lastSegment�");
              InputStream _contents_1 = ResourcesPlugin.getWorkspace().getRoot().getFile(diFilePath).getContents();
              InputStreamReader _inputStreamReader_1 = new InputStreamReader(_contents_1);
              I40AsyncApiProject.this.addFile(it, _builder_1, 
                new BufferedReader(_inputStreamReader_1).lines().collect(Collectors.joining(System.lineSeparator())));
            }
            boolean _exists_1 = ResourcesPlugin.getWorkspace().getRoot().getFile(notationFilePath).exists();
            if (_exists_1) {
              StringConcatenation _builder_2 = new StringConcatenation();
              _builder_2.append("�SRC_JAVA�/�path�/�notationFilePath.lastSegment�");
              InputStream _contents_2 = ResourcesPlugin.getWorkspace().getRoot().getFile(notationFilePath).getContents();
              InputStreamReader _inputStreamReader_2 = new InputStreamReader(_contents_2);
              I40AsyncApiProject.this.addFile(it, _builder_2, 
                new BufferedReader(_inputStreamReader_2).lines().collect(Collectors.joining(System.lineSeparator())));
            }
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.append("�SRC_JAVA�/�path�/�new Path(file.value).lastSegment�");
            IWorkspaceRoot _root = ResourcesPlugin.getWorkspace().getRoot();
            String _value = I40AsyncApiProject.this.file.getValue();
            Path _path = new Path(_value);
            InputStream _contents_3 = _root.getFile(_path).getContents();
            InputStreamReader _inputStreamReader_3 = new InputStreamReader(_contents_3);
            I40AsyncApiProject.this.addFile(it, _builder_3, 
              new BufferedReader(_inputStreamReader_3).lines().collect(Collectors.joining(System.lineSeparator())));
            StringConcatenation _builder_4 = new StringConcatenation();
            _builder_4.append("�SRC_JAVA�/�path�/�model.name�.asyncapi");
            I40AsyncApiProject.this.addFile(it, _builder_4, AsyncApi2Json.generate(Uml2AsyncApi.asyncApi(model)));
            StringConcatenation _builder_5 = new StringConcatenation();
            _builder_5.append("�SRC_JAVA�/main/Main.java");
            StringConcatenation _builder_6 = new StringConcatenation();
            _builder_6.append("package main;");
            _builder_6.newLine();
            _builder_6.newLine();
            _builder_6.append("public class Main {");
            _builder_6.newLine();
            _builder_6.append("\t");
            _builder_6.append("public static void main(String[] args) throws Exception {");
            _builder_6.newLine();
            _builder_6.append("\t\t");
            _builder_6.append("// TODO: Put your code here");
            _builder_6.newLine();
            _builder_6.append("\t");
            _builder_6.append("}");
            _builder_6.newLine();
            _builder_6.append("}");
            _builder_6.newLine();
            I40AsyncApiProject.this.addFile(it, _builder_5, _builder_6);
          } catch (Throwable _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        }
      };
      _xblockexpression = ObjectExtensions.<PluginProjectFactory>operator_doubleArrow(_createProjectFactory, _function);
    }
    return _xblockexpression;
  }
  
  protected I40AsyncApiProject.Group3TemplateVariable group3(final String name) {
    final I40AsyncApiProject.Group3TemplateVariable variable = new I40AsyncApiProject.Group3TemplateVariable(name, null, null);
    this.variables.add(variable);
    return variable;
  }
  
  protected I40AsyncApiProject.FileTemplateVariable file(final String name, final String defaultValue, final String description, final ContainerTemplateVariable container) {
    final I40AsyncApiProject.FileTemplateVariable variable = new I40AsyncApiProject.FileTemplateVariable(name, defaultValue, description, container);
    this.variables.add(variable);
    return variable;
  }
}
