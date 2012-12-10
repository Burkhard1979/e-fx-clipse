package at.bestsolution.efxclipse.tooling.rrobot.impl.generators;

import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundlePackage.Literals;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundleProject;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ExportedPackage;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ImportedPackage;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ManifestFile;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.PluginXMLFile;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.RequiredBundle;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.Generator;
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
public class BundleManifestGenerator implements Generator<ManifestFile> {
  public InputStream generate(final ManifestFile file, final Map<String,Object> data) {
    CharSequence _generateContent = this.generateContent(file, data);
    String _string = _generateContent.toString();
    byte[] _bytes = _string.getBytes();
    ByteArrayInputStream _byteArrayInputStream = new ByteArrayInputStream(_bytes);
    return _byteArrayInputStream;
  }
  
  public CharSequence generateContent(final ManifestFile file, final Map<String,Object> data) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Manifest-Version: 1.0");
    _builder.newLine();
    _builder.append("Bundle-ManifestVersion: 2");
    _builder.newLine();
    _builder.append("Bundle-Name: ");
    String _bundlename = file.getBundlename();
    _builder.append(_bundlename, "");
    _builder.newLineIfNotEmpty();
    _builder.append("Bundle-SymbolicName: ");
    String _symbolicname = file.getSymbolicname();
    _builder.append(_symbolicname, "");
    {
      EObject _eContainer = file.eContainer();
      PluginXMLFile _pluginxml = ((BundleProject) _eContainer).getPluginxml();
      boolean _notEquals = (!Objects.equal(_pluginxml, null));
      if (_notEquals) {
        _builder.append("; singleton:=true");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("Bundle-Version: ");
    String _version = file.getVersion();
    _builder.append(_version, "");
    _builder.newLineIfNotEmpty();
    _builder.append("Bundle-RequiredExecutionEnvironment: ");
    String _executionEnvironment = file.getExecutionEnvironment();
    _builder.append(_executionEnvironment, "");
    _builder.newLineIfNotEmpty();
    {
      EList<RequiredBundle> _requiredBundles = file.getRequiredBundles();
      boolean _isEmpty = _requiredBundles.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("Require-Bundle: ");
        EList<RequiredBundle> _requiredBundles_1 = file.getRequiredBundles();
        final Function1<RequiredBundle,String> _function = new Function1<RequiredBundle,String>() {
            public String apply(final RequiredBundle it) {
              String _requireBundleBuilder = BundleManifestGenerator.this.requireBundleBuilder(it);
              return _requireBundleBuilder;
            }
          };
        List<String> _map = ListExtensions.<RequiredBundle, String>map(_requiredBundles_1, _function);
        String _join = IterableExtensions.join(_map, ",\r\n ");
        _builder.append(_join, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<ImportedPackage> _importedPackages = file.getImportedPackages();
      boolean _isEmpty_1 = _importedPackages.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("Import-Package: ");
        EList<ImportedPackage> _importedPackages_1 = file.getImportedPackages();
        final Function1<ImportedPackage,String> _function_1 = new Function1<ImportedPackage,String>() {
            public String apply(final ImportedPackage it) {
              String _importPackageBuilder = BundleManifestGenerator.this.importPackageBuilder(it);
              return _importPackageBuilder;
            }
          };
        List<String> _map_1 = ListExtensions.<ImportedPackage, String>map(_importedPackages_1, _function_1);
        String _join_1 = IterableExtensions.join(_map_1, ",\r\n ");
        _builder.append(_join_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<ExportedPackage> _exportedPackages = file.getExportedPackages();
      boolean _isEmpty_2 = _exportedPackages.isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        _builder.append("Export-Package: ");
        EList<ExportedPackage> _exportedPackages_1 = file.getExportedPackages();
        final Function1<ExportedPackage,String> _function_2 = new Function1<ExportedPackage,String>() {
            public String apply(final ExportedPackage it) {
              String _exportPackageBuilder = BundleManifestGenerator.this.exportPackageBuilder(it);
              return _exportPackageBuilder;
            }
          };
        List<String> _map_2 = ListExtensions.<ExportedPackage, String>map(_exportedPackages_1, _function_2);
        String _join_2 = IterableExtensions.join(_map_2, ",\r\n ");
        _builder.append(_join_2, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public String exportPackageBuilder(final ExportedPackage e) {
    String rv = e.getName();
    boolean _eIsSet = e.eIsSet(Literals.EXPORTED_PACKAGE__VERSION);
    if (_eIsSet) {
      Object _eGet = e.eGet(Literals.EXPORTED_PACKAGE__VERSION);
      String _plus = (";version=\"" + _eGet);
      String _plus_1 = (_plus + "\"");
      String _concat = rv.concat(_plus_1);
      rv = _concat;
    }
    return rv;
  }
  
  public String importPackageBuilder(final ImportedPackage i) {
    String rv = i.getName();
    boolean _or = false;
    boolean _eIsSet = i.eIsSet(Literals.IMPORTED_PACKAGE__MIN_VERSION);
    if (_eIsSet) {
      _or = true;
    } else {
      boolean _eIsSet_1 = i.eIsSet(Literals.IMPORTED_PACKAGE__MAX_VERSION);
      _or = (_eIsSet || _eIsSet_1);
    }
    if (_or) {
      String _concat = rv.concat(";version=\"");
      rv = _concat;
      boolean _eIsSet_2 = i.eIsSet(Literals.IMPORTED_PACKAGE__MAX_VERSION);
      boolean _not = (!_eIsSet_2);
      if (_not) {
        Object _eGet = i.eGet(Literals.IMPORTED_PACKAGE__MIN_VERSION);
        String _string = _eGet.toString();
        String _concat_1 = rv.concat(_string);
        rv = _concat_1;
      } else {
        boolean _isMinExclusive = i.isMinExclusive();
        if (_isMinExclusive) {
          String _concat_2 = rv.concat("(");
          rv = _concat_2;
        } else {
          String _concat_3 = rv.concat("[");
          rv = _concat_3;
        }
        Object _eGet_1 = i.eGet(Literals.IMPORTED_PACKAGE__MIN_VERSION);
        String _string_1 = _eGet_1.toString();
        String _concat_4 = rv.concat(_string_1);
        rv = _concat_4;
        boolean _isMaxExclusive = i.isMaxExclusive();
        if (_isMaxExclusive) {
          String _concat_5 = rv.concat(")");
          rv = _concat_5;
        } else {
          String _concat_6 = rv.concat("]");
          rv = _concat_6;
        }
      }
      String _concat_7 = rv.concat("\"");
      rv = _concat_7;
    }
    return rv;
  }
  
  public String requireBundleBuilder(final RequiredBundle r) {
    String rv = r.getName();
    boolean _or = false;
    boolean _eIsSet = r.eIsSet(Literals.REQUIRED_BUNDLE__MIN_VERSION);
    if (_eIsSet) {
      _or = true;
    } else {
      boolean _eIsSet_1 = r.eIsSet(Literals.REQUIRED_BUNDLE__MAX_VERSION);
      _or = (_eIsSet || _eIsSet_1);
    }
    if (_or) {
      String _concat = rv.concat("bundle-version=\"");
      rv = _concat;
      boolean _eIsSet_2 = r.eIsSet(Literals.REQUIRED_BUNDLE__MAX_VERSION);
      boolean _not = (!_eIsSet_2);
      if (_not) {
        Object _eGet = r.eGet(Literals.REQUIRED_BUNDLE__MIN_VERSION);
        String _string = _eGet.toString();
        String _concat_1 = rv.concat(_string);
        rv = _concat_1;
      } else {
        boolean _isMinExclusive = r.isMinExclusive();
        if (_isMinExclusive) {
          String _concat_2 = rv.concat("(");
          rv = _concat_2;
        } else {
          String _concat_3 = rv.concat("[");
          rv = _concat_3;
        }
        Object _eGet_1 = r.eGet(Literals.REQUIRED_BUNDLE__MIN_VERSION);
        String _string_1 = _eGet_1.toString();
        String _concat_4 = rv.concat(_string_1);
        rv = _concat_4;
        boolean _isMaxExclusive = r.isMaxExclusive();
        if (_isMaxExclusive) {
          String _concat_5 = rv.concat(")");
          rv = _concat_5;
        } else {
          String _concat_6 = rv.concat("]");
          rv = _concat_6;
        }
      }
      String _concat_7 = rv.concat("\"");
      rv = _concat_7;
    }
    return rv;
  }
}
