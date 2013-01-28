package at.bestsolution.efxclipse.tooling.css.extapi;

import org.eclipse.emf.ecore.EObject;

public interface Proposal {

	public Object getAdditionalInfo();
	
	public String getProposal();

	public String getImageUrl();

	public String getLabel();

	public int getPriority();

}