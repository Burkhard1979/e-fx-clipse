package at.bestsolution.efxclipse.text.jface.source;

import at.bestsolution.efxclipse.jface.RGB;
import javafx.scene.paint.Color;

/**
 * Manages SWT color objects. Until the <code>dispose</code> method is called,
 * the same color object is returned for equal <code>RGB</code> values.
 * <p>
 * This interface may be implemented by clients.
 * </p>
 *
 * @since 2.1
 */
public interface ISharedTextColors {

	/**
	 * Returns the color object for the value represented by the given
	 * <code>RGB</code> object.
	 *
	 * @param rgb the RBG color specification
	 * @return the color object for the given RGB value
	 */
	Color getColor(RGB rgb);
 
	/**
	 * Tells this object to dispose all its managed colors. 
	 */
	void dispose();
}
