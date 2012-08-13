package at.bestsolution.efxclipse.runtime.viewer;

public class Cell<E> {
	private E domainObject;
	private int columnIndex;
	
	public Cell(E domainObject, int columnIndex) {
		this.domainObject = domainObject;
		this.columnIndex = columnIndex;
	}
	
	public int getColumnIndex() {
		return columnIndex;
	}
	
	public E getDomainObject() {
		return domainObject;
	}
	
	void updateDomainObject(E domainObject) {
		this.domainObject = domainObject;
	}
}
