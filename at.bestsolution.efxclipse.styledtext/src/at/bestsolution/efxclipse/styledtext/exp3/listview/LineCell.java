package at.bestsolution.efxclipse.styledtext.exp3.listview;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.geometry.Insets;
import javafx.scene.control.ListCell;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.TextFlow;

class LineCell extends ListCell<Line> {
	Line domainObject;
	
	protected TextFlow lineBox;
	protected TextFlow lineNr;
	protected TextFlow lineContent;

	protected Text lineNrText;
	
	private Set<LineCell> visibleItems;
	private InvalidationListener listener = new InvalidationListener() {
		
		@Override
		public void invalidated(Observable arg0) {
			updateItem(domainObject, false);
		}
	};
	
	public LineCell(Set<LineCell> visibleItems) {
		this.visibleItems = visibleItems;
		
	    lineBox = new TextFlow();
	        
//	        lineBox.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(0), new Insets(0))));
        
        lineNr = new TextFlow();
       
        lineNr.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, CornerRadii.EMPTY, Insets.EMPTY)));
        lineNr.setBorder(new Border(new BorderStroke(Color.GRAY, Color.GRAY, Color.GRAY, Color.GRAY, BorderStrokeStyle.NONE, BorderStrokeStyle.SOLID, BorderStrokeStyle.NONE, BorderStrokeStyle.NONE, CornerRadii.EMPTY, new BorderWidths(0, 1, 0, 0), new Insets(0, 0, 0, 0))));
        lineNr.setPadding(new Insets(0, 10, 0, 5));
        lineNr.setTextAlignment(TextAlignment.RIGHT);
        lineNr.setPrefWidth(50);
        lineContent = new TextFlow();
        
        lineBox.getChildren().addAll(lineNr, lineContent);
        
        
        lineNrText = new Text("");
        lineNrText.setStyle("-fx-font-family: monospace; -fx-font-size: 16px;");
		
//	        nr.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(5), new Insets(2))));
        lineNr.getChildren().add(lineNrText);
        
        Text name = new Text("EditorLine");
        lineContent.getChildren().add(name);
        
        setStyle("-fx-padding: 0;");
        
        setGraphic(lineBox);
	}
	
	@Override
	protected void updateItem(Line line, boolean empty) {
		if( ! empty ) {
			if( domainObject != null ) {
				domainObject.segments.removeListener(listener);
			}
			domainObject = line;
			
			domainObject.segments.addListener(listener);
			
			visibleItems.add(this);
//			TextFlow flow = (TextFlow) getGraphic();
//			if( flow == null ) {
//				flow = new TextFlow();
//			}
//			
//			List<Text> texts = new ArrayList<>(domainObject.segments.size());
//			for( StyledSegment s : domainObject.segments ) {
//				texts.add(createText(s));
//			}
//			
//			flow.getChildren().setAll(texts);
//			
//			setGraphic(flow);
			
			lineNrText.setText("" + line.num);
	    	List<Text> texts = new ArrayList<>(line.segments.size());
			for( StyledSegment s : line.segments ) {
				texts.add(createText(s));
			}
			
			lineContent.getChildren().setAll(texts);
			setGraphic(lineBox);
			
		} else {
			if( domainObject != null ) {
				domainObject.segments.removeListener(listener);
			}
			domainObject = null;
			visibleItems.remove(this);
		}
		super.updateItem(line, empty);
	}
	
	private Text createText(StyledSegment segment) {
		Text t = new Text(segment.text);
		t.setStyle("-fx-font-family: monospace; -fx-font-size: 16px;");
		t.setFill(segment.color);
		return t;
	}
}