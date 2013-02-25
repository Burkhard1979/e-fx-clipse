package at.bestsolution.efxclipse.text.jface;

public interface ITextOperationTarget {
	static final int STRIP_PREFIX= 12;
	boolean canDoOperation(int operation);
	void doOperation(int operation);
}
