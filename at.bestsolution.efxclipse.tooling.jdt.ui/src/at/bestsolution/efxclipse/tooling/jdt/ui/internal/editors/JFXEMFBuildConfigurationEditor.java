/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Martin Bluehweis<martin.bluehweis@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors;

import static at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage.Literals.ANT_TASK__BUILD_DIRECTORY;
import static at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage.Literals.ANT_TASK__DEPLOY;
import static at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage.Literals.ANT_TASK__SIGNJAR;
import static at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage.Literals.DEPLOY__APPLICATION;
import static at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage.Literals.DEPLOY__EMBEDJNLP;
import static at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage.Literals.*;
import static at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage.Literals.DEPLOY__HEIGHT;
import static at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage.Literals.DEPLOY__INFO;
import static at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage.Literals.DEPLOY__NATIVE_PACKAGE;
import static at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage.Literals.DEPLOY__SPLASH_IMAGE;
import static at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage.Literals.DEPLOY__WIDTH;
import static at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage.Literals.SIGN_JAR__ALIAS;
import static at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage.Literals.SIGN_JAR__KEYPASS;
import static at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage.Literals.SIGN_JAR__KEYSTORE;
import static at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage.Literals.SIGN_JAR__STOREPASS;
import static at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage.Literals.SIGN_JAR__STORETYPE;
import static at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage.Literals.APPLICATION__MAINCLASS;
import static at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage.Literals.APPLICATION__NAME;
import static at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage.Literals.APPLICATION__PRELOADERCLASS;
import static at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage.Literals.APPLICATION__VERSION;
import static at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage.Literals.ICON__DEPTH;
import static at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage.Literals.ICON__HEIGHT;
import static at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage.Literals.*;
import static at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage.Literals.ICON__KIND;
import static at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage.Literals.ICON__WIDTH;
import static at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage.Literals.INFO__SPLASH;
import static at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage.Literals.INFO__VENDOR;
import static at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage.Literals.PARAM__NAME;
import static at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage.Literals.PARAM__VALUE;
import static at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage.Literals.SPLASH__HREF;
import static at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage.Literals.SPLASH__MODE;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.NotEnabledException;
import org.eclipse.core.commands.NotHandledException;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.databinding.IEMFValueProperty;
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

import at.bestsolution.efxclipse.tooling.jdt.ui.internal.buildpath.JavaFXPreferencePage;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTask;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksFactory;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.Icon;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.IconType;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.Param;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.ParametersFactory;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.Splash;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.parameters.SplashMode;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.outline.PropertyContentOutlinePage;

public class JFXEMFBuildConfigurationEditor extends MultiPageEditorPart implements IResourceChangeListener {
	private PropertyTextEditor editor;

	private FormToolkit toolkit;
	private Form form;
	private AntTask task = null;

	private static final int DELAY = 500;

	private DataBindingContext dbc;

	public JFXEMFBuildConfigurationEditor() {
		super();

		task = AntTasksFactory.eINSTANCE.createAntTask();
		task.setDeploy( AntTasksFactory.eINSTANCE.createDeploy() );
		task.getDeploy().setInfo( ParametersFactory.eINSTANCE.createInfo() );

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
		createPageOverview();
		createPageDeploy();
		createPageSigning();
		createPageEditor();
	}

