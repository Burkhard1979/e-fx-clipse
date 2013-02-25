package at.bestsolution.efxclipse.text.jface.contentassist;

/**
 * Extends
 * {@link org.eclipse.jface.text.contentassist.ICompletionProposal} with
 * the following functions:
 * <ul>
 *   <li>specify whether a proposal is automatically insertable</li>
 * </ul>
 *
 * @since 3.1
 */
public interface ICompletionProposalExtension4 {

	/**
	 * Returns <code>true</code> if the proposal may be automatically
	 * inserted, <code>false</code> otherwise. Automatic insertion can
	 * happen if the proposal is the only one being proposed, in which
	 * case the content assistant may decide to not prompt the user with
	 * a list of proposals, but simply insert the single proposal. A
	 * proposal may veto this behavior by returning <code>false</code>
	 * to a call to this method.
	 *
	 * @return <code>true</code> if the proposal may be inserted
	 *         automatically, <code>false</code> if not
	 */
	boolean isAutoInsertable();
}
