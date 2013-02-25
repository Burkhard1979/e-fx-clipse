package at.bestsolution.efxclipse.text.jface.contentassist;


/**
 * Extends {@link org.eclipse.jface.text.contentassist.ICompletionListener} with an additional
 * notification after applying a proposal.
 * <p>
 * Clients may implement this interface.
 * </p>
 * 
 * @since 3.8
 */
public interface ICompletionListenerExtension2 {

	/**
	 * Called after applying a proposal.
	 * 
	 * @param proposal the applied proposal
	 */
	void applied(ICompletionProposal proposal);

}