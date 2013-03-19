package at.bestsolution.efxclipse.text.editor;

import at.bestsolution.efxclipse.jface.preferences.IPreferenceStore;
import at.bestsolution.efxclipse.text.editor.internal.TextEditorPlugin;
import at.bestsolution.efxclipse.text.editor.spelling.SpellingService;

public class EditorsUI {

	public static AnnotationPreferenceLookup getAnnotationPreferenceLookup() {
		return TextEditorPlugin.getDefault().getAnnotationPreferenceLookup();
	}

	/**
	 * Returns the spelling service.
	 *
	 * @return the spelling service
	 * @since 3.1
	 */
	public static SpellingService getSpellingService() {
		return TextEditorPlugin.getDefault().getSpellingService();
	}
	
	/**
	 * Returns the preference store of this plug-in.
	 *
	 * @return this plug-in's preference store
	 */
	public static IPreferenceStore getPreferenceStore() {
		return TextEditorPlugin.getDefault().getPreferenceStore();
	}
}
