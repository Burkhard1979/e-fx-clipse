package at.bestsolution.efxclipse.text.jface.contentassist;

import org.eclipse.core.commands.IHandler;


/**
 * Extends {@link org.eclipse.jface.text.contentassist.IContentAssistant} with
 * the following function:
 * <ul>
 * <li>allows to get a handler for the given command identifier</li>
 * </ul>
 *
 * @since 3.4
 */
public interface IContentAssistantExtension4 {

	/**
	 * Returns the handler for the given command identifier.
	 * <p>
	 * The same handler instance will be returned when called a more than once
	 * with the same command identifier.
	 * </p>
	 *
	 * @param commandId the command identifier
	 * @return the handler for the given command identifier
	 * @throws IllegalArgumentException if the command is not supported by this
	 *             content assistant
	 * @throws IllegalStateException if called when this content assistant is
	 *             uninstalled
	 */
	IHandler getHandler(String commandId);

}
