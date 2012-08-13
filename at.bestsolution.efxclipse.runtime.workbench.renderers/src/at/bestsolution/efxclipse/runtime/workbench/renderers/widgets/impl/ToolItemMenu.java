package at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.impl;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;

public class ToolItemMenu {
	private SplitMenuButton button;
	private Object userData;
	private String id;
	private String text;
	private ObservableList<String> styleClass = FXCollections.observableArrayList();
	
	public ToolItemMenu(SplitMenuButton button) {
		this.button = button;
	}

	public void setUserData(Object userData) {
		this.userData = userData;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setText(String text) {
		this.text = text;
	}

	public ObservableList<String> getStyleClass() {
		return styleClass;
	}

	public ObservableList<MenuItem> getItems() {
		return button.getItems();
	}
	
	
}
