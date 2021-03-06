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
package at.bestsolution.efxclipse.text.jface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javafx.event.EventHandler;
import javafx.scene.Node;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.FindReplaceDocumentAdapter;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentInformationMapping;
import org.eclipse.jface.text.IDocumentInformationMappingExtension2;
import org.eclipse.jface.text.IDocumentListener;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ISlaveDocumentManager;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.SlaveDocumentEvent;
import org.eclipse.jface.text.projection.ChildDocument;
import org.eclipse.jface.text.projection.ChildDocumentManager;

import at.bestsolution.efxclipse.styledtext.StyleRange;
import at.bestsolution.efxclipse.styledtext.StyledTextArea;
import at.bestsolution.efxclipse.styledtext.TextSelection;
import at.bestsolution.efxclipse.styledtext.VerifyEvent;

public class TextViewer implements ITextViewer, ITextViewerExtension, ITextOperationTarget {
	
	private Node layoutNode;
	private StyledTextArea textWidget;
	
	private List<ITextInputListener> textInputListeners;
	private List<ITextListener> textListeners;
	private String partitioning;
	private IDocument document;
	private IDocument visibleDocument;
	private VisibleDocumentListener visibleDocumentListener= new VisibleDocumentListener();
	private ISlaveDocumentManager slaveDocumentManager;
	private WidgetCommand widgetCommand= new WidgetCommand();
	
	/**
	 * Last selection range sent to selection change listeners.
	 * @since 3.0
	 */
	private IRegion lastSentSelectionChange;
	private IDocumentInformationMapping informationMapping;
	private IDocumentAdapter documentAdapter;
	/**
	 * The find/replace document adapter.
	 * @since 3.0
	 */
	protected FindReplaceDocumentAdapter findReplaceDocumentAdapter;
	/**
	 * The flag indicating the redraw behavior
	 * @since 2.0
	 */
	private int redrawCounter= 0;
	/**
	 * All registered text presentation listeners.
	 * since 3.0
	 */
	protected List<ITextPresentationListener> textPresentationListeners;
	
	protected boolean replaceTextPresentation= false;
	
	private VerifyKeyListenersManager fVerifyKeyListenersManager= new VerifyKeyListenersManager();
	private RewriteTarget rewriteTarget;
	private IEventConsumer eventConsumer;
	private TextVerifyListener verifyListener= new TextVerifyListener();
	
	public TextViewer() {
		layoutNode = createLayoutNode();
	}
	
	@Override
	public boolean canDoOperation(int operation) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public void doOperation(int operation) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void setSelectedRange(int offset, int length) {
		if (textWidget == null)
			return;
		
		IRegion widgetSelection= modelRange2ClosestWidgetRange(new Region(offset, length));
		if (widgetSelection != null) {

			int[] selectionRange= new int[] { widgetSelection.getOffset(), widgetSelection.getLength() };
			validateSelectionRange(selectionRange);
			if (selectionRange[0] >= 0) {
				textWidget.setSelectionRange(selectionRange[0], selectionRange[1]);
				selectionChanged(selectionRange[0], selectionRange[1]);
			}
		}
	}
	
	@Override
	public TextSelection getSelectedRange() {
		return textWidget.getSelection();
	}
	
	/**
	 * Sends out a text selection changed event to all registered listeners and
	 * registers the selection changed event to be sent out to all post selection
	 * listeners.
	 *
	 * @param offset the offset of the newly selected range in the visible document
	 * @param length the length of the newly selected range in the visible document
	 */
	protected void selectionChanged(int offset, int length) {
		queuePostSelectionChanged(true);
		fireSelectionChanged(offset, length);
	}
	
	private void fireSelectionChanged(int offset, int length) {
		// TODO Auto-generated method stub
		
	}

	private void queuePostSelectionChanged(boolean b) {
		// TODO Auto-generated method stub
		
	} 

