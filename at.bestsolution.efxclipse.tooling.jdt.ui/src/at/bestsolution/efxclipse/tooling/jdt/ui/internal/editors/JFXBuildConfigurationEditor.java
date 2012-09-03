/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.NotEnabledException;
import org.eclipse.core.commands.NotHandledException;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.internal.ui.dialogs.MainTypeSelectionDialog;
import org.eclipse.jdt.internal.ui.util.BusyIndicatorRunnableContext;
import org.eclipse.jdt.internal.ui.wizards.TypedViewerFilter;
import org.eclipse.jdt.internal.ui.wizards.buildpaths.FolderSelectionDialog;
import org.eclipse.jdt.ui.IJavaElementSearchConstants;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.databinding.swt.IWidgetValueProperty;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.IViewerValueProperty;
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocumentListener;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.FilteredResourcesSelectionDialog;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;
import org.eclipse.ui.dialogs.ResourceSelectionDialog;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.events.IHyperlinkListener;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormText;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.outline.PropertyContentOutlinePage;

@SuppressWarnings( "restriction" )
public class JFXBuildConfigurationEditor extends MultiPageEditorPart implements IResourceChangeListener {
	private PropertyTextEditor editor;

	private FormToolkit toolkit;
	private Form form;
	private Properties properties = new Properties();
	private BuildPropertyBean bean = new BuildPropertyBean( properties );
	private boolean syncForm = true;

	// public static final String BUILD_JFXSDK = "buildJfxSDK";
	public static final String BUILD_DIRECTORY = "buildDirectory";
	public static final String BUILD_VENDOR_NAME = "buildVendorName";
	public static final String BUILD_APP_TITLE = "buildAppTitle";
	public static final String BUILD_APP_VERSION = "buildAppVersion";
	public static final String BUILD_APPLICATION_CLASS = "buildApplicationClass";
	public static final String BUILD_PRELOADER_CLASS = "buildPreloaderClass";
	public static final String BUILD_SPLASH_IMAGE = "buildSplashImage";
	public static final String BUILD_MANIFEST_ATTR_LIST = "buildManifestAttrList";

	// Sub-Elements ManifestAttr
	public static final String BUILD_MANIFEST_ATTR_NAME = "buildManifestAttrName";
	public static final String BUILD_MANIFEST_ATTR_VALUE = "buildManifestAttrValue";

	public static final String DEPLOY_APPLET_WIDTH = "deployAppletWith";
	public static final String DEPLOY_APPLET_HEIGHT = "deployAppletHeight";
	public static final String DEPLOY_NATIVE_PACKAGE = "deployNativePackage";
	// public static final String DEPLOY_DESCRIPTION = "deployDescription"; //fx:info description
	public static final String DEPLOY_SPLASH_LIST = "deploySplashList";
	public static final String DEPLOY_ICON_LIST = "deployIconList";

	// Sub-Elements Splash
	public static final String DEPLOY_SPLASH_HREF = "deploySplashHref";
	public static final String DEPLOY_SPLASH_MODE = "deploySplashMode";

	// Sub-Element Icon
	public static final String DEPLOY_ICON_DEPTH = "deployIconDepth";
	public static final String DEPLOY_ICON_HREF = "deployIconHref";
	public static final String DEPLOY_ICON_HEIGHT = "deployIconHeight";
	public static final String DEPLOY_ICON_KIND = "deployIconKind";
	public static final String DEPLOY_ICON_WIDTH = "deployIconWidth";

	public static final String SIGN_KEYSTORE = "signKeystore";
	public static final String SIGN_ALIAS = "signAlias";
	public static final String SIGN_PASSWORD = "signPassword";
	public static final String SIGN_KEYPASSWOARD = "signKeyPassword";

	private static final int DELAY = 500;

	public static final Map<String, String> MAPPING = new HashMap<String, String>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
			// put(BUILD_JFXSDK,"jfx.build.jfxsdkdir");
			put( BUILD_DIRECTORY, "jfx.build.stagingdir" );
			put( BUILD_VENDOR_NAME, "jfx.build.vendorname" );
			put( BUILD_APP_TITLE, "jfx.build.apptitle" );
			put( BUILD_APP_VERSION, "jfx.build.appversion" );
			put( BUILD_APPLICATION_CLASS, "jfx.build.applicationClass" );
			put( BUILD_PRELOADER_CLASS, "jfx.build.preloaderClass" );
			put( BUILD_SPLASH_IMAGE, "jfx.build.splashImage" );
			put( BUILD_MANIFEST_ATTR_LIST, "jfx.build.manifestAttrList" );

			put( DEPLOY_APPLET_WIDTH, "jfx.deploy.appletWith" );
			put( DEPLOY_APPLET_HEIGHT, "jfx.deploy.appletHeight" );
			put( DEPLOY_NATIVE_PACKAGE, "jfx.deploy.nativePackage" );
			put( DEPLOY_SPLASH_LIST, "jfx.deploy.splashlist" );
			put( DEPLOY_ICON_LIST, "jfx.deploy.iconlist" );

