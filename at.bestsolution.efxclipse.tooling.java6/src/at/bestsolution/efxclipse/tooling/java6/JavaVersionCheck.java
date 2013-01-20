package at.bestsolution.efxclipse.tooling.java6;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.statushandlers.StatusManager;
import org.osgi.framework.Version;

public class JavaVersionCheck implements IStartup {

	@Override
	public void earlyStartup() {
		Version minVersion = new Version("1.7.0");
		Version realVersion = new Version(System.getProperty("org.osgi.framework.version")); 
		
		if(minVersion.compareTo(realVersion) == 1 ) {
			StatusManager.getManager().handle(
					new Status(IStatus.ERROR, "at.bestsolution.efxclipse.tooling.java6", "You are not running your eclipse instance with Java7 or Java8. The JavaFX tooling is disabled because of this.\r\nMake Java7 the default java or adjust your eclipse.ini"),StatusManager.SHOW);
		}
	}

}
