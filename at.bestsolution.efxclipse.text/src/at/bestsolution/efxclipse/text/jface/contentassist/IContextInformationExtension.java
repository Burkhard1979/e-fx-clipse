package at.bestsolution.efxclipse.text.jface.contentassist;


/**
 * Extends {@link org.eclipse.jface.text.contentassist.IContextInformation} with
 * the ability to freely position the context information.
 *
 * @since 2.0
 */
public interface IContextInformationExtension {

	/**
	 * Returns the start offset of the range for which this context
	 * information is valid or <code>-1</code> if unknown.
	 *
	 * @return the start offset of the range for which this context
	 *         information is valid
	 */
	int getContextInformationPosition();
}
