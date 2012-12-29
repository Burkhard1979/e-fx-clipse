package at.bestsolution.efxclipse.tooling.pde.ui.wizard.rcp.tpl;

import at.bestsolution.efxclipse.tooling.pde.ui.wizard.Util;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.DynamicFile;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.Generator;
import java.io.InputStream;
import java.util.Map;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ViewPartTpl implements Generator<DynamicFile> {
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
    _builder.newLine();
    _builder.append("import at.bestsolution.efxclipse.runtime.workbench3.FXViewPart;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import javafx.scene.Scene;");
    _builder.newLine();
    _builder.append("import javafx.scene.control.Button;");
    _builder.newLine();
    _builder.append("import javafx.scene.layout.BorderPane;");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class MainViewPart extends FXViewPart {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static final String ID = \"");
    _builder.append(bundleId, "	");
    _builder.append(".MainViewPart\";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private Button button;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected Scene createFxScene() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("BorderPane p = new BorderPane();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("button = new Button(\"Hello JavaFX/RCP\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("p.setCenter(button);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Scene s = new Scene(p);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return s;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected void setFxFocus() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("button.requestFocus();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    return _builder;
  }
}
