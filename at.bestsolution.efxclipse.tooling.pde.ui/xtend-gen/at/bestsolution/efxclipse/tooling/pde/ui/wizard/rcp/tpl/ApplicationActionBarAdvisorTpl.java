package at.bestsolution.efxclipse.tooling.pde.ui.wizard.rcp.tpl;

import at.bestsolution.efxclipse.tooling.pde.ui.wizard.Util;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.DynamicFile;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.Generator;
import java.io.InputStream;
import java.util.Map;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ApplicationActionBarAdvisorTpl implements Generator<DynamicFile> {
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
    _builder.newLine();
    _builder.append("import org.eclipse.jface.action.IMenuManager;");
    _builder.newLine();
    _builder.append("import org.eclipse.ui.IWorkbenchWindow;");
    _builder.newLine();
    _builder.append("import org.eclipse.ui.application.ActionBarAdvisor;");
    _builder.newLine();
    _builder.append("import org.eclipse.ui.application.IActionBarConfigurer;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ApplicationActionBarAdvisor extends ActionBarAdvisor {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("super(configurer);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected void makeActions(IWorkbenchWindow window) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected void fillMenuBar(IMenuManager menuBar) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("}");
    return _builder;
  }
}