	@Override
	public void init( IEditorSite site, IEditorInput editorInput ) throws PartInitException {
		if ( !( editorInput instanceof IFileEditorInput ) )
			throw new PartInitException( "Invalid Input: Must be IFileEditorInput" );
		super.init( site, editorInput );
		// try {
		IFileEditorInput i = (IFileEditorInput) editorInput;
		// TODO load stuff here
		// properties.load(i.getFile().getContents());
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (CoreException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
	}

	private void createPageOverview() {
		Composite composite = new Composite( getContainer(), SWT.NONE );
		FillLayout layout = new FillLayout();
		composite.setLayout( layout );

		// TODO
		final WritableValue bean = new WritableValue();
		bean.setValue( task );

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
				final Text t = toolkit.createText( sectionClient, "", SWT.BORDER );
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
						String dir = handleBuildWorkbenchDirectorySelection( t.getShell() );
						if ( dir != null ) {
							t.setText( dir );
						}
					}
				} );
				IEMFValueProperty prop = EMFProperties.value( ANT_TASK__BUILD_DIRECTORY );
				dbc.bindValue( textModify.observeDelayed( DELAY, t ), prop.observeDetail( bean ) );
			}

			{
				toolkit.createLabel( sectionClient, "Vendor name*:" );
				Text t = toolkit.createText( sectionClient, "", SWT.BORDER );
				t.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, true, false, 3, 1 ) );
				IEMFValueProperty prop = EMFProperties.value( FeaturePath.fromList( ANT_TASK__DEPLOY, DEPLOY__INFO, INFO__VENDOR ) );
				dbc.bindValue( textModify.observeDelayed( DELAY, t ), prop.observeDetail( bean ) );
			}

			{
				toolkit.createLabel( sectionClient, "Application title*:" );
				Text t = toolkit.createText( sectionClient, "", SWT.BORDER );
				t.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, true, false, 3, 1 ) );
				IEMFValueProperty prop = EMFProperties.value( FeaturePath.fromList( ANT_TASK__DEPLOY, DEPLOY__APPLICATION, APPLICATION__NAME ) );
				dbc.bindValue( textModify.observeDelayed( DELAY, t ), prop.observeDetail( bean ) );
			}

			{
				toolkit.createLabel( sectionClient, "Application version*:" );
				Text t = toolkit.createText( sectionClient, "", SWT.BORDER );
				t.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, true, false, 3, 1 ) );
				IEMFValueProperty prop = EMFProperties.value( FeaturePath.fromList( ANT_TASK__DEPLOY, DEPLOY__APPLICATION, APPLICATION__VERSION ) );
				dbc.bindValue( textModify.observeDelayed( DELAY, t ), prop.observeDetail( bean ) );
			}

			{
				toolkit.createLabel( sectionClient, "Application class*:" );
				final Text t = toolkit.createText( sectionClient, "", SWT.BORDER );
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
				IEMFValueProperty prop = EMFProperties.value( FeaturePath.fromList( ANT_TASK__DEPLOY, DEPLOY__APPLICATION, APPLICATION__MAINCLASS ) );
				dbc.bindValue( textModify.observeDelayed( DELAY, t ), prop.observeDetail( bean ) );
			}

			{
				toolkit.createLabel( sectionClient, "Preloader class:" );
				final Text t = toolkit.createText( sectionClient, "", SWT.BORDER );
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
				IEMFValueProperty prop = EMFProperties.value( FeaturePath.fromList( ANT_TASK__DEPLOY, DEPLOY__APPLICATION, APPLICATION__PRELOADERCLASS ) );
				dbc.bindValue( textModify.observeDelayed( DELAY, t ), prop.observeDetail( bean ) );
			}

			{
				toolkit.createLabel( sectionClient, "Splash:" );
				final Text t = toolkit.createText( sectionClient, "", SWT.BORDER );
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
				IEMFValueProperty prop = EMFProperties.value( FeaturePath.fromList( ANT_TASK__DEPLOY, DEPLOY__SPLASH_IMAGE ) );
				dbc.bindValue( textModify.observeDelayed( DELAY, t ), prop.observeDetail( bean ) );
			}

			{
				toolkit.createLabel( sectionClient, "Manifest-Attributes:" )
						.setLayoutData( new GridData( GridData.BEGINNING, GridData.BEGINNING, false, false ) );
				Composite tableContainer = toolkit.createComposite( sectionClient );
				tableContainer.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, true, false, 2, 1 ) );
				GridLayout gl = new GridLayout( 2, false );
