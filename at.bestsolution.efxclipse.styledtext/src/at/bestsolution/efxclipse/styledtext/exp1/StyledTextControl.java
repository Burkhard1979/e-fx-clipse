package at.bestsolution.efxclipse.styledtext.exp1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.util.Callback;

public class StyledTextControl extends StackPane {
	private StyledTextContent content = new DefaultContent();
	
	private StyledTextRenderer renderer = new StyledTextRenderer();

	private ListView<Line> listView;
	
	private ObservableList<Line> lineList = FXCollections.observableArrayList();
	
	private Set<LineCell> visibleCells = new HashSet<>();
	
	public StyledTextControl() {
		listView = new ListView<>();
		listView.setCellFactory(new Callback<ListView<Line>, ListCell<Line>>() {
			
			@Override
			public ListCell<Line> call(ListView<Line> arg0) {
				return new LineCell();
			}
		});
		listView.setMinHeight(0);
		listView.setMinWidth(0);
		listView.setItems(lineList);
		getChildren().add(listView);
	}
	
	public void setText(String text) {
		content.setText(text);
		if( lineList.size() != content.getLineCount() ) {
			if( lineList.size() > content.getLineCount() ) {
				lineList.remove(content.getLineCount(), lineList.size());
			} else {
				List<Line> tmp = new ArrayList<>(content.getLineCount()-lineList.size());
				for( int i = lineList.size(); i <= content.getLineCount(); i++ ) {
					tmp.add(new Line());
				}
				lineList.addAll(tmp);
			}
		}
		
		for( LineCell l : visibleCells ) {
			l.update();
		}
	}
	
	public void setStyleRange(StyleRange range) {
		if (range != null) {
			if (range.isUnstyled()) {
				setStyleRanges(range.start, range.length, null, null, false);
			} else {
				setStyleRanges(range.start, 0, null, new StyleRange[]{range}, false);
			}
		} else {
			setStyleRanges(0, 0, null, null, true);
		}
	}
	
	public void setStyleRanges(int start, int length, int[] ranges, StyleRange[] styles) {
		if (ranges == null || styles == null) {
			setStyleRanges(start, length, null, null, false);
		} else {
			setStyleRanges(start, length, ranges, styles, false);
		}
	}
	
	public void setStyleRanges(int[] ranges, StyleRange[] styles) {
		if (ranges == null || styles == null) {
			setStyleRanges(0, 0, null, null, true);
		} else {
			setStyleRanges(0, 0, ranges, styles, true);
		}
	}
	
	public void setStyleRanges(StyleRange[] ranges) {
		setStyleRanges(0, 0, null, ranges, true);
	}
	
	public void replaceStyleRanges(int start, int length, StyleRange[] ranges) {
	 	if (ranges == null) throw new IllegalArgumentException();
	 	setStyleRanges(start, length, null, ranges, false);
	}
	
	void setStyleRanges(int start, int length, int[] ranges, StyleRange[] styles, boolean reset) {
		int charCount = content.getCharCount();
		int end = start + length;
		if (start > end || start < 0) {
			throw new IllegalArgumentException();
		}
		
		if (styles != null) {
			if (end > charCount) {
				throw new IllegalArgumentException();
			}
			if (ranges != null) {
				if (ranges.length != styles.length << 1) throw new IllegalArgumentException();
			}
			int lastOffset = 0;
//			boolean variableHeight = false; 
			for (int i = 0; i < styles.length; i ++) {
				if (styles[i] == null) {
					throw new IllegalArgumentException();
				}
				int rangeStart, rangeLength;
				if (ranges != null) {
					rangeStart = ranges[i << 1];
					rangeLength = ranges[(i << 1) + 1];
				} else {
					rangeStart = styles[i].start;
					rangeLength = styles[i].length;
				}
				if (rangeLength < 0) {
					throw new IllegalArgumentException(); 
				}
				if (!(0 <= rangeStart && rangeStart + rangeLength <= charCount)) {
					throw new IllegalArgumentException();
				}
				if (lastOffset > rangeStart) {
					throw new IllegalArgumentException();
				}
//				variableHeight |= styles[i].isVariableHeight();
				lastOffset = rangeStart + rangeLength;
			}
//			if (variableHeight) setVariableLineHeight();
		}
		
		if( reset ) {
			renderer.setStyleRanges(null, null);
		} else {
			renderer.updateRanges(start, length, length);
		}
		
		if (styles != null && styles.length > 0) {
			renderer.setStyleRanges(ranges, styles);
		}
		
		for( LineCell l : visibleCells ) {
			l.update();
		}
	}
	
	public StyleRange[] getStyleRanges(int start, int length, boolean includeRanges) {
		StyleRange[] ranges = renderer.getStyleRanges(start, length, includeRanges);
		if (ranges != null) return ranges;
		return new StyleRange[0];
	}
	
	class LineCell extends ListCell<Line> {
		private Line domainElement;
		
		public void update() {
			updateItem(domainElement, false);
		}
		
		@Override
		protected void updateItem(Line arg0, boolean arg1) {
			if( ! arg1 ) {
				domainElement = arg0;
				visibleCells.add(this);
				TextFlow flow = (TextFlow) getGraphic();
				if( flow == null ) {
					flow = new TextFlow();
					setGraphic(flow);
				}
				
				List<Text> texts = new ArrayList<>();
				for( Segment seg : arg0.getSegments() ) {
					Text t = new Text(seg.text);
					if( seg.fgColor != null ) {
						t.setFill(seg.fgColor);
					}
					texts.add(t);
				}
				
				flow.getChildren().setAll(texts);
				
//				flow.getChildren().setAll(new Text(arg0.getText()));
			} else {
				domainElement = null;
				visibleCells.remove(this);
			}
			super.updateItem(arg0, arg1);
		}
	}
	
	class Line {
		public String getText() {
			return removeLineending(content.getLine(lineList.indexOf(this)));
		}
		
		public List<Segment> getSegments() {
			int idx = lineList.indexOf(this);
			String line = content.getLine(idx);
			int start = content.getOffsetAtLine(idx);
			int length = line.length();
			List<Segment> segments = new ArrayList<>();
			StyleRange[] ranges = renderer.getStyleRanges(start, length, true);
			if( ranges == null ) {
				return Collections.emptyList();
			}
			for( StyleRange r : ranges ) {
				int begin = r.start-start;
				int end = r.start-start+r.length;
				Segment seg = new Segment();
				seg.text = removeLineending(line.substring(begin, end));
				seg.fgColor = r.foreground;
				segments.add(seg);
			}
			return segments;
		}
	}
	
	class Segment {
		public String text;
		public Color fgColor;
	}
	
	static String removeLineending(String s) {
		return s.replace("\n","").replace("\r", "");
	}
}
