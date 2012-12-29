package at.bestsolution.efxclipse.tooling.pde.ui.wizard.rcp.tpl;

import at.bestsolution.efxclipse.tooling.pde.ui.wizard.Util;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.DynamicFile;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.Generator;
import java.io.InputStream;
import java.util.Map;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ApplicationWorkbenchWindowAdvisorTpl implements Generator<DynamicFile> {
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
    _builder.append("import org.eclipse.swt.graphics.Point;");
    _builder.newLine();
    _builder.append("import org.eclipse.ui.application.ActionBarAdvisor;");
    _builder.newLine();
    _builder.append("import org.eclipse.ui.application.IActionBarConfigurer;");
    _builder.newLine();
    _builder.append("import org.eclipse.ui.application.IWorkbenchWindowConfigurer;");
    _builder.newLine();
    _builder.append("import org.eclipse.ui.application.WorkbenchWindowAdvisor;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ApplicationWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ApplicationWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("super(configurer);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ActionBarAdvisor createActionBarAdvisor(IActionBarConfigurer configurer) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return new ApplicationActionBarAdvisor(configurer);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void preWindowOpen() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("IWorkbenchWindowConfigurer configurer = getWindowConfigurer();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("configurer.setInitialSize(new Point(400, 300));");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("configurer.setShowCoolBar(false);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("configurer.setShowStatusLine(false);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("configurer.setTitle(\"My RCP Application\"); //$$NON-NLS-1$$");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
