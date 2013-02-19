package at.bestsolution.efxclipse.styledtext;

import javafx.scene.paint.Color;

public class StyleRange extends TextStyle implements Cloneable {
	public enum FontStyle {
		NORMAL,
		ITALIC,
		BOLD
	}
	public int start;
	public int length;
	
	public FontStyle fontStyle = FontStyle.NORMAL;
	
	public StyleRange() {
		super();
	}
	
	public StyleRange(TextStyle style) {
		super(style);
	}
	
	public StyleRange(int start, int length, Color foreground, Color background) {
		super(null, foreground, background);
		this.start = start;
		this.length = length;
	}
	
	public StyleRange(int start, int length, Color foreground, Color background, FontStyle fontStyle) {
		super(null, foreground, background);
		this.start = start;
		this.length = length;
		this.fontStyle = fontStyle;
	}

	public boolean isUnstyled() {
		if (font != null) return false;
		if (foreground != null) return false;
		if (background != null) return false;
		if (fontStyle != FontStyle.NORMAL) return false;
		if (underlineStyle != UnderlineStyle.NONE) return false;
		if (strikeout) return false;
		if (borderStyle != BorderStyle.NONE) return false;
		return true;
	}

	public boolean similarTo(StyleRange style) {
		if (!super.equals(style)) return false;
		if (fontStyle != style.fontStyle) return false;
		return true;
	}

	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

}