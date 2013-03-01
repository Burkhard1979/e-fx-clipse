package at.bestsolution.efxclipse.text.editor.spelling;

/**
 * A collector of {@link SpellingProblem}s. The {@link SpellingService} service
 * will report its results to such a collector.
 * <p>
 * An implementer may specify if a collector is thread aware, i.e., if problems
 * can be reported by any thread, potentially in parallel, and thus, multiple
 * reporting sessions may be active at the same time. Clients of concrete
 * collectors in turn must evaluate the usage of their collector and chose an
 * appropriate implementation.
 * </p>
 * <p>
 * This interface is intended to be implemented by clients.
 * </p>
 *
 * @see SpellingService
 * @since 3.1
 */
public interface ISpellingProblemCollector {

	/**
	 * Notification of a spelling problem.
	 *
	 * @param problem the spelling problem
	 */
	public void accept(SpellingProblem problem);

	/**
	 * Notification sent before starting to collect problems. This method
	 * will be called by the spelling infrastructure and is not intended
	 * to be called by clients.
	 */
	public void beginCollecting();

	/**
	 * Notification sent after completing to collect problems. This method
	 * will be called by the spelling infrastructure and is not intended
	 * to be called by clients.
	 */
	public void endCollecting();
}
