package at.bestsolution.efxclipse.tooling.pde.e4.project.template;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class SampleTestCaseGenerator {
  public CharSequence generate(final String packageName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import junit.framework.Assert;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.jemmy.fx.SceneDock;");
    _builder.newLine();
    _builder.append("import org.junit.BeforeClass;");
    _builder.newLine();
    _builder.append("import org.junit.Test;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class SampleTestCase {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected static SceneDock scene;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@BeforeClass");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void startApp() throws InterruptedException {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("scene = new SceneDock();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("} catch(Throwable t ) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("t.printStackTrace();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Test");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void sampleTestMethod() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Assert.fail(\"Not implemented\");");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
