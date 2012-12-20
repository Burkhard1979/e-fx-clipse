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
package at.bestsolution.efxclipse.tooling.pde.ui.wizard;

import org.eclipse.jdt.ui.PreferenceConstants;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

import at.bestsolution.efxclipse.tooling.pde.ui.wizard.model.BundleProjectData;

public class BundleProjectPage extends WizardNewProjectCreationPage {
	private IStructuredSelection selection;
	private BundleProjectData data;
	
	public BundleProjectPage(BundleProjectData data, String pageName, IStructuredSelection selection, String title) {
		super(pageName);
		this.selection = selection;
		this.data = data;
		setTitle(title);
	}

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		
		Composite control = (Composite) getControl();
		GridLayout layout = new GridLayout();
		control.setLayout(layout);

		createProjectTypeGroup(control);
		createWorkingSetGroup(control, selection, new String[] {"org.eclipse.jdt.ui.JavaWorkingSetPage", //$NON-NLS-1$
				"org.eclipse.pde.ui.pluginWorkingSet", "org.eclipse.ui.resourceWorkingSetPage"}); //$NON-NLS-1$ //$NON-NLS-2$
	}
	
	@Override
	protected boolean validatePage() {
		boolean validate =  super.validatePage();
		data.setProjectname(getProjectName());
		return validate;
	}
	
	protected void createProjectTypeGroup(Composite container) {
		Group group = new Group(container, SWT.NONE);
		group.setText("Project settings");
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		group.setLayout(layout);
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		IPreferenceStore store = PreferenceConstants.getPreferenceStore();
		
		{
			 createLabel(group, "Source folder:");
			Text sourceText = createText(group);
			sourceText.setText(store.getString(PreferenceConstants.SRCBIN_SRCNAME));	
		}
		
		{
			createLabel(group, "Output folder:");
			Text outputText = createText(group);
			outputText.setText(store.getString(PreferenceConstants.SRCBIN_BINNAME));	
		}
	}
	
	private Label createLabel(Composite container, String text) {
		Label label = new Label(container, SWT.NONE);
		label.setText(text);
		GridData gd = new GridData();
		label.setLayoutData(gd);
		return label;
	}
	
	private Text createText(Composite container) {
		Text text = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.widthHint = 300;
		text.setLayoutData(gd);
		text.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				setPageComplete(validatePage());
			}
		});
		return text;
	}
}
