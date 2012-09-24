package at.bestsolution.efxclipse.tooling.jdt.ui.internal.wizard.templates;

import at.bestsolution.efxclipse.tooling.ui.wizards.template.HtmlElement;
import at.bestsolution.efxclipse.tooling.ui.wizards.template.IGenerator;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class HtmlTemplateGenerator implements IGenerator<HtmlElement> {
  public CharSequence generateContent(final HtmlElement htmlDef) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<title>Insert title here</title>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</head>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<h1>Embed JavaFX application into existing page</h1>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<!-- application will be inserted here -->");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<div id=\"fxApplication\"></div>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>  ");
    _builder.newLine();
    return _builder;
  }
}
