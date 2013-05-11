package at.bestsolution.efxclipse.gefx.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import at.bestsolution.efxclipse.gefx.scene.Shape;

public class SelectionManager {

	public static final SelectionManager INSTANCE = new SelectionManager();

	public interface ISelectionListener {
		void notifyChanged();
	}

	private final Set<Shape> selectedElements = new HashSet<>();
	private final List<ISelectionListener> listeners = new ArrayList<>();

	public void addListener(ISelectionListener listener) {
		listeners.add(listener);
	}

	public void select(Shape element, boolean clear) {
		if (clear)
			selectedElements.clear();

		selectedElements.add(element);

		for (ISelectionListener listener : listeners)
			listener.notifyChanged();
	}

	public void clear() {
		selectedElements.clear();

		for (ISelectionListener listener : listeners)
			listener.notifyChanged();
	}

	public boolean isSelected(Shape element) {
		return selectedElements.contains(element);
	}
	
	public Set<Shape> getSelectedElements() {
		return Collections.unmodifiableSet(selectedElements);
	}

}
