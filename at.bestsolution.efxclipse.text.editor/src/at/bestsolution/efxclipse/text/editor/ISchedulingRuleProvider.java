package at.bestsolution.efxclipse.text.editor;

import org.eclipse.core.runtime.jobs.ISchedulingRule;

/**
 * A scheduling rule provider provides a scheduling rule which
 * can be used when running operations.
 *
 * @since 3.0
 */
public interface ISchedulingRuleProvider {

	/**
	 * Returns the scheduling rule.
	 *
	 * @return a scheduling rule or <code>null</code> if none
	 */
	ISchedulingRule getSchedulingRule();
}
