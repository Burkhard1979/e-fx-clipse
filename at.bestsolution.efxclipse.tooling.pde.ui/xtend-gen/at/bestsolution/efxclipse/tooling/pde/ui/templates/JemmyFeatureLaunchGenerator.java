package at.bestsolution.efxclipse.tooling.pde.ui.templates;

import at.bestsolution.efxclipse.tooling.pde.ui.templates.JUnitLaunchDef;
import at.bestsolution.efxclipse.tooling.pde.ui.templates.LaunchFeature;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.DynamicFile;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.Generator;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.Variable;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class JemmyFeatureLaunchGenerator implements Generator<DynamicFile> {
  public InputStream generate(final DynamicFile file, final Map<String,Object> data) {
    JUnitLaunchDef _jUnitLaunchDef = new JUnitLaunchDef();
    final JUnitLaunchDef launchDef = _jUnitLaunchDef;
    EList<Variable> _variables = file.getVariables();
    final Function1<Variable,Boolean> _function = new Function1<Variable,Boolean>() {
        public Boolean apply(final Variable e) {
          String _key = e.getKey();
          boolean _equals = _key.equals("projectName");
          return Boolean.valueOf(_equals);
        }
      };
    Variable _findFirst = IterableExtensions.<Variable>findFirst(_variables, _function);
    String _defaultValue = _findFirst.getDefaultValue();
    launchDef.setProjectName(_defaultValue);
    EList<Variable> _variables_1 = file.getVariables();
    final Function1<Variable,Boolean> _function_1 = new Function1<Variable,Boolean>() {
        public Boolean apply(final Variable e) {
          String _key = e.getKey();
          boolean _equals = _key.equals("testSuite");
          return Boolean.valueOf(_equals);
        }
      };
    Variable _findFirst_1 = IterableExtensions.<Variable>findFirst(_variables_1, _function_1);
    String _defaultValue_1 = _findFirst_1.getDefaultValue();
    launchDef.setJunitClassName(_defaultValue_1);
    EList<Variable> _variables_2 = file.getVariables();
    final Function1<Variable,Boolean> _function_2 = new Function1<Variable,Boolean>() {
        public Boolean apply(final Variable e) {
          String _key = e.getKey();
          boolean _equals = _key.equals("testProductId");
          return Boolean.valueOf(_equals);
        }
      };
    Variable _findFirst_2 = IterableExtensions.<Variable>findFirst(_variables_2, _function_2);
    String _defaultValue_2 = _findFirst_2.getDefaultValue();
    launchDef.setTestProductId(_defaultValue_2);
    EList<Variable> _variables_3 = file.getVariables();
    final Function1<Variable,Boolean> _function_3 = new Function1<Variable,Boolean>() {
        public Boolean apply(final Variable e) {
          String _key = e.getKey();
          boolean _equals = _key.equals("featureList");
          return Boolean.valueOf(_equals);
        }
      };
    Variable _findFirst_3 = IterableExtensions.<Variable>findFirst(_variables_3, _function_3);
    String _defaultValue_3 = _findFirst_3.getDefaultValue();
    final String[] vals = _defaultValue_3.split(",");
    for (final String v : vals) {
      Set<LaunchFeature> _features = launchDef.getFeatures();
      LaunchFeature _launchFeature = new LaunchFeature(v);
      _features.add(_launchFeature);
    }
    CharSequence _generate = this.generate(launchDef);
    String _string = _generate.toString();
    byte[] _bytes = _string.getBytes();
    ByteArrayInputStream _byteArrayInputStream = new ByteArrayInputStream(_bytes);
    return _byteArrayInputStream;
  }
  
  public CharSequence generate(final JUnitLaunchDef launch) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>");
    _builder.newLine();
    _builder.append("<launchConfiguration type=\"org.eclipse.pde.ui.JunitLaunchConfig\">");
    _builder.newLine();
    _builder.append("<setAttribute key=\"additional_plugins\"/>");
    _builder.newLine();
    _builder.append("<booleanAttribute key=\"append.args\" value=\"true\"/>");
    _builder.newLine();
    _builder.append("<stringAttribute key=\"application\" value=\"org.eclipse.pde.junit.runtime.coretestapplication\"/>");
    _builder.newLine();
    _builder.append("<booleanAttribute key=\"askclear\" value=\"false\"/>");
    _builder.newLine();
    _builder.append("<booleanAttribute key=\"automaticAdd\" value=\"false\"/>");
    _builder.newLine();
    _builder.append("<booleanAttribute key=\"automaticValidate\" value=\"false\"/>");
    _builder.newLine();
    _builder.append("<stringAttribute key=\"bootstrap\" value=\"\"/>");
    _builder.newLine();
    _builder.append("<stringAttribute key=\"checked\" value=\"[NONE]\"/>");
    _builder.newLine();
    _builder.append("<booleanAttribute key=\"clearConfig\" value=\"true\"/>");
    _builder.newLine();
    _builder.append("<booleanAttribute key=\"clearws\" value=\"true\"/>");
    _builder.newLine();
    _builder.append("<booleanAttribute key=\"clearwslog\" value=\"false\"/>");
    _builder.newLine();
    _builder.append("<stringAttribute key=\"configLocation\" value=\"${workspace_loc}/.metadata/.plugins/org.eclipse.pde.core/pde-junit\"/>");
    _builder.newLine();
    _builder.append("<booleanAttribute key=\"default\" value=\"false\"/>");
    _builder.newLine();
    _builder.append("<stringAttribute key=\"featureDefaultLocation\" value=\"workspace\"/>");
    _builder.newLine();
    _builder.append("<stringAttribute key=\"featurePluginResolution\" value=\"workspace\"/>");
    _builder.newLine();
    _builder.append("<booleanAttribute key=\"includeOptional\" value=\"true\"/>");
    _builder.newLine();
    _builder.append("<stringAttribute key=\"location\" value=\"${workspace_loc}/../junit-workspace\"/>");
    _builder.newLine();
    _builder.append("<listAttribute key=\"org.eclipse.debug.core.MAPPED_RESOURCE_PATHS\">");
    _builder.newLine();
    _builder.append("<listEntry value=\"/my.app.sample.jemmy/src/my/app/sample/jemmy/TestSuite.java\"/>");
    _builder.newLine();
    _builder.append("</listAttribute>");
    _builder.newLine();
    _builder.append("<listAttribute key=\"org.eclipse.debug.core.MAPPED_RESOURCE_TYPES\">");
    _builder.newLine();
    _builder.append("<listEntry value=\"1\"/>");
    _builder.newLine();
    _builder.append("</listAttribute>");
    _builder.newLine();
    _builder.append("<stringAttribute key=\"org.eclipse.jdt.junit.CONTAINER\" value=\"\"/>");
    _builder.newLine();
    _builder.append("<booleanAttribute key=\"org.eclipse.jdt.junit.KEEPRUNNING_ATTR\" value=\"false\"/>");
    _builder.newLine();
    _builder.append("<stringAttribute key=\"org.eclipse.jdt.junit.TESTNAME\" value=\"\"/>");
    _builder.newLine();
    _builder.append("<stringAttribute key=\"org.eclipse.jdt.junit.TEST_KIND\" value=\"org.eclipse.jdt.junit.loader.junit4\"/>");
    _builder.newLine();
    _builder.append("<stringAttribute key=\"org.eclipse.jdt.launching.MAIN_TYPE\" value=\"");
    String _junitClassName = launch.getJunitClassName();
    _builder.append(_junitClassName, "");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("<stringAttribute key=\"org.eclipse.jdt.launching.PROGRAM_ARGUMENTS\" value=\"-nl ${target.nl} -consoleLog -nosplash\"/>");
    _builder.newLine();
    _builder.append("<stringAttribute key=\"org.eclipse.jdt.launching.PROJECT_ATTR\" value=\"");
    String _projectName = launch.getProjectName();
    _builder.append(_projectName, "");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("<stringAttribute key=\"org.eclipse.jdt.launching.SOURCE_PATH_PROVIDER\" value=\"org.eclipse.pde.ui.workbenchClasspathProvider\"/>");
    _builder.newLine();
    _builder.append("<stringAttribute key=\"org.eclipse.jdt.launching.VM_ARGUMENTS\" value=\"-Xms40m -Xmx512m -Dosgi.framework.extensions=at.bestsolution.efxclipse.runtime.osgi -Dtest.jemmy.product=");
    String _testProductId = launch.getTestProductId();
    _builder.append(_testProductId, "");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("<stringAttribute key=\"pde.version\" value=\"3.3\"/>");
    _builder.newLine();
    _builder.append("<stringAttribute key=\"product\" value=\"org.eclipse.sdk.ide\"/>");
    _builder.newLine();
    _builder.append("<booleanAttribute key=\"run_in_ui_thread\" value=\"false\"/>");
    _builder.newLine();
    _builder.append("<setAttribute key=\"selected_features\">");
    _builder.newLine();
    {
      Set<LaunchFeature> _features = launch.getFeatures();
      for(final LaunchFeature f : _features) {
        _builder.append("<setEntry value=\"");
        String _name = f.getName();
        _builder.append(_name, "");
        _builder.append(":default\"/>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</setAttribute>");
    _builder.newLine();
    _builder.append("<booleanAttribute key=\"show_selected_only\" value=\"false\"/>");
    _builder.newLine();
    _builder.append("<booleanAttribute key=\"tracing\" value=\"false\"/>");
    _builder.newLine();
    _builder.append("<booleanAttribute key=\"useCustomFeatures\" value=\"true\"/>");
    _builder.newLine();
    _builder.append("<booleanAttribute key=\"useDefaultConfig\" value=\"true\"/>");
    _builder.newLine();
    _builder.append("<booleanAttribute key=\"useDefaultConfigArea\" value=\"false\"/>");
    _builder.newLine();
    _builder.append("<booleanAttribute key=\"useProduct\" value=\"false\"/>");
    _builder.newLine();
    _builder.append("</launchConfiguration>");
    _builder.newLine();
    return _builder;
  }
}
