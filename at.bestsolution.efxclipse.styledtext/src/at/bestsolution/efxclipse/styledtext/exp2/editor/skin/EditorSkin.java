package at.bestsolution.efxclipse.styledtext.exp2.editor.skin;

import at.bestsolution.efxclipse.styledtext.exp2.editor.Editor;
import at.bestsolution.efxclipse.styledtext.exp2.editor.EditorLine;
import at.bestsolution.efxclipse.styledtext.exp2.editor.behavior.EditorBehavior;

import com.sun.javafx.scene.control.skin.BehaviorSkinBase;
import com.sun.javafx.scene.control.skin.VirtualContainerBase;
import com.sun.javafx.scene.control.skin.VirtualFlow;

import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.collections.WeakListChangeListener;
import javafx.util.Callback;

public class EditorSkin<T>  extends BehaviorSkinBase<Editor<T>, EditorBehavior<T>> {

	private class MyVirtualFlow<T> extends VirtualFlow<EditorLine<T>> {
		public MyVirtualFlow() {
			setCreateCell(new Callback<VirtualFlow, EditorLine<T>>() {
				@Override
				public EditorLine<T> call(VirtualFlow arg0) {
					return (EditorLine<T>) EditorSkin.this.createCell();
				}

			});
		}
	}
	
	// FROM VirtualContainerBase
	protected boolean rowCountDirty;
	 protected final VirtualFlow<EditorLine<T>> flow;
	 
	private ObservableList<T> editorLines;
	private boolean needCellsRebuilt = true;
	private boolean needCellsReconfigured = false;
	private int itemCount = -1;

	public EditorSkin(Editor<T> editor) {
		super(editor, new EditorBehavior<>(editor));

		flow = new MyVirtualFlow();
		
		System.err.println("SKIN CONSTRUCTED");
		
		updateEditorLines();

		// init the VirtualFlow
		flow.setId("virtual-flow");
		flow.setPannable(false);
		flow.setVertical(true);
		flow.setFocusTraversable(getSkinnable().isFocusTraversable());
		getChildren().add(flow);

		updateRowCount();

	}

	public EditorLine<T> createCell() {
		return new EditorLine<>();
	}

	public int getItemCount() {
		return 0;
	}

	protected void updateRowCount() {
		if (flow == null)
			return;

		int oldCount = flow.getCellCount();
		int newCount = editorLines == null ? 0 : editorLines.size();

		itemCount = newCount;

		flow.setCellCount(newCount);

		if (newCount != oldCount) {
			flow.rebuildCells();
		} else {
			flow.reconfigureCells();
		}

		if (newCount != oldCount) {
			needCellsRebuilt = true;
		} else {
			needCellsReconfigured = true;
		}
	}

	private final ListChangeListener<T> listViewItemsListener = new ListChangeListener<T>() {
		@Override
		public void onChanged(Change<? extends T> c) {
			rowCountDirty = true;
			getSkinnable().requestLayout();
		}
	};
	
	private final WeakListChangeListener<T> weakListViewItemsListener = new WeakListChangeListener<T>(
			listViewItemsListener);

	public void updateEditorLines() {
		if (editorLines != null) {
			editorLines.removeListener(weakListViewItemsListener);
		}

		this.editorLines = getSkinnable().getLines();

		if (editorLines != null) {
			editorLines.addListener(weakListViewItemsListener);
		}

		rowCountDirty = true;
		getSkinnable().requestLayout();
	}

	@Override
	protected void layoutChildren(final double x, final double y,
			final double w, final double h) {
		super.layoutChildren(x, y, w, h);

		if (needCellsRebuilt) {
			flow.rebuildCells();
		} else if (needCellsReconfigured) {
			flow.reconfigureCells();
		}

		needCellsRebuilt = false;
		needCellsReconfigured = false;

		flow.resizeRelocate(x, y, w, h);
	}


	
}
