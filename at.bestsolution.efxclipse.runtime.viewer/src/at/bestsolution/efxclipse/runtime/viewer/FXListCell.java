package at.bestsolution.efxclipse.runtime.viewer;

import javafx.scene.Node;
import javafx.scene.control.ListCell;

public class FXListCell<E> extends ListCell<E> {
	private final CellLabelProvider<E> labelProvider;
	
	private final Cell<E> CACHE_CELL = new Cell<E>(null,0);
	
	public FXListCell(CellLabelProvider<E> labelProvider) {
		this.labelProvider = labelProvider;
	}
	
	@Override
	protected void updateItem(E item, boolean empty) {
		super.updateItem(item, empty);
		if( item != null && ! empty ) {
			CACHE_CELL.updateDomainObject(item);
			setGraphic((Node)labelProvider.getIcon(CACHE_CELL));
			setText(labelProvider.getText(CACHE_CELL));
		}
	}
}