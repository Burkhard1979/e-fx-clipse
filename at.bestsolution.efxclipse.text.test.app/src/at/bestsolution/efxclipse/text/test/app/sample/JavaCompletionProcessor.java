package at.bestsolution.efxclipse.text.test.app.sample;

import at.bestsolution.efxclipse.text.jface.ITextViewer;
import at.bestsolution.efxclipse.text.jface.contentassist.CompletionProposal;
import at.bestsolution.efxclipse.text.jface.contentassist.ICompletionProposal;
import at.bestsolution.efxclipse.text.jface.contentassist.IContentAssistProcessor;

public class JavaCompletionProcessor implements IContentAssistProcessor {

	@Override
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer,
			int offset) {
		ICompletionProposal[] proposal = { 
				new CompletionProposal("err", offset, 0, 3),
				new CompletionProposal("out", offset, 0, 3)
		};
		return proposal;
	}

	@Override
	public String getErrorMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public char[] getCompletionProposalAutoActivationCharacters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public char[] getContextInformationAutoActivationCharacters() {
		// TODO Auto-generated method stub
		return null;
	}

}
