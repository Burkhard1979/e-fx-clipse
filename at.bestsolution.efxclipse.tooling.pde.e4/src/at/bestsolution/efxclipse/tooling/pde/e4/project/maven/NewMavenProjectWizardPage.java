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
package at.bestsolution.efxclipse.tooling.pde.e4.project.maven;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.pde.internal.ui.wizards.plugin.AbstractFieldData;
import org.eclipse.pde.internal.ui.wizards.plugin.NewProjectCreationPage;
import org.eclipse.swt.widgets.Composite;

@SuppressWarnings("restriction")
public class NewMavenProjectWizardPage extends NewProjectCreationPage  {

	public NewMavenProjectWizardPage(String pageName, AbstractFieldData data, boolean fragment, IStructuredSelection selection) {
		super(pageName, data, fragment, selection);
		setTitle("New e4 JavaFX application"); 
		setMessage("Create an e4 application including product and a maven build structure");
	}
	
	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		fOSGIButton.setSelection(true);
		fEclipseButton.setEnabled(false);
		fEclipseCombo.setEnabled(false);
	}
}
