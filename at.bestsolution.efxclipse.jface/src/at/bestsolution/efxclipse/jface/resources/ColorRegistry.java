package at.bestsolution.efxclipse.jface.resources;

import java.util.HashMap;
import java.util.Map;

import javafx.scene.paint.Color;

public class ColorRegistry {
	private Map<String, Color> colorMap = new HashMap<>();
	
	public Color get(String colorname) {
		return colorMap.get(colorname);
	}

}
