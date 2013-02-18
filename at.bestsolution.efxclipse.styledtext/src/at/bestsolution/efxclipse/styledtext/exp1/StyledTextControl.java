package at.bestsolution.efxclipse.styledtext.exp1;

import javafx.scene.layout.StackPane;

public class StyledTextControl extends StackPane {
	private StyledTextContent buffer = new DefaultContent();
	
	private StyledTextRenderer renderer = new StyledTextRenderer();
	
	
	public void setText(String text) {
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
		int charCount = buffer.getCharCount();
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
	}
}
