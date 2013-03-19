package at.bestsolution.efxclipse.text.editor;


import org.eclipse.core.runtime.IProgressMonitor;

/**
 * Extension interface for {@link org.eclipse.ui.texteditor.IDocumentProvider}. It adds the following
 * functions:
 * <ul>
 * <li> global temporary progress monitor
 * </ul>
 * @since 2.1
 */
public interface IDocumentProviderExtension2 {

	/**
	 * Sets this providers progress monitor.
	 *
	 * @param progressMonitor the progress monitor
	 */
	void setProgressMonitor(IProgressMonitor progressMonitor);

	/**
	 * Returns this providers progress monitor.
	 * @return IProgressMonitor
	 */
	IProgressMonitor getProgressMonitor();
}
