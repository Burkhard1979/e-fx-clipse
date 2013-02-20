/*******************************************************************************
* Copyright (c) 2013 BestSolution.at and others.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
* 	Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
*******************************************************************************/
package at.bestsolution.efxclipse.styledtext.skin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Path;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.util.Callback;
import javafx.util.Duration;
import at.bestsolution.efxclipse.styledtext.StyleRange;
import at.bestsolution.efxclipse.styledtext.StyledTextArea;
import at.bestsolution.efxclipse.styledtext.behavior.StyledTextBehavior;

import com.sun.javafx.scene.control.skin.BehaviorSkinBase;
import com.sun.javafx.scene.text.HitInfo;

@SuppressWarnings("restriction")
public class StyledTextSkin extends BehaviorSkinBase<StyledTextArea, StyledTextBehavior> {
	private ListView<Line> listView;
	
	private ObservableList<Line> lineList = FXCollections.observableArrayList();
	
	private Set<LineCell> visibleCells = new HashSet<>();
	
	public StyledTextSkin(StyledTextArea styledText) {
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
		listView.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				final int offset = getSkinnable().getCaretOffset();
				switch (event.getCode()) {
				case SHIFT:
				case ALT:
				case CONTROL:
					break;
				case LEFT:
					getSkinnable().setCaretOffset(offset-1);
					break;
				case RIGHT:
					getSkinnable().setCaretOffset(offset+1);
					break;
				case UP:
				{
					int colIdx = offset - getSkinnable().getContent().getOffsetAtLine(listView.getSelectionModel().getSelectedIndex());
					int rowIdx = listView.getSelectionModel().getSelectedIndex()-1;
					getSkinnable().setCaretOffset(colIdx + getSkinnable().getContent().getOffsetAtLine(rowIdx));
					break;
				}
				case DOWN:
				{
					int colIdx = offset - getSkinnable().getContent().getOffsetAtLine(listView.getSelectionModel().getSelectedIndex());
					int rowIdx = listView.getSelectionModel().getSelectedIndex()+1;
					getSkinnable().setCaretOffset(colIdx + getSkinnable().getContent().getOffsetAtLine(rowIdx));
					break;
				}
				case ENTER:
					getSkinnable().getContent().replaceTextRange(getSkinnable().getCaretOffset(), 0, event.getText());
					listView.getSelectionModel().select(listView.getSelectionModel().getSelectedIndex()+1);
					getSkinnable().setCaretOffset(offset+1);
					break;
				case DELETE:
					getSkinnable().getContent().replaceTextRange(getSkinnable().getCaretOffset(), 1, "");
					getSkinnable().setCaretOffset(offset);
					break;
				case BACK_SPACE:
					getSkinnable().getContent().replaceTextRange(getSkinnable().getCaretOffset()-1, 1, "");
					getSkinnable().setCaretOffset(offset-1);
					break;
				default:
					getSkinnable().getContent().replaceTextRange(getSkinnable().getCaretOffset(), 0, event.getText());
					getSkinnable().setCaretOffset(offset+1);
					break;
				}
			}
		});
		listView.setOnMousePressed(new EventHandler<MouseEvent>() {

			@SuppressWarnings({ "deprecation" })
			@Override
			public void handle(MouseEvent arg0) {
				Point2D p = new Point2D(arg0.getX(), arg0.getY());
				for( LineCell cell : visibleCells ) {
					if( cell.getBoundsInParent().contains(p) ) {
						if( cell.domainElement != null ) {
							// Calculate to cell relative
							p = p.subtract(cell.getLayoutX(), cell.getLayoutY());
							RegionImpl g = (RegionImpl) cell.getGraphic();
							p = p.subtract(g.getLayoutX(), g.getLayoutY());
							
							TextFlow flow = (TextFlow) g.getChildren().get(0);
							// Calculate to text flow
							p = p.subtract(flow.getLayoutX(), flow.getLayoutY());
							for( Node n : flow.getChildren() ) {
								Text text = (Text) n;
								if( text.getBoundsInParent().contains(p) ) {
									HitInfo info = text.impl_hitTestChar(new Point2D(p.getX()-text.getLayoutX(), 0 /* See RT-28485 text.getLayoutY()*/));
									if( info.getInsertionIndex() >= 0 ) {
										int offset = ((Integer)text.getUserData()).intValue()+info.getInsertionIndex();
										getSkinnable().setCaretOffset(offset);
										return;
									}
								}
							}
							
							int offset = cell.domainElement.getLineOffset() + cell.domainElement.getLineLength();
							getSkinnable().setCaretOffset(offset);
						}
						break;
					}
				}
			}
		});
		
		recalculateItems();
		
		listView.setItems(lineList);
		getChildren().addAll(listView);
		
		styledText.caretOffsetProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable,
					Number oldValue, Number newValue) {
				int lineIndex = getSkinnable().getContent().getLineAtOffset(newValue.intValue());
				Line lineObject = lineList.get(lineIndex);
				for( LineCell c : visibleCells ) {
					if( c.domainElement == lineObject ) {
						
						RegionImpl container = (RegionImpl)c.getGraphic();
						TextFlow flow = (TextFlow)container.getChildren().get(0);
						
						flow.requestLayout();
						
						break;
					}
				}
			}
		});
	}
	
	@Override
	protected double computeMinHeight(double arg0) {
		return listView.minHeight(arg0);
	}
	
	@Override
	protected double computeMinWidth(double arg0) {
		return listView.minWidth(arg0);
	}
	
	public void recalculateItems() {
		if( lineList.size() != getSkinnable().getContent().getLineCount() ) {
			if( lineList.size() > getSkinnable().getContent().getLineCount() ) {
				lineList.remove(getSkinnable().getContent().getLineCount(), lineList.size());
			} else {
				List<Line> tmp = new ArrayList<>(getSkinnable().getContent().getLineCount()-lineList.size());
				for( int i = lineList.size(); i < getSkinnable().getContent().getLineCount(); i++ ) {
					tmp.add(new Line());
				}
				lineList.addAll(tmp);
			}
		}
		
		redraw();
	}
	
	public void redraw() {
		for( LineCell l : visibleCells ) {
			l.update();
		}
	}
	
	class LineCell extends ListCell<Line> {
		private Line domainElement;
		private BooleanBinding caretVisible;
		private BooleanProperty flashProperty;
		private Timeline flashTimeline;
		
		public LineCell() {
			flashProperty = new SimpleBooleanProperty(this,"flash",false);
			flashTimeline = new Timeline();
			flashTimeline.setCycleCount(Timeline.INDEFINITE);
			
			EventHandler<ActionEvent> startEvent = new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent arg0) {
					flashProperty.set(true);
				}
			};
			
			EventHandler<ActionEvent> endEvent = new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent arg0) {
					flashProperty.set(false);
				}
			};
			
			flashTimeline.getKeyFrames().addAll(new KeyFrame(Duration.ZERO, startEvent), new KeyFrame(Duration.millis(500), endEvent), new KeyFrame(Duration.millis(1000)));
			caretVisible = new BooleanBinding() {
				{
					bind(selectedProperty(), flashProperty);
				}
				@Override
				protected boolean computeValue() {
					return selectedProperty().get() && flashProperty.get();
				}
			};
			selectedProperty().addListener(new ChangeListener<Boolean>() {

				@Override
				public void changed(ObservableValue<? extends Boolean> arg0,
						Boolean arg1, Boolean arg2) {
					if( arg2.booleanValue() ) {
						flashTimeline.play();
					} else {
						flashTimeline.stop();
					}
				}
			});
		}
		
		public void update() {
			if( domainElement != null ) {
				updateItem(domainElement, false);	
			}
		}
		
		public void updateCaret() {
			int value = getSkinnable().getCaretOffset();
			if( value < 0 ) {
				return;
			}
			
			int lineIndex = getSkinnable().getContent().getLineAtOffset(value);
			Line lineObject = lineList.get(lineIndex);
			for( LineCell c : visibleCells ) {
				if( c.domainElement == lineObject ) {
					RegionImpl container = (RegionImpl)c.getGraphic();
					TextFlow flow = (TextFlow)container.getChildren().get(0);
					
					Text textNode = null;
					for( Node n : flow.getChildren()) {
						Integer i = (Integer) n.getUserData();
						
						if( i.intValue() >= value ) {
							break;
						}
						textNode = (Text) n;
					}
					
					if( textNode != null ) {
						int internalChar = value - ((Integer)textNode.getUserData()).intValue();
						textNode.setImpl_caretPosition(internalChar);
						
						final Path p = (Path)container.getChildren().get(1); 
						
						p.getElements().clear();
						p.getElements().addAll(textNode.getImpl_caretShape());
						
						p.setLayoutX(textNode.getLayoutX());
						p.setLayoutY(textNode.getBaselineOffset());
					} else if( ! flow.getChildren().isEmpty() ) {
						textNode = (Text) flow.getChildren().get(flow.getChildren().size()-1);
						textNode.setImpl_caretPosition(textNode.getText().length());
						
						final Path p = (Path)container.getChildren().get(1); 
						
						p.getElements().clear();
						p.getElements().addAll(textNode.getImpl_caretShape());
						
						p.setLayoutX(textNode.getLayoutX());
						p.setLayoutY(textNode.getBaselineOffset());
					}
					
					break;
				}
			}
		}
		
		@Override
		protected void updateItem(Line arg0, boolean arg1) {
			if( ! arg1 ) {
				domainElement = arg0;
				visibleCells.add(this);
				
				RegionImpl stack = (RegionImpl) getGraphic();
				TextFlow flow;
				
				if( stack == null ) {
					flow = new TextFlow() {
						@Override
						protected void layoutChildren() {
							super.layoutChildren();
							updateCaret();
						}
					};
					Path caretPath = new Path();
					caretPath.setManaged(false);
					caretPath.setStrokeWidth(1);
			        caretPath.setFill((Color.BLACK));
			        caretPath.setStroke((Color.BLACK));
			        caretPath.visibleProperty().bind(caretVisible);
					stack = new RegionImpl(flow,caretPath);
					setGraphic(stack);
				} else {
					flow = (TextFlow) stack.getChildren().get(0);
				}
				
				List<Text> texts = new ArrayList<>();
				for( final Segment seg : arg0.getSegments() ) {
					final Text t = new Text(seg.text);
					t.setUserData(seg.style.start);
					if( seg.style.foreground != null ) {
						t.setFill(seg.style.foreground);
					}
					if( seg.style.font != null ) {
						t.setFont(seg.style.font);
					}
					texts.add(t);
				}
				
				if( texts.isEmpty() ) {
					Text t = new Text("");
					t.setUserData(arg0.getLineOffset());
					texts.add(t);
				}
				
				flow.getChildren().setAll(texts);
				stack.requestLayout();
			} else {
				setGraphic(null);
				domainElement = null;
				visibleCells.remove(this);
			}
			super.updateItem(arg0, arg1);
		}
	}
	
	static class RegionImpl extends Region {
		public RegionImpl(Node... nodes) {
			getChildren().addAll(nodes);
		}
		
		@Override
		public ObservableList<Node> getChildren() {
			// TODO Auto-generated method stub
			return super.getChildren();
		}
	}
	
	class Line {
		public String getText() {
			return removeLineending(getSkinnable().getContent().getLine(lineList.indexOf(this)));
		}
		
		public int getLineOffset() {
			int idx = lineList.indexOf(this);
			return getSkinnable().getContent().getOffsetAtLine(idx);
		}
		
		public int getLineLength() {
			int idx = lineList.indexOf(this);
			String s = getSkinnable().getContent().getLine(idx);
			return s == null ? 0 : s.length();
		}
		
		public List<Segment> getSegments() {
			int idx = lineList.indexOf(this);
			List<Segment> segments = new ArrayList<>();
			
			String line = getSkinnable().getContent().getLine(idx);
			if( line != null ) {
				int start = getSkinnable().getContent().getOffsetAtLine(idx);
				int length = line.length();
				
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