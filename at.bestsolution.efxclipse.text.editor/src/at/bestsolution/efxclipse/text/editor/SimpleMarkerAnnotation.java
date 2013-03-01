package at.bestsolution.efxclipse.text.editor;

import org.eclipse.core.runtime.Assert;

import org.eclipse.core.resources.IMarker;

import org.eclipse.jface.text.source.Annotation;

import at.bestsolution.efxclipse.text.editor.internal.TextEditorPlugin;


/**
 * An annotation representing a marker. This is a model annotation.
 *
 * @see IMarker
 * @since 3.0
 */
public class SimpleMarkerAnnotation extends Annotation {

	private IMarker fMarker;

	/**
	 * Creates a new annotation for the given marker.
	 * @see IMarker
	 *
	 * @param marker the marker
	 */
	public SimpleMarkerAnnotation(IMarker marker) {
		this(TextEditorPlugin.getDefault().getAnnotationTypeLookup().getAnnotationType(marker), marker);
	}

	/**
	 * Creates a new annotation of the given type for the given marker.
	 *
	 * @param annotationType the annotation type
	 * @param marker the marker
	 */
	public SimpleMarkerAnnotation(String annotationType, IMarker marker) {
		super(annotationType, true, null);
		Assert.isNotNull(marker);
		fMarker= marker;
	}

	/**
	 * Returns this annotation's underlying marker.
	 *
	 * @return the marker
	 */
	public IMarker getMarker() {
		return fMarker;
	}

	/**
	 * The <code>SimpleMarkerAnnotation</code> implementation of this
	 * <code>Object</code> method returns <code>true</code> iff the other
	 * object is of the same class and the marker handles are equal.
	 *
	 * @see Object#equals(java.lang.Object)
	 */
	public boolean equals(Object o) {
		if (o != null && o.getClass() == getClass())
			return fMarker.equals(((SimpleMarkerAnnotation) o).fMarker);
		return false;
	}

	/*
	 * @see Object#hashCode()
	 */
	public int hashCode() {
		return fMarker.hashCode();
	}

	/**
	 * Informs this annotation about changes applied to its underlying marker
	 * and adapts to those changes.
	 * <p>
	 * Subclasses may extend this method.
	 * </p>
	 */
	public void update() {
		updateType();
	}

	/**
	 * Updates the type to be synchronized with its underlying marker.
	 *
	 * @since 3.0
	 */
	private void updateType() {
		String annotationType= TextEditorPlugin.getDefault().getAnnotationTypeLookup().getAnnotationType(fMarker);
		if (annotationType != null && !annotationType.equals(getType()))
			setType(annotationType);
	}

	/*
	 * @see org.eclipse.jface.text.source.Annotation#getText()
	 */
	public String getText() {
		return MarkerUtilities.getMessage(fMarker);
	}
}
