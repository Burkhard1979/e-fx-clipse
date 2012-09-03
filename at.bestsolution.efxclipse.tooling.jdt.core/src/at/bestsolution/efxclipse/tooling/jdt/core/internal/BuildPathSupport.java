/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.efxclipse.tooling.jdt.core.internal;

import java.io.File;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IAccessRule;
import org.eclipse.jdt.core.IClasspathAttribute;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.JavaRuntime;

public class BuildPathSupport {
	public static final String WEB_JAVADOC_LOCATION = "http://docs.oracle.com/javafx/2/api/";
		
	public static IClasspathEntry getJavaFXLibraryEntry(IJavaProject project) {
		IPath[] paths = getFxJarPath(project);
		if( paths != null ) {
			
			IPath jarLocationPath = paths[0];
			IPath javadocLocation = paths[1];
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
	
	public static IPath[] getFxJarPath(IJavaProject project) {
		IPath jarLocationPath = null;
		IPath javadocLocation = null;
		IPath antJarLocationPath = null;
		IPath sourceLocationPath = null;
		
		try {
			IVMInstall i = JavaRuntime.getVMInstall(project);
			return getFxJarPath(i);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return new IPath[] { jarLocationPath, javadocLocation, antJarLocationPath, sourceLocationPath };
	}
	
	public static IPath[] getFxJarPath(IVMInstall i) {
		IPath jarLocationPath = null;
		IPath javadocLocation = null;
		IPath antJarLocationPath = null;
		IPath sourceLocationPath = null;
		
			File installDir = i.getInstallLocation();
			
			jarLocationPath = new Path(installDir.getAbsolutePath()).append("jre").append("lib").append("jfxrt.jar");
			// Could be a simple JRE => we don't look into the jre-folder
			if( ! jarLocationPath.toFile().exists() ) {
				IPath p = new Path(installDir.getAbsolutePath()).append("lib").append("jfxrt.jar");
				if( p.toFile().exists() ) {
					jarLocationPath = p;
				}
			}
			javadocLocation = new Path(installDir.getParentFile().getAbsolutePath()).append("docs").append("api"); //TODO Not shipped yet
			antJarLocationPath = new Path(installDir.getParent()).append("lib").append("ant-javafx.jar");

		return new IPath[] { jarLocationPath, javadocLocation, antJarLocationPath, sourceLocationPath };
	}
}
