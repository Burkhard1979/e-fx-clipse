package at.bestsolution.efxclipse.formats.fxg.converter;

import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Import;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Model;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.PackageDeclaration;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

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
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
