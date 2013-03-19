package at.bestsolution.efxclipse.text.editor.spelling;

import org.eclipse.core.runtime.IProgressMonitor;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;

/**
 * A spelling engine that can be contributed to the
 * <code>org.eclipse.ui.workbench.texteditor.spellingEngine</code> extension
 * point. The <code>SpellingContext</code> provides information about the
 * content type to be checked. In general a spelling engine should at least
 * support the text {@link org.eclipse.core.runtime.content.IContentType content type}.
 * <p>
 * This interface is intended to be implemented by clients.
 * </p>
 *
 * @since 3.1
 */
public interface ISpellingEngine {

	/**
	 * Checks the given regions in the given document. Reports all found
	 * spelling problems to the collector.
	 *
	 * @param document the document to check
	 * @param regions the regions to check
	 * @param context the context
	 * @param collector the problem collector
	 * @param monitor the progress monitor, can be <code>null</code>
	 */
	public void check(IDocument document, IRegion[] regions, SpellingContext context, ISpellingProblemCollector collector, IProgressMonitor monitor);
}
