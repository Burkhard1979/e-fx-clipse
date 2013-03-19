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

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.InputEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import org.eclipse.core.commands.IHandler;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentExtension3;
import org.eclipse.jface.text.TextUtilities;

import at.bestsolution.efxclipse.runtime.bindings.KeySequence;
import at.bestsolution.efxclipse.styledtext.VerifyEvent;
import at.bestsolution.efxclipse.text.jface.IContentAssistListener;
import at.bestsolution.efxclipse.text.jface.IEventConsumer;
import at.bestsolution.efxclipse.text.jface.ITextViewer;

public class ContentAssistant implements IContentAssistant, IContentAssistantExtension, IContentAssistantExtension2, IContentAssistantExtension3, IContentAssistantExtension4 {
	private static final int DEFAULT_AUTO_ACTIVATION_DELAY= 500;
	
	private String partitioning;
	private ITextViewer viewer;
	private ContentAssistSubjectControlAdapter contentAssistSubjectControlAdapter;
	private boolean autoActivated = true;
	private AutoAssistListener autoAssistListener;
	private Map<String, IContentAssistProcessor> processors;
	private int autoActivationDelay= DEFAULT_AUTO_ACTIVATION_DELAY;
	private long lastAutoActivation= Long.MIN_VALUE;
	private CompletionProposalPopup proposalPopup;
	private String lastErrorMessage;
	private boolean showEmptyList;
	private ContextInformationPopup contextInfoPopup;
	private boolean verifyKeyListenerHooked= false;
	
	final static int CONTEXT_SELECTOR= 0;
	final static int PROPOSAL_SELECTOR= 1;
	final static int CONTEXT_INFO_POPUP= 2;
	
	private IContentAssistListener[] listeners= new IContentAssistListener[4];
	
	/**
	 * The sorter to be used for sorting the proposals or <code>null</code> if no sorting is
	 * requested.
	 * 
	 * @since 3.8
	 */
	private ICompletionProposalSorter sorter;

	/**
	 * The list of completion listeners.
	 *
	 * @since 3.2
	 */
	private ListenerList fCompletionListeners= new ListenerList(ListenerList.IDENTITY);
	
	/**
	 * Maps handler to command identifiers.
	 *
	 * @since 3.4
	 */
	private Map handlers;

	
	/**
	 * Prefix completion setting.
	 *
	 * @since 3.0
	 */
	private boolean prefixCompletionEnabled = false;

	private boolean autoInserting = true;

	private KeySequence repeatedInvocationKeySequence;

	private InternalListener internalListener;
	
	private Closer closer;
	
	public ContentAssistant() {
		partitioning= IDocumentExtension3.DEFAULT_PARTITIONING;
	}
	
	/**
	 * Returns <code>true</code> if empty lists should be displayed, <code>false</code>
	 * otherwise.
	 *
	 * @return <code>true</code> if empty lists should be displayed, <code>false</code>
	 *         otherwise
	 * @since 3.2
	 */
	boolean isShowEmptyList() {
		return showEmptyList;
	}
	
	public void setContentAssistProcessor(IContentAssistProcessor processor, String contentType) {
		if (processors == null) {
			processors= new HashMap<>();
		}
			
		if (processor == null)
			processors.remove(contentType);
		else
			processors.put(contentType, processor);
	}
	
	/**
	 * Sets the document partitioning this content assistant is using.
	 *
	 * @param partitioning the document partitioning for this content assistant
	 * @since 3.0
	 */
	public void setDocumentPartitioning(String partitioning) {
		Assert.isNotNull(partitioning);
		this.partitioning= partitioning;
	}
	
	public String getDocumentPartitioning() {
		return partitioning;
	}
	
	@Override
	public void install(ITextViewer textViewer) {
		this.viewer = textViewer;
		this.contentAssistSubjectControlAdapter= new ContentAssistSubjectControlAdapter(viewer);
		install();
	}

	protected void install() {
		internalListener= new InternalListener();
		
		AdditionalInfoController controller= null;
//		if (informationControlCreator != null)
//			controller= new AdditionalInfoController(informationControlCreator, OpenStrategy.getPostSelectionDelay());
		
		contextInfoPopup = contentAssistSubjectControlAdapter.createContextInfoPopup(this);
		proposalPopup= contentAssistSubjectControlAdapter.createCompletionProposalPopup(this, controller);
		
		manageAutoActivation(autoActivated);
	}
	
