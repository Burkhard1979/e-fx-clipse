package at.bestsolution.efxclipse.text.jface.contentassist;

import org.eclipse.jface.text.IDocument;

import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.KeyEvent;
import at.bestsolution.efxclipse.styledtext.TextSelection;
import at.bestsolution.efxclipse.text.jface.ITextViewer;

public class ContentAssistSubjectControlAdapter implements IContentAssistSubjectControl {
	private ITextViewer viewer;
	
	public ContentAssistSubjectControlAdapter(ITextViewer viewer) {
		this.viewer = viewer;
	}

	@Override
	public void addKeyListener(EventHandler<KeyEvent> keyListener) {
		System.err.println("SETTING HANDLER");
		viewer.getTextWidget().addEventHandler(KeyEvent.KEY_PRESSED, keyListener);
	}

	@Override
	public TextSelection getSelectedRange() {
		return viewer.getTextWidget().getSelection();
	}

	public Node getControl() {
		return viewer.getTextWidget();
	}

	@Override
	public IDocument getDocument() {
		return viewer.getDocument();
	}
	
	public void setSelectedRange(int offset, int length) {
		viewer.setSelectedRange(offset, length);
	}
	
	public void revealRange(int offset, int length) {
		viewer.revealRange(offset, length);
	}
	
	/**
	* Creates and returns a completion proposal popup for the given content assistant.
	*
	* @param contentAssistant the content assistant
	* @param controller the additional info controller, or <code>null</code>
	* @return the completion proposal popup
	*/
	CompletionProposalPopup createCompletionProposalPopup(ContentAssistant contentAssistant, AdditionalInfoController controller) {
//		if (fContentAssistSubjectControl != null)
//			return new CompletionProposalPopup(contentAssistant, fContentAssistSubjectControl, controller);
		return new CompletionProposalPopup(contentAssistant, viewer, controller);

	}

	public void removeKeyListener(EventHandler<KeyEvent> keyListener) {
		viewer.getTextWidget().removeEventHandler(KeyEvent.KEY_PRESSED, keyListener);
	}

	ContextInformationPopup createContextInfoPopup(
			ContentAssistant contentAssistant) {
		return new ContextInformationPopup(contentAssistant, viewer);
	}
}
