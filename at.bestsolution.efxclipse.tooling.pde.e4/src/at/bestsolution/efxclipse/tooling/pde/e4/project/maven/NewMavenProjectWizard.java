package at.bestsolution.efxclipse.tooling.pde.e4.project.maven;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.util.EcoreUtil;
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
import org.osgi.framework.Version;

import at.bestsolution.efxclipse.tooling.pde.e4.project.PluginContentPage;
import at.bestsolution.efxclipse.tooling.pde.e4.project.template.ApplicationE4XMI;
import at.bestsolution.efxclipse.tooling.pde.e4.project.template.E4LaunchDef;
import at.bestsolution.efxclipse.tooling.pde.e4.project.template.LaunchGenerator;
import at.bestsolution.efxclipse.tooling.pde.e4.project.template.NativeLaunchData;
import at.bestsolution.efxclipse.tooling.pde.e4.project.template.NativeLaunchGenerator;
import at.bestsolution.efxclipse.tooling.pde.e4.project.template.SampleTestCaseGenerator;
import at.bestsolution.efxclipse.tooling.pde.e4.project.template.TestSuiteGenerator;
import at.bestsolution.efxclipse.tooling.pde.ui.templates.JemmyLaunch;
import at.bestsolution.efxclipse.tooling.pde.ui.templates.JemmyLaunchDef;
import at.bestsolution.efxclipse.tooling.pde.ui.templates.PluginLaunchDef;
import at.bestsolution.efxclipse.tooling.pde.ui.templates.tycho.FeaturePomGenerator;
import at.bestsolution.efxclipse.tooling.pde.ui.templates.tycho.JemmyPomData;
import at.bestsolution.efxclipse.tooling.pde.ui.templates.tycho.JemmyPomGenerator;
import at.bestsolution.efxclipse.tooling.pde.ui.templates.tycho.PluginPomGenerator;
import at.bestsolution.efxclipse.tooling.pde.ui.templates.tycho.PomData;
import at.bestsolution.efxclipse.tooling.pde.ui.templates.tycho.ProductPomGenerator;
import at.bestsolution.efxclipse.tooling.pde.ui.templates.tycho.Repository;
import at.bestsolution.efxclipse.tooling.pde.ui.templates.tycho.RootPomData;
import at.bestsolution.efxclipse.tooling.pde.ui.templates.tycho.RootPomGenerator;
import at.bestsolution.efxclipse.tooling.rrobot.RRobot;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BuildProperties;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundleFactory;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundleProject;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.Element;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.Extension;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.FeatureFile;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.FeaturePlugin;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.FeatureProject;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ImportedPackage;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ManifestFile;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.PluginXMLFile;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ProductFeature;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ProductFileFeaturebase;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ProductStartConfig;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.RequiredBundle;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.DataFile;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.Folder;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.Project;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.RobotTask;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.TaskFactory;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.URLFile;
import at.bestsolution.efxclipse.tooling.rrobot.model.util.ExtensionFactory;

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
			
			final RobotTask task = TaskFactory.eINSTANCE.createRobotTask();
			
			task.getProjects().add(
					createBundleProject(
							projectPage.getProjectName(),
							contentPage.getData().getId(),
							((AbstractFieldData)contentPage.getData()).getExecutionEnvironment(),
							contentPage.getData().getVersion(),
							configPage.getProductName(),
							configPage.isMavenTycho()
					)
			);
			
			FeatureProject featureProject = createFeatureProject(
					projectPage.getProjectName(),
					contentPage.getData().getId(),
					configPage.getProductName(),
					contentPage.getData().getVersion(),
					contentPage.getData().getProvider(),
					configPage.useIcuBase(),
					configPage.hasConsoleSupport(),
					configPage.isJemmyTest()
			);
			task.getProjects().add(featureProject);
			
			task.getProjects().add(
					createProductProject(
							projectPage.getProjectName(),
							contentPage.getId(),
							featureProject,
							configPage.getProductName(),
							contentPage.getData().getVersion(),
							configPage.isMavenTycho()
					)
			);
			
			if(configPage.isJemmyTest()) {
				task.getProjects().add(
						createJemmyProject(
								projectPage.getProjectName(),
								configPage.getProductName(),
								contentPage.getData().getId(),
								contentPage.getData().getVersion(),
								((AbstractFieldData)contentPage.getData()).getExecutionEnvironment(),
								featureProject,
								configPage.isMavenTycho()
						)
				);
			}
			
			if(configPage.isMavenTycho()) {
				task.getProjects().add(
						createRelengProject(
								configPage.getProductName(), 
								contentPage.getData().getId(), 
								projectPage.getProjectName(),
								contentPage.getData().getVersion(),
								((AbstractFieldData)contentPage.getData()).getProvider(),
								configPage.isNativePackageing())
				);
			}
			
			WorkspaceModifyOperation w = new WorkspaceModifyOperation() {
				
				@Override
				protected void execute(IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException {
					r.executeTask(monitor, task, new HashMap<String, Object>());
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
	
	private static Project createRelengProject(String productName, String symbolicName, String projectName, String version, String vendorName, boolean nativeBuild) {
		Project p = TaskFactory.eINSTANCE.createProject();
		p.setName(projectName+".releng");
		
		{
			DataFile f = TaskFactory.eINSTANCE.createDataFile();
			f.setName("pom.xml");
			
			List<String> modules = new ArrayList<String>();
			modules.add("../"+projectName);
			modules.add("../"+projectName+".feature");
			modules.add("../"+projectName+".product");
			modules.add("../"+projectName+".jemmy");
			
			List<Repository> repos = new ArrayList<Repository>();
			repos.add(new Repository("juno", "http://download.eclipse.org/releases/juno"));
			repos.add(new Repository("efxclipse-repo", "http://www.efxclipse.org/p2-repos/nightly/site/"));
			
			RootPomData data = new RootPomData(
					productName + " - jemmy junit",
					toPomGroupId(symbolicName), 
					symbolicName+".releng", 
					null, null, null, null,toPomVersion(version),"0.16.0","4.8.1","1.8.4","4.2","0.1.1","2.2.0-SNAPSHOT",modules,repos); //FIXME Versions based on release!!!
			
			f.setContent(new RootPomGenerator().generate(data).toString().getBytes());			
			p.getResources().add(f);			
		}

		
		if( nativeBuild ) {
			{
				DataFile f = TaskFactory.eINSTANCE.createDataFile();
				f.setName("build.xml");
				
				String osArch = System.getProperty("osgi.os")+"."+System.getProperty("osgi.ws")+"."+System.getProperty("osgi.arch");
				NativeLaunchData data = new NativeLaunchData("../"+projectName+".product/target/"+osArch+"/eclipse", productName, vendorName);
				NativeLaunchGenerator gen = new NativeLaunchGenerator();
				f.setContent(gen.generate(data).toString().getBytes());
				p.getResources().add(f);
					
			}
			
			{
				URLFile f  = TaskFactory.eINSTANCE.createURLFile();
				f.setUri("platform:/plugin/at.bestsolution.efxclipse.tooling.pde.e4/build_bin/at.bestsolution.efxclipse.tooling.build-0.0.1.jar");
				f.setName("at.bestsolution.efxclipse.tooling.build-0.0.1.jar");
				p.getResources().add(f);
			}
			
			{
				URLFile f  = TaskFactory.eINSTANCE.createURLFile();
				f.setUri("platform:/plugin/at.bestsolution.efxclipse.tooling.pde.e4/build_bin/fx-osgi-launch.jar");
				f.setName("fx-osgi-launch.jar");
				p.getResources().add(f);
			}
		}
		
		return p;
	}
	
	private static Project createBundleProject(String projectName, String symbolicName, String executionEnv, String version, String productName, boolean mavenSupport) {
		BundleProject p = BundleFactory.eINSTANCE.createBundleProject();
		p.setName(projectName);
		
		{
			ManifestFile f = BundleFactory.eINSTANCE.createManifestFile();
			f.setBundlename("Application Bundle");
			f.setSymbolicname(symbolicName);
			f.setExecutionEnvironment(executionEnv);
			f.setVersion(version);
			
			f.getRequiredBundles().add(createBundle("at.bestsolution.efxclipse.runtime.application",null));
			f.getRequiredBundles().add(createBundle("at.bestsolution.efxclipse.runtime.workbench.fx",null));
			f.getRequiredBundles().add(createBundle("org.eclipse.e4.ui.model.workbench",null));
			f.getRequiredBundles().add(createBundle("org.eclipse.e4.core.services",null));
			f.getRequiredBundles().add(createBundle("org.eclipse.e4.core.di",null));
			f.getRequiredBundles().add(createBundle("org.eclipse.e4.ui.di",null));
			f.getRequiredBundles().add(createBundle("org.eclipse.e4.core.di.extensions",null));
			f.getRequiredBundles().add(createBundle("at.bestsolution.efxclipse.runtime.theme",null));
			f.getRequiredBundles().add(createBundle("at.bestsolution.efxclipse.runtime.di",null));
			f.getRequiredBundles().add(createBundle("org.eclipse.e4.core.contexts",null));
			f.getRequiredBundles().add(createBundle("at.bestsolution.efxclipse.runtime.databinding",null));
			f.getRequiredBundles().add(createBundle("org.eclipse.core.databinding",null));
			f.getRequiredBundles().add(createBundle("org.eclipse.core.databinding.observable",null));
			f.getRequiredBundles().add(createBundle("org.eclipse.core.databinding.property",null));
			f.getRequiredBundles().add(createBundle("org.eclipse.e4.ui.workbench",null));
			f.getRequiredBundles().add(createBundle("org.eclipse.equinox.common",null));
			f.getRequiredBundles().add(createBundle("org.eclipse.e4.ui.services",null));
			
			f.getImportedPackages().add(createImport("javax.inject", "1.0.0"));
			f.getImportedPackages().add(createImport("javax.annotation", "1.0.0"));
			f.getImportedPackages().add(createImport("javafx.animation", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.application", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.beans", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.beans.binding", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.beans.property", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.beans.value", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.collections", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.concurrent", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.event", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.fxml", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.geometry", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.scene", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.scene.chart", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.scene.control", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.scene.control.cell", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.scene.effect", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.scene.image", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.scene.input", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.scene.layout", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.scene.media", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.scene.paint", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.scene.shape", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.scene.text", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.scene.transform", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.scene.web", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.stage", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.util", "2.0.0"));
			
			p.setManifest(f);
		}
		
		{
			PluginXMLFile f = BundleFactory.eINSTANCE.createPluginXMLFile();
			
			{
				Extension ext = BundleFactory.eINSTANCE.createExtension();
				ext.setId("product");
				ext.setPoint("org.eclipse.core.runtime.products");
				
				Element productElement = ExtensionFactory.Product.create_Product_Element(ext, productName, 
						"at.bestsolution.efxclipse.runtime.workbench.fx.application");
				ExtensionFactory.Product.create_Property_Element(productElement, "appName", productName); 
				ExtensionFactory.Product.create_Property_Element(productElement, "applicationXMI", symbolicName +"/Application.e4xmi");
				ExtensionFactory.Product.create_Property_Element(productElement, "cssTheme", "theme.default");
				
				f.getExtensions().add(ext);
			}
			
			{
				Extension ext = BundleFactory.eINSTANCE.createExtension();
				ext.setPoint("at.bestsolution.efxclipse.runtime.theme");
				ExtensionFactory.FXTheme.create_Theme_Element(ext, "theme.default", "css/default.css");
				
				f.getExtensions().add(ext);
			}
			
			p.setPluginxml(f);
		}

		Folder cssFolder;
		{
			cssFolder = TaskFactory.eINSTANCE.createFolder();
			cssFolder.setName("css");
			
			DataFile file = TaskFactory.eINSTANCE.createDataFile();
			file.setName("default.css");
			file.setContent("/* Main CSS-File */".getBytes());
			
			cssFolder.getChildren().add(file);
			
			p.getResources().add(cssFolder);
		}
		
		DataFile appxmi;
		{
			appxmi = TaskFactory.eINSTANCE.createDataFile();
			appxmi.setName("Application.e4xmi");
			appxmi.setContent(new ApplicationE4XMI().generateContent(EcoreUtil.generateUUID()).toString().getBytes());
			p.getResources().add(appxmi);
		}
		
		{
			BuildProperties f = BundleFactory.eINSTANCE.createBuildProperties();
			f.getBinIncludes().add(cssFolder);
			f.getBinIncludes().add(appxmi);
			p.setBuildProperties(f);
		}
		
		if( mavenSupport ) {
			DataFile f = TaskFactory.eINSTANCE.createDataFile();
			f.setName("pom.xml");
			f.setContent(new PluginPomGenerator().generate(
					new PomData(productName + " - application bundle", toPomGroupId(symbolicName), symbolicName, toPomGroupId(symbolicName), symbolicName+".releng", toPomVersion(version), "../"+projectName+".releng")
			).toString().getBytes());
			p.getResources().add(f);
		}
		
		return p;
	} 
	
	private static final String toPomGroupId(String symbolicName) {
		if( symbolicName.indexOf('.') != -1 ) {
			return symbolicName.substring(0,symbolicName.lastIndexOf('.'));	
		}
		return symbolicName;
	}
	
	private static final String toPomVersion(String version) {
		return version.replace(".qualifier", "-SNAPSHOT");
	}
	
	private static FeatureProject createFeatureProject(String projectName, String symbolicName, String productName, String version, String provider,boolean icuBase,boolean consoleSupport, boolean mavenSupport) 
	{
		FeatureProject p = BundleFactory.eINSTANCE.createFeatureProject();
		p.setName(projectName+".feature");
		
		{
			FeatureFile featureFile = BundleFactory.eINSTANCE.createFeatureFile(); 
			featureFile.setFeatureid(symbolicName+".feature");
			featureFile.setFeaturename(productName+ " feature");
			featureFile.setVersion(version);
			featureFile.setVendor(provider);
			featureFile.getPlugins().add(createFeaturePlugin(symbolicName));
			featureFile.getPlugins().add(createFeaturePlugin("at.bestsolution.efxclipse.runtime.application"));
			featureFile.getPlugins().add(createFeaturePlugin("at.bestsolution.efxclipse.runtime.bindings"));
			featureFile.getPlugins().add(createFeaturePlugin("at.bestsolution.efxclipse.runtime.bindings.e4"));
			featureFile.getPlugins().add(createFeaturePlugin("at.bestsolution.efxclipse.runtime.bindings.generic"));
			featureFile.getPlugins().add(createFeaturePlugin("at.bestsolution.efxclipse.runtime.databinding"));
			featureFile.getPlugins().add(createFeaturePlugin("at.bestsolution.efxclipse.runtime.core"));
			featureFile.getPlugins().add(createFeaturePlugin("at.bestsolution.efxclipse.runtime.di"));
			featureFile.getPlugins().add(createFeaturePlugin("at.bestsolution.efxclipse.runtime.dialogs"));
			featureFile.getPlugins().add(createFeaturePlugin("at.bestsolution.efxclipse.runtime.javafx"));
			featureFile.getPlugins().add(createFeatureFragment("at.bestsolution.efxclipse.runtime.osgi"));
			featureFile.getPlugins().add(createFeaturePlugin("at.bestsolution.efxclipse.runtime.osgi.util"));
			featureFile.getPlugins().add(createFeaturePlugin("at.bestsolution.efxclipse.runtime.panels"));
			featureFile.getPlugins().add(createFeaturePlugin("at.bestsolution.efxclipse.runtime.services"));
			featureFile.getPlugins().add(createFeaturePlugin("at.bestsolution.efxclipse.runtime.theme"));
			featureFile.getPlugins().add(createFeaturePlugin("at.bestsolution.efxclipse.runtime.workbench.base"));
			featureFile.getPlugins().add(createFeaturePlugin("at.bestsolution.efxclipse.runtime.workbench.fx"));
			featureFile.getPlugins().add(createFeaturePlugin("at.bestsolution.efxclipse.runtime.workbench.fx.controls"));
			featureFile.getPlugins().add(createFeaturePlugin("at.bestsolution.efxclipse.runtime.workbench.renderers.base"));
			featureFile.getPlugins().add(createFeaturePlugin("at.bestsolution.efxclipse.runtime.workbench.renderers.fx"));
			if( icuBase ) {
				featureFile.getPlugins().add(createFeaturePlugin("com.ibm.icu.base"));						
			} else {
				featureFile.getPlugins().add(createFeaturePlugin("com.ibm.icu")); 	
			}					
			featureFile.getPlugins().add(createFeaturePlugin("javax.annotation"));
			featureFile.getPlugins().add(createFeaturePlugin("javax.inject"));
			featureFile.getPlugins().add(createFeaturePlugin("javax.xml"));
			featureFile.getPlugins().add(createFeaturePlugin("org.apache.commons.logging"));
			featureFile.getPlugins().add(createFeaturePlugin("org.eclipse.core.commands"));
			featureFile.getPlugins().add(createFeaturePlugin("org.eclipse.core.contenttype"));
			featureFile.getPlugins().add(createFeaturePlugin("org.eclipse.core.databinding"));
			featureFile.getPlugins().add(createFeaturePlugin("org.eclipse.core.databinding.observable"));
			featureFile.getPlugins().add(createFeaturePlugin("org.eclipse.core.databinding.property"));
			featureFile.getPlugins().add(createFeaturePlugin("org.eclipse.core.expressions"));
			featureFile.getPlugins().add(createFeaturePlugin("org.eclipse.core.filesystem"));
			featureFile.getPlugins().add(createFeaturePlugin("org.eclipse.core.jobs"));
			featureFile.getPlugins().add(createFeaturePlugin("org.eclipse.core.resources"));
			featureFile.getPlugins().add(createFeaturePlugin("org.eclipse.core.runtime"));
			featureFile.getPlugins().add(createFeatureFragment("org.eclipse.core.runtime.compatibility.registry"));
			featureFile.getPlugins().add(createFeaturePlugin("org.eclipse.e4.core.commands"));
			featureFile.getPlugins().add(createFeaturePlugin("org.eclipse.e4.core.contexts"));
			featureFile.getPlugins().add(createFeaturePlugin("org.eclipse.e4.core.di"));
			featureFile.getPlugins().add(createFeaturePlugin("org.eclipse.e4.core.di.extensions"));
			featureFile.getPlugins().add(createFeaturePlugin("org.eclipse.e4.core.services"));
			featureFile.getPlugins().add(createFeaturePlugin("org.eclipse.e4.ui.di"));
			featureFile.getPlugins().add(createFeaturePlugin("org.eclipse.e4.ui.model.workbench"));
			featureFile.getPlugins().add(createFeaturePlugin("org.eclipse.e4.ui.services"));
			featureFile.getPlugins().add(createFeaturePlugin("org.eclipse.e4.ui.workbench"));
			featureFile.getPlugins().add(createFeaturePlugin("org.eclipse.emf.common"));
			featureFile.getPlugins().add(createFeaturePlugin("org.eclipse.emf.databinding"));
			featureFile.getPlugins().add(createFeaturePlugin("org.eclipse.emf.ecore"));
			featureFile.getPlugins().add(createFeaturePlugin("org.eclipse.emf.ecore.change"));
			featureFile.getPlugins().add(createFeaturePlugin("org.eclipse.emf.ecore.xmi"));
			featureFile.getPlugins().add(createFeaturePlugin("org.eclipse.equinox.app"));
			featureFile.getPlugins().add(createFeaturePlugin("org.eclipse.equinox.common"));
			featureFile.getPlugins().add(createFeaturePlugin("org.eclipse.equinox.concurrent"));
			featureFile.getPlugins().add(createFeaturePlugin("org.eclipse.equinox.ds"));
			featureFile.getPlugins().add(createFeaturePlugin("org.eclipse.equinox.event"));
			featureFile.getPlugins().add(createFeaturePlugin("org.eclipse.equinox.preferences"));
			featureFile.getPlugins().add(createFeaturePlugin("org.eclipse.equinox.registry"));
			featureFile.getPlugins().add(createFeaturePlugin("org.eclipse.equinox.util"));
			featureFile.getPlugins().add(createFeaturePlugin("org.eclipse.osgi"));
			featureFile.getPlugins().add(createFeaturePlugin("org.eclipse.osgi.services"));
			
			if( consoleSupport ) {
				featureFile.getPlugins().add(createFeaturePlugin("org.eclipse.equinox.console"));
				featureFile.getPlugins().add(createFeaturePlugin("org.apache.felix.gogo.command"));
				featureFile.getPlugins().add(createFeaturePlugin("org.apache.felix.gogo.runtime"));
				featureFile.getPlugins().add(createFeaturePlugin("org.apache.felix.gogo.shell"));	
			}
			
			p.setFeature(featureFile);					
		}

		{
			DataFile f = TaskFactory.eINSTANCE.createDataFile();
			f.setName("build.properties");
			f.setContent("bin.includes = feature.xml".getBytes());
			p.getResources().add(f);
		}
		
		if( mavenSupport ) {
			DataFile f = TaskFactory.eINSTANCE.createDataFile();
			f.setName("pom.xml");
			f.setContent(new FeaturePomGenerator().generate(
					new PomData(productName + " - application feature", toPomGroupId(symbolicName), symbolicName+".feature", toPomGroupId(symbolicName), symbolicName+".releng", toPomVersion(version), "../"+projectName+".releng")
			).toString().getBytes());
			p.getResources().add(f);
		}
		
		return p;
	}
	
	private static Project createProductProject(String projectName, String symbolicName, FeatureProject featureProject, String productName, String version, boolean mavenSupport) {
		Project p = TaskFactory.eINSTANCE.createProject();
		p.setName(projectName+".product");
		
		{
			DataFile f = TaskFactory.eINSTANCE.createDataFile();
			f.setName(symbolicName+".product.launch");
			E4LaunchDef launchDef = new E4LaunchDef();
			launchDef.setProjectName(projectName);
			
			for( FeaturePlugin fp : featureProject.getFeature().getPlugins() ) {
				if(symbolicName.equals(fp.getId())) {
					continue;
				} else if( "org.eclipse.core.runtime.compatibility.registry".equals(fp.getId()) ) {
					launchDef.getTargetPlugins().add(new PluginLaunchDef(fp.getId(),"default","false"));
				} else if("org.eclipse.core.runtime".equals(fp.getId())) {
					launchDef.getTargetPlugins().add(new PluginLaunchDef(fp.getId(),"default","true"));
				} else if("org.eclipse.equinox.common".equals(fp.getId())) {
					launchDef.getTargetPlugins().add(new PluginLaunchDef(fp.getId(),"2","true"));
				} else if("org.eclipse.equinox.ds".equals(fp.getId())) {
					launchDef.getTargetPlugins().add(new PluginLaunchDef(fp.getId(),"1","true"));
				} else if("org.eclipse.osgi".equals(fp.getId())) {
					launchDef.getTargetPlugins().add(new PluginLaunchDef(fp.getId(),"-1","true"));
				} else {
					launchDef.getTargetPlugins().add(new PluginLaunchDef(fp.getId()));	
				}
			}
			
			launchDef.getWorkbenchPlugins().add(new PluginLaunchDef(symbolicName));
			
			f.setContent(new LaunchGenerator().generate(launchDef).toString().getBytes());
			p.getResources().add(f);
			
		}
		
		{
			ProductFileFeaturebase f = BundleFactory.eINSTANCE.createProductFileFeaturebase();
			f.setId(symbolicName+".product");
			f.setName(symbolicName+".product.product");
			f.setProductName(productName);
			f.setApplication("at.bestsolution.efxclipse.runtime.workbench.fx.application");
			f.setVersion(new Version(version)); 
			f.setProgramArgs("-nosplash");
			f.setVmArgs("-Dosgi.framework.extensions=at.bestsolution.efxclipse.runtime.osgi");
			f.getStartconfigurations().add(createStartConfig("org.eclipse.core.runtime", true, 0));
			f.getStartconfigurations().add(createStartConfig("org.eclipse.equinox.common", true, 2));
			f.getStartconfigurations().add(createStartConfig("org.eclipse.equinox.ds", true, 1));
			f.getStartconfigurations().add(createStartConfig("org.eclipse.osgi", true, -1));
			
			ProductFeature pf = BundleFactory.eINSTANCE.createProductFeature();
			pf.setId(symbolicName+".feature");
			pf.setVersion(new Version(version));
			f.getFeatures().add(pf);
			
			p.getResources().add(f);
		}
		
		if( mavenSupport ) {
			DataFile f = TaskFactory.eINSTANCE.createDataFile();
			f.setName("pom.xml");
			f.setContent(new ProductPomGenerator().generate(
					new PomData(productName + " - product", toPomGroupId(symbolicName), symbolicName+".product", toPomGroupId(symbolicName), symbolicName+".releng", toPomVersion(version), "../"+projectName+".releng")
			).toString().getBytes());
			p.getResources().add(f);
		}
		
		return p;
	}
	
	private static Project createJemmyProject(String projectName, String productName, String symbolicName, String version, String environment, FeatureProject featureProject, boolean mavenSupport) {
		BundleProject p = BundleFactory.eINSTANCE.createBundleProject();
		String bundleName = symbolicName+".jemmy";
		p.setName(projectName+".jemmy");
		
		{
			ManifestFile f = BundleFactory.eINSTANCE.createManifestFile();
			f.getRequiredBundles().add(createBundle("at.bestsolution.efxclipse.runtime.jemmy", null));
			f.getRequiredBundles().add(createBundle("org.junit4", null));
			f.setVersion(version);
			f.setSymbolicname(bundleName);
			f.setExecutionEnvironment(environment);
			
			f.getImportedPackages().add(createImport("javax.inject", "1.0.0"));
			f.getImportedPackages().add(createImport("javax.annotation", "1.0.0"));
			f.getImportedPackages().add(createImport("javafx.animation", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.application", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.beans", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.beans.binding", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.beans.property", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.beans.value", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.collections", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.concurrent", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.event", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.fxml", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.geometry", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.scene", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.scene.chart", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.scene.control", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.scene.control.cell", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.scene.effect", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.scene.image", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.scene.input", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.scene.layout", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.scene.media", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.scene.paint", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.scene.shape", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.scene.text", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.scene.transform", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.scene.web", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.stage", "2.0.0"));
			f.getImportedPackages().add(createImport("javafx.util", "2.0.0"));
			f.getImportedPackages().add(createImport("org.jemmy.action","3.0.0"));
			f.getImportedPackages().add(createImport("org.jemmy.browser","3.0.0"));
			f.getImportedPackages().add(createImport("org.jemmy.control","3.0.0"));
			f.getImportedPackages().add(createImport("org.jemmy.dock","3.0.0"));
			f.getImportedPackages().add(createImport("org.jemmy.env","3.0.0"));
			f.getImportedPackages().add(createImport("org.jemmy.fx","3.0.0"));
			f.getImportedPackages().add(createImport("org.jemmy.fx.control","3.0.0"));
			f.getImportedPackages().add(createImport("org.jemmy.fx.control.caspian","3.0.0"));
			f.getImportedPackages().add(createImport("org.jemmy.image","3.0.0"));
			f.getImportedPackages().add(createImport("org.jemmy.image.pixel","3.0.0"));
			f.getImportedPackages().add(createImport("org.jemmy.input","3.0.0"));
			f.getImportedPackages().add(createImport("org.jemmy.input.glass","3.0.0"));
			f.getImportedPackages().add(createImport("org.jemmy.interfaces","3.0.0"));
			f.getImportedPackages().add(createImport("org.jemmy.lookup","3.0.0"));
			f.getImportedPackages().add(createImport("org.jemmy.operators","3.0.0"));
			f.getImportedPackages().add(createImport("org.jemmy.resources","3.0.0"));
			f.getImportedPackages().add(createImport("org.jemmy.support","3.0.0"));
			f.getImportedPackages().add(createImport("org.jemmy.timing","3.0.0"));
			
			p.setManifest(f);
		}
		
		{
			BuildProperties f = BundleFactory.eINSTANCE.createBuildProperties();
			p.setBuildProperties(f);
		}
		
		{
			DataFile f = TaskFactory.eINSTANCE.createDataFile();
			f.setName(bundleName+".launch");
			JemmyLaunchDef launchDef = new JemmyLaunchDef();
			launchDef.setJunitClassName(bundleName+".TestSuite");
			launchDef.setProjectName(bundleName);
			launchDef.setTestProductId(symbolicName+".product");
			
			for( FeaturePlugin fp : featureProject.getFeature().getPlugins() ) {
				if(symbolicName.equals(fp.getId())) {
					continue;
				} else if( "org.eclipse.core.runtime.compatibility.registry".equals(fp.getId()) ) {
					launchDef.getTargetPlugins().add(new PluginLaunchDef(fp.getId(),"default","false"));
				} else if("org.eclipse.core.runtime".equals(fp.getId())) {
					launchDef.getTargetPlugins().add(new PluginLaunchDef(fp.getId(),"default","true"));
				} else if("org.eclipse.equinox.common".equals(fp.getId())) {
					launchDef.getTargetPlugins().add(new PluginLaunchDef(fp.getId(),"2","true"));
				} else if("org.eclipse.equinox.ds".equals(fp.getId())) {
					launchDef.getTargetPlugins().add(new PluginLaunchDef(fp.getId(),"1","true"));
				} else if("org.eclipse.osgi".equals(fp.getId())) {
					launchDef.getTargetPlugins().add(new PluginLaunchDef(fp.getId(),"-1","true"));
				} else {
					launchDef.getTargetPlugins().add(new PluginLaunchDef(fp.getId()));	
				}
			}
			
			launchDef.getTargetPlugins().add(new PluginLaunchDef("at.bestsolution.efxclipse.runtime.jemmy"));
			launchDef.getTargetPlugins().add(new PluginLaunchDef("org.eclipse.jdt.junit.runtime"));
			launchDef.getTargetPlugins().add(new PluginLaunchDef("org.eclipse.jdt.junit4.runtime"));
			launchDef.getTargetPlugins().add(new PluginLaunchDef("org.eclipse.osgi.services"));
			launchDef.getTargetPlugins().add(new PluginLaunchDef("org.eclipse.pde.junit.runtime"));
			launchDef.getTargetPlugins().add(new PluginLaunchDef("org.hamcrest.core"));
			launchDef.getTargetPlugins().add(new PluginLaunchDef("org.jemmy.fx.repackaged"));
			launchDef.getTargetPlugins().add(new PluginLaunchDef("org.junit*4.10.0.v4_10_0_v20120426-0900"));
			launchDef.getTargetPlugins().add(new PluginLaunchDef("org.junit4"));
			
			launchDef.getWorkbenchPlugins().add(new PluginLaunchDef(symbolicName));
			launchDef.getWorkbenchPlugins().add(new PluginLaunchDef(bundleName));
			
			f.setContent(new JemmyLaunch().generate(launchDef).toString().getBytes());
			p.getResources().add(f);
		}
		
		{
			String[] packages = bundleName.split("\\.");
			Folder folder = TaskFactory.eINSTANCE.createFolder();
			folder.setName(packages[0]);
			Folder tmp = folder;
			
			for( int i = 1; i < packages.length; i++ ) {
				Folder n = TaskFactory.eINSTANCE.createFolder();
				n.setName(packages[i]);
				tmp.getChildren().add(n);
				tmp = n;
			}
			
			{
				DataFile f = TaskFactory.eINSTANCE.createDataFile();
				f.setName("TestSuite.java");
				f.setContent(new TestSuiteGenerator().generate(bundleName).toString().getBytes());
				tmp.getChildren().add(f);						
			}
			
			{
				DataFile f = TaskFactory.eINSTANCE.createDataFile();
				f.setName("SampleTestCase.java");
				f.setContent(new SampleTestCaseGenerator().generate(bundleName).toString().getBytes());
				tmp.getChildren().add(f);						
			}
			
			Folder sourceFolder = TaskFactory.eINSTANCE.createFolder();
			sourceFolder.setName("src");
			sourceFolder.getChildren().add(folder);
			
			p.getResources().add(sourceFolder);
			
			if( mavenSupport ) {
				DataFile f = TaskFactory.eINSTANCE.createDataFile();
				f.setName("pom.xml");
				f.setContent(new JemmyPomGenerator().generate(
						new JemmyPomData(
								productName + " - jemmy junit", toPomGroupId(symbolicName), bundleName, toPomGroupId(symbolicName), symbolicName+".releng", toPomVersion(version), "../"+projectName+".releng",
								bundleName,bundleName+".TestSuite",symbolicName+".product",symbolicName+".feature")
				).toString().getBytes());
				p.getResources().add(f);
			}
		}
		
		return p;
	}
	
	private static RequiredBundle createBundle(String name, String version) {
		RequiredBundle b = BundleFactory.eINSTANCE.createRequiredBundle();
		b.setName(name);
		if( version != null ) {
			b.setMinVersion(new Version(version));	
		}

		return b;
	}
	
	private static ImportedPackage createImport(String name, String version) {
		ImportedPackage b = BundleFactory.eINSTANCE.createImportedPackage();
		b.setName(name);
		if( version != null ) {
			b.setMinVersion(new Version(version));	
		}

		return b;
	}	
	
	private static FeaturePlugin createFeaturePlugin(String name) {
		FeaturePlugin p = BundleFactory.eINSTANCE.createFeaturePlugin();
		p.setId(name);
		return p;
	}
	
	private static FeaturePlugin createFeatureFragment(String name) {
		FeaturePlugin p = BundleFactory.eINSTANCE.createFeaturePlugin();
		p.setId(name);
		p.setFragment(true);
		return p;
	}

	private static ProductStartConfig createStartConfig(String bundlename, boolean autoStart, int startLevel) {
		ProductStartConfig c = BundleFactory.eINSTANCE.createProductStartConfig();
		c.setId(bundlename);
		c.setAutoStart(autoStart);
		c.setStartLevel(startLevel);
		return c;
	}
}