	/**
	 * Validates and adapts the given selection range if it is not a valid
	 * widget selection. The widget selection is invalid if it starts or ends
	 * inside a multi-character line delimiter. If so, the selection is adapted to
	 * start <b>after</b> the divided line delimiter and to end <b>before</b>
	 * the divided line delimiter.  The parameter passed in is changed in-place
	 * when being adapted. An adaptation to <code>[-1, -1]</code> indicates
	 * that the selection range could not be validated.
	 * Subclasses may reimplement this method.
	 *
	 * @param selectionRange selectionRange[0] is the offset, selectionRange[1]
	 * 				the length of the selection to validate.
	 * @since 2.0
	 */
	protected void validateSelectionRange(int[] selectionRange) {

		IDocument document= getVisibleDocument();
		if (document == null) {
			selectionRange[0]= -1;
			selectionRange[1]= -1;
			return;
		}

		int documentLength= document.getLength();
		int offset= selectionRange[0];
		int length= selectionRange[1];

		if (length < 0) {
			length= - length;
			offset -= length;
		}

		if (offset <0)
			offset= 0;

		if (offset > documentLength)
			offset= documentLength;

		int delta= (offset + length) - documentLength;
		if (delta > 0)
			length -= delta;

		try {

			int lineNumber= document.getLineOfOffset(offset);
			IRegion lineInformation= document.getLineInformation(lineNumber);

			int lineEnd= lineInformation.getOffset() + lineInformation.getLength();
			delta= offset - lineEnd;
			if (delta > 0) {
				// in the middle of a multi-character line delimiter
				offset= lineEnd;
				length += delta;
				String delimiter= document.getLineDelimiter(lineNumber);
				if (delimiter != null) {
					int delimiterLength= delimiter.length();
					offset += delimiterLength;
					length -= delimiterLength;
				}
			}

			int end= offset + length;
			lineInformation= document.getLineInformationOfOffset(end);
			lineEnd= lineInformation.getOffset() + lineInformation.getLength();
			delta= end - lineEnd;
			if (delta > 0) {
				// in the middle of a multi-character line delimiter
				length -= delta;
			}

		} catch (BadLocationException x) {
			selectionRange[0]= -1;
			selectionRange[1]= -1;
			return;
		}

		if (selectionRange[1] < 0) {
			selectionRange[0]= offset + length;
			selectionRange[1]= -length;
		} else {
			selectionRange[0]= offset;
			selectionRange[1]= length;
		}
	}
	
	@Override
	public void revealRange(int offset, int length) {
		// TODO Auto-generated method stub
	}
	
	/**
	 * Similar to {@link #modelRange2WidgetRange(IRegion)}, but more forgiving:
	 * if <code>modelRange</code> describes a region entirely hidden in the
	 * image, then this method returns the zero-length region at the offset of
	 * the folded region.
	 *
	 * @param modelRange the model range
	 * @return the corresponding widget range, or <code>null</code>
	 * @since 3.1
	 */
	protected IRegion modelRange2ClosestWidgetRange(IRegion modelRange) {
		if (!(informationMapping instanceof IDocumentInformationMappingExtension2))
			return modelRange2WidgetRange(modelRange);

		try {
			if (modelRange.getLength() < 0) {
				Region reversed= new Region(modelRange.getOffset() + modelRange.getLength(), -modelRange.getLength());
				IRegion result= ((IDocumentInformationMappingExtension2) informationMapping).toClosestImageRegion(reversed);
				if (result != null)
					return new Region(result.getOffset() + result.getLength(), -result.getLength());
			}
			return ((IDocumentInformationMappingExtension2) informationMapping).toClosestImageRegion(modelRange);

		} catch (BadLocationException x) {
		}

		return null;
	}
	
	public boolean isEditable() {
		if (textWidget == null)
			return false;
		return textWidget.getEditable();
	}
	
	protected StyledTextArea createStyledTextControl() {
		StyledTextArea area = new StyledTextArea();
		return area;
	}
	
	protected Node createLayoutNode() {
		textWidget = createStyledTextControl(); 
		
		verifyListener.forward(true);
		textWidget.addEventHandler(VerifyEvent.VERIFY,verifyListener);
		
		return textWidget;
	}
	
	public StyledTextArea getTextWidget() {
		return textWidget;
	}
	
	public Node getLayoutNode() {
		return layoutNode;
	}
	
	@Override
	public void removeTextListener(ITextListener listener) {
		if( textListeners != null ) {
			textListeners.remove(listener);
		}
	}

	@Override
	public void addTextListener(ITextListener listener) {
		if( textListeners == null ) {
			textListeners = new ArrayList<>();
		}
		textListeners.add(listener);
	}

	@Override
	public void addTextInputListener(ITextInputListener listener) {
		if( textInputListeners == null ) {
			textInputListeners = new ArrayList<>();
		}
		textInputListeners.add(listener);
	}
	
	@Override
	public void removeTextInputListener(ITextInputListener listener) {
		if( textInputListeners != null ) {
			textInputListeners.remove(listener);
		}
	}
	
	/**
	 * Sets the document partitioning of this viewer. The partitioning is used by this viewer to
	 * access partitioning information of the viewers input document.
	 *
	 * @param partitioning the partitioning name
	 * @since 3.0
	 */
	public void setDocumentPartitioning(String partitioning) {
		this.partitioning = partitioning; 
	}

