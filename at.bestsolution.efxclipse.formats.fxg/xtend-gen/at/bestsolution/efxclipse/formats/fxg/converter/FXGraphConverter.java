package at.bestsolution.efxclipse.formats.fxg.converter;

import at.bestsolution.efxclipse.formats.fxg.converter.ValuePropertyFormatter;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Define;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Element;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Import;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Model;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.PackageDeclaration;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ValueProperty;
import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IntegerRange;

@SuppressWarnings("all")
public class FXGraphConverter {
  public CharSequence generate(final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    {
      PackageDeclaration _package = model.getPackage();
      String _name = _package==null?(String)null:_package.getName();
      int _length = _name==null?0:_name.length();
      boolean _greaterThan = (_length > 0);
      if (_greaterThan) {
        _builder.append("package ");
        PackageDeclaration _package_1 = model.getPackage();
        String _name_1 = _package_1.getName();
        _builder.append(_name_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Import> _imports = model.getImports();
      int _size = _imports.size();
      boolean _greaterThan_1 = (_size > 0);
      if (_greaterThan_1) {
        _builder.newLine();
      }
    }
    {
      EList<Import> _imports_1 = model.getImports();
      for(final Import imp : _imports_1) {
        _builder.append("import ");
        String _importedNamespace = imp.getImportedNamespace();
        _builder.append(_importedNamespace, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("component ");
    ComponentDefinition _componentDef = model.getComponentDef();
    String _name_2 = _componentDef.getName();
    _builder.append(_name_2, "");
    {
      ComponentDefinition _componentDef_1 = model.getComponentDef();
      EList<String> _previewCssFiles = _componentDef_1.getPreviewCssFiles();
      boolean _isEmpty = _previewCssFiles.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append(" styledwith [\"");
        {
          ComponentDefinition _componentDef_2 = model.getComponentDef();
          EList<String> _previewCssFiles_1 = _componentDef_2.getPreviewCssFiles();
          for(final String css : _previewCssFiles_1) {
            _builder.append(css, "");
          }
        }
        _builder.append("\"]");
      }
    }
    {
      ComponentDefinition _componentDef_3 = model.getComponentDef();
      String _previewResourceBundle = _componentDef_3.getPreviewResourceBundle();
      boolean _notEquals = (!Objects.equal(_previewResourceBundle, null));
      if (_notEquals) {
        _builder.append(" resourcefile \"");
        ComponentDefinition _componentDef_4 = model.getComponentDef();
        String _previewResourceBundle_1 = _componentDef_4.getPreviewResourceBundle();
        _builder.append(_previewResourceBundle_1, "");
        _builder.append("\"");
      }
    }
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      ComponentDefinition _componentDef_5 = model.getComponentDef();
      EList<Define> _defines = _componentDef_5.getDefines();
      for(final Define d : _defines) {
        _builder.append("\t");
        Element _element = d.getElement();
        CharSequence _generate = this.generate(_element);
        _builder.append(_generate, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate(final Element parent) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = parent.getName();
    _builder.append(_name, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      EList<Property> _properties = parent.getProperties();
      int _size = _properties.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        {
          EList<Property> _properties_1 = parent.getProperties();
          int _size_1 = _properties_1.size();
          IntegerRange _upTo = new IntegerRange(1, _size_1);
          for(final Integer i : _upTo) {
            boolean _or = false;
            EList<Property> _properties_2 = parent.getProperties();
            int _size_2 = _properties_2.size();
            boolean _lessThan = ((i).intValue() < _size_2);
            if (_lessThan) {
              _or = true;
            } else {
              EList<Element> _defaultChildren = parent.getDefaultChildren();
              int _size_3 = _defaultChildren.size();
              boolean _greaterThan_1 = (_size_3 > 0);
              _or = (_lessThan || _greaterThan_1);
            }
            final boolean comma = _or;
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            EList<Property> _properties_3 = parent.getProperties();
            int _minus = ((i).intValue() - 1);
            final Property p = _properties_3.get(_minus);
            _builder.newLineIfNotEmpty();
            {
              String _modifier = p.getModifier();
              boolean _notEquals = (!Objects.equal(_modifier, null));
              if (_notEquals) {
                _builder.append("\t");
                String _name_1 = p.getName();
                _builder.append(_name_1, "	");
                _builder.append(" : ");
                String _modifier_1 = p.getModifier();
                _builder.append(_modifier_1, "	");
                _builder.append(" {");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                ValueProperty _value = p.getValue();
                ValuePropertyFormatter _valuePropertyFormatter = new ValuePropertyFormatter(_value);
                String _formattedValue = _valuePropertyFormatter.getFormattedValue();
                _builder.append(_formattedValue, "	");
                {
                  if (comma) {
                    _builder.append(",");
                  }
                }
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("}");
                _builder.newLine();
              } else {
                _builder.append("\t");
                String _name_2 = p.getName();
                _builder.append(_name_2, "	");
                _builder.append(" : \"");
                ValueProperty _value_1 = p.getValue();
                ValuePropertyFormatter _valuePropertyFormatter_1 = new ValuePropertyFormatter(_value_1);
                String _formattedValue_1 = _valuePropertyFormatter_1.getFormattedValue();
                _builder.append(_formattedValue_1, "	");
                _builder.append("\"");
                {
                  if (comma) {
                    _builder.append(",");
                  }
                }
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    {
      EList<Element> _defaultChildren_1 = parent.getDefaultChildren();
      int _size_4 = _defaultChildren_1.size();
      boolean _greaterThan_2 = (_size_4 > 0);
      if (_greaterThan_2) {
        _builder.append("children : [");
        _builder.newLine();
        {
          EList<Element> _defaultChildren_2 = parent.getDefaultChildren();
          int _size_5 = _defaultChildren_2.size();
          IntegerRange _upTo_1 = new IntegerRange(1, _size_5);
          for(final Integer i_1 : _upTo_1) {
            EList<Element> _defaultChildren_3 = parent.getDefaultChildren();
            int _minus_1 = ((i_1).intValue() - 1);
            final Element child = _defaultChildren_3.get(_minus_1);
            _builder.newLineIfNotEmpty();
            CharSequence _generate = this.generate(child);
            _builder.append(_generate, "");
            {
              EList<Element> _defaultChildren_4 = parent.getDefaultChildren();
              int _size_6 = _defaultChildren_4.size();
              boolean _lessThan_1 = ((i_1).intValue() < _size_6);
              if (_lessThan_1) {
                _builder.append(",");
              }
            }
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("]");
        _builder.newLine();
      }
    }
    _builder.append("}");
    return _builder;
  }
}
