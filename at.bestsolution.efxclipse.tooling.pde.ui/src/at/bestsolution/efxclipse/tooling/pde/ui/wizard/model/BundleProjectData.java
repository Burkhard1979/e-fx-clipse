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
package at.bestsolution.efxclipse.tooling.pde.ui.wizard.model;

import org.eclipse.core.runtime.Path;

public class BundleProjectData {
	private String projectname;
	private Path projectPath;
	private String symbolicname;
	private String version;
	private String vendor;
	private String EEnv;
	
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public String getSymbolicname() {
		return symbolicname;
	}
	public void setSymbolicname(String symbolicname) {
		this.symbolicname = symbolicname;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public String getEEnv() {
		return EEnv;
	}
	public void setEEnv(String eEnv) {
		EEnv = eEnv;
	}
	public void setProjectPath(Path projectPath) {
		this.projectPath = projectPath;
	}
	public Path getProjectPath() {
		return projectPath;
	}
}
