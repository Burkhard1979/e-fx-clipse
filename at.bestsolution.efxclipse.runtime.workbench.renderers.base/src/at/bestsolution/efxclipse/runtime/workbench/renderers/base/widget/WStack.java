package at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget;

import java.util.List;

import javafx.scene.Node;

import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.model.application.ui.basic.MStackElement;

@SuppressWarnings("restriction")
public interface WStack<N,I> extends WWidget<MPartStack> {
	public interface WStackItem<I> {
		public I getNativeItem();
		public void setDomElement(MStackElement domElement);
		public MStackElement getDomElement();
		public void setInitCallback(WCallback<WStackItem<I>, Node> callback);
		public void setOnCloseCallback(WCallback<WStackItem<I>, Boolean> callback);
	}
	
	public Class<? extends WStackItem<I>> getStackItemClass();
	public void addItem(WStackItem<I> item);
	public void addItems(List<WStackItem<I>> items);
	public void addItems(int index, List<WStackItem<I>> items);
	public void selectItem(int idx);
	public int indexOf(WStackItem<I> item);
	public List<WStackItem<I>> getItems();
	public void removeItems(List<WStackItem<I>> items);
	
	public void setMouseSelectedItemCallback(WCallback<WStackItem<I>, Void> selectedItemCallback);
	public void setKeySelectedItemCallback(WCallback<WStackItem<I>, Void> selectedItemCallback);
	public int getItemCount();
	
}
