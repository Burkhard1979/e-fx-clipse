package at.bestsolution.efxclipse.tooling.pde.e4.project.template;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class TestSuiteGenerator {
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
