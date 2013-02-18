package at.bestsolution.efxclipse.text.jface.text;

import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class TextAttribute {
	public final Color fgColor;
	public final Color bgColor;
	public final Font font;
	private final int style;
	
	
	public TextAttribute(Color fgColor, Color bgColor, Font font, Style... styles) {
		this.fgColor = fgColor;
		this.bgColor = bgColor;
		int tmp = 0;
		for( Style s : styles ) {
			tmp |= s.mask;
		}
		
		this.style = tmp;
		this.font = font == null ? Font.getDefault() : font;
	}
	
	public boolean isUnderline() {
		return (style & Style.UNDERLINE.mask) == Style.UNDERLINE.mask;
	}
	
	public boolean isStrikeThrough() {
		return (style & Style.STRIKETHROUGH.mask) == Style.STRIKETHROUGH.mask;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bgColor == null) ? 0 : bgColor.hashCode());
		result = prime * result + ((fgColor == null) ? 0 : fgColor.hashCode());
		result = prime * result + style;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TextAttribute other = (TextAttribute) obj;
		if (bgColor == null) {
			if (other.bgColor != null)
				return false;
		} else if (!bgColor.equals(other.bgColor))
			return false;
		if (fgColor == null) {
			if (other.fgColor != null)
				return false;
		} else if (!fgColor.equals(other.fgColor))
			return false;
		if (style != other.style)
			return false;
		return true;
	}



	public enum Style {
		UNDERLINE(1<<2),
		STRIKETHROUGH(1<<3);
		
		final int mask;
		
		private Style(int mask) {
			this.mask = mask;
		}
	}
}
