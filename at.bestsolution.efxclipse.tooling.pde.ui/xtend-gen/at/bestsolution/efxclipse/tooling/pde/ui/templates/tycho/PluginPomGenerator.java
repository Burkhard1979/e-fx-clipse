package at.bestsolution.efxclipse.tooling.pde.ui.templates.tycho;

import at.bestsolution.efxclipse.tooling.pde.ui.templates.tycho.PomData;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.DynamicFile;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.Generator;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class PluginPomGenerator implements Generator<DynamicFile> {
  public InputStream generate(final DynamicFile file, final Map<String,Object> data) {
    Object _get = data.get("BundleProject_projectName");
    final String projectName = ((String) _get);
    Object _get_1 = data.get("BundleProject_productName");
    final String productName = ((String) _get_1);
    Object _get_2 = data.get("BundleProject_bundleName");
    final String bundleName = ((String) _get_2);
    Object _get_3 = data.get("BundleProject_bundleId");
    final String bundleId = ((String) _get_3);
    Object _get_4 = data.get("BundleProject_bundleVersion");
    final String bundleVersion = ((String) _get_4);
    String _plus = (productName + " - ");
    String _plus_1 = (_plus + bundleName);
    String _pomGroupId = this.toPomGroupId(bundleId);
    String _pomGroupId_1 = this.toPomGroupId(bundleId);
    String _plus_2 = (bundleId + ".releng");
    String _pomVersion = this.toPomVersion(bundleVersion);
    String _plus_3 = ("../" + projectName);
    String _plus_4 = (_plus_3 + ".releng");
    PomData _pomData = new PomData(_plus_1, _pomGroupId, bundleId, _pomGroupId_1, _plus_2, _pomVersion, _plus_4);
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
