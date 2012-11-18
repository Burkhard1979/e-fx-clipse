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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EClass;

import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundlePackage;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundleProject;

public class BundleProjectHandler extends DefaultProjectHandler<BundleProject> {
	@Override
	public boolean isHandled(EClass eClass) {
		return eClass == BundlePackage.Literals.BUNDLE_PROJECT;
	}
	
	@Override
	public IStatus createProject(IProgressMonitor monitor, BundleProject project, Map<String, Object> additionalData) {
		return super.createProject(monitor, project, additionalData);
	}
	
	@Override
	protected IStatus createResources(IProgressMonitor monitor, IProject p, BundleProject model, Map<String, Object> additionalData) {
		IStatus s = super.createResources(monitor, p, model, additionalData);
		
		if( s.isOK() ) {
			List<IStatus> rv = new ArrayList<>();
			rv.add(s);
			
			{
				IFolder f = p.getFolder("META-INF");
				if( ! f.exists() ) {
					try {
						f.create(true, true, monitor);
					} catch (CoreException e) {
						rv.add(new Status(IStatus.ERROR, PLUGIN_ID, "Failed to create folder 'META-INF'",e));
					}				
				}
				rv.add(createFile(monitor,  f.getFile("MANIFEST.MF"), model.getManifest(), additionalData));
			}
			
			if( model.getPluginxml() != null ) {
				rv.add(createFile(monitor, p.getFile("MANIFEST.MF"), model.getManifest(), additionalData));
			}
			
			rv.add(createFile(monitor, p.getFile("build.properties"),model.getBuildProperties(), additionalData));
			
			return new MultiStatus(PLUGIN_ID, 0, rv.toArray(new IStatus[0]), "File creation states",null);
		} else {
			return s;
		}
	}
}
