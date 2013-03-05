package at.bestsolution.efxclipse.text.jface.templates;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.jface.text.templates.TemplateContextType;

/**
 * A registry for context types. Editor implementors will usually instantiate a
 * registry and configure the context types available in their editor.
 * <p>
 * In order to pick up templates contributed using the <code>org.eclipse.ui.editors.templates</code>
 * extension point, use a <code>ContributionContextTypeRegistry</code>.
 * </p>
 *
 * @since 3.0
 */
public class ContextTypeRegistry {

	/** all known context types */
	private final Map fContextTypes= new LinkedHashMap();

	/**
	 * Adds a context type to the registry. If there already is a context type
	 * with the same ID registered, it is replaced.
	 *
	 * @param contextType the context type to add
	 */
	public void addContextType(TemplateContextType contextType) {
		fContextTypes.put(contextType.getId(), contextType);
	}

	/**
	 * Returns the context type if the id is valid, <code>null</code> otherwise.
	 *
	 * @param id the id of the context type to retrieve
	 * @return the context type if <code>name</code> is valid, <code>null</code> otherwise
	 */
	public TemplateContextType getContextType(String id) {
		return (TemplateContextType) fContextTypes.get(id);
	}

	/**
	 * Returns an iterator over all registered context types.
	 *
	 * @return an iterator over all registered context types (element type: {@link TemplateContextType})
	 */
	public Iterator contextTypes() {
		return fContextTypes.values().iterator();
	}
}
