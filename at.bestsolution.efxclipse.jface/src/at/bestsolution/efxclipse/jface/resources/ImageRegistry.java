package at.bestsolution.efxclipse.jface.resources;

import java.util.HashMap;
import java.util.Map;

import javafx.scene.image.Image;

public class ImageRegistry {
	static class Entry {
		Image image;
		ImageDescriptor descriptor;
	}
	
	private Map<String, Entry> descriptors = new HashMap<>();
	
	public void put(String key, ImageDescriptor imageDescriptor) {
		Entry e = new Entry();
		e.descriptor = imageDescriptor;
		descriptors.put(key, e);
	}

	public ImageDescriptor getDescriptor(String key) {
		Entry e = descriptors.get(key);
		if( e != null ) {
			if( e.descriptor == null ) {
				final Image img = e.image;
				e.descriptor = new ImageDescriptor() {
					
					@Override
					public Image createImage() {
						return img;
					}
				};
			}
			return e.descriptor;
		}
		return null;
	}

	public Image get(String key) {
		Entry e = descriptors.get(key);
		if( e != null ) {
			if( e.image == null ) {
				e.image = e.descriptor.createImage();
			}
			return e.image;
		}
		return null;
	}

}