	@Override
	public IDocument getDocument() {
		return document;
	}

	/**
	 * Returns whether this viewer redraws itself.
	 *
	 * @return <code>true</code> if this viewer redraws itself
	 * @since 2.0
	 */
	protected final boolean redraws() {
		return redrawCounter <= 0;
	}
	

	@Override
	public void changeTextPresentation(TextPresentation presentation, boolean controlRedraw) {
		if (presentation == null || !redraws())
			return;

		if (textWidget == null)
			return;
		
		/*
		 * Call registered text presentation listeners
		 * and let them apply their presentation. 
		 */
		if (textPresentationListeners != null) {
			ArrayList<ITextPresentationListener> listeners= new ArrayList<ITextPresentationListener>(textPresentationListeners);
			for (int i= 0, size= listeners.size(); i < size; i++) {
				ITextPresentationListener listener= (ITextPresentationListener)listeners.get(i);
				listener.applyTextPresentation(presentation);
			}
		}
		
		if (controlRedraw)
			textWidget.setRedraw(false);

		if (replaceTextPresentation)
			applyTextPresentation(presentation);
		else
			addPresentation(presentation);

		if (controlRedraw)
			textWidget.setRedraw(true);
	}
	
	/**
	 * Applies the given presentation to the given text widget. Helper method.
	 *
	 * @param presentation the style information
	 * @since 2.1
	 */
	private void applyTextPresentation(TextPresentation presentation) {

		List<StyleRange> list= new ArrayList<>(presentation.getDenumerableRanges());
		Iterator<StyleRange> e = presentation.getAllStyleRangeIterator();
		while (e.hasNext()) {
			StyleRange range= e.next();
			range= modelStyleRange2WidgetStyleRange(range);
			if (range != null)
				list.add(range);
		}

		if (!list.isEmpty()) {
			StyleRange[] ranges= new StyleRange[list.size()];
			list.toArray(ranges);
			textWidget.setStyleRanges(ranges);
		}
	}
	
	/**
	 * Adds the given presentation to the viewer's style information.
	 *
	 * @param presentation the presentation to be added
	 */
	private void addPresentation(TextPresentation presentation) {

		StyleRange range= presentation.getDefaultStyleRange();
		if (range != null) {

			range= modelStyleRange2WidgetStyleRange(range);
			if (range != null)
				textWidget.setStyleRange(range);

			ArrayList<StyleRange> ranges= new ArrayList<>(presentation.getDenumerableRanges());
			Iterator<StyleRange> e= presentation.getNonDefaultStyleRangeIterator();
			while (e.hasNext()) {
				range= (StyleRange) e.next();
				range= modelStyleRange2WidgetStyleRange(range);
				if (range != null)
					ranges.add(range);
			}

			if (!ranges.isEmpty())
				textWidget.replaceStyleRanges(0, 0, (StyleRange[])ranges.toArray(new StyleRange[ranges.size()]));

		} else {
			IRegion region= modelRange2WidgetRange(presentation.getCoverage());
			if (region == null)
				return;

			List<StyleRange> list= new ArrayList<>(presentation.getDenumerableRanges());
			Iterator<StyleRange> e= presentation.getAllStyleRangeIterator();
			while (e.hasNext()) {
				range= (StyleRange) e.next();
				range= modelStyleRange2WidgetStyleRange(range);
				if (range != null)
					list.add(range);
			}

			if (!list.isEmpty()) {
				StyleRange[] ranges= new StyleRange[list.size()];
				list.toArray(ranges);
				textWidget.replaceStyleRanges(region.getOffset(), region.getLength(), ranges);
			}
		}
	}
	
	/**
	 * Translates a style range given relative to the viewer's document into style
	 * ranges relative to the viewer's widget or <code>null</code>.
	 *
	 * @param range the style range in the coordinates of the viewer's document
	 * @return the style range in the coordinates of the viewer's widget or <code>null</code>
	 * @since 2.1
	 */
	protected StyleRange modelStyleRange2WidgetStyleRange(StyleRange range) {
		IRegion region= modelRange2WidgetRange(new Region(range.start, range.length));
		if (region != null) {
			StyleRange result= (StyleRange) range.clone();
			result.start= region.getOffset();
			result.length= region.getLength();
			return result;
		}
		return null;
	}
	
