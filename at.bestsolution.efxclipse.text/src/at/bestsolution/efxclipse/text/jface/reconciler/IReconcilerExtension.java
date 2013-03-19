package at.bestsolution.efxclipse.text.jface.reconciler;


/**
 * Extends {@link org.eclipse.jface.text.reconciler.IReconciler} with
 * the ability to be aware of documents with multiple partitionings.
 *
 * @since 3.0
 */
public interface IReconcilerExtension {

	/**
	 * Returns the partitioning this reconciler is using.
	 *
	 * @return the partitioning this reconciler is using
	 */
	String getDocumentPartitioning();
}
