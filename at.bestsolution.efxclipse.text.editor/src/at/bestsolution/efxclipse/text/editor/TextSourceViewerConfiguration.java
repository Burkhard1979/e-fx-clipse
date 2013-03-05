package at.bestsolution.efxclipse.text.editor;

import at.bestsolution.efxclipse.jface.preferences.IPreferenceStore;
import at.bestsolution.efxclipse.text.jface.source.SourceViewerConfiguration;

public class TextSourceViewerConfiguration extends SourceViewerConfiguration {
	protected IPreferenceStore preferenceStore;

	/**
	 * Creates a text source viewer configuration and
	 * initializes it with the given preference store.
	 *
	 * @param preferenceStore	the preference store used to initialize this configuration
	 */
	public TextSourceViewerConfiguration(IPreferenceStore preferenceStore) {
		this.preferenceStore= preferenceStore;
	}
}
