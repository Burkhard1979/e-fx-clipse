package at.bestsolution.efxclipse.tooling.pde.e4.project.template;

import at.bestsolution.efxclipse.tooling.rrobot.model.task.CompilationUnit;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.File;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.Generator;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class TestSuiteGenerator implements Generator<File> {
  public InputStream generate(final File file, final Map<String,Object> data) {
    EObject _eContainer = file.eContainer();
    final CompilationUnit cp = ((CompilationUnit) _eContainer);
    String _packagename = cp.getPackagename();
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
    _builder.append("import org.junit.runner.RunWith;");
    _builder.newLine();
    _builder.append("import org.junit.runners.Suite;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import at.bestsolution.efxclipse.runtime.jemmy.OSGiJemmyBootstrapTestCase;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@RunWith(Suite.class)");
    _builder.newLine();
    _builder.append("@Suite.SuiteClasses({ SampleTestCase.class })");
    _builder.newLine();
    _builder.append("public class TestSuite extends OSGiJemmyBootstrapTestCase {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
