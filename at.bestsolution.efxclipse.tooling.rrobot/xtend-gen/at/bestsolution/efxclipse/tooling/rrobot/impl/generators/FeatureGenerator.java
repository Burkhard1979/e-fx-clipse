package at.bestsolution.efxclipse.tooling.rrobot.impl.generators;

import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.FeatureFile;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.FeaturePlugin;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.IncludedFeature;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.LinkedString;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.MatchRule;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.RequiredFeature;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.Generator;
import com.google.common.base.Objects;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.osgi.framework.Version;

@SuppressWarnings("all")
public class FeatureGenerator implements Generator<FeatureFile> {
  public InputStream generate(final FeatureFile file, final Map<String,Object> data) {
    CharSequence _generateContent = this.generateContent(file, data);
    String _string = _generateContent.toString();
    byte[] _bytes = _string.getBytes();
    ByteArrayInputStream _byteArrayInputStream = new ByteArrayInputStream(_bytes);
    return _byteArrayInputStream;
  }
  
  public CharSequence generateContent(final FeatureFile file, final Map<String,Object> data) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.append("<feature");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("id=\"");
    String _featureid = file.getFeatureid();
    _builder.append(_featureid, "	");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("label=\"");
    String _featurename = file.getFeaturename();
    _builder.append(_featurename, "	");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("version=\"");
    Version _version = file.getVersion();
    _builder.append(_version, "	");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("provider-name=\"");
    String _vendor = file.getVendor();
    _builder.append(_vendor, "	");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      boolean _and = false;
      String _license_feature = file.getLicense_feature();
      boolean _notEquals = (!Objects.equal(_license_feature, null));
      if (!_notEquals) {
        _and = false;
      } else {
        Version _license_feature_version = file.getLicense_feature_version();
        boolean _notEquals_1 = (!Objects.equal(_license_feature_version, null));
        _and = (_notEquals && _notEquals_1);
      }
      if (_and) {
        _builder.append("license-feature=\"");
        String _license_feature_1 = file.getLicense_feature();
        _builder.append(_license_feature_1, "	");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("license-feature-version=\"");
        Version _license_feature_version_1 = file.getLicense_feature_version();
        _builder.append(_license_feature_version_1, "	");
        _builder.append("\"");
      }
    }
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    {
      LinkedString _description = file.getDescription();
      boolean _notEquals_2 = (!Objects.equal(_description, null));
      if (_notEquals_2) {
        _builder.append("\t\t");
        _builder.append("<description ");
        {
          LinkedString _description_1 = file.getDescription();
          String _weburl = _description_1.getWeburl();
          boolean _notEquals_3 = (!Objects.equal(_weburl, null));
          if (_notEquals_3) {
            _builder.append("url=\"");
            LinkedString _description_2 = file.getDescription();
            String _weburl_1 = _description_2.getWeburl();
            _builder.append(_weburl_1, "		");
            _builder.append("\"");
          } else {
            _builder.append("url=\"http://www.example.com/description\"");
          }
        }
        _builder.append(">");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        LinkedString _description_3 = file.getDescription();
        String _value = _description_3.getValue();
        _builder.append(_value, "			");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("</description>");
        _builder.newLine();
      } else {
        _builder.append("\t\t");
        _builder.append("<description url=\"http://www.example.com/description\">");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("[Enter Feature Description here.]");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("</description>");
        _builder.newLine();
      }
    }
    _builder.newLine();
    {
      LinkedString _copyright = file.getCopyright();
      boolean _notEquals_4 = (!Objects.equal(_copyright, null));
      if (_notEquals_4) {
        _builder.append("\t\t");
        _builder.append("<copyright ");
        {
          LinkedString _copyright_1 = file.getCopyright();
          boolean _notEquals_5 = (!Objects.equal(_copyright_1, null));
          if (_notEquals_5) {
            _builder.append("url=\"");
            LinkedString _copyright_2 = file.getCopyright();
            String _weburl_2 = _copyright_2.getWeburl();
            _builder.append(_weburl_2, "		");
            _builder.append("\"");
          } else {
            _builder.append("url=\"http://www.example.com/copyright\"");
          }
        }
        _builder.append(">");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        LinkedString _copyright_3 = file.getCopyright();
        String _value_1 = _copyright_3.getValue();
        _builder.append(_value_1, "			");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("</copyright>");
        _builder.newLine();
      } else {
        _builder.append("\t\t");
        _builder.append("<copyright url=\"http://www.example.com/copyright\">");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("[Enter Copyright Description here.]");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("</copyright>");
        _builder.newLine();
      }
    }
    _builder.newLine();
    {
      LinkedString _license = file.getLicense();
      boolean _notEquals_6 = (!Objects.equal(_license, null));
      if (_notEquals_6) {
        _builder.append("\t\t");
        _builder.append("<license ");
        {
          LinkedString _license_1 = file.getLicense();
          boolean _notEquals_7 = (!Objects.equal(_license_1, null));
          if (_notEquals_7) {
            _builder.append("url=\"");
            LinkedString _license_2 = file.getLicense();
            String _weburl_3 = _license_2.getWeburl();
            _builder.append(_weburl_3, "		");
            _builder.append("\"");
          } else {
            _builder.append("url=\"http://www.example.com/license\"");
          }
        }
        _builder.append(">");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        LinkedString _license_3 = file.getLicense();
        String _value_2 = _license_3.getValue();
        _builder.append(_value_2, "			");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("</license>");
        _builder.newLine();
      } else {
        _builder.append("\t\t");
        _builder.append("<license url=\"http://www.example.com/license\">");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("[Enter License Description here.]");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("</license>");
        _builder.newLine();
      }
    }
    _builder.newLine();
    {
      EList<FeaturePlugin> _plugins = file.getPlugins();
      for(final FeaturePlugin p : _plugins) {
        _builder.append("   \t\t");
        _builder.append("<plugin id=\"");
        String _id = p.getId();
        _builder.append(_id, "   		");
        _builder.append("\" install-size=\"0\" version=\"0.0.0\" unpack=\"");
        boolean _isUnpack = p.isUnpack();
        _builder.append(_isUnpack, "   		");
        _builder.append("\" ");
        {
          boolean _isFragment = p.isFragment();
          if (_isFragment) {
            _builder.append("fragment=\"true\"");
          }
        }
        _builder.append("/>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      EList<IncludedFeature> _includedfeatures = file.getIncludedfeatures();
      for(final IncludedFeature i : _includedfeatures) {
        _builder.append("   \t\t");
        _builder.append("<includes id=\"");
        String _id_1 = i.getId();
        _builder.append(_id_1, "   		");
        _builder.append("\" version=\"");
        {
          Version _version_1 = i.getVersion();
          boolean _notEquals_8 = (!Objects.equal(_version_1, null));
          if (_notEquals_8) {
            Version _version_2 = i.getVersion();
            _builder.append(_version_2, "   		");
          } else {
            _builder.append("0.0.0");
          }
        }
        _builder.append("\" />");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      EList<RequiredFeature> _requiredfeatures = file.getRequiredfeatures();
      boolean _isEmpty = _requiredfeatures.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("   \t\t");
        _builder.append("<requires>");
        _builder.newLine();
        {
          EList<RequiredFeature> _requiredfeatures_1 = file.getRequiredfeatures();
          for(final RequiredFeature rf : _requiredfeatures_1) {
            _builder.append("   \t\t");
            _builder.append("\t");
            _builder.append("<import feature=\"");
            String _id_2 = rf.getId();
            _builder.append(_id_2, "   			");
            _builder.append("\" ");
            {
              Version _version_3 = rf.getVersion();
              boolean _notEquals_9 = (!Objects.equal(_version_3, null));
              if (_notEquals_9) {
                _builder.append("version=\"");
                Version _version_4 = rf.getVersion();
                _builder.append(_version_4, "   			");
                _builder.append("\" ");
                {
                  MatchRule _match = rf.getMatch();
                  boolean _notEquals_10 = (!Objects.equal(_match, MatchRule.NONE));
                  if (_notEquals_10) {
                    _builder.append("match=\"");
                    MatchRule _match_1 = rf.getMatch();
                    String _literal = _match_1.getLiteral();
                    _builder.append(_literal, "   			");
                    _builder.append("\"");
                  }
                }
              }
            }
            _builder.append(" />");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("   \t\t");
        _builder.append("</requires>");
        _builder.newLine();
      }
    }
    _builder.append("</feature>");
    _builder.newLine();
    return _builder;
  }
}
