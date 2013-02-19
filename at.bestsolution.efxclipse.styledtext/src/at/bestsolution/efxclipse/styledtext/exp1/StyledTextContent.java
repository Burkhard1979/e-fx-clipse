package at.bestsolution.efxclipse.styledtext.exp1;


public interface StyledTextContent {
	public String getLine(int index);
	
	public String getTextRange(int start, int length);
	
	public void setText (String text);
	
	public int getCharCount();
	
	public int getLineCount();
	
	public int getOffsetAtLine(int lineIndex);
}
