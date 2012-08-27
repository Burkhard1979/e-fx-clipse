package at.bestsolution.efxclipse.runtime.viewer;

public interface CellLabelProvider<E> {
	
	public String getText(Cell<E> cell);
	
	public Object getIcon(Cell<E> cell);
}
