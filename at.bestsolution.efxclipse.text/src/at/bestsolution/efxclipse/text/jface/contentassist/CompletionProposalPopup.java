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
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentListener;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.TextUtilities;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;
import javafx.util.Callback;
import at.bestsolution.efxclipse.styledtext.TextSelection;
import at.bestsolution.efxclipse.styledtext.VerifyEvent;
import at.bestsolution.efxclipse.text.jface.IContentAssistListener;
import at.bestsolution.efxclipse.text.jface.IEditingSupport;
import at.bestsolution.efxclipse.text.jface.IEditingSupportRegistry;
import at.bestsolution.efxclipse.text.jface.IRewriteTarget;
import at.bestsolution.efxclipse.text.jface.ITextViewer;
import at.bestsolution.efxclipse.text.jface.ITextViewerExtension;

public class CompletionProposalPopup implements IContentAssistListener {
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
	private boolean inserting;
	private ICompletionProposalSorter sorter;
	private ListView<ICompletionProposal> proposalTable;
	private ObservableList<ICompletionProposal> proposalTableList;
	/** The filter list of proposals. */
	private ICompletionProposal[] fFilteredProposals;
	/**
	 * <code>true</code> if <code>fFilterRunnable</code> has been
	 * posted, <code>false</code> if not.
	 *
	 * @since 3.1.1
	 */
	private boolean isFilterPending= false;
	
	/**
	 * The (reusable) empty proposal.
	 *
	 * @since 3.2
	 */
	private final EmptyProposal emptyProposal= new EmptyProposal();
	
	/**
	 * Set to true by {@link #computeFilteredProposals(int, DocumentEvent)} if
	 * the returned proposals are a subset of {@link #fFilteredProposals},
	 * <code>false</code> if not.
	 * @since 3.1
	 */
	private boolean isFilteredSubset;
	
	public CompletionProposalPopup(ContentAssistant contentAssistant,
			ITextViewer viewer, AdditionalInfoController controller) {
		this.contentAssistant = contentAssistant;
		this.viewer = viewer;
		this.controller = controller;
		contentAssistSubjectControlAdapter = new ContentAssistSubjectControlAdapter(viewer);
	}

	public String showProposals(final boolean autoActivated) {
		System.err.println("SHOWING PROPOSALS");
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
		
		proposalTable = new ListView<>();
		proposalTable.setCellFactory(new Callback<ListView<ICompletionProposal>, ListCell<ICompletionProposal>>() {
			
			@Override
			public ListCell<ICompletionProposal> call(ListView<ICompletionProposal> arg0) {
				return new CompletionCell();
			}
		});
		proposalTableList = FXCollections.observableArrayList();
		proposalTable.setItems(proposalTableList);
		proposalStage = new Stage(StageStyle.UNDECORATED);
//		proposalStage.setOnHidden(new EventHandler<WindowEvent>() {
//
//			@Override
//			public void handle(WindowEvent arg0) {
//				proposalStage = null;
//			}
//		});
		proposalStage.initOwner(control.getScene().getWindow());
		proposalStage.setScene(new Scene(proposalTable,500,300));
	}
	
	private void setProposals(ICompletionProposal[] proposals, boolean isFilteredSubset) {
		ICompletionProposal[] oldProposals= fFilteredProposals;
		ICompletionProposal oldProposal= getSelectedProposal(); // may trigger filtering and a reentrant call to setProposals()
		if (oldProposals != fFilteredProposals) // reentrant call was first - abort
			return;

		if (oldProposal instanceof ICompletionProposalExtension2 && viewer != null)
			((ICompletionProposalExtension2) oldProposal).unselected(viewer);

		if (proposals == null || proposals.length == 0) {
			emptyProposal.fOffset= filterOffset;
			emptyProposal.fDisplayString= "No Proposal";//emptyMessage != null ? emptyMessage : JFaceTextMessages.getString("CompletionProposalPopup.no_proposals"); //$NON-NLS-1$
			proposals= new ICompletionProposal[] { emptyProposal };
		}

		if (sorter != null)
			sortProposals(proposals);

		fFilteredProposals= proposals;
		
		proposalTableList.setAll(fFilteredProposals);
		
		selectProposal(0, false);
	}
	
	/**
	 * Sorts the given proposal array.
	 * 
	 * @param proposals the new proposals to display in the popup window
	 * @throws NullPointerException if no sorter has been set
	 * @since 3.8
	 */
	private void sortProposals(final ICompletionProposal[] proposals) {
		Arrays.sort(proposals, new Comparator<ICompletionProposal>() {
			public int compare(ICompletionProposal o1, ICompletionProposal o2) {
				return sorter.compare(o1,o2);
			}
		});
	}
	
