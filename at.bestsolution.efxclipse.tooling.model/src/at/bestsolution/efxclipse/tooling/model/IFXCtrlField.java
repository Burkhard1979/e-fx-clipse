package at.bestsolution.efxclipse.tooling.model;

import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IType;

public interface IFXCtrlField {
	public IJavaElement getJavaElement();
	public String getName();
	public IType getType();
}
