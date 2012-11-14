/*******************************************************************************
 * Copyright (c) 2006, 2012 Soyatec(http://www.soyatec.com) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Soyatec - initial API and implementation
 *     IBM Corporation - ongoing enhancements
 *******************************************************************************/
package at.bestsolution.efxclipse.tooling.pde.e4.project;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.e4.ui.model.application.MAddon;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.MApplicationFactory;
import org.eclipse.e4.ui.model.application.commands.MBindingContext;
import org.eclipse.e4.ui.model.application.commands.MBindingTable;
import org.eclipse.e4.ui.model.application.commands.MCommand;
import org.eclipse.e4.ui.model.application.commands.MCommandsFactory;
import org.eclipse.e4.ui.model.application.commands.MHandler;
import org.eclipse.e4.ui.model.application.commands.MKeyBinding;
import org.eclipse.e4.ui.model.application.ui.basic.MBasicFactory;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainer;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimBar;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimmedWindow;
import org.eclipse.e4.ui.model.application.ui.menu.MHandledToolItem;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuFactory;
import org.eclipse.e4.ui.model.application.ui.menu.MToolBar;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.pde.core.build.IBuildEntry;
import org.eclipse.pde.core.plugin.IPluginBase;
import org.eclipse.pde.core.plugin.IPluginElement;
import org.eclipse.pde.core.plugin.IPluginExtension;
import org.eclipse.pde.core.plugin.IPluginImport;
import org.eclipse.pde.internal.core.ICoreConstants;
import org.eclipse.pde.internal.core.build.WorkspaceBuildModel;
import org.eclipse.pde.internal.core.bundle.WorkspaceBundlePluginModel;
import org.eclipse.pde.internal.core.bundle.WorkspaceBundlePluginModelBase;
import org.eclipse.pde.internal.core.ibundle.IBundle;
import org.eclipse.pde.internal.core.plugin.WorkspacePluginModelBase;
import org.eclipse.pde.internal.core.project.PDEProject;
import org.eclipse.pde.internal.core.util.CoreUtility;
import org.eclipse.pde.internal.ui.PDEPlugin;
import org.eclipse.pde.internal.ui.PDEUIMessages;
import org.eclipse.pde.internal.ui.wizards.IProjectProvider;
import org.eclipse.pde.internal.ui.wizards.plugin.NewPluginProjectWizard;
import org.eclipse.pde.internal.ui.wizards.plugin.NewProjectCreationOperation;
import org.eclipse.pde.internal.ui.wizards.plugin.PluginFieldData;
import org.eclipse.ui.IWorkingSet;
import org.osgi.framework.Bundle;
import org.osgi.framework.Constants;
import org.osgi.framework.Version;

import at.bestsolution.efxclipse.tooling.pde.e4.project.template.E4LaunchDef;
import at.bestsolution.efxclipse.tooling.pde.e4.project.template.LaunchGenerator;
import at.bestsolution.efxclipse.tooling.pde.ui.templates.PluginLaunchDef;

/**
 * @author jin.liu (jin.liu@soyatec.com)
 */
@SuppressWarnings("restriction")
public class E4NewProjectWizard extends NewPluginProjectWizard {

	private PluginFieldData fPluginData;
	private NewApplicationWizardPage fApplicationPage;
	private IProjectProvider fProjectProvider;
	private PluginContentPage fContentPage;

	public E4NewProjectWizard() {
		fPluginData = new PluginFieldData();
	}

	public void addPages() {
		fMainPage = new E4NewProjectWizardPage("main", fPluginData, false, getSelection()); //$NON-NLS-1$
		fMainPage.setTitle(PDEUIMessages.NewProjectWizard_MainPage_title);
		fMainPage.setDescription(PDEUIMessages.NewProjectWizard_MainPage_desc);
		String pname = getDefaultValue(DEF_PROJECT_NAME);
		if (pname != null)
			fMainPage.setInitialProjectName(pname);
		addPage(fMainPage);

		fProjectProvider = new IProjectProvider() {
			public String getProjectName() {
				return fMainPage.getProjectName();
			}

			public IProject getProject() {
				return fMainPage.getProjectHandle();
			}

			public IPath getLocationPath() {
				return fMainPage.getLocationPath();
			}
		};

		fContentPage = new PluginContentPage("page2", fProjectProvider, fMainPage, fPluginData); //$NON-NLS-1$

		fApplicationPage = new NewApplicationWizardPage(fProjectProvider, fPluginData);

		addPage(fContentPage);
		addPage(fApplicationPage);
	}

	public boolean performFinish() {
		try {
			fMainPage.updateData();
			fContentPage.updateData();
			IDialogSettings settings = getDialogSettings();
			if (settings != null) {
				fMainPage.saveSettings(settings);
				fContentPage.saveSettings(settings);
			}
			getContainer().run(false, true, new NewProjectCreationOperation(fPluginData, fProjectProvider, null) {
				private WorkspacePluginModelBase model;

				@Override
				protected void adjustManifests(IProgressMonitor monitor, IProject project, IPluginBase bundle) throws CoreException {
					super.adjustManifests(monitor, project, bundle);
					IPluginBase pluginBase = model.getPluginBase();
					String[] dependencyId = new String[] { 
							"javax.inject", 
							"at.bestsolution.efxclipse.runtime.application", 
							"at.bestsolution.efxclipse.runtime.workbench.fx",
							"org.eclipse.e4.ui.model.workbench", 
							"org.eclipse.e4.core.services", 
							"org.eclipse.e4.core.di", 
							"org.eclipse.e4.ui.di",
							"org.eclipse.e4.core.di.extensions", 
							"at.bestsolution.efxclipse.runtime.theme", 
							"at.bestsolution.efxclipse.runtime.di", 
							"org.eclipse.e4.core.contexts", 
							"at.bestsolution.efxclipse.runtime.databinding", 
							"org.eclipse.core.databinding",
							"org.eclipse.core.databinding.observable", 
							"org.eclipse.core.databinding.property", 
							"org.eclipse.e4.ui.workbench", 
							"org.eclipse.equinox.common", 
							"org.eclipse.e4.ui.services" 
						};
					for (String id : dependencyId) {
						Bundle dependency = Platform.getBundle(id);

						IPluginImport iimport = model.getPluginFactory().createImport();
						iimport.setId(id);
						if (dependency != null) {
							Version version = dependency.getVersion();
							String versionString = version.getMajor() + "." + version.getMinor() + "." + version.getMicro();
							iimport.setVersion(versionString);
						}
						pluginBase.add(iimport);
					}
					
					IBundle iBundle = ((WorkspaceBundlePluginModelBase) model).getBundleModel().getBundle();
					TreeSet<String> imports = new TreeSet<String>(Arrays.asList(getImports()));
					iBundle.setHeader(Constants.IMPORT_PACKAGE, iBundle.getHeader(Constants.IMPORT_PACKAGE) + "," + getCommaValuesFromPackagesSet(imports, "2.0.0"));
				}
				
				@Override
				protected void setPluginLibraries(WorkspacePluginModelBase model) throws CoreException {
					this.model = model;
					super.setPluginLibraries(model);
				}
			});

			IWorkingSet[] workingSets = fMainPage.getSelectedWorkingSets();
			if (workingSets.length > 0)
				getWorkbench().getWorkingSetManager().addToWorkingSets(fProjectProvider.getProject(), workingSets);

			WorkspacePluginModelBase fmodel = new WorkspaceBundlePluginModel(fProjectProvider.getProject().getFile(ICoreConstants.BUNDLE_FILENAME_DESCRIPTOR), fProjectProvider.getProject().getFile(ICoreConstants.PLUGIN_FILENAME_DESCRIPTOR));

			this.createProductsExtension(fmodel);
			this.createThemeExtension(fmodel);

			fmodel.save();

			this.createApplicationResources(fProjectProvider.getProject(), new NullProgressMonitor());
			// Add the product sources
			adjustBuildPropertiesFile(fProjectProvider.getProject());
			return true;
		} catch (InvocationTargetException e) {
			PDEPlugin.logException(e);
		} catch (InterruptedException e) {
		} catch (CoreException e) {
			PDEPlugin.logException(e);
		}
		return false;
	}

