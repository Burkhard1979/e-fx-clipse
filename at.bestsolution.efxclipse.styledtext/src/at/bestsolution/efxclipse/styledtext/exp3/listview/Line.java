package at.bestsolution.efxclipse.styledtext.exp3.listview;

import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Line {
	
	public int num;
	public final ObservableList<StyledSegment> segments = FXCollections.observableArrayList();
	
	public Line(int num, StyledSegment... segments) {
		this.num = num;
		this.segments.addAll(segments);
	}
}