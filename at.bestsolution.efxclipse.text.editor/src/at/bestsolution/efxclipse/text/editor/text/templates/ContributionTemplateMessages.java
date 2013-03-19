package at.bestsolution.efxclipse.text.editor.text.templates;

import org.eclipse.osgi.util.NLS;

/**
 * Helper class to get NLSed messages.
 *
 * @since 3.0
 */
final class ContributionTemplateMessages extends NLS {

	private static final String BUNDLE_NAME= ContributionTemplateMessages.class.getName();

	private ContributionTemplateMessages() {
		// Do not instantiate
	}

	public static String ContributionTemplateStore_ignore_no_id;
	public static String ContributionTemplateStore_ignore_deleted;
	public static String ContributionTemplateStore_ignore_validation_failed;

	static {
		NLS.initializeMessages(BUNDLE_NAME, ContributionTemplateMessages.class);
	}
}