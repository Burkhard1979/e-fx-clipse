package at.bestsolution.efxclipse.tooling.modeleditor;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TreeCell;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.util.Callback;

import javax.annotation.PostConstruct;
import javax.inject.Named;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.list.WritableList;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.MApplicationElement;
import org.eclipse.e4.ui.model.application.commands.impl.CommandsPackageImpl;
import org.eclipse.e4.ui.model.application.impl.ApplicationPackageImpl;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainer;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimBar;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimmedWindow;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.model.application.ui.basic.impl.BasicPackageImpl;
import org.eclipse.e4.ui.model.application.ui.impl.UiPackageImpl;
import org.eclipse.e4.ui.model.application.ui.menu.MDirectToolItem;
import org.eclipse.e4.ui.model.application.ui.menu.MToolBar;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import at.bestsolution.efxclipse.runtime.databinding.TreeUtil;
import at.bestsolution.efxclipse.runtime.databinding.TreeUtil.ObservableFactory;
import at.bestsolution.efxclipse.runtime.di.FXMLBuilder;
import at.bestsolution.efxclipse.runtime.di.FXMLLoader;
import at.bestsolution.efxclipse.runtime.di.FXMLLoaderFactory;
import at.bestsolution.efxclipse.runtime.di.ResourcePool;

@SuppressWarnings("restriction")
public class ModelEditor {
	private ResourcePool pool;
	private BorderPane contentPane;
	
	private Map<EClass, Node> editors = new HashMap<EClass, Node>();
	
	private IEclipseContext context;
	
	private FXMLLoaderFactory factory;
	
	@PostConstruct
	public void create(BorderPane parent, @Named("rootElement") MApplication application, IEclipseContext context, @FXMLLoader FXMLLoaderFactory factory, ResourcePool pool) {
		this.context = context;
		this.factory = factory;
		this.pool = pool;
		
		SplitPane pane = new SplitPane();
		
		parent.setCenter(pane);
		pane.getItems().add(createTreeView(application));
		
		contentPane = new BorderPane();
		pane.getItems().add(contentPane);
	}

	void updateDetailArea(Object element) {
		contentPane.setCenter(null);
		this.context.set("selectedTreeElement", element);
		contentPane.setCenter(getOrCreateEditor(element));
	}
	