	/**
	 * Implements the contract of {@link ITextViewerExtension5#modelRange2WidgetRange(IRegion)}.
	 *
	 * @param modelRange the model range
	 * @return the corresponding widget range or <code>null</code>
	 * @since 2.1
	 */
	public IRegion modelRange2WidgetRange(IRegion modelRange) {
		if (informationMapping == null)
			return modelRange;

		try {

			if (modelRange.getLength() < 0) {
				Region reversed= new Region(modelRange.getOffset() + modelRange.getLength(), -modelRange.getLength());
				IRegion result= informationMapping.toImageRegion(reversed);
				if (result != null)
					return new Region(result.getOffset() + result.getLength(), -result.getLength());
			}
			return informationMapping.toImageRegion(modelRange);

		} catch (BadLocationException x) {
		}

		return null;
	}

	@Override
	public IRegion getVisibleRegion() {

		IDocument document= getVisibleDocument();
		if (document instanceof ChildDocument) {
			Position p= ((ChildDocument) document).getParentDocumentRange();
			return new Region(p.getOffset(), p.getLength());
		}

		return new Region(0, document == null ? 0 : document.getLength());
	}

	@Override
	public void setDocument(IDocument document) {
		fireInputDocumentAboutToBeChanged(this.document, document);
		
		IDocument oldDocument= document;
		this.document= document;
		
		setVisibleDocument(this.document);
		
		fireInputDocumentChanged(oldDocument, this.document);
	}

	
	@Override
	public void setDocument(IDocument document, int modelRangeOffset,
			int modelRangeLength) {
		fireInputDocumentAboutToBeChanged(this.document, document);

		IDocument oldDocument= this.document;
		this.document= document;

		try {

			IDocument slaveDocument= createSlaveDocument(document);
			updateSlaveDocument(slaveDocument, modelRangeOffset, modelRangeLength);
			setVisibleDocument(slaveDocument);

		} catch (BadLocationException x) {
			throw new IllegalArgumentException();
		}
		
		fireInputDocumentChanged(oldDocument, this.document);
	}
	
	/**
	 * Updates the given slave document to show the specified range of its master document.
	 *
	 * @param slaveDocument the slave document
	 * @param modelRangeOffset the offset of the master document range
	 * @param modelRangeLength the length of the master document range
	 * @return <code>true</code> if the slave has been adapted successfully
	 * @throws BadLocationException in case the specified range is not valid in the master document
	 * @since 3.0
	 */
	protected boolean updateSlaveDocument(IDocument slaveDocument, int modelRangeOffset, int modelRangeLength) throws BadLocationException {
		return updateVisibleDocument(slaveDocument, modelRangeOffset, modelRangeLength);
	}
	
