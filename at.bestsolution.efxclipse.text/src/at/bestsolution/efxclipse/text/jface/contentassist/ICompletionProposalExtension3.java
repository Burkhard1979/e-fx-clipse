package at.bestsolution.efxclipse.text.jface.contentassist;

import org.eclipse.jface.text.IDocument;

import at.bestsolution.efxclipse.text.jface.IInformationControlCreator;


/**
 * Extends {@link org.eclipse.jface.text.contentassist.ICompletionProposal}
 * with the following functions:
 * <ul>
 *	<li>provision of a custom information control creator</li>
 *	<li>provide a custom completion text and offset for prefix completion</li>
 * </ul>
 *
 * @since 3.0
 */
public interface ICompletionProposalExtension3 {
	/**
	 * Returns the information control creator of this completion proposal.
	 *
	 * @return the information control creator, or <code>null</code> if no custom control creator is available
	 */
	IInformationControlCreator getInformationControlCreator();

	/**
	 * Returns the string that would be inserted at the position returned from
	 * {@link #getPrefixCompletionStart(IDocument, int)} if this proposal was
	 * applied. If the replacement string cannot be determined,
	 * <code>null</code> may be returned.
	 *
	 * @param document the document that the receiver applies to
	 * @param completionOffset the offset into <code>document</code> where the
	 *        completion takes place
	 * @return the replacement string or <code>null</code> if it cannot be
	 *         determined
	 */
	CharSequence getPrefixCompletionText(IDocument document, int completionOffset);

	/**
	 * Returns the document offset at which the receiver would insert its
	 * proposal.
	 *
	 * @param document the document that the receiver applies to
	 * @param completionOffset the offset into <code>document</code> where the
	 *        completion takes place
	 * @return the offset at which the proposal would insert its proposal
	 */
	int getPrefixCompletionStart(IDocument document, int completionOffset);

}
