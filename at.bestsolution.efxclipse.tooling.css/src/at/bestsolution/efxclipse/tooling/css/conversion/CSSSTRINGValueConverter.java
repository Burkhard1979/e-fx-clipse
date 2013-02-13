package at.bestsolution.efxclipse.tooling.css.conversion;

import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Strings;

public class CSSSTRINGValueConverter extends AbstractLexerBasedConverter<String> {
	
	@Override
	protected String toEscapedString(String value) {
		value = value.replaceAll("\\\\([0-9a-fA-F]{4})", "\\\\u$1");
		return '"' + Strings.convertToJavaString(value, false) + '"';
	}
	
	public String toValue(String string, INode node) {
		if (string == null)
			return null;
		try {
			string = string.replaceAll("\\\\([0-9a-fA-F]{4})", "\\\\u$1");
			return Strings.convertFromJavaString(string.substring(1, string.length() - 1), true);
		} catch (IllegalArgumentException e) {
			throw new ValueConverterException(e.getMessage(), node, e);
		}
	}
}