package at.bestsolution.efxclipse.text.editor;

import org.eclipse.core.runtime.CoreException;

/**
 * Extension interface for {@link org.eclipse.ui.texteditor.IDocumentProvider}.
 * Extends a document provider with the ability to detect a non-synchronized exception.
 * <p>
 * This interface may be implemented by clients.
 * </p>
 *
 * @see org.eclipse.ui.texteditor.IDocumentProvider
 * @since 3.2
 */
public interface IDocumentProviderExtension5 {

	/**
	 * Tells whether the given core exception is exactly the
	 * exception which is thrown for a non-synchronized element.
	 *
	 * @param element the element
	 * @param ex the core exception
	 * @return <code>true</code> iff the given core exception is exactly the
	 *			exception which is thrown for a non-synchronized element
	 */
	boolean isNotSynchronizedException(Object element, CoreException ex);
}
