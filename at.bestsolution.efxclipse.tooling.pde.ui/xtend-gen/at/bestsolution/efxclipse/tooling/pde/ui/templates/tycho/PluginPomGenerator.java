package at.bestsolution.efxclipse.tooling.pde.ui.templates.tycho;

import at.bestsolution.efxclipse.tooling.pde.ui.templates.tycho.PomData;
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
public class PluginPomGenerator implements Generator<DynamicFile> {
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
    PomData _pomData = new PomData(name, groupId, artifactId, relengGroupId, relengArtifactId, relengVersion, relengPath);
    final PomData pomData = _pomData;
    CharSequence _generate = this.generate(pomData);
    String _string = _generate.toString();
    byte[] _bytes = _string.getBytes();
    ByteArrayInputStream _byteArrayInputStream = new ByteArrayInputStream(_bytes);
    return _byteArrayInputStream;
  }
  
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
  
  public CharSequence generate(final PomData data) {
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
    _builder.append("<packaging>eclipse-plugin</packaging>");
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
    _builder.append("<resources>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<resource>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<directory>.</directory>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<includes>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<include>META-INF/</include>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</includes>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</resource>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</resources>");
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
    _builder.append("<artifactId>tycho-source-plugin</artifactId>");
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
    _builder.append("</project>");
    _builder.newLine();
    return _builder;
  }
}
