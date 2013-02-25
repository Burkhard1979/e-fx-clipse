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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentListener;
import org.eclipse.jface.text.IRegion;

import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import at.bestsolution.efxclipse.styledtext.TextSelection;
import at.bestsolution.efxclipse.text.jface.IEditingSupport;
import at.bestsolution.efxclipse.text.jface.IEditingSupportRegistry;
import at.bestsolution.efxclipse.text.jface.IRewriteTarget;
import at.bestsolution.efxclipse.text.jface.ITextViewer;
import at.bestsolution.efxclipse.text.jface.ITextViewerExtension;

public class CompletionProposalPopup {
	private ContentAssistant contentAssistant;
	private ITextViewer viewer;
	private AdditionalInfoController controller;
	private ContentAssistSubjectControlAdapter contentAssistSubjectControlAdapter;
	private Stage proposalStage;
	private int invocationOffset;
	private int filterOffset;
	private int lastCompletionOffset;
//	private IContentAssistSubjectControl contentAssistSubjectControl;
	private ICompletionProposal[] computedProposals;
	private ICompletionProposal lastProposal;
	private ProposalSelectionListener keyListener;
	private IDocumentListener documentListener;
	private final List<DocumentEvent> documentEvents= new ArrayList<>();
	private ICompletionProposal[] filteredProposals;
	private boolean inserting;
	
	public CompletionProposalPopup(ContentAssistant contentAssistant,
			ITextViewer viewer, AdditionalInfoController controller) {
		this.contentAssistant = contentAssistant;
		this.viewer = viewer;
		this.controller = controller;
		contentAssistSubjectControlAdapter = new ContentAssistSubjectControlAdapter(viewer);
	}

	public String showProposals(final boolean autoActivated) {
		final Node control= contentAssistSubjectControlAdapter.getControl();
		
		if (keyListener == null)
			keyListener= new ProposalSelectionListener();
		
		if( proposalStage == null && control != null && control.getScene() != null ) {
			invocationOffset= contentAssistSubjectControlAdapter.getSelectedRange().offset;
			filterOffset= invocationOffset;
			lastCompletionOffset = filterOffset; 
			computedProposals = computeProposals(invocationOffset); 

			int count= (computedProposals == null ? 0 : computedProposals.length);
			if (count == 0 && hideWhenNoProposals(autoActivated))
				return getErrorMessage();

			if (count == 1 && !autoActivated && canAutoInsert(computedProposals[0])) {
				insertProposal(computedProposals[0], (char) 0, 0, invocationOffset);
				hide();
			} else {
				createProposalSelector();
				setProposals(computedProposals, false);
				displayProposals();
			}
		}
		
		return getErrorMessage();
	}
	
	private void createProposalSelector() {
		Node control= contentAssistSubjectControlAdapter.getControl();
		proposalStage = new Stage();
		proposalStage.initOwner(control.getScene().getWindow());
	}
	
	private void setProposals(ICompletionProposal[] proposals, boolean isFilteredSubset) {
		
	}
	
	private void displayProposals() {
		
	}
	
	/**
	 * Applies the given proposal at the given offset. The given character is the
	 * one that triggered the insertion of this proposal.
	 *
	 * @param p the completion proposal
	 * @param trigger the trigger character
	 * @param stateMask the state mask
	 * @param offset the offset
	 * @since 2.1
	 */
	private void insertProposal(ICompletionProposal p, char trigger, int stateMask, final int offset) {

		inserting= true;
		IRewriteTarget target= null;
		IEditingSupport helper= new IEditingSupport() {

			public boolean isOriginator(DocumentEvent event, IRegion focus) {
				return focus.getOffset() <= offset && focus.getOffset() + focus.getLength() >= offset;
			}

			public boolean ownsFocusShell() {
				return false;
			}

		};

		try {

			IDocument document= contentAssistSubjectControlAdapter.getDocument();

			if (viewer instanceof ITextViewerExtension) {
				ITextViewerExtension extension= (ITextViewerExtension) viewer;
				target= extension.getRewriteTarget();
			}

			if (target != null)
				target.beginCompoundChange();

			if (viewer instanceof IEditingSupportRegistry) {
				IEditingSupportRegistry registry= (IEditingSupportRegistry) viewer;
				registry.register(helper);
			}


			if (p instanceof ICompletionProposalExtension2 && viewer != null) {
				ICompletionProposalExtension2 e= (ICompletionProposalExtension2) p;
				e.apply(viewer, trigger, stateMask, offset);
			} else if (p instanceof ICompletionProposalExtension) {
				ICompletionProposalExtension e= (ICompletionProposalExtension) p;
				e.apply(document, trigger, offset);
			} else {
				p.apply(document);
			}
			fireAppliedEvent(p);

			TextSelection selection= p.getSelection(document);
			if (selection != null) {
				contentAssistSubjectControlAdapter.setSelectedRange(selection.offset, selection.length);
				contentAssistSubjectControlAdapter.revealRange(selection.offset, selection.length);
			}

			IContextInformation info= p.getContextInformation();
			if (info != null) {

				int contextInformationOffset;
				if (p instanceof ICompletionProposalExtension) {
					ICompletionProposalExtension e= (ICompletionProposalExtension) p;
					contextInformationOffset= e.getContextInformationPosition();
				} else {
					if (selection == null)
						selection= contentAssistSubjectControlAdapter.getSelectedRange();
					contextInformationOffset= selection.offset + selection.length;
				}

				contentAssistant.showContextInformation(info, contextInformationOffset);
			} else
				contentAssistant.showContextInformation(null, -1);


		} finally {
			if (target != null)
				target.endCompoundChange();

			if (viewer instanceof IEditingSupportRegistry) {
				IEditingSupportRegistry registry= (IEditingSupportRegistry) viewer;
				registry.unregister(helper);
			}
			inserting= false;
		}
	}
	
