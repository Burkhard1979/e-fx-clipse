package at.bestsolution.efxclipse.runtime.workbench.renderers.def;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javafx.application.ConditionalFeature;
import javafx.application.Platform;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.util.Callback;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimBar;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.model.application.ui.basic.MWindowElement;
import org.eclipse.e4.ui.model.application.ui.menu.MMenu;
import org.eclipse.e4.ui.workbench.IResourceUtilities;
import org.eclipse.e4.ui.workbench.UIEvents;
import org.eclipse.e4.ui.workbench.modeling.ISaveHandler.Save;
import org.eclipse.emf.common.util.URI;

import at.bestsolution.efxclipse.runtime.dialogs.Dialog;
import at.bestsolution.efxclipse.runtime.dialogs.MessageDialog;
import at.bestsolution.efxclipse.runtime.dialogs.MessageDialog.QuestionCancel;
import at.bestsolution.efxclipse.runtime.panels.FillLayoutPane;
import at.bestsolution.efxclipse.runtime.workbench.internal.key.KeyBindingDispatcher;
import at.bestsolution.efxclipse.runtime.workbench.renderers.base.BaseWindowRenderer;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WLayoutedWidget;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WWidget;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WWindow;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.impl.WLayoutedWidgetImpl;

@SuppressWarnings("restriction")
public class DefWindowRenderer extends BaseWindowRenderer<Stage> {
	
	protected Save[] promptToSave(IResourceUtilities<Image> resourceUtilities, Collection<MPart> dirtyParts, WWindow<Stage> widget) {
		Save[] response = new Save[dirtyParts.size()];
		
		MultiMessageDialog d = new MultiMessageDialog((Stage)widget.getWidget(), dirtyParts, resourceUtilities);
		if( d.open() == Dialog.OK_BUTTON ) {
			List<MPart> parts = d.getSelectedParts();
			Arrays.fill(response, Save.NO);
			for( MPart p : parts ) {
				response[parts.indexOf(p)] = Save.YES;
			}
		} else {
			Arrays.fill(response, Save.CANCEL);
		}
		
		return response;
	}
	
	protected Save promptToSave(IResourceUtilities<Image> resourceUtilities, MPart dirtyPart, WWindow<Stage> widget) {
		QuestionCancel r = MessageDialog.openQuestionCancelDialog((Stage)widget.getWidget(), "Unsaved changes", "'"+dirtyPart.getLocalizedLabel()+"' has been modified. Save changes?");
		
		switch (r) {
		case CANCEL:
			return Save.CANCEL;
		case NO:
			return Save.NO;
		case YES:
			return Save.YES;
		}
		
		return Save.CANCEL;
	}
	
	@Override
	protected Class<? extends WWindow<Stage>> getWidgetClass() {
		return WWindowImpl.class;
	}
	
	public static class WWindowImpl extends WLayoutedWidgetImpl<Stage, BorderPane, MWindow> implements WWindow<Stage> {
		private boolean support3d;
		private BorderPane rootPane;
		private BorderPane trimPane;
		private FillLayoutPane contentPane;
		private KeyBindingDispatcher dispatcher;
		
		@Inject
		public WWindowImpl(@Named("fx.scene.3d") @Optional Boolean support3d, KeyBindingDispatcher dispatcher) {
			this.support3d = support3d != null && support3d.booleanValue();
			this.dispatcher = dispatcher;
		}

