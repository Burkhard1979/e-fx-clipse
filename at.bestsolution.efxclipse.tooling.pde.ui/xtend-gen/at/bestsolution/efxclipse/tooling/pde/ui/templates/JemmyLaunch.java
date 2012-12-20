package at.bestsolution.efxclipse.tooling.pde.ui.templates;

import at.bestsolution.efxclipse.tooling.pde.ui.templates.JemmyLaunchDef;
import at.bestsolution.efxclipse.tooling.pde.ui.templates.PluginLaunchDef;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundleProject;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.FeatureFile;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.FeaturePlugin;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.FeatureProject;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ManifestFile;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.DynamicFile;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.Generator;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.Project;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.RobotTask;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class JemmyLaunch implements Generator<DynamicFile> {
  public RobotTask findRoot(final EObject file) {
    EObject tmp = file;
    boolean _while = true;
    while (_while) {
      {
        EObject _eContainer = tmp.eContainer();
        if ((_eContainer instanceof RobotTask)) {
          EObject _eContainer_1 = tmp.eContainer();
          return ((RobotTask) _eContainer_1);
        }
        EObject _eContainer_2 = tmp.eContainer();
        tmp = _eContainer_2;
      }
      _while = true;
    }
    return null;
  }
  
  public InputStream generate(final DynamicFile file, final Map<String,Object> data) {
    RobotTask _findRoot = this.findRoot(file);
    final RobotTask robotTask = ((RobotTask) _findRoot);
    EList<Project> _projects = robotTask.getProjects();
    final Function1<Project,Boolean> _function = new Function1<Project,Boolean>() {
        public Boolean apply(final Project e) {
          return Boolean.valueOf((e instanceof FeatureProject));
        }
      };
    Project _findFirst = IterableExtensions.<Project>findFirst(_projects, _function);
    final FeatureProject plugin = ((FeatureProject) _findFirst);
    EList<Project> _projects_1 = robotTask.getProjects();
    final Function1<Project,Boolean> _function_1 = new Function1<Project,Boolean>() {
        public Boolean apply(final Project e) {
          return Boolean.valueOf((e instanceof BundleProject));
        }
      };
    Project _findFirst_1 = IterableExtensions.<Project>findFirst(_projects_1, _function_1);
    final BundleProject bundleProject = ((BundleProject) _findFirst_1);
    ManifestFile _manifest = bundleProject.getManifest();
    final String symbolicName = _manifest.getSymbolicname();
    JemmyLaunchDef _jemmyLaunchDef = new JemmyLaunchDef();
    final JemmyLaunchDef launchDef = _jemmyLaunchDef;
    String _plus = (symbolicName + ".jemmy.TestSuite");
    launchDef.setJunitClassName(_plus);
    String _name = bundleProject.getName();
    String _plus_1 = (_name + ".jemmy");
    launchDef.setProjectName(_plus_1);
    String _plus_2 = (symbolicName + ".product");
    launchDef.setTestProductId(_plus_2);
    FeatureFile _feature = plugin.getFeature();
    EList<FeaturePlugin> _plugins = _feature.getPlugins();
    for (final FeaturePlugin fp : _plugins) {
      String _id = fp.getId();
      boolean _equals = symbolicName.equals(_id);
      if (_equals) {
      } else {
        String _id_1 = fp.getId();
        boolean _equals_1 = "org.eclipse.core.runtime.compatibility.registry".equals(_id_1);
        if (_equals_1) {
          Set<PluginLaunchDef> _targetPlugins = launchDef.getTargetPlugins();
          String _id_2 = fp.getId();
          PluginLaunchDef _pluginLaunchDef = new PluginLaunchDef(_id_2, "default", "false");
          _targetPlugins.add(_pluginLaunchDef);
        } else {
          String _id_3 = fp.getId();
          boolean _equals_2 = "org.eclipse.core.runtime".equals(_id_3);
          if (_equals_2) {
            Set<PluginLaunchDef> _targetPlugins_1 = launchDef.getTargetPlugins();
            String _id_4 = fp.getId();
            PluginLaunchDef _pluginLaunchDef_1 = new PluginLaunchDef(_id_4, "default", "true");
            _targetPlugins_1.add(_pluginLaunchDef_1);
          } else {
            String _id_5 = fp.getId();
            boolean _equals_3 = "org.eclipse.equinox.common".equals(_id_5);
            if (_equals_3) {
              Set<PluginLaunchDef> _targetPlugins_2 = launchDef.getTargetPlugins();
              String _id_6 = fp.getId();
              PluginLaunchDef _pluginLaunchDef_2 = new PluginLaunchDef(_id_6, "2", "true");
              _targetPlugins_2.add(_pluginLaunchDef_2);
            } else {
              String _id_7 = fp.getId();
              boolean _equals_4 = "org.eclipse.equinox.ds".equals(_id_7);
              if (_equals_4) {
                Set<PluginLaunchDef> _targetPlugins_3 = launchDef.getTargetPlugins();
                String _id_8 = fp.getId();
                PluginLaunchDef _pluginLaunchDef_3 = new PluginLaunchDef(_id_8, "1", "true");
                _targetPlugins_3.add(_pluginLaunchDef_3);
              } else {
                String _id_9 = fp.getId();
                boolean _equals_5 = "org.eclipse.osgi".equals(_id_9);
                if (_equals_5) {
                  Set<PluginLaunchDef> _targetPlugins_4 = launchDef.getTargetPlugins();
                  String _id_10 = fp.getId();
                  PluginLaunchDef _pluginLaunchDef_4 = new PluginLaunchDef(_id_10, "-1", "true");
                  _targetPlugins_4.add(_pluginLaunchDef_4);
                } else {
                  Set<PluginLaunchDef> _targetPlugins_5 = launchDef.getTargetPlugins();
                  String _id_11 = fp.getId();
                  PluginLaunchDef _pluginLaunchDef_5 = new PluginLaunchDef(_id_11);
                  _targetPlugins_5.add(_pluginLaunchDef_5);
                }
              }
            }
          }
        }
      }
    }
    Set<PluginLaunchDef> _targetPlugins_6 = launchDef.getTargetPlugins();
    PluginLaunchDef _pluginLaunchDef_6 = new PluginLaunchDef("at.bestsolution.efxclipse.runtime.jemmy");
    _targetPlugins_6.add(_pluginLaunchDef_6);
    Set<PluginLaunchDef> _targetPlugins_7 = launchDef.getTargetPlugins();
    PluginLaunchDef _pluginLaunchDef_7 = new PluginLaunchDef("org.eclipse.jdt.junit.runtime");
    _targetPlugins_7.add(_pluginLaunchDef_7);
    Set<PluginLaunchDef> _targetPlugins_8 = launchDef.getTargetPlugins();
    PluginLaunchDef _pluginLaunchDef_8 = new PluginLaunchDef("org.eclipse.jdt.junit4.runtime");
    _targetPlugins_8.add(_pluginLaunchDef_8);
    Set<PluginLaunchDef> _targetPlugins_9 = launchDef.getTargetPlugins();
    PluginLaunchDef _pluginLaunchDef_9 = new PluginLaunchDef("org.eclipse.osgi.services");
    _targetPlugins_9.add(_pluginLaunchDef_9);
    Set<PluginLaunchDef> _targetPlugins_10 = launchDef.getTargetPlugins();
    PluginLaunchDef _pluginLaunchDef_10 = new PluginLaunchDef("org.eclipse.pde.junit.runtime");
    _targetPlugins_10.add(_pluginLaunchDef_10);
    Set<PluginLaunchDef> _targetPlugins_11 = launchDef.getTargetPlugins();
    PluginLaunchDef _pluginLaunchDef_11 = new PluginLaunchDef("org.hamcrest.core");
    _targetPlugins_11.add(_pluginLaunchDef_11);
    Set<PluginLaunchDef> _targetPlugins_12 = launchDef.getTargetPlugins();
    PluginLaunchDef _pluginLaunchDef_12 = new PluginLaunchDef("org.jemmy.fx.repackaged");
    _targetPlugins_12.add(_pluginLaunchDef_12);
    Set<PluginLaunchDef> _targetPlugins_13 = launchDef.getTargetPlugins();
    PluginLaunchDef _pluginLaunchDef_13 = new PluginLaunchDef("org.junit*4.10.0.v4_10_0_v20120426-0900");
    _targetPlugins_13.add(_pluginLaunchDef_13);
    Set<PluginLaunchDef> _targetPlugins_14 = launchDef.getTargetPlugins();
    PluginLaunchDef _pluginLaunchDef_14 = new PluginLaunchDef("org.junit4");
    _targetPlugins_14.add(_pluginLaunchDef_14);
    Set<PluginLaunchDef> _workbenchPlugins = launchDef.getWorkbenchPlugins();
    PluginLaunchDef _pluginLaunchDef_15 = new PluginLaunchDef(symbolicName);
    _workbenchPlugins.add(_pluginLaunchDef_15);
    Set<PluginLaunchDef> _workbenchPlugins_1 = launchDef.getWorkbenchPlugins();
    String _plus_3 = (symbolicName + ".jemmy");
    PluginLaunchDef _pluginLaunchDef_16 = new PluginLaunchDef(_plus_3);
    _workbenchPlugins_1.add(_pluginLaunchDef_16);
    CharSequence _generate = this.generate(launchDef);
    String _string = _generate.toString();
    byte[] _bytes = _string.getBytes();
    ByteArrayInputStream _byteArrayInputStream = new ByteArrayInputStream(_bytes);
    return _byteArrayInputStream;
  }
  
  public CharSequence generate(final JemmyLaunchDef launch) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>");
    _builder.newLine();
    _builder.append("<launchConfiguration type=\"org.eclipse.pde.ui.JunitLaunchConfig\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<booleanAttribute key=\"append.args\" value=\"true\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<stringAttribute key=\"application\" value=\"org.eclipse.pde.junit.runtime.coretestapplication\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<booleanAttribute key=\"askclear\" value=\"false\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<booleanAttribute key=\"automaticAdd\" value=\"false\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<booleanAttribute key=\"automaticValidate\" value=\"false\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<stringAttribute key=\"bootstrap\" value=\"\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<stringAttribute key=\"checked\" value=\"[NONE]\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<booleanAttribute key=\"clearConfig\" value=\"true\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<booleanAttribute key=\"clearws\" value=\"true\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<booleanAttribute key=\"clearwslog\" value=\"false\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<stringAttribute key=\"configLocation\" value=\"${workspace_loc}/.metadata/.plugins/org.eclipse.pde.core/pde-junit\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<booleanAttribute key=\"default\" value=\"false\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<booleanAttribute key=\"includeOptional\" value=\"true\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<stringAttribute key=\"location\" value=\"${workspace_loc}/../junit-workspace\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<listAttribute key=\"org.eclipse.debug.core.MAPPED_RESOURCE_PATHS\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<listEntry value=\"/");
    String _projectName = launch.getProjectName();
    _builder.append(_projectName, "		");
    _builder.append("/src/");
    String _junitClassName = launch.getJunitClassName();
    String _replace = _junitClassName.replace(".", "/");
    _builder.append(_replace, "		");
    _builder.append(".java\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("</listAttribute>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<listAttribute key=\"org.eclipse.debug.core.MAPPED_RESOURCE_TYPES\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<listEntry value=\"1\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</listAttribute>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<stringAttribute key=\"org.eclipse.jdt.junit.CONTAINER\" value=\"\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<booleanAttribute key=\"org.eclipse.jdt.junit.KEEPRUNNING_ATTR\" value=\"false\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<stringAttribute key=\"org.eclipse.jdt.junit.TESTNAME\" value=\"\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<stringAttribute key=\"org.eclipse.jdt.junit.TEST_KIND\" value=\"org.eclipse.jdt.junit.loader.junit4\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<stringAttribute key=\"org.eclipse.jdt.launching.MAIN_TYPE\" value=\"");
    String _junitClassName_1 = launch.getJunitClassName();
    _builder.append(_junitClassName_1, "	");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<stringAttribute key=\"org.eclipse.jdt.launching.PROGRAM_ARGUMENTS\" value=\"-nl ${target.nl} -consoleLog -nosplash -console\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<stringAttribute key=\"org.eclipse.jdt.launching.PROJECT_ATTR\" value=\"");
    String _projectName_1 = launch.getProjectName();
    _builder.append(_projectName_1, "	");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<stringAttribute key=\"org.eclipse.jdt.launching.SOURCE_PATH_PROVIDER\" value=\"org.eclipse.pde.ui.workbenchClasspathProvider\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<stringAttribute key=\"org.eclipse.jdt.launching.VM_ARGUMENTS\" value=\"-Xms40m -Xmx512m -Dosgi.framework.extensions=at.bestsolution.efxclipse.runtime.osgi -Dtest.jemmy.product=");
    String _testProductId = launch.getTestProductId();
    _builder.append(_testProductId, "	");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<stringAttribute key=\"pde.version\" value=\"3.3\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<stringAttribute key=\"product\" value=\"org.eclipse.sdk.ide\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<booleanAttribute key=\"run_in_ui_thread\" value=\"false\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<stringAttribute key=\"selected_target_plugins\" value=\"");
    Set<PluginLaunchDef> _targetPlugins = launch.getTargetPlugins();
    final Function1<PluginLaunchDef,String> _function = new Function1<PluginLaunchDef,String>() {
        public String apply(final PluginLaunchDef p) {
          String _name = p.getName();
          String _plus = (_name + "@");
          String _startLevel = p.getStartLevel();
          String _plus_1 = (_plus + _startLevel);
          String _plus_2 = (_plus_1 + ":");
          String _autoStart = p.getAutoStart();
          String _plus_3 = (_plus_2 + _autoStart);
          return _plus_3;
        }
      };
    Iterable<String> _map = IterableExtensions.<PluginLaunchDef, String>map(_targetPlugins, _function);
    String _join = IterableExtensions.join(_map, ",");
    _builder.append(_join, "	");
    _builder.append("\" />");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<stringAttribute key=\"selected_workspace_plugins\" value=\"");
    Set<PluginLaunchDef> _workbenchPlugins = launch.getWorkbenchPlugins();
    final Function1<PluginLaunchDef,String> _function_1 = new Function1<PluginLaunchDef,String>() {
        public String apply(final PluginLaunchDef p) {
          String _name = p.getName();
          String _plus = (_name + "@");
          String _startLevel = p.getStartLevel();
          String _plus_1 = (_plus + _startLevel);
          String _plus_2 = (_plus_1 + ":");
          String _autoStart = p.getAutoStart();
          String _plus_3 = (_plus_2 + _autoStart);
          return _plus_3;
        }
      };
    Iterable<String> _map_1 = IterableExtensions.<PluginLaunchDef, String>map(_workbenchPlugins, _function_1);
    String _join_1 = IterableExtensions.join(_map_1, ",");
    _builder.append(_join_1, "	");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<booleanAttribute key=\"show_selected_only\" value=\"false\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<booleanAttribute key=\"tracing\" value=\"false\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<booleanAttribute key=\"useCustomFeatures\" value=\"false\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<booleanAttribute key=\"useDefaultConfig\" value=\"true\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<booleanAttribute key=\"useDefaultConfigArea\" value=\"false\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<booleanAttribute key=\"useProduct\" value=\"false\"/>");
    _builder.newLine();
    _builder.append("</launchConfiguration> ");
    _builder.newLine();
    return _builder;
  }
}
