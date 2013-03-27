package at.bestsolution.efxclipse.runtime.demo.contacts.views;

import javafx.beans.value.ObservableValue;
import javafx.beans.value.ObservableValueBase;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableColumn.CellDataFeatures;
import javafx.util.Callback;

class TreeTableProxyCellValueFactory implements
		Callback<TreeTableColumn.CellDataFeatures<Object, Object>, ObservableValue<Object>> {
	@Override
	public ObservableValue<Object> call(final CellDataFeatures<Object, Object> features) {
		return new ObservableValueBase<Object>() {

			@Override
			public Object getValue() {
				return features.getValue();
			}

		};
	}
}