	private void manageAutoActivation(boolean start) {
		if( start ) {
			if ((contentAssistSubjectControlAdapter != null) && autoAssistListener == null) {
				autoAssistListener = createAutoAssistListener();
				// For details see https://bugs.eclipse.org/bugs/show_bug.cgi?id=49212
				if (contentAssistSubjectControlAdapter.supportsVerifyKeyListener())
					contentAssistSubjectControlAdapter.appendVerifyKeyListener(autoAssistListener.asVerifyEvent());
				else
					contentAssistSubjectControlAdapter.addKeyListener(autoAssistListener.asKeyEvent());
			}
		}
	}
	
	/**
	 * Returns whether this content assistant is in the auto insertion mode or not.
	 *
	 * @return <code>true</code> if in auto insertion mode
	 * @since 2.0
	 */
	boolean isAutoInserting() {
		return autoInserting; 
	}
	
	private String computeAllAutoActivationTriggers() {
		if (processors == null)
			return ""; //$NON-NLS-1$

		StringBuffer buf= new StringBuffer(5);
		Iterator<Entry<String, IContentAssistProcessor>> iter= processors.entrySet().iterator();
		while (iter.hasNext()) {
			Entry<String, IContentAssistProcessor> entry= iter.next();
			IContentAssistProcessor processor= (IContentAssistProcessor) entry.getValue();
			char[] triggers= processor.getCompletionProposalAutoActivationCharacters();
			if (triggers != null)
				buf.append(triggers);
			triggers= processor.getContextInformationAutoActivationCharacters();
			if (triggers != null)
				buf.append(triggers);
		}
		return buf.toString();
	}
	
	public String showProposals(final boolean autoActivated) {
		Node node = contentAssistSubjectControlAdapter.getControl();
		
		return "";
	}
	
	public String showPossibleCompletions() {
		System.err.println("SHOW POSSIBLE COMPLETEION");
		if (!prepareToShowCompletions(false))
			return null;
		if (prefixCompletionEnabled)
			return proposalPopup.incrementalComplete();
		return proposalPopup.showProposals(false);
	}
	
	public String completePrefix() {
		if (!prepareToShowCompletions(false))
			return null;
		return proposalPopup.incrementalComplete();
	}
	
	/**
	 * Returns an array of completion proposals computed based on the specified document position.
	 * The position is used to determine the appropriate content assist processor to invoke.
	 *
	 * @param viewer the viewer for which to compute the proposals
	 * @param offset a document offset
	 * @return an array of completion proposals or <code>null</code> if no proposals are possible
	 * @see IContentAssistProcessor#computeCompletionProposals(ITextViewer, int)
	 */
	ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int offset) {
		lastErrorMessage= null;

		ICompletionProposal[] result= null;

		IContentAssistProcessor p = getProcessor(viewer, offset);
		if (p != null) {
			result= p.computeCompletionProposals(viewer, offset);
			lastErrorMessage= p.getErrorMessage();
		}

		return result;
	}
	
	/**
	 * Returns the content assist processor for the content type of the specified document position.
	 *
	 * @param viewer the text viewer
	 * @param offset a offset within the document
	 * @return a content-assist processor or <code>null</code> if none exists
	 * @since 3.0
	 */
	private IContentAssistProcessor getProcessor(ITextViewer viewer, int offset) {
		try {

			IDocument document= viewer.getDocument();
			String type= TextUtilities.getContentType(document, getDocumentPartitioning(), offset, true);

			return getContentAssistProcessor(type);

		} catch (BadLocationException x) {
		}

		return null;
	}
	
	/**
	 * Prepares to show content assist proposals. It returns false if auto activation has kicked in
	 * recently.
	 *
	 * @param isAutoActivated  whether completion was triggered by auto activation
	 * @return <code>true</code> if the caller should continue and show the proposals,
	 *         <code>false</code> otherwise.
	 * @since 3.2
	 */
	private boolean prepareToShowCompletions(boolean isAutoActivated) {
		if (!isAutoActivated) {
			int gracePeriod= Math.max(autoActivationDelay, 200);
			if (System.currentTimeMillis() < lastAutoActivation + gracePeriod) {
				return false;
			}
		}
		
		promoteKeyListener();
		fireSessionBeginEvent(isAutoActivated);
		return true;
	}
	
	/**
	 * Re-promotes the key listener to the first position, using prependVerifyKeyListener. This
	 * ensures no other instance is filtering away the keystrokes underneath, if we've been up for a
	 * while (e.g. when the context info is showing.
	 *
	 * @since 3.0
	 */
	private void promoteKeyListener() {
		uninstallVerifyKeyListener();
		installKeyListener();
	}
	
	String getErrorMessage() {
		return lastErrorMessage;
	}
	
	/**
	 * Uninstall the key listener from the text viewer's widget.
	 *
	 * @since 3.0
	 */
	private void uninstallVerifyKeyListener() {
		if (verifyKeyListenerHooked) {
//			if (Helper.okToUse(fContentAssistSubjectControlAdapter.getControl()))
				contentAssistSubjectControlAdapter.removeVerifyKeyListener(internalListener);
			verifyKeyListenerHooked= false;
		}
	}
	
	/**
	 * Installs a key listener on the text viewer's widget.
	 */
	private void installKeyListener() {
		if (!verifyKeyListenerHooked) {
//			if (Helper.okToUse(fContentAssistSubjectControlAdapter.getControl())) {
				verifyKeyListenerHooked= contentAssistSubjectControlAdapter.prependVerifyKeyListener(internalListener);
//			}
		}
	}
	
	/**
	 * Requests that the specified context information to be shown.
	 *
	 * @param contextInformation the context information to be shown
	 * @param offset the offset to which the context information refers to
	 * @since 2.0
	 */
	void showContextInformation(IContextInformation contextInformation, int offset) {
		if (contextInfoPopup != null)
			contextInfoPopup.showContextInformation(contextInformation, offset);
	}
	
	/**
	 * Returns whether proposal popup is active.
	 *
	 * @return <code>true</code> if the proposal popup is active, <code>false</code> otherwise
	 * @since 3.4
	 */
	protected boolean isProposalPopupActive(){
		return proposalPopup != null && proposalPopup.isActive();
	}
	
	/**
	 * Callback to signal this content assistant that the presentation of the possible completions
	 * has been stopped.
	 *
	 * @since 2.1
	 */
	protected void possibleCompletionsClosed() {
		lastAutoActivation= Long.MIN_VALUE;
//		storeCompletionProposalPopupSize();
	}
	
	/**
	 * Fires a session begin event to all registered {@link ICompletionListener}s.
	 *
	 * @param isAutoActivated  <code>true</code> if this session was triggered by auto activation
	 * @since 3.2
	 */
	void fireSessionBeginEvent(boolean isAutoActivated) {
		if (contentAssistSubjectControlAdapter != null && !isProposalPopupActive()) {
			IContentAssistProcessor processor= getProcessor(contentAssistSubjectControlAdapter, contentAssistSubjectControlAdapter.getSelectedRange().offset);
			ContentAssistEvent event= new ContentAssistEvent(this, processor, isAutoActivated);
			Object[] listeners= fCompletionListeners.getListeners();
			for (int i= 0; i < listeners.length; i++) {
				ICompletionListener listener= (ICompletionListener)listeners[i];
				listener.assistSessionStarted(event);
			}
		}
	}
	
	/**
	 * Fires an event after applying a proposal, see {@link ICompletionListenerExtension2}.
	 * 
	 * @param proposal the applied proposal
	 * @since 3.8
	 */
	void fireAppliedEvent(ICompletionProposal proposal) {
		Object[] listeners= fCompletionListeners.getListeners();
		for (int i= 0; i < listeners.length; i++) {
			ICompletionListener listener= (ICompletionListener)listeners[i];
			if (listener instanceof ICompletionListenerExtension2)
				((ICompletionListenerExtension2)listener).applied(proposal);
		}
	}
	
	/**
	 * Fires a selection event, see {@link ICompletionListener}.
	 *
	 * @param proposal the selected proposal, possibly <code>null</code>
	 * @param smartToggle true if the smart toggle is on
	 * @since 3.2
	 */
	void fireSelectionEvent(ICompletionProposal proposal, boolean smartToggle) {
		Object[] listeners= fCompletionListeners.getListeners();
		for (int i= 0; i < listeners.length; i++) {
			ICompletionListener listener= (ICompletionListener)listeners[i];
			listener.selectionChanged(proposal, smartToggle);
		}
	}
	
	/**
	 * Returns the content assist processor for the content type of the specified document position.
	 *
	 * @param contentAssistSubjectControl the content assist subject control
	 * @param offset a offset within the document
	 * @return a content-assist processor or <code>null</code> if none exists
	 * @since 3.0
	 */
	private IContentAssistProcessor getProcessor(IContentAssistSubjectControl contentAssistSubjectControl, int offset) {
		try {

			IDocument document= contentAssistSubjectControl.getDocument();
			String type;
			if (document != null)
				type= TextUtilities.getContentType(document, getDocumentPartitioning(), offset, true);
			else
				type= IDocument.DEFAULT_CONTENT_TYPE;

			return getContentAssistProcessor(type);

		} catch (BadLocationException x) {
		}

		return null;
	}
	
	/*
	 * @see IContentAssistant#getContentAssistProcessor
	 */
	public IContentAssistProcessor getContentAssistProcessor(String contentType) {
		if (processors == null)
			return null;

		return (IContentAssistProcessor) processors.get(contentType);
	}
	
