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
package at.bestsolution.efxclipse.tooling.pde.e4.project.template;

import java.util.HashSet;
import java.util.Set;

public class E4LaunchDef {
	private String projectName;
	private String junitClassName;
	
	private Set<PluginLaunchDef> workbenchPlugins = new HashSet<PluginLaunchDef>();
	private Set<PluginLaunchDef> targetPlugins = new HashSet<PluginLaunchDef>();
	
	/**
	 * @return the workbenchPlugins
	 */
	public Set<PluginLaunchDef> getWorkbenchPlugins() {
		return workbenchPlugins;
	}
	
	/**
	 * @return the targetPlugins
	 */
	public Set<PluginLaunchDef> getTargetPlugins() {
		return targetPlugins;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getJunitClassName() {
		return junitClassName;
	}

	public void setJunitClassName(String junitClassName) {
		this.junitClassName = junitClassName;
	}
}
