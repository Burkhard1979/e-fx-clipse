package at.bestsolution.efxclipse.runtime.examples.xtend;

import java.io.PrintStream;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class MyApplication extends Application {
  private PrintStream out = System.out;
  
  public void start(final Stage primaryStage) throws Exception {
    BorderPane _borderPane = new BorderPane();
    final BorderPane root = _borderPane;
    Button _button = new Button();
    final Button button = _button;
    TextField _textField = new TextField();
    final TextField text = _textField;
    button.setText("Say Hello");
    final Procedure1<ActionEvent> _function = new Procedure1<ActionEvent>() {
        public void apply(final ActionEvent it) {
          String _text = text.getText();
          MyApplication.this.out.println(_text);
        }
      };
    button.setOnAction(new EventHandler<ActionEvent>() {
        public void handle(ActionEvent arg0) {
          _function.apply(arg0);
        }
    });
    root.setTop(text);
    root.setBottom(button);
    Scene _scene = new Scene(root);
    primaryStage.setScene(_scene);
    primaryStage.setWidth(300);
    primaryStage.show();
  }
  
  public static void main(final String[] args) {
    Application.launch(args);
  }
}
