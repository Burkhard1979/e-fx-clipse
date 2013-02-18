package at.bestsolution.efxclipse.styledtext.exp2.editor;

import java.lang.ref.WeakReference;

import at.bestsolution.efxclipse.styledtext.exp2.editor.skin.EditorSkin;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Control;
import javafx.scene.control.Skin;

public class Editor<T> extends Control {

	private ObjectProperty<ObservableList<T>> lines;

	public Editor() {
		setLines(FXCollections.<T>observableArrayList());
		
		
		
	}
	
	public final ObjectProperty<ObservableList<T>> linesProperty() {
		if (lines == null) {
			lines = new SimpleObjectProperty<ObservableList<T>>(this, "items") {
				WeakReference<ObservableList<T>> oldItemsRef;

				@Override
				protected void invalidated() {
					ObservableList<T> oldItems = oldItemsRef == null ? null
							: oldItemsRef.get();

					// FIXME temporary fix for RT-15793. This will need to be
					// properly fixed when time permits
					// if (getSelectionModel() instanceof
					// ListView.ListViewBitSetSelectionModel) {
					// ((ListView.ListViewBitSetSelectionModel<T>)getSelectionModel()).updateItemsObserver(oldItems,
					// getItems());
					// }
					// if (getFocusModel() instanceof
					// ListView.ListViewFocusModel) {
					// ((ListView.ListViewFocusModel<T>)getFocusModel()).updateItemsObserver(oldItems,
					// getItems());
					// }

					if (getSkin() instanceof EditorSkin) {
						EditorSkin<?> skin = (EditorSkin<?>) getSkin();
						skin.updateEditorLines();
					}

					oldItemsRef = new WeakReference<ObservableList<T>>(
							getLines());
				}
			};
		}
		return lines;
	}

	public final void setLines(ObservableList<T> value) {
		linesProperty().set(value);
	}

	public final ObservableList<T> getLines() {
		return lines == null ? null : lines.get();
	}

	@Override
	protected Skin<?> createDefaultSkin() {
		return new EditorSkin<>(this);
	}
	
}
