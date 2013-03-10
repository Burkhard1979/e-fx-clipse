package at.bestsolution.efxclipse.text.jface.contentassist;

import at.bestsolution.efxclipse.runtime.bindings.KeySequence;

/**
 * Extends {@link org.eclipse.jface.text.contentassist.IContentAssistant} with the following
 * function:
 * <ul>
 * <li>a key-sequence to listen for in repeated invocation mode</li>
 * </ul>
 *
 * @since 3.2
 */
public interface IContentAssistantExtension3 {

	/**
	 * Sets the key sequence to listen for in repeated invocation mode. If the key sequence is
	 * encountered, a step in the repetition iteration is triggered.
	 *
	 * @param sequence the key sequence used for the repeated invocation mode or <code>null</code> if none
	 */
	public void setRepeatedInvocationTrigger(KeySequence sequence);
}
