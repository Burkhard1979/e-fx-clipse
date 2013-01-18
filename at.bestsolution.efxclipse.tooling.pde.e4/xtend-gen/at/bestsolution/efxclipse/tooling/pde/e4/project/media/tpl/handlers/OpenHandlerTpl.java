package at.bestsolution.efxclipse.tooling.pde.e4.project.media.tpl.handlers;

import at.bestsolution.efxclipse.tooling.rrobot.model.task.CompilationUnit;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.DynamicFile;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.Generator;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class OpenHandlerTpl implements Generator<DynamicFile> {
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
    _builder.append("import java.lang.reflect.InvocationTargetException;");
    _builder.newLine();
    _builder.append("import java.util.UUID;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipse.e4.core.di.annotations.Execute;");
    _builder.newLine();
    _builder.append("import org.eclipse.e4.core.services.events.IEventBroker;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@SuppressWarnings(\"restriction\")");
    _builder.newLine();
    _builder.append("public class OpenHandler {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static final String OPEN_EVENT = \"media/open\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Execute");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void execute(IEventBroker broker)");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("throws InvocationTargetException, InterruptedException {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("broker.send(OPEN_EVENT, UUID.randomUUID().toString());");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    return _builder;
  }
}
