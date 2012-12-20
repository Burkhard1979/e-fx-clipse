package at.bestsolution.efxclipse.tooling.pde.ui.templates.tycho;

import at.bestsolution.efxclipse.tooling.pde.ui.templates.tycho.JemmyPomData;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.DynamicFile;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.Generator;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.Variable;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class JemmyPomGenerator implements Generator<DynamicFile> {
  public String toPomGroupId(final String bundleId) {
    int _indexOf = bundleId.indexOf(".");
    int _minus = (-1);
    boolean _notEquals = (_indexOf != _minus);
    if (_notEquals) {
      int _lastIndexOf = bundleId.lastIndexOf(".");
      return bundleId.substring(0, _lastIndexOf);
    }
    return bundleId;
  }
  
  public String toPomVersion(final String version) {
    return version.replace(".qualifier", "-SNAPSHOT");
  }
  
  public InputStream generate(final DynamicFile file, final Map<String,Object> data) {
    EList<Variable> _variables = file.getVariables();
    final Function1<Variable,Boolean> _function = new Function1<Variable,Boolean>() {
        public Boolean apply(final Variable e) {
          String _key = e.getKey();
          boolean _equals = _key.equals("relengGroupId");
          return Boolean.valueOf(_equals);
        }
      };
    Variable _findFirst = IterableExtensions.<Variable>findFirst(_variables, _function);
    final String relengGroupId = _findFirst.getDefaultValue();
    EList<Variable> _variables_1 = file.getVariables();
    final Function1<Variable,Boolean> _function_1 = new Function1<Variable,Boolean>() {
        public Boolean apply(final Variable e) {
          String _key = e.getKey();
          boolean _equals = _key.equals("relengArtifactId");
          return Boolean.valueOf(_equals);
        }
      };
    Variable _findFirst_1 = IterableExtensions.<Variable>findFirst(_variables_1, _function_1);
    final String relengArtifactId = _findFirst_1.getDefaultValue();
    EList<Variable> _variables_2 = file.getVariables();
    final Function1<Variable,Boolean> _function_2 = new Function1<Variable,Boolean>() {
        public Boolean apply(final Variable e) {
          String _key = e.getKey();
          boolean _equals = _key.equals("baseVersion");
          return Boolean.valueOf(_equals);
        }
      };
    Variable _findFirst_2 = IterableExtensions.<Variable>findFirst(_variables_2, _function_2);
    String _defaultValue = _findFirst_2.getDefaultValue();
    final String relengVersion = this.toPomVersion(_defaultValue);
    EList<Variable> _variables_3 = file.getVariables();
    final Function1<Variable,Boolean> _function_3 = new Function1<Variable,Boolean>() {
        public Boolean apply(final Variable e) {
          String _key = e.getKey();
          boolean _equals = _key.equals("relengPath");
          return Boolean.valueOf(_equals);
        }
      };
    Variable _findFirst_3 = IterableExtensions.<Variable>findFirst(_variables_3, _function_3);
    final String relengPath = _findFirst_3.getDefaultValue();
    EList<Variable> _variables_4 = file.getVariables();
    final Function1<Variable,Boolean> _function_4 = new Function1<Variable,Boolean>() {
        public Boolean apply(final Variable e) {
          String _key = e.getKey();
          boolean _equals = _key.equals("groupId");
          return Boolean.valueOf(_equals);
        }
      };
    Variable _findFirst_4 = IterableExtensions.<Variable>findFirst(_variables_4, _function_4);
    final String groupId = _findFirst_4.getDefaultValue();
    EList<Variable> _variables_5 = file.getVariables();
    final Function1<Variable,Boolean> _function_5 = new Function1<Variable,Boolean>() {
        public Boolean apply(final Variable e) {
          String _key = e.getKey();
          boolean _equals = _key.equals("artifactId");
          return Boolean.valueOf(_equals);
        }
      };
    Variable _findFirst_5 = IterableExtensions.<Variable>findFirst(_variables_5, _function_5);
    final String artifactId = _findFirst_5.getDefaultValue();
    EList<Variable> _variables_6 = file.getVariables();
    final Function1<Variable,Boolean> _function_6 = new Function1<Variable,Boolean>() {
        public Boolean apply(final Variable e) {
          String _key = e.getKey();
          boolean _equals = _key.equals("name");
          return Boolean.valueOf(_equals);
        }
      };
    Variable _findFirst_6 = IterableExtensions.<Variable>findFirst(_variables_6, _function_6);
    final String name = _findFirst_6.getDefaultValue();
    EList<Variable> _variables_7 = file.getVariables();
    final Function1<Variable,Boolean> _function_7 = new Function1<Variable,Boolean>() {
        public Boolean apply(final Variable e) {
          String _key = e.getKey();
          boolean _equals = _key.equals("testBundleId");
          return Boolean.valueOf(_equals);
        }
      };
    Variable _findFirst_7 = IterableExtensions.<Variable>findFirst(_variables_7, _function_7);
    final String testSuiteBundle = _findFirst_7.getDefaultValue();
    EList<Variable> _variables_8 = file.getVariables();
    final Function1<Variable,Boolean> _function_8 = new Function1<Variable,Boolean>() {
        public Boolean apply(final Variable e) {
          String _key = e.getKey();
          boolean _equals = _key.equals("testSuite");
          return Boolean.valueOf(_equals);
        }
      };
    Variable _findFirst_8 = IterableExtensions.<Variable>findFirst(_variables_8, _function_8);
    final String testSuiteClass = _findFirst_8.getDefaultValue();
    EList<Variable> _variables_9 = file.getVariables();
    final Function1<Variable,Boolean> _function_9 = new Function1<Variable,Boolean>() {
        public Boolean apply(final Variable e) {
          String _key = e.getKey();
          boolean _equals = _key.equals("testProductId");
          return Boolean.valueOf(_equals);
        }
      };
    Variable _findFirst_9 = IterableExtensions.<Variable>findFirst(_variables_9, _function_9);
    final String testProductId = _findFirst_9.getDefaultValue();
    EList<Variable> _variables_10 = file.getVariables();
    final Function1<Variable,Boolean> _function_10 = new Function1<Variable,Boolean>() {
        public Boolean apply(final Variable e) {
          String _key = e.getKey();
          boolean _equals = _key.equals("testProductFeature");
          return Boolean.valueOf(_equals);
        }
      };
    Variable _findFirst_10 = IterableExtensions.<Variable>findFirst(_variables_10, _function_10);
    final String applicationFeature = _findFirst_10.getDefaultValue();
    JemmyPomData _jemmyPomData = new JemmyPomData(name, groupId, artifactId, relengGroupId, relengArtifactId, relengVersion, relengPath, testSuiteBundle, testSuiteClass, testProductId, applicationFeature);
    final JemmyPomData pomData = _jemmyPomData;
    CharSequence _generate = this.generate(pomData);
    String _string = _generate.toString();
    byte[] _bytes = _string.getBytes();
    ByteArrayInputStream _byteArrayInputStream = new ByteArrayInputStream(_bytes);
    return _byteArrayInputStream;
  }
  
  public CharSequence generate(final JemmyPomData data) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<project xmlns=\"http://maven.apache.org/POM/4.0.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<modelVersion>4.0.0</modelVersion>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<name>");
    String _description = data.getDescription();
    _builder.append(_description, "	");
    _builder.append("</name>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<groupId>");
    String _groupId = data.getGroupId();
    _builder.append(_groupId, "	");
    _builder.append("</groupId>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<artifactId>");
    String _artifactId = data.getArtifactId();
    _builder.append(_artifactId, "	");
    _builder.append("</artifactId>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<packaging>eclipse-test-plugin</packaging>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<parent>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<groupId>");
    String _parentGroupId = data.getParentGroupId();
    _builder.append(_parentGroupId, "		");
    _builder.append("</groupId>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<artifactId>");
    String _parentArtifactId = data.getParentArtifactId();
    _builder.append(_parentArtifactId, "		");
    _builder.append("</artifactId>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<relativePath>");
    String _parentPomPath = data.getParentPomPath();
    _builder.append(_parentPomPath, "		");
    _builder.append("/pom.xml</relativePath>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<version>");
    String _parentVersion = data.getParentVersion();
    _builder.append(_parentVersion, "		");
    _builder.append("</version>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("</parent>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<build>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<plugins>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<plugin>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<groupId>org.eclipse.tycho</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<artifactId>tycho-surefire-plugin</artifactId>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<version>${tycho-version}</version>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<configuration>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<testSuite>");
    String _testSuiteBundle = data.getTestSuiteBundle();
    _builder.append(_testSuiteBundle, "					");
    _builder.append("</testSuite>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t\t");
    _builder.append("<testClass>");
    String _testSuiteClass = data.getTestSuiteClass();
    _builder.append(_testSuiteClass, "					");
    _builder.append("</testClass>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t\t");
    _builder.append("<useUIHarness>false</useUIHarness>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<useUIThread>false</useUIThread>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<argLine>-Xms40m -Xmx512m -Defxclipse.osgi.hook.debug=true -Dosgi.framework.extensions=at.bestsolution.efxclipse.runtime.osgi -Dtest.jemmy.product=");
    String _testProductId = data.getTestProductId();
    _builder.append(_testProductId, "					");
    _builder.append("</argLine>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t\t");
    _builder.append("<appArgLine>-consoleLog -nosplash -console</appArgLine>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<application>org.eclipse.pde.junit.runtime.coretestapplication</application>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<dependencies>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("<type>eclipse-feature</type>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("<artifactId>");
    String _applicationFeature = data.getApplicationFeature();
    _builder.append(_applicationFeature, "							");
    _builder.append("</artifactId>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("<version>0.0.0</version>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("</dependencies>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<frameworkExtensions>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("<frameworkExtension>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("<groupId>at.bestsolution.efxclipse</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("<artifactId>at.bestsolution.efxclipse.runtime.osgi</artifactId>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("<version>${efx-version}</version>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("</frameworkExtension>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("</frameworkExtensions>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</configuration>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<executions>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<execution>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("<phase>test</phase>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("<goals>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("<goal>test</goal>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("</goals>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("</execution>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</executions>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</plugin>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<plugin>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<groupId>org.eclipse.tycho</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<artifactId>tycho-maven-plugin</artifactId>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<version>${tycho-version}</version>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<extensions>true</extensions>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</plugin>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<plugin>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<groupId>org.eclipse.tycho</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<artifactId>target-platform-configuration</artifactId>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<version>${tycho-version}</version>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<configuration>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<resolver>p2</resolver>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</configuration>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</plugin>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</plugins>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</build>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<dependencies>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<groupId>junit</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<artifactId>junit</artifactId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<scope>test</scope>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</dependencies>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("</project>");
    _builder.newLine();
    return _builder;
  }
}
