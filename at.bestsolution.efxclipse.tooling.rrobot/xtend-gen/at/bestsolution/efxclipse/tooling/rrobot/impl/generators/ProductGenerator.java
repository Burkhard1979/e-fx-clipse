package at.bestsolution.efxclipse.tooling.rrobot.impl.generators;

import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ProductFeature;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ProductFile;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ProductFileFeaturebase;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ProductStartConfig;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.Generator;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.osgi.framework.Version;

@SuppressWarnings("all")
public class ProductGenerator implements Generator<ProductFile> {
  public InputStream generate(final ProductFile file, final Map<String,Object> data) {
    CharSequence _generateContent = this.generateContent(file, data);
    String _string = _generateContent.toString();
    byte[] _bytes = _string.getBytes();
    ByteArrayInputStream _byteArrayInputStream = new ByteArrayInputStream(_bytes);
    return _byteArrayInputStream;
  }
  
  public CharSequence generateContent(final ProductFile file, final Map<String,Object> data) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.append("<?pde version=\"3.5\"?>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<product name=\"");
    String _productName = file.getProductName();
    _builder.append(_productName, "");
    _builder.append("\" id=\"");
    String _id = file.getId();
    _builder.append(_id, "");
    _builder.append("\" application=\"");
    String _application = file.getApplication();
    _builder.append(_application, "");
    _builder.append("\" version=\"");
    Version _version = file.getVersion();
    _builder.append(_version, "");
    _builder.append("\" useFeatures=\"");
    _builder.append((file instanceof ProductFileFeaturebase), "");
    _builder.append("\" includeLaunchers=\"");
    boolean _isIncludeLaunchers = file.isIncludeLaunchers();
    _builder.append(_isIncludeLaunchers, "");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<configIni use=\"default\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</configIni>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<launcherArgs>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<programArgs>");
    String _programArgs = file.getProgramArgs();
    _builder.append(_programArgs, "		");
    _builder.append("</programArgs>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<vmArgs>");
    String _vmArgs = file.getVmArgs();
    _builder.append(_vmArgs, "		");
    _builder.append("</vmArgs>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("</launcherArgs>");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<windowImages/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      if ((file instanceof ProductFileFeaturebase)) {
        _builder.append("\t");
        _builder.append("<features>");
        _builder.newLine();
        {
          EList<ProductFeature> _features = ((ProductFileFeaturebase) file).getFeatures();
          for(final ProductFeature pf : _features) {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<feature id=\"");
            String _id_1 = pf.getId();
            _builder.append(_id_1, "		");
            _builder.append("\" version=\"");
            Version _version_1 = pf.getVersion();
            _builder.append(_version_1, "		");
            _builder.append("\"/>");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("</features>");
        _builder.newLine();
      }
    }
    {
      EList<ProductStartConfig> _startconfigurations = file.getStartconfigurations();
      boolean _isEmpty = _startconfigurations.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("\t");
        _builder.append("<configurations>");
        _builder.newLine();
        {
          EList<ProductStartConfig> _startconfigurations_1 = file.getStartconfigurations();
          for(final ProductStartConfig c : _startconfigurations_1) {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<plugin id=\"");
            String _id_2 = c.getId();
            _builder.append(_id_2, "		");
            _builder.append("\" autoStart=\"");
            boolean _isAutoStart = c.isAutoStart();
            _builder.append(_isAutoStart, "		");
            _builder.append("\" startLevel=\"");
            int _startLevel = c.getStartLevel();
            _builder.append(_startLevel, "		");
            _builder.append("\" />");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("</configurations>");
        _builder.newLine();
      }
    }
    _builder.append("</product>");
    _builder.newLine();
    _builder.append("   ");
    _builder.newLine();
    return _builder;
  }
}
