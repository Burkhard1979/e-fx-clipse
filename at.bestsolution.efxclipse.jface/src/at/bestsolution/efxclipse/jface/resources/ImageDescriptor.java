package at.bestsolution.efxclipse.jface.resources;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javafx.scene.image.Image;

public abstract class ImageDescriptor {

	public static ImageDescriptor createFromURL(final URL url) {
		return new ImageDescriptor() {

			@Override
			public Image createImage() {
				try (InputStream in = url.openStream()) {
					return new Image(in);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return null;
			}
		};
	}

	public abstract Image createImage();

	public static ImageDescriptor getMissingImageDescriptor() {
		return new ImageDescriptor() {
			
			@Override
			public Image createImage() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}
}
