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

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;

class GeneratorConfigurationPage extends WizardPage {
	private AppBundleProjectData data;
	private Button jemmyButton;
	private Button tychoButton;
	private Button diButton;

	private SelectionListener listener = new SelectionAdapter() {
		@Override
		public void widgetSelected(SelectionEvent e) {
			data.setJemmyTest(jemmyButton.getSelection());
			data.setTychoIntegration(tychoButton.getSelection());
			data.setDiApp(diButton.getSelection());
		}
	};
	
	public GeneratorConfigurationPage(AppBundleProjectData data, String pageName, String title) {
		super(pageName,title,null);
		this.data = data;
		data.setJemmyTest(true);
		data.setTychoIntegration(true);
	}
	
	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new GridLayout());
		
		Group group = new Group(container, SWT.NONE);
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		group.setText("Customizations");
		group.setLayout(new GridLayout(2, false));
		
		{
			createLabel(group, "Jemmy Unittest stubs:");
			jemmyButton = createCheckbox(group, listener);
			jemmyButton.setSelection(true);
		}
		
		{
			createLabel(group, "Tycho Build Stubs:");
			tychoButton = createCheckbox(group, listener);
			tychoButton.setSelection(true);
		}
		
		{
			createLabel(group, "Eclipse DI:");
			diButton = createCheckbox(group, listener);
		}
		
		setControl(container);
	}

	private Button createCheckbox(Composite container, SelectionListener listener) {
		Button b = new Button(container, SWT.CHECK);
		b.addSelectionListener(listener);
		return b;
	}
	
	private Label createLabel(Composite container, String text) {
		Label label = new Label(container, SWT.NONE);
		label.setText(text);
		GridData gd = new GridData();
		label.setLayoutData(gd);
		return label;
	}
}
