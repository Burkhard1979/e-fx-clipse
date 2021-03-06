package at.bestsolution.efxclipse.tutorial.fxgraph;

import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Launch extends Application {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Launch.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent p = (Parent) FXMLLoader.load(Launch.class.getResource("HelloWorld.fxml"), ResourceBundle.getBundle("at.bestsolution.efxclipse.tutorial.fxgraph.messages"));
		Scene s = new Scene(p);
		primaryStage.setScene(s);
		primaryStage.show();
	
	}

}
