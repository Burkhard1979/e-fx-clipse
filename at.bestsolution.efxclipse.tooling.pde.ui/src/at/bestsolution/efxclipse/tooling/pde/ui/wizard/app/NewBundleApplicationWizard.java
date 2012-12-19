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
package at.bestsolution.efxclipse.tooling.pde.ui.wizard.app;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import at.bestsolution.efxclipse.tooling.pde.ui.wizard.BundleConfigurationPage;
import at.bestsolution.efxclipse.tooling.pde.ui.wizard.BundleProjectPage;

public class NewBundleApplicationWizard extends Wizard implements INewWizard {
	private IStructuredSelection selection;
	private AppBundleProjectData data;
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
		this.data = new AppBundleProjectData();
	}

	@Override
	public void addPages() {
		super.addPages();
		addPage(new BundleProjectPage(data,"project.page", selection,"New FX-OSGi application"));
		addPage(new BundleConfigurationPage(data,"bundle.page","New FX-OSGi application"));
		addPage(new GeneratorConfigurationPage(data, "generator.page","New FX-OSGi application"));
	}
	
	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		return false;
	}

}
