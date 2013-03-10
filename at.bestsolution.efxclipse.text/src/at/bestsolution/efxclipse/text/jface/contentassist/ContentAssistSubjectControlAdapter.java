/*******************************************************************************
 * Copyright (c) 2000, 2013 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package at.bestsolution.efxclipse.text.jface.contentassist;

import org.eclipse.jface.text.IDocument;

import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.input.KeyEvent;
import at.bestsolution.efxclipse.styledtext.StyledTextArea;
import at.bestsolution.efxclipse.styledtext.TextSelection;
import at.bestsolution.efxclipse.styledtext.VerifyEvent;
import at.bestsolution.efxclipse.text.jface.IEventConsumer;
import at.bestsolution.efxclipse.text.jface.ITextViewer;
import at.bestsolution.efxclipse.text.jface.ITextViewerExtension;

public class ContentAssistSubjectControlAdapter implements IContentAssistSubjectControl {
	private ITextViewer viewer;
	
	public ContentAssistSubjectControlAdapter(ITextViewer viewer) {
		this.viewer = viewer;
	}

	@Override
	public void addKeyListener(EventHandler<KeyEvent> keyListener) {
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
	
	public Point2D getLocationAtOffset(int offset) {
//		if (fContentAssistSubjectControl != null)
//			return fContentAssistSubjectControl.getLocationAtOffset(offset);
		return viewer.getTextWidget().getLocationAtOffset(offset);
	}

	public int getCaretOffset() {
		return viewer.getTextWidget().getCaretOffset();
	}

	/*
	 * @see IContentAssistSubjectControl#getLineHeight()
	 */
	public double getLineHeight() {
//		if (fContentAssistSubjectControl != null)
//			return fContentAssistSubjectControl.getLineHeight();

		return viewer.getTextWidget().getLineHeight(getCaretOffset());
	}
	
	public boolean prependVerifyKeyListener(EventHandler<VerifyEvent> verifyKeyListener) {
		/*if (contentAssistSubjectControl != null) {
			return contentAssistSubjectControl.prependVerifyKeyListener(verifyKeyListener);
		} else */
		if (viewer instanceof ITextViewerExtension) {
			ITextViewerExtension e= (ITextViewerExtension) viewer;
			e.prependVerifyKeyListener(verifyKeyListener);
			return true;
		} else {
			StyledTextArea textWidget= viewer.getTextWidget();
//			if (Helper.okToUse(textWidget)) {
				textWidget.addEventHandler(VerifyEvent.VERIFY, verifyKeyListener);
				return true;
//			}
		}
//		return false;
	}
	
	public boolean supportsVerifyKeyListener() {
//		if (fContentAssistSubjectControl != null)
//			return fContentAssistSubjectControl.supportsVerifyKeyListener();
		return true;
	}

	public boolean appendVerifyKeyListener(EventHandler<VerifyEvent> verifyKeyListener) {
		/*if (contentAssistSubjectControl != null)
			return contentAssistSubjectControl.appendVerifyKeyListener(verifyKeyListener);
		else */
		if (viewer instanceof ITextViewerExtension) {
			ITextViewerExtension extension= (ITextViewerExtension)viewer;
			extension.appendVerifyKeyListener(verifyKeyListener);
			return true;
		} else {
			StyledTextArea textWidget= viewer.getTextWidget();
//			if (Helper.okToUse(textWidget)) {
				textWidget.addEventHandler(VerifyEvent.VERIFY,verifyKeyListener);
				return true;
//			}
		}
//		return false;
	}

	public void setEventConsumer(IEventConsumer eventConsumer) {
//		if (contentAssistSubjectControl != null)
//			contentAssistSubjectControl.setEventConsumer(eventConsumer);
//		else
			viewer.setEventConsumer(eventConsumer);
	}
	
	/*
	 * @see org.eclipse.jface.text.contentassist.IContentAssistSubjectControl#removeVerifyKeyListener(org.eclipse.swt.custom.VerifyKeyListener)
	 */
	public void removeVerifyKeyListener(EventHandler<VerifyEvent> verifyKeyListener) {
//		if (fContentAssistSubjectControl != null) {
//			fContentAssistSubjectControl.removeVerifyKeyListener(verifyKeyListener);
//		} else 
		if (viewer instanceof ITextViewerExtension) {
			ITextViewerExtension extension= (ITextViewerExtension) viewer;
			extension.removeVerifyKeyListener(verifyKeyListener);
		} else {
			StyledTextArea textWidget= viewer.getTextWidget();
//			if (Helper.okToUse(textWidget))
				textWidget.removeEventHandler(VerifyEvent.VERIFY, verifyKeyListener);
		}
	}
}
