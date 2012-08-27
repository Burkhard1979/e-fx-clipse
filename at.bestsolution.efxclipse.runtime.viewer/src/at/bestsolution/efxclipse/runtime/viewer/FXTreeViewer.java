package at.bestsolution.efxclipse.runtime.viewer;

import java.util.ArrayList;
import java.util.List;

import javafx.collections.ObservableList;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

public class FXTreeViewer<E> {
	private TreeView<E> view;
	private TreeContentProvider<E> contentProvider;
	
	public FXTreeViewer() {
		view = new TreeView<E>();
	}

	public TreeView<E> getView() {
		return view;
	}
	
	public TreeContentProvider<E> getContentProvider() {
		return contentProvider;
	}
	
	public void refresh() {
		
	}
	
	public void refresh(E root) {
		
	}
	
	public void refresh(TreeView<E> rootItem) {
		
	}
	
	static class TreeItemImpl<E> extends TreeItem<E> {
		private boolean hasLoadedChildren = false;
		private final E domainObject;
		private final FXTreeViewer<E> owner;
		
		public TreeItemImpl(FXTreeViewer<E> owner, E domainObject) {
			this.owner = owner;
			this.domainObject = domainObject;
		}
		
		@Override
		public ObservableList<TreeItem<E>> getChildren() {
			if (hasLoadedChildren == false) {
				loadChildren();
			}
			return super.getChildren();
		}

		public boolean isLeaf() {
			Boolean b = owner.getContentProvider().hasChildren(domainObject);
			if( b == null ) {
				if (hasLoadedChildren == false) {
					loadChildren();
				}
				return super.getChildren().isEmpty();	
			} else {
				return b;
			}
		}

		private void loadChildren() {
			List<E> domainList = owner.getContentProvider().getChildren(domainObject);
			List<TreeItemImpl<E>> l = new ArrayList<TreeItemImpl<E>>(domainList.size());
			for( E e : domainList ) {
				TreeItemImpl<E> i = new TreeItemImpl<E>(owner,e);
				l.add(i);
			}
			super.getChildren().setAll(l);
		}
	}
}
