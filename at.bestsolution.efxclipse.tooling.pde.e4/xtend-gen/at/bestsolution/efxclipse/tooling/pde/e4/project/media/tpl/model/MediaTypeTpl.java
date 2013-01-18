package at.bestsolution.efxclipse.tooling.pde.e4.project.media.tpl.model;

import at.bestsolution.efxclipse.tooling.rrobot.model.task.CompilationUnit;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.DynamicFile;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.Generator;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class MediaTypeTpl implements Generator<DynamicFile> {
  public InputStream generate(final DynamicFile file, final Map<String,Object> data) {
    EObject _eContainer = file.eContainer();
    final CompilationUnit cu = ((CompilationUnit) _eContainer);
    String _packagename = cu.getPackagename();
    CharSequence _generate = this.generate(_packagename);
    String _string = _generate.toString();
    byte[] _bytes = _string.getBytes();
    ByteArrayInputStream _byteArrayInputStream = new ByteArrayInputStream(_bytes);
    return _byteArrayInputStream;
  }
  
  public CharSequence generate(final String packageName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public enum MediaType {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("MOVIE,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("SOUND,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("PICTURE");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
