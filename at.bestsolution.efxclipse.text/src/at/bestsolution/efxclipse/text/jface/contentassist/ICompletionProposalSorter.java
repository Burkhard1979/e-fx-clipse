package at.bestsolution.efxclipse.text.jface.contentassist;


/**
 * An <code>ICompletionProposalSorter</code> provides support for sorting proposals of a content
 * assistant.
 * <p>
 * Implementors of this interface have to register this sorter with the content assist whenever
 * needed. See {@link ContentAssistant#setSorter(ICompletionProposalSorter)} for more information on
 * how to register a proposal sorter.
 * </p>
 * 
 * @since 3.8
 */
public interface ICompletionProposalSorter {

	/**
	 * The orderings imposed by an implementation need not be consistent with equals.
	 * 
	 * @param p1 the first proposal to be compared
	 * @param p2 the second proposal to be compared
	 * @return a negative integer, zero, or a positive integer as the first argument is less than,
	 *         equal to, or greater than the second
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(ICompletionProposal p1, ICompletionProposal p2);

}