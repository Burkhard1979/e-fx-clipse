package at.bestsolution.efxclipse.text.editor;


/**
 * Extension interface for {@link org.eclipse.ui.texteditor.IDocumentProvider}. The method
 * <code>isSynchronized</code> replaces the original <code>getSynchronizationStamp</code> method.
 *
 * @since 3.0
 */
public interface IDocumentProviderExtension3 {

	/**
	 * Returns whether the information provided for the given element is in sync with the element.
	 *
	 * @param element the element
	 * @return <code>true</code> if the information is in sync with the element, <code>false</code> otherwise
	 */
	boolean isSynchronized(Object element);
}
