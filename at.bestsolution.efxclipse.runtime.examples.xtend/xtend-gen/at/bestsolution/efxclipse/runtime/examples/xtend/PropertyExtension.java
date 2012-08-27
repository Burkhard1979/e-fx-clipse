package at.bestsolution.efxclipse.runtime.examples.xtend;

import javafx.beans.property.DoubleProperty;

@SuppressWarnings("all")
public class PropertyExtension {
  public static void operator_mappedTo(final DoubleProperty x, final DoubleProperty y) {
    x.bind(y);
  }
  
  public static void operator_upTo(final DoubleProperty x, final DoubleProperty y) {
    x.bindBidirectional(y);
  }
}
