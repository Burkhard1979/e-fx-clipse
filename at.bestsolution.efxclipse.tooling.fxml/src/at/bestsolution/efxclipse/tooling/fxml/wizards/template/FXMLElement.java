package at.bestsolution.efxclipse.tooling.fxml.wizards.template;

import org.eclipse.jdt.core.IType;

import at.bestsolution.efxclipse.tooling.ui.wizards.template.JDTElement;

public class FXMLElement extends JDTElement {
	private IType rootElement;
	private boolean fxRoot;

	public IType getRootElement() {
		return rootElement;
	}

	public void setRootElement(IType rootElement) {
		support.firePropertyChange("rootElement", this.rootElement, this.rootElement = rootElement);
	}
	
	public void setFxRoot(boolean fxRoot) {
		this.fxRoot = fxRoot;
	}
	
	public boolean isFxRoot() {
		return fxRoot;
	}
}
