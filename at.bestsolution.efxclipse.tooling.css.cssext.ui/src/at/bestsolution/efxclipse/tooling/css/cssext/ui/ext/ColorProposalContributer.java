package at.bestsolution.efxclipse.tooling.css.cssext.ui.ext;

import at.bestsolution.efxclipse.tooling.css.cssext.proposal.CssExtProposalContributor;
import at.bestsolution.efxclipse.tooling.css.extapi.Proposal;

public class ColorProposalContributer implements CssExtProposalContributor {

	@Override
	public String getRule() {
		return "javafx.color";
	}

	@Override
	public Proposal getProposal() {
		return new ColorProposal();
	}

}