//	@Override
//	public void uninstall() {
//		// TODO Auto-generated method stub
//		
//	}

	/**
	 * This method allows subclasses to provide their own {@link AutoAssistListener}.
	 *
	 * @return a new auto assist listener
	 * @since 3.4
	 */
	protected AutoAssistListener createAutoAssistListener() {
		return new AutoAssistListener();
	}
	
	class AutoAssistListener implements EventHandler<InputEvent> {
		public EventHandler<KeyEvent> asKeyEvent() {
			return (EventHandler<KeyEvent>)((EventHandler<?>)this);
		}
		
		public EventHandler<VerifyEvent> asVerifyEvent() {
			return (EventHandler<VerifyEvent>)((EventHandler<?>)this);
		}
		
		@Override
		public void handle(InputEvent event) {
			System.err.println("THE EVENT: " + event);
//			// TODO Auto-generated method stub
//			System.err.println("HANDLING A KEY-PRESS");
//			if( event.getText().equals(".") ) {
//				System.err.println("SHOWING");
//			}
		}		
	}
	
	public final IHandler getHandler(String commandId) {
		if (handlers == null)
			throw new IllegalStateException();

		IHandler handler= (IHandler)handlers.get(commandId);
		if (handler != null)
			return handler;

		Assert.isLegal(false);
		return null;
	}

	/*
	 * @see org.eclipse.jface.text.contentassist.IContentAssistantExtension3#setInvocationTrigger(org.eclipse.jface.bindings.keys.KeySequence)
	 * @since 3.2
	 */
	public void setRepeatedInvocationTrigger(KeySequence sequence) {
		repeatedInvocationKeySequence= sequence;
	}

	/*
	 * @see org.eclipse.jface.text.contentassist.IContentAssistantExtension2#addCompletionListener(org.eclipse.jface.text.contentassist.ICompletionListener)
	 * @since 3.2
	 */
	public void addCompletionListener(ICompletionListener listener) {
		Assert.isLegal(listener != null);
		fCompletionListeners.add(listener);
	}

	/*
	 * @see org.eclipse.jface.text.contentassist.IContentAssistantExtension2#removeCompletionListener(org.eclipse.jface.text.contentassist.ICompletionListener)
	 * @since 3.2
	 */
	public void removeCompletionListener(ICompletionListener listener) {
		fCompletionListeners.remove(listener);
	}


	@Override
	public void setRepeatedInvocationMode(boolean cycling) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setShowEmptyList(boolean showEmpty) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setStatusLineVisible(boolean show) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setStatusMessage(String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEmptyMessage(String message) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Sets the proposal sorter.
	 * 
	 * @param sorter the sorter to be used, or <code>null</code> if no sorting is requested
	 * @since 3.8
	 */
	public void setSorter(ICompletionProposalSorter sorter) {
		this.sorter= sorter;
		if (proposalPopup != null) {
			proposalPopup.setSorter(this.sorter);
		}
	}
	
	/**
	 * Fires a session restart event to all registered {@link ICompletionListener}s.
	 *
	 * @since 3.4
	 */
	void fireSessionRestartEvent() {
		if (contentAssistSubjectControlAdapter != null) {
			IContentAssistProcessor processor= getProcessor(contentAssistSubjectControlAdapter, contentAssistSubjectControlAdapter.getSelectedRange().offset);
			ContentAssistEvent event= new ContentAssistEvent(this, processor);
			Object[] listeners= fCompletionListeners.getListeners();
			for (int i= 0; i < listeners.length; i++) {
				ICompletionListener listener= (ICompletionListener)listeners[i];
				if (listener instanceof ICompletionListenerExtension)
					((ICompletionListenerExtension)listener).assistSessionRestarted(event);
			}
		}
	}

	/**
	 * Fires a session end event to all registered {@link ICompletionListener}s.
	 *
	 * @since 3.2
	 */
	void fireSessionEndEvent() {
		if (contentAssistSubjectControlAdapter != null) {
			IContentAssistProcessor processor= getProcessor(contentAssistSubjectControlAdapter, contentAssistSubjectControlAdapter.getSelectedRange().offset);
			ContentAssistEvent event= new ContentAssistEvent(this, processor);
			Object[] listeners= fCompletionListeners.getListeners();
			for (int i= 0; i < listeners.length; i++) {
				ICompletionListener listener= (ICompletionListener)listeners[i];
				listener.assistSessionEnded(event);
			}
		}
	}
	
	/**
	 * Hides any open pop-ups.
	 *
	 * @since 3.0
	 */
	protected void hide() {
		if (proposalPopup != null)
			proposalPopup.hide();

//		if (contextInfoPopup != null)
//			contextInfoPopup.hide();
	}
	
	/**
	 * Registers a content assist listener. The following are valid listener types:
	 * <ul>
	 *   <li>AUTO_ASSIST</li>
	 *   <li>CONTEXT_SELECTOR</li>
	 *   <li>PROPOSAL_SELECTOR</li>
	 *   <li>CONTEXT_INFO_POPUP</li>
	 * </ul>
	 * Returns whether the listener could be added successfully. A listener can not be added if the
	 * widget token could not be acquired.
	 *
	 * @param listener the listener to register
	 * @param type the type of listener
	 * @return <code>true</code> if the listener could be added
	 */
	boolean addContentAssistListener(IContentAssistListener listener, int type) {

//		if (acquireWidgetToken(type)) {
//
			listeners[type]= listener;

			if (closer == null && getNumberOfListeners() == 1) {
//			if( closer == null ) {
				closer= new Closer();
				closer.install();
//			}
				contentAssistSubjectControlAdapter.setEventConsumer(internalListener);
				installKeyListener();
			} else
				promoteKeyListener();
			return true;
//		}

//		return false;
//		return true;
	}
	
	void removeContentAssistListener(IContentAssistListener listener, int type) {
		listeners[type]= null;

		if (getNumberOfListeners() == 0) {

			if (closer != null) {
				closer.uninstall();
				closer= null;
			}

			uninstallVerifyKeyListener();
			contentAssistSubjectControlAdapter.setEventConsumer(null);
		}

//		releaseWidgetToken(type);
	}
	
	/**
	 * Returns whether the widget token could be acquired. The following are valid listener types:
	 * <ul>
	 *   <li>AUTO_ASSIST</li>
	 *   <li>CONTEXT_SELECTOR</li>
	 *   <li>PROPOSAL_SELECTOR</li>
	 *   <li>CONTEXT_INFO_POPUP</li>
	 * </ul>
	 *
	 * @param type the listener type for which to acquire
	 * @return <code>true</code> if the widget token could be acquired
	 * @since 2.0
	 */
	private boolean acquireWidgetToken(int type) {
//		switch (type) {
//			case CONTEXT_SELECTOR:
//			case PROPOSAL_SELECTOR:
//				if (contentAssistSubjectControl instanceof IWidgetTokenOwnerExtension) {
//					IWidgetTokenOwnerExtension extension= (IWidgetTokenOwnerExtension) fContentAssistSubjectControl;
//					return extension.requestWidgetToken(this, WIDGET_PRIORITY);
//				} else if (fContentAssistSubjectControl instanceof IWidgetTokenOwner) {
//					IWidgetTokenOwner owner= (IWidgetTokenOwner) fContentAssistSubjectControl;
//					return owner.requestWidgetToken(this);
//				} else if (fViewer instanceof IWidgetTokenOwnerExtension) {
//					IWidgetTokenOwnerExtension extension= (IWidgetTokenOwnerExtension) fViewer;
//					return extension.requestWidgetToken(this, WIDGET_PRIORITY);
//				} else if (fViewer instanceof IWidgetTokenOwner) {
//					IWidgetTokenOwner owner= (IWidgetTokenOwner) fViewer;
//					return owner.requestWidgetToken(this);
//				}
//		}
		return true;
	}
	
	/**
	 * Returns the number of listeners.
	 *
	 * @return the number of listeners
	 * @since 2.0
	 */
	private int getNumberOfListeners() {
		int count= 0;
		for (int i= 0; i <= CONTEXT_INFO_POPUP; i++) {
			if (listeners[i] != null)
				++count;
		}
		return count;
	}
	
	class Closer {
		private Stage stage;
		private Node node;
		
		private EventHandler<MouseEvent> mouseHandler;
		private EventHandler<KeyEvent> keyHandler;
		private ChangeListener<Boolean> focusListener;
		
		protected void install() {
			System.err.println("==========> SETTING UP");
			node = contentAssistSubjectControlAdapter.getControl();
			stage = (Stage) node.getScene().getWindow();
			
			mouseHandler = new EventHandler<MouseEvent>() {
				
				@Override
				public void handle(MouseEvent arg0) {
					System.err.println("===========> MOUSE HANDLER!!!!!!!!!!");
					hide();
				}
			};
			focusListener= new ChangeListener<Boolean>() {

				@Override
				public void changed(ObservableValue<? extends Boolean> arg0,
						Boolean arg1, Boolean arg2) {
					if( ! arg2.booleanValue() ) {
						System.err.println("FOCUS LOST");
						Platform.runLater(new Runnable() {
							public void run() {
								if( ! node.isFocused() && ! proposalPopup.hasFocus() ) {
									System.err.println("CLOSE IT");
									hide();
								}
							}
						});
						
					} else {
						System.err.println("FOCUS GAINED");
					}
				}
			};
			keyHandler = new EventHandler<KeyEvent>() {

				@Override
				public void handle(KeyEvent arg0) {
					if( arg0.getCode() == KeyCode.ESCAPE ) {
						hide();
					}
				}
			};
			
			node.addEventHandler(MouseEvent.MOUSE_PRESSED, mouseHandler);
			node.addEventHandler(MouseEvent.MOUSE_RELEASED, mouseHandler);
			node.addEventHandler(KeyEvent.KEY_PRESSED, keyHandler);
			node.focusedProperty().addListener(focusListener);
		}

		public void uninstall() {
			node.removeEventHandler(MouseEvent.MOUSE_PRESSED, mouseHandler);
			node.removeEventHandler(MouseEvent.MOUSE_RELEASED, mouseHandler);
			node.removeEventHandler(KeyEvent.KEY_PRESSED, keyHandler);
			node.focusedProperty().removeListener(focusListener);
		}
	}
	
	class InternalListener implements EventHandler<VerifyEvent>, IEventConsumer {

		@Override
		public void processEvent(VerifyEvent event) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void handle(VerifyEvent e) {
			IContentAssistListener[] listeners= (IContentAssistListener[]) ContentAssistant.this.listeners.clone();
			for (int i= 0; i < listeners.length; i++) {
				if (listeners[i] != null) {
					if (!listeners[i].verifyKey(e) || e.isConsumed())
						break;
				}
			}
			if (autoAssistListener != null)
				autoAssistListener.handle(e);
		}
		
	}
}