		@Override
		protected Stage createWidget() {
			Stage stage = new Stage();
			stage.addEventFilter(KeyEvent.KEY_PRESSED, dispatcher.getKeyHandler());
			this.rootPane = new BorderPane();
			this.trimPane = new BorderPane();
			this.rootPane.setCenter(trimPane);
			this.contentPane = new FillLayoutPane();
			this.trimPane.setCenter(contentPane);
			
			// TODO Should we create the scene on show???
			Scene s;
			if( support3d && Platform.isSupported(ConditionalFeature.SCENE3D) ) {
				s = new Scene(rootPane,-1,-1,true);
				s.setCamera(new PerspectiveCamera());
				
			} else {
				s = new Scene(rootPane);
			}
			
			s.focusOwnerProperty().addListener(new ChangeListener<Node>() {
				List<WWidget<?>> lastActivationTree = new ArrayList<WWidget<?>>();
				
				@Override
				public void changed(ObservableValue<? extends Node> observable, Node oldValue, Node newValue) {
					if( newValue != null ) {
						final List<WWidget<?>> activationTree = new ArrayList<WWidget<?>>();
						
						do {
							if( newValue.getUserData() instanceof WWidget<?> ) {
								activationTree.add((WWidget<?>) newValue.getUserData());
							}
						} while( (newValue = newValue.getParent()) != null );
						
						
						if( ! lastActivationTree.equals(activationTree) ) {
							final List<WWidget<?>> oldTreeReversed = new ArrayList<WWidget<?>>(lastActivationTree);
							final List<WWidget<?>> newTreeReversed = new ArrayList<WWidget<?>>(activationTree);
							Collections.reverse(oldTreeReversed);
							Collections.reverse(newTreeReversed);
							Iterator<WWidget<?>> it = newTreeReversed.iterator();
							
							while( it.hasNext() ) {
								if( ! oldTreeReversed.isEmpty() ) {
									if( oldTreeReversed.get(0) == it.next() ) {
										oldTreeReversed.remove(0);
										it.remove();
									} else {
										break;
									}
								} else {
									break;
								}
							}
							
							
							Collections.reverse(oldTreeReversed);
							Collections.reverse(newTreeReversed);
							
							lastActivationTree = activationTree;
							
							// Delay the execution maybe there's an intermediate
							// state we are not interested in
							// http://javafx-jira.kenai.com/browse/RT-24069
							Platform.runLater(new Runnable() {
								
								@Override
								public void run() {
									if( lastActivationTree == activationTree ) {
										for( WWidget<?> w : oldTreeReversed ) {
											w.deactivate();
										}
										
										for( WWidget<?> w : newTreeReversed ) {
											w.activate();
										}	
									} else {
										System.err.println("Canceled intermediate state");
									}
								}
							});
						}
					}
				}
			});
			
			stage.setScene(s);

			return stage;
		}
		
		@Override
		public void setMainMenu(WLayoutedWidget<MMenu> menuWidget) {
			this.rootPane.setTop(menuWidget.getStaticLayoutNode());
		}
		
		@Override
		protected BorderPane getWidgetNode() {
			return rootPane;
		}
		
		@Inject
		public void setX(@Named(UIEvents.Window.X) int x) {
			getWidget().setX(x);
		}

		@Inject
		public void setY(@Named(UIEvents.Window.Y) int y) {
			getWidget().setY(y);
		}

		@Inject
		public void setWidth(@Named(UIEvents.Window.WIDTH) int w) {
			getWidget().setWidth(w);
		}

		@Inject
		public void setHeight(@Named(UIEvents.Window.HEIGHT) int h) {
			getWidget().setHeight(h);
		}
		
		@Override
		public void addStyleClasses(List<String> classnames) {
			rootPane.getStyleClass().addAll(classnames);
		}
		
		@Override
		public void setStyleId(String id) {
			rootPane.setId(id);
		}

		@Override
		public void show() {
			getWidget().toFront();
			getWidget().show();
		}
		
		@Inject
		public void setTitle(@Named(ATTRIBUTE_localizedLabel) String title) {
			getWidget().setTitle(title);
		}
		
		@Override
		public void setBottomTrim(WLayoutedWidget<MTrimBar> trimBar) {
			trimPane.setBottom(trimBar.getStaticLayoutNode());
		} 
		
		@Override
		public void setLeftTrim(WLayoutedWidget<MTrimBar> trimBar) {
			trimPane.setLeft(trimBar.getStaticLayoutNode());
		}
		
		@Override
		public void setRightTrim(WLayoutedWidget<MTrimBar> trimBar) {
			trimPane.setRight(trimBar.getStaticLayoutNode());
		}
		
		@Override
		public void setTopTrim(WLayoutedWidget<MTrimBar> trimBar) {
			Node g = trimBar.getStaticLayoutNode();
			trimPane.setTop(g);
		}
		
		@Override
		public void addChild(WLayoutedWidget<MWindowElement> widget) {
			contentPane.getChildren().add(widget.getStaticLayoutNode());
		}
	}
	
	static class MultiMessageDialog extends Dialog {
		private Collection<MPart> parts;
		private TableView<Row> tabView;
		
