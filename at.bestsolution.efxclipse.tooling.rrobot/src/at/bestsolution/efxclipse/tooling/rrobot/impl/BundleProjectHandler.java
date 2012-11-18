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

import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EClass;

import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundlePackage;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.Project;

public class BundleProjectHandler extends DefaultProjectHandler {
	@Override
	public boolean isHandled(EClass eClass) {
		return eClass == BundlePackage.Literals.BUNDLE_PROJECT;
	}
	
	@Override
	public IStatus createProject(IProgressMonitor monitor, Project project, Map<String, Object> additionalData) {
		return super.createProject(monitor, project, additionalData);
	}
}