	private Node getOrCreateEditor(Object element) {
		if( element instanceof EObject ) {
			EObject eo = (EObject) element;
			Node rv = editors.get(eo.eClass());
			
			if( rv == null ) {
				FXMLBuilder<Node> b = factory.loadRequestorRelative("objecteditors/"+eo.eClass().getName().toLowerCase()+"/EditorMain.fxml");
				try {
					rv = b.load();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			return rv;
		}
		return null;
	}
	
	private TreeView<Object> createTreeView(Object application) {
		TreeView<Object> treeView = new TreeView<Object>();
		treeView.setRoot(TreeUtil.createModel(application, new ObservableFactoryImpl()));
		treeView.setCellFactory(new Callback<TreeView<Object>, TreeCell<Object>>() {
			
			@Override
			public TreeCell<Object> call(TreeView<Object> param) {
				TreeCell<Object> c = new TreeCell<Object>() {
					@Override
					protected void updateItem(Object item, boolean empty) {
						super.updateItem(item, empty);
						if( item != null ) {
							if( item instanceof MApplicationElement ) {
								String name = ((EObject)item).eClass().getName();
								setText(name);
								Image img = pool.getImageUnchecked("efx_tooling_modeleditor_Model_" + name);
								if( img != null ) {
									setGraphic(new ImageView(img));
								}
								
//								String img = getImage((MApplicationElement) item);
//								if( img != null ) {
//									URL uri = ModelEditor.class.getResource("icons/modelelements/"+ img);
//									if( uri != null ) {
//										
//									}
//								} else {
//									setGraphic(null);
//								}
							} else if( item instanceof VirtualEntry ) {
								setText(((VirtualEntry) item).label);
								setGraphic(null);
							}
						}
					}
				};
				return c;
			}
		});
		treeView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TreeItem<Object>>() {

			@Override
			public void changed(ObservableValue<? extends TreeItem<Object>> observable, TreeItem<Object> oldValue, TreeItem<Object> newValue) {
				updateDetailArea(newValue.getValue());
			}
		});
		
		return treeView;
	}
	
	private String getImage(MApplicationElement item) {
		if( item instanceof MApplication ) {
			return "Application.png";
		} else if( item instanceof MTrimmedWindow ) {
			return "WindowTrim.gif";
		} else if( item instanceof MToolBar ) {
			return "ToolBar.gif";
		} else if( item instanceof MDirectToolItem ) {
			return "DirectToolItem.gif";
		} else if( item instanceof MPartSashContainer ) {
			return ((MPartSashContainer) item).isHorizontal() ? "PartSashContainer.gif" : "PartSashContainer_vertical.gif";
		} else if( item instanceof MPart ) {
			return "Part.gif";
		} else if( item instanceof MPartStack ) {
			return "PartStack.gif";
		} else if( item instanceof MTrimBar ) {
			return "WindowTrim.gif";
		}
		return null;
	}
	
//	private ObservableValue<String> createObservable(MApplicationElement item) {
//		if( item instanceof MApplication ) {
//			return AdapterFactory.adapt(EMFProperties.value(ApplicationPackageImpl.Literals.APPLICATION_ELEMENT__ELEMENT_ID).observe(item));
//		} else if( item instanceof MWindow ) {
//			return AdapterFactory.adapt(EMFProperties.value(UiPackageImpl.Literals.UI_LABEL__LABEL).observe(item));
//		}
//		return null;
//	}
	
	static class ObservableFactoryImpl implements ObservableFactory<Object> {

		@Override
		public IObservableList createObservable(Object parent) {
			if( parent instanceof VirtualEntry ) {
				return ((VirtualEntry) parent).getList();
			} else if( parent instanceof MApplication ) {
				WritableList l = new WritableList();
				l.add(new VirtualEntry("Addons", (MApplicationElement) parent,ApplicationPackageImpl.Literals.APPLICATION__ADDONS));
				l.add(new VirtualEntry("Binding Contexts", (MApplicationElement) parent,CommandsPackageImpl.Literals.BINDING_TABLE_CONTAINER__ROOT_CONTEXT));
				l.add(new VirtualEntry("Binding Tables", (MApplicationElement) parent,CommandsPackageImpl.Literals.BINDING_TABLE_CONTAINER__BINDING_TABLES));
				l.add(new VirtualEntry("Handlers", (MApplicationElement) parent,CommandsPackageImpl.Literals.HANDLER_CONTAINER__HANDLERS));
				l.add(new VirtualEntry("Commands", (MApplicationElement) parent,ApplicationPackageImpl.Literals.APPLICATION__COMMANDS));
				l.add(new VirtualEntry("Command Categories", (MApplicationElement) parent,ApplicationPackageImpl.Literals.APPLICATION__CATEGORIES));
				l.add(new VirtualEntry("Part Descriptors", (MApplicationElement) parent,org.eclipse.e4.ui.model.application.descriptor.basic.impl.BasicPackageImpl.Literals.PART_DESCRIPTOR_CONTAINER__DESCRIPTORS));
				l.add(new VirtualEntry("Windows", (MApplicationElement) parent,UiPackageImpl.Literals.ELEMENT_CONTAINER__CHILDREN));
				l.add(new VirtualEntry("Snippets", (MApplicationElement) parent,UiPackageImpl.Literals.SNIPPET_CONTAINER__SNIPPETS));
				return l;
			} else if( parent instanceof MWindow ) {
				WritableList l = new WritableList();
				l.add(new VirtualEntry("Handlers", (MApplicationElement) parent,CommandsPackageImpl.Literals.HANDLER_CONTAINER__HANDLERS));
				l.add(new VirtualEntry("Windows", (MApplicationElement) parent,BasicPackageImpl.Literals.WINDOW__WINDOWS));
				l.add(new VirtualEntry("Controls", (MApplicationElement) parent,UiPackageImpl.Literals.ELEMENT_CONTAINER__CHILDREN));
				l.add(new VirtualEntry("Shared Elements", (MApplicationElement) parent,BasicPackageImpl.Literals.WINDOW__SHARED_ELEMENTS));
				if( parent instanceof MTrimmedWindow ) {
					l.add(new VirtualEntry("TrimBars", (MApplicationElement) parent,BasicPackageImpl.Literals.TRIMMED_WINDOW__TRIM_BARS));
				}
				return l;
			} else if( parent instanceof MPartSashContainer ) {
				return EMFProperties.list(UiPackageImpl.Literals.ELEMENT_CONTAINER__CHILDREN).observe(parent);
			} else if( parent instanceof MTrimBar ) {
				return EMFProperties.list(UiPackageImpl.Literals.ELEMENT_CONTAINER__CHILDREN).observe(parent);
			} else if( parent instanceof MToolBar ) {
				return EMFProperties.list(UiPackageImpl.Literals.ELEMENT_CONTAINER__CHILDREN).observe(parent);
			}
			
			return null;
		}
	}
	
	static class VirtualEntry {
		private MApplicationElement instance;
		private EStructuralFeature feature;
		private String label;
		
		public VirtualEntry(String label, MApplicationElement instance, EStructuralFeature feature) {
			this.label = label;
			this.instance = instance;
			this.feature = feature;
			
		}
		
		IObservableList getList() {
			return EMFProperties.list(feature).observe(instance);
		}
	}
}
