package at.bestsolution.efxclipse.text.jface.contentassist;

import at.bestsolution.efxclipse.text.jface.ITextViewer;

public interface IContentAssistProcessor {
	/**
	 * Returns a list of completion proposals based on the
	 * specified location within the document that corresponds
	 * to the current cursor position within the text viewer.
	 *
	 * @param viewer the viewer whose document is used to compute the proposals
	 * @param offset an offset within the document for which completions should be computed
	 * @return an array of completion proposals or <code>null</code> if no proposals are possible
	 */
	ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int offset);
	
	/**
	 * Returns the reason why this content assist processor
	 * was unable to produce any completion proposals or context information.
	 *
	 * @return an error message or <code>null</code> if no error occurred
	 */
	String getErrorMessage();
	
	char[] getCompletionProposalAutoActivationCharacters();
	char[] getContextInformationAutoActivationCharacters();
}
