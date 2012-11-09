package at.bestsolution.efxclipse.formats.fxg.converter;

import at.bestsolution.efxclipse.formats.fxg.converter.CastHelper;
import at.bestsolution.efxclipse.formats.fxg.converter.ValuePropertyFormatter;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Define;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Element;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.FactoryValueElement;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Import;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ListValueElement;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ListValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.MapValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Model;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.PackageDeclaration;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Script;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.SimpleValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.StaticCallValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.StaticValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ValueProperty;
import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.lib.StringExtensions;

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
    EList<Import> _imports = model.getImports();
    CharSequence _generateImports = this.generateImports(_imports);
    _builder.append(_generateImports, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    ComponentDefinition _componentDef = model.getComponentDef();
    CharSequence _generateComponentDefinition = this.generateComponentDefinition(_componentDef);
    _builder.append(_generateComponentDefinition, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateComponentDefinition(final ComponentDefinition cd) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isDynamicRoot = cd.isDynamicRoot();
      if (_isDynamicRoot) {
        _builder.append("dynamic ");
      }
    }
    _builder.append("component ");
    String _name = cd.getName();
    _builder.append(_name, "");
    JvmTypeReference _controller = cd.getController();
    CharSequence _generateController = this.generateController(_controller);
    _builder.append(_generateController, "");
    EList<String> _previewCssFiles = cd.getPreviewCssFiles();
    CharSequence _generateStyle = this.generateStyle(_previewCssFiles);
    _builder.append(_generateStyle, "");
    String _previewResourceBundle = cd.getPreviewResourceBundle();
    CharSequence _generateResourceBundle = this.generateResourceBundle(_previewResourceBundle);
    _builder.append(_generateResourceBundle, "");
    EList<String> _previewClasspathEntries = cd.getPreviewClasspathEntries();
    CharSequence _generateExtraClassPath = this.generateExtraClassPath(_previewClasspathEntries);
    _builder.append(_generateExtraClassPath, "");
    ComponentDefinition _sceneDefinition = cd.getSceneDefinition();
    CharSequence _generateSceneSetup = this.generateSceneSetup(_sceneDefinition);
    _builder.append(_generateSceneSetup, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      EList<Script> _scripts = cd.getScripts();
      for(final Script s : _scripts) {
        _builder.append("\t");
        CharSequence _generateScript = this.generateScript(s);
        _builder.append(_generateScript, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    Boolean comma = Boolean.valueOf(false);
    _builder.newLineIfNotEmpty();
    {
      EList<Define> _defines = cd.getDefines();
      for(final Define d : _defines) {
        _builder.append("\t");
        {
          if ((comma).booleanValue()) {
            _builder.append(",");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        CharSequence _generateDefine = this.generateDefine(d);
        _builder.append(_generateDefine, "	");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        final Boolean nix = comma = Boolean.valueOf(true);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    Element _rootNode = cd.getRootNode();
    CharSequence _generateElement = this.generateElement(_rootNode);
    _builder.append(_generateElement, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateDefine(final Define define) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("define ");
    Element _element = define.getElement();
    CharSequence _generateElement = this.generateElement(_element);
    _builder.append(_generateElement, "");
    return _builder;
  }
  
  public CharSequence generateController(final JvmTypeReference controller) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _notEquals = (!Objects.equal(controller, null));
      if (_notEquals) {
        _builder.append(" controlledby ");
        JvmType _type = controller.getType();
        String _simpleName = _type.getSimpleName();
        _builder.append(_simpleName, "");
      }
    }
    return _builder;
  }
  
  public CharSequence generateStyle(final EList<String> previewCssFiles) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isEmpty = previewCssFiles.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append(" styledwith [\"");
        {
          for(final String css : previewCssFiles) {
            _builder.append(css, "");
          }
        }
        _builder.append("\"]");
      }
    }
    return _builder;
  }
  
  public CharSequence generateResourceBundle(final String previewResourceBundle) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _notEquals = (!Objects.equal(previewResourceBundle, null));
      if (_notEquals) {
        _builder.append(" resourcefile \"");
        _builder.append(previewResourceBundle, "");
        _builder.append("\"");
      }
    }
    return _builder;
  }
  
  public CharSequence generateExtraClassPath(final EList<String> previewClasspathEntries) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isEmpty = previewClasspathEntries.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append(" extraClasspath [\"");
        {
          for(final String cp : previewClasspathEntries) {
            _builder.append(cp, "");
          }
        }
        _builder.append("\"]");
      }
    }
    return _builder;
  }
  
  public CharSequence generateSceneSetup(final ComponentDefinition sceneDefinition) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _notEquals = (!Objects.equal(sceneDefinition, null));
      if (_notEquals) {
        _builder.append(" sceneSetup \"");
        CharSequence _generateComponentDefinition = this.generateComponentDefinition(sceneDefinition);
        _builder.append(_generateComponentDefinition, "");
        _builder.append("\"");
      }
    }
    return _builder;
  }
  
  public CharSequence generateImports(final EList<Import> imports) {
    StringConcatenation _builder = new StringConcatenation();
    {
      int _size = imports.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        _builder.newLine();
      }
    }
    {
      for(final Import imp : imports) {
        _builder.append("import ");
        String _importedNamespace = imp.getImportedNamespace();
        _builder.append(_importedNamespace, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence generateScript(final Script s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("script ");
    String _language = s.getLanguage();
    _builder.append(_language, "");
    _builder.append(" #{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _source = s.getSource();
      boolean _notEquals = (!Objects.equal(_source, null));
      if (_notEquals) {
        String _source_1 = s.getSource();
        _builder.append(_source_1, "	");
      } else {
        String _sourcecode = s.getSourcecode();
        _builder.append(_sourcecode, "	");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}#\t");
    return _builder;
  }
  
  public CharSequence generateElement(final Element element) {
    StringConcatenation _builder = new StringConcatenation();
    JvmTypeReference _type = element.getType();
    String _simpleName = _type.getSimpleName();
    _builder.append(_simpleName, "");
    {
      SimpleValueProperty _value = element.getValue();
      boolean _notEquals = (!Objects.equal(_value, null));
      if (_notEquals) {
        _builder.append(" ( ");
        SimpleValueProperty _value_1 = element.getValue();
        String _stringValue = _value_1.getStringValue();
        _builder.append(_stringValue, "");
        _builder.append(" )");
      }
    }
    {
      String _name = element.getName();
      boolean _notEquals_1 = (!Objects.equal(_name, null));
      if (_notEquals_1) {
        _builder.append(" id ");
        String _name_1 = element.getName();
        _builder.append(_name_1, "");
      }
    }
    {
      boolean _elementHasSubEntries = this.elementHasSubEntries(element);
      if (_elementHasSubEntries) {
        _builder.append(" {");
        _builder.newLineIfNotEmpty();
        Boolean comma = Boolean.valueOf(false);
        _builder.newLineIfNotEmpty();
        {
          EList<Property> _properties = element.getProperties();
          for(final Property p : _properties) {
            {
              if ((comma).booleanValue()) {
                _builder.append(",");
              }
            }
            {
              ValueProperty _value_2 = p.getValue();
              if ((_value_2 instanceof Element)) {
                CharSequence _generatePropertyElement = this.generatePropertyElement(p);
                _builder.append(_generatePropertyElement, "");
              } else {
                {
                  ValueProperty _value_3 = p.getValue();
                  if ((_value_3 instanceof ListValueProperty)) {
                    CharSequence _generateListValueProperty = this.generateListValueProperty(p);
                    _builder.append(_generateListValueProperty, "");
                  } else {
                    {
                      ValueProperty _value_4 = p.getValue();
                      if ((_value_4 instanceof MapValueProperty)) {
                        CharSequence _generateMapValueProperty = this.generateMapValueProperty(p);
                        _builder.append(_generateMapValueProperty, "");
                      } else {
                        ValuePropertyFormatter _valuePropertyFormatter = new ValuePropertyFormatter(p);
                        String _formattedValue = _valuePropertyFormatter.getFormattedValue();
                        _builder.append(_formattedValue, "");
                      }
                    }
                  }
                }
              }
            }
            _builder.newLineIfNotEmpty();
            final Boolean nix = comma = Boolean.valueOf(true);
            _builder.newLineIfNotEmpty();
          }
        }
        {
          EList<StaticValueProperty> _staticProperties = element.getStaticProperties();
          for(final StaticValueProperty p_1 : _staticProperties) {
            {
              if ((comma).booleanValue()) {
                _builder.append(",");
              }
            }
            ValuePropertyFormatter _valuePropertyFormatter_1 = new ValuePropertyFormatter(p_1);
            String _formattedValue_1 = _valuePropertyFormatter_1.getFormattedValue();
            _builder.append(_formattedValue_1, "");
            _builder.newLineIfNotEmpty();
            final Boolean nix_1 = comma = Boolean.valueOf(true);
            _builder.newLineIfNotEmpty();
          }
        }
        {
          EList<StaticCallValueProperty> _staticCallProperties = element.getStaticCallProperties();
          for(final StaticCallValueProperty p_2 : _staticCallProperties) {
            {
              if ((comma).booleanValue()) {
                _builder.append(",");
              }
            }
            ValuePropertyFormatter _valuePropertyFormatter_2 = new ValuePropertyFormatter(p_2);
            String _formattedValue_2 = _valuePropertyFormatter_2.getFormattedValue();
            _builder.append(_formattedValue_2, "");
            _builder.newLineIfNotEmpty();
            final Boolean nix_2 = comma = Boolean.valueOf(true);
            _builder.newLineIfNotEmpty();
          }
        }
        {
          EList<Element> _defaultChildren = element.getDefaultChildren();
          int _size = _defaultChildren.size();
          boolean _greaterThan = (_size > 0);
          if (_greaterThan) {
            _builder.append("\t");
            {
              if ((comma).booleanValue()) {
                _builder.append(",");
              }
            }
            _builder.append("children : [");
            _builder.newLineIfNotEmpty();
            Boolean internalComma = Boolean.valueOf(false);
            _builder.newLineIfNotEmpty();
            {
              EList<Element> _defaultChildren_1 = element.getDefaultChildren();
              for(final Element e : _defaultChildren_1) {
                {
                  if ((internalComma).booleanValue()) {
                    _builder.append(",");
                  }
                }
                CharSequence _generateElement = this.generateElement(e);
                _builder.append(_generateElement, "");
                _builder.newLineIfNotEmpty();
                final Boolean nix_3 = internalComma = Boolean.valueOf(true);
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t");
            _builder.append("]");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.append("}");
      }
    }
    _builder.append(" ");
    CharSequence _generateFactory = this.generateFactory(element);
    _builder.append(_generateFactory, "");
    return _builder;
  }
  
  public boolean elementHasSubEntries(final Element element) {
    boolean _or = false;
    boolean _or_1 = false;
    boolean _or_2 = false;
    EList<Property> _properties = element.getProperties();
    int _size = _properties.size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      _or_2 = true;
    } else {
      EList<StaticValueProperty> _staticProperties = element.getStaticProperties();
      int _size_1 = _staticProperties.size();
      boolean _greaterThan_1 = (_size_1 > 0);
      _or_2 = (_greaterThan || _greaterThan_1);
    }
    if (_or_2) {
      _or_1 = true;
    } else {
      EList<StaticCallValueProperty> _staticCallProperties = element.getStaticCallProperties();
      int _size_2 = _staticCallProperties.size();
      boolean _greaterThan_2 = (_size_2 > 0);
      _or_1 = (_or_2 || _greaterThan_2);
    }
    if (_or_1) {
      _or = true;
    } else {
      EList<Element> _defaultChildren = element.getDefaultChildren();
      int _size_3 = _defaultChildren.size();
      boolean _greaterThan_3 = (_size_3 > 0);
      _or = (_or_1 || _greaterThan_3);
    }
    return _or;
  }
  
  public CharSequence generateMapValueProperty(final Property p) {
    StringConcatenation _builder = new StringConcatenation();
    CastHelper _castHelper = new CastHelper();
    ValueProperty _value = p.getValue();
    final MapValueProperty list = _castHelper.castToMapValueProperty(_value);
    _builder.newLineIfNotEmpty();
    String _name = p.getName();
    _builder.append(_name, "");
    _builder.append(" : [");
    _builder.newLineIfNotEmpty();
    Boolean comma = Boolean.valueOf(false);
    _builder.newLineIfNotEmpty();
    {
      EList<Property> _properties = list.getProperties();
      for(final Property inner : _properties) {
        _builder.append("\t");
        {
          if ((comma).booleanValue()) {
            _builder.append(",");
          }
        }
        {
          String _name_1 = inner.getName();
          String _firstUpper = StringExtensions.toFirstUpper(_name_1);
          String _name_2 = inner.getName();
          boolean _equals = _firstUpper.equals(_name_2);
          if (_equals) {
            ValuePropertyFormatter _valuePropertyFormatter = new ValuePropertyFormatter(inner);
            String _formattedValue = _valuePropertyFormatter.getFormattedValue();
            _builder.append(_formattedValue, "	");
          } else {
            String _name_3 = inner.getName();
            _builder.append(_name_3, "	");
            _builder.append("(");
            ValueProperty _value_1 = inner.getValue();
            ValuePropertyFormatter _valuePropertyFormatter_1 = new ValuePropertyFormatter(_value_1);
            String _formattedValue_1 = _valuePropertyFormatter_1.getFormattedValue();
            _builder.append(_formattedValue_1, "	");
            _builder.append(")");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        final Boolean nix = comma = Boolean.valueOf(true);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("]");
    return _builder;
  }
  
  public CharSequence generateListValueProperty(final Property p) {
    StringConcatenation _builder = new StringConcatenation();
    CastHelper _castHelper = new CastHelper();
    ValueProperty _value = p.getValue();
    final ListValueProperty list = _castHelper.castToListValueProperty(_value);
    _builder.newLineIfNotEmpty();
    String _name = p.getName();
    _builder.append(_name, "");
    _builder.append(" : [");
    _builder.newLineIfNotEmpty();
    Boolean comma = Boolean.valueOf(false);
    _builder.newLineIfNotEmpty();
    {
      EList<ListValueElement> _value_1 = list.getValue();
      for(final ListValueElement e : _value_1) {
        {
          if ((comma).booleanValue()) {
            _builder.append(",");
          }
        }
        _builder.newLineIfNotEmpty();
        {
          if ((e instanceof Element)) {
            CastHelper _castHelper_1 = new CastHelper();
            Element _castToElement = _castHelper_1.castToElement(e);
            CharSequence _generateElement = this.generateElement(_castToElement);
            _builder.append(_generateElement, "");
          } else {
            ValuePropertyFormatter _valuePropertyFormatter = new ValuePropertyFormatter(e);
            String _formattedValue = _valuePropertyFormatter.getFormattedValue();
            _builder.append(_formattedValue, "");
          }
        }
        _builder.newLineIfNotEmpty();
        final Boolean nix = comma = Boolean.valueOf(true);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("]");
    return _builder;
  }
  
  public CharSequence generatePropertyElement(final Property p) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _name = p.getName();
      char _charAt = _name.charAt(0);
      String _name_1 = p.getName();
      String _firstLower = StringExtensions.toFirstLower(_name_1);
      char _charAt_1 = _firstLower.charAt(0);
      boolean _equals = (_charAt == _charAt_1);
      if (_equals) {
        String _name_2 = p.getName();
        _builder.append(_name_2, "");
        _builder.append(" : ");
      }
    }
    CastHelper _castHelper = new CastHelper();
    ValueProperty _value = p.getValue();
    Element _castToElement = _castHelper.castToElement(_value);
    CharSequence _generateElement = this.generateElement(_castToElement);
    _builder.append(_generateElement, "");
    return _builder;
  }
  
  public CharSequence generateFactory(final Element element) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _and = false;
      String _factory = element.getFactory();
      boolean _notEquals = (!Objects.equal(_factory, null));
      if (!_notEquals) {
        _and = false;
      } else {
        EList<FactoryValueElement> _values = element.getValues();
        boolean _isEmpty = _values.isEmpty();
        boolean _not = (!_isEmpty);
        _and = (_notEquals && _not);
      }
      if (_and) {
        _builder.append("createdby ");
        String _factory_1 = element.getFactory();
        _builder.append(_factory_1, "");
        _builder.append(" { ");
        _builder.newLineIfNotEmpty();
        Boolean comma = Boolean.valueOf(false);
        _builder.newLineIfNotEmpty();
        {
          EList<FactoryValueElement> _values_1 = element.getValues();
          for(final FactoryValueElement e : _values_1) {
            {
              if ((comma).booleanValue()) {
                _builder.append(",");
              }
            }
            _builder.newLineIfNotEmpty();
            {
              if ((e instanceof Element)) {
                CastHelper _castHelper = new CastHelper();
                Element _castToElement = _castHelper.castToElement(e);
                CharSequence _generateElement = this.generateElement(_castToElement);
                _builder.append(_generateElement, "");
                _builder.newLineIfNotEmpty();
              } else {
                {
                  if ((e instanceof SimpleValueProperty)) {
                    ValuePropertyFormatter _valuePropertyFormatter = new ValuePropertyFormatter(e);
                    String _formattedValue = _valuePropertyFormatter.getFormattedValue();
                    _builder.append(_formattedValue, "");
                  }
                }
                _builder.newLineIfNotEmpty();
              }
            }
            final Boolean nix = comma = Boolean.valueOf(true);
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("}");
      }
    }
    return _builder;
  }
}
