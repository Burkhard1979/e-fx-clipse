package at.bestsolution.efxclipse.text.jface.contentassist;

import org.eclipse.core.runtime.IProgressMonitor;

/**
 * Extends {@link org.eclipse.jface.text.contentassist.ICompletionProposal} with the following
 * function:
 * <ul>
 * <li>Allow background computation of the additional info.</li>
 * </ul>
 *
 * @since 3.2
 */
public interface ICompletionProposalExtension5 {
	/**
	 * Returns additional information about the proposal. The additional information will be
	 * presented to assist the user in deciding if the selected proposal is the desired choice.
	 * <p>
	 * This method may be called on a non-UI thread.
	 * </p>
	 * <p>
	 * By default, the returned information is converted to a string and displayed as text; if
	 * {@link ICompletionProposalExtension3#getInformationControlCreator()} is implemented, the
	 * information will be passed to a custom information control for display.
	 * </p>
	 *
	 * @param monitor a monitor to report progress and to watch for
	 *        {@link IProgressMonitor#isCanceled() cancelation}.
	 * @return the additional information, <code>null</code> for no information
	 */
	Object getAdditionalProposalInfo(IProgressMonitor monitor);
}
