package at.bestsolution.efxclipse.tooling.jdt.ui.internal.handler;

import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTask;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.SignJar;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.Application;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.Icon;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.IconType;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.Info;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.KeyValuePair;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.Param;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.Splash;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.SplashMode;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.Template;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.handler.AbstractAntHandler.BuildConfiguration;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.handler.CreateAntHandler;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.handler.SetupDirectory;
import com.google.common.base.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang.text.StrSubstitutor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class AntTemplate {
  public String generateAnt(final BuildConfiguration config) {
    String _xblockexpression = null;
    {
      final String projectName = ((String) config.projectName);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<project name=\"");
      _builder.append(projectName, "	");
      _builder.append("\" default=\"do-deploy\" basedir=\".\"  xmlns:fx=\"javafx:com.sun.javafx.tools.ant\">");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      CharSequence _createInitTaskTarget = this.createInitTaskTarget(config);
      _builder.append(_createInitTaskTarget, "	");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      CharSequence _createLocalSetup = this.createLocalSetup(config);
      _builder.append(_createLocalSetup, "	");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      CharSequence _compileTarget = this.compileTarget(config);
      _builder.append(_compileTarget, "	");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      CharSequence _createDoDeployTarget = this.createDoDeployTarget(config.task);
      _builder.append(_createDoDeployTarget, "	");
      _builder.newLineIfNotEmpty();
      _builder.append("</project>");
      _builder.newLine();
      String _string = _builder.toString();
      _xblockexpression = (_string);
    }
    return _xblockexpression;
  }
  
  public CharSequence createLocalSetup(final BuildConfiguration config) {
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
      for(final File l : config.origExternalLibs) {
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
      for(final SetupDirectory d : config.origProjectSourceDirs) {
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
      for(final SetupDirectory d_1 : config.origProjectRefSourceDirs) {
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
    return _builder;
  }
  
  public CharSequence createInitTaskTarget(final BuildConfiguration config) {
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
    _builder.append("<file name=\"${java.home}\\..\\lib\\ant-javafx.jar\"/>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<file name=\"${java.home}\\lib\\jfxrt.jar\"/>");
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
    return _builder;
  }
  
  public CharSequence compileTarget(final BuildConfiguration config) {
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
      for(final String s : config.externalLibs) {
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
      for(final String s_1 : config.projectRefSourceDirs) {
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
      for(final String s_2 : config.projectSourceDirs) {
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
    _builder.append(config.sourceCompliance, "	");
    _builder.append("\" target=\"");
    _builder.append(config.targetCompliance, "	");
    _builder.append("\" srcdir=\"build/src\" destdir=\"build/classes\"");
    {
      boolean _notEquals = (!Objects.equal(config.projectEncoding, null));
      if (_notEquals) {
        _builder.append(" encoding=\"");
        _builder.append(config.projectEncoding, "	");
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
      boolean _notEquals_1 = (!Objects.equal(config.jfxjar, null));
      if (_notEquals_1) {
        _builder.append("\t\t\t");
        _builder.append("<filelist>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t");
        _builder.append("<file name=\"");
        _builder.append(config.jfxjar, "				");
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
      for(final String s_3 : config.projectSourceDirs) {
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
      for(final String s_4 : config.projectRefSourceDirs) {
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
    return _builder;
  }
  
  public CharSequence createDoDeployTarget(final AntTask task) {
    CharSequence _xblockexpression = null;
    {
      Deploy _deploy = task.getDeploy();
      Application _application = _deploy.getApplication();
      final String projectName = _application.getName();
      Deploy _deploy_1 = task.getDeploy();
      Application _application_1 = _deploy_1.getApplication();
      final String mainClass = _application_1.getMainclass();
      Deploy _deploy_2 = task.getDeploy();
      final String appletWidth = _deploy_2.getWidth();
      Deploy _deploy_3 = task.getDeploy();
      final String appletHeight = _deploy_3.getHeight();
      Deploy _deploy_4 = task.getDeploy();
      Info _info = _deploy_4.getInfo();
      final String appTitle = _info.getTitle();
      Deploy _deploy_5 = task.getDeploy();
      Application _application_2 = _deploy_5.getApplication();
      final String appVersion = _application_2.getVersion();
      Deploy _deploy_6 = task.getDeploy();
      Application _application_3 = _deploy_6.getApplication();
      final String preloaderClass = _application_3.getPreloaderclass();
      Deploy _deploy_7 = task.getDeploy();
      final boolean nativePackage = _deploy_7.isNativePackage();
      String preloaderPath = "";
      boolean _equals = Objects.equal(preloaderClass, null);
      if (_equals) {
        preloaderPath = null;
      } else {
        String _replace = preloaderClass.replace(".", "/");
        preloaderPath = _replace;
      }
      Deploy _deploy_8 = task.getDeploy();
      Application _application_4 = _deploy_8.getApplication();
      final String fallBackClass = _application_4.getFallbackclass();
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
      {
        Deploy _deploy_9 = task.getDeploy();
        Application _application_5 = _deploy_9.getApplication();
        String _toolkit = _application_5.getToolkit();
        boolean _notEquals_4 = (!Objects.equal(_toolkit, null));
        if (_notEquals_4) {
          _builder.append("\t\t");
          _builder.append("toolkit=\"");
          Deploy _deploy_10 = task.getDeploy();
          Application _application_6 = _deploy_10.getApplication();
          String _toolkit_1 = _application_6.getToolkit();
          _builder.append(_toolkit_1, "		");
          _builder.append("\"");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t");
      _builder.append("/>");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<mkdir dir=\"build/classes/META-INF\" />");
      _builder.newLine();
      {
        EList<KeyValuePair> _fonts = task.getFonts();
        boolean _isEmpty = _fonts.isEmpty();
        boolean _not = (!_isEmpty);
        if (_not) {
          _builder.append("\t");
          _builder.append("<propertyfile file=\"build/classes/META-INF/fonts.mf\" comment=\"Fonts\">");
          _builder.newLine();
          {
            EList<KeyValuePair> _fonts_1 = task.getFonts();
            for(final KeyValuePair f : _fonts_1) {
              _builder.append("\t");
              _builder.append("<entry key=\"");
              String _key = f.getKey();
              _builder.append(_key, "	");
              _builder.append("\" value=\"/");
              String _value = f.getValue();
              _builder.append(_value, "	");
              _builder.append("\"/>");
              _builder.newLineIfNotEmpty();
            }
          }
          _builder.append("\t");
          _builder.append("</propertyfile>");
          _builder.newLine();
        }
      }
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      HashMap<String,List<String>> _hashMap = new HashMap<String,List<String>>();
      final HashMap<String,List<String>> map = _hashMap;
      _builder.newLineIfNotEmpty();
      {
        EList<KeyValuePair> _files = task.getFiles();
        for(final KeyValuePair f_1 : _files) {
          {
            String _key_1 = f_1.getKey();
            boolean _containsKey = map.containsKey(_key_1);
            boolean _not_1 = (!_containsKey);
            if (_not_1) {
              _builder.append("\t");
              String _key_2 = f_1.getKey();
              ArrayList<String> _arrayList = new ArrayList<String>();
              List<String> _put = map.put(_key_2, _arrayList);
              _builder.append(_put, "	");
              _builder.newLineIfNotEmpty();
            }
          }
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          String _key_3 = f_1.getKey();
          List<String> _get = map.get(_key_3);
          CreateAntHandler _createAntHandler = new CreateAntHandler();
          String _value_1 = f_1.getValue();
          String _resolvePath = _createAntHandler.resolvePath(_value_1, null);
          final boolean nix = _get.add(_resolvePath);
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t");
      _builder.newLine();
      {
        Set<String> _keySet = map.keySet();
        for(final String folderName : _keySet) {
          _builder.append("\t");
          _builder.append("<mkdir dir=\"build/classes/META-INF/");
          _builder.append(folderName, "	");
          _builder.append("\" />");
          _builder.newLineIfNotEmpty();
          {
            List<String> _get_1 = map.get(folderName);
            for(final String serviceFile : _get_1) {
              _builder.append("\t");
              _builder.append("<copy ");
              _builder.newLine();
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("todir=\"build/classes/META-INF/");
              _builder.append(folderName, "		");
              _builder.append("\"");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("\t");
              HashMap<String,String> _hashMap_1 = new HashMap<String,String>();
              final Map<String,String> replacements = _hashMap_1;
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("\t");
              String _put_1 = replacements.put("workspace", "build/classes");
              _builder.append(_put_1, "		");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("\t");
              StrSubstitutor _strSubstitutor = new StrSubstitutor(replacements);
              final StrSubstitutor sub = _strSubstitutor;
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("file=\"");
              String _replace_1 = sub.replace(serviceFile);
              _builder.append(_replace_1, "		");
              _builder.append("\"");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("/>");
              _builder.newLine();
            }
          }
        }
      }
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
        boolean _notEquals_5 = (!Objects.equal(preloaderClass, null));
        if (_notEquals_5) {
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
      Deploy _deploy_11 = task.getDeploy();
      Info _info_1 = _deploy_11.getInfo();
      String _vendor = _info_1.getVendor();
      _builder.append(_vendor, "			");
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
        Deploy _deploy_12 = task.getDeploy();
        String _splashImage = _deploy_12.getSplashImage();
        boolean _notEquals_6 = (!Objects.equal(_splashImage, null));
        if (_notEquals_6) {
          _builder.append("\t\t\t");
          _builder.append("<attribute name=\"SplashScreen-Image\" value=\"");
          Deploy _deploy_13 = task.getDeploy();
          String _splashImage_1 = _deploy_13.getSplashImage();
          _builder.append(_splashImage_1, "			");
          _builder.append("\"/>");
          _builder.newLineIfNotEmpty();
        }
      }
      {
        EList<Param> _manifestEntries = task.getManifestEntries();
        for(final Param a : _manifestEntries) {
          _builder.append("\t\t\t");
          _builder.append("<attribute name=\"");
          String _name = a.getName();
          _builder.append(_name, "			");
          _builder.append("\" value=\"");
          String _value_2 = a.getValue();
          _builder.append(_value_2, "			");
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
        boolean _and = false;
        SignJar _signjar = task.getSignjar();
        String _keystore = _signjar.getKeystore();
        boolean _notEquals_7 = (!Objects.equal(_keystore, null));
        if (!_notEquals_7) {
          _and = false;
        } else {
          SignJar _signjar_1 = task.getSignjar();
          String _keystore_1 = _signjar_1.getKeystore();
          int _length = _keystore_1.length();
          boolean _greaterThan = (_length > 0);
          _and = (_notEquals_7 && _greaterThan);
        }
        if (_and) {
          _builder.append("\t");
          _builder.append("<!-- Need to use ${basedir} because somehow the ant task is calculating the directory differently -->");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("<fx:signjar ");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("keystore=\"");
          SignJar _signjar_2 = task.getSignjar();
          String _keystore_2 = _signjar_2.getKeystore();
          _builder.append(_keystore_2, "		");
          _builder.append("\" ");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("alias=\"");
          SignJar _signjar_3 = task.getSignjar();
          String _alias = _signjar_3.getAlias();
          _builder.append(_alias, "		");
          _builder.append("\" ");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("keypass=\"");
          SignJar _signjar_4 = task.getSignjar();
          String _keypass = _signjar_4.getKeypass();
          _builder.append(_keypass, "		");
          _builder.append("\" ");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("storepass=\"");
          SignJar _signjar_5 = task.getSignjar();
          String _storepass = _signjar_5.getStorepass();
          _builder.append(_storepass, "		");
          _builder.append("\" ");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          {
            SignJar _signjar_6 = task.getSignjar();
            String _storetype = _signjar_6.getStoretype();
            boolean _notEquals_8 = (!Objects.equal(_storetype, null));
            if (_notEquals_8) {
              _builder.append("storetype=\"");
              SignJar _signjar_7 = task.getSignjar();
              String _storetype_1 = _signjar_7.getStoretype();
              _builder.append(_storetype_1, "		");
              _builder.append("\" ");
            }
          }
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("destDir=\"${basedir}/dist\">");
          _builder.newLine();
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
        boolean _and_1 = false;
        boolean _notEquals_9 = (!Objects.equal(appletWidth, null));
        if (!_notEquals_9) {
          _and_1 = false;
        } else {
          boolean _notEquals_10 = (!Objects.equal(appletHeight, null));
          _and_1 = (_notEquals_9 && _notEquals_10);
        }
        if (_and_1) {
          _or = true;
        } else {
          _or = (_and_1 || nativePackage);
        }
        if (_or) {
          _builder.append("\t");
          _builder.append("<mkdir dir=\"deploy\" />");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("<!-- Need to use ${basedir} because somehow the ant task is calculating the directory differently -->");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("<fx:deploy");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("embedJNLP=\"");
          Deploy _deploy_14 = task.getDeploy();
          boolean _isEmbedjnlp = _deploy_14.isEmbedjnlp();
          _builder.append(_isEmbedjnlp, "		");
          _builder.append("\"");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("extension=\"");
          Deploy _deploy_15 = task.getDeploy();
          boolean _isExtension = _deploy_15.isExtension();
          _builder.append(_isExtension, "		");
          _builder.append("\"");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          {
            boolean _and_2 = false;
            boolean _and_3 = false;
            boolean _and_4 = false;
            boolean _notEquals_11 = (!Objects.equal(appletWidth, null));
            if (!_notEquals_11) {
              _and_4 = false;
            } else {
              int _length_1 = appletWidth.length();
              boolean _greaterThan_1 = (_length_1 > 0);
              _and_4 = (_notEquals_11 && _greaterThan_1);
            }
            if (!_and_4) {
              _and_3 = false;
            } else {
              boolean _notEquals_12 = (!Objects.equal(appletHeight, null));
              _and_3 = (_and_4 && _notEquals_12);
            }
            if (!_and_3) {
              _and_2 = false;
            } else {
              int _length_2 = appletHeight.length();
              boolean _greaterThan_2 = (_length_2 > 0);
              _and_2 = (_and_3 && _greaterThan_2);
            }
            if (_and_2) {
              _builder.append("width=\"");
              _builder.append(appletWidth, "		");
              _builder.append("\" height=\"");
              _builder.append(appletHeight, "		");
              _builder.append("\"");
            }
          }
          _builder.append(" ");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("includeDT=\"");
          Deploy _deploy_16 = task.getDeploy();
          boolean _isIncludeDT = _deploy_16.isIncludeDT();
          _builder.append(_isIncludeDT, "		");
          _builder.append("\"");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("offlineAllowed=\"");
          Deploy _deploy_17 = task.getDeploy();
          boolean _isOfflineAllowed = _deploy_17.isOfflineAllowed();
          _builder.append(_isOfflineAllowed, "		");
          _builder.append("\"");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("outdir=\"${basedir}/deploy\"");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("outfile=\"");
          _builder.append(projectName, "		");
          _builder.append("\" ");
          {
            if (nativePackage) {
              _builder.append("nativeBundles=\"all\"");
            }
          }
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          {
            Deploy _deploy_18 = task.getDeploy();
            String _placeholderref = _deploy_18.getPlaceholderref();
            int _length_3 = _placeholderref==null?0:_placeholderref.length();
            boolean _greaterThan_3 = (_length_3 > 0);
            if (_greaterThan_3) {
              _builder.append("placeholderref=\"");
              Deploy _deploy_19 = task.getDeploy();
              String _placeholderref_1 = _deploy_19.getPlaceholderref();
              _builder.append(_placeholderref_1, "		");
              _builder.append("\"");
            }
          }
          _builder.append(" ");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          {
            Deploy _deploy_20 = task.getDeploy();
            String _placeholderid = _deploy_20.getPlaceholderid();
            int _length_4 = _placeholderid==null?0:_placeholderid.length();
            boolean _greaterThan_4 = (_length_4 > 0);
            if (_greaterThan_4) {
              _builder.append("placeholderid=\"");
              Deploy _deploy_21 = task.getDeploy();
              String _placeholderid_1 = _deploy_21.getPlaceholderid();
              _builder.append(_placeholderid_1, "		");
              _builder.append("\"");
            }
          }
          _builder.append(" ");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          {
            Deploy _deploy_22 = task.getDeploy();
            String _updatemode = _deploy_22.getUpdatemode();
            int _length_5 = _updatemode==null?0:_updatemode.length();
            boolean _greaterThan_5 = (_length_5 > 0);
            if (_greaterThan_5) {
              _builder.append("updatemode=\"");
              Deploy _deploy_23 = task.getDeploy();
              String _updatemode_1 = _deploy_23.getUpdatemode();
              _builder.append(_updatemode_1, "		");
              _builder.append("\"");
            }
          }
          _builder.append(" >");
          _builder.newLineIfNotEmpty();
          _builder.newLine();
          {
            boolean _and_5 = false;
            Deploy _deploy_24 = task.getDeploy();
            Info _info_2 = _deploy_24.getInfo();
            EList<Splash> _splash = _info_2.getSplash();
            boolean _isEmpty_1 = _splash.isEmpty();
            if (!_isEmpty_1) {
              _and_5 = false;
            } else {
              Deploy _deploy_25 = task.getDeploy();
              Info _info_3 = _deploy_25.getInfo();
              EList<Icon> _icon = _info_3.getIcon();
              boolean _isEmpty_2 = _icon.isEmpty();
              _and_5 = (_isEmpty_1 && _isEmpty_2);
            }
            if (_and_5) {
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("<fx:info title=\"");
              _builder.append(projectName, "		");
              _builder.append("\" vendor=\"");
              Deploy _deploy_26 = task.getDeploy();
              Info _info_4 = _deploy_26.getInfo();
              String _vendor_1 = _info_4.getVendor();
              _builder.append(_vendor_1, "		");
              _builder.append("\"/>");
              _builder.newLineIfNotEmpty();
            } else {
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("<fx:info title=\"");
              _builder.append(projectName, "		");
              _builder.append("\" vendor=\"");
              Deploy _deploy_27 = task.getDeploy();
              Info _info_5 = _deploy_27.getInfo();
              String _vendor_2 = _info_5.getVendor();
              _builder.append(_vendor_2, "		");
              _builder.append("\">");
              _builder.newLineIfNotEmpty();
              {
                Deploy _deploy_28 = task.getDeploy();
                Info _info_6 = _deploy_28.getInfo();
                EList<Splash> _splash_1 = _info_6.getSplash();
                for(final Splash s : _splash_1) {
                  _builder.append("\t");
                  _builder.append("\t");
                  _builder.append("\t");
                  _builder.append("<fx:splash href=\"");
                  String _href = s.getHref();
                  _builder.append(_href, "			");
                  _builder.append("\" ");
                  {
                    SplashMode _mode = s.getMode();
                    boolean _notEquals_13 = (!Objects.equal(_mode, null));
                    if (_notEquals_13) {
                      _builder.append("mode=\"");
                      SplashMode _mode_1 = s.getMode();
                      _builder.append(_mode_1, "			");
                      _builder.append("\"");
                    }
                  }
                  _builder.append(" />");
                  _builder.newLineIfNotEmpty();
                }
              }
              {
                Deploy _deploy_29 = task.getDeploy();
                Info _info_7 = _deploy_29.getInfo();
                EList<Icon> _icon_1 = _info_7.getIcon();
                for(final Icon i : _icon_1) {
                  _builder.append("\t");
                  _builder.append("\t");
                  _builder.append("\t");
                  _builder.append("<fx:icon href=\"");
                  String _href_1 = i.getHref();
                  _builder.append(_href_1, "			");
                  _builder.append("\" ");
                  {
                    String _depth = i.getDepth();
                    boolean _notEquals_14 = (!Objects.equal(_depth, null));
                    if (_notEquals_14) {
                      _builder.append("depth=\"");
                      String _depth_1 = i.getDepth();
                      _builder.append(_depth_1, "			");
                      _builder.append("\"");
                    }
                  }
                  _builder.append(" ");
                  {
                    String _height = i.getHeight();
                    boolean _notEquals_15 = (!Objects.equal(_height, null));
                    if (_notEquals_15) {
                      _builder.append("height=\"");
                      String _height_1 = i.getHeight();
                      _builder.append(_height_1, "			");
                      _builder.append("\"");
                    }
                  }
                  _builder.append(" ");
                  {
                    IconType _kind = i.getKind();
                    boolean _notEquals_16 = (!Objects.equal(_kind, null));
                    if (_notEquals_16) {
                      _builder.append("kind=\"");
                      IconType _kind_1 = i.getKind();
                      _builder.append(_kind_1, "			");
                      _builder.append("\"");
                    }
                  }
                  _builder.append(" ");
                  {
                    String _width = i.getWidth();
                    boolean _notEquals_17 = (!Objects.equal(_width, null));
                    if (_notEquals_17) {
                      _builder.append("width=\"");
                      String _width_1 = i.getWidth();
                      _builder.append(_width_1, "			");
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
          {
            Deploy _deploy_30 = task.getDeploy();
            Template _template = _deploy_30.getTemplate();
            String _file = _template==null?(String)null:_template.getFile();
            String _trim = _file==null?(String)null:_file.trim();
            int _length_6 = _trim==null?0:_trim.length();
            boolean _greaterThan_6 = (_length_6 > 0);
            if (_greaterThan_6) {
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("<fx:template ");
              _builder.newLine();
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("file=\"build/src/");
              Deploy _deploy_31 = task.getDeploy();
              Template _template_1 = _deploy_31.getTemplate();
              String _file_1 = _template_1.getFile();
              _builder.append(_file_1, "			");
              _builder.append("\"");
              _builder.newLineIfNotEmpty();
              {
                Deploy _deploy_32 = task.getDeploy();
                Template _template_2 = _deploy_32.getTemplate();
                String _toFile = _template_2.getToFile();
                String _trim_1 = _toFile==null?(String)null:_toFile.trim();
                int _length_7 = _trim_1.length();
                boolean _greaterThan_7 = (_length_7 > 0);
                if (_greaterThan_7) {
                  _builder.append("\t");
                  _builder.append("\t");
                  _builder.append("tofile=\"dist/");
                  Deploy _deploy_33 = task.getDeploy();
                  Template _template_3 = _deploy_33.getTemplate();
                  String _toFile_1 = _template_3.getToFile();
                  _builder.append(_toFile_1, "		");
                  _builder.append("\"");
                  _builder.newLineIfNotEmpty();
                }
              }
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("/>");
              _builder.newLine();
            }
          }
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("<fx:resources refid=\"appRes\"/>");
          _builder.newLine();
          {
            SignJar _signjar_8 = task.getSignjar();
            String _keystore_3 = _signjar_8.getKeystore();
            int _length_8 = _keystore_3==null?0:_keystore_3.length();
            boolean _greaterThan_8 = (_length_8 > 0);
            if (_greaterThan_8) {
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
      _builder.append("\t");
      _builder.newLine();
      {
        boolean _isCssToBin = task.isCssToBin();
        if (_isCssToBin) {
          _builder.append("\t");
          _builder.append("<fx:csstobin outdir=\"build/classes\">");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("<fileset dir=\"build/classes\" includes=\"**/*.css\"/>");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("</fx:csstobin>\t\t\t");
          _builder.newLine();
        }
      }
      _builder.append("\t");
      _builder.newLine();
      _builder.append("</target>");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
}