		private final IResourceUtilities<Image> resourceUtilities;
		private List<MPart> selectedParts;
		
		public MultiMessageDialog(Window parent, Collection<MPart> parts, IResourceUtilities<Image> resourceUtilities) {
			super(parent, "Save Resources");
			this.parts = parts;
			this.resourceUtilities = resourceUtilities;
		}
		
		public List<MPart> getSelectedParts() {
			return selectedParts;
		}

		@Override
		protected void okPressed() {
			selectedParts = new ArrayList<MPart>();
			for(Row r: tabView.getItems() ) {
				if( r.isSelected() ) {
					selectedParts.add(r.element.get());
				}
			}
			System.err.println(selectedParts);
			super.okPressed();
		}
		
		@Override
		protected Node createDialogArea() {
			BorderPane p = new BorderPane();
			Label l = new Label("Save resources to save");
			p.setTop(l);
			
			tabView = new TableView<Row>();
			
			{
				TableColumn<Row,Boolean> column = new TableColumn<Row, Boolean>();
				column.setCellFactory(new Callback<TableColumn<Row,Boolean>, TableCell<Row,Boolean>>() {
					
					@Override
					public TableCell<Row, Boolean> call(final TableColumn<Row, Boolean> param) {
						final CheckBox checkBox = new CheckBox();
						final TableCell<Row, Boolean> cell = new TableCell<Row, Boolean>() {
							
							@Override
							protected void updateItem(Boolean item, boolean empty) {
								super.updateItem(item, empty);
								if( item == null ) {
									checkBox.setDisable(true);
									checkBox.setSelected(false);
									checkBox.setOnAction(null);
								} else {
									checkBox.setDisable(false);
									checkBox.setSelected(item);
									checkBox.setOnAction(new EventHandler<ActionEvent>() {
										
										@Override
										public void handle(ActionEvent event) {
											tabView.edit(0, param);
											commitEdit(checkBox.isSelected());
										}
									});
								}
							}
						};
						
						cell.setGraphic(checkBox);
						return cell;
					}
				});
				column.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Row,Boolean>>() {
					
					@Override
					public void handle(CellEditEvent<Row, Boolean> event) {
						event.getRowValue().selected.set(event.getNewValue());
					}
				});
				column.setCellValueFactory(new PropertyValueFactory<Row, Boolean>("selected"));
				tabView.getColumns().add(column);				
			}
			
			{
				TableColumn<Row,MPart> column = new TableColumn<Row, MPart>();
				column.setCellFactory(new Callback<TableColumn<Row,MPart>, TableCell<Row,MPart>>() {
					
					@Override
					public TableCell<Row, MPart> call(TableColumn<Row, MPart> param) {
						return new TableCell<DefWindowRenderer.Row, MPart>() {
							@Override
							protected void updateItem(MPart item, boolean empty) {
								super.updateItem(item, empty);
								if( item != null ) {
									setText(item.getLocalizedLabel());
									String uri = item.getIconURI();
									if( uri != null ) {
										setGraphic(new ImageView(resourceUtilities.imageDescriptorFromURI(URI.createURI(uri))));
									}
								}
							}
						};
					}
				});
				column.setCellValueFactory(new PropertyValueFactory<Row, MPart>("element"));
				tabView.getColumns().add(column);
			}
			tabView.setEditable(true);
			
			List<Row> list = new ArrayList<Row>();
			for( MPart m : parts ) {
				list.add(new Row(m));
			}
			tabView.setItems(FXCollections.observableArrayList(list));
			p.setCenter(tabView);
			
			return p;
		}
	}
	
	public static class Row {
		private BooleanProperty selected = new SimpleBooleanProperty(this,"selected",true);
		private ObjectProperty<MPart> element = new SimpleObjectProperty<MPart>(this, "element");
		
		public Row(MPart element) {
			this.element.set(element);
		}
		
		public boolean isSelected() {
			return selected.get();
		}
		
		public void setSelected(boolean value) {
			this.selected.set(value);
		}
		
		public BooleanProperty selectedProperty() {
			return this.selected;
		}
		
		public MPart getElement() {
			return element.get();
		}
		
		public void setElement(MPart value) {
			element.set(value);
		}
		
		public ObjectProperty<MPart> elementProperty() {
			return element;
		}
	}
}
