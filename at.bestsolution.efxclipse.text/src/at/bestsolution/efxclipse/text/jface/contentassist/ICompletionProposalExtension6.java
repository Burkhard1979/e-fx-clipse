package at.bestsolution.efxclipse.text.jface.contentassist;

import at.bestsolution.efxclipse.jface.StyledString;


/**
 * Extends {@link org.eclipse.jface.text.contentassist.ICompletionProposal} with the following
 * function:
 * <ul>
 * 	<li>Allow styled ranges in the display string.</li>
 * </ul>
 *
 * @since 3.4
 */
public interface ICompletionProposalExtension6 {

	/**
	 * Returns the styled string used to display this proposal in the list of completion proposals.
	 * This can for example be used to draw mixed colored labels.
	 * <p>
	 * <strong>Note:</strong> {@link ICompletionProposal#getDisplayString()} still needs to be
	 * correctly implemented as this method might be ignored in case of uninstalled owner draw
	 * support.
	 * </p>
	 *
	 * @return the string builder used to display this proposal
	 */
	StyledString getStyledDisplayString();
}
