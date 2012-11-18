package at.bestsolution.efxclipse.tooling.rrobot.impl.generators;

import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BuildProperties;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundleProject;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.PluginXMLFile;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.Folder;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.Generator;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.Resource;
import com.google.common.base.Objects;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class BuildPropertiesGenerator implements Generator<BuildProperties> {
  public InputStream generate(final BuildProperties file, final Map<String,Object> data) {
    CharSequence _generateContent = this.generateContent(file, data);
    String _string = _generateContent.toString();
    byte[] _bytes = _string.getBytes();
    ByteArrayInputStream _byteArrayInputStream = new ByteArrayInputStream(_bytes);
    return _byteArrayInputStream;
  }
  
  public CharSequence generateContent(final BuildProperties file, final Map<String,Object> data) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("bin.includes = .,\\");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("META-INF/");
    {
      EObject _eContainer = file.eContainer();
      PluginXMLFile _pluginxml = ((BundleProject) _eContainer).getPluginxml();
      boolean _notEquals = (!Objects.equal(_pluginxml, null));
      if (_notEquals) {
        _builder.append(",\\");
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        _builder.append("plugin.xml");
      }
    }
    {
      EList<Resource> _binIncludes = file.getBinIncludes();
      boolean _isEmpty = _binIncludes.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append(",\\");
        _builder.newLineIfNotEmpty();
        EList<Resource> _binIncludes_1 = file.getBinIncludes();
        final Function1<Resource,String> _function = new Function1<Resource,String>() {
            public String apply(final Resource r) {
              String _fullpath = BuildPropertiesGenerator.this.fullpath(r);
              return _fullpath;
            }
          };
        List<String> _map = ListExtensions.<Resource, String>map(_binIncludes_1, _function);
        String _join = IterableExtensions.join(_map, ",\\\n ");
        _builder.append(_join, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public String fullpath(final Resource r) {
    Resource res = r;
    String rv = r.getName();
    if ((r instanceof Folder)) {
      String _plus = (rv + "/");
      rv = _plus;
    }
    EObject _eContainer = res.eContainer();
    boolean _while = (_eContainer instanceof Resource);
    while (_while) {
      {
        EObject _eContainer_1 = res.eContainer();
        res = ((Resource) _eContainer_1);
        String _name = res.getName();
        String _plus_1 = (_name + "/");
        String _plus_2 = (_plus_1 + rv);
        rv = _plus_2;
      }
      EObject _eContainer_1 = res.eContainer();
      _while = (_eContainer_1 instanceof Resource);
    }
    return rv;
  }
}
