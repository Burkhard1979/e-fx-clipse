package at.bestsolution.efxclipse.tooling.pde.ui.wizard.app.tpl;

import at.bestsolution.efxclipse.tooling.rrobot.model.task.CompilationUnit;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.DynamicFile;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.Generator;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class DIApplicationClassTpl implements Generator<DynamicFile> {
  public InputStream generate(final DynamicFile file, final Map<String,Object> data) {
    EObject _eContainer = file.eContainer();
    final CompilationUnit cu = ((CompilationUnit) _eContainer);
    String _packagename = cu.getPackagename();
    CharSequence _generate = this.generate(_packagename);
    String _string = _generate.toString();
    byte[] _bytes = _string.getBytes();
    ByteArrayInputStream _byteArrayInputStream = new ByteArrayInputStream(_bytes);
    return _byteArrayInputStream;
  }
  
  public CharSequence generate(final String packageName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import javafx.scene.Scene;");
    _builder.newLine();
    _builder.append("import javafx.scene.control.Label;");
    _builder.newLine();
    _builder.append("import javafx.stage.Stage;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import javax.annotation.PostConstruct;");
    _builder.newLine();
    _builder.append("import javax.inject.Inject;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipse.equinox.app.IApplicationContext;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class MainApplication {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Inject");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public MainApplication() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@PostConstruct");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("void run(IApplicationContext applicationContext, javafx.application.Application jfxApplication, Stage primaryStage) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Scene s = new Scene(new Label(\"Hello World\"));");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("primaryStage.setScene(s);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("primaryStage.setWidth(300);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("primaryStage.setHeight(400);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("primaryStage.setTitle(\"$windowTitle$\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("primaryStage.show();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
