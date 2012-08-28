package at.bestsolution.efxclipse.tooling.fxgraph.ui.wizards.template;

import org.eclipse.jdt.core.IType;

import at.bestsolution.efxclipse.tooling.ui.wizards.template.JDTElement;

public class FXGraphElement extends JDTElement {
	private IType rootElement;
	private boolean dynamic;

	public IType getRootElement() {
		return rootElement;
	}

	public void setRootElement(IType rootElement) {
		support.firePropertyChange("rootElement", this.rootElement, this.rootElement = rootElement);
	}
	
	public boolean isDynamic() {
		return dynamic;
	}
	
	public void setDynamic(boolean dynamic) {
		this.dynamic = dynamic;
	}
}
