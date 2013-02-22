package at.bestsolution.efxclipse.text.jface.text;

import java.util.HashMap;

import javafx.scene.paint.Color;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;

import at.bestsolution.efxclipse.styledtext.StyledTextArea;
import at.bestsolution.efxclipse.styledtext.TextSelection;
import at.bestsolution.efxclipse.text.jface.text.internal.StickyHoverManager;

public class TextViewer implements ITextViewer/*, ITextViewerExtension, ITextViewerExtension2, ITextViewerExtension4, ITextViewerExtension6, ITextViewerExtension7, ITextViewerExtension8,
IEditingSupportRegistry, ITextOperationTarget, ITextOperationTargetExtension,
IWidgetTokenOwner, IWidgetTokenOwnerExtension, IPostSelectionProvider*/ {
	
	/**
	 * Width constraint for text hovers (in characters).
	 * @since 3.4
	 */
	private static final int TEXT_HOVER_WIDTH_CHARS= 100; //used to be 60 (text font)
	/**
	 * Height constraint for text hovers (in characters).
	 * @since 3.4
	 */
	private static final int TEXT_HOVER_HEIGHT_CHARS= 12; //used to be 10 (text font)
	
	private StyledTextArea fTextWidget;
	private HashMap<TextHoverKey, ITextHover> fTextHovers;
	private TextViewerHoverManager fTextHoverManager;
	protected IInformationControlCreator fHoverControlCreator;
	
	public TextViewer() {
		createControl();
	}
	
	/**
	 * Factory method to create the text widget to be used as the viewer's text widget.
	 *
	 * @return the text widget to be used
	 */
	protected StyledTextArea createTextWidget() {
		StyledTextArea styledText= new StyledTextArea();
//		styledText.setLeftMargin(Math.max(styledText.getLeftMargin(), 2));
		return styledText;
	}
	
	/**
	 * Creates the viewer's SWT control. The viewer's text widget either is
	 * the control or is a child of the control.
	 */
	protected void createControl() {
		fTextWidget= createTextWidget();
	}
	
	public StyledTextArea getTextWidget() {
		return fTextWidget;
	}

	/*
	 * @see ITextViewerExtension2#setTextHover(ITextHover, String, int)
	 * @since 2.1
	 */
	public void setTextHover(ITextHover hover, String contentType, int stateMask) {
		TextHoverKey key= new TextHoverKey(contentType, stateMask);
		if (hover != null) {
			if (fTextHovers == null) {
				fTextHovers= new HashMap<TextHoverKey,ITextHover>();
			}
			fTextHovers.put(key, hover); 
		} else if (fTextHovers != null)
			fTextHovers.remove(key);

		ensureHoverControlManagerInstalled();
	}
	
	/**
	 * After this method has been executed the caller knows that any installed text hover has been installed.
	 */
	private void ensureHoverControlManagerInstalled() {
		if (fTextHovers != null && !fTextHovers.isEmpty() && fHoverControlCreator != null && fTextHoverManager == null) {
			fTextHoverManager= new TextViewerHoverManager(this, fHoverControlCreator);
			fTextHoverManager.install(this.getTextWidget());
			fTextHoverManager.setSizeConstraints(TEXT_HOVER_WIDTH_CHARS, TEXT_HOVER_HEIGHT_CHARS, false, true);
			fTextHoverManager.setInformationControlReplacer(new StickyHoverManager(this));
		}
	}
	
	// -----------------------------------------------------------------------------
	// -----------------------------------------------------------------------------
	// -----------------------------------------------------------------------------
	// -----------------------------------------------------------------------------
	// -----------------------------------------------------------------------------
	// -----------------------------------------------------------------------------
	
	@Override
	public void setUndoManager(IUndoManager undoManager) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTextDoubleClickStrategy(ITextDoubleClickStrategy strategy,
			String contentType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAutoIndentStrategy(IAutoIndentStrategy strategy,
			String contentType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTextHover(ITextHover textViewerHover, String contentType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void activatePlugins() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resetPlugins() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addViewportListener(IViewportListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeViewportListener(IViewportListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addTextListener(ITextListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeTextListener(ITextListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addTextInputListener(ITextInputListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeTextInputListener(ITextInputListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDocument(IDocument document) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IDocument getDocument() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEventConsumer(IEventConsumer consumer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEditable(boolean editable) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEditable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setDocument(IDocument document, int modelRangeOffset,
			int modelRangeLength) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVisibleRegion(int offset, int length) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resetVisibleRegion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IRegion getVisibleRegion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean overlapsWithVisibleRegion(int offset, int length) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void changeTextPresentation(TextPresentation presentation,
			boolean controlRedraw) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void invalidateTextPresentation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTextColor(Color color) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTextColor(Color color, int offset, int length,
			boolean controlRedraw) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ITextOperationTarget getTextOperationTarget() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IFindReplaceTarget getFindReplaceTarget() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDefaultPrefixes(String[] defaultPrefixes, String contentType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setIndentPrefixes(String[] indentPrefixes, String contentType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSelectedRange(int offset, int length) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TextSelection getSelectedRange() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void revealRange(int offset, int length) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTopIndex(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getTopIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getTopIndexStartOffset() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getBottomIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getBottomIndexEndOffset() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getTopInset() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	/**
	 * Value object used as key in the text hover configuration table. It is
	 * modifiable only inside this compilation unit to allow the reuse of created
	 * objects for efficiency reasons
	 *
	 * @since 2.1
	 */
	protected class TextHoverKey {

		/** The content type this key belongs to */
		private String fContentType;
		/** The state mask */
		private int fStateMask;

		/**
		 * Creates a new text hover key for the given content type and state mask.
		 *
		 * @param contentType the content type
		 * @param stateMask the state mask
		 */
		protected TextHoverKey(String contentType, int stateMask) {
			Assert.isNotNull(contentType);
			fContentType= contentType;
			fStateMask= stateMask;
		}

		/*
		 * @see java.lang.Object#equals(java.lang.Object)
		 */
		public boolean equals(Object obj) {
			if (obj == null || obj.getClass() != getClass())
				return false;
			TextHoverKey textHoverKey= (TextHoverKey)obj;
			return textHoverKey.fContentType.equals(fContentType) && textHoverKey.fStateMask == fStateMask;
		}

		/*
		 * @see java.lang.Object#hashCode()
		 */
		public int hashCode() {
	 		return fStateMask << 16 | fContentType.hashCode();
		}

		/**
		 * Sets the state mask of this text hover key.
		 *
		 * @param stateMask the state mask
		 */
		private void setStateMask(int stateMask) {
			fStateMask= stateMask;
		}
	}
	
}
