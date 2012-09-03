package at.bestsolution.efxclipse.tooling.efxbean.generator;

import at.bestsolution.efxclipse.tooling.efxbean.fXBean.Bean;
import at.bestsolution.efxclipse.tooling.efxbean.fXBean.BeanPropertyDecl;
import at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanUnit;
import at.bestsolution.efxclipse.tooling.efxbean.fXBean.MapTypeDef;
import at.bestsolution.efxclipse.tooling.efxbean.fXBean.Multiplicity;
import at.bestsolution.efxclipse.tooling.efxbean.fXBean.PackageDeclaration;
import at.bestsolution.efxclipse.tooling.efxbean.fXBean.TypeDef;
import at.bestsolution.efxclipse.tooling.efxbean.fXBean.ValueListTypeDef;
import com.google.common.base.Objects;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.compiler.ImportManager;

@SuppressWarnings("all")
public class FXBeanGenerator implements IGenerator {
  private ImportManager manager;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    EObject _get = _contents.get(0);
    final FXBeanUnit u = ((FXBeanUnit) _get);
    {
      PackageDeclaration _package = u.getPackage();
      String _name = _package.getName();
      String _replace = _name.replace(".", "/");
      String _plus = (_replace + "/");
      Bean _bean = u.getBean();
      String _name_1 = _bean.getName();
      String _plus_1 = (_plus + _name_1);
      final String filePath = (_plus_1 + ".java");
      ImportManager _importManager = new ImportManager(true);
      this.manager = _importManager;
      CharSequence _generateBeanFile = this.generateBeanFile(u);
      fsa.generateFile(filePath, _generateBeanFile);
    }
    Bean _bean = u.getBean();
    boolean _isReflective = _bean.isReflective();
    if (_isReflective) {
      ImportManager _importManager = new ImportManager(true);
      this.manager = _importManager;
      PackageDeclaration _package = u.getPackage();
      String _name = _package.getName();
      String _replace = _name.replace(".", "/");
      String _plus = (_replace + "/reflective/");
      Bean _bean_1 = u.getBean();
      String _name_1 = _bean_1.getName();
      String _plus_1 = (_plus + _name_1);
      final String filePath = (_plus_1 + "Access.java");
      CharSequence _generateReflectiveAccessFile = this.generateReflectiveAccessFile(u);
      fsa.generateFile(filePath, _generateReflectiveAccessFile);
    }
  }
  
  public CharSequence generateReflectiveAccessFile(final FXBeanUnit u) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    PackageDeclaration _package = u.getPackage();
    String _name = _package.getName();
    _builder.append(_name, "");
    _builder.append(".reflective;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import at.bestsolution.efxclipse.runtime.model.*;");
    _builder.newLine();
    _builder.append("import javafx.collections.*;");
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.append("import ");
    PackageDeclaration _package_1 = u.getPackage();
    String _name_1 = _package_1.getName();
    _builder.append(_name_1, "");
    _builder.append(".");
    Bean _bean = u.getBean();
    String _name_2 = _bean.getName();
    _builder.append(_name_2, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    final CharSequence c = this.generateReflectiveAccessClassBody(u);
    _builder.newLineIfNotEmpty();
    {
      List<String> _imports = this.manager.getImports();
      for(final String i : _imports) {
        _builder.append("import ");
        _builder.append(i, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append(c, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateReflectiveAccessClassBody(final FXBeanUnit u) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class ");
    Bean _bean = u.getBean();
    String _name = _bean.getName();
    _builder.append(_name, "");
    _builder.append("Access {");
    _builder.newLineIfNotEmpty();
    {
      Bean _bean_1 = u.getBean();
      EList<BeanPropertyDecl> _properties = _bean_1.getProperties();
      for(final BeanPropertyDecl p : _properties) {
        {
          TypeDef _type = p.getType();
          if ((_type instanceof ValueListTypeDef)) {
            {
              ValueListTypeDef _valDef = this.valDef(p);
              Multiplicity _multi = _valDef.getMulti();
              boolean _notEquals = (!Objects.equal(_multi, null));
              if (_notEquals) {
                _builder.append("\t");
                _builder.append("public static final EFXListProperty<");
                Bean _bean_2 = u.getBean();
                String _name_1 = _bean_2.getName();
                _builder.append(_name_1, "	");
                _builder.append(",ObservableList<");
                ValueListTypeDef _valDef_1 = this.valDef(p);
                JvmTypeReference _singleType = _valDef_1.getSingleType();
                String _shortName = this.shortName(_singleType);
                _builder.append(_shortName, "	");
                _builder.append(">,");
                ValueListTypeDef _valDef_2 = this.valDef(p);
                JvmTypeReference _singleType_1 = _valDef_2.getSingleType();
                String _shortName_1 = this.shortName(_singleType_1);
                _builder.append(_shortName_1, "	");
                _builder.append("> ");
                String _name_2 = p.getName();
                String _upperCase = _name_2.toUpperCase();
                _builder.append(_upperCase, "	");
                _builder.append(" = new EFXListProperty<");
                Bean _bean_3 = u.getBean();
                String _name_3 = _bean_3.getName();
                _builder.append(_name_3, "	");
                _builder.append(",ObservableList<");
                ValueListTypeDef _valDef_3 = this.valDef(p);
                JvmTypeReference _singleType_2 = _valDef_3.getSingleType();
                String _shortName_2 = this.shortName(_singleType_2);
                _builder.append(_shortName_2, "	");
                _builder.append(">,");
                ValueListTypeDef _valDef_4 = this.valDef(p);
                JvmTypeReference _singleType_3 = _valDef_4.getSingleType();
                String _shortName_3 = this.shortName(_singleType_3);
                _builder.append(_shortName_3, "	");
                _builder.append(">(\"");
                String _name_4 = p.getName();
                _builder.append(_name_4, "	");
                _builder.append("\",ObservableList.class,");
                ValueListTypeDef _valDef_5 = this.valDef(p);
                JvmTypeReference _singleType_4 = _valDef_5.getSingleType();
                String _shortName_4 = this.shortName(_singleType_4);
                _builder.append(_shortName_4, "	");
                _builder.append(".class,");
                boolean _isReadonly = p.isReadonly();
                _builder.append(_isReadonly, "	");
                _builder.append(",");
                boolean _isLazy = p.isLazy();
                _builder.append(_isLazy, "	");
                _builder.append(");");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("public static final EFXProperty<");
                Bean _bean_4 = u.getBean();
                String _name_5 = _bean_4.getName();
                _builder.append(_name_5, "	");
                _builder.append(",");
                ValueListTypeDef _valDef_6 = this.valDef(p);
                JvmTypeReference _singleType_5 = _valDef_6.getSingleType();
                String _objectShortType = this.objectShortType(_singleType_5);
                _builder.append(_objectShortType, "	");
                _builder.append("> ");
                String _name_6 = p.getName();
                String _upperCase_1 = _name_6.toUpperCase();
                _builder.append(_upperCase_1, "	");
                _builder.append(" = new EFXProperty<");
                Bean _bean_5 = u.getBean();
                String _name_7 = _bean_5.getName();
                _builder.append(_name_7, "	");
                _builder.append(",");
                ValueListTypeDef _valDef_7 = this.valDef(p);
                JvmTypeReference _singleType_6 = _valDef_7.getSingleType();
                String _objectShortType_1 = this.objectShortType(_singleType_6);
                _builder.append(_objectShortType_1, "	");
                _builder.append(">(\"");
                String _name_8 = p.getName();
                _builder.append(_name_8, "	");
                _builder.append("\",");
                ValueListTypeDef _valDef_8 = this.valDef(p);
                JvmTypeReference _singleType_7 = _valDef_8.getSingleType();
                String _shortName_5 = this.shortName(_singleType_7);
                _builder.append(_shortName_5, "	");
                _builder.append(".class,");
                boolean _isReadonly_1 = p.isReadonly();
                _builder.append(_isReadonly_1, "	");
                _builder.append(",");
                boolean _isLazy_1 = p.isLazy();
                _builder.append(_isLazy_1, "	");
                _builder.append(");");
                _builder.newLineIfNotEmpty();
              }
            }
          } else {
            _builder.append("\t");
            _builder.append("public static final EFXMapProperty<?,?,");
            MapTypeDef _mapDef = this.mapDef(p);
            JvmTypeReference _keyType = _mapDef.getKeyType();
            String _shortName_6 = this.shortName(_keyType);
            _builder.append(_shortName_6, "	");
            _builder.append(",");
            MapTypeDef _mapDef_1 = this.mapDef(p);
            JvmTypeReference _valueType = _mapDef_1.getValueType();
            String _shortName_7 = this.shortName(_valueType);
            _builder.append(_shortName_7, "	");
            _builder.append("> ");
            String _name_9 = p.getName();
            String _upperCase_2 = _name_9.toUpperCase();
            _builder.append(_upperCase_2, "	");
            _builder.append(" = new EFXMapProperty<?,?,");
            MapTypeDef _mapDef_2 = this.mapDef(p);
            JvmTypeReference _keyType_1 = _mapDef_2.getKeyType();
            String _shortName_8 = this.shortName(_keyType_1);
            _builder.append(_shortName_8, "	");
            _builder.append(",");
            MapTypeDef _mapDef_3 = this.mapDef(p);
            JvmTypeReference _valueType_1 = _mapDef_3.getValueType();
            String _shortName_9 = this.shortName(_valueType_1);
            _builder.append(_shortName_9, "	");
            _builder.append(">(\"");
            String _name_10 = p.getName();
            _builder.append(_name_10, "	");
            _builder.append("\");");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static final EFXBeanClass<");
    Bean _bean_6 = u.getBean();
    String _name_11 = _bean_6.getName();
    _builder.append(_name_11, "	");
    _builder.append("> CLAZZ;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("static {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("List<EFXFeature<");
    Bean _bean_7 = u.getBean();
    String _name_12 = _bean_7.getName();
    _builder.append(_name_12, "		");
    _builder.append(",?>> features = new ArrayList<EFXFeature<");
    Bean _bean_8 = u.getBean();
    String _name_13 = _bean_8.getName();
    _builder.append(_name_13, "		");
    _builder.append(",?>>();");
    _builder.newLineIfNotEmpty();
    {
      Bean _bean_9 = u.getBean();
      EList<BeanPropertyDecl> _properties_1 = _bean_9.getProperties();
      for(final BeanPropertyDecl p_1 : _properties_1) {
        _builder.append("\t\t");
        _builder.append("features.add(");
        String _name_14 = p_1.getName();
        String _upperCase_3 = _name_14.toUpperCase();
        _builder.append(_upperCase_3, "		");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("CLAZZ = new EFXBeanClass<");
    Bean _bean_10 = u.getBean();
    String _name_15 = _bean_10.getName();
    _builder.append(_name_15, "		");
    _builder.append(">(features);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateBeanFile(final FXBeanUnit u) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    PackageDeclaration _package = u.getPackage();
    String _name = _package.getName();
    _builder.append(_name, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import javafx.beans.property.*;");
    _builder.newLine();
    _builder.append("import javafx.collections.*;");
    _builder.newLine();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.newLine();
    final CharSequence c = this.generateClassBody(u);
    _builder.newLineIfNotEmpty();
    {
      List<String> _imports = this.manager.getImports();
      for(final String i : _imports) {
        _builder.append("import ");
        _builder.append(i, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append(c, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateClassBody(final FXBeanUnit u) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class ");
    Bean _bean = u.getBean();
    String _name = _bean.getName();
    _builder.append(_name, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      Bean _bean_1 = u.getBean();
      EList<BeanPropertyDecl> _properties = _bean_1.getProperties();
      for(final BeanPropertyDecl p : _properties) {
        _builder.append("\t");
        _builder.append("private ");
        {
          boolean _isLazy = p.isLazy();
          boolean _not = (!_isLazy);
          if (_not) {
            _builder.append("final ");
          }
        }
        TypeDef _type = p.getType();
        String _propertyDefinition = this.propertyDefinition(_type);
        _builder.append(_propertyDefinition, "	");
        _builder.append(" ");
        String _name_1 = p.getName();
        _builder.append(_name_1, "	");
        _builder.append("Property ");
        {
          boolean _isLazy_1 = p.isLazy();
          boolean _not_1 = (!_isLazy_1);
          if (_not_1) {
            _builder.append(" = ");
            TypeDef _type_1 = p.getType();
            String _propertyCreate = this.propertyCreate(_type_1);
            _builder.append(_propertyCreate, "	");
          }
        }
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    {
      Bean _bean_2 = u.getBean();
      EList<BeanPropertyDecl> _properties_1 = _bean_2.getProperties();
      for(final BeanPropertyDecl p_1 : _properties_1) {
        _builder.append("\t");
        TypeDef _type_2 = p_1.getType();
        CharSequence _accessMethods = this.accessMethods(_type_2);
        _builder.append(_accessMethods, "	");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _accessMethods(final ValueListTypeDef p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// -------------------------------");
    _builder.newLine();
    _builder.append("// Property: ");
    BeanPropertyDecl _property = this.property(p);
    String _name = _property.getName();
    _builder.append(_name, "");
    _builder.append("; lazy: ");
    BeanPropertyDecl _property_1 = this.property(p);
    boolean _isLazy = _property_1.isLazy();
    _builder.append(_isLazy, "");
    _builder.append("; readonly: ");
    BeanPropertyDecl _property_2 = this.property(p);
    boolean _isReadonly = _property_2.isReadonly();
    _builder.append(_isReadonly, "");
    _builder.newLineIfNotEmpty();
    _builder.append("// -------------------------------");
    _builder.newLine();
    _builder.append("public ");
    String _apiPropertyDefinition = this.apiPropertyDefinition(p);
    _builder.append(_apiPropertyDefinition, "");
    _builder.append(" ");
    BeanPropertyDecl _property_3 = this.property(p);
    String _name_1 = _property_3.getName();
    _builder.append(_name_1, "");
    _builder.append("Property() {");
    _builder.newLineIfNotEmpty();
    {
      BeanPropertyDecl _property_4 = this.property(p);
      boolean _isLazy_1 = _property_4.isLazy();
      if (_isLazy_1) {
        _builder.append("\t");
        _builder.append("if( this.");
        BeanPropertyDecl _property_5 = this.property(p);
        String _name_2 = _property_5.getName();
        _builder.append(_name_2, "	");
        _builder.append("Property == null ) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("this.");
        BeanPropertyDecl _property_6 = this.property(p);
        String _name_3 = _property_6.getName();
        _builder.append(_name_3, "		");
        _builder.append("Property = ");
        String _propertyCreate = this.propertyCreate(p);
        _builder.append(_propertyCreate, "		");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("return this.");
    BeanPropertyDecl _property_7 = this.property(p);
    String _name_4 = _property_7.getName();
    _builder.append(_name_4, "	");
    _builder.append("Property;");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    {
      BeanPropertyDecl _property_8 = this.property(p);
      boolean _isReadonly_1 = _property_8.isReadonly();
      boolean _not = (!_isReadonly_1);
      if (_not) {
        _builder.append("public void set");
        BeanPropertyDecl _property_9 = this.property(p);
        String _name_5 = _property_9.getName();
        String _camelCase = this.camelCase(_name_5);
        _builder.append(_camelCase, "");
        _builder.append("(");
        {
          Multiplicity _multi = p.getMulti();
          boolean _notEquals = (!Objects.equal(_multi, null));
          if (_notEquals) {
            _builder.append("ObservableList<");
          }
        }
        JvmTypeReference _singleType = p.getSingleType();
        String _shortName = this.shortName(_singleType);
        _builder.append(_shortName, "");
        {
          Multiplicity _multi_1 = p.getMulti();
          boolean _notEquals_1 = (!Objects.equal(_multi_1, null));
          if (_notEquals_1) {
            _builder.append(">");
          }
        }
        _builder.append(" ");
        BeanPropertyDecl _property_10 = this.property(p);
        String _name_6 = _property_10.getName();
        _builder.append(_name_6, "");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("this.");
        BeanPropertyDecl _property_11 = this.property(p);
        String _name_7 = _property_11.getName();
        _builder.append(_name_7, "	");
        _builder.append("Property().set(");
        BeanPropertyDecl _property_12 = this.property(p);
        String _name_8 = _property_12.getName();
        _builder.append(_name_8, "	");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("public ");
    {
      Multiplicity _multi_2 = p.getMulti();
      boolean _notEquals_2 = (!Objects.equal(_multi_2, null));
      if (_notEquals_2) {
        _builder.append("ObservableList<");
      }
    }
    JvmTypeReference _singleType_1 = p.getSingleType();
    String _shortName_1 = this.shortName(_singleType_1);
    _builder.append(_shortName_1, "");
    {
      Multiplicity _multi_3 = p.getMulti();
      boolean _notEquals_3 = (!Objects.equal(_multi_3, null));
      if (_notEquals_3) {
        _builder.append(">");
      }
    }
    _builder.append(" get");
    BeanPropertyDecl _property_13 = this.property(p);
    String _name_9 = _property_13.getName();
    String _camelCase_1 = this.camelCase(_name_9);
    _builder.append(_camelCase_1, "");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    {
      BeanPropertyDecl _property_14 = this.property(p);
      boolean _isLazy_2 = _property_14.isLazy();
      if (_isLazy_2) {
        _builder.append("\t");
        _builder.append("if( this.");
        BeanPropertyDecl _property_15 = this.property(p);
        String _name_10 = _property_15.getName();
        _builder.append(_name_10, "	");
        _builder.append("Property == null ) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return ");
        String _defaultValue = this.defaultValue(p);
        _builder.append(_defaultValue, "		");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("return this.");
    BeanPropertyDecl _property_16 = this.property(p);
    String _name_11 = _property_16.getName();
    _builder.append(_name_11, "	");
    _builder.append("Property.get();");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _accessMethods(final MapTypeDef p) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected String _propertyCreate(final ValueListTypeDef p) {
    Multiplicity _multi = p.getMulti();
    boolean _equals = Objects.equal(_multi, null);
    if (_equals) {
      String _propertyDefinition = this.propertyDefinition(p);
      String _plus = ("new " + _propertyDefinition);
      String _plus_1 = (_plus + "(this,\"");
      BeanPropertyDecl _property = this.property(p);
      String _name = _property.getName();
      String _plus_2 = (_plus_1 + _name);
      return (_plus_2 + "\")");
    } else {
      String _propertyDefinition_1 = this.propertyDefinition(p);
      String _plus_3 = ("new " + _propertyDefinition_1);
      String _plus_4 = (_plus_3 + "(this,\"");
      BeanPropertyDecl _property_1 = this.property(p);
      String _name_1 = _property_1.getName();
      String _plus_5 = (_plus_4 + _name_1);
      String _plus_6 = (_plus_5 + "\",FXCollections.observableArrayList(new ArrayList<");
      JvmTypeReference _singleType = p.getSingleType();
      String _shortName = this.shortName(_singleType);
      String _plus_7 = (_plus_6 + _shortName);
      return (_plus_7 + ">()))");
    }
  }
  
  protected String _propertyCreate(final MapTypeDef p) {
    JvmTypeReference _keyType = p.getKeyType();
    String _plus = ("(ObservableMap<" + _keyType);
    String _plus_1 = (_plus + ",");
    JvmTypeReference _valueType = p.getValueType();
    String _plus_2 = (_plus_1 + _valueType);
    return (_plus_2 + ">)FXCollections.observableHashMap()");
  }
  
  protected String _defaultValue(final ValueListTypeDef p) {
    Multiplicity _multi = p.getMulti();
    boolean _equals = Objects.equal(_multi, null);
    if (_equals) {
      JvmTypeReference _singleType = p.getSingleType();
      String _qualifiedName = _singleType.getQualifiedName();
      final String _switchValue = _qualifiedName;
      boolean _matched = false;
      if (!_matched) {
        if (Objects.equal(_switchValue,"int")) {
          _matched=true;
          return "0";
        }
      }
      if (!_matched) {
        if (Objects.equal(_switchValue,"double")) {
          _matched=true;
          return "0.0";
        }
      }
    }
    return "null";
  }
  
  protected String _defaultValue(final MapTypeDef p) {
    return "null";
  }
  
  public String camelCase(final String value) {
    char _charAt = value.charAt(0);
    char _upperCase = Character.toUpperCase(_charAt);
    String _substring = value.substring(1);
    return (Character.valueOf(_upperCase) + _substring);
  }
  
  public Object apiPropertyDefinition(final MapTypeDef t) {
    return null;
  }
  
  public String apiPropertyDefinition(final ValueListTypeDef t) {
    String ro = "";
    BeanPropertyDecl _property = this.property(t);
    boolean _isReadonly = _property.isReadonly();
    if (_isReadonly) {
      ro = "ReadOnly";
    }
    Multiplicity _multi = t.getMulti();
    boolean _notEquals = (!Objects.equal(_multi, null));
    if (_notEquals) {
      String _plus = (ro + "ObjectProperty<ObservableList<");
      JvmTypeReference _singleType = t.getSingleType();
      String _shortName = this.shortName(_singleType);
      String _plus_1 = (_plus + _shortName);
      return (_plus_1 + ">>");
    } else {
      JvmTypeReference _singleType_1 = t.getSingleType();
      String _qualifiedName = _singleType_1.getQualifiedName();
      final String _switchValue = _qualifiedName;
      boolean _matched = false;
      if (!_matched) {
        if (Objects.equal(_switchValue,"java.lang.String")) {
          _matched=true;
          return (ro + "StringProperty");
        }
      }
      if (!_matched) {
        if (Objects.equal(_switchValue,"int")) {
          _matched=true;
          return (ro + "IntegerProperty");
        }
      }
      if (!_matched) {
        if (Objects.equal(_switchValue,"double")) {
          _matched=true;
          return (ro + "DoubleProperty");
        }
      }
      String _plus_2 = (ro + "ObjectProperty<");
      JvmTypeReference _singleType_2 = t.getSingleType();
      String _qualifiedName_1 = _singleType_2.getQualifiedName();
      String _plus_3 = (_plus_2 + _qualifiedName_1);
      return (_plus_3 + ">");
    }
  }
  
  protected String _propertyDefinition(final MapTypeDef t) {
    JvmTypeReference _keyType = t.getKeyType();
    String _shortName = this.shortName(_keyType);
    String _plus = ("SimpleObjectProperty<ObservableMap<" + _shortName);
    String _plus_1 = (_plus + ",");
    JvmTypeReference _valueType = t.getValueType();
    String _shortName_1 = this.shortName(_valueType);
    String _plus_2 = (_plus_1 + _shortName_1);
    return (_plus_2 + ">>");
  }
  
  protected String _propertyDefinition(final ValueListTypeDef t) {
    Multiplicity _multi = t.getMulti();
    boolean _equals = Objects.equal(_multi, null);
    if (_equals) {
      JvmTypeReference _singleType = t.getSingleType();
      String _qualifiedName = _singleType.getQualifiedName();
      final String _switchValue = _qualifiedName;
      boolean _matched = false;
      if (!_matched) {
        if (Objects.equal(_switchValue,"java.lang.String")) {
          _matched=true;
          return "SimpleStringProperty";
        }
      }
      if (!_matched) {
        if (Objects.equal(_switchValue,"int")) {
          _matched=true;
          return "SimpleIntegerProperty";
        }
      }
      if (!_matched) {
        if (Objects.equal(_switchValue,"double")) {
          _matched=true;
          return "SimpleDoubleProperty";
        }
      }
      JvmTypeReference _singleType_1 = t.getSingleType();
      String _shortName = this.shortName(_singleType_1);
      String _plus = ("SimpleObjectProperty<" + _shortName);
      return (_plus + ">");
    } else {
      JvmTypeReference _singleType_2 = t.getSingleType();
      String _shortName_1 = this.shortName(_singleType_2);
      String _plus_1 = ("SimpleObjectProperty<ObservableList<" + _shortName_1);
      return (_plus_1 + ">>");
    }
  }
  
  public String objectShortType(final JvmTypeReference r) {
    String _qualifiedName = r.getQualifiedName();
    boolean _equals = _qualifiedName.equals("int");
    if (_equals) {
      return "Integer";
    } else {
      String _qualifiedName_1 = r.getQualifiedName();
      boolean _equals_1 = _qualifiedName_1.equals("double");
      if (_equals_1) {
        return "Double";
      }
    }
    return this.shortName(r);
  }
  
  public BeanPropertyDecl property(final TypeDef t) {
    EObject _eContainer = t.eContainer();
    return ((BeanPropertyDecl) _eContainer);
  }
  
  public MapTypeDef mapDef(final BeanPropertyDecl b) {
    TypeDef _type = b.getType();
    return ((MapTypeDef) _type);
  }
  
  public ValueListTypeDef valDef(final BeanPropertyDecl b) {
    TypeDef _type = b.getType();
    return ((ValueListTypeDef) _type);
  }
  
  public String shortName(final JvmTypeReference r) {
    String _xblockexpression = null;
    {
      StringBuilder _stringBuilder = new StringBuilder();
      final StringBuilder builder = _stringBuilder;
      JvmType _type = r.getType();
      this.manager.appendType(_type, builder);
      String _string = builder.toString();
      _xblockexpression = (_string);
    }
    return _xblockexpression;
  }
  
  public CharSequence accessMethods(final TypeDef p) {
    if (p instanceof MapTypeDef) {
      return _accessMethods((MapTypeDef)p);
    } else if (p instanceof ValueListTypeDef) {
      return _accessMethods((ValueListTypeDef)p);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(p).toString());
    }
  }
  
  public String propertyCreate(final TypeDef p) {
    if (p instanceof MapTypeDef) {
      return _propertyCreate((MapTypeDef)p);
    } else if (p instanceof ValueListTypeDef) {
      return _propertyCreate((ValueListTypeDef)p);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(p).toString());
    }
  }
  
  public String defaultValue(final TypeDef p) {
    if (p instanceof MapTypeDef) {
      return _defaultValue((MapTypeDef)p);
    } else if (p instanceof ValueListTypeDef) {
      return _defaultValue((ValueListTypeDef)p);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(p).toString());
    }
  }
  
  public String propertyDefinition(final TypeDef t) {
    if (t instanceof MapTypeDef) {
      return _propertyDefinition((MapTypeDef)t);
    } else if (t instanceof ValueListTypeDef) {
      return _propertyDefinition((ValueListTypeDef)t);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(t).toString());
    }
  }
}