	private String[] getImports() {
		return new String[] {
				"javax.annotation;version=\"1.0.0\"",
				"javafx.animation;version=\"2.0.0\"",
				"javafx.application;version=\"2.0.0\"",
				"javafx.beans;version=\"2.0.0\"",
				"javafx.beans.binding;version=\"2.0.0\"",
				"javafx.beans.property;version=\"2.0.0\"",
				"javafx.beans.value;version=\"2.0.0\"",
				"javafx.collections;version=\"2.0.0\"",
				"javafx.concurrent;version=\"2.0.0\"",
				"javafx.embed.swing;version=\"2.0.0\"",
				"javafx.event;version=\"2.0.0\"",
				"javafx.fxml;version=\"2.0.0\"",
				"javafx.geometry;version=\"2.0.0\"",
				"javafx.scene;version=\"2.0.0\"",
				"javafx.scene.chart;version=\"2.0.0\"",
				"javafx.scene.control;version=\"2.0.0\"",
				"javafx.scene.control.cell;version=\"2.0.0\"",
				"javafx.scene.effect;version=\"2.0.0\"",
				"javafx.scene.image;version=\"2.0.0\"",
				"javafx.scene.input;version=\"2.0.0\"",
				"javafx.scene.layout;version=\"2.0.0\"",
				"javafx.scene.media;version=\"2.0.0\"",
				"javafx.scene.paint;version=\"2.0.0\"",
				"javafx.scene.shape;version=\"2.0.0\"",
				"javafx.scene.text;version=\"2.0.0\"",
				"javafx.scene.transform;version=\"2.0.0\"",
				"javafx.scene.web;version=\"2.0.0\"",
				"javafx.stage;version=\"2.0.0\"",
				"javafx.util;version=\"2.0.0\""
			};
	}
	
	private void adjustBuildPropertiesFile(IProject project) throws CoreException {
		IFile file = PDEProject.getBuildProperties(project);
		if (file.exists()) {
			WorkspaceBuildModel model = new WorkspaceBuildModel(file);
			IBuildEntry e = model.getBuild().getEntry(IBuildEntry.BIN_INCLUDES);

			e.addToken("plugin.xml");

			Map<String, String> map = fApplicationPage.getData();
			String cssEntry = map.get(NewApplicationWizardPage.APPLICATION_CSS_PROPERTY);
			if (cssEntry != null) {
				e.addToken(cssEntry);
			}

			String xmiPath = map.get(NewApplicationWizardPage.APPLICATION_XMI_PROPERTY);
			if (xmiPath != null) {
				e.addToken(xmiPath);
			}

			model.save();
		}
	}

