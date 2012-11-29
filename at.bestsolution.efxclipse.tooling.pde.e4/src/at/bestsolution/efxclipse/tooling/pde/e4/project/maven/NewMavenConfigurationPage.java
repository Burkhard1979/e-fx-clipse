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

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.pde.internal.core.PluginModelManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class NewMavenConfigurationPage extends WizardPage {

	private Text productName;
	private Button jemmyTest;
	private Button mavenTycho;
	private Button nativePackageing;
	private Button consoleSupport;
	private Button icuBaseSupport;
	
	protected NewMavenConfigurationPage(String pageName) {
		super(pageName);
		setTitle("Setup configuration");
		setMessage("Configure the artifacts the wizard will generate for you");
	}

	@Override
	public boolean isPageComplete() {
		return super.isPageComplete() && !productName.getText().trim().isEmpty();
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new GridLayout(2, false));

		{
			Label l = new Label(container, SWT.NONE);
			l.setText("Product Name");

			productName = new Text(container, SWT.BORDER);
			productName.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			productName.addModifyListener(new ModifyListener() {
				
				@Override
				public void modifyText(ModifyEvent e) {
					setPageComplete(true);
				}
			});
		}
		
		if( PluginModelManager.getInstance().findEntry("com.ibm.icu.base") != null ) {
			Label l = new Label(container, SWT.NONE);
			l.setText("Console Support");

			icuBaseSupport = new Button(container, SWT.CHECK);
			icuBaseSupport.setSelection(true);	
		}

		{
			Label l = new Label(container, SWT.NONE);
			l.setText("Console Support");

			consoleSupport = new Button(container, SWT.CHECK);
			consoleSupport.setSelection(true);
		}
		
		{
			Label l = new Label(container, SWT.NONE);
			l.setText("Jemmy Test plugin");

			jemmyTest = new Button(container, SWT.CHECK);
			jemmyTest.setSelection(true);
		}

		{
			Label l = new Label(container, SWT.NONE);
			l.setText("Maven Tycho");

			mavenTycho = new Button(container, SWT.CHECK);
			mavenTycho.setSelection(true);
			mavenTycho.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					nativePackageing.setEnabled(mavenTycho.getSelection());
				}
			});
		}

		{
			Label l = new Label(container, SWT.NONE);
			l.setText("Native Packaging (javafx packager)");

			nativePackageing = new Button(container, SWT.CHECK);
			nativePackageing.setSelection(true);
		}
		
		setControl(container);
	}

	public boolean isMavenTycho() {
		return mavenTycho.getSelection();
	}
	
	public boolean isNativePackageing() {
		return nativePackageing.getSelection();
	}

	public boolean isJemmyTest() {
		return jemmyTest.getSelection();
	}

	public String getProductName() {
		return productName.getText();
	}
	
	public boolean hasConsoleSupport() {
		return consoleSupport.getSelection();
	}
	
	public boolean useIcuBase() {
		return icuBaseSupport != null && icuBaseSupport.getSelection();
	}
}
