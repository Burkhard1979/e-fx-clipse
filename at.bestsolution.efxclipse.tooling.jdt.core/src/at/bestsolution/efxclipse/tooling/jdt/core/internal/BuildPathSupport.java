package at.bestsolution.efxclipse.tooling.jdt.core.internal;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jdt.core.IAccessRule;
import org.eclipse.jdt.core.IClasspathAttribute;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.osgi.service.environment.Constants;
import org.osgi.framework.Version;

public class BuildPathSupport {
	public static final String WEB_JAVADOC_LOCATION = "http://docs.oracle.com/javafx/2/api/";
	
	private static int parseQualifier(String qualifier) {
		try {
			String[] parts = qualifier.split("[\\-|_]");
			return Integer.parseInt(parts[0]);		
		} catch(Throwable t ) {
			//TODO log error
			t.printStackTrace();
		}
		return 0;
	}
	
	public static final boolean isJDKBuiltin() {
		Version v = new Version(System.getProperty("java.version").replaceFirst("_", "."));
		if( Platform.getOS().equals(Constants.OS_LINUX) ) {
			return v.getMinor() > 7 || (v.getMinor() >= 7 && (v.getMicro() == 0 && parseQualifier(v.getQualifier()) >= 6) || v.getMicro() > 0);
		} else if( Platform.getOS().equals(Constants.OS_MACOSX) ) {
			return v.getMinor() > 7 || (v.getMinor() >= 7 && v.getMicro() >= 0);
		} else if( Platform.getOS().equals(Constants.OS_WIN32) ) {
			return v.getMinor() > 7 || (v.getMinor() >= 7 && (v.getMicro() == 0 && parseQualifier(v.getQualifier()) >= 6) || v.getMicro() > 0);
		}
		return false;
	}
	
	public static IClasspathEntry getJavaFXLibraryEntry() {
		IPath[] paths = getPreferencePaths();
		
		if( paths != null && isJDKBuiltin() ) {
			IPath jarLocationPath = paths[0];
			IPath javadocLocation = paths[1];
//			IPath fxjarPath = paths[2];
			IPath fxSource = paths[3];
			
			IClasspathAttribute[] attributes;
			IAccessRule[] accessRules= { };
			if (javadocLocation == null || !javadocLocation.toFile().exists()) {
				attributes= new IClasspathAttribute[] { JavaCore.newClasspathAttribute(IClasspathAttribute.JAVADOC_LOCATION_ATTRIBUTE_NAME, WEB_JAVADOC_LOCATION) };
			} else {
				attributes= new IClasspathAttribute[] { JavaCore.newClasspathAttribute(IClasspathAttribute.JAVADOC_LOCATION_ATTRIBUTE_NAME, javadocLocation.toFile().toURI().toString()) };
			}
			
			if( jarLocationPath.toFile().exists() ) {
				return JavaCore.newLibraryEntry(jarLocationPath, fxSource, null, accessRules, attributes, false);	
			}	
		}
		
		return null;
	}
	
	public static IPath[] getPreferencePaths() {
		IPath jarLocationPath = null;
		IPath javadocLocation = null;
		IPath antJarLocationPath = null;
		IPath sourceLocationPath = null;
		
		File javaHome; 
		try {
			javaHome= new File (System.getProperty("java.home")).getCanonicalFile(); //$NON-NLS-1$
		} catch (IOException e) {
			//TODO Add logging
			e.printStackTrace();
			return null;
		}
		if (!javaHome.exists()) {
			return null;
		}
		
		jarLocationPath = new Path(javaHome.getAbsolutePath()).append("lib").append("jfxrt.jar");
		javadocLocation = new Path(javaHome.getParentFile().getAbsolutePath()).append("docs").append("api"); //TODO Fix with JDK-7u6 for OS-X
		antJarLocationPath = new Path(javaHome.getParent()).append("lib").append("ant-javafx.jar");
		
		return new IPath[] { jarLocationPath, javadocLocation, antJarLocationPath, sourceLocationPath };
	}
}
