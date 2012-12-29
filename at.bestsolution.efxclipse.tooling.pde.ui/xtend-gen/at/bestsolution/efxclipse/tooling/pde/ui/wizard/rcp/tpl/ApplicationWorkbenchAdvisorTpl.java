package at.bestsolution.efxclipse.tooling.pde.ui.wizard.rcp.tpl;

import at.bestsolution.efxclipse.tooling.pde.ui.wizard.Util;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.DynamicFile;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.Generator;
import java.io.InputStream;
import java.util.Map;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ApplicationWorkbenchAdvisorTpl implements Generator<DynamicFile> {
  public InputStream generate(final DynamicFile file, final Map<String,Object> data) {
    final String packageName = Util.getCuPackagename(file);
    CharSequence _generate = this.generate(packageName);
    return Util.toStream(_generate);
  }
  
  public CharSequence generate(final String packageName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("import org.eclipse.ui.application.IWorkbenchWindowConfigurer;");
    _builder.newLine();
    _builder.append("import org.eclipse.ui.application.WorkbenchAdvisor;");
    _builder.newLine();
    _builder.append("import org.eclipse.ui.application.WorkbenchWindowAdvisor;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ApplicationWorkbenchAdvisor extends WorkbenchAdvisor {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private static final String PERSPECTIVE_ID = \"$pluginId$.perspective\"; //$$NON-NLS-1$$");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return new ApplicationWorkbenchWindowAdvisor(configurer);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public String getInitialWindowPerspectiveId() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return PERSPECTIVE_ID;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    return _builder;
  }
}
