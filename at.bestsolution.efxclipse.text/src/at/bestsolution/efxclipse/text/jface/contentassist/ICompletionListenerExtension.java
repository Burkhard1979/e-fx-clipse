package at.bestsolution.efxclipse.text.jface.contentassist;

/**
 * Extends {@link org.eclipse.jface.text.contentassist.ICompletionListener}
 * with an additional notification about restarting the current code assist session.
 * <p>
 * Clients may implement this interface.
 * </p>
 *
 * @since 3.4
 */
public interface ICompletionListenerExtension {
	/**
	 * Called when code assist is invoked when there is already a current code assist session.
	 *
	 * @param event the content assist event
	 */
	void assistSessionRestarted(ContentAssistEvent event);

}