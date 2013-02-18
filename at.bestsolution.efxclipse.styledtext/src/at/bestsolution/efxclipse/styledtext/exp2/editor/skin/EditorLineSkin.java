package at.bestsolution.efxclipse.styledtext.exp2.editor.skin;

import javafx.geometry.Orientation;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;

import at.bestsolution.efxclipse.styledtext.exp2.editor.EditorLine;
import at.bestsolution.efxclipse.styledtext.exp2.editor.behavior.EditorLineBehavior;

import com.sun.javafx.scene.control.behavior.ListCellBehavior;
import com.sun.javafx.scene.control.skin.CellSkinBase;

public class EditorLineSkin<T> extends CellSkinBase<EditorLine<T>, EditorLineBehavior<T>> {

    public EditorLineSkin(EditorLine<T> control) {
        super(control, new EditorLineBehavior(control));
    }

//    @Override protected double computePrefWidth(double height) {
//        double pref = super.computePrefWidth(height);
//        ListView listView = getSkinnable().getEditor();
//        return listView == null ? 0 :
//            listView.getOrientation() == Orientation.VERTICAL ? pref : Math.max(pref, getCellSize());
//    }
// 
//    @Override protected double computePrefHeight(double width) {
////        if (cellSizeSet) {
//            // Added the comparison between the default cell size and the requested
//            // cell size to prevent the issue identified in RT-19873.
//            double cellSize = getCellSize();
//            return cellSize == DEFAULT_CELL_SIZE ? super.computePrefHeight(width) : cellSize;
////        } else {
////            return Math.max(DEFAULT_CELL_SIZE, super.computePrefHeight(width));
////        }
//    }

}
