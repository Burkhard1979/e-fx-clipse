package at.bestsolution.efxclipse.styledtext.exp1;

public class DefaultContent implements StyledTextContent {

	private char[] textStore;
	private int lineCount;
	private int[][] lines = new int[50][2];
	private int expandExp = 1;

	@Override
	public void setText(String text) {
		textStore = text.toCharArray();
		indexLines();
	}
	
	public int getCharCount() {
//		int length = gapEnd - gapStart;
//		return (textStore.length - length);
		return textStore.length;
	}

	public String getTextRange(int start, int length) {
		return new String(textStore,start,length);
	}
	
	public String getLine(int index) {
		int start = lines[index][0];
		int length = lines[index][1];
		
		return new String(textStore,start,length);
	}
	
	public int getLineCount(){
		return lineCount;
	}
	
	public int getOffsetAtLine(int lineIndex) {
		int start = lines[lineIndex][0];
		return start;
	}
	
	void indexLines(){
		int start = 0;
		lineCount = 0;
		int textLength = textStore.length;
		int i;
		for (i = start; i < textLength; i++) {
			char ch = textStore[i];					
			if (ch == '\r') {
				// see if the next character is a LF
				if (i + 1 < textLength) {
					ch = textStore[i+1];
					if (ch == '\n') {
						i++;
					}
				}
				addLineIndex(start, i - start + 1);
				start = i + 1;
			} else if (ch == '\n') {
				addLineIndex(start, i - start + 1);
				start = i + 1;
			}
		}
		addLineIndex(start, i - start);
	}
	
	void addLineIndex(int start, int length) {
		int size = lines.length;
		if (lineCount == size) {
			// expand the lines by powers of 2
			int[][] newLines = new int[size+(int)Math.pow(2,expandExp)][2];
			System.arraycopy(lines, 0, newLines, 0, size);
			lines = newLines;
			expandExp++;
		}
		int[] range = new int[] {start, length};
		lines[lineCount] = range;
		lineCount++;
	}
}
