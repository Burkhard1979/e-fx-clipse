package at.bestsolution.efxclipse.text.jface;

import org.eclipse.jface.text.IDocument;


/**
 * An auto edit strategy can adapt changes that will be applied to
 * a text viewer's document. The strategy is informed by the text viewer
 * about each upcoming change in form of a document command. By manipulating
 * this document command, the strategy can influence in which way the text
 * viewer's document is changed. Clients may implement this interface.
 *
 * @since 2.1
 */
public interface IAutoEditStrategy {

	/**
	 * Allows the strategy to manipulate the document command.
	 *
	 * @param document the document that will be changed
	 * @param command the document command describing the change
	 */
	void customizeDocumentCommand(IDocument document, DocumentCommand command);
}
