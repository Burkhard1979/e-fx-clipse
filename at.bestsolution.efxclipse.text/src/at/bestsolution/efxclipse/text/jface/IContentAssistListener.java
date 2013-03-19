package at.bestsolution.efxclipse.text.jface;

import at.bestsolution.efxclipse.styledtext.VerifyEvent;

public interface IContentAssistListener extends IEventConsumer {
	public boolean verifyKey(VerifyEvent event);
}
