package at.bestsolution.efxclipse.text.jface;

import javafx.stage.Stage;


/**
 * Interface of a factory for information controls (
 * {@link org.eclipse.jface.text.IInformationControl}).
 *
 * In order to provide backward compatibility for clients of
 * <code>IInformationControlCreator</code>, extension interfaces are used as
 * a means of evolution. The following extension interfaces exist:
 * <ul>
 * <li>{@link org.eclipse.jface.text.IInformationControlCreatorExtension} since
 *     version 3.0 introducing checks of whether existing information control can
 *     be reused and whether information control creators can replace each other.
 * </li>
 * </ul>
 *
 * @see org.eclipse.jface.text.IInformationControlCreatorExtension
 * @since 2.0
 */
public interface IInformationControlCreator {

	/**
	 * Creates a new information control with the given shell as the control's parent.
	 *
	 * @param parent the parent shell
	 * @return the created information control
	 */
	IInformationControl createInformationControl(Stage parent);
}

