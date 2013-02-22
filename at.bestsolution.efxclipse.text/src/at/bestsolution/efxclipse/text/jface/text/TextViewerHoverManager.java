package at.bestsolution.efxclipse.text.jface.text;

import at.bestsolution.efxclipse.styledtext.StyledTextArea;
import at.bestsolution.efxclipse.text.jface.text.internal.InformationControlReplacer;
import at.bestsolution.efxclipse.text.jface.text.internal.StickyHoverManager;



/**
 * This manager controls the layout, content, and visibility of an information
 * control in reaction to mouse hover events issued by the text widget of a
 * text viewer. It overrides <code>computeInformation</code>, so that the
 * computation is performed in a dedicated background thread. This implies
 * that the used <code>ITextHover</code> objects must be capable of
 * operating in a non-UI thread.
 *
 * @since 2.0
 */
class TextViewerHoverManager extends AbstractHoverInformationControlManager implements IWidgetTokenKeeper, IWidgetTokenKeeperExtension {

	public TextViewerHoverManager(TextViewer textViewer,
			IInformationControlCreator fHoverControlCreator) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean requestWidgetToken(IWidgetTokenOwner owner, int priority) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean setFocus(IWidgetTokenOwner owner) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean requestWidgetToken(IWidgetTokenOwner owner) {
		// TODO Auto-generated method stub
		return false;
	}

	public void install(StyledTextArea textWidget) {
		// TODO Auto-generated method stub
		
	}

	public void setSizeConstraints(int textHoverWidthChars,
			int textHoverHeightChars, boolean b, boolean c) {
		// TODO Auto-generated method stub
		
	}

	public void setInformationControlReplacer(
			InformationControlReplacer stickyHoverManager) {
		// TODO Auto-generated method stub
		
	}

}
