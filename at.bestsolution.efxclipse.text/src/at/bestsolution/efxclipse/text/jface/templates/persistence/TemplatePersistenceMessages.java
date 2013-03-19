package at.bestsolution.efxclipse.text.jface.templates.persistence;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

import com.ibm.icu.text.MessageFormat;

/**
 * @since 3.0
 */
class TemplatePersistenceMessages {

	private static final String RESOURCE_BUNDLE= TemplatePersistenceMessages.class.getName();
	private static ResourceBundle fgResourceBundle= ResourceBundle.getBundle(RESOURCE_BUNDLE);

	private TemplatePersistenceMessages() {
	}

	public static String getString(String key) {
		try {
			return fgResourceBundle.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}

	public static String getFormattedString(String key, Object arg) {
		return MessageFormat.format(getString(key), new Object[] { arg });
	}

	public static String getFormattedString(String key, Object[] args) {
		return MessageFormat.format(getString(key), args);
	}
}
