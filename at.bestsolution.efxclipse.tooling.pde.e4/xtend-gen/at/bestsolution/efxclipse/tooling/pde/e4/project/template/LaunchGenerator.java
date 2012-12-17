package at.bestsolution.efxclipse.tooling.pde.e4.project.template;

import at.bestsolution.efxclipse.tooling.pde.e4.project.template.E4LaunchDef;
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
import com.google.common.base.Objects;
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
public class LaunchGenerator implements Generator<DynamicFile> {
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
    E4LaunchDef _e4LaunchDef = new E4LaunchDef();
    final E4LaunchDef launchDef = _e4LaunchDef;
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
    String _name = bundleProject.getName();
    launchDef.setProjectName(_name);
    boolean _notEquals = (!Objects.equal(plugin, null));
    if (_notEquals) {
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
      Set<PluginLaunchDef> _workbenchPlugins = launchDef.getWorkbenchPlugins();
      PluginLaunchDef _pluginLaunchDef_6 = new PluginLaunchDef(symbolicName);
      _workbenchPlugins.add(_pluginLaunchDef_6);
    }
    CharSequence _generate = this.generate(launchDef);
    String _string = _generate.toString();
    byte[] _bytes = _string.getBytes();
    ByteArrayInputStream _byteArrayInputStream = new ByteArrayInputStream(_bytes);
    return _byteArrayInputStream;
  }
  
  public CharSequence generate(final E4LaunchDef launch) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>");
    _builder.newLine();
    _builder.append("<launchConfiguration type=\"org.eclipse.pde.ui.RuntimeWorkbench\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<booleanAttribute key=\"append.args\" value=\"true\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<stringAttribute key=\"application\" value=\"at.bestsolution.efxclipse.runtime.workbench.fx.application\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<booleanAttribute key=\"askclear\" value=\"true\"/>");
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
    _builder.append("<booleanAttribute key=\"clearConfig\" value=\"false\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<booleanAttribute key=\"clearws\" value=\"false\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<booleanAttribute key=\"clearwslog\" value=\"false\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<stringAttribute key=\"configLocation\" value=\"${workspace_loc}/.metadata/.plugins/org.eclipse.pde.core/");
    String _projectName = launch.getProjectName();
    _builder.append(_projectName, "	");
    _builder.append(".product\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<booleanAttribute key=\"default\" value=\"false\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<booleanAttribute key=\"includeOptional\" value=\"true\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<stringAttribute key=\"location\" value=\"${workspace_loc}/../runtime-");
    String _projectName_1 = launch.getProjectName();
    _builder.append(_projectName_1, "	");
    _builder.append(".product\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<stringAttribute key=\"org.eclipse.jdt.launching.PROGRAM_ARGUMENTS\" value=\"-nl ${target.nl} -consoleLog -nosplash\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<stringAttribute key=\"org.eclipse.jdt.launching.SOURCE_PATH_PROVIDER\" value=\"org.eclipse.pde.ui.workbenchClasspathProvider\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<stringAttribute key=\"org.eclipse.jdt.launching.VM_ARGUMENTS\" value=\"-Xms40m -Xmx512m -Dosgi.framework.extensions=at.bestsolution.efxclipse.runtime.osgi\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<stringAttribute key=\"pde.version\" value=\"3.3\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<stringAttribute key=\"product\" value=\"");
    String _projectName_2 = launch.getProjectName();
    _builder.append(_projectName_2, "	");
    _builder.append(".product\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<stringAttribute key=\"productFile\" value=\"/");
    String _projectName_3 = launch.getProjectName();
    _builder.append(_projectName_3, "	");
    _builder.append("/");
    String _projectName_4 = launch.getProjectName();
    _builder.append(_projectName_4, "	");
    _builder.append(".product\"/>");
    _builder.newLineIfNotEmpty();
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
    _builder.append("<booleanAttribute key=\"useDefaultConfigArea\" value=\"true\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<booleanAttribute key=\"useProduct\" value=\"true\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<booleanAttribute key=\"usefeatures\" value=\"false\"/>");
    _builder.newLine();
    _builder.append("</launchConfiguration>");
    return _builder;
  }
}
