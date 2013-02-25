package at.bestsolution.efxclipse.text.jface.contentassist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import org.eclipse.core.commands.ICommandListener;
import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentExtension3;
import org.eclipse.jface.text.TextUtilities;

import at.bestsolution.efxclipse.text.jface.ITextViewer;

public class ContentAssistant implements IContentAssistant, IContentAssistantExtension {
	private static final int DEFAULT_AUTO_ACTIVATION_DELAY= 500;
	
	private String partitioning;
	private ITextViewer viewer;
	private ContentAssistSubjectControlAdapter contentAssistSubjectControlAdapter;
	private boolean autoActivated = true;
	private AutoAssistListener autoAssistListener;
	private Map<String, IContentAssistProcessor> processors;
	private int autoActivationDelay= DEFAULT_AUTO_ACTIVATION_DELAY;
	private long lastAutoActivation= Long.MIN_VALUE;
	private List<ICompletionListener> completionListeners = new ArrayList<>();
	private CompletionProposalPopup proposalPopup;
	private String lastErrorMessage;
	private boolean showEmptyList;
	private ContextInformationPopup contextInfoPopup;
	
	/**
	 * Prefix completion setting.
	 *
	 * @since 3.0
	 */
	private boolean prefixCompletionEnabled = false;

	private boolean autoInserting = true;
	
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
//				if (contentAssistSubjectControlAdapter.supportsVerifyKeyListener())
//					contentAssistSubjectControlAdapter.appendVerifyKeyListener(fAutoAssistListener);
//				else
				contentAssistSubjectControlAdapter.addKeyListener(autoAssistListener);
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
	
	/**
	 * Fires an event after applying a proposal, see {@link ICompletionListenerExtension2}.
	 * 
	 * @param proposal the applied proposal
	 * @since 3.8
	 */
	void fireAppliedEvent(ICompletionProposal proposal) {
		for (ICompletionListener listener : new ArrayList<>(completionListeners)) {
			if (listener instanceof ICompletionListenerExtension2)
				((ICompletionListenerExtension2)listener).applied(proposal);
		}
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
//		if (fVerifyKeyListenerHooked) {
//			if (Helper.okToUse(fContentAssistSubjectControlAdapter.getControl()))
//				fContentAssistSubjectControlAdapter.removeVerifyKeyListener(fInternalListener);
//			fVerifyKeyListenerHooked= false;
//		}
	}
	
	/**
	 * Installs a key listener on the text viewer's widget.
	 */
	private void installKeyListener() {
//		if (!fVerifyKeyListenerHooked) {
//			if (Helper.okToUse(fContentAssistSubjectControlAdapter.getControl())) {
//				fVerifyKeyListenerHooked= fContentAssistSubjectControlAdapter.prependVerifyKeyListener(fInternalListener);
//			}
//		}
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
			for (ICompletionListener listener : new ArrayList<ICompletionListener>(completionListeners)) {
				listener.assistSessionStarted(event);
			}
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
	
	class AutoAssistListener implements EventHandler<KeyEvent> {

		@Override
		public void handle(KeyEvent event) {
			// TODO Auto-generated method stub
			System.err.println("HANDLING A KEY-PRESS");
			if( event.getText().equals(".") ) {
				System.err.println("SHOWING");
			}
		}
		
	}
}
