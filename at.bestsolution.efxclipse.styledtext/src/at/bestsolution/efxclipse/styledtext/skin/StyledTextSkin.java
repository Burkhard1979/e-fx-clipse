package at.bestsolution.efxclipse.styledtext.skin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.util.Callback;
import at.bestsolution.efxclipse.styledtext.StyleRange;
import at.bestsolution.efxclipse.styledtext.StyledText;
import at.bestsolution.efxclipse.styledtext.behavior.StyledTextBehavior;

import com.sun.javafx.scene.control.skin.BehaviorSkinBase;

public class StyledTextSkin extends BehaviorSkinBase<StyledText, StyledTextBehavior> {
	private ListView<Line> listView;
	
	private ObservableList<Line> lineList = FXCollections.observableArrayList();
	
	private Set<LineCell> visibleCells = new HashSet<>();
	
	public StyledTextSkin(StyledText styledText) {
		super(styledText, new StyledTextBehavior(styledText));
		
		listView = new ListView<>();
		listView.setCellFactory(new Callback<ListView<Line>, ListCell<Line>>() {
			
			@Override
			public ListCell<Line> call(ListView<Line> arg0) {
				return new LineCell();
			}
		});
		listView.setMinHeight(0);
		listView.setMinWidth(0);
		
		recalculateItems();
		
		listView.setItems(lineList);
		getChildren().add(listView);
	}
	
	private void recalculateItems() {
		if( lineList.size() != getSkinnable().getContent().getLineCount() ) {
			if( lineList.size() > getSkinnable().getContent().getLineCount() ) {
				lineList.remove(getSkinnable().getContent().getLineCount(), lineList.size());
			} else {
				List<Line> tmp = new ArrayList<>(getSkinnable().getContent().getLineCount()-lineList.size());
				for( int i = lineList.size(); i <= getSkinnable().getContent().getLineCount(); i++ ) {
					tmp.add(new Line());
				}
				lineList.addAll(tmp);
			}
		}
		
		for( LineCell l : visibleCells ) {
			l.update();
		}
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
					if( seg.style.foreground != null ) {
						t.setFill(seg.style.foreground);
					}
					if( seg.style.font != null ) {
						t.setFont(seg.style.font);
					}
					texts.add(t);
				}
				
				flow.getChildren().setAll(texts);
			} else {
				domainElement = null;
				visibleCells.remove(this);
			}
			super.updateItem(arg0, arg1);
		}
	}
	
	class Line {
		public String getText() {
			return removeLineending(getSkinnable().getContent().getLine(lineList.indexOf(this)));
		}
		
		public List<Segment> getSegments() {
			int idx = lineList.indexOf(this);
			String line = getSkinnable().getContent().getLine(idx);
			int start = getSkinnable().getContent().getOffsetAtLine(idx);
			int length = line.length();
			List<Segment> segments = new ArrayList<>();
			StyleRange[] ranges = getSkinnable().getStyleRanges(start, length, true);
			if( ranges == null ) {
				return Collections.emptyList();
			}
			for( StyleRange r : ranges ) {
				int begin = r.start-start;
				int end = r.start-start+r.length;
				Segment seg = new Segment();
				seg.text = removeLineending(line.substring(begin, end));
				seg.style = r;
				segments.add(seg);
			}
			return segments;
		}
	}
	
	class Segment {
		public String text;
		public StyleRange style;
	}
	
	static String removeLineending(String s) {
		return s.replace("\n","").replace("\r", "");
	}
}