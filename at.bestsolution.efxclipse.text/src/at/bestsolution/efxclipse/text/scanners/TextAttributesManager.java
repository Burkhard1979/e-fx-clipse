package at.bestsolution.efxclipse.text.scanners;

import java.util.HashMap;
import java.util.Map;

import at.bestsolution.efxclipse.text.jface.text.TextAttribute;

import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class TextAttributesManager {
	
	private Map<String, TextAttribute> color = new HashMap<>();
	
	public void registerToken(String tokenKey, Color fgColor) {
		this.color.put(tokenKey, new TextAttribute(fgColor, null, null));
	}
	
	public void registerToken(String tokenKey, Color fgColor, Color bgColor, Font font, TextAttribute.Style... styles) {
		this.color.put(tokenKey, new TextAttribute(fgColor, bgColor, font, styles));
	}
	
	public void registerToken(String tokenKey, TextAttribute attribute) {
		this.color.put(tokenKey, attribute);
	}
	
	public TextAttribute getTokenAttribute(String tokenKey) {
		return this.color.get(tokenKey);
	}
}
