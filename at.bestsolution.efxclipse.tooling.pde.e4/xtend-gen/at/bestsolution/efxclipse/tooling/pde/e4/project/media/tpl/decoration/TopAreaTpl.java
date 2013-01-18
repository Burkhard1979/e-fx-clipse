package at.bestsolution.efxclipse.tooling.pde.e4.project.media.tpl.decoration;

import at.bestsolution.efxclipse.tooling.rrobot.model.task.CompilationUnit;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.DynamicFile;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.Generator;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class TopAreaTpl implements Generator<DynamicFile> {
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
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<?import java.lang.*?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.control.Button?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.control.ToolBar?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.layout.HBox?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.layout.Region?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.layout.VBox?>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<ToolBar xmlns:fx=\"http://javafx.com/fxml\" fx:id=\"decorationArea\" fx:controller=\"");
    _builder.append(packageName, "");
    _builder.append(".DecorationController\" prefHeight=\"66\" minHeight=\"66\" maxHeight=\"66\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<items>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<Region> ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<HBox.hgrow>ALWAYS</HBox.hgrow>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</Region>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<VBox spacing=\"3\"> ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<children>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<Button fx:id=\"window_close\" onAction=\"#handleClose\"/> ");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<Button fx:id=\"window_min\" onAction=\"#handleMin\"/> ");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<Button fx:id=\"window_max\" onAction=\"#handleMax\"/> ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</children>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</VBox>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</items>");
    _builder.newLine();
    _builder.append("</ToolBar>");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
}