	/**
	 * Fires an event after applying the given proposal, see {@link ICompletionListenerExtension2}.
	 * 
	 * @param proposal the applied proposal
	 * @since 3.8
	 */
	private void fireAppliedEvent(ICompletionProposal proposal) {
		contentAssistant.fireAppliedEvent(proposal);
	}
	
	/**
	 * Returns <code>true</code> if <code>proposal</code> should be auto-inserted,
	 * <code>false</code> otherwise.
	 *
	 * @param proposal the single proposal that might be automatically inserted
	 * @return <code>true</code> if <code>proposal</code> can be inserted automatically,
	 *         <code>false</code> otherwise
	 * @since 3.1
	 */
	private boolean canAutoInsert(ICompletionProposal proposal) {
		if (contentAssistant.isAutoInserting()) {
			if (proposal instanceof ICompletionProposalExtension4) {
				ICompletionProposalExtension4 ext= (ICompletionProposalExtension4) proposal;
				return ext.isAutoInsertable();
			}
			return true; // default behavior before ICompletionProposalExtension4 was introduced
		}
		return false;
	}
	
	/**
	 * Returns the error message.
	 *
	 * @return the error message
	 */
	private String getErrorMessage() {
		return contentAssistant.getErrorMessage();
	}
	
	/**
	 * Hides the popup and returns <code>true</code> if the popup is configured
	 * to never display an empty list. Returns <code>false</code> otherwise.
	 *
	 * @param autoActivated whether the invocation was auto-activated
	 * @return <code>false</code> if an empty list should be displayed, <code>true</code> otherwise
	 * @since 3.2
	 */
	private boolean hideWhenNoProposals(boolean autoActivated) {
		if (autoActivated || !contentAssistant.isShowEmptyList()) {
			if (!autoActivated) {
//				Node control= contentAssistSubjectControlAdapter.getControl();
//				if (control != null && control.getScene() != null)
//					control.getDisplay().beep();
			}
			hide();
			return true;
		}
		return false;
	}
	
	public void hide() {
		
	}
	
	/**
	 * Unregister this completion proposal popup.
	 *
	 * @since 3.0
	 */
	private void unregister() {
		if (documentListener != null) {
			IDocument document= contentAssistSubjectControlAdapter.getDocument();
			if (document != null)
				document.removeDocumentListener(documentListener);
			documentListener= null;
		}
		documentEvents.clear();

		if (keyListener != null && contentAssistSubjectControlAdapter.getControl() != null && contentAssistSubjectControlAdapter.getControl().getScene() != null) {
			contentAssistSubjectControlAdapter.removeKeyListener(keyListener);
			keyListener= null;
		}

		if (lastProposal != null) {
			if (lastProposal instanceof ICompletionProposalExtension2 && viewer != null) {
				ICompletionProposalExtension2 extension= (ICompletionProposalExtension2) lastProposal; 
				extension.unselected(viewer);
			}
			lastProposal= null;
		}

		filteredProposals= null;
		computedProposals= null;

		contentAssistant.possibleCompletionsClosed();
	}
	
	/**
	 * Returns the completion proposal available at the given offset of the
	 * viewer's document. Delegates the work to the content assistant.
	 *
	 * @param offset the offset
	 * @return the completion proposals available at this offset
	 */
	private ICompletionProposal[] computeProposals(int offset) {
//		if (contentAssistSubjectControl != null)
//			return contentAssistant.computeCompletionProposals(contentAssistSubjectControl, offset);
		return contentAssistant.computeCompletionProposals(viewer, offset);
	}

	public boolean isActive() {
		// TODO Auto-generated method stub
		return false;
	}

	public String incrementalComplete() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private final class ProposalSelectionListener implements EventHandler<KeyEvent> {

		@Override
		public void handle(KeyEvent event) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
