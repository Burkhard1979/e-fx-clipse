package at.bestsolution.efxclipse.text.jface.contentassist;


/**
 * Extends {@link org.eclipse.jface.text.contentassist.IContentAssistant}
 * with the following functions:
 * <ul>
 * 	<li>handle documents with multiple partitions</li>
 * 	<li>insertion of common completion prefixes</li>
 * </ul>
 *
 * @since 3.0
 */
public interface IContentAssistantExtension {

	/**
	 * Returns the document partitioning this content assistant is using.
	 *
	 * @return the document partitioning this content assistant is using
	 */
	String getDocumentPartitioning();

	/**
	 * Inserts the common prefix of the available completions. If no common
	 * prefix can be computed it is identical to
	 * {@link IContentAssistant#showPossibleCompletions()}.
	 *
	 * @return an optional error message if no proposals can be computed
	 */
	String completePrefix();
}