	/**
	 * Returns the proposal selected in the proposal selector.
	 *
	 * @return the selected proposal
	 * @since 2.0
	 */
	private ICompletionProposal getSelectedProposal() {
		/* Make sure that there is no filter runnable pending.
		 * See https://bugs.eclipse.org/bugs/show_bug.cgi?id=31427
		 */
		if (isFilterPending)
			filterRunnable.run();

//		// filter runnable may have hidden the proposals
//		if (!Helper.okToUse(fProposalTable))
//			return null;

		int i= proposalTable.getSelectionModel().getSelectedIndex();
		if (fFilteredProposals == null || i < 0 || i >= fFilteredProposals.length)
			return null;
		return fFilteredProposals[i];
	}
	
	/**
	 * The filter runnable.
	 *
	 * @since 3.1.1
	 */
	private final Runnable filterRunnable= new Runnable() {
		public void run() {
			if (!isFilterPending)
				return;

			isFilterPending= false;

//			if (!Helper.okToUse(fContentAssistSubjectControlAdapter.getControl()))
//				return;

			int offset= contentAssistSubjectControlAdapter.getSelectedRange().offset;
			ICompletionProposal[] proposals= null;
			try  {
				if (offset > -1) {
					DocumentEvent event= TextUtilities.mergeProcessedDocumentEvents(documentEvents);
					proposals= computeFilteredProposals(offset, event);
				}
			} catch (BadLocationException x)  {
			} finally  {
				documentEvents.clear();
			}
			filterOffset= offset;

			if (proposals != null && proposals.length > 0)
				setProposals(proposals, isFilteredSubset);
			else
				hide();
		}
	};
	
	/**
	 * Computes the subset of already computed proposals that are still valid for
	 * the given offset.
	 *
	 * @param offset the offset
	 * @param event the merged document event
	 * @return the set of filtered proposals
	 * @since 3.0
	 */
	private ICompletionProposal[] computeFilteredProposals(int offset, DocumentEvent event) {

		if (offset == invocationOffset && event == null) {
			isFilteredSubset= false;
			return computedProposals;
		}

		if (offset < invocationOffset) {
			isFilteredSubset= false;
			invocationOffset= offset;
			contentAssistant.fireSessionRestartEvent();
			computedProposals= computeProposals(invocationOffset);
			return computedProposals;
		}

		ICompletionProposal[] proposals;
		if (offset < filterOffset) {
			proposals= computedProposals;
			isFilteredSubset= false;
		} else {
			proposals= fFilteredProposals;
			isFilteredSubset= true;
		}

		if (proposals == null) {
			isFilteredSubset= false;
			return null;
		}

		IDocument document= contentAssistSubjectControlAdapter.getDocument();
		int length= proposals.length;
		List filtered= new ArrayList(length);
		for (int i= 0; i < length; i++) {

			if (proposals[i] instanceof ICompletionProposalExtension2) {

				ICompletionProposalExtension2 p= (ICompletionProposalExtension2) proposals[i];
				if (p.validate(document, offset, event))
					filtered.add(p);

			} else if (proposals[i] instanceof ICompletionProposalExtension) {

				ICompletionProposalExtension p= (ICompletionProposalExtension) proposals[i];
				if (p.isValidFor(document, offset))
					filtered.add(p);

			} else {
				// restore original behavior
				isFilteredSubset= false;
				invocationOffset= offset;
				contentAssistant.fireSessionRestartEvent();
				computedProposals= computeProposals(invocationOffset);
				return computedProposals;
			}
		}

		return (ICompletionProposal[]) filtered.toArray(new ICompletionProposal[filtered.size()]);
	}

	
	private void displayProposals() {
		if (contentAssistant.addContentAssistListener(this, ContentAssistant.PROPOSAL_SELECTOR)) {
			ensureDocumentListenerInstalled();
			int caret= contentAssistSubjectControlAdapter.getCaretOffset();
			Node n = contentAssistSubjectControlAdapter.getControl();
			Point2D p = contentAssistSubjectControlAdapter.getLocationAtOffset(caret);
			double height = contentAssistSubjectControlAdapter.getLineHeight();
			p = n.localToScreen(p);
			proposalStage.setX(p.getX());
			proposalStage.setY(p.getY()+height);
			proposalStage.show();
			Stage s = (Stage) contentAssistSubjectControlAdapter.getControl().getScene().getWindow();
			s.requestFocus();
//			s.setFocused(true);
			contentAssistSubjectControlAdapter.getControl().requestFocus();
		}
	}
	
	/**
	 * Returns whether this popup has the focus.
	 *
	 * @return <code>true</code> if the popup has the focus
	 */
	public boolean hasFocus() {
		if( proposalStage != null ) {
			return proposalStage.isFocused();
		}
		return false;
	}
	
