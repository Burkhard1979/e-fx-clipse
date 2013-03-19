package at.bestsolution.efxclipse.text.editor.spelling;

import org.eclipse.core.runtime.content.IContentType;


/**
 * A spelling context allows a {@link ISpellingEngine} to retrieve information
 * about the spelling check it has to perform.
 * <p>
 * This class is not intended to be subclassed by clients. The amount of
 * information provided in this context may grow over time.
 * </p>
 *
 * @since 3.1
 * @noextend This class is not intended to be subclassed by clients.
 */
public class SpellingContext {

	/** Content type of the document */
	private IContentType fContentType;

	/**
	 * Creates a new, un-initialized spelling context.
	 */
	public SpellingContext() {
	}

	/**
	 * Sets the content type of the document.
	 *
	 * @param contentType the content type of the document or <code>null</code> if unknown
	 */
	public void setContentType(IContentType contentType) {
		fContentType= contentType;
	}

	/**
	 * Returns the content type of the document.
	 *
	 * @return the content type of the document or <code>null</code> if unknown
	 */
	public IContentType getContentType() {
		return fContentType;
	}
}
