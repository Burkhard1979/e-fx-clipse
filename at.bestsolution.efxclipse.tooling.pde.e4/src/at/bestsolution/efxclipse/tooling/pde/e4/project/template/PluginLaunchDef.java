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

public class PluginLaunchDef {
	private String name;
	private String startLevel;
	private String autoStart;
	
	public PluginLaunchDef(String name) {
		this(name,"default","default");
	}

	public PluginLaunchDef(String name, String startLevel, String autoStart) {
		this.name = name;
		this.startLevel = startLevel;
		this.autoStart = autoStart;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStartLevel() {
		return startLevel;
	}
	public void setStartLevel(String startLevel) {
		this.startLevel = startLevel;
	}
	public String getAutoStart() {
		return autoStart;
	}
	public void setAutoStart(String autoStart) {
		this.autoStart = autoStart;
	}
	
	public static Set<PluginLaunchDef> getTargetPlugins() {
		Set<PluginLaunchDef> set = new HashSet<PluginLaunchDef>();
		set.add(new PluginLaunchDef("at.bestsolution.efxclipse.runtime.application"));
		set.add(new PluginLaunchDef("at.bestsolution.efxclipse.runtime.bindings.e4"));
		set.add(new PluginLaunchDef("at.bestsolution.efxclipse.runtime.bindings.generic"));
		set.add(new PluginLaunchDef("at.bestsolution.efxclipse.runtime.bindings"));
		set.add(new PluginLaunchDef("at.bestsolution.efxclipse.runtime.databinding"));
		set.add(new PluginLaunchDef("at.bestsolution.efxclipse.runtime.di"));
		set.add(new PluginLaunchDef("at.bestsolution.efxclipse.runtime.dialogs"));
		set.add(new PluginLaunchDef("at.bestsolution.efxclipse.runtime.javafx"));
		set.add(new PluginLaunchDef("at.bestsolution.efxclipse.runtime.osgi.util"));
		set.add(new PluginLaunchDef("at.bestsolution.efxclipse.runtime.osgi","default","false"));
		set.add(new PluginLaunchDef("at.bestsolution.efxclipse.runtime.panels"));
		set.add(new PluginLaunchDef("at.bestsolution.efxclipse.runtime.services"));
		set.add(new PluginLaunchDef("at.bestsolution.efxclipse.runtime.theme"));
		set.add(new PluginLaunchDef("at.bestsolution.efxclipse.runtime.workbench.base"));
		set.add(new PluginLaunchDef("at.bestsolution.efxclipse.runtime.workbench.fx"));
		set.add(new PluginLaunchDef("at.bestsolution.efxclipse.runtime.workbench.renderers.base"));
		set.add(new PluginLaunchDef("at.bestsolution.efxclipse.runtime.workbench.renderers.fx"));
		set.add(new PluginLaunchDef("com.ibm.icu"));
		set.add(new PluginLaunchDef("javax.annotation"));
		set.add(new PluginLaunchDef("javax.inject"));
		set.add(new PluginLaunchDef("org.apache.commons.logging"));
		set.add(new PluginLaunchDef("org.eclipse.core.commands"));
		set.add(new PluginLaunchDef("org.eclipse.core.contenttype"));
		set.add(new PluginLaunchDef("org.eclipse.core.databinding.observable"));
		set.add(new PluginLaunchDef("org.eclipse.core.databinding.property"));
		set.add(new PluginLaunchDef("org.eclipse.core.databinding"));
		set.add(new PluginLaunchDef("org.eclipse.core.expressions"));
//		set.add(new PluginLaunchDef("org.eclipse.core.filesystem.macosx","default","false"));
		set.add(new PluginLaunchDef("org.eclipse.core.filesystem"));
		set.add(new PluginLaunchDef("org.eclipse.core.jobs"));
		set.add(new PluginLaunchDef("org.eclipse.core.resources"));
		set.add(new PluginLaunchDef("org.eclipse.core.runtime.compatibility.registry","default","false"));
		set.add(new PluginLaunchDef("org.eclipse.core.runtime","default","true"));
		set.add(new PluginLaunchDef("org.eclipse.e4.core.commands"));
		set.add(new PluginLaunchDef("org.eclipse.e4.core.contexts"));
		set.add(new PluginLaunchDef("org.eclipse.e4.core.di.extensions"));
		set.add(new PluginLaunchDef("org.eclipse.e4.core.di"));
		set.add(new PluginLaunchDef("org.eclipse.e4.core.services"));
		set.add(new PluginLaunchDef("org.eclipse.e4.ui.di"));
		set.add(new PluginLaunchDef("org.eclipse.e4.ui.model.workbench"));
		set.add(new PluginLaunchDef("org.eclipse.e4.ui.services"));
		set.add(new PluginLaunchDef("org.eclipse.e4.ui.workbench"));
		set.add(new PluginLaunchDef("org.eclipse.emf.common"));
		set.add(new PluginLaunchDef("org.eclipse.emf.databinding"));
		set.add(new PluginLaunchDef("org.eclipse.emf.ecore.change"));
		set.add(new PluginLaunchDef("org.eclipse.emf.ecore.xmi"));
		set.add(new PluginLaunchDef("org.eclipse.emf.ecore"));
		set.add(new PluginLaunchDef("org.eclipse.equinox.app"));
		set.add(new PluginLaunchDef("org.eclipse.equinox.common","2","true"));
		set.add(new PluginLaunchDef("org.eclipse.equinox.concurrent"));
		set.add(new PluginLaunchDef("org.eclipse.equinox.ds","1","true"));
		set.add(new PluginLaunchDef("org.eclipse.equinox.event"));
		set.add(new PluginLaunchDef("org.eclipse.equinox.preferences"));
		set.add(new PluginLaunchDef("org.eclipse.equinox.registry"));
		set.add(new PluginLaunchDef("org.eclipse.equinox.util"));
		set.add(new PluginLaunchDef("org.eclipse.osgi.services"));
		set.add(new PluginLaunchDef("org.eclipse.osgi","-1","true"));
		
		
		return set;
	}
	
//	<stringAttribute key="selected_workspace_plugins" value="test.app@default:default"/>

}