	/**
	 * Installs the document listener if not already done.
	 *
	 * @since 3.2
	 */
	private void ensureDocumentListenerInstalled() {
		if (documentListener == null) {
			documentListener=  new IDocumentListener()  {
				public void documentAboutToBeChanged(DocumentEvent event) {
					if (!inserting)
						documentEvents.add(event);
				}

				public void documentChanged(DocumentEvent event) {
					if (!inserting)
						filterProposals();
				}
			};
			IDocument document= contentAssistSubjectControlAdapter.getDocument();
			if (document != null)
				document.addDocumentListener(documentListener);
		}
	}
	
	/**
	 * Filters the displayed proposal based on the given cursor position and the
	 * offset of the original invocation of the content assistant.
	 */
	private void filterProposals() {
		if (!isFilterPending) {
			isFilterPending= true;
			Platform.runLater(filterRunnable);
		}
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
		unregister();

		if( proposalStage == null ) {
			return;
		}
		
//		if (viewer instanceof IEditingSupportRegistry) {
//			IEditingSupportRegistry registry= (IEditingSupportRegistry) viewer;
//			registry.unregister(fFocusHelper);
//		}

//		if (Helper.okToUse(fProposalShell)) {

			contentAssistant.removeContentAssistListener(this, ContentAssistant.PROPOSAL_SELECTOR);

//			popupCloser.uninstall();
//			proposalStage.setVisible(false);
			proposalStage.close();
			proposalStage= null;
//		}

//		if (fMessageTextFont != null) {
//			fMessageTextFont.dispose();
//			fMessageTextFont= null;
//		}
//
//		if (fMessageText != null) {
//			fMessageText= null;
//		}
//
//		fEmptyMessage= null;
//
//		fLastCompletionOffset= -1;

		contentAssistant.fireSessionEndEvent();
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

		fFilteredProposals= null;
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
	
	public void processEvent(VerifyEvent e) {
	}
	
	public boolean verifyKey(VerifyEvent e) {
		System.err.println("PROPOSAL RECEIVED VERIFY!!!!!!!!!!!!!!!");
		//TODO Needs to be implemented
		
		System.err.println(e.getText().length());
		
		if( e.getText().length() == 0 ) {
			int newSelection= proposalTable.getSelectionModel().getSelectedIndex();
			int itemCount = proposalTableList.size();
			int visibleRows = 10;
			
			switch (e.getCode()) {
			case LEFT:
			case RIGHT:
				filterProposals();
				return true;
			case UP:
				newSelection -=1;
				if( newSelection < 0 ) {
					newSelection=itemCount - 1;
				}
				break;
			case DOWN:
				newSelection += 1;
				if (newSelection > itemCount - 1)
					newSelection= 0;
				break;
			case PAGE_DOWN :
				newSelection += visibleRows;
				if (newSelection >= itemCount)
					newSelection= itemCount - 1;
				break;

			case PAGE_UP :
				newSelection -= visibleRows;
				if (newSelection < 0)
					newSelection= 0;
				break;
			case HOME :
				newSelection= 0;
				break;

			case END :
				newSelection= itemCount - 1;
				break;
			default:
				return true;
			}
			
			selectProposal(newSelection, e.isControlDown());
			e.consume();
			return false;
		}
		
		switch (e.getCode()) {
		case ESCAPE:
			e.consume();
			hide();
			break;
		case ENTER:
			e.consume();
			int stateMask = 0;
			insertSelectedProposalWithMask(stateMask);
			break;
		case TAB:
			e.consume();
			proposalStage.requestFocus();
			break;
		default:
			ICompletionProposal p= getSelectedProposal();
			if (p instanceof ICompletionProposalExtension) {
				ICompletionProposalExtension t= (ICompletionProposalExtension) p;
				char[] triggers= t.getTriggerCharacters();
				if (contains(triggers, e.getText().charAt(0))) {
					e.consume();
					hide();
					int stateMask2 = 0;
					insertProposal(p, e.getText().charAt(0), stateMask2, contentAssistSubjectControlAdapter.getSelectedRange().offset);
				}
			}
		}
		
		return true;
	}
		
		/**
		 * Returns whether the given character is contained in the given array of characters.
		 * 
		 * @param characters the list of characters
		 * @param c the character to look for in the list
		 * @return <code>true</code> if character belongs to the list
		 * @since 2.0
		 */
		private boolean contains(char[] characters, char c) {

			if (characters == null)
				return false;

			for (int i= 0; i < characters.length; i++) {
				if (c == characters[i])
					return true;
			}

			return false;
		}
	
	/**
	 * Takes the selected proposal and applies it.
	 *
	 * @param stateMask the state mask
	 * @since 3.2
	 */
	private void insertSelectedProposalWithMask(int stateMask) {
		ICompletionProposal p= getSelectedProposal();
		hide();
		if (p != null)
			insertProposal(p, (char) 0, stateMask, contentAssistSubjectControlAdapter.getSelectedRange().offset);
	}
	
	private void selectProposal(int index, boolean smartToggle) {
		ICompletionProposal oldProposal= getSelectedProposal();
		if (oldProposal instanceof ICompletionProposalExtension2 && viewer != null)
			((ICompletionProposalExtension2) oldProposal).unselected(viewer);

		if (fFilteredProposals == null) {
			fireSelectionEvent(null, smartToggle);
			return;
		}

		ICompletionProposal proposal= fFilteredProposals[index];
		if (proposal instanceof ICompletionProposalExtension2 && viewer != null)
			((ICompletionProposalExtension2) proposal).selected(viewer, smartToggle);

		fireSelectionEvent(proposal, smartToggle);

		lastProposal= proposal;

		proposalTable.getSelectionModel().select(index);
		proposalTable.scrollTo(index);
//		if (additionalInfoController != null)
//			additionalInfoController.handleTableSelectionChanged();
	}
	
	/**
	 * Fires a selection event, see {@link ICompletionListener}.
	 *
	 * @param proposal the selected proposal, possibly <code>null</code>
	 * @param smartToggle true if the smart toggle is on
	 * @since 3.2
	 */
	private void fireSelectionEvent(ICompletionProposal proposal, boolean smartToggle) {
		contentAssistant.fireSelectionEvent(proposal, smartToggle);
	}
	
	private final class ProposalSelectionListener implements EventHandler<KeyEvent> {

		@Override
		public void handle(KeyEvent event) {
			// TODO Auto-generated method stub
			
		}
		
	}

	/**
	 * Sets the proposal sorter.
	 * 
	 * @param sorter the sorter to be used, or <code>null</code> if no sorting is requested
	 * @since 3.8
	 * @see ContentAssistant#setSorter(ICompletionProposalSorter)
	 */
	public void setSorter(ICompletionProposalSorter sorter) {
		this.sorter= sorter;
	}
	
	/**
	 * The empty proposal displayed if there is nothing else to show.
	 *
	 * @since 3.2
	 */
	private static final class EmptyProposal implements ICompletionProposal, ICompletionProposalExtension {

		String fDisplayString;
		int fOffset;
		/*
		 * @see ICompletionProposal#apply(IDocument)
		 */
		public void apply(IDocument document) {
		}

		/*
		 * @see ICompletionProposal#getSelection(IDocument)
		 */
		public TextSelection getSelection(IDocument document) {
			return new TextSelection(fOffset, 0);
		}

		/*
		 * @see ICompletionProposal#getContextInformation()
		 */
		public IContextInformation getContextInformation() {
			return null;
		}

		/*
		 * @see ICompletionProposal#getImage()
		 */
		public Image getImage() {
			return null;
		}

		/*
		 * @see ICompletionProposal#getDisplayString()
		 */
		public String getDisplayString() {
			return fDisplayString;
		}

		/*
		 * @see ICompletionProposal#getAdditionalProposalInfo()
		 */
		public String getAdditionalProposalInfo() {
			return null;
		}

		/*
		 * @see org.eclipse.jface.text.contentassist.ICompletionProposalExtension#apply(org.eclipse.jface.text.IDocument, char, int)
		 */
		public void apply(IDocument document, char trigger, int offset) {
		}

		/*
		 * @see org.eclipse.jface.text.contentassist.ICompletionProposalExtension#isValidFor(org.eclipse.jface.text.IDocument, int)
		 */
		public boolean isValidFor(IDocument document, int offset) {
			return false;
		}

		/*
		 * @see org.eclipse.jface.text.contentassist.ICompletionProposalExtension#getTriggerCharacters()
		 */
		public char[] getTriggerCharacters() {
			return null;
		}

		/*
		 * @see org.eclipse.jface.text.contentassist.ICompletionProposalExtension#getContextInformationPosition()
		 */
		public int getContextInformationPosition() {
			return -1;
		}
	}
	
	static class CompletionCell extends ListCell<ICompletionProposal> {
		@Override
		protected void updateItem(ICompletionProposal arg0, boolean arg1) {
			super.updateItem(arg0, arg1);
			
			if( arg0 != null && ! arg1 ) {
				setText(arg0.getDisplayString());
				setGraphic(new ImageView(arg0.getImage()));
//				System.err.println(arg0.getDisplayString() + " : " + arg0.getImage());
			} else {
				setGraphic(null);
				setText(null);
			}
		}
	}
}
