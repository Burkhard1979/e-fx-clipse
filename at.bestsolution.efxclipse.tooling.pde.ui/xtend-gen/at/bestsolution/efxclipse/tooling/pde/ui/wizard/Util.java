package at.bestsolution.efxclipse.tooling.pde.ui.wizard;

import at.bestsolution.efxclipse.tooling.rrobot.model.task.CompilationUnit;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.DynamicFile;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.Variable;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class Util {
  public static String getValidId(final String projectName) {
    return projectName.replaceAll("[^a-zA-Z0-9\\._-]", "_");
  }
  
  public static InputStream toStream(final CharSequence value) {
    String _string = value.toString();
    byte[] _bytes = _string.getBytes();
    ByteArrayInputStream _byteArrayInputStream = new ByteArrayInputStream(_bytes);
    return _byteArrayInputStream;
  }
  
  public static String getVariableValue(final DynamicFile file, final String name) {
    EList<Variable> _variables = file.getVariables();
    final Function1<Variable,Boolean> _function = new Function1<Variable,Boolean>() {
        public Boolean apply(final Variable e) {
          String _key = e.getKey();
          boolean _equals = _key.equals(name);
          return Boolean.valueOf(_equals);
        }
      };
    Variable _findFirst = IterableExtensions.<Variable>findFirst(_variables, _function);
    return _findFirst==null?(String)null:_findFirst.getDefaultValue();
  }
  
  public static String getCuPackagename(final DynamicFile file) {
    EObject _eContainer = file.eContainer();
    final CompilationUnit cu = ((CompilationUnit) _eContainer);
    return cu.getPackagename();
  }
}