//				gl.marginBottom = gl.marginHeight = gl.marginLeft = gl.marginRight = gl.marginTop = gl.marginWidth = 0;
				tableContainer.setLayout( gl );
		//		tableContainer.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );

				Table t = toolkit.createTable( tableContainer, SWT.FULL_SELECTION | SWT.H_SCROLL | SWT.V_SCROLL );
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
							return ( (Param) element ).getName();
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
							return ( (Param) element ).getValue();
						}
					} );
					c.getColumn().setWidth( 300 );
					c.getColumn().setText( "Value" );
				}

				v.setInput( task.getManifestEntries() );

				Composite buttonComp = toolkit.createComposite( sectionClient );
				buttonComp.setLayoutData( new GridData( GridData.BEGINNING, GridData.END, false, false ) );
				buttonComp.setLayout( new GridLayout() );

				{
					Button b = toolkit.createButton( buttonComp, "Add ...", SWT.PUSH );
					b.setLayoutData( new GridData( GridData.FILL, GridData.BEGINNING, false, false ) );
					b.addSelectionListener( new SelectionAdapter() {
						@Override
						public void widgetSelected( final SelectionEvent e ) {
							if ( handleAddManifestAttr( getSite().getShell() ) ) {
								v.setInput( task.getManifestEntries() );
							}
						}
					} );
				}

				{
					Button b = toolkit.createButton( buttonComp, "Remove", SWT.PUSH );
					b.setLayoutData( new GridData( GridData.FILL, GridData.BEGINNING, false, false ) );
					b.addSelectionListener( new SelectionAdapter() {
						@Override
						public void widgetSelected( final SelectionEvent e ) {
							Param value = (Param) ( (IStructuredSelection) v.getSelection() ).getFirstElement();
							if ( v != null ) {
								if ( handleRemoveManifestAttr( value ) ) {
									v.setInput( task.getManifestEntries() );
								}
							}
						}
					} );
				}
				{
					Button b = toolkit.createButton( sectionClient, "Convert CSS into binary form", SWT.CHECK );
					b.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, true, false, 2, 1 ) );
					IEMFValueProperty prop = EMFProperties.value( FeaturePath.fromList( ANT_TASK__CSS_TO_BIN ) );
					dbc.bindValue( selChange.observe( b ), prop.observeDetail( bean ) );
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
					public void linkExited( final HyperlinkEvent e ) {

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

		int index = addPage( composite );
		setPageText( index, "Overview" );
	}

	private void createPageDeploy() {
		Composite composite = new Composite( getContainer(), SWT.NONE );
		FillLayout layout = new FillLayout();
		composite.setLayout( layout );

		// TODO
		final WritableValue bean = new WritableValue();
		bean.setValue( task );

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
			section.setText( "Deploy Properties" );
			section.setDescription( "The following properties are needed to create a Java Webstart Deployment" );
			section.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );

			Composite sectionClient = toolkit.createComposite( section );
			sectionClient.setLayout( new GridLayout( 2, false ) );

			{
				toolkit.createLabel( sectionClient, "Applet Width*:" );
				Text t = toolkit.createText( sectionClient, "", SWT.BORDER );
				t.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );
				IEMFValueProperty prop = EMFProperties.value( FeaturePath.fromList( ANT_TASK__DEPLOY, DEPLOY__WIDTH ) );
				dbc.bindValue( textModify.observeDelayed( DELAY, t ), prop.observeDetail( bean ) );
			}

			{
				toolkit.createLabel( sectionClient, "Applet Height*:" );
				Text t = toolkit.createText( sectionClient, "", SWT.BORDER );
				t.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );
				IEMFValueProperty prop = EMFProperties.value( FeaturePath.fromList( ANT_TASK__DEPLOY, DEPLOY__HEIGHT ) );
				dbc.bindValue( textModify.observeDelayed( DELAY, t ), prop.observeDetail( bean ) );
			}

			{
				Button b = toolkit.createButton( sectionClient, "Embed JNLP", SWT.CHECK );
				b.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, true, false, 2, 1 ) );
				IEMFValueProperty prop = EMFProperties.value( FeaturePath.fromList( ANT_TASK__DEPLOY, DEPLOY__EMBEDJNLP ) );
				dbc.bindValue( selChange.observe( b ), prop.observeDetail( bean ) );
			}

			{
				Button b = toolkit.createButton( sectionClient, "Treat files as extensions", SWT.CHECK );
				IEMFValueProperty prop = EMFProperties.value( FeaturePath.fromList( ANT_TASK__DEPLOY, DEPLOY__EXTENSION ) );
				dbc.bindValue( selChange.observe( b ), prop.observeDetail( bean ) );
			}

			{
				Button b = toolkit.createButton( sectionClient, "Include deployment toolkit", SWT.CHECK );
				b.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, true, false, 2, 1 ) );
				IEMFValueProperty prop = EMFProperties.value( FeaturePath.fromList( ANT_TASK__DEPLOY, DEPLOY__INCLUDE_DT ) );
				dbc.bindValue( selChange.observe( b ), prop.observeDetail( bean ) );
			}

			{
				Button b = toolkit.createButton( sectionClient, "Native Package", SWT.CHECK );
				b.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, true, false, 2, 1 ) );
				IEMFValueProperty prop = EMFProperties.value( FeaturePath.fromList( ANT_TASK__DEPLOY, DEPLOY__NATIVE_PACKAGE ) );
				dbc.bindValue( selChange.observe( b ), prop.observeDetail( bean ) );
			}

			{
				Button b = toolkit.createButton( sectionClient, "Offline allowed", SWT.CHECK );
				b.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, true, false, 2, 1 ) );
				IEMFValueProperty prop = EMFProperties.value( FeaturePath.fromList( ANT_TASK__DEPLOY, DEPLOY__OFFLINE_ALLOWED ) );
				dbc.bindValue( selChange.observe( b ), prop.observeDetail( bean ) );
			}

			{
				toolkit.createLabel( sectionClient, "Placeholder Ref.*:" );
				Text t = toolkit.createText( sectionClient, "", SWT.BORDER );
				t.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );
				IEMFValueProperty prop = EMFProperties.value( FeaturePath.fromList( ANT_TASK__DEPLOY, DEPLOY__PLACEHOLDERREF ) );
				dbc.bindValue( textModify.observeDelayed( DELAY, t ), prop.observeDetail( bean ) );
			}

			{
				toolkit.createLabel( sectionClient, "Placeholder ID*:" );
				Text t = toolkit.createText( sectionClient, "", SWT.BORDER );
				t.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );
				IEMFValueProperty prop = EMFProperties.value( FeaturePath.fromList( ANT_TASK__DEPLOY, DEPLOY__PLACEHOLDERID ) );
				dbc.bindValue( textModify.observeDelayed( DELAY, t ), prop.observeDetail( bean ) );
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
							return ( (Splash) element ).getMode().getName();
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
							return ( (Splash) element ).getHref();
						}
					} );
					c.getColumn().setWidth( 300 );
					c.getColumn().setText( "URL" );
				}

				v.setInput( task.getDeploy().getInfo().getSplash() );

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
								v.setInput( task.getDeploy().getInfo().getSplash() );
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
							Splash value = (Splash) ( (IStructuredSelection) v.getSelection() ).getFirstElement();
							if ( v != null ) {
								if ( handleRemoveSplash( value ) ) {
									v.setInput( task.getDeploy().getInfo().getSplash() );
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
							return ( (Icon) element ).getDepth();
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
							return ( (Icon) element ).getKind().getName();
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
							return ( (Icon) element ).getWidth();
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
							return ( (Icon) element ).getHeight();
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
							return ( (Icon) element ).getHref();
						}
					} );
					c.getColumn().setWidth( 50 );
					c.getColumn().setText( "Url" );
				}

				v.setInput( task.getDeploy().getInfo().getIcon() );

				Composite buttonComp = toolkit.createComposite( container );
				buttonComp.setLayoutData( new GridData( GridData.BEGINNING, GridData.END, false, false ) );
				buttonComp.setLayout( new GridLayout() );

				{
					Button b = toolkit.createButton( buttonComp, "Add ...", SWT.PUSH );
					b.setLayoutData( new GridData( GridData.FILL, GridData.BEGINNING, false, false ) );
					b.addSelectionListener( new SelectionAdapter() {
						@Override
						public void widgetSelected( final SelectionEvent e ) {
							if ( handleAddIcon() ) {
								v.setInput( task.getDeploy().getInfo().getIcon() );
							}
						}
					} );
				}

				{
					Button b = toolkit.createButton( buttonComp, "Remove", SWT.PUSH );
					b.setLayoutData( new GridData( GridData.FILL, GridData.BEGINNING, false, false ) );
					b.addSelectionListener( new SelectionAdapter() {
						@Override
						public void widgetSelected( final SelectionEvent e ) {
							Icon value = (Icon) ( (IStructuredSelection) v.getSelection() ).getFirstElement();
							if ( v != null ) {
								if ( handleRemoveIcon( value ) ) {
									v.setInput( task.getDeploy().getInfo().getIcon() );
								}
							}
						}
					} );
				}
			}

			section.setClient( sectionClient );
		}

		int index = addPage( composite );
		setPageText( index, "Deploy" );
	}

	private void createPageSigning() {
		Composite composite = new Composite( getContainer(), SWT.NONE );
		FillLayout layout = new FillLayout();
		composite.setLayout( layout );

		// TODO
		final WritableValue bean = new WritableValue();
		bean.setValue( task );

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
		form.updateToolBar();

		ScrolledForm scrolledForm = toolkit.createScrolledForm( form.getBody() );
		scrolledForm.getBody().setLayout( new GridLayout( 2, false ) );
		Composite sectionParent = scrolledForm.getBody();

		dbc = new DataBindingContext();
		IWidgetValueProperty textModify = WidgetProperties.text( SWT.Modify );
		//IWidgetValueProperty selChange = WidgetProperties.selection();

		{
			Section section = toolkit.createSection( sectionParent, Section.DESCRIPTION | Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED );
			section.setText( "Signing Properties" );
			section.setDescription( "Information for signing result jar" );
			section.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );

			Composite sectionClient = toolkit.createComposite( section );
			sectionClient.setLayout( new GridLayout( 4, false ) );

			{
				toolkit.createLabel( sectionClient, "Alias*:" );
				Text t = toolkit.createText( sectionClient, "", SWT.BORDER );
				t.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, true, false, 3, 1 ) );
				IEMFValueProperty prop = EMFProperties.value( FeaturePath.fromList( ANT_TASK__SIGNJAR, SIGN_JAR__ALIAS ) );
				dbc.bindValue( textModify.observeDelayed( DELAY, t ), prop.observeDetail( bean ) );
			}

			{
				toolkit.createLabel( sectionClient, "Key-Password*:" );
				Text t = toolkit.createText( sectionClient, "", SWT.BORDER );
				t.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, true, false, 3, 1 ) );
				IEMFValueProperty prop = EMFProperties.value( FeaturePath.fromList( ANT_TASK__SIGNJAR, SIGN_JAR__KEYPASS ) );
				dbc.bindValue( textModify.observeDelayed( DELAY, t ), prop.observeDetail( bean ) );
			}

			{
				toolkit.createLabel( sectionClient, "Keystore*:" );
				final Text t = toolkit.createText( sectionClient, "", SWT.BORDER );
				t.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );
				toolkit.createButton( sectionClient, "Filesystem ...", SWT.PUSH ).addSelectionListener( new SelectionAdapter() {
					@Override
					public void widgetSelected( final SelectionEvent e ) {
						String v = handleKeyStoreFilesystemSelection( t.getShell() );
						if ( v != null ) {
							t.setText( v );
						}
					}
				} );
				toolkit.createButton( sectionClient, "Workspace ...", SWT.PUSH ).addSelectionListener( new SelectionAdapter() {
					@Override
					public void widgetSelected( final SelectionEvent e ) {
						String v = handleKeyStoreWorkspaceSelection( t.getShell() );
						if ( v != null ) {
							t.setText( v );
						}
					}
				} );
				IEMFValueProperty prop = EMFProperties.value( FeaturePath.fromList( ANT_TASK__SIGNJAR, SIGN_JAR__KEYSTORE ) );
				dbc.bindValue( textModify.observeDelayed( DELAY, t ), prop.observeDetail( bean ) );
			}

			{
				toolkit.createLabel( sectionClient, "Store-Password*:" );
				Text t = toolkit.createText( sectionClient, "", SWT.BORDER );
				t.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, true, false, 3, 1 ) );
				IEMFValueProperty prop = EMFProperties.value( FeaturePath.fromList( ANT_TASK__SIGNJAR, SIGN_JAR__STOREPASS ) );
				dbc.bindValue( textModify.observeDelayed( DELAY, t ), prop.observeDetail( bean ) );
			}

			{
				toolkit.createLabel( sectionClient, "Storetype:" );
				Text t = toolkit.createText( sectionClient, "", SWT.BORDER );
				t.setLayoutData( new GridData( GridData.FILL, GridData.CENTER, true, false, 3, 1 ) );
				IEMFValueProperty prop = EMFProperties.value( FeaturePath.fromList( ANT_TASK__SIGNJAR, SIGN_JAR__STORETYPE ) );
				dbc.bindValue( textModify.observeDelayed( DELAY, t ), prop.observeDetail( bean ) );
			}

			section.setClient( sectionClient );

			// TODO missing: fileset
		}

		int index = addPage( composite );
		setPageText( index, "Signing" );
	}

	boolean handleRemoveManifestAttr( final Param value ) {
		if ( MessageDialog.openConfirm( getSite().getShell(), "Confirm delete", "Would really like to remove the selected attribute" ) ) {
			task.getManifestEntries().remove( value );
			return true;
		}
		return false;
	}

	protected boolean handleAddManifestAttr( Shell shell ) {
		TitleAreaDialog d = new TitleAreaDialog( shell ) {
			private Param o = ParametersFactory.eINSTANCE.createParam();
			private DataBindingContext dbc = new DataBindingContext();
			private Text tName ;

			private Text tValue ;
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
					IEMFValueProperty prop = EMFProperties.value( PARAM__NAME );
					dbc.bindValue( tProp.observe( t ), prop.observe( o ) );
				}

				{
					Label l = new Label( container, SWT.NONE );
					l.setText( "Value*:" );

					Text t = new Text( container, SWT.BORDER );
					t.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );
					IEMFValueProperty prop = EMFProperties.value( PARAM__VALUE );
					dbc.bindValue( tProp.observe( t ), prop.observe( o ) );
				}

				return area;
			}

			@Override
			protected void okPressed() {
				task.getManifestEntries().add( o );
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

	boolean handleRemoveIcon( Icon value ) {
		if ( MessageDialog.openConfirm( getSite().getShell(), "Confirm delete", "Would really like to remove the selected icon" ) ) {
			task.getDeploy().getInfo().getIcon().remove( value );
			return true;
		}
		return false;
	}

	boolean handleAddIcon() {
		TitleAreaDialog d = new TitleAreaDialog( getSite().getShell() ) {
			private Icon o = ParametersFactory.eINSTANCE.createIcon();
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
					v.setInput( IconType.VALUES );
					IEMFValueProperty prop = EMFProperties.value( ICON__KIND );
					dbc.bindValue( selProp.observe( v ), prop.observe( o ) );
				}

				{
					Label l = new Label( container, SWT.NONE );
					l.setText( "URL*:" );

					Text t = new Text( container, SWT.BORDER );
					t.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );
					IEMFValueProperty prop = EMFProperties.value( ICON__HREF );
					dbc.bindValue( tProp.observeDelayed( DELAY, t ), prop.observe( o ) );
				}

				{
					Label l = new Label( container, SWT.NONE );
					l.setText( "Depth:" );

					ComboViewer v = new ComboViewer( container, SWT.READ_ONLY );
					v.setLabelProvider( new LabelProvider() );
					v.setContentProvider( ArrayContentProvider.getInstance() );
					// FIXME not hard coded here
					v.setInput( new String[] { "8", "24", "32" } );
					IEMFValueProperty prop = EMFProperties.value( ICON__DEPTH );
					dbc.bindValue( selProp.observe( v ), prop.observe( o ) );
				}

				{
					Label l = new Label( container, SWT.NONE );
					l.setText( "Width:" );

					Text t = new Text( container, SWT.BORDER );
					t.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );
					IEMFValueProperty prop = EMFProperties.value( ICON__WIDTH );
					dbc.bindValue( tProp.observeDelayed( DELAY, t ), prop.observe( o ) );
				}

				{
					Label l = new Label( container, SWT.NONE );
					l.setText( "Height:" );

					Text t = new Text( container, SWT.BORDER );
					t.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );
					IEMFValueProperty prop = EMFProperties.value( ICON__HEIGHT );
					dbc.bindValue( tProp.observeDelayed( DELAY, t ), prop.observe( o ) );
				}

				return area;
			}

			@Override
			protected void okPressed() {
				task.getDeploy().getInfo().getIcon().add( o );
				dbc.dispose();
				super.okPressed();
			}
		};
		return d.open() == TitleAreaDialog.OK;
	}

	boolean handleAddSplash() {
		TitleAreaDialog d = new TitleAreaDialog( getSite().getShell() ) {
			private Splash o = ParametersFactory.eINSTANCE.createSplash();
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
					v.setInput( SplashMode.values() );
					;
					IEMFValueProperty prop = EMFProperties.value( FeaturePath.fromList( ANT_TASK__DEPLOY, DEPLOY__INFO, INFO__SPLASH, SPLASH__MODE ) );
					dbc.bindValue( selProp.observe( v ), prop.observe( o ) );
				}

				{
					Label l = new Label( container, SWT.NONE );
					l.setText( "URL*:" );

					Text t = new Text( container, SWT.BORDER );
					t.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );
					IEMFValueProperty prop = EMFProperties.value( FeaturePath.fromList( ANT_TASK__DEPLOY, DEPLOY__INFO, INFO__SPLASH, SPLASH__HREF ) );
					dbc.bindValue( tProp.observeDelayed( DELAY, t ), prop.observe( o ) );
				}
				return area;
			}

			@Override
			protected void okPressed() {
				task.getDeploy().getInfo().getSplash().add( o );
				dbc.dispose();
				super.okPressed();
			}
		};
		return d.open() == TitleAreaDialog.OK;

	}

	// String handleImageSelection() {
	// FileDialog d = new FileDialog(getSite().getShell());
	// }

	boolean handleRemoveSplash( Splash value ) {
		if ( MessageDialog.openConfirm( getSite().getShell(), "Confirm delete", "Would really like to remove the selected splash" ) ) {
			task.getDeploy().getInfo().getSplash().remove( value );
			return true;
		}
		return false;
	}

	void handleCreateKeyStore( Shell parent ) {

	}

	IStatus validateKeystoreAlias( Shell parent, String alias ) {
		return Status.OK_STATUS;
	}

	String handleJFxSDKDirectorySelection( Shell parent, String originalDir ) {
		DirectoryDialog dialog = new DirectoryDialog( parent );
		dialog.setFilterPath( originalDir );

		String dir = dialog.open();
		if ( dir != null ) {
			if ( !JavaFXPreferencePage.validateSDKDirectory( dir ) ) {
				MessageDialog.openError( parent, "Not a JFX-SDK Directory", "The directory '" + dir + "' is not a valid SDK-directory" );
				return handleJFxSDKDirectorySelection( parent, originalDir );
			}
			else {
				return dir;
			}
		}
		return null;
	}

	String handleBuildFilesystemDirectorySelection( Shell parent ) {
		DirectoryDialog dialog = new DirectoryDialog( parent );
		return dialog.open();
	}

	String handleBuildWorkbenchDirectorySelection( Shell parent ) {
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
		// TODO maybe we need to load the stuff here.
		dbc.updateTargets();
	}

	void createPageEditor() {
		try {
			editor = new PropertyTextEditor();
			int index = addPage( editor, getEditorInput() );
			setPageText( index, editor.getTitle() );
			setPartName( editor.getTitle() );
			editor.getDocumentProvider().getDocument( editor.getEditorInput() ).addDocumentListener( new IDocumentListener() {

				@Override
				public void documentChanged( DocumentEvent event ) {
					syncForm();
				}

				@Override
				public void documentAboutToBeChanged( DocumentEvent event ) {

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
}
