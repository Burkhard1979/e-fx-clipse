package at.bestsolution.efxclipse.runtime.viewer;

import java.util.List;

public interface TreeContentProvider<E> {
	public List<E> getChildren(E parent);
	public Boolean hasChildren(E parent);
}