			put( SIGN_KEYSTORE, "jfx.sign.keystore" );
			put( SIGN_ALIAS, "jfx.sign.alias" );
			put( SIGN_PASSWORD, "jfx.sign.password" );
			put( SIGN_KEYPASSWOARD, "jfx.sign.keypassword" );
		}
	};

	private DataBindingContext dbc;

	public JFXBuildConfigurationEditor() {
		super();
		ResourcesPlugin.getWorkspace().addResourceChangeListener( this );
	}

	@Override
	public void dispose() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener( this );
		dbc.dispose();
		super.dispose();
	}

	@Override
	public void doSave( IProgressMonitor monitor ) {
		getEditor( 1 ).doSave( monitor );
	}

	@Override
	public void doSaveAs() {
		IEditorPart editor = getEditor( 1 );
		editor.doSaveAs();
		setPageText( 0, editor.getTitle() );
		setInput( editor.getEditorInput() );
	}

	@Override
	public boolean isSaveAsAllowed() {
		return true;
	}

	@Override
	protected void createPages() {
		createPage0();
		createPage1();
	}

	@Override
	public void init( IEditorSite site, IEditorInput editorInput ) throws PartInitException {
		if ( !( editorInput instanceof IFileEditorInput ) )
			throw new PartInitException( "Invalid Input: Must be IFileEditorInput" );
		super.init( site, editorInput );
		try {
			IFileEditorInput i = (IFileEditorInput) editorInput;
			properties.load( i.getFile().getContents() );
		}
		catch ( IOException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch ( CoreException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void createPage0() {
		Composite composite = new Composite( getContainer(), SWT.NONE );
		FillLayout layout = new FillLayout();
		composite.setLayout( layout );

		toolkit = new FormToolkit( composite.getDisplay() );

		form = toolkit.createForm( composite );
		form.setText( "FX Build Configuration" );
		form.setImage( getTitleImage() );
		form.getBody().setLayout( new FillLayout() );
		toolkit.decorateFormHeading( form );

		IToolBarManager mgr = form.getToolBarManager();
		mgr.add( new Action( "Build & Export FX Application", ImageDescriptor.createFromURL( getClass().getClassLoader().getResource(
				"/icons/exportrunnablejar_wiz.gif" ) ) ) {
			@Override
			public void run() {
				try {
					IHandlerService hs = (IHandlerService) PlatformUI.getWorkbench().getService( IHandlerService.class );
					hs.executeCommand( "at.bestsolution.efxclipse.tooling.jdt.ui.export", null );
				}
				catch ( ExecutionException e ) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				catch ( NotDefinedException e ) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				catch ( NotEnabledException e ) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				catch ( NotHandledException e ) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} );
		// mgr.add(new Action("Export Ant File",ImageDescriptor.createFromURL(getClass().getClassLoader().getResource("/icons/exportAnt_co.gif"))) {
		// @Override
		// public void run() {
		//
		// }
		// });
		form.updateToolBar();

		ScrolledForm scrolledForm = toolkit.createScrolledForm( form.getBody() );
		scrolledForm.getBody().setLayout( new GridLayout( 2, false ) );
		Composite sectionParent = scrolledForm.getBody();

		dbc = new DataBindingContext();
		IWidgetValueProperty textModify = WidgetProperties.text( SWT.Modify );
		IWidgetValueProperty selChange = WidgetProperties.selection();

		{
			Section section = toolkit.createSection( sectionParent, Section.DESCRIPTION | Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED );
			section.setText( "Build && Package Properties" );
			section.setDescription( "The following properties are needed to build the JavaFX-Application" );
			section.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );

			Composite sectionClient = toolkit.createComposite( section );
			sectionClient.setLayout( new GridLayout( 4, false ) );

			{
				toolkit.createLabel( sectionClient, "Build Directory*:" );
				final Text t = toolkit.createText( sectionClient, "" );
				t.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );
				toolkit.createButton( sectionClient, "Filesystem ...", SWT.PUSH ).addSelectionListener( new SelectionAdapter() {
					@Override
					public void widgetSelected( SelectionEvent e ) {
						String dir = handleBuildFilesystemDirectorySelection( t.getShell() );
						if ( dir != null ) {
							t.setText( dir );
						}
					}
				} );
				toolkit.createButton( sectionClient, "Workspace ...", SWT.PUSH ).addSelectionListener( new SelectionAdapter() {
					@Override
					public void widgetSelected( SelectionEvent e ) {
						String dir = handleBuildWorkbencDirectorySelection( t.getShell() );
						if ( dir != null ) {
							t.setText( dir );
						}
					}
				} );
				dbc.bindValue( textModify.observeDelayed( DELAY, t ), BeanProperties.value( BUILD_DIRECTORY ).observe( bean ) );
			}

			// {
			// IEclipsePreferences pref = InstanceScope.INSTANCE.getNode(JavaFXCorePlugin.PLUGIN_ID);
			// final String prefDir = pref.get(JavaFXPreferencesConstants.JAVAFX_DIR,"");
			//
			// toolkit.createLabel(sectionClient, "JFX-SDK Directory:");
			// final Text t = toolkit.createText(sectionClient, "");
			// t.setMessage(prefDir);
			// t.setLayoutData(new GridData(GridData.FILL,GridData.CENTER,true,false,2,1));
			// Button b = toolkit.createButton(sectionClient, "Browse ...", SWT.PUSH);
			// b.addSelectionListener(new SelectionAdapter() {
			// @Override
			// public void widgetSelected(SelectionEvent e) {
			// String dir = handleJFxSDKDirectorySelection(t.getShell(),prefDir);
			// if( dir != null ) {
			// t.setText(dir);
			// }
			// }
			// });
			// b.setLayoutData(new GridData(GridData.FILL, GridData.CENTER, false, false));
			// dbc.bindValue(textModify.observeDelayed(DELAY, t), BeanProperties.value(BUILD_JFXSDK).observe(bean));
			// }

			{
				toolkit.createLabel( sectionClient, "Vendor name*:" );
				Text t = toolkit.createText( sectionClient, "" );
				t.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, true, false, 3, 1 ) );
				dbc.bindValue( textModify.observeDelayed( DELAY, t ), BeanProperties.value( BUILD_VENDOR_NAME ).observe( bean ) );
			}

			{
				toolkit.createLabel( sectionClient, "Application title*:" );
				Text t = toolkit.createText( sectionClient, "" );
				t.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, true, false, 3, 1 ) );
				dbc.bindValue( textModify.observeDelayed( DELAY, t ), BeanProperties.value( BUILD_APP_TITLE ).observe( bean ) );
			}

			{
				toolkit.createLabel( sectionClient, "Application version*:" );
				Text t = toolkit.createText( sectionClient, "" );
				t.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, true, false, 3, 1 ) );
				dbc.bindValue( textModify.observeDelayed( DELAY, t ), BeanProperties.value( BUILD_APP_VERSION ).observe( bean ) );
			}

			{
				toolkit.createLabel( sectionClient, "Application class*:" );
				final Text t = toolkit.createText( sectionClient, "" );
				t.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, true, false, 2, 1 ) );
				Button b = toolkit.createButton( sectionClient, "Browse ...", SWT.PUSH );
				b.addSelectionListener( new SelectionAdapter() {
					@Override
					public void widgetSelected( SelectionEvent e ) {
						String name = handleRootclassSelection( t.getShell() );
						if ( name != null ) {
							t.setText( name );
						}
					}
				} );
				b.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, false, false ) );
				dbc.bindValue( textModify.observeDelayed( DELAY, t ), BeanProperties.value( BUILD_APPLICATION_CLASS ).observe( bean ) );
			}

			{
				toolkit.createLabel( sectionClient, "Preloader class:" );
				final Text t = toolkit.createText( sectionClient, "" );
				t.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, true, false, 2, 1 ) );
				Button b = toolkit.createButton( sectionClient, "Browse ...", SWT.PUSH );
				b.addSelectionListener( new SelectionAdapter() {
					@Override
					public void widgetSelected( SelectionEvent e ) {
						String name = handlePreloaderclassSelection( t.getShell() );
						if ( name != null ) {
							t.setText( name );
						}
					}
				} );
				b.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, false, false ) );
				dbc.bindValue( textModify.observeDelayed( DELAY, t ), BeanProperties.value( BUILD_PRELOADER_CLASS ).observe( bean ) );
			}

			{
				toolkit.createLabel( sectionClient, "Splash:" );
				final Text t = toolkit.createText( sectionClient, "" );
				t.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, true, false, 2, 1 ) );
				Button b = toolkit.createButton( sectionClient, "Browse ...", SWT.PUSH );
				b.addSelectionListener( new SelectionAdapter() {
					@Override
					public void widgetSelected( SelectionEvent e ) {
						String name = handleSplashImage( t.getShell() );
						if ( name != null ) {
							t.setText( name );
						}
					}
				} );
				b.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, false, false ) );
				dbc.bindValue( textModify.observeDelayed( DELAY, t ), BeanProperties.value( BUILD_SPLASH_IMAGE ).observe( bean ) );
			}

			{
				toolkit.createLabel( sectionClient, "Manifest-Attributes:" )
						.setLayoutData( new GridData( GridData.BEGINNING, GridData.BEGINNING, false, false ) );
				Composite container = toolkit.createComposite( sectionClient );
				GridLayout gl = new GridLayout( 2, false );
				gl.marginBottom = gl.marginHeight = gl.marginLeft = gl.marginRight = gl.marginTop = gl.marginWidth = 0;
				container.setLayout( gl );
				container.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );

				Table t = toolkit.createTable( container, SWT.FULL_SELECTION | SWT.H_SCROLL | SWT.V_SCROLL );
				t.setHeaderVisible( true );
				t.setLinesVisible( true );

				final TableViewer v = new TableViewer( t );
				GridData gd = new GridData( GridData.FILL_HORIZONTAL );
				gd.heightHint = t.getItemHeight() * 5;
				v.getControl().setLayoutData( gd );
				v.setContentProvider( ArrayContentProvider.getInstance() );

				{
					TableViewerColumn c = new TableViewerColumn( v, SWT.NONE );
					c.setLabelProvider( new ColumnLabelProvider() {
						@Override
						public String getText( Object element ) {
							return ( (BuildPropertyManifestAttr) element ).getBuildManifestAttrName();
						}
					} );
					c.getColumn().setWidth( 100 );
					c.getColumn().setText( "Name" );
				}

				{
					TableViewerColumn c = new TableViewerColumn( v, SWT.NONE );
					c.setLabelProvider( new ColumnLabelProvider() {
						@Override
						public String getText( Object element ) {
							return ( (BuildPropertyManifestAttr) element ).getBuildManifestAttrValue();
						}
					} );
					c.getColumn().setWidth( 300 );
					c.getColumn().setText( "Value" );
				}

				v.setInput( bean.getBuildManifestAttrList() );

				Composite buttonComp = toolkit.createComposite( container );
				buttonComp.setLayoutData( new GridData( GridData.BEGINNING, GridData.END, false, false ) );
				buttonComp.setLayout( new GridLayout() );

				{
					Button b = toolkit.createButton( buttonComp, "Add ...", SWT.PUSH );
					b.setLayoutData( new GridData( GridData.FILL, GridData.BEGINNING, false, false ) );
					b.addSelectionListener( new SelectionAdapter() {
						@Override
						public void widgetSelected( SelectionEvent e ) {
							if ( handleAddManifestAttr( getSite().getShell() ) ) {
								v.setInput( bean.getBuildManifestAttrList() );
							}
						}
					} );
				}

				{
					Button b = toolkit.createButton( buttonComp, "Remove", SWT.PUSH );
					b.setLayoutData( new GridData( GridData.FILL, GridData.BEGINNING, false, false ) );
					b.addSelectionListener( new SelectionAdapter() {
						@Override
						public void widgetSelected( SelectionEvent e ) {
							BuildPropertyManifestAttr value = (BuildPropertyManifestAttr) ( (IStructuredSelection) v.getSelection() ).getFirstElement();
							if ( v != null ) {
								if ( handleRemoveManifestAttr( value ) ) {
									v.setInput( bean.getBuildManifestAttrList() );
								}
							}
						}
					} );
				}
			}

			section.setClient( sectionClient );
		}

		{
			Section section = toolkit.createSection( sectionParent, Section.DESCRIPTION | Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED );
			section.setText( "Building & Exporting" );
			section.setLayoutData( new GridData( GridData.FILL, GridData.FILL, false, true, 1, 2 ) );

			Composite sectionClient = toolkit.createComposite( section );
			sectionClient.setLayout( new GridLayout( 1, false ) );

			{
				FormText text = toolkit.createFormText( sectionClient, false );
				text.setText(
						"<p>To generate build instructions and export the project: <li style=\"bullet\" bindent=\"1\">Generate <a href=\"generateAnt\">ant build.xml</a> only</li><li style=\"bullet\" bindent=\"2\">Generate <a href=\"generateAndRun\">ant build.xml and run</a></li>&#160;</p>",
						true, false );
				text.addHyperlinkListener( new IHyperlinkListener() {

					@Override
					public void linkExited( HyperlinkEvent e ) {

					}

					@Override
					public void linkEntered( HyperlinkEvent e ) {
					}

					@Override
					public void linkActivated( HyperlinkEvent e ) {
						try {
							if ( "generateAndRun".equals( e.getHref() ) ) {
								IHandlerService hs = (IHandlerService) PlatformUI.getWorkbench().getService( IHandlerService.class );
								hs.executeCommand( "at.bestsolution.efxclipse.tooling.jdt.ui.export", null );
							}
							else {
								IHandlerService hs = (IHandlerService) PlatformUI.getWorkbench().getService( IHandlerService.class );
								hs.executeCommand( "at.bestsolution.efxclipse.tooling.jdt.ui.generateAnt", null );
							}
						}
						catch ( Exception e1 ) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				} );
			}

			section.setClient( sectionClient );
		}

		{
			Section section = toolkit.createSection( sectionParent, Section.DESCRIPTION | Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED );
			section.setText( "Deploy Properties" );
			section.setDescription( "The following properties are needed to create a Java Webstart Deployment" );
			section.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );

			Composite sectionClient = toolkit.createComposite( section );
			sectionClient.setLayout( new GridLayout( 2, false ) );

			{
				toolkit.createLabel( sectionClient, "Native Package:" );
				Button b = toolkit.createButton( sectionClient, "", SWT.CHECK );
				dbc.bindValue( selChange.observe( b ), BeanProperties.value( DEPLOY_NATIVE_PACKAGE ).observe( bean ) );
			}

			{
				toolkit.createLabel( sectionClient, "Applet Width:" );
				Text t = toolkit.createText( sectionClient, "" );
				t.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );
				dbc.bindValue( textModify.observeDelayed( DELAY, t ), BeanProperties.value( DEPLOY_APPLET_WIDTH ).observe( bean ) );
			}

			{
				toolkit.createLabel( sectionClient, "Applet Height:" );
				Text t = toolkit.createText( sectionClient, "" );
				t.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );
				dbc.bindValue( textModify.observeDelayed( DELAY, t ), BeanProperties.value( DEPLOY_APPLET_HEIGHT ).observe( bean ) );
			}

			{
				toolkit.createLabel( sectionClient, "Webstart Splash:" ).setLayoutData( new GridData( GridData.BEGINNING, GridData.BEGINNING, false, false ) );
				Composite container = toolkit.createComposite( sectionClient );
				GridLayout gl = new GridLayout( 2, false );
				gl.marginBottom = gl.marginHeight = gl.marginLeft = gl.marginRight = gl.marginTop = gl.marginWidth = 0;
				container.setLayout( gl );
				container.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );

				Table t = toolkit.createTable( container, SWT.FULL_SELECTION | SWT.H_SCROLL | SWT.V_SCROLL );
				t.setHeaderVisible( true );
				t.setLinesVisible( true );

				final TableViewer v = new TableViewer( t );
				GridData gd = new GridData( GridData.FILL_HORIZONTAL );
				gd.heightHint = t.getItemHeight() * 5;
				v.getControl().setLayoutData( gd );
				v.setContentProvider( ArrayContentProvider.getInstance() );

				{
					TableViewerColumn c = new TableViewerColumn( v, SWT.NONE );
					c.setLabelProvider( new ColumnLabelProvider() {
						@Override
						public String getText( Object element ) {
							return ( (BuildPropertySplash) element ).getDeploySplashMode();
						}
					} );
					c.getColumn().setWidth( 100 );
					c.getColumn().setText( "Mode" );
				}

				{
					TableViewerColumn c = new TableViewerColumn( v, SWT.NONE );
					c.setLabelProvider( new ColumnLabelProvider() {
						@Override
						public String getText( Object element ) {
							return ( (BuildPropertySplash) element ).getDeploySplashHref();
						}
					} );
					c.getColumn().setWidth( 300 );
					c.getColumn().setText( "URL" );
				}

				v.setInput( bean.getDeploySplashList() );

				Composite buttonComp = toolkit.createComposite( container );
				buttonComp.setLayoutData( new GridData( GridData.BEGINNING, GridData.END, false, false ) );
				buttonComp.setLayout( new GridLayout() );

				{
					Button b = toolkit.createButton( buttonComp, "Add ...", SWT.PUSH );
					b.setLayoutData( new GridData( GridData.FILL, GridData.BEGINNING, false, false ) );
					b.addSelectionListener( new SelectionAdapter() {
						@Override
						public void widgetSelected( SelectionEvent e ) {
							if ( handleAddSplash() ) {
								v.setInput( bean.getDeploySplashList() );
							}
						}
					} );
				}

				{
					Button b = toolkit.createButton( buttonComp, "Remove", SWT.PUSH );
					b.setLayoutData( new GridData( GridData.FILL, GridData.BEGINNING, false, false ) );
					b.addSelectionListener( new SelectionAdapter() {
						@Override
						public void widgetSelected( SelectionEvent e ) {
							BuildPropertySplash value = (BuildPropertySplash) ( (IStructuredSelection) v.getSelection() ).getFirstElement();
							if ( v != null ) {
								if ( handleRemoveSplash( value ) ) {
									v.setInput( bean.getDeploySplashList() );
								}
							}
						}
					} );
				}
			}

			{
				toolkit.createLabel( sectionClient, "Webstart Icons:" ).setLayoutData( new GridData( GridData.BEGINNING, GridData.BEGINNING, false, false ) );
				Composite container = toolkit.createComposite( sectionClient );
				GridLayout gl = new GridLayout( 2, false );
				gl.marginBottom = gl.marginHeight = gl.marginLeft = gl.marginRight = gl.marginTop = gl.marginWidth = 0;
				container.setLayout( gl );
				container.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );

				Table t = toolkit.createTable( container, SWT.FULL_SELECTION | SWT.H_SCROLL | SWT.V_SCROLL );
				t.setHeaderVisible( true );
				t.setLinesVisible( true );

				final TableViewer v = new TableViewer( t );
				GridData gd = new GridData( GridData.FILL_HORIZONTAL );
				gd.heightHint = t.getItemHeight() * 5;
				v.getControl().setLayoutData( gd );
				v.setContentProvider( ArrayContentProvider.getInstance() );

				{
					TableViewerColumn c = new TableViewerColumn( v, SWT.NONE );
					c.setLabelProvider( new ColumnLabelProvider() {
						@Override
						public String getText( Object element ) {
							return ( (BuildPropertyIcon) element ).getDeployIconDepth();
						}
					} );
					c.getColumn().setWidth( 50 );
					c.getColumn().setText( "Depth" );
				}

				{
					TableViewerColumn c = new TableViewerColumn( v, SWT.NONE );
					c.setLabelProvider( new ColumnLabelProvider() {
						@Override
						public String getText( Object element ) {
							return ( (BuildPropertyIcon) element ).getDeployIconKind();
						}
					} );
					c.getColumn().setWidth( 50 );
					c.getColumn().setText( "Kind" );
				}

				{
					TableViewerColumn c = new TableViewerColumn( v, SWT.NONE );
					c.setLabelProvider( new ColumnLabelProvider() {
						@Override
						public String getText( Object element ) {
							return ( (BuildPropertyIcon) element ).getDeployIconWidth();
						}
					} );
					c.getColumn().setWidth( 50 );
					c.getColumn().setText( "Width" );
				}

				{
					TableViewerColumn c = new TableViewerColumn( v, SWT.NONE );
					c.setLabelProvider( new ColumnLabelProvider() {
						@Override
						public String getText( Object element ) {
							return ( (BuildPropertyIcon) element ).getDeployIconHeight();
						}
					} );
					c.getColumn().setWidth( 50 );
					c.getColumn().setText( "Height" );
				}

				{
					TableViewerColumn c = new TableViewerColumn( v, SWT.NONE );
					c.setLabelProvider( new ColumnLabelProvider() {
						@Override
						public String getText( Object element ) {
							return ( (BuildPropertyIcon) element ).getDeployIconHref();
						}
					} );
					c.getColumn().setWidth( 50 );
					c.getColumn().setText( "Url" );
				}

				v.setInput( bean.getDeployIconList() );

				Composite buttonComp = toolkit.createComposite( container );
				buttonComp.setLayoutData( new GridData( GridData.BEGINNING, GridData.END, false, false ) );
				buttonComp.setLayout( new GridLayout() );

				{
					Button b = toolkit.createButton( buttonComp, "Add ...", SWT.PUSH );
					b.setLayoutData( new GridData( GridData.FILL, GridData.BEGINNING, false, false ) );
					b.addSelectionListener( new SelectionAdapter() {
						@Override
						public void widgetSelected( SelectionEvent e ) {
							if ( handleAddIcon() ) {
								v.setInput( bean.getDeployIconList() );
							}
						}
					} );
				}

				{
					Button b = toolkit.createButton( buttonComp, "Remove", SWT.PUSH );
					b.setLayoutData( new GridData( GridData.FILL, GridData.BEGINNING, false, false ) );
					b.addSelectionListener( new SelectionAdapter() {
						@Override
						public void widgetSelected( SelectionEvent e ) {
							BuildPropertyIcon value = (BuildPropertyIcon) ( (IStructuredSelection) v.getSelection() ).getFirstElement();
							if ( v != null ) {
								if ( handleRemoveIcon( value ) ) {
									v.setInput( bean.getDeployIconList() );
								}
							}
						}
					} );
				}
			}

			section.setClient( sectionClient );
		}

		{
			Section section = toolkit.createSection( sectionParent, Section.DESCRIPTION | Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED );
			section.setText( "Signing Properties" );
			section.setDescription( "Information for signing result jar" );
			section.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );

			Composite sectionClient = toolkit.createComposite( section );
			sectionClient.setLayout( new GridLayout( 4, false ) );

			{
				toolkit.createLabel( sectionClient, "Keystore:" );
				// toolkit.createHyperlink(sectionClient, "Keystore:",SWT.NONE).addHyperlinkListener(new HyperlinkAdapter() {
				// @Override
				// public void linkActivated(HyperlinkEvent e) {
				//
				// }
				// });
				final Text t = toolkit.createText( sectionClient, "" );
				t.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );
				toolkit.createButton( sectionClient, "Filesystem ...", SWT.PUSH ).addSelectionListener( new SelectionAdapter() {
					@Override
					public void widgetSelected( SelectionEvent e ) {
						String v = handleKeyStoreFilesystemSelection( t.getShell() );
						if ( v != null ) {
							t.setText( v );
						}
					}
				} );
				toolkit.createButton( sectionClient, "Workspace ...", SWT.PUSH ).addSelectionListener( new SelectionAdapter() {
					@Override
					public void widgetSelected( SelectionEvent e ) {
						String v = handleKeyStoreWorkspaceSelection( t.getShell() );
						if ( v != null ) {
							t.setText( v );
						}
					}
				} );
				dbc.bindValue( textModify.observeDelayed( DELAY, t ), BeanProperties.value( SIGN_KEYSTORE ).observe( bean ) );
			}

			{
				toolkit.createLabel( sectionClient, "Store-Password:" );
				Text t = toolkit.createText( sectionClient, "" );
				t.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, true, false, 3, 1 ) );
				dbc.bindValue( textModify.observeDelayed( DELAY, t ), BeanProperties.value( SIGN_PASSWORD ).observe( bean ) );
			}

			{
				toolkit.createLabel( sectionClient, "Alias:" );
				Text t = toolkit.createText( sectionClient, "" );
				t.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, true, false, 3, 1 ) );
				dbc.bindValue( textModify.observeDelayed( DELAY, t ), BeanProperties.value( SIGN_ALIAS ).observe( bean ) );
			}

			{
				toolkit.createLabel( sectionClient, "Key-Password:" );
				Text t = toolkit.createText( sectionClient, "" );
				t.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, true, false, 3, 1 ) );
				dbc.bindValue( textModify.observeDelayed( DELAY, t ), BeanProperties.value( SIGN_KEYPASSWOARD ).observe( bean ) );
			}

			section.setClient( sectionClient );
		}

		int index = addPage( composite );
		setPageText( index, "Build Properties" );
	}

	boolean handleRemoveManifestAttr( BuildPropertyManifestAttr value ) {
		if ( MessageDialog.openConfirm( getSite().getShell(), "Confirm delete", "Would really like to remove the selected attribute" ) ) {
			bean.removeBuildManifestAttr( value );
			return true;
		}
		return false;
	}

	protected boolean handleAddManifestAttr( Shell shell ) {
		TitleAreaDialog d = new TitleAreaDialog( shell ) {
			private BuildPropertyManifestAttr o = new BuildPropertyManifestAttr();
			private DataBindingContext dbc = new DataBindingContext();

			@Override
			protected Control createDialogArea( Composite parent ) {
				Composite area = (Composite) super.createDialogArea( parent );
				Composite container = new Composite( area, SWT.NONE );
				container.setLayoutData( new GridData( GridData.FILL_BOTH ) );
				container.setLayout( new GridLayout( 2, false ) );

				getShell().setText( "Add manifest attribute" );
				setTitle( "Add manifest attribute" );
				setMessage( "Enter informations about manifest header entry" );

				IWidgetValueProperty tProp = WidgetProperties.text( SWT.Modify );

				{
					Label l = new Label( container, SWT.NONE );
					l.setText( "Name*:" );

					Text t = new Text( container, SWT.BORDER );
					t.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );
					dbc.bindValue( tProp.observe( t ), BeanProperties.value( BUILD_MANIFEST_ATTR_NAME ).observe( o ) );
				}

				{
					Label l = new Label( container, SWT.NONE );
					l.setText( "Value*:" );

					Text t = new Text( container, SWT.BORDER );
					t.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );
					dbc.bindValue( tProp.observe( t ), BeanProperties.value( BUILD_MANIFEST_ATTR_VALUE ).observe( o ) );
				}

				return area;
			}

			@Override
			protected void okPressed() {
				bean.addBuildManifestAttr( o );
				dbc.dispose();
				super.okPressed();
			}
		};

		return d.open() == TitleAreaDialog.OK;
	}

	String handleSplashImage( Shell shell ) {
		FilteredResourcesSelectionDialog d = new FilteredResourcesSelectionDialog( shell, false,
				( (IFileEditorInput) getEditorInput() ).getFile().getProject(), IResource.FILE ) {
			@Override
			protected IStatus validateItem( Object item ) {
				IFile f = (IFile) item;
				if ( f.getParent() instanceof IProject ) {
					return new Status( IStatus.ERROR, "at.bestsolution.efxclipse.tooling.jdt.ui", "The selected resource has to part of the source folder" );
				}
				return super.validateItem( item );
			}
		};
		if ( d.open() == ResourceSelectionDialog.OK ) {
			Object[] rv = d.getResult();
			if ( rv.length == 1 ) {
				IFile f = (IFile) rv[0];
				IJavaElement j = JavaCore.create( f.getParent() );
				if ( j instanceof IPackageFragment ) {
					IPackageFragment p = (IPackageFragment) j;
					return p.getElementName().replace( '.', '/' ) + "/" + f.getName();
				}
				else if ( j instanceof IPackageFragmentRoot ) {
					return f.getName();
				}
				else {
					MessageDialog.openInformation( shell, "Not valid", "The selected resource has to part of the source folder" );
				}
			}
		}

		return null;
	}

	boolean handleRemoveIcon( BuildPropertyIcon value ) {
		if ( MessageDialog.openConfirm( getSite().getShell(), "Confirm delete", "Would really like to remove the selected icon" ) ) {
			bean.removeDeployIcon( value );
			return true;
		}
		return false;
	}

	boolean handleAddIcon() {
		TitleAreaDialog d = new TitleAreaDialog( getSite().getShell() ) {
			private BuildPropertyIcon o = new BuildPropertyIcon();
			private DataBindingContext dbc = new DataBindingContext();

			@Override
			protected Control createDialogArea( Composite parent ) {
				Composite area = (Composite) super.createDialogArea( parent );

				getShell().setText( "Add icon" );
				setTitle( "Add icon" );
				setMessage( "Enter informations about the icon to add" );

				Composite container = new Composite( area, SWT.NONE );
				container.setLayout( new GridLayout( 2, false ) );
				container.setLayoutData( new GridData( GridData.FILL_BOTH ) );

				IViewerValueProperty selProp = ViewerProperties.singleSelection();
				IWidgetValueProperty tProp = WidgetProperties.text( SWT.Modify );

				{
					Label l = new Label( container, SWT.NONE );
					l.setText( "Kind:" );

					ComboViewer v = new ComboViewer( container, SWT.READ_ONLY );
					v.setLabelProvider( new LabelProvider() );
					v.setContentProvider( ArrayContentProvider.getInstance() );
					v.setInput( new String[] { "default", "disabled", "rollover", "selected", "shortcut" } );
					dbc.bindValue( selProp.observe( v ), BeanProperties.value( DEPLOY_ICON_KIND ).observe( o ) );
				}

				{
					Label l = new Label( container, SWT.NONE );
					l.setText( "URL*:" );

					Text t = new Text( container, SWT.BORDER );
					t.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );
					dbc.bindValue( tProp.observeDelayed( DELAY, t ), BeanProperties.value( DEPLOY_ICON_HREF ).observe( o ) );
				}

				{
					Label l = new Label( container, SWT.NONE );
					l.setText( "Depth:" );

					ComboViewer v = new ComboViewer( container, SWT.READ_ONLY );
					v.setLabelProvider( new LabelProvider() );
					v.setContentProvider( ArrayContentProvider.getInstance() );
					v.setInput( new String[] { "8", "24", "32" } );
					dbc.bindValue( selProp.observe( v ), BeanProperties.value( DEPLOY_ICON_DEPTH ).observe( o ) );
				}

				{
					Label l = new Label( container, SWT.NONE );
					l.setText( "Width:" );

					Text t = new Text( container, SWT.BORDER );
					t.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );
					dbc.bindValue( tProp.observeDelayed( DELAY, t ), BeanProperties.value( DEPLOY_ICON_WIDTH ).observe( o ) );
				}

				{
					Label l = new Label( container, SWT.NONE );
					l.setText( "Height:" );

					Text t = new Text( container, SWT.BORDER );
					t.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );
					dbc.bindValue( tProp.observeDelayed( DELAY, t ), BeanProperties.value( DEPLOY_ICON_HEIGHT ).observe( o ) );
				}

				return area;
			}

			@Override
			protected void okPressed() {
				bean.addDeployIcon( o );
				dbc.dispose();
				super.okPressed();
			}
		};
		return d.open() == TitleAreaDialog.OK;
	}

	boolean handleAddSplash() {
		TitleAreaDialog d = new TitleAreaDialog( getSite().getShell() ) {
			private BuildPropertySplash o = new BuildPropertySplash();
			private DataBindingContext dbc = new DataBindingContext();

			@Override
			protected Control createDialogArea( Composite parent ) {
				Composite area = (Composite) super.createDialogArea( parent );

				getShell().setText( "Add splash icon" );
				setTitle( "Add splash" );
				setMessage( "Enter informations about the splash to add" );

				Composite container = new Composite( area, SWT.NONE );
				container.setLayout( new GridLayout( 2, false ) );
				container.setLayoutData( new GridData( GridData.FILL_BOTH ) );

				IViewerValueProperty selProp = ViewerProperties.singleSelection();
				IWidgetValueProperty tProp = WidgetProperties.text( SWT.Modify );

				{
					Label l = new Label( container, SWT.NONE );
					l.setText( "Mode*:" );

					ComboViewer v = new ComboViewer( container, SWT.READ_ONLY );
					v.setLabelProvider( new LabelProvider() );
					v.setContentProvider( ArrayContentProvider.getInstance() );
					v.setInput( new String[] { "any", "webstart" } );
					dbc.bindValue( selProp.observe( v ), BeanProperties.value( DEPLOY_SPLASH_MODE ).observe( o ) );
				}

				{
					Label l = new Label( container, SWT.NONE );
					l.setText( "URL*:" );

					Text t = new Text( container, SWT.BORDER );
					t.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );
					dbc.bindValue( tProp.observeDelayed( DELAY, t ), BeanProperties.value( DEPLOY_SPLASH_HREF ).observe( o ) );
				}

				return area;
			}

			@Override
			protected void okPressed() {
				bean.addDeploySplash( o );
				dbc.dispose();
				super.okPressed();
			}
		};
		return d.open() == TitleAreaDialog.OK;

	}

	// String handleImageSelection() {
	// FileDialog d = new FileDialog(getSite().getShell());
	// }

	boolean handleRemoveSplash( BuildPropertySplash value ) {
		if ( MessageDialog.openConfirm( getSite().getShell(), "Confirm delete", "Would really like to remove the selected splash" ) ) {
			bean.removeDeploySplash( value );
			return true;
		}
		return false;
	}

	void handleCreateKeyStore( Shell parent ) {

	}

	IStatus validateKeystoreAlias( Shell parent, String alias ) {
		return Status.OK_STATUS;
	}

	String handleBuildFilesystemDirectorySelection( Shell parent ) {
		DirectoryDialog dialog = new DirectoryDialog( parent );
		return dialog.open();
	}

	String handleBuildWorkbencDirectorySelection( Shell parent ) {
		ILabelProvider lp = new WorkbenchLabelProvider();
		ITreeContentProvider cp = new WorkbenchContentProvider();

		Class<?>[] acceptedClasses = new Class[] { IProject.class, IFolder.class };
		ViewerFilter filter = new TypedViewerFilter( acceptedClasses );

		FolderSelectionDialog dialog = new FolderSelectionDialog( parent, lp, cp );
		dialog.setTitle( "Output directory" );
		dialog.setMessage( "Select output directory" );
		dialog.addFilter( filter );
		dialog.setInput( ResourcesPlugin.getWorkspace().getRoot() );
		if ( dialog.open() == Window.OK ) {
			IContainer c = (IContainer) dialog.getFirstResult();
			return "${workspace}/" + c.getProject().getName() + "/" + c.getProjectRelativePath().toString();
		}
		return null;
	}

	String handleRootclassSelection( Shell parent ) {
		IFileEditorInput i = (IFileEditorInput) getEditorInput();
		IJavaProject project = JavaCore.create( i.getFile().getProject() );
		if ( project == null ) {
			return null;
		}

		IJavaElement[] elements = new IJavaElement[] { project };

		int constraints = IJavaSearchScope.SOURCES;
		constraints |= IJavaSearchScope.APPLICATION_LIBRARIES;

		IJavaSearchScope searchScope = SearchEngine.createJavaSearchScope( elements, constraints );
		BusyIndicatorRunnableContext context = new BusyIndicatorRunnableContext();

		MainTypeSelectionDialog dialog = new MainTypeSelectionDialog( parent, context, searchScope, 0 );
		dialog.setTitle( "Find class" );
		dialog.setMessage( "Find the class used to launch the application" );
		if ( dialog.open() == Window.CANCEL ) {
			return null;
		}
		Object[] results = dialog.getResult();
		IType type = (IType) results[0];
		if ( type != null ) {
			return type.getFullyQualifiedName();
		}

		return null;
	}

	String handlePreloaderclassSelection( Shell parent ) {
		IFileEditorInput i = (IFileEditorInput) getEditorInput();
		IJavaProject project = JavaCore.create( i.getFile().getProject() );
		if ( project == null ) {
			return null;
		}

		try {
			IType superType = project.findType( "javafx.application.Preloader" );

			IJavaSearchScope searchScope = SearchEngine.createStrictHierarchyScope( project, superType, true, false, null );

			SelectionDialog dialog = JavaUI.createTypeDialog( parent, PlatformUI.getWorkbench().getProgressService(), searchScope,
					IJavaElementSearchConstants.CONSIDER_CLASSES, false, "" );
			dialog.setTitle( "Find Preloader" );
			if ( dialog.open() == Window.OK ) {
				IType type = (IType) dialog.getResult()[0];
				return type.getFullyQualifiedName( '$' );
			}
		}
		catch ( JavaModelException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	String handleKeyStoreFilesystemSelection( Shell parent ) {
		FileDialog dialog = new FileDialog( parent, SWT.OPEN );
		String keystore = dialog.open();
		if ( keystore != null ) {
			IStatus s = validateKeyStore( new File( keystore ) );
			if ( s.isOK() ) {
				return keystore;
			}
			else {
				MessageDialog.openError( parent, "Not a keystore", "Looks like the selected file is not a keystore" );
				return handleKeyStoreFilesystemSelection( parent );
			}
		}
		return null;
	}

	String handleKeyStoreWorkspaceSelection( Shell parent ) {
		ILabelProvider lp = new WorkbenchLabelProvider();
		ITreeContentProvider cp = new WorkbenchContentProvider();

		ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog( parent, lp, cp );
		dialog.setValidator( new ISelectionStatusValidator() {

			@Override
			public IStatus validate( Object[] selection ) {
				if ( selection.length > 1 ) {
					return new Status( IStatus.ERROR, "at.bestsolution.efxclipse.tooling.jdt.ui", "Only one file allowed." );
				}
				else if ( selection.length == 1 ) {
					if ( selection[0] instanceof IFile ) {
						IFile f = (IFile) selection[0];
						return validateKeyStore( f.getLocation().toFile() );
					}
				}
				return Status.OK_STATUS;
			}
		} );
		dialog.setInput( ResourcesPlugin.getWorkspace().getRoot() );

		if ( dialog.open() == Window.OK ) {
			IFile f = (IFile) dialog.getFirstResult();
			if ( f != null ) {
				return "${workspace}/" + f.getProject().getName() + "/" + f.getProjectRelativePath().toString();
			}
		}

		return null;
	}

	IStatus validateKeyStore( File f ) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream( f );
			KeyStore ks = KeyStore.getInstance( KeyStore.getDefaultType() );
			ks.load( fis, null );
		}
		catch ( FileNotFoundException e ) {
			return new Status( IStatus.ERROR, "at.bestsolution.efxclipse.tooling.jdt.ui", "The keystore file '" + f.getAbsolutePath() + "' is not found.", e );
		}
		catch ( KeyStoreException e ) {
			return new Status( IStatus.ERROR, "at.bestsolution.efxclipse.tooling.jdt.ui", "Unable to initialize keystore", e );
		}
		catch ( NoSuchAlgorithmException e ) {
			return new Status( IStatus.ERROR, "at.bestsolution.efxclipse.tooling.jdt.ui", "Loading keystore failed. Is this a valid keystore?", e );
		}
		catch ( CertificateException e ) {
			return new Status( IStatus.ERROR, "at.bestsolution.efxclipse.tooling.jdt.ui", "Loading keystore failed. Is this a valid keystore?", e );
		}
		catch ( IOException e ) {
			if ( e.getCause() instanceof UnrecoverableKeyException ) {
				return Status.OK_STATUS;
			}
			return new Status( IStatus.ERROR, "at.bestsolution.efxclipse.tooling.jdt.ui", "Loading keystore failed. Is this a valid keystore?", e );
		}
		finally {
			if ( fis != null ) {
				try {
					fis.close();
				}
				catch ( IOException e ) {
				}
			}
		}

		return Status.OK_STATUS;
	}

	protected void pageChange( int newPageIndex ) {
		if ( newPageIndex == 0 ) {
			syncForm();
		}
	}

	void syncForm() {
		properties.clear();
		try {
			properties.load( new StringReader( editor.getDocumentProvider().getDocument( editor.getEditorInput() ).get() ) );
		}
		catch ( IOException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dbc.updateTargets();
	}

	void createPage1() {
		try {
			editor = new PropertyTextEditor();
			int index = addPage( editor, getEditorInput() );
			setPageText( index, editor.getTitle() );
			setPartName( editor.getTitle() );
			editor.getDocumentProvider().getDocument( editor.getEditorInput() ).addDocumentListener( new IDocumentListener() {

				@Override
				public void documentChanged( DocumentEvent event ) {
					if ( syncForm && getActivePage() == 0 ) {
						syncForm();
					}
				}

				@Override
				public void documentAboutToBeChanged( DocumentEvent event ) {

				}
			} );
			bean.addPropertyChangeListener( new PropertyChangeListener() {

				@Override
				public void propertyChange( PropertyChangeEvent evt ) {
					try {
						syncForm = false;

						String key = MAPPING.get( evt.getPropertyName() );

						String editorText = editor.getDocumentProvider().getDocument( editor.getEditorInput() ).get();
						BufferedReader r = new BufferedReader( new StringReader( editorText ) );
						String line;
						StringBuilder b = new StringBuilder();
						try {
							boolean found = false;
							while ( ( line = r.readLine() ) != null ) {
								if ( line.startsWith( key ) ) {
									if ( line.endsWith( "\\" ) ) {
										while ( ( line = r.readLine() ) != null && line.endsWith( "\\" ) ) {
											// remove all of them
										}
									}

									if ( evt.getNewValue() == null ) {
										line = null;
									}
									else {
										line = key + " = " + evt.getNewValue();
									}

									found = true;
								}

								if ( line != null ) {
									b.append( line + "\n" );
								}
							}

							if ( !found && evt.getNewValue() != null ) {
								b.append( line = key + " = " + evt.getNewValue() );
							}

							editor.getDocumentProvider().getDocument( editor.getEditorInput() ).set( b.toString() );
						}
						catch ( IOException e ) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					}
					finally {
						syncForm = true;
					}

				}
			} );
		}
		catch ( PartInitException e ) {
			ErrorDialog.openError( getSite().getShell(), "Error creating nested text editor", null, e.getStatus() );
		}
	}

	@Override
	public void resourceChanged( final IResourceChangeEvent event ) {
		if ( event.getType() == IResourceChangeEvent.PRE_CLOSE ) {
			Display.getDefault().asyncExec( new Runnable() {
				public void run() {
					IWorkbenchPage[] pages = getSite().getWorkbenchWindow().getPages();
					for ( int i = 0; i < pages.length; i++ ) {
						if ( ( (FileEditorInput) editor.getEditorInput() ).getFile().getProject().equals( event.getResource() ) ) {
							IEditorPart editorPart = pages[i].findEditor( editor.getEditorInput() );
							pages[i].closeEditor( editorPart, true );
						}
					}
				}
			} );
		}
	}

	public Object getAdapter( @SuppressWarnings( "rawtypes" ) Class adapter ) {
		if ( adapter == IContentOutlinePage.class ) {
			final PropertyContentOutlinePage contentOutline = new PropertyContentOutlinePage( editor );
			return contentOutline;
		}
		//
		return super.getAdapter( adapter );
	}

	@Deprecated
	public static class BuildPropertyBean {
		private PropertyChangeSupport support = new PropertyChangeSupport( this );
		private Properties properties;

		public BuildPropertyBean( Properties properties ) {
			this.properties = properties;
		}

		public void addPropertyChangeListener( PropertyChangeListener listener ) {
			support.addPropertyChangeListener( listener );
		}

		public void removePropertyChangeListener( PropertyChangeListener listener ) {
			support.addPropertyChangeListener( listener );
		}

		private String get( String key ) {
			return properties.getProperty( MAPPING.get( key ) );
		}

		private void set( String key, String value ) {
			if ( value == null || value.trim().isEmpty() ) {
				support.firePropertyChange( key, properties.remove( MAPPING.get( key ) ), null );
			}
			else {
				support.firePropertyChange( key, properties.setProperty( MAPPING.get( key ), value ), value );
			}
		}

		public void setBuildDirectory( String value ) {
			set( BUILD_DIRECTORY, value );
		}

		public String getBuildDirectory() {
			return get( BUILD_DIRECTORY );
		}

		public void setBuildVendorName( String value ) {
			set( BUILD_VENDOR_NAME, value );
		}

		public String getBuildVendorName() {
			return get( BUILD_VENDOR_NAME );
		}

		public void setBuildAppTitle( String value ) {
			set( BUILD_APP_TITLE, value );
		}

		public String getBuildAppTitle() {
			return get( BUILD_APP_TITLE );
		}

		public void setBuildAppVersion( String value ) {
			set( BUILD_APP_VERSION, value );
		}

		public String getBuildAppVersion() {
			return get( BUILD_APP_VERSION );
		}

		public void setBuildApplicationClass( String value ) {
			set( BUILD_APPLICATION_CLASS, value );
		}

		public String getBuildApplicationClass() {
			return get( BUILD_APPLICATION_CLASS );
		}

		public void setBuildPreloaderClass( String value ) {
			set( BUILD_PRELOADER_CLASS, value );
		}

		public String getBuildPreloaderClass() {
			return get( BUILD_PRELOADER_CLASS );
		}

		public void setDeployAppletWith( String value ) {
			set( DEPLOY_APPLET_WIDTH, value );
		}

		public String getDeployAppletWith() {
			return get( DEPLOY_APPLET_WIDTH );
		}

		public void setDeployAppletHeight( String value ) {
			set( DEPLOY_APPLET_HEIGHT, value );
		}

		public String getDeployAppletHeight() {
			return get( DEPLOY_APPLET_HEIGHT );
		}

		// public void setBuildJfxSDK(String value) {
		// set(BUILD_JFXSDK,value);
		// }
		//
		// public String getBuildJfxSDK() {
		// return get(BUILD_JFXSDK);
		// }

		public void setSignKeystore( String value ) {
			set( SIGN_KEYSTORE, value );
		}

		public String getSignKeystore() {
			return get( SIGN_KEYSTORE );
		}

		public void setSignAlias( String value ) {
			set( SIGN_ALIAS, value );
		}

		public String getSignAlias() {
			return get( SIGN_ALIAS );
		}

		public void setSignPassword( String value ) {
			set( SIGN_PASSWORD, value );
		}

		public String getSignPassword() {
			return get( SIGN_PASSWORD );
		}

		public void setSignKeyPassword( String value ) {
			set( SIGN_KEYPASSWOARD, value );
		}

		public String getSignKeyPassword() {
			return get( SIGN_KEYPASSWOARD );
		}

		public void setDeployNativePackage( String value ) {
			set( DEPLOY_NATIVE_PACKAGE, value );
		}

		public String getDeployNativePackage() {
			return get( DEPLOY_NATIVE_PACKAGE );
		}

		public void setBuildSplashImage( String value ) {
			set( BUILD_SPLASH_IMAGE, value );
		}

		public String getBuildSplashImage() {
			return get( BUILD_SPLASH_IMAGE );
		}

		public List<BuildPropertySplash> getDeploySplashList() {
			return Collections.unmodifiableList( internalGetDeploySplashList() );
		}

		private List<BuildPropertySplash> internalGetDeploySplashList() {
			String s = get( DEPLOY_SPLASH_LIST );
			List<BuildPropertySplash> l = new ArrayList<BuildPropertySplash>();
			if ( s != null && s.trim().length() > 0 ) {
				for ( String i : s.split( "##" ) ) {
					String[] parts = i.split( ";" );
					if ( parts.length == 2 ) {
						BuildPropertySplash splash = new BuildPropertySplash();
						splash.setDeploySplashMode( nullHandler( parts[0] ) );
						splash.setDeploySplashHref( nullHandler( parts[1] ) );
						l.add( splash );
					}
				}
			}

			return l;
		}

		private void internalSetDeploySplashList( List<BuildPropertySplash> l ) {
			StringBuilder b = new StringBuilder();
			for ( BuildPropertySplash i : l ) {
				if ( b.length() > 0 ) {
					b.append( "##" );
				}
				b.append( i.getDeploySplashMode() );
				b.append( ";" );
				b.append( i.getDeploySplashHref() );
			}
			set( DEPLOY_SPLASH_LIST, b.toString() );
		}

		public void addDeploySplash( BuildPropertySplash value ) {
			List<BuildPropertySplash> l = internalGetDeploySplashList();
			l.add( value );
			internalSetDeploySplashList( l );
		}

		public void removeDeploySplash( BuildPropertySplash value ) {
			List<BuildPropertySplash> l = internalGetDeploySplashList();
			l.remove( value );
			internalSetDeploySplashList( l );
		}

		public List<BuildPropertyIcon> getDeployIconList() {
			return Collections.unmodifiableList( internalGetDeployIconList() );
		}

		private List<BuildPropertyIcon> internalGetDeployIconList() {
			String s = get( DEPLOY_ICON_LIST );
			List<BuildPropertyIcon> l = new ArrayList<BuildPropertyIcon>();
			if ( s != null && s.trim().length() > 0 ) {
				for ( String i : s.split( "##" ) ) {
					String[] parts = i.split( ";" );
					if ( parts.length == 5 ) {
						BuildPropertyIcon splash = new BuildPropertyIcon();
						splash.setDeployIconDepth( nullHandler( parts[0] ) );
						splash.setDeployIconHeight( nullHandler( parts[1] ) );
						splash.setDeployIconHref( nullHandler( parts[2] ) );
						splash.setDeployIconKind( nullHandler( parts[3] ) );
						splash.setDeployIconWidth( nullHandler( parts[4] ) );
						l.add( splash );
					}
				}
			}

			return l;
		}

		private void internalSetDeployIconList( List<BuildPropertyIcon> l ) {
			StringBuilder b = new StringBuilder();
			for ( BuildPropertyIcon i : l ) {
				if ( b.length() > 0 ) {
					b.append( "##" );
				}
				b.append( i.getDeployIconDepth() );
				b.append( ";" );
				b.append( i.getDeployIconHeight() );
				b.append( ";" );
				b.append( i.getDeployIconHref() );
				b.append( ";" );
				b.append( i.getDeployIconKind() );
				b.append( ";" );
				b.append( i.getDeployIconWidth() );
			}
			set( DEPLOY_ICON_LIST, b.toString() );
		}

		public void addDeployIcon( BuildPropertyIcon value ) {
			List<BuildPropertyIcon> l = internalGetDeployIconList();
			l.add( value );
			internalSetDeployIconList( l );
		}

		public void removeDeployIcon( BuildPropertyIcon value ) {
			List<BuildPropertyIcon> l = internalGetDeployIconList();
			l.remove( value );
			internalSetDeployIconList( l );
		}

		// =============================================

		public List<BuildPropertyManifestAttr> getBuildManifestAttrList() {
			return Collections.unmodifiableList( internalGetBuildManifestAttrList() );
		}

		private List<BuildPropertyManifestAttr> internalGetBuildManifestAttrList() {
			String s = get( BUILD_MANIFEST_ATTR_LIST );
			List<BuildPropertyManifestAttr> l = new ArrayList<BuildPropertyManifestAttr>();
			if ( s != null && s.trim().length() > 0 ) {
				for ( String i : s.split( "##" ) ) {
					String[] parts = i.split( "_;_" );
					if ( parts.length == 2 ) {
						BuildPropertyManifestAttr splash = new BuildPropertyManifestAttr();
						splash.setBuildManifestAttrName( nullHandler( parts[0] ) );
						splash.setBuildManifestAttrValue( nullHandler( parts[1] ) );
						l.add( splash );
					}
				}
			}

			return l;
		}

		private void internalSetBuildManifestAttrList( List<BuildPropertyManifestAttr> l ) {
			StringBuilder b = new StringBuilder();
			for ( BuildPropertyManifestAttr i : l ) {
				if ( b.length() > 0 ) {
					b.append( "##" );
				}
				b.append( i.getBuildManifestAttrName() );
				b.append( "_;_" );
				b.append( i.getBuildManifestAttrValue() );
			}
			set( BUILD_MANIFEST_ATTR_LIST, b.toString() );
		}

		public void addBuildManifestAttr( BuildPropertyManifestAttr value ) {
			List<BuildPropertyManifestAttr> l = internalGetBuildManifestAttrList();
			l.add( value );
			internalSetBuildManifestAttrList( l );
		}

		public void removeBuildManifestAttr( BuildPropertyManifestAttr value ) {
			List<BuildPropertyManifestAttr> l = internalGetBuildManifestAttrList();
			l.remove( value );
			internalSetBuildManifestAttrList( l );
		}

	}

	public static class BuildPropertyManifestAttr {
		private PropertyChangeSupport support = new PropertyChangeSupport( this );
		private Map<String, String> properties = new HashMap<String, String>();

		public void addPropertyChangeListener( PropertyChangeListener listener ) {
			support.addPropertyChangeListener( listener );
		}

		public void removePropertyChangeListener( PropertyChangeListener listener ) {
			support.addPropertyChangeListener( listener );
		}

		private String get( String key ) {
			return properties.get( key );
		}

		private void set( String key, String value ) {
			if ( value == null || value.trim().isEmpty() ) {
				support.firePropertyChange( key, properties.remove( key ), null );
			}
			else {
				support.firePropertyChange( key, properties.put( key, value ), value );
			}
		}

		public void setBuildManifestAttrValue( String value ) {
			set( BUILD_MANIFEST_ATTR_VALUE, value );
		}

		public String getBuildManifestAttrValue() {
			return get( BUILD_MANIFEST_ATTR_VALUE );
		}

		public void setBuildManifestAttrName( String value ) {
			set( BUILD_MANIFEST_ATTR_NAME, value );
		}

		public String getBuildManifestAttrName() {
			return get( BUILD_MANIFEST_ATTR_NAME );
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ( ( properties == null ) ? 0 : properties.hashCode() );
			return result;
		}

		@Override
		public boolean equals( Object obj ) {
			if ( this == obj )
				return true;
			if ( obj == null )
				return false;
			if ( getClass() != obj.getClass() )
				return false;
			BuildPropertyManifestAttr other = (BuildPropertyManifestAttr) obj;
			if ( properties == null ) {
				if ( other.properties != null )
					return false;
			}
			else if ( !properties.equals( other.properties ) )
				return false;
			return true;
		}
	}

	public static class BuildPropertyIcon {
		private PropertyChangeSupport support = new PropertyChangeSupport( this );
		private Map<String, String> properties = new HashMap<String, String>();

		public void addPropertyChangeListener( PropertyChangeListener listener ) {
			support.addPropertyChangeListener( listener );
		}

		public void removePropertyChangeListener( PropertyChangeListener listener ) {
			support.addPropertyChangeListener( listener );
		}

		private String get( String key ) {
			return properties.get( key );
		}

		private void set( String key, String value ) {
			if ( value == null || value.trim().isEmpty() ) {
				support.firePropertyChange( key, properties.remove( key ), null );
			}
			else {
				support.firePropertyChange( key, properties.put( key, value ), value );
			}
		}

		public void setDeployIconDepth( String value ) {
			set( DEPLOY_ICON_DEPTH, value );
		}

		public String getDeployIconDepth() {
			return get( DEPLOY_ICON_DEPTH );
		}

		public void setDeployIconHref( String value ) {
			set( DEPLOY_ICON_HREF, value );
		}

		public String getDeployIconHref() {
			return get( DEPLOY_ICON_HREF );
		}

		public void setDeployIconHeight( String value ) {
			set( DEPLOY_ICON_HEIGHT, value );
		}

		public String getDeployIconHeight() {
			return get( DEPLOY_ICON_HEIGHT );
		}

		public void setDeployIconKind( String value ) {
			set( DEPLOY_ICON_KIND, value );
		}

		public String getDeployIconKind() {
			return get( DEPLOY_ICON_KIND );
		}

		public void setDeployIconWidth( String value ) {
			set( DEPLOY_ICON_WIDTH, value );
		}

		public String getDeployIconWidth() {
			return get( DEPLOY_ICON_WIDTH );
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ( ( properties == null ) ? 0 : properties.hashCode() );
			return result;
		}

		@Override
		public boolean equals( Object obj ) {
			if ( this == obj )
				return true;
			if ( obj == null )
				return false;
			if ( getClass() != obj.getClass() )
				return false;
			BuildPropertyIcon other = (BuildPropertyIcon) obj;
			if ( properties == null ) {
				if ( other.properties != null )
					return false;
			}
			else if ( !properties.equals( other.properties ) )
				return false;
			return true;
		}
	}

	public static class BuildPropertySplash {
		private PropertyChangeSupport support = new PropertyChangeSupport( this );
		private Map<String, String> properties = new HashMap<String, String>();

		public void addPropertyChangeListener( PropertyChangeListener listener ) {
			support.addPropertyChangeListener( listener );
		}

		public void removePropertyChangeListener( PropertyChangeListener listener ) {
			support.addPropertyChangeListener( listener );
		}

		private String get( String key ) {
			return properties.get( key );
		}

		private void set( String key, String value ) {
			if ( value == null || value.trim().isEmpty() ) {
				support.firePropertyChange( key, properties.remove( key ), null );
			}
			else {
				support.firePropertyChange( key, properties.put( key, value ), value );
			}
		}

		public void setDeploySplashHref( String value ) {
			set( DEPLOY_SPLASH_HREF, value );
		}

		public String getDeploySplashHref() {
			return get( DEPLOY_SPLASH_HREF );
		}

		public void setDeploySplashMode( String value ) {
			set( DEPLOY_SPLASH_MODE, value );
		}

		public String getDeploySplashMode() {
			return get( DEPLOY_SPLASH_MODE );
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ( ( properties == null ) ? 0 : properties.hashCode() );
			return result;
		}

		@Override
		public boolean equals( Object obj ) {
			if ( this == obj )
				return true;
			if ( obj == null )
				return false;
			if ( getClass() != obj.getClass() )
				return false;
			BuildPropertySplash other = (BuildPropertySplash) obj;
			if ( properties == null ) {
				if ( other.properties != null )
					return false;
			}
			else if ( !properties.equals( other.properties ) )
				return false;
			return true;
		}
	}

	private static String nullHandler( String value ) {
		return "null".equals( value ) ? null : value;
	}
}
