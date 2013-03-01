package at.bestsolution.efxclipse.jface.preferences;

import at.bestsolution.efxclipse.jface.RGB;
import at.bestsolution.efxclipse.jface.resources.StringConverter;

public class PreferenceConverter {
	public static final RGB COLOR_DEFAULT_DEFAULT = new RGB(0, 0, 0, 0);
	
	/**
     * Returns the current value of the color-valued preference with the
     * given name in the given preference store.
     * Returns the default-default value (<code>COLOR_DEFAULT_DEFAULT</code>) 
     * if there is no preference with the given name, or if the current value 
     * cannot be treated as a color.
     *
     * @param store the preference store
     * @param name the name of the preference
     * @return the color-valued preference
     */
    public static RGB getColor(IPreferenceStore store, String name) {
        return basicGetColor(store.getString(name));
    }
    
    /**
     * Helper method to construct a color from the given string.
     * @param value the indentifier for the color
     * @return RGB
     */
    private static RGB basicGetColor(String value) {

        if (IPreferenceStore.STRING_DEFAULT_DEFAULT.equals(value)) {
			return COLOR_DEFAULT_DEFAULT;
		}

        RGB color = StringConverter.asRGB(value, null);
        if (color == null) {
			return COLOR_DEFAULT_DEFAULT;
		}
        return color;
    }
    
    /**
     * Sets the default value of the preference with the given name
     * in the given preference store.
     *
     * @param store the preference store
     * @param name the name of the preference
     * @param value the new default value of the preference
     */
    public static void setDefault(IPreferenceStore store, String name, RGB value) {
        store.setDefault(name, StringConverter.asString(value));
    }
    
    /**
     * Returns the default value for the color-valued preference
     * with the given name in the given preference store.
     * Returns the default-default value (<code>COLOR_DEFAULT_DEFAULT</code>) 
     * is no default preference with the given name, or if the default 
     * value cannot be treated as a color.
     *
     * @param store the preference store
     * @param name the name of the preference
     * @return the default value of the preference
     */
    public static RGB getDefaultColor(IPreferenceStore store, String name) {
        return basicGetColor(store.getDefaultString(name));
    }
}
