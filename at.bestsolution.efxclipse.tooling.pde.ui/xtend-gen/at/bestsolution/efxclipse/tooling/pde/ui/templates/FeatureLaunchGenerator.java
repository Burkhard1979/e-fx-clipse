package at.bestsolution.efxclipse.tooling.pde.ui.templates;

import at.bestsolution.efxclipse.tooling.pde.ui.templates.LaunchFeature;
import at.bestsolution.efxclipse.tooling.pde.ui.templates.OSGiLaunchDef;
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
public class FeatureLaunchGenerator implements Generator<DynamicFile> {
  public InputStream generate(final DynamicFile file, final Map<String,Object> data) {
    OSGiLaunchDef _oSGiLaunchDef = new OSGiLaunchDef();
    final OSGiLaunchDef launchDef = _oSGiLaunchDef;
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
    Set<LaunchFeature> _features = launchDef.getFeatures();
    EList<Variable> _variables_1 = file.getVariables();
    final Function1<Variable,Boolean> _function_1 = new Function1<Variable,Boolean>() {
        public Boolean apply(final Variable e) {
          String _key = e.getKey();
          boolean _equals = _key.equals("feature");
          return Boolean.valueOf(_equals);
        }
      };
    Variable _findFirst_1 = IterableExtensions.<Variable>findFirst(_variables_1, _function_1);
    String _defaultValue_1 = _findFirst_1.getDefaultValue();
    LaunchFeature _launchFeature = new LaunchFeature(_defaultValue_1);
    _features.add(_launchFeature);
    CharSequence _generate = this.generate(launchDef);
    String _string = _generate.toString();
    byte[] _bytes = _string.getBytes();
    ByteArrayInputStream _byteArrayInputStream = new ByteArrayInputStream(_bytes);
    return _byteArrayInputStream;
  }
  
  public CharSequence generate(final OSGiLaunchDef launch) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>");
    _builder.newLine();
    _builder.append("<launchConfiguration type=\"org.eclipse.pde.ui.RuntimeWorkbench\">");
    _builder.newLine();
    _builder.append("<setAttribute key=\"additional_plugins\"/>");
    _builder.newLine();
    _builder.append("<booleanAttribute key=\"append.args\" value=\"true\"/>");
    _builder.newLine();
    _builder.append("<booleanAttribute key=\"askclear\" value=\"true\"/>");
    _builder.newLine();
    _builder.append("<booleanAttribute key=\"automaticAdd\" value=\"false\"/>");
    _builder.newLine();
    _builder.append("<booleanAttribute key=\"automaticValidate\" value=\"false\"/>");
    _builder.newLine();
    _builder.append("<stringAttribute key=\"bootstrap\" value=\"\"/>");
    _builder.newLine();
    _builder.append("<stringAttribute key=\"checked\" value=\"[NONE]\"/>");
    _builder.newLine();
    _builder.append("<booleanAttribute key=\"clearConfig\" value=\"false\"/>");
    _builder.newLine();
    _builder.append("<booleanAttribute key=\"clearws\" value=\"false\"/>");
    _builder.newLine();
    _builder.append("<booleanAttribute key=\"clearwslog\" value=\"false\"/>");
    _builder.newLine();
    _builder.append("<stringAttribute key=\"configLocation\" value=\"${workspace_loc}/.metadata/.plugins/org.eclipse.pde.core/");
    String _projectName = launch.getProjectName();
    _builder.append(_projectName, "");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("<booleanAttribute key=\"default\" value=\"false\"/>");
    _builder.newLine();
    _builder.append("<stringAttribute key=\"featureDefaultLocation\" value=\"workspace\"/>");
    _builder.newLine();
    _builder.append("<stringAttribute key=\"featurePluginResolution\" value=\"workspace\"/>");
    _builder.newLine();
    _builder.append("<booleanAttribute key=\"includeOptional\" value=\"true\"/>");
    _builder.newLine();
    _builder.append("<stringAttribute key=\"location\" value=\"${workspace_loc}/../runtime-");
    String _projectName_1 = launch.getProjectName();
    _builder.append(_projectName_1, "");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("<stringAttribute key=\"org.eclipse.jdt.launching.PROGRAM_ARGUMENTS\" value=\"-nl ${target.nl} -consoleLog -nosplash\"/>");
    _builder.newLine();
    _builder.append("<stringAttribute key=\"org.eclipse.jdt.launching.SOURCE_PATH_PROVIDER\" value=\"org.eclipse.pde.ui.workbenchClasspathProvider\"/>");
    _builder.newLine();
    _builder.append("<stringAttribute key=\"org.eclipse.jdt.launching.VM_ARGUMENTS\" value=\"-Dosgi.framework.extensions=at.bestsolution.efxclipse.runtime.osgi\"/>");
    _builder.newLine();
    _builder.append("<stringAttribute key=\"pde.version\" value=\"3.3\"/>");
    _builder.newLine();
    _builder.append("<stringAttribute key=\"product\" value=\"");
    String _projectName_2 = launch.getProjectName();
    _builder.append(_projectName_2, "");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("<stringAttribute key=\"productFile\" value=\"/");
    String _projectName_3 = launch.getProjectName();
    _builder.append(_projectName_3, "");
    _builder.append("/");
    String _projectName_4 = launch.getProjectName();
    _builder.append(_projectName_4, "");
    _builder.append(".product\"/>");
    _builder.newLineIfNotEmpty();
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
    _builder.append("<booleanAttribute key=\"useDefaultConfigArea\" value=\"true\"/>");
    _builder.newLine();
    _builder.append("<booleanAttribute key=\"useProduct\" value=\"true\"/>");
    _builder.newLine();
    _builder.append("<booleanAttribute key=\"usefeatures\" value=\"false\"/>");
    _builder.newLine();
    _builder.append("</launchConfiguration>");
    _builder.newLine();
    return _builder;
  }
}
