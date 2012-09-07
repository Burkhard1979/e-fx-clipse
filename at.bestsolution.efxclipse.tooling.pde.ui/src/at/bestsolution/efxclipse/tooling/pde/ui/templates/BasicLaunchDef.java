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
package at.bestsolution.efxclipse.tooling.pde.ui.templates;

import java.util.HashSet;
import java.util.Set;

public abstract class BasicLaunchDef {
	private String projectName;
	private Set<PluginLaunchDef> workbenchPlugins = new HashSet<PluginLaunchDef>();
	private Set<PluginLaunchDef> targetPlugins = new HashSet<PluginLaunchDef>();

	public Set<PluginLaunchDef> getWorkbenchPlugins() {
		return workbenchPlugins;
	}
	
	public Set<PluginLaunchDef> getTargetPlugins() {
		return targetPlugins;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
}
