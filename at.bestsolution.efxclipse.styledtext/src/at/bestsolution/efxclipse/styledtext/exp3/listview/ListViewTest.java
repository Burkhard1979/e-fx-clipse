package at.bestsolution.efxclipse.styledtext.exp3.listview;

import java.util.HashSet;
import java.util.Set;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Callback;

public class ListViewTest extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane mainPane = new BorderPane();
		
		final Set<LineCell> activeCells = new HashSet<>();
		ListView<Line> view = new ListView<>();
		view.setCellFactory(new Callback<ListView<Line>, ListCell<Line>>() {
			
			@Override
			public LineCell call(ListView<Line> arg0) {
				return new LineCell(activeCells);
			}
		});
		
		ObservableList<Line> lines = FXCollections.observableArrayList();
		
		for( int i = 0; i < 3_000; i++ ) {
			Line l = new Line(i, new StyledSegment(i+"",Color.BLUE), new StyledSegment(" - Hello World", Color.BLACK));
			lines.add(l);
		}
		
		Button b = new Button("Update it");
		b.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				for( LineCell c : activeCells ) {
					c.domainObject.segments.add(new StyledSegment(" A new value", Color.GREEN));
				}
			}
		});
		
		
		view.setItems(lines);
		view.setMinWidth(0);
		view.setMinHeight(0);
		mainPane.setCenter(view);
		
		mainPane.setBottom(b);
		
		Scene s = new Scene(mainPane);
		primaryStage.setScene(s);
		primaryStage.setWidth(300);
		primaryStage.setHeight(400);
		primaryStage.setTitle("Java Source Viewer");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

