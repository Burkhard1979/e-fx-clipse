package at.bestsolution.efxclipse.tooling.rrobot.impl.generators;

import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.Attribute;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.Element;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.Extension;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.PluginXMLFile;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.BooleanExpression;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.ExcludeableElementMixin;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.Generator;
import com.google.common.base.Objects;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class PluginXMLGenerator implements Generator<PluginXMLFile> {
  public InputStream generate(final PluginXMLFile file, final Map<String,Object> data) {
    CharSequence _generateContent = this.generateContent(file, data);
    String _string = _generateContent.toString();
    byte[] _bytes = _string.getBytes();
    ByteArrayInputStream _byteArrayInputStream = new ByteArrayInputStream(_bytes);
    return _byteArrayInputStream;
  }
  
  public CharSequence generateContent(final PluginXMLFile file, final Map<String,Object> data) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.append("<?eclipse version=\"3.0\"?>");
    _builder.newLine();
    _builder.append("<plugin>");
    _builder.newLine();
    {
      EList<Extension> _extensions = file.getExtensions();
      final Function1<Extension,Boolean> _function = new Function1<Extension,Boolean>() {
          public Boolean apply(final Extension e) {
            boolean _excludeExpression = PluginXMLGenerator.this.excludeExpression(e, data);
            return Boolean.valueOf(_excludeExpression);
          }
        };
      Iterable<Extension> _filter = IterableExtensions.<Extension>filter(_extensions, _function);
      for(final Extension ext : _filter) {
        _builder.append("<extension ");
        {
          String _id = ext.getId();
          boolean _notEquals = (!Objects.equal(_id, null));
          if (_notEquals) {
            _builder.append("id=\"");
            String _id_1 = ext.getId();
            _builder.append(_id_1, "");
            _builder.append("\"");
          }
        }
        _builder.append(" point=\"");
        String _point = ext.getPoint();
        _builder.append(_point, "");
        _builder.append("\">");
        _builder.newLineIfNotEmpty();
        {
          EList<Element> _elements = ext.getElements();
          for(final Element el : _elements) {
            _builder.append("\t");
            CharSequence _elementBuilder = this.elementBuilder(el);
            _builder.append(_elementBuilder, "	");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("</extension>");
        _builder.newLine();
      }
    }
    _builder.append("</plugin>");
    _builder.newLine();
    return _builder;
  }
  
  public boolean excludeExpression(final ExcludeableElementMixin mixin, final Map<String,Object> data) {
    BooleanExpression _excludeExpression = mixin.getExcludeExpression();
    boolean _notEquals = (!Objects.equal(_excludeExpression, null));
    if (_notEquals) {
      BooleanExpression _excludeExpression_1 = mixin.getExcludeExpression();
      boolean _execute = _excludeExpression_1.execute(data);
      return (!_execute);
    }
    return true;
  }
  
  public CharSequence elementBuilder(final Element el) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<");
    String _name = el.getName();
    _builder.append(_name, "");
    _builder.append(" ");
    EList<Attribute> _attributes = el.getAttributes();
    final Function1<Attribute,String> _function = new Function1<Attribute,String>() {
        public String apply(final Attribute a) {
          String _name = a.getName();
          String _plus = (_name + "=\"");
          String _value = a.getValue();
          String _plus_1 = (_plus + _value);
          String _plus_2 = (_plus_1 + "\"");
          return _plus_2;
        }
      };
    List<String> _map = ListExtensions.<Attribute, String>map(_attributes, _function);
    String _join = IterableExtensions.join(_map, " ");
    _builder.append(_join, "");
    _builder.append(" ");
    {
      EList<Element> _children = el.getChildren();
      boolean _isEmpty = _children.isEmpty();
      if (_isEmpty) {
        _builder.append("/");
      }
    }
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    {
      EList<Element> _children_1 = el.getChildren();
      boolean _isEmpty_1 = _children_1.isEmpty();
      boolean _not = (!_isEmpty_1);
      if (_not) {
        {
          EList<Element> _children_2 = el.getChildren();
          for(final Element c : _children_2) {
            _builder.append("\t");
            CharSequence _elementBuilder = this.elementBuilder(c);
            _builder.append(_elementBuilder, "	");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("</");
        String _name_1 = el.getName();
        _builder.append(_name_1, "");
        _builder.append(">");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    return _builder;
  }
}
