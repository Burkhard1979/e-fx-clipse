package at.bestsolution.efxclipse.tooling.jdt.ui.internal;

import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class JFXWorkbenchPreferencePage extends PreferencePage implements IWorkbenchPreferencePage {

	public JFXWorkbenchPreferencePage() {
	}

	public JFXWorkbenchPreferencePage(String title) {
		super(title);
	}

	public JFXWorkbenchPreferencePage(String title, ImageDescriptor image) {
		super(title, image);
	}

	@Override
	public void init(IWorkbench workbench) {

	}

	@Override
	protected Control createContents(Composite parent) {
		return new Composite(parent, SWT.NONE);
	}

}
