package at.bestsolution.efxclipse.text.editor;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.content.IContentType;


/**
 * Extension interface for {@link org.eclipse.ui.texteditor.IDocumentProvider}.
 * Extends a document provider with the ability to query the content type
 * of a given element.
 * <p>
 * This interface may be implemented by clients.
 * </p>
 *
 * @see org.eclipse.ui.texteditor.IDocumentProvider
 * @since 3.1
 */
public interface IDocumentProviderExtension4 {

	/**
	 * Returns the content type of for the given element or
	 * <code>null</code> if none could be determined. If the element's
	 * document can be saved, the returned content type is determined by the
	 * document's current content.
	 *
	 * @param element the element
	 * @return the content type or <code>null</code>
	 * @throws CoreException if reading or accessing the underlying store
	 *                 fails
	 */
	IContentType getContentType(Object element) throws CoreException;
}
