package at.bestsolution.efxclipse.text.editor;

import java.net.URI;


/**
 * Extension interface for {@link org.eclipse.ui.editors.text.ILocationProvider}. Adds
 * ability to the location for a given object as URI.
 *
 * @since 3.3
 */
public interface ILocationProviderExtension {

	/**
	 * Returns the URI of the given object or <code>null</code>.
	 *
	 * @param element the object for which to get the location
	 * @return the URI of the given object or <code>null</code>
	 */
	URI getURI(Object element);
}
