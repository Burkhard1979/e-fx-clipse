package at.bestsolution.efxclipse.runtime.examples.xtend;

import at.bestsolution.efxclipse.runtime.examples.xtend.FXBuilder;
import java.io.PrintStream;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class MyStaticBuilderApplication extends Application {
  private FXBuilder b = new Function0<FXBuilder>() {
    public FXBuilder apply() {
      FXBuilder _fXBuilder = new FXBuilder();
      return _fXBuilder;
    }
  }.apply();
  
  private PrintStream out = System.out;
  
  public void start(final Stage primaryStage) throws Exception {
    final Procedure1<HBox> _function = new Procedure1<HBox>() {
        public void apply(final HBox it) {
          ObservableList<Node> _children = it.getChildren();
          final Procedure1<TextField> _function = new Procedure1<TextField>() {
              public void apply(final TextField it) {
                it.setId("helloField");
              }
            };
          TextField _FxTextfield = MyStaticBuilderApplication.this.b.FxTextfield(it, _function);
          _children.add(_FxTextfield);
          ObservableList<Node> _children_1 = it.getChildren();
          final Procedure1<Button> _function_1 = new Procedure1<Button>() {
              public void apply(final Button it) {
                it.setText("Say hello");
                final Procedure1<ActionEvent> _function = new Procedure1<ActionEvent>() {
                    public void apply(final ActionEvent it) {
                      Scene _scene = primaryStage.getScene();
                      Parent _root = _scene.getRoot();
                      Node _lookup = _root.lookup("#helloField");
                      final TextField f = ((TextField) _lookup);
                      String _text = f.getText();
                      MyStaticBuilderApplication.this.out.println(_text);
                    }
                  };
                it.setOnAction(new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent arg0) {
                      _function.apply(arg0);
                    }
                });
              }
            };
          Button _FxButton = MyStaticBuilderApplication.this.b.FxButton(it, _function_1);
          _children_1.add(_FxButton);
        }
      };
    final HBox p = this.b.FxHBox(null, _function);
    Scene _scene = new Scene(p);
    primaryStage.setScene(_scene);
    primaryStage.setWidth(300);
    primaryStage.show();
  }
  
  public static void main(final String[] args) {
    Application.launch(args);
  }
}
