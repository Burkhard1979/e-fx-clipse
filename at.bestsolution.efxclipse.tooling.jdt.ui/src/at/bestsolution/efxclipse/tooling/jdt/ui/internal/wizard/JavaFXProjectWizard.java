package at.bestsolution.efxclipse.tooling.jdt.ui.internal.wizard;

import org.eclipse.jdt.internal.ui.wizards.JavaProjectWizard;
import org.eclipse.jdt.internal.ui.wizards.NewElementWizard;
import org.eclipse.jdt.internal.ui.wizards.NewWizardMessages;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IProgressMonitor;

import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkingSet;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

import org.eclipse.jdt.core.IJavaElement;

import org.eclipse.jdt.ui.IPackagesViewPart;
import org.eclipse.jdt.ui.wizards.NewJavaProjectWizardPageOne;

import org.eclipse.jdt.internal.ui.JavaPlugin;
import org.eclipse.jdt.internal.ui.JavaPluginImages;
import org.eclipse.jdt.internal.ui.packageview.PackageExplorerPart;
import org.eclipse.jdt.internal.ui.util.ExceptionHandler;

public class JavaFXProjectWizard extends NewElementWizard implements IExecutableExtension {

	private NewJavaProjectWizardPageOne fFirstPage;
	private NewJavaFXProjectWizardPageTwo fSecondPage;

	private IConfigurationElement fConfigElement;

	public JavaFXProjectWizard() {
		this(null, null);
	}

	public JavaFXProjectWizard(NewJavaProjectWizardPageOne pageOne, NewJavaFXProjectWizardPageTwo pageTwo) {
		setDefaultPageImageDescriptor(JavaPluginImages.DESC_WIZBAN_NEWJPRJ);
		setDialogSettings(JavaPlugin.getDefault().getDialogSettings());
		setWindowTitle(NewWizardMessages.JavaProjectWizard_title);

		fFirstPage= pageOne;
		fSecondPage= pageTwo;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
	public void addPages() {
		if (fFirstPage == null)
			fFirstPage= new NewJavaProjectWizardPageOne();
		addPage(fFirstPage);

		if (fSecondPage == null)
			fSecondPage= new NewJavaFXProjectWizardPageTwo(fFirstPage);
		addPage(fSecondPage);

		fFirstPage.init(getSelection(), getActivePart());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jdt.internal.ui.wizards.NewElementWizard#finishPage(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	protected void finishPage(IProgressMonitor monitor) throws InterruptedException, CoreException {
		fSecondPage.performFinish(monitor); // use the full progress monitor
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.IWizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		boolean res= super.performFinish();
		if (res) {
			final IJavaElement newElement= getCreatedElement();

			IWorkingSet[] workingSets= fFirstPage.getWorkingSets();
			if (workingSets.length > 0) {
				PlatformUI.getWorkbench().getWorkingSetManager().addToWorkingSets(newElement, workingSets);
			}

			BasicNewProjectResourceWizard.updatePerspective(fConfigElement);
			selectAndReveal(fSecondPage.getJavaProject().getProject());

			Display.getDefault().asyncExec(new Runnable() {
				public void run() {
					IWorkbenchPart activePart= getActivePart();
					if (activePart instanceof IPackagesViewPart) {
						PackageExplorerPart view= PackageExplorerPart.openInActivePerspective();
						view.tryToReveal(newElement);
					}
				}
			});
		}
		return res;
	}

	private IWorkbenchPart getActivePart() {
		IWorkbenchWindow activeWindow= getWorkbench().getActiveWorkbenchWindow();
		if (activeWindow != null) {
			IWorkbenchPage activePage= activeWindow.getActivePage();
			if (activePage != null) {
				return activePage.getActivePart();
			}
		}
		return null;
	}

	@Override
	protected void handleFinishException(Shell shell, InvocationTargetException e) {
		String title= NewWizardMessages.JavaProjectWizard_op_error_title;
		String message= NewWizardMessages.JavaProjectWizard_op_error_create_message;
		ExceptionHandler.handle(e, getShell(), title, message);
	}

	/*
	 * Stores the configuration element for the wizard.  The config element will be used
	 * in <code>performFinish</code> to set the result perspective.
	 */
	public void setInitializationData(IConfigurationElement cfig, String propertyName, Object data) {
		fConfigElement= cfig;
	}

	/* (non-Javadoc)
	 * @see IWizard#performCancel()
	 */
	@Override
	public boolean performCancel() {
		fSecondPage.performCancel();
		return super.performCancel();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jdt.internal.ui.wizards.NewElementWizard#getCreatedElement()
	 */
	@Override
	public IJavaElement getCreatedElement() {
		return fSecondPage.getJavaProject();
	}
}
