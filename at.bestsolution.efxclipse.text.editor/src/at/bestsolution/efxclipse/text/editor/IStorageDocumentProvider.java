package at.bestsolution.efxclipse.text.editor;


/**
 * Document provider for {@link org.eclipse.core.resources.IStorage} based domain elements.
 * Basically incorporates the concept of character encoding.
 *
 * @since 2.0
 */
public interface IStorageDocumentProvider {

	/**
	 * Returns the default character encoding used by this provider.
	 *
	 * @return the default character encoding used by this provider
	 */
	String getDefaultEncoding();

	/**
	 * Returns the character encoding for the given element, or
	 * <code>null</code> if the element is not managed by this provider.
	 *
	 * @param element the element
	 * @return the encoding for the given element
	 */
	String getEncoding(Object element);

	/**
	 * Sets the encoding for the given element. If <code>encoding</code>
	 * is <code>null</code> the workbench's character encoding should be used.
	 *
	 * @param element the element
	 * @param encoding the encoding to be used
	 */
	void setEncoding(Object element, String encoding);
}
