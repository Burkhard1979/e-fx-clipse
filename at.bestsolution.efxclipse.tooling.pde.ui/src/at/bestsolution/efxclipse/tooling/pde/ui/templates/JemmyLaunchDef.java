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

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * @author tomschindl
 *
 */
public class JemmyLaunchDef extends BasicLaunchDef {
	private String junitClassName;
	private String testProductId;
	
	public String getJunitClassName() {
		return junitClassName;
	}

	public void setJunitClassName(String junitClassName) {
		this.junitClassName = junitClassName;
	}

	public String getTestProductId() {
		return testProductId;
	}

	public void setTestProductId(String testProductId) {
		this.testProductId = testProductId;
	}

	public static Collection<PluginLaunchDef> getTargetPluginsOSGi() {
		Set<PluginLaunchDef> l = new HashSet<PluginLaunchDef>();
		l.add(new PluginLaunchDef("com.ibm.icu"));
		l.add(new PluginLaunchDef("org.apache.felix.gogo.command"));
		l.add(new PluginLaunchDef("org.apache.felix.gogo.runtime"));
		l.add(new PluginLaunchDef("org.apache.felix.gogo.shell"));
		l.add(new PluginLaunchDef("org.eclipse.core.contenttype"));
		l.add(new PluginLaunchDef("org.eclipse.core.databinding.observable"));
		l.add(new PluginLaunchDef("org.eclipse.core.databinding.property"));
		l.add(new PluginLaunchDef("org.eclipse.core.databinding"));
		l.add(new PluginLaunchDef("org.eclipse.core.jobs"));
		l.add(new PluginLaunchDef("org.eclipse.core.runtime","default","true"));
		l.add(new PluginLaunchDef("org.eclipse.equinox.app"));
		l.add(new PluginLaunchDef("org.eclipse.equinox.common","2","true"));
		l.add(new PluginLaunchDef("org.eclipse.equinox.console"));
		l.add(new PluginLaunchDef("org.eclipse.equinox.ds","1","true"));
		l.add(new PluginLaunchDef("org.eclipse.equinox.event"));
		l.add(new PluginLaunchDef("org.eclipse.equinox.preferences"));
		l.add(new PluginLaunchDef("org.eclipse.equinox.registry"));
		l.add(new PluginLaunchDef("org.eclipse.equinox.util"));
		l.add(new PluginLaunchDef("org.eclipse.jdt.junit.runtime"));
		l.add(new PluginLaunchDef("org.eclipse.jdt.junit4.runtime"));
		l.add(new PluginLaunchDef("org.eclipse.osgi.services"));
		l.add(new PluginLaunchDef("org.eclipse.pde.junit.runtime"));
		l.add(new PluginLaunchDef("org.hamcrest.core"));
		l.add(new PluginLaunchDef("org.jemmy.fx.repackaged"));
		l.add(new PluginLaunchDef("org.junit*4.10.0.v4_10_0_v20120426-0900"));
		l.add(new PluginLaunchDef("org.junit4"));

		return l;
	}
	
	public static Collection<PluginLaunchDef> getTargetPluginsE4() {
		Set<PluginLaunchDef> l = new HashSet<PluginLaunchDef>();
		l.addAll(getTargetPluginsOSGi());
		l.add(new PluginLaunchDef("at.bestsolution.efxclipse.runtime.application"));
		l.add(new PluginLaunchDef("at.bestsolution.efxclipse.runtime.bindings.e4"));
		l.add(new PluginLaunchDef("at.bestsolution.efxclipse.runtime.bindings.generic"));
		l.add(new PluginLaunchDef("at.bestsolution.efxclipse.runtime.bindings"));
		l.add(new PluginLaunchDef("at.bestsolution.efxclipse.runtime.databinding"));
		l.add(new PluginLaunchDef("at.bestsolution.efxclipse.runtime.di"));
		l.add(new PluginLaunchDef("at.bestsolution.efxclipse.runtime.dialogs"));
		l.add(new PluginLaunchDef("at.bestsolution.efxclipse.runtime.javafx"));
		l.add(new PluginLaunchDef("at.bestsolution.efxclipse.runtime.jemmy"));
		l.add(new PluginLaunchDef("at.bestsolution.efxclipse.runtime.osgi.util"));
		l.add(new PluginLaunchDef("at.bestsolution.efxclipse.runtime.osgi","default","false"));
		l.add(new PluginLaunchDef("at.bestsolution.efxclipse.runtime.panels"));
		l.add(new PluginLaunchDef("at.bestsolution.efxclipse.runtime.services"));
		l.add(new PluginLaunchDef("at.bestsolution.efxclipse.runtime.theme"));
		l.add(new PluginLaunchDef("at.bestsolution.efxclipse.runtime.workbench.base"));
		l.add(new PluginLaunchDef("at.bestsolution.efxclipse.runtime.workbench.fx"));
		l.add(new PluginLaunchDef("at.bestsolution.efxclipse.runtime.workbench.renderers.base"));
		l.add(new PluginLaunchDef("at.bestsolution.efxclipse.runtime.workbench.renderers.fx"));
		
		return l;
	}
}
