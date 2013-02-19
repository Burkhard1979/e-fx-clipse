package at.bestsolution.efxclipse.styledtext;

import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class TextStyle {
	public enum UnderlineStyle {
		NONE,
		SINGLE,
		DOUBLE,
		ERROR,
		SQUIGGLE,
		LINK
	}
	
	public enum BorderStyle {
		NONE,
		SOLID,
		DASH,
		DOT
	}
	
	public Font font;
	public Color foreground;
	public Color background;

//	public boolean underline;
	public Color underlineColor;
	public UnderlineStyle underlineStyle = UnderlineStyle.NONE;
	
	public boolean strikeout;
	public Color strikeoutColor;
	
	public BorderStyle borderStyle = BorderStyle.NONE;
	public Color borderColor;
	
	public Object data;
	
	public TextStyle () {
		
	}
	
	public TextStyle (Font font, Color foreground, Color background) {
		this.font = font;
		this.foreground = foreground;
		this.background = background;
	}
	
	public TextStyle (TextStyle style) {
		font = style.font;
		foreground = style.foreground;
		background = style.background;
		underlineColor = style.underlineColor;
		underlineStyle = style.underlineStyle;
		strikeout = style.strikeout;
		strikeoutColor = style.strikeoutColor;
		borderStyle = style.borderStyle;
		borderColor = style.borderColor;
		data = style.data;
	}
}
