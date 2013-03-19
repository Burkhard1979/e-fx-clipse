package at.bestsolution.efxclipse.text.editor;

import javafx.scene.image.Image;

import org.eclipse.jface.text.source.Annotation;

import at.bestsolution.efxclipse.jface.resources.ImageDescriptor;

/**
 * Provides an image for a given annotation.
 *
 * @since 3.0
 */
public interface IAnnotationImageProvider {

	/**
	 * Returns the image for the given annotation or <code>null</code>. The
	 * returned image is managed by this annotation image provided. If the
	 * annotation image provider does not support managed images, clients have
	 * to manage the annotation images. For that, clients first ask for the
	 * image descriptor id for a given annotation (<code>getImageDescriptorId(Annotation)</code>)
	 * as then for the image descriptor. The image descriptor id should be used
	 * to manage the annotation images using an <code>ImageRegistry</code>.
	 *
	 * @param annotation the annotation
	 * @return the managed image
	 */
	Image getManagedImage(Annotation annotation);

	/**
	 * Returns the image descriptor id of the image for the given annotation.
	 *
	 * @param annotation the annotation
	 * @return the image descriptor id
	 */
	String getImageDescriptorId(Annotation annotation);

	/**
	 * Returns the image descriptor for the given symbolic name.
	 *
	 * @param imageDescritporId the image descriptor id
	 * @return the image descriptor
	 */
	ImageDescriptor getImageDescriptor(String imageDescritporId);
}
