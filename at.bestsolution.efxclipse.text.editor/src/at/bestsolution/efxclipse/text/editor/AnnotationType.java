package at.bestsolution.efxclipse.text.editor;

import org.eclipse.jface.text.TextUtilities;

/**
 * Represents an annotation type.
 *
 * @since 3.0
 */
public final class AnnotationType {
	private String fType;
	private String[] fSuperTypes;
	private AnnotationPreference fPreference;

	public AnnotationType(String type, String[] superTypes) {
		fType= type;
		fSuperTypes= TextUtilities.copy(superTypes);
	}

	public String getType() {
		return fType;
	}

	/**
	 * Returns the list of super types of this annotation type. This list is owned by
	 * this annotation type and may not be manipulated by clients.
	 *
	 * @return the list of super types
	 */
	public String[] getSuperTypes() {
		return fSuperTypes;
	}

	/**
	 * For internal use only.
	 *
	 * @return the annotation preference
	 */
	public AnnotationPreference getPreference() {
		return fPreference;
	}

	/**
	 * For internal use only.
	 *
	 * @param preference the annotation preference
	 */
	public void setAnnotationPreference(AnnotationPreference preference) {
		fPreference= preference;
	}

	public boolean isSubtype(String superType) {
		if (fSuperTypes == null || superType == null)
			return false;

		if (superType.equals(fType))
			return true;

		for (int i= fSuperTypes.length -1; i > -1; i--) {
			if (superType.equals(fSuperTypes[i]))
				return true;
		}

		return false;
	}
}
