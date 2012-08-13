package at.bestsolution.efxclipse.runtime.di;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Map;

import javafx.scene.image.Image;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.osgi.framework.BundleContext;

public abstract class BasicResourceProvider implements ResourceProviderService {
	protected Map<String, String> properties;
	protected BundleContext context;
	
	public void activate(BundleContext context, Map<String, String> properties) {
		this.properties = properties;
		this.context = context;
	}
	
	public Image getImage(String key) {
		URL url = FileLocator.find(context.getBundle(),new Path(properties.get(key)),null);
		
		if( url != null ) {
			InputStream stream = null;
			try {
				stream = url.openStream();
				return new Image(stream);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if( stream != null ) {
					try {
						stream.close();
					} catch (IOException e) {
					}
				}
			}
		}
		
		// TODO Auto-generated method stub
		return null;
	}
}