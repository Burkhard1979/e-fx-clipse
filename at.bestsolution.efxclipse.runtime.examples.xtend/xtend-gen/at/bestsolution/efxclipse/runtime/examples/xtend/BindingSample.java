package at.bestsolution.efxclipse.runtime.examples.xtend;

import at.bestsolution.efxclipse.runtime.examples.xtend.PropertyExtension;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class BindingSample extends Application {
  public void start(final Stage stage) throws Exception {
    Label _label = new Label("Hello World");
    final Label l = _label;
    Slider _slider = new Slider();
    final Slider sl_1 = _slider;
    Slider _slider_1 = new Slider();
    final Slider sl_2 = _slider_1;
    BorderPane _borderPane = new BorderPane();
    final Procedure1<BorderPane> _function = new Procedure1<BorderPane>() {
        public void apply(final BorderPane it) {
          Insets _insets = new Insets(10);
          it.setPadding(_insets);
          it.setTop(sl_1);
          it.setCenter(l);
          it.setBottom(sl_2);
        }
      };
    final BorderPane root = ObjectExtensions.<BorderPane>operator_doubleArrow(_borderPane, _function);
    DoubleProperty _valueProperty = sl_1.valueProperty();
    DoubleProperty _valueProperty_1 = sl_2.valueProperty();
    PropertyExtension.operator_upTo(_valueProperty, _valueProperty_1);
    DoubleProperty _scaleXProperty = l.scaleXProperty();
    DoubleProperty _valueProperty_2 = sl_2.valueProperty();
    PropertyExtension.operator_mappedTo(_scaleXProperty, _valueProperty_2);
    DoubleProperty _scaleYProperty = l.scaleYProperty();
    DoubleProperty _valueProperty_3 = sl_2.valueProperty();
    PropertyExtension.operator_mappedTo(_scaleYProperty, _valueProperty_3);
    Scene _scene = new Scene(root);
    stage.setScene(_scene);
    stage.setWidth(600);
    stage.setHeight(600);
    stage.show();
  }
  
  public static void main(final String[] args) {
    Application.launch(args);
  }
}
