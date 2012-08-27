package at.bestsolution.efxclipse.runtime.examples.xtend;

import at.bestsolution.efxclipse.runtime.examples.xtend.ReflectionHelper;
import java.util.List;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class FXBuilder {
  public BorderPane FxBorderPane(final Node it, final Procedure1<? super BorderPane> f) {
    BorderPane _xblockexpression = null;
    {
      BorderPane _borderPane = new BorderPane();
      final BorderPane borderPane = _borderPane;
      f.apply(borderPane);
      _xblockexpression = (borderPane);
    }
    return _xblockexpression;
  }
  
  public Button FxButton(final Node it, final Procedure1<? super Button> f) {
    Button _xblockexpression = null;
    {
      Button _button = new Button();
      final Button button = _button;
      f.apply(button);
      _xblockexpression = (button);
    }
    return _xblockexpression;
  }
  
  public TextField FxTextfield(final Node it, final Procedure1<? super TextField> f) {
    TextField _xblockexpression = null;
    {
      TextField _textField = new TextField();
      final TextField textField = _textField;
      f.apply(textField);
      _xblockexpression = (textField);
    }
    return _xblockexpression;
  }
  
  public HBox FxHBox(final Node it, final Procedure1<? super HBox> f) {
    HBox _xblockexpression = null;
    {
      HBox _hBox = new HBox();
      final HBox box = _hBox;
      f.apply(box);
      _xblockexpression = (box);
    }
    return _xblockexpression;
  }
  
  public <N extends Object> N FxBean(final Object it, final Class<N> clazz, final Procedure1<? super N> f) {
    try {
      N _xblockexpression = null;
      {
        final N c = clazz.newInstance();
        f.apply(c);
        _xblockexpression = (c);
      }
      return _xblockexpression;
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public <N extends Object> N FxElement(final Object it, final Class<N> clazz, final List<Class<? extends Object>> types, final List<? extends Object> params, final Procedure1<? super N> f) {
    try {
      N _xblockexpression = null;
      {
        final N c = ReflectionHelper.<N>createInstance(clazz, types, params);
        f.apply(c);
        _xblockexpression = (c);
      }
      return _xblockexpression;
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
