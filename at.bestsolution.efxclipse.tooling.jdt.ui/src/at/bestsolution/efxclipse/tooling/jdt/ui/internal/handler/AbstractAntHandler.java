/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *     Martin Blühweis<martin.bluehweis@bestsolution.at> - refactoring to EMF build model
 *******************************************************************************/
package at.bestsolution.efxclipse.tooling.jdt.ui.internal.handler;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.IClasspathContainer;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.ui.PlatformUI;

import at.bestsolution.efxclipse.tooling.jdt.core.internal.BuildPathSupport;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTask;

public abstract class AbstractAntHandler extends AbstractHandler {
	protected IJavaProject project;

	protected BuildConfiguration prepareBuild( IFile f, AntTask task ) {
		BuildConfiguration config = new BuildConfiguration();
		config.task = task;
		String workbench = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();

		project = JavaCore.create( f.getProject() );
		IPath[] paths = BuildPathSupport.getFxJarPath( project );
		if ( paths != null ) {
			config.jfxjar = paths[0].toFile().getAbsolutePath();
			config.jfxantjar = paths[2].toFile().getAbsolutePath();
		}

		if ( task.getBuildDirectory() == null ) {
			DirectoryDialog dialog = new DirectoryDialog( PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell() );
			dialog.setText( "Staging Directory" );
			String directory = dialog.open();
			if ( directory == null ) {
				return null;
			}
			config.buildDirectory = directory;
		}
		else {
			config.buildDirectory = task.getBuildDirectory().replace( "${workspace}", workbench );
		}

		// TODO uncomment
//		config.builderName = properties.getProperty( "jfx.eclipse.buildername" );
//		config.projectName = properties.getProperty( "jfx.build.projectname", f.getProject().getName() );

		config.keyStore = task.getSignjar().getKeystore() != null ? task.getSignjar().getKeystore().replace( "${workspace}", workbench ) : null;

		try {
			config.projectEncoding = f.getProject().getDefaultCharset();
			config.sourceCompliance = project.getOption( JavaCore.COMPILER_SOURCE, true );
			config.targetCompliance = project.getOption( JavaCore.COMPILER_COMPLIANCE, true );
		}
		catch ( CoreException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Set<IPath> listProjectSourceDirs = new HashSet<IPath>();
		Set<IPath> listRefProjectSourceDirs = new HashSet<IPath>();
		Set<IPath> listRefLibraries = new HashSet<IPath>();

		resolveDataProject( project, listProjectSourceDirs, listRefProjectSourceDirs, listRefLibraries );

		{
			Set<String> set = new HashSet<String>();
			Set<File> set2 = new HashSet<File>();
			for ( IPath p : listRefLibraries ) {
				set.add( p.lastSegment() );
				IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile( p );
				if ( file != null && file.exists() ) {
					p = file.getLocation();
				}
				set2.add( p.toFile() );
			}
			config.externalLibs = set;
			config.origExternalLibs = set2;
		}

		{
			Set<String> set = new HashSet<String>();
			Set<SetupDirectory> set2 = new HashSet<SetupDirectory>();
			for ( IPath p : listProjectSourceDirs ) {
				IFolder t = ResourcesPlugin.getWorkspace().getRoot().getFolder( p );
				set.add( t.getProjectRelativePath().toString() );
				set2.add( new SetupDirectory( t.getLocation().toFile().getParentFile(), new File( t.getProjectRelativePath().toString() ) ) );
			}
			config.projectSourceDirs = set;
			config.origProjectSourceDirs = set2;
		}

		{
			Set<String> set = new HashSet<String>();
			Set<SetupDirectory> set2 = new HashSet<SetupDirectory>();
			for ( IPath p : listRefProjectSourceDirs ) {
				IFolder t = ResourcesPlugin.getWorkspace().getRoot().getFolder( p );
				set.add( t.getProject().getName() + "/" + t.getProjectRelativePath() );
				set2.add( new SetupDirectory( t.getProject().getLocation().toFile().getParentFile(), new File( t.getProject().getName() + "/"
						+ t.getProjectRelativePath().toString() ) ) );

			}
			config.projectRefSourceDirs = set;
			config.origProjectRefSourceDirs = set2;
		}
		return config;
	}

	private void resolveDataProject( IJavaProject project, Set<IPath> listProjectSourceDirs, Set<IPath> listRefProjectSourceDirs, Set<IPath> listRefLibraries ) {
		try {
			IClasspathEntry[] entries = project.getRawClasspath();
			for ( IClasspathEntry e : entries ) {
				if ( e.getEntryKind() == IClasspathEntry.CPE_PROJECT ) {
					IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject( e.getPath().lastSegment() );
					if ( p.exists() ) {
						resolveDataProject( JavaCore.create( p ), listRefProjectSourceDirs, listRefProjectSourceDirs, listRefLibraries );
					}
				}
				else if ( e.getEntryKind() == IClasspathEntry.CPE_LIBRARY ) {
					listRefLibraries.add( e.getPath() );
				}
				else if ( e.getEntryKind() == IClasspathEntry.CPE_SOURCE ) {
					listProjectSourceDirs.add( e.getPath() );
				}
				else if ( e.getEntryKind() == IClasspathEntry.CPE_CONTAINER ) {
					String start = e.getPath().segment( 0 );
					// TODO remove hard coded strings
					if ( !"org.eclipse.jdt.launching.JRE_CONTAINER".equals( start )
							&& !"at.bestsolution.efxclipse.tooling.jdt.core.JAVAFX_CONTAINER".equals( start ) ) {
						IClasspathContainer cpe = JavaCore.getClasspathContainer( e.getPath(), project );
						IClasspathEntry[] cpEntries = cpe.getClasspathEntries();
						for ( IClasspathEntry tmp : cpEntries ) {
							if ( tmp.getEntryKind() == IClasspathEntry.CPE_LIBRARY ) {
								listRefLibraries.add( tmp.getPath() );
							}
						}
					}
				}
			}
		}
		catch ( JavaModelException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public class BuildConfiguration {
		public Set<SetupDirectory> origProjectRefSourceDirs;
		public Set<String> projectRefSourceDirs;
		public Set<SetupDirectory> origProjectSourceDirs;
		public Set<String> projectSourceDirs;
		public Set<File> origExternalLibs;
		public Set<String> externalLibs;
		public String targetCompliance;
		public String projectEncoding;
		public String sourceCompliance;
		public Object keyStore;
		public Object projectName;
		public Object builderName;
		public String buildDirectory;
		public String jfxantjar;
		public String jfxjar;
		public AntTask task;
	}
}
