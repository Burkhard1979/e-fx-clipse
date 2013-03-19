package at.bestsolution.efxclipse.text.jface.html;

public class HTMLPrinter {
	/**
	 * Escapes reserved HTML characters in the given string.
	 * <p>
	 * <b>Warning:</b> Does not preserve whitespace.
	 * 
	 * @param content the input string
	 * @return the string with escaped characters
	 * 
	 * @see #convertToHTMLContentWithWhitespace(String) for use in browsers
	 * @see #addPreFormatted(StringBuffer, String) for rendering with an {@link HTML2TextReader}
	 */
	public static String convertToHTMLContent(String content) {
		content= replace(content, '&', "&amp;"); //$NON-NLS-1$
		content= replace(content, '"', "&quot;"); //$NON-NLS-1$
		content= replace(content, '<', "&lt;"); //$NON-NLS-1$
		return replace(content, '>', "&gt;"); //$NON-NLS-1$
	}
	
	private static String replace(String text, char c, String s) {

		int previous= 0;
		int current= text.indexOf(c, previous);

		if (current == -1)
			return text;

		StringBuffer buffer= new StringBuffer();
		while (current > -1) {
			buffer.append(text.substring(previous, current));
			buffer.append(s);
			previous= current + 1;
			current= text.indexOf(c, previous);
		}
		buffer.append(text.substring(previous));

		return buffer.toString();
	}

	/**
	 * Escapes reserved HTML characters in the given string
	 * and returns them in a way that preserves whitespace in a browser.
	 * <p>
	 * <b>Warning:</b> Whitespace will not be preserved when rendered with an {@link HTML2TextReader}
	 * (e.g. in a {@link DefaultInformationControl} that renders simple HTML).

	 * @param content the input string
	 * @return the processed string
	 * 
	 * @see #addPreFormatted(StringBuffer, String)
	 * @see #convertToHTMLContent(String)
	 * @since 3.7
	 */
	public static String convertToHTMLContentWithWhitespace(String content) {
		content= replace(content, '&', "&amp;"); //$NON-NLS-1$
		content= replace(content, '"', "&quot;"); //$NON-NLS-1$
		content= replace(content, '<', "&lt;"); //$NON-NLS-1$
		content= replace(content, '>', "&gt;"); //$NON-NLS-1$
		return "<span style='white-space:pre'>" + content + "</span>"; //$NON-NLS-1$ //$NON-NLS-2$
	}
}
