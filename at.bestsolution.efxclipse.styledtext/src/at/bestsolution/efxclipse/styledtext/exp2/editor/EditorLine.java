package at.bestsolution.efxclipse.styledtext.exp2.editor;

import at.bestsolution.efxclipse.styledtext.exp2.editor.skin.EditorLineSkin;
import javafx.scene.control.IndexedCell;
import javafx.scene.control.Skin;

public class EditorLine<T> extends IndexedCell<T> {


	@Override
	protected Skin<?> createDefaultSkin() {
		return new EditorLineSkin<>(this);
	}

}
