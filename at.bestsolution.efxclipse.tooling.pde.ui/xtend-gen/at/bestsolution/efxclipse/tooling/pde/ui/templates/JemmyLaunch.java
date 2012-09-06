package at.bestsolution.efxclipse.tooling.pde.ui.templates;

import at.bestsolution.efxclipse.tooling.pde.ui.templates.JemmyLaunchDef;
import at.bestsolution.efxclipse.tooling.pde.ui.templates.PluginLaunchDef;
import java.util.Set;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class JemmyLaunch {
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
    boolean b1 = false;
    {
      Set<PluginLaunchDef> _targetPlugins = launch.getTargetPlugins();
      for(final PluginLaunchDef p : _targetPlugins) {
        {
          if (b1) {
            _builder.append(",");
          }
        }
        String _name = p.getName();
        _builder.append(_name, "	");
        _builder.append("@");
        String _startLevel = p.getStartLevel();
        _builder.append(_startLevel, "	");
        _builder.append(":");
        String _autoStart = p.getAutoStart();
        _builder.append(_autoStart, "	");
        boolean tmp1 = b1 = true;
      }
    }
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<stringAttribute key=\"selected_workspace_plugins\" value=\"");
    boolean b2 = false;
    {
      Set<PluginLaunchDef> _workbenchPlugins = launch.getWorkbenchPlugins();
      for(final PluginLaunchDef p_1 : _workbenchPlugins) {
        {
          if (b2) {
            _builder.append(",");
          }
        }
        String _name_1 = p_1.getName();
        _builder.append(_name_1, "	");
        _builder.append("@");
        String _startLevel_1 = p_1.getStartLevel();
        _builder.append(_startLevel_1, "	");
        _builder.append(":");
        String _autoStart_1 = p_1.getAutoStart();
        _builder.append(_autoStart_1, "	");
        boolean tmp2 = b2 = true;
      }
    }
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
