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
package at.bestsolution.efxclipse.tooling.rrobot.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EClass;

import at.bestsolution.efxclipse.tooling.rrobot.ProjectHandler;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.File;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.Folder;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.Project;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.Resource;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.TaskPackage;

public class DefaultProjectHandler<P extends Project> implements ProjectHandler<P> {
	static final String PLUGIN_ID = "at.bestsolution.efxclipse.tooling.rrobot";

	@Override
	public boolean isHandled(EClass eClass) {
		return eClass == TaskPackage.Literals.PROJECT;
	}

	@Override
	public IStatus createProject(IProgressMonitor monitor, P project, Map<String, Object> additionalData) {
		if( project.getExcludeExpression() != null ) {
			if( project.getExcludeExpression().execute(additionalData) ) {
				return new Status(IStatus.OK, PLUGIN_ID, "Resource '"+project.getName()+"' is excluded");
			}
		}

		IWorkspaceRoot r = ResourcesPlugin.getWorkspace().getRoot();
		IProject p = r.getProject(project.getName());
		if (!p.exists()) {
			try {
				p.create(monitor);
				p.open(monitor);
				IStatus s = createResources(monitor, p, project, additionalData);
				if(! s.isOK() ) {
					return s;
				}
			} catch (CoreException e) {
				return new Status(IStatus.ERROR, PLUGIN_ID, "Unable to create project '" + project.getName() + "'", e);
			}
		} else {
			return new Status(IStatus.ERROR, PLUGIN_ID, "Project '" + project.getName() + "' already exists.");
		}

		return customizeProject(monitor,p, project);
	}

	protected IStatus customizeProject(IProgressMonitor monitor,IProject project, P model) {
		return Status.OK_STATUS;
	}
	
	protected IStatus createResources(IProgressMonitor monitor, IProject p, P model, Map<String, Object> additionalData) {
		List<IStatus> l = new ArrayList<IStatus>();
		for (Resource r : model.getResources()) {
			
			if( exclude(r, additionalData) ) {
				l.add(new Status(IStatus.OK, PLUGIN_ID, "Resource '" + r.getName()+ "' exluded from generation"));
				continue;
			}
			
			if (r instanceof Folder) {
				IFolder f = p.getFolder(r.getName());
				
				if( ! f.exists() ) {
					try {
						f.create(true, true, monitor);
						l.add(new Status(IStatus.OK, PLUGIN_ID, "Folder '" + f.getFullPath() + "' created"));
					} catch (CoreException e) {
						l.add(new Status(IStatus.ERROR, PLUGIN_ID, "Unable to create folder '" + r.getName() + "'", e));
					}	
				}
								
				if( f.exists() ) {
					l.add(createResources(monitor, f, (Folder)r, additionalData));	
				}
			} else {
				IFile f = p.getFile(r.getName());
				l.add(createFile(monitor, f, (File) r, additionalData));
			}
		}
		return new MultiStatus(PLUGIN_ID, 0, l.toArray(new IStatus[0]), "Failed to create files", null);
	}

	protected IStatus createResources(IProgressMonitor monitor, IFolder folder, Folder model, Map<String, Object> additionalData) {
		List<IStatus> l = new ArrayList<IStatus>();
		for (Resource r : model.getChildren()) {
			
			if( exclude(r, additionalData) ) {
				l.add(new Status(IStatus.OK, PLUGIN_ID, "Resource '" + r.getName()+ "' exluded from generation"));
				continue;
			}
			
			if (r instanceof Folder) {
				IFolder f = folder.getFolder(r.getName());
				if( !f.exists() ) {
					try {
						f.create(true, true, monitor);
						l.add(new Status(IStatus.OK, PLUGIN_ID, "Folder '" + f.getFullPath() + "' created"));
					} catch (CoreException e) {
						l.add(new Status(IStatus.ERROR, PLUGIN_ID, "Unable to create folder '" + r.getName() + "'", e));
					}
				}
				if( f.exists() ) {
					l.add(createResources(monitor, f, (Folder)r, additionalData));	
				}
			} else {
				IFile f = folder.getFile(r.getName());
				l.add(createFile(monitor, f, (File) r, additionalData));
			}
		}
		return new MultiStatus(PLUGIN_ID, 0, l.toArray(new IStatus[0]), "Failed to create files", null);
	}

	protected IStatus createFile(IProgressMonitor monitor, IFile f, File file, Map<String, Object> additionalData) {
		if( exclude(file, additionalData) ) {
			return new Status(IStatus.OK, PLUGIN_ID, "Resource '" + file.getName()+ "' exluded from generation");
		}
		
		InputStream source = null;
		try {
			source = file.getContent(monitor, additionalData);
			f.create(source, IFile.KEEP_HISTORY, monitor);
		} catch (CoreException e) {
			return new Status(IStatus.ERROR, PLUGIN_ID, "Unable to create file '" + f.getFullPath() + "'", e);
		} catch (IOException e) {
			return new Status(IStatus.ERROR, PLUGIN_ID, "Unable to create file '" + f.getFullPath() + "'", e);
		} finally {
			try {
				if (source != null) {
					source.close();
				}
			} catch (IOException e) {
			}
		}

		return Status.OK_STATUS;
	}

	public static void addNatureToProject(IProject proj, String natureId, IProgressMonitor monitor) throws CoreException {
		IProjectDescription description = proj.getDescription();
		String[] prevNatures = description.getNatureIds();
		String[] newNatures = new String[prevNatures.length + 1];
		System.arraycopy(prevNatures, 0, newNatures, 0, prevNatures.length);
		newNatures[prevNatures.length] = natureId;
		description.setNatureIds(newNatures);
		proj.setDescription(description, monitor);
	}
	
	protected static boolean exclude(Resource model, Map<String, Object> additionalData) {
		if( model.getExcludeExpression() != null ) {
			return model.getExcludeExpression().execute(additionalData);
		}
		return false;
	}
}