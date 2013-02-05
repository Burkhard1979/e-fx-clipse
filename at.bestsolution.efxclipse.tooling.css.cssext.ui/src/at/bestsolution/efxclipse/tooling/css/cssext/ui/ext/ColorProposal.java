package at.bestsolution.efxclipse.tooling.css.cssext.ui.ext;

import at.bestsolution.efxclipse.tooling.css.ui.extapi.UIProposal;

public class ColorProposal implements UIProposal {

	private String proposal;
	
	
	@Override
	public Object getAdditionalInfo() {
		return null;
	}

	@Override
	public String getProposal() {
		return proposal;
	}

	@Override
	public String getImageUrl() {
		return null;
	}

	@Override
	public String getLabel() {
		return null;
	}

	@Override
	public int getPriority() {
		return 1;
	}

	@Override
	public boolean show() {
		
		return false;
	}

	@Override
	public boolean hide() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Type getType() {
		return Type.Value;
	}
}
