package at.bestsolution.efxclipse.tooling.jdt.ui.internal.handler;

import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.JFXBuildConfigurationEditor.BuildPropertyBean;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.JFXBuildConfigurationEditor.BuildPropertyIcon;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.JFXBuildConfigurationEditor.BuildPropertyManifestAttr;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.JFXBuildConfigurationEditor.BuildPropertySplash;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTask;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.handler.SetupDirectory;
import com.google.common.base.Objects;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class AntTemplate {
  public String generateAnt(final Map<String,Object> properties, final AntTask task) {
    String _xblockexpression = null;
    {
      Object _get = properties.get("projectName");
      final String projectName = ((String) _get);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<project name=\"");
      _builder.append(projectName, "	");
      _builder.append("\" default=\"do-deploy\" basedir=\".\"  xmlns:fx=\"javafx:com.sun.javafx.tools.ant\">");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      CharSequence _createInitTaskTarget = this.createInitTaskTarget(properties);
      _builder.append(_createInitTaskTarget, "	");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      CharSequence _createLocalSetup = this.createLocalSetup(properties);
      _builder.append(_createLocalSetup, "	");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      CharSequence _compileTarget = this.compileTarget(properties);
      _builder.append(_compileTarget, "	");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      CharSequence _createDoDeployTarget = this.createDoDeployTarget(properties);
      _builder.append(_createDoDeployTarget, "	");
      _builder.newLineIfNotEmpty();
      _builder.append("</project>");
      _builder.newLine();
      String _string = _builder.toString();
      _xblockexpression = (_string);
    }
    return _xblockexpression;
  }
  
  public CharSequence createLocalSetup(final Map<String,Object> properties) {
    CharSequence _xblockexpression = null;
    {
      Object _get = properties.get("orig.externalLibs");
      final Collection<File> externalLibs = ((Collection<File>) _get);
      Object _get_1 = properties.get("orig.projectSourceDirs");
      final Collection<SetupDirectory> projectSrcDirs = ((Collection<SetupDirectory>) _get_1);
      Object _get_2 = properties.get("orig.projectRefSourceDirs");
      Collection<SetupDirectory> projectRefs = ((Collection<SetupDirectory>) _get_2);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<target name=\"setup-staging-area\">");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<delete dir=\"externalLibs\" />");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<delete dir=\"project\" />");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<delete dir=\"projectRefs\" />");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<mkdir dir=\"externalLibs\" />");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      {
        for(final File l : externalLibs) {
          _builder.append("\t");
          _builder.append("<copy todir=\"externalLibs\">");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("<fileset dir=\"");
          String _parent = l.getParent();
          _builder.append(_parent, "		");
          _builder.append("\">");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.append("<filename name=\"");
          String _name = l.getName();
          _builder.append(_name, "			");
          _builder.append("\"/>\t");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("</fileset>");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("</copy>");
          _builder.newLine();
        }
      }
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<mkdir dir=\"project\" />");
      _builder.newLine();
      {
        for(final SetupDirectory d : projectSrcDirs) {
          _builder.append("\t");
          _builder.append("<copy todir=\"project\">");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("<fileset dir=\"");
          String _absolutePath = d.originalPath.getAbsolutePath();
          _builder.append(_absolutePath, "		");
          _builder.append("\">");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.append("<include name=\"");
          String _name_1 = d.relativePath.getName();
          _builder.append(_name_1, "			");
          _builder.append("/**\" />");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("</fileset>");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("</copy>");
          _builder.newLine();
        }
      }
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<mkdir dir=\"projectRefs\" />");
      _builder.newLine();
      {
        for(final SetupDirectory d_1 : projectRefs) {
          _builder.append("\t");
          _builder.append("<copy todir=\"projectRefs\">");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("<fileset dir=\"");
          String _absolutePath_1 = d_1.originalPath.getAbsolutePath();
          _builder.append(_absolutePath_1, "		");
          _builder.append("\">");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.append("<include name=\"");
          String _path = d_1.relativePath.getPath();
          _builder.append(_path, "			");
          _builder.append("/**\" />");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("</fileset>");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("</copy>");
          _builder.newLine();
        }
      }
      _builder.append("</target>");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public CharSequence createInitTaskTarget(final Map<String,Object> properties) {
    CharSequence _xblockexpression = null;
    {
      Object _get = properties.get("jfxantjar");
      final String sdkAntPath = ((String) _get);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<target name=\"init-fx-tasks\">");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<path id=\"fxant\">");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("<filelist>");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("<file name=\"");
      _builder.append(sdkAntPath, "			");
      _builder.append("\"/>");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.append("<file name=\"${java.home}\\..\\lib\\ant-javafx.jar\"/>");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("</filelist>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("</path>");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<taskdef resource=\"com/sun/javafx/tools/ant/antlib.xml\"      ");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("uri=\"javafx:com.sun.javafx.tools.ant\"");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("classpathref=\"fxant\"/>");
      _builder.newLine();
      _builder.append("</target>");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public CharSequence compileTarget(final Map<String,Object> properties) {
    CharSequence _xblockexpression = null;
    {
      Object _get = properties.get("projectRefSourceDirs");
      final Collection<String> projectRefs = ((Collection<String>) _get);
      Object _get_1 = properties.get("externalLibs");
      final Collection<String> externalLibs = ((Collection<String>) _get_1);
      Object _get_2 = properties.get("projectSourceDirs");
      final Collection<String> projectSourceDirs = ((Collection<String>) _get_2);
      Object _get_3 = properties.get("jfxjar");
      final String fxJarPath = ((String) _get_3);
      Object _get_4 = properties.get("projectEncoding");
      String encoding = ((String) _get_4);
      Object _get_5 = properties.get("sourceCompliance");
      String sourceCompliance = ((String) _get_5);
      Object _get_6 = properties.get("targetCompliance");
      String targetCompliance = ((String) _get_6);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<target name=\'do-compile\'>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<delete dir=\"build\" />");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<mkdir dir=\"build/src\" />");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<mkdir dir=\"build/libs\" />");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<mkdir dir=\"build/classes\" />");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<!-- Copy project-libs references -->");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<copy todir=\"build/libs\">");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("<fileset dir=\"externalLibs\">");
      _builder.newLine();
      {
        for(final String s : externalLibs) {
          _builder.append("\t\t\t");
          _builder.append("<include name=\"");
          _builder.append(s, "			");
          _builder.append("\"/>");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t\t");
      _builder.append("</fileset>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("</copy>");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<!-- Copy project references -->");
      _builder.newLine();
      {
        for(final String s_1 : projectRefs) {
          _builder.append("\t");
          _builder.append("<copy todir=\"build/src\">");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("<fileset dir=\"projectRefs/");
          _builder.append(s_1, "		");
          _builder.append("\">");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.append("<include name=\"**/*\"/>");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("</fileset>");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("</copy>");
          _builder.newLine();
        }
      }
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<!-- Copy project sources itself -->");
      _builder.newLine();
      {
        for(final String s_2 : projectSourceDirs) {
          _builder.append("\t");
          _builder.append("<copy todir=\"build/src\">");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("<fileset dir=\"project/");
          _builder.append(s_2, "		");
          _builder.append("\">");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.append("<include name=\"**/*\"/>");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("</fileset>");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("</copy>");
          _builder.newLine();
        }
      }
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<javac includeantruntime=\"false\" source=\"");
      _builder.append(sourceCompliance, "	");
      _builder.append("\" target=\"");
      _builder.append(targetCompliance, "	");
      _builder.append("\" srcdir=\"build/src\" destdir=\"build/classes\"");
      {
        boolean _notEquals = (!Objects.equal(encoding, null));
        if (_notEquals) {
          _builder.append(" encoding=\"");
          _builder.append(encoding, "	");
          _builder.append("\"");
        }
      }
      _builder.append(">");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("<classpath>");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("<fileset dir=\"build/libs\">");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("<include name=\"*\"/>");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("</fileset>");
      _builder.newLine();
      {
        boolean _notEquals_1 = (!Objects.equal(fxJarPath, null));
        if (_notEquals_1) {
          _builder.append("\t\t\t");
          _builder.append("<filelist>");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("\t");
          _builder.append("<file name=\"");
          _builder.append(fxJarPath, "				");
          _builder.append("\"/>");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t");
          _builder.append("</filelist>");
          _builder.newLine();
        }
      }
      _builder.append("\t\t");
      _builder.append("</classpath>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("</javac>");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<!-- Copy over none Java-Files -->");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<copy todir=\"build/classes\">");
      _builder.newLine();
      {
        for(final String s_3 : projectSourceDirs) {
          _builder.append("\t");
          _builder.append("<fileset dir=\"project/");
          _builder.append(s_3, "	");
          _builder.append("\">");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("<exclude name=\"**/*.java\"/>");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("</fileset>");
          _builder.newLine();
        }
      }
      _builder.append("\t");
      _builder.append("</copy>");
      _builder.newLine();
      _builder.newLine();
      {
        for(final String s_4 : projectRefs) {
          _builder.append("\t");
          _builder.append("<copy todir=\"build/classes\">");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("<fileset dir=\"projectRefs/");
          _builder.append(s_4, "		");
          _builder.append("\">");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.append("<exclude name=\"**/*.java\"/>");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("</fileset>");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("</copy>");
          _builder.newLine();
        }
      }
      _builder.newLine();
      _builder.append("</target>");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public CharSequence createDoDeployTarget(final Map<String,Object> properties) {
    CharSequence _xblockexpression = null;
    {
      Object _get = properties.get("projectName");
      final String projectName = ((String) _get);
      Object _get_1 = properties.get("applicationClass");
      final String mainClass = ((String) _get_1);
      Object _get_2 = properties.get("appletWith");
      final String appletWidth = ((String) _get_2);
      Object _get_3 = properties.get("appletHeight");
      final String appletHeight = ((String) _get_3);
      Object _get_4 = properties.get("appVendor");
      final String appVendor = ((String) _get_4);
      Object _get_5 = properties.get("appTitle");
      final String appTitle = ((String) _get_5);
      Object _get_6 = properties.get("appVersion");
      final String appVersion = ((String) _get_6);
      Object _get_7 = properties.get("preloaderClass");
      final String preloaderClass = ((String) _get_7);
      Object _get_8 = properties.get("nativePackage");
      final Boolean nativePackage = Boolean.valueOf(((String) _get_8));
      Object _get_9 = properties.get("propertyBean");
      final BuildPropertyBean bean = ((BuildPropertyBean) _get_9);
      String preloaderPath = "";
      boolean _equals = Objects.equal(preloaderClass, null);
      if (_equals) {
        preloaderPath = null;
      } else {
        String _replace = preloaderClass.replace(".", "/");
        preloaderPath = _replace;
      }
      Object _get_10 = properties.get("fallbackClass");
      final String fallBackClass = ((String) _get_10);
      Object _get_11 = properties.get("keyStore");
      String keyStore = ((String) _get_11);
      Object _get_12 = properties.get("keyStoreAlias");
      String keyStoreAlias = ((String) _get_12);
      Object _get_13 = properties.get("keyStorePass");
      String keyStorePass = ((String) _get_13);
      Object _get_14 = properties.get("keyPass");
      String keyPass = ((String) _get_14);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<target name=\"do-deploy\" depends=\"setup-staging-area, do-compile, init-fx-tasks\">");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<delete file=\"dist\"/>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<delete file=\"deploy\" />");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<mkdir dir=\"dist\" />");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<mkdir dir=\"dist/libs\" />");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<copy todir=\"dist/libs\">");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("<fileset dir=\"externalLibs\">");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("<include name=\"*\" />");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("</fileset>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("</copy>");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      {
        boolean _notEquals = (!Objects.equal(preloaderClass, null));
        if (_notEquals) {
          _builder.append("\t");
          _builder.append("<jar destfile=\"dist/libs/");
          _builder.append(projectName, "	");
          _builder.append("-preloader.jar\">");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("<fileset dir=\"build/classes\">");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.append("<include name=\"");
          _builder.append(preloaderPath, "			");
          _builder.append(".class\"/>");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("</fileset>");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("</jar>");
          _builder.newLine();
        }
      }
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<fx:resources id=\"appRes\">");
      _builder.newLine();
      {
        boolean _notEquals_1 = (!Objects.equal(preloaderClass, null));
        if (_notEquals_1) {
          _builder.append("\t\t");
          _builder.append("<fx:fileset dir=\"dist\" requiredFor=\"preloader\"");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("\t");
          _builder.append("includes=\"");
          _builder.append(projectName, "			");
          _builder.append("-preloader.jar\"/>");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t\t");
      _builder.append("<fx:fileset dir=\"dist\" includes=\"");
      _builder.append(projectName, "		");
      _builder.append(".jar\"/>");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("<fx:fileset dir=\"dist\" includes=\"libs/*\"/>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("</fx:resources> ");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<fx:application id=\"fxApplication\"");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("name=\"");
      _builder.append(projectName, "		");
      _builder.append("\"");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("mainClass=\"");
      _builder.append(mainClass, "		");
      _builder.append("\"");
      _builder.newLineIfNotEmpty();
      {
        boolean _notEquals_2 = (!Objects.equal(preloaderClass, null));
        if (_notEquals_2) {
          _builder.append("\t\t");
          _builder.append("preloaderClass=\"");
          _builder.append(preloaderClass, "		");
          _builder.append("\"");
          _builder.newLineIfNotEmpty();
        }
      }
      {
        boolean _notEquals_3 = (!Objects.equal(fallBackClass, null));
        if (_notEquals_3) {
          _builder.append("\t\t");
          _builder.append("fallbackClass=\"");
          _builder.append(fallBackClass, "		");
          _builder.append("\"");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t\t");
      _builder.append("/>");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<fx:jar destfile=\"dist/");
      _builder.append(projectName, "	");
      _builder.append(".jar\">");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("<fx:application refid=\"fxApplication\"/>");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("<fileset dir=\"build/classes\">");
      _builder.newLine();
      {
        boolean _notEquals_4 = (!Objects.equal(preloaderClass, null));
        if (_notEquals_4) {
          _builder.append("\t\t");
          _builder.append("<exclude name=\"");
          _builder.append(preloaderPath, "		");
          _builder.append(".class\" />");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t\t");
      _builder.append("</fileset>");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("<fx:resources refid=\"appRes\"/>");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("<manifest>");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("<attribute name=\"Implementation-Vendor\" value=\"");
      _builder.append(appVendor, "			");
      _builder.append("\"/>");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.append("<attribute name=\"Implementation-Title\" value=\"");
      _builder.append(appTitle, "			");
      _builder.append("\"/>");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.append("<attribute name=\"Implementation-Version\" value=\"");
      _builder.append(appVersion, "			");
      _builder.append("\"/>");
      _builder.newLineIfNotEmpty();
      {
        String _buildSplashImage = bean.getBuildSplashImage();
        boolean _notEquals_5 = (!Objects.equal(_buildSplashImage, null));
        if (_notEquals_5) {
          _builder.append("\t\t\t");
          _builder.append("<attribute name=\"SplashScreen-Image\" value=\"");
          String _buildSplashImage_1 = bean.getBuildSplashImage();
          _builder.append(_buildSplashImage_1, "			");
          _builder.append("\"/>");
          _builder.newLineIfNotEmpty();
        }
      }
      {
        List<BuildPropertyManifestAttr> _buildManifestAttrList = bean.getBuildManifestAttrList();
        for(final BuildPropertyManifestAttr a : _buildManifestAttrList) {
          _builder.append("\t\t\t");
          _builder.append("<attribute name=\"");
          String _buildManifestAttrName = a.getBuildManifestAttrName();
          _builder.append(_buildManifestAttrName, "			");
          _builder.append("\" value=\"");
          String _buildManifestAttrValue = a.getBuildManifestAttrValue();
          _builder.append(_buildManifestAttrValue, "			");
          _builder.append("\"/>");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t\t");
      _builder.append("</manifest>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("</fx:jar>");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      {
        boolean _notEquals_6 = (!Objects.equal(keyStore, null));
        if (_notEquals_6) {
          _builder.append("\t");
          _builder.append("<!-- Need to use ${basedir} because somehow the ant task is calculating the directory differently -->");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("<fx:signjar keystore=\"");
          _builder.append(keyStore, "	");
          _builder.append("\" alias=\"");
          _builder.append(keyStoreAlias, "	");
          _builder.append("\" ");
          {
            boolean _notEquals_7 = (!Objects.equal(keyPass, null));
            if (_notEquals_7) {
              _builder.append("keypass=\"");
              _builder.append(keyPass, "	");
              _builder.append("\" ");
            }
          }
          {
            boolean _notEquals_8 = (!Objects.equal(keyStorePass, null));
            if (_notEquals_8) {
              _builder.append("storepass=\"");
              _builder.append(keyStorePass, "	");
              _builder.append("\" ");
            }
          }
          _builder.append("destDir=\"${basedir}/dist\">");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("<fileset dir=\'dist\'>");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.append("<include name=\'**/*.jar\' />");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("</fileset>");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("</fx:signjar>");
          _builder.newLine();
        }
      }
      _builder.newLine();
      {
        boolean _or = false;
        boolean _and = false;
        boolean _notEquals_9 = (!Objects.equal(appletWidth, null));
        if (!_notEquals_9) {
          _and = false;
        } else {
          boolean _notEquals_10 = (!Objects.equal(appletHeight, null));
          _and = (_notEquals_9 && _notEquals_10);
        }
        if (_and) {
          _or = true;
        } else {
          _or = (_and || (nativePackage).booleanValue());
        }
        if (_or) {
          _builder.append("\t");
          _builder.append("<mkdir dir=\"deploy\" />");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("<!-- Need to use ${basedir} because somehow the ant task is calculating the directory differently -->");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("<fx:deploy ");
          {
            boolean _and_1 = false;
            boolean _notEquals_11 = (!Objects.equal(appletWidth, null));
            if (!_notEquals_11) {
              _and_1 = false;
            } else {
              boolean _notEquals_12 = (!Objects.equal(appletHeight, null));
              _and_1 = (_notEquals_11 && _notEquals_12);
            }
            if (_and_1) {
              _builder.append("width=\"");
              _builder.append(appletWidth, "	");
              _builder.append("\" height=\"");
              _builder.append(appletHeight, "	");
              _builder.append("\" embedJNLP=\"true\"");
            }
          }
          _builder.append(" outdir=\"${basedir}/deploy\" outfile=\"");
          _builder.append(projectName, "	");
          _builder.append("\" ");
          {
            if ((nativePackage).booleanValue()) {
              _builder.append("nativeBundles=\"all\"");
            }
          }
          _builder.append(">");
          _builder.newLineIfNotEmpty();
          {
            boolean _and_2 = false;
            List<BuildPropertySplash> _deploySplashList = bean.getDeploySplashList();
            boolean _isEmpty = _deploySplashList.isEmpty();
            if (!_isEmpty) {
              _and_2 = false;
            } else {
              List<BuildPropertyIcon> _deployIconList = bean.getDeployIconList();
              boolean _isEmpty_1 = _deployIconList.isEmpty();
              _and_2 = (_isEmpty && _isEmpty_1);
            }
            if (_and_2) {
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("<fx:info title=\"");
              _builder.append(projectName, "		");
              _builder.append("\" vendor=\"");
              _builder.append(appVendor, "		");
              _builder.append("\"/>");
              _builder.newLineIfNotEmpty();
            } else {
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("<fx:info title=\"");
              _builder.append(projectName, "		");
              _builder.append("\" vendor=\"");
              _builder.append(appVendor, "		");
              _builder.append("\">");
              _builder.newLineIfNotEmpty();
              {
                List<BuildPropertySplash> _deploySplashList_1 = bean.getDeploySplashList();
                for(final BuildPropertySplash s : _deploySplashList_1) {
                  _builder.append("\t");
                  _builder.append("\t");
                  _builder.append("\t");
                  _builder.append("<fx:splash href=\"");
                  String _deploySplashHref = s.getDeploySplashHref();
                  _builder.append(_deploySplashHref, "			");
                  _builder.append("\" ");
                  {
                    String _deploySplashMode = s.getDeploySplashMode();
                    boolean _notEquals_13 = (!Objects.equal(_deploySplashMode, null));
                    if (_notEquals_13) {
                      _builder.append("mode=\"");
                      String _deploySplashMode_1 = s.getDeploySplashMode();
                      _builder.append(_deploySplashMode_1, "			");
                      _builder.append("\"");
                    }
                  }
                  _builder.append(" />");
                  _builder.newLineIfNotEmpty();
                }
              }
              {
                List<BuildPropertyIcon> _deployIconList_1 = bean.getDeployIconList();
                for(final BuildPropertyIcon i : _deployIconList_1) {
                  _builder.append("\t");
                  _builder.append("\t");
                  _builder.append("\t");
                  _builder.append("<fx:icon href=\"");
                  String _deployIconHref = i.getDeployIconHref();
                  _builder.append(_deployIconHref, "			");
                  _builder.append("\" ");
                  {
                    String _deployIconDepth = i.getDeployIconDepth();
                    boolean _notEquals_14 = (!Objects.equal(_deployIconDepth, null));
                    if (_notEquals_14) {
                      _builder.append("depth=\"");
                      String _deployIconDepth_1 = i.getDeployIconDepth();
                      _builder.append(_deployIconDepth_1, "			");
                      _builder.append("\"");
                    }
                  }
                  _builder.append(" ");
                  {
                    String _deployIconHeight = i.getDeployIconHeight();
                    boolean _notEquals_15 = (!Objects.equal(_deployIconHeight, null));
                    if (_notEquals_15) {
                      _builder.append("height=\"");
                      String _deployIconHeight_1 = i.getDeployIconHeight();
                      _builder.append(_deployIconHeight_1, "			");
                      _builder.append("\"");
                    }
                  }
                  _builder.append(" ");
                  {
                    String _deployIconKind = i.getDeployIconKind();
                    boolean _notEquals_16 = (!Objects.equal(_deployIconKind, null));
                    if (_notEquals_16) {
                      _builder.append("kind=\"");
                      String _deployIconKind_1 = i.getDeployIconKind();
                      _builder.append(_deployIconKind_1, "			");
                      _builder.append("\"");
                    }
                  }
                  _builder.append(" ");
                  {
                    String _deployIconWidth = i.getDeployIconWidth();
                    boolean _notEquals_17 = (!Objects.equal(_deployIconWidth, null));
                    if (_notEquals_17) {
                      _builder.append("width=\"");
                      String _deployIconWidth_1 = i.getDeployIconWidth();
                      _builder.append(_deployIconWidth_1, "			");
                      _builder.append("\"");
                    }
                  }
                  _builder.append(" />");
                  _builder.newLineIfNotEmpty();
                }
              }
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("</fx:info>");
              _builder.newLine();
            }
          }
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("<fx:application refId=\"fxApplication\"/>");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("<fx:resources refid=\"appRes\"/>");
          _builder.newLine();
          {
            boolean _notEquals_18 = (!Objects.equal(keyStore, null));
            if (_notEquals_18) {
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("<fx:permissions elevated=\"true\"/>");
              _builder.newLine();
            }
          }
          _builder.append("\t");
          _builder.append("</fx:deploy>");
          _builder.newLine();
        }
      }
      _builder.append("</target>");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
}