	/**
	 * Sets the given slave document to the specified range of its master document.
	 *
	 * @param visibleDocument the slave document
	 * @param visibleRegionOffset the offset of the master document range
	 * @param visibleRegionLength the length of the master document range
	 * @return <code>true</code> if the slave has been adapted successfully
	 * @throws BadLocationException in case the specified range is not valid in the master document
	 * @since 2.1
 	 * @deprecated use <code>updateSlaveDocument</code> instead
	 */
	protected boolean updateVisibleDocument(IDocument visibleDocument, int visibleRegionOffset, int visibleRegionLength) throws BadLocationException {
		if (visibleDocument instanceof ChildDocument) {
			ChildDocument childDocument= (ChildDocument) visibleDocument;

			IDocument document= childDocument.getParentDocument();
			int line= document.getLineOfOffset(visibleRegionOffset);
			int offset= document.getLineOffset(line);
			int length= (visibleRegionOffset - offset) + visibleRegionLength;

			Position parentRange= childDocument.getParentDocumentRange();
			if (offset != parentRange.getOffset() || length != parentRange.getLength()) {
				childDocument.setParentDocumentRange(offset, length);
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Creates a slave document for the given document if there is a slave document manager
	 * associated with this viewer.
	 *
	 * @param document the master document
	 * @return the newly created slave document
	 * @since 2.1
	 */
	protected IDocument createSlaveDocument(IDocument document) {
		ISlaveDocumentManager manager= getSlaveDocumentManager();
		if (manager != null) {
			if (manager.isSlaveDocument(document))
				return document;
			return manager.createSlaveDocument(document);
		}
		return document;
	}
	
	/**
	 * Sets this viewer's visible document. The visible document represents the
	 * visible region of the viewer's input document.
	 *
	 * @param document the visible document
	 */
	protected void setVisibleDocument(IDocument document) {

		if (visibleDocument == document && visibleDocument instanceof ChildDocument) {
			// optimization for new child documents
			return;
		}

		if (visibleDocument != null) {
			if (visibleDocumentListener != null)
				visibleDocument.removeDocumentListener(visibleDocumentListener);
			if (visibleDocument != document)
				freeSlaveDocument(visibleDocument);
		}

		this.visibleDocument= document;
		initializeDocumentInformationMapping(visibleDocument);

		initializeWidgetContents();

		findReplaceDocumentAdapter= null;
		if (visibleDocument != null && visibleDocumentListener != null)
			visibleDocument.addDocumentListener(visibleDocumentListener);
	}
	
	/**
	 * Initializes the document information mapping between the given slave document and
	 * its master document.
	 *
	 * @param visibleDocument the slave document
	 * @since 2.1
	 */ 
	protected void initializeDocumentInformationMapping(IDocument visibleDocument) {
		ISlaveDocumentManager manager= getSlaveDocumentManager();
		informationMapping= manager == null ? null : manager.createMasterSlaveMapping(visibleDocument);
	}
	
	/**
	 * Initializes the text widget with the visual document and
	 * invalidates the overall presentation.
	 */
	private void initializeWidgetContents() {

		if (textWidget != null && visibleDocument != null) {

			// set widget content
			if (documentAdapter == null)
				documentAdapter = createDocumentAdapter();

			documentAdapter.setDocument(visibleDocument);
			textWidget.setContent(documentAdapter);

			// invalidate presentation
			invalidateTextPresentation(); 
		}
	}
	
	/*
	 * @see org.eclipse.jface.text.ITextViewer#invalidateTextPresentation()
	 */
	public final void invalidateTextPresentation() {
		if (visibleDocument != null) {
			widgetCommand.event= null;
			widgetCommand.start= 0;
			widgetCommand.length= visibleDocument.getLength();
			widgetCommand.text= visibleDocument.get();
			updateTextListeners(widgetCommand);
		}
	}
	
	/**
	 * Factory method to create the document adapter to be used by this viewer.
	 *
	 * @return the document adapter to be used
	 */
	protected IDocumentAdapter createDocumentAdapter() {
		return new DefaultDocumentAdapter();
	}
	
	/**
	 * Returns the viewer's visible document.
	 *
	 * @return the viewer's visible document
	 */
	protected IDocument getVisibleDocument() {
		return visibleDocument;
	}
	
	/**
	 * Informs all registered text input listeners about the forthcoming input change,
	 * This method does not use a robust iterator.
	 *
	 * @param oldInput the old input document
	 * @param newInput the new input document
	 */
	protected void fireInputDocumentAboutToBeChanged(IDocument oldInput, IDocument newInput) {
		List<ITextInputListener> listener= textInputListeners;
		if (listener != null) {
			for (int i= 0; i < listener.size(); i++) {
				ITextInputListener l= listener.get(i);
				l.inputDocumentAboutToBeChanged(oldInput, newInput);
			}
		}
	}
	
	/**
	 * Informs all registered text input listeners about the successful input change,
	 * This method does not use a robust iterator.
	 *
	 * @param oldInput the old input document
	 * @param newInput the new input document
	 */
	protected void fireInputDocumentChanged(IDocument oldInput, IDocument newInput) {
		List<ITextInputListener> listener= textInputListeners;
		if (listener != null) {
			for (int i= 0; i < listener.size(); i++) {
				ITextInputListener l= listener.get(i);
				l.inputDocumentChanged(oldInput, newInput);
			}
		}
	}
	
	/**
	 * Hook method called when the visible document is about to be changed.
	 * <p>
	 * Subclasses may override.
	 *
	 * @param event the document event
	 * @since 3.0
	 */
	protected void handleVisibleDocumentAboutToBeChanged(DocumentEvent event) {
	}
	
	/**
	 * Hook method called when the visible document has been changed.
	 * <p>
	 * Subclasses may override.
	 *
	 * @param event the document event
	 * @since 3.0
	 */
	protected void handleVisibleDocumentChanged(DocumentEvent event) {
	}
	
	/**
	 * Frees the given document if it is a slave document.
	 *
	 * @param slave the potential slave document
	 * @since 3.0
	 */
	protected void freeSlaveDocument(IDocument slave) {
		ISlaveDocumentManager manager= getSlaveDocumentManager();
		if (manager != null && manager.isSlaveDocument(slave))
			manager.freeSlaveDocument(slave);
	}
	
	/**
	 * Returns the slave document manager
	 *
	 * @return the slave document manager
	 * @since 2.1
	 */
	protected ISlaveDocumentManager getSlaveDocumentManager() {
		if (slaveDocumentManager == null)
			slaveDocumentManager= createSlaveDocumentManager();
		return slaveDocumentManager;
	}
	
	/**
	 * Creates a new slave document manager. This implementation always
	 * returns a <code>ChildDocumentManager</code>.
	 *
	 * @return ISlaveDocumentManager
	 * @since 2.1
	 */
	protected ISlaveDocumentManager createSlaveDocumentManager() {
		return new ChildDocumentManager();
	}
	
	/**
	 * Informs all registered text listeners about the change specified by the
	 * widget command. This method does not use a robust iterator.
	 *
	 * @param cmd the widget command translated into a text event sent to all text listeners
	 */
	protected void updateTextListeners(WidgetCommand cmd) {
		List<ITextListener> textListeners= this.textListeners;
		if (textListeners != null) {
			textListeners= new ArrayList<>(textListeners);
			DocumentEvent event= cmd.event;
			if (event instanceof SlaveDocumentEvent)
				event= ((SlaveDocumentEvent) event).getMasterEvent();
			TextEvent e= new TextEvent(cmd.start, cmd.length, cmd.text, cmd.preservedText, event, redraws());
			for (int i= 0; i < textListeners.size(); i++) {
				ITextListener l= (ITextListener) textListeners.get(i);
				l.textChanged(e);
			}
		}
	}
	
	@Override
	public void appendVerifyKeyListener(EventHandler<VerifyEvent> listener) {
		int index= fVerifyKeyListenersManager.numberOfListeners();
		fVerifyKeyListenersManager.insertListener(listener, index);
	}
	
	@Override
	public void prependVerifyKeyListener(EventHandler<VerifyEvent> listener) {
		fVerifyKeyListenersManager.insertListener(listener, 0);
	}
	
	@Override
	public void removeVerifyKeyListener(EventHandler<VerifyEvent> listener) {
		fVerifyKeyListenersManager.removeListener(listener);
	}
	
	public IRewriteTarget getRewriteTarget() {
		if (rewriteTarget == null)
			rewriteTarget= new RewriteTarget();
		return rewriteTarget;
	}
	
	/**
	 * Internal document listener on the visible document.
	 */
	class VisibleDocumentListener implements IDocumentListener {

		/*
		 * @see IDocumentListener#documentAboutToBeChanged
		 */
		public void documentAboutToBeChanged(DocumentEvent e) {
			if (e.getDocument() == getVisibleDocument())
				widgetCommand.setEvent(e);
			handleVisibleDocumentAboutToBeChanged(e);
		}

		/*
		 * @see IDocumentListener#documentChanged
		 */
		public void documentChanged(DocumentEvent e) {
			if (widgetCommand.event == e)
				updateTextListeners(widgetCommand);
			lastSentSelectionChange= null;
			handleVisibleDocumentChanged(e);
		}
	}
	
	/**
	 * Represents a replace command that brings the text viewer's text widget
	 * back in synchronization with text viewer's document after the document
	 * has been changed.
	 */
	protected class WidgetCommand {

		/** The document event encapsulated by this command. */
		public DocumentEvent event;
		/** The start of the event. */
		public int start;
		/** The length of the event. */
		public int length;
		/** The inserted and replaced text segments of <code>event</code>. */
		public String text;
		/** The replaced text segments of <code>event</code>. */
		public String preservedText;

		/**
		 * Translates a document event into the presentation coordinates of this text viewer.
		 *
		 * @param e the event to be translated
		 */
		public void setEvent(DocumentEvent e) {

			event= e;

			start= e.getOffset();
			length= e.getLength();
			text= e.getText();

			if (length != 0) {
				try {

					if (e instanceof SlaveDocumentEvent) {
						SlaveDocumentEvent slave= (SlaveDocumentEvent) e;
						DocumentEvent master= slave.getMasterEvent();
						if (master != null)
							preservedText= master.getDocument().get(master.getOffset(), master.getLength());
					} else {
						preservedText= e.getDocument().get(e.getOffset(), e.getLength());
					}

				} catch (BadLocationException x) {
					preservedText= null;
//					if (TRACE_ERRORS)
//						System.out.println(JFaceTextMessages.getString("TextViewer.error.bad_location.WidgetCommand.setEvent")); //$NON-NLS-1$
				}
			} else
				preservedText= null;
		}
	}
	
	/*
	 * @see ITextViewerExtension4#addTextPresentationListener(ITextPresentationListener)
	 * @since 3.0
	 */
	public void addTextPresentationListener(ITextPresentationListener listener) {

		Assert.isNotNull(listener);

		if (textPresentationListeners == null)
			textPresentationListeners= new ArrayList();

		if (!textPresentationListeners.contains(listener))
			textPresentationListeners.add(listener);
	}

	/*
	 * @see ITextViewerExtension4#removeTextPresentationListener(ITextPresentationListener)
	 * @since 3.0
	 */
	public void removeTextPresentationListener(ITextPresentationListener listener) {

		Assert.isNotNull(listener);

		if (textPresentationListeners != null) {
			textPresentationListeners.remove(listener);
			if (textPresentationListeners.size() == 0)
				textPresentationListeners= null;
		}
	}
	
	/**
	 * Invalidates the given range of the text presentation.
	 *
	 * @param offset the offset of the range to be invalidated
	 * @param length the length of the range to be invalidated
	 * @since 2.1
	 */
	public final void invalidateTextPresentation(int offset, int length) {
		if (visibleDocument != null) {

			IRegion widgetRange= modelRange2WidgetRange(new Region(offset, length));
			if (widgetRange != null) {

				widgetCommand.event= null;
				widgetCommand.start= widgetRange.getOffset();
				widgetCommand.length= widgetRange.getLength();

				try {
					widgetCommand.text= visibleDocument.get(widgetRange.getOffset(), widgetRange.getLength());
					updateTextListeners(widgetCommand);
				} catch (BadLocationException x) {
					// can not happen because of previous checking
				}
			}
		}
	}
	
	/*
	 * @see ITextViewer#setEventConsumer(IEventConsumer)
	 */
	public void setEventConsumer(IEventConsumer consumer) {
		eventConsumer= consumer;
	}
	
	protected void handleVerifyEvent(VerifyEvent e) {

		if (eventConsumer != null) {
			eventConsumer.processEvent(e);
			if (e.isConsumed())
				return;
		}
		
//		if (fTextWidget.getBlockSelection() && (e.text == null || e.text.length() < 2)) {
//			Point sel = fTextWidget.getSelection();
//			if (fTextWidget.getLineAtOffset(sel.x) != fTextWidget.getLineAtOffset(sel.y)) {
//				verifyEventInBlockSelection(e);
//				return;
//			}
//		}
//
//		IRegion modelRange= event2ModelRange(e);
//		fDocumentCommand.setEvent(e, modelRange);
//		customizeDocumentCommand(fDocumentCommand);
//		if (!fDocumentCommand.fillEvent(e, modelRange)) {
//
//			boolean compoundChange= fDocumentCommand.getCommandCount() > 1;
//			try {
//
//				fVerifyListener.forward(false);
//
//				if (compoundChange && fUndoManager != null)
//					fUndoManager.beginCompoundChange();
//
//				fDocumentCommand.execute(getDocument());
//
//				if (fTextWidget != null) {
//					int documentCaret= fDocumentCommand.caretOffset;
//					if (documentCaret == -1) {
//						// old behavior of document command
//						documentCaret= fDocumentCommand.offset + (fDocumentCommand.text == null ? 0 : fDocumentCommand.text.length());
//					}
//
//					int widgetCaret= modelOffset2WidgetOffset(documentCaret);
//					if (widgetCaret == -1) {
//						// try to move it to the closest spot
//						IRegion region= getModelCoverage();
//						if (region != null) {
//							if (documentCaret <= region.getOffset())
//								widgetCaret= 0;
//							else if (documentCaret >= region.getOffset() + region.getLength())
//								widgetCaret= getVisibleRegion().getLength();
//						}
//					}
//
//					if (widgetCaret != -1) {
//						// there is a valid widget caret
//						fTextWidget.setCaretOffset(widgetCaret);
//					}
//
//					fTextWidget.showSelection();
//				}
//			} catch (BadLocationException x) {
//
//				if (TRACE_ERRORS)
//					System.out.println(JFaceTextMessages.getString("TextViewer.error.bad_location.verifyText")); //$NON-NLS-1$
//
//			} finally {
//
//				if (compoundChange && fUndoManager != null)
//					fUndoManager.endCompoundChange();
//
//				fVerifyListener.forward(true);
//
//			}
//		}
	}

	/**
	 * The viewer's manager responsible for registered verify key listeners.
	 * Uses batches rather than robust iterators because of performance issues.
	 * <p>
	 * The implementation is reentrant, i.e. installed listeners may trigger
	 * further <code>VerifyKeyEvent</code>s that may cause other listeners to be
	 * installed, but not thread safe.
	 * </p>
	 * @since 2.0
	 */
	class VerifyKeyListenersManager implements EventHandler<VerifyEvent> {

		/**
		 * Represents a batched addListener/removeListener command.
		 */
		class Batch {
			/** The index at which to insert the listener. */
			int index;
			/** The listener to be inserted. */
			EventHandler<VerifyEvent> listener;

			/**
			 * Creates a new batch containing the given listener for the given index.
			 *
			 * @param l the listener to be added
			 * @param i the index at which to insert the listener
			 */
			public Batch(EventHandler<VerifyEvent> l, int i) {
				listener= l;
				index= i;
			}
		}

		/** List of registered verify key listeners. */
		private List fListeners= new ArrayList();
		/** List of pending batches. */
		private List fBatched= new ArrayList();
		/** The reentrance count. */
		private int fReentranceCount= 0;

		/*
		 * @see VerifyKeyListener#verifyKey(VerifyEvent)
		 */
		public void handle(VerifyEvent event) {
			if (fListeners.isEmpty())
				return;

			try {
				fReentranceCount++;
				Iterator iterator= fListeners.iterator();
				while (iterator.hasNext() && ! event.isConsumed()) {
					EventHandler<VerifyEvent> listener= (EventHandler<VerifyEvent>) iterator.next();
					listener.handle(event); // we might trigger reentrant calls on GTK
				}
			} finally {
				fReentranceCount--;
			}
			if (fReentranceCount == 0)
				processBatchedRequests();
		}

		/**
		 * Processes the pending batched requests.
		 */
		private void processBatchedRequests() {
			if (!fBatched.isEmpty()) {
				Iterator e= fBatched.iterator();
				while (e.hasNext()) {
					Batch batch= (Batch) e.next();
					insertListener(batch.listener, batch.index);
				}
				fBatched.clear();
			}
		}

		/**
		 * Returns the number of registered verify key listeners.
		 *
		 * @return the number of registered verify key listeners
		 */
		public int numberOfListeners() {
			return fListeners.size();
		}

		/**
		 * Inserts the given listener at the given index or moves it
		 * to that index.
		 *
		 * @param listener the listener to be inserted
		 * @param index the index of the listener or -1 for remove
		 */
		public void insertListener(EventHandler<VerifyEvent> listener, int index) {

			if (index == -1) {
				removeListener(listener);
			} else if (listener != null) {

				if (fReentranceCount > 0) {

					fBatched.add(new Batch(listener, index));

				} else {

					int idx= -1;

					// find index based on identity
					int size= fListeners.size();
					for (int i= 0; i < size; i++) {
						if (listener == fListeners.get(i)) {
							idx= i;
							break;
						}
					}

					// move or add it
					if (idx != index) {

						if (idx != -1)
							fListeners.remove(idx);

						if (index > fListeners.size())
							fListeners.add(listener);
						else
							fListeners.add(index, listener);
					}

					if (size == 0)  // checking old size, i.e. current size == size + 1
						install();
				}
			}
		}

		/**
		 * Removes the given listener.
		 *
		 * @param listener the listener to be removed
		 */
		public void removeListener(EventHandler<VerifyEvent> listener) {
			if (listener == null)
				return;

			if (fReentranceCount > 0) {

				fBatched.add(new Batch(listener, -1));

			} else {

				int size= fListeners.size();
				for (int i= 0; i < size; i++) {
					if (listener == fListeners.get(i)) {
						fListeners.remove(i);
						if (size == 1)  // checking old size, i.e. current size == size - 1
							uninstall();
						return;
					}
				}
			}
		}

		/**
		 * Installs this manager.
		 */
		private void install() {
			StyledTextArea textWidget= getTextWidget();
			if (textWidget != null )
				textWidget.addEventHandler(VerifyEvent.VERIFY,this);
		}

		/**
		 * Uninstalls this manager.
		 */
		private void uninstall() {
			StyledTextArea textWidget= getTextWidget();
			if (textWidget != null )
				textWidget.removeEventHandler(VerifyEvent.VERIFY,this);
		}
	}
	
	class RewriteTarget implements IRewriteTarget {

		@Override
		public IDocument getDocument() {
			return TextViewer.this.getDocument();
		}

		@Override
		public void setRedraw(boolean redraw) {
//			TextViewer.this.setRedraw(redraw);
		}

		@Override
		public void beginCompoundChange() {
//			if (fUndoManager != null)
//				fUndoManager.beginCompoundChange();
		}

		@Override
		public void endCompoundChange() {
//			if (fUndoManager != null)
//				fUndoManager.endCompoundChange();
		}
		
	}
	
	/**
	 * Internal verify listener.
	 */
	class TextVerifyListener implements EventHandler<VerifyEvent> {

		/**
		 * Indicates whether verify events are forwarded or ignored.
		 * @since 2.0
		 */
		private boolean fForward= true;

		/**
		 * Tells the listener to forward received events.
		 *
		 * @param forward <code>true</code> if forwarding should be enabled.
		 * @since 2.0
		 */
		public void forward(boolean forward) {
			fForward= forward;
		}

		/*
		 * @see VerifyListener#verifyText(VerifyEvent)
		 */
		public void handle(VerifyEvent e) {
			if (fForward)
				handleVerifyEvent(e);
		}
	}
}
