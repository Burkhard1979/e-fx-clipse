package at.bestsolution.efxclipse.jface.resources;

public class JFaceResources {
	private static ColorRegistry COLOR_REGISTRY = new ColorRegistry();
	
	public static ColorRegistry getColorRegistry() {
		return COLOR_REGISTRY;
	}

	public static String getString(String string) {
		return string;
	}
}
