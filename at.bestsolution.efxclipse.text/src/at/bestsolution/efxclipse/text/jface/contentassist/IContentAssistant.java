package at.bestsolution.efxclipse.text.jface.contentassist;

import at.bestsolution.efxclipse.text.jface.ITextViewer;

public interface IContentAssistant {
	String showPossibleCompletions();
	void install(ITextViewer textViewer);
//	void uninstall();
}
