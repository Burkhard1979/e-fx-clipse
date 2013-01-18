package at.bestsolution.efxclipse.tooling.pde.ui.wizard.rcp.tpl;

import at.bestsolution.efxclipse.tooling.pde.ui.wizard.Util;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.DynamicFile;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.Generator;
import java.io.InputStream;
import java.util.Map;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class PerspectiveTpl implements Generator<DynamicFile> {
  public InputStream generate(final DynamicFile file, final Map<String,Object> data) {
    final String bundleId = Util.getVariableValue(file, "bundleId");
    final String packageName = Util.getCuPackagename(file);
    CharSequence _generate = this.generate(bundleId, packageName);
    return Util.toStream(_generate);
  }
  
  public CharSequence generate(final String bundleId, final String packageName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("import org.eclipse.ui.IPageLayout;");
    _builder.newLine();
    _builder.append("import org.eclipse.ui.IPerspectiveFactory;");
    _builder.newLine();
    _builder.append("import ");
    _builder.append(bundleId, "");
    _builder.append(".views.ViewPart;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class Perspective implements IPerspectiveFactory {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void createInitialLayout(IPageLayout layout) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("layout.setEditorAreaVisible(false);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("layout.addStandaloneView(ViewPart.ID, false, IPageLayout.LEFT, 1.0f, layout.getEditorArea());");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
