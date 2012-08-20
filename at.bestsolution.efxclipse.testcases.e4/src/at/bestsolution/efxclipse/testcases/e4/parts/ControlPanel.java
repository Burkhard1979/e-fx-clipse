package at.bestsolution.efxclipse.testcases.e4.parts;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.util.Callback;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

@SuppressWarnings("restriction")
public class ControlPanel {
	
	@Inject
	public ControlPanel(BorderPane p, final MApplication application, final MWindow window, @Optional final MPerspective perspective, final EPartService partService, final EModelService modelService) {
		VBox box = new VBox();
		
		{
			TitledPane pane = new TitledPane();
			pane.setText("Part - to be rendered");
			
			HBox hbox = new HBox(10);
			
			final ComboBox<MPart> dd = new ComboBox<>();
			dd.setCellFactory(new Callback<ListView<MPart>, ListCell<MPart>>() {
				
				@Override
				public ListCell<MPart> call(ListView<MPart> param) {
					return new ListCell<MPart>() {
						@Override
						protected void updateItem(MPart item, boolean empty) {
							super.updateItem(item, empty);
							if( item != null ) {
								setText(item.getLocalizedLabel());
							}
						}
					};
				}
			});
			dd.setItems(FXCollections.observableArrayList(modelService.findElements(perspective == null ? application : perspective, null, MPart.class, null)));
			hbox.getChildren().add(dd);
			
			Button b = new Button("Toggle");
			b.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					MPart part = dd.getSelectionModel().getSelectedItem();
					part.setToBeRendered(!part.isToBeRendered());
				}
			});
			hbox.getChildren().add(b);
			pane.setContent(hbox);
			box.getChildren().add(pane);
		}
		
		{
			TitledPane pane = new TitledPane();
			pane.setText("Window Properties");
			
			VBox vbox = new VBox(10);
			
			{
				HBox hbox = new HBox(10);
				hbox.getChildren().add(new Label("X"));
				final TextField f = new TextField(window.getX()+"");
				hbox.getChildren().add(f);
				
				Button b = new Button("Set");
				b.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent event) {
						window.setX(Integer.parseInt(f.getText()));
					}
				});
				hbox.getChildren().add(b);
				vbox.getChildren().add(hbox);
			}
			
			{
				HBox hbox = new HBox(10);
				hbox.getChildren().add(new Label("Y"));
				final TextField f = new TextField(window.getY()+"");
				hbox.getChildren().add(f);
				
				Button b = new Button("Set");
				b.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent event) {
						window.setY(Integer.parseInt(f.getText()));
					}
				});
				hbox.getChildren().add(b);
				vbox.getChildren().add(hbox);
			}
			
			{
				HBox hbox = new HBox(10);
				hbox.getChildren().add(new Label("W"));
				final TextField f = new TextField(window.getWidth()+"");
				hbox.getChildren().add(f);
				
				Button b = new Button("Set");
				b.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent event) {
						window.setWidth(Integer.parseInt(f.getText()));
					}
				});
				hbox.getChildren().add(b);
				vbox.getChildren().add(hbox);
			}
			
			{
				HBox hbox = new HBox(10);
				hbox.getChildren().add(new Label("H"));
				final TextField f = new TextField(window.getHeight()+"");
				hbox.getChildren().add(f);
				
				Button b = new Button("Set");
				b.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent event) {
						window.setHeight(Integer.parseInt(f.getText()));
					}
				});
				hbox.getChildren().add(b);
				vbox.getChildren().add(hbox);
			}
			
			{
				HBox hbox = new HBox(10);
				hbox.getChildren().add(new Label("Title"));
				final TextField f = new TextField(window.getLabel()+"");
				hbox.getChildren().add(f);
				
				Button b = new Button("Set");
				b.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent event) {
						window.setLabel(f.getText());
					}
				});
				hbox.getChildren().add(b);
				vbox.getChildren().add(hbox);
			}
			
			
			pane.setContent(vbox);
			box.getChildren().add(pane);
		}
		
		p.setTop(box);
	}
}