	private void createThemeExtension(WorkspacePluginModelBase fmodel) {
		try {
			IPluginExtension extension = fmodel.getFactory().createExtension();
			extension.setPoint("at.bestsolution.efxclipse.runtime.theme");

			IPluginElement themeElement = fmodel.getFactory().createElement(extension);
			themeElement.setName("theme");
			themeElement.setAttribute("basestylesheet", "css/default.css");
			themeElement.setAttribute("id", "default.theme");
			extension.add(themeElement);
			fmodel.getPluginBase().add(extension);

		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * create products extension detail
	 * 
	 * @param project
	 */
	public void createProductsExtension(WorkspacePluginModelBase fmodel) {
		Map<String, String> map = fApplicationPage.getData();
		if (map == null || map.get(NewApplicationWizardPage.PRODUCT_NAME) == null)
			return;

		IPluginExtension extension = fmodel.getFactory().createExtension();
		try {
			String productName = map.get(NewApplicationWizardPage.PRODUCT_NAME);
			String applicationName = map.get(NewApplicationWizardPage.APPLICATION);

			String xmiPath = map.get(NewApplicationWizardPage.APPLICATION_XMI_PROPERTY);
			if (xmiPath != null) {
				xmiPath = productName + "/" + xmiPath;
				map.put(NewApplicationWizardPage.APPLICATION_XMI_PROPERTY, xmiPath);
			}
			String cssValue = map.get(NewApplicationWizardPage.APPLICATION_CSS_PROPERTY);
			if (cssValue != null) {
				cssValue = "platform:/plugin/" + productName + "/" + cssValue;
				map.put(NewApplicationWizardPage.APPLICATION_CSS_PROPERTY, cssValue);
			}

			extension.setPoint("org.eclipse.core.runtime.products");
			extension.setId("product");
			IPluginElement productElement = fmodel.getFactory().createElement(extension);

			productElement.setName("product");
			if (applicationName != null) {
				productElement.setAttribute("application", applicationName);
			} else {
				productElement.setAttribute("application", NewApplicationWizardPage.E4_APPLICATION);
			}
			productElement.setAttribute("name", productName);

			Set<Entry<String, String>> set = map.entrySet();
			if (set != null) {
				Iterator<Entry<String, String>> it = set.iterator();
				if (it != null) {
					while (it.hasNext()) {
						Entry<String, String> entry = it.next();
						String value = entry.getValue();
						if (value == null || value.trim().length() == 0) {
							continue;
						}

						if (entry.getKey().equals(NewApplicationWizardPage.PRODUCT_NAME) || entry.getKey().equals(NewApplicationWizardPage.APPLICATION)) {
							continue;
						}
						IPluginElement element = fmodel.getFactory().createElement(productElement);
						element.setName("property");
						element.setAttribute("name", entry.getKey());
						element.setAttribute("value", value);
						productElement.add(element);
					}
				}
			}
			extension.add(productElement);
			fmodel.getPluginBase().add(extension);
		} catch (CoreException e) {
			PDEPlugin.logException(e);
		}
	}

	/**
	 * create products extension detail
	 * 
	 * @param project
	 */
	public void createApplicationResources(IProject project, IProgressMonitor monitor) {
		Map<String, String> map = fApplicationPage.getData();
		if (map == null || map.get(NewApplicationWizardPage.PRODUCT_NAME) == null)
			return;

		// If the project has invalid characters, the plug-in name would replace
		// them with underscores, product name does the same
		String pluginName = map.get(NewApplicationWizardPage.PRODUCT_NAME);
		String xmiPath = map.get(NewApplicationWizardPage.APPLICATION_XMI_PROPERTY);

		// If there's no Activator created we create default package
		if (!fPluginData.doGenerateClass()) {
			String packageName = fPluginData.getId();
			IPath path = new Path(packageName.replace('.', '/'));
			if (fPluginData.getSourceFolderName().trim().length() > 0)
				path = new Path(fPluginData.getSourceFolderName()).append(path);

			try {
				CoreUtility.createFolder(project.getFolder(path));
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		IJavaProject javaProject = JavaCore.create(project);
		IPackageFragment fragment = null;

		try {
			for (IPackageFragment element : javaProject.getPackageFragments()) {
				if (element.getKind() == IPackageFragmentRoot.K_SOURCE) {
					fragment = element;
				}
			}
		} catch (JavaModelException e1) {
			e1.printStackTrace();
		}

		if (xmiPath != null && xmiPath.trim().length() > 0) {
			// Create a resource set
			//
			ResourceSet resourceSet = new ResourceSetImpl();

			// Get the URI of the model file.
			//
			URI fileURI = URI.createPlatformResourceURI(project.getName() + "/" + xmiPath, true);

			// Create a resource for this file.
			//
			Resource resource = resourceSet.createResource(fileURI);

			MApplication application = MApplicationFactory.INSTANCE.createApplication();

			application.setElementId("org.eclipse.e4.ide.application");

			MAddon addon = MApplicationFactory.INSTANCE.createAddon();
			addon.setElementId("org.eclipse.e4.core.commands.service");
			addon.setContributionURI("bundleclass://org.eclipse.e4.core.commands/org.eclipse.e4.core.commands.CommandServiceAddon");
			application.getAddons().add(addon);

			addon = MApplicationFactory.INSTANCE.createAddon();
			addon.setElementId("org.eclipse.e4.ui.contexts.service");
			addon.setContributionURI("bundleclass://org.eclipse.e4.ui.services/org.eclipse.e4.ui.services.ContextServiceAddon");
			application.getAddons().add(addon);

			addon = MApplicationFactory.INSTANCE.createAddon();
			addon.setElementId("at.bestsolution.efxclipse.runtime.bindings.e4.service");
			addon.setContributionURI("bundleclass://at.bestsolution.efxclipse.runtime.bindings.e4/at.bestsolution.efxclipse.runtime.bindings.e4.BindingServiceAddon");
			application.getAddons().add(addon);

			addon = MApplicationFactory.INSTANCE.createAddon();
			addon.setElementId("org.eclipse.e4.ui.workbench.commands.model");
			addon.setContributionURI("bundleclass://org.eclipse.e4.ui.workbench/org.eclipse.e4.ui.internal.workbench.addons.CommandProcessingAddon");
			application.getAddons().add(addon);

			addon = MApplicationFactory.INSTANCE.createAddon();
			addon.setElementId("org.eclipse.e4.ui.workbench.contexts.model");
			addon.setContributionURI("bundleclass://org.eclipse.e4.ui.workbench/org.eclipse.e4.ui.internal.workbench.addons.ContextProcessingAddon");
			application.getAddons().add(addon);

			addon = MApplicationFactory.INSTANCE.createAddon();
			addon.setElementId("at.bestsolution.efxclipse.runtime.bindings.e4.model");
			addon.setContributionURI("bundleclass://at.bestsolution.efxclipse.runtime.bindings.e4/at.bestsolution.efxclipse.runtime.bindings.e4.BindingProcessingAddon");
			application.getAddons().add(addon);
			
			MBindingContext rootContext = MCommandsFactory.INSTANCE.createBindingContext();
			rootContext.setElementId("org.eclipse.ui.contexts.dialogAndWindow");
			rootContext.setName("In Dialog and Windows");

			MBindingContext childContext = MCommandsFactory.INSTANCE.createBindingContext();
			childContext.setElementId("org.eclipse.ui.contexts.window");
			childContext.setName("In Windows");
			rootContext.getChildren().add(childContext);

			childContext = MCommandsFactory.INSTANCE.createBindingContext();
			childContext.setElementId("org.eclipse.ui.contexts.dialog");
			childContext.setName("In Dialogs");
			rootContext.getChildren().add(childContext);

			application.getRootContext().add(rootContext);
			application.getBindingContexts().add(rootContext);

			resource.getContents().add((EObject) application);

			MCommand openCommand = createCommand("media.open", "openMedia", "OpenHandler", "M1+O", pluginName, fragment, application);
			MCommand refreshCommand = createCommand("media.refresh", "refreshMedia", "RefreshHandler", "M1+R", pluginName, fragment, application);

			MTrimmedWindow mainWindow = MBasicFactory.INSTANCE.createTrimmedWindow();
			mainWindow.setElementId("org.efxclipse.e4.mainWindow");
			mainWindow.getPersistedState().put("fx.stage.decoration", "platform:/plugin/"+pluginName+"/"+fragment.getElementName().replace('.', '/')+"/decoration/TopArea.fxml");
			application.getChildren().add(mainWindow);
			{
				mainWindow.setLabel(pluginName);
				mainWindow.setX(30);
				mainWindow.setY(30);
				mainWindow.setWidth(1024);
				mainWindow.setHeight(768);

				// Top-Sash
				{
					MPartSashContainer sash = MBasicFactory.INSTANCE.createPartSashContainer();
					sash.setHorizontal(true);

					// Create a left part
					{
						MPart part = MBasicFactory.INSTANCE.createPart();
						part.setContributionURI("bundleclass://" + pluginName + "/" + fragment.getElementName() + ".parts.MediaListPart");
						part.setContainerData("0.3");
						sash.getChildren().add(part);
					}

					// Create a right a stack
					{
						MPartStack stack = MBasicFactory.INSTANCE.createPartStack();
						stack.setContainerData("0.7");
						stack.setElementId("content.stack");
						sash.getChildren().add(stack);
					}
					
					mainWindow.getChildren().add(sash);
				}

				// WindowTrim
				{
					MTrimBar trimBar = MBasicFactory.INSTANCE.createTrimBar();
					mainWindow.getTrimBars().add(trimBar);

					MToolBar toolBar = MMenuFactory.INSTANCE.createToolBar();
					toolBar.setElementId("org.efxclipse.e4.maintoolbar");
					trimBar.getChildren().add(toolBar);

					MHandledToolItem toolItemOpen = MMenuFactory.INSTANCE.createHandledToolItem();
					toolBar.getChildren().add(toolItemOpen);
					toolItemOpen.setElementId("org.efxclipse.e4.toolitem.open");
					toolItemOpen.setIconURI("platform:/plugin/" + pluginName + "/icons/edit-image-face-show.png");
					toolItemOpen.setCommand(openCommand);

					MHandledToolItem toolItemSave = MMenuFactory.INSTANCE.createHandledToolItem();
					toolBar.getChildren().add(toolItemSave);
					toolItemSave.setElementId("org.efxclipse.e4.toolitem.save");
					toolItemSave.setIconURI("platform:/plugin/" + pluginName + "/icons/system-reboot.png");
					toolItemSave.setCommand(refreshCommand);
				}
			}
			
			Map<Object, Object> options = new HashMap<Object, Object>();
			options.put(XMLResource.OPTION_ENCODING, "UTF-8");
			try {
				resource.save(options);
			} catch (IOException e) {
				PDEPlugin.logException(e);
			}
		}
		
		IFile f = project.getFile(new Path(project.getName() + ".product.launch"));
		E4LaunchDef def = new E4LaunchDef();
		def.setProjectName(project.getName());
		def.getTargetPlugins().addAll(E4LaunchDef.getE4TargetPlugins());
		def.getWorkbenchPlugins().add(new PluginLaunchDef(project.getName()));
		try {
			ByteArrayInputStream in = new ByteArrayInputStream(new LaunchGenerator().generate(def).toString().getBytes());
			f.create(in, true, monitor);
			in.close();
		} catch (CoreException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String cssPath = map.get(NewApplicationWizardPage.APPLICATION_CSS_PROPERTY);
		if (cssPath != null && cssPath.trim().length() > 0) {
			IFile file = project.getFile(cssPath);

			try {
				prepareFolder(file.getParent(), monitor);

				URL corePath = ResourceLocator.getProjectTemplateFiles("css/default.css");
				file.create(corePath.openStream(), true, monitor);
			} catch (Exception e) {
				PDEPlugin.logException(e);
			}
		}

		String template_id = "common";
		Set<String> binaryExtentions = new HashSet<String>();
		binaryExtentions.add(".gif");
		binaryExtentions.add(".png");
		binaryExtentions.add(".jpg");
		binaryExtentions.add(".flv");

		Map<String, String> keys = new HashMap<String, String>();
		keys.put("projectName", pluginName);
		keys.put("packageName", fragment.getElementName() + ".handlers");
		keys.put("packageName_parts", fragment.getElementName() + ".parts");
		keys.put("packageName_model", fragment.getElementName() + ".model");
		keys.put("packageName_decoration", fragment.getElementName() + ".decoration");

		try {
			URL corePath = ResourceLocator.getProjectTemplateFiles(template_id);
			IRunnableWithProgress op = new TemplateOperation(corePath, project, keys, binaryExtentions);
			getContainer().run(false, true, op);
		} catch (Exception e) {
			PDEPlugin.logException(e);
		}

		try {
			URL corePath = ResourceLocator.getProjectTemplateFiles("src");
			IRunnableWithProgress op = new TemplateOperation(corePath, (IContainer) fragment.getResource(), keys, binaryExtentions);
			getContainer().run(false, true, op);
		} catch (Exception e) {
			PDEPlugin.logException(e);
		}
	}

	private MCommand createCommand(String commandId, String name, String className, String keyBinding, String projectName, IPackageFragment fragment, MApplication application) {
		MCommand command = MCommandsFactory.INSTANCE.createCommand();
		command.setCommandName(name);
		command.setElementId(commandId);
		application.getCommands().add(command);
		{
			// Create Quit handler for command
			MHandler quitHandler = MCommandsFactory.INSTANCE.createHandler();
			quitHandler.setCommand(command);
			quitHandler.setContributionURI("bundleclass://" + projectName + "/" + fragment.getElementName() + ".handlers." + className);
			application.getHandlers().add(quitHandler);

			MKeyBinding binding = MCommandsFactory.INSTANCE.createKeyBinding();
			binding.setKeySequence(keyBinding);
			binding.setCommand(command);
			List<MBindingTable> tables = application.getBindingTables();
			if (tables.size() == 0) {
				MBindingContext rootContext = null;
				if (application.getRootContext().size() > 0) {
					rootContext = application.getRootContext().get(0);
				} else {
					rootContext = MCommandsFactory.INSTANCE.createBindingContext();
					rootContext.setElementId("org.eclipse.ui.contexts.dialogAndWindow");
					rootContext.setName("In Dialog and Windows");
					application.getRootContext().add(rootContext);
				}
				MBindingTable table = MCommandsFactory.INSTANCE.createBindingTable();
				table.setBindingContext(rootContext);
				tables.add(table);
			}
			tables.get(0).getBindings().add(binding);
		}
		return command;
	}

	private void prepareFolder(IContainer container, IProgressMonitor monitor) throws CoreException {
		IContainer parent = container.getParent();
		if (parent instanceof IFolder) {
			prepareFolder((IFolder) parent, monitor);
		}
		if (!container.exists() && container instanceof IFolder) {
			IFolder folder = (IFolder) container;
			folder.create(true, true, monitor);
		}
	}

	public String getPluginId() {
		return fPluginData.getId();
	}

	public String getPluginVersion() {
		return fPluginData.getVersion();
	}
}
