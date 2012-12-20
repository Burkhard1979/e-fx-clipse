package at.bestsolution.efxclipse.tooling.pde.e4.project.maven;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.pde.internal.ui.wizards.IProjectProvider;
import org.eclipse.pde.internal.ui.wizards.NewWizard;
import org.eclipse.pde.internal.ui.wizards.plugin.AbstractFieldData;
import org.eclipse.pde.internal.ui.wizards.plugin.PluginFieldData;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

import at.bestsolution.efxclipse.tooling.pde.e4.project.PluginContentPage;
import at.bestsolution.efxclipse.tooling.rrobot.RRobot;
import at.bestsolution.efxclipse.tooling.rrobot.dsl.FileLoader;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.RobotTask;

@SuppressWarnings("restriction")
public class NewMavenProjectWizard extends NewWizard  {
	private final PluginFieldData pluginData;
	private NewMavenProjectWizardPage projectPage;
	private NewMavenConfigurationPage configPage;
	private PluginContentPage contentPage;
	private IProjectProvider projectProvider;
	
	public NewMavenProjectWizard() {
		this.pluginData = new PluginFieldData();
	}
	
	public void addPages() {
		projectPage = new NewMavenProjectWizardPage("project", pluginData, false, getSelection());
		
		projectProvider = new IProjectProvider() {
			public String getProjectName() {
				return projectPage.getProjectName();
			}

			public IProject getProject() {
				return projectPage.getProjectHandle();
			}

			public IPath getLocationPath() {
				return projectPage.getLocationPath();
			}
		};
		
		contentPage = new PluginContentPage("contentPage", projectProvider, projectPage, pluginData); //$NON-NLS-1$
		configPage = new NewMavenConfigurationPage("config");
		
		addPage(projectPage);
		addPage(contentPage);
		addPage(configPage);
	}
	
	@Override
	public boolean performFinish() {
		try {
			projectPage.updateData();
			contentPage.updateData();
			IDialogSettings settings = getDialogSettings();
			if (settings != null) {
				projectPage.saveSettings(settings);
				contentPage.saveSettings(settings);
			}
			
			
			Bundle b = FrameworkUtil.getBundle(getClass());
			BundleContext ctx = b.getBundleContext();
			ServiceReference<RRobot> ref = ctx.getServiceReference(RRobot.class);
			final RRobot r = ctx.getService(ref);

			FileLoader loader = FileLoader.createLoader();
			final RobotTask task = loader.loadTask(URI.createPlatformPluginURI("/at.bestsolution.efxclipse.tooling.pde.e4/generator-tasks/e4App.rtask", true));

			final Map<String,Object> additionalData = new HashMap<>();
			additionalData.put("BundleProject_projectName", projectPage.getProjectName());
			additionalData.put("BundleProject_bundleId", contentPage.getData().getId());
			additionalData.put("BundleProject_bundleVendor", ((AbstractFieldData)contentPage.getData()).getProvider());
			additionalData.put("BundleProject_productName", configPage.getProductName());
			additionalData.put("BundleProject_bundleVersion", contentPage.getData().getVersion());
			additionalData.put("TychoIntegration", configPage.isMavenTycho());
			additionalData.put("NativeExport", configPage.isNativePackageing());
			
			WorkspaceModifyOperation w = new WorkspaceModifyOperation() {
				
				@Override
				protected void execute(IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException {
					r.executeTask(monitor, task, additionalData);
				}
			};
			
			getContainer().run(true, true,w);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		return super.performFinish();
	}
}
