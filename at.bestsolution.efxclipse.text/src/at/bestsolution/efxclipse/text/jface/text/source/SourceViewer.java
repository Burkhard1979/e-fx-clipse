package at.bestsolution.efxclipse.text.jface.text.source;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationModel;

import at.bestsolution.efxclipse.text.jface.text.IAutoEditStrategy;
import at.bestsolution.efxclipse.text.jface.text.IInformationControlCreator;
import at.bestsolution.efxclipse.text.jface.text.ITextHover;
import at.bestsolution.efxclipse.text.jface.text.ITextViewerExtension2;
import at.bestsolution.efxclipse.text.jface.text.TextViewer;
import at.bestsolution.efxclipse.text.jface.text.contentassist.IContentAssistant;
import at.bestsolution.efxclipse.text.jface.text.contentassist.IContentAssistantExtension2;
import at.bestsolution.efxclipse.text.jface.text.contentassist.IContentAssistantExtension4;
import at.bestsolution.efxclipse.text.jface.text.formatter.IContentFormatter;
import at.bestsolution.efxclipse.text.jface.text.hyperlink.HyperlinkManager;
import at.bestsolution.efxclipse.text.jface.text.hyperlink.HyperlinkManager.DETECTION_STRATEGY;
import at.bestsolution.efxclipse.text.jface.text.hyperlink.IHyperlinkDetector;
import at.bestsolution.efxclipse.text.jface.text.hyperlink.IHyperlinkDetectorExtension;
import at.bestsolution.efxclipse.text.jface.text.hyperlink.IHyperlinkPresenter;
import at.bestsolution.efxclipse.text.jface.text.information.IInformationPresenter;
import at.bestsolution.efxclipse.text.jface.text.presentation.IPresentationReconciler;
import at.bestsolution.efxclipse.text.jface.text.quickassist.IQuickAssistAssistant;
import at.bestsolution.efxclipse.text.jface.text.reconciler.IReconciler;

public class SourceViewer extends TextViewer implements ISourceViewer/*, ISourceViewerExtension, ISourceViewerExtension2, ISourceViewerExtension3, ISourceViewerExtension4*/ {
	private String fPartitioning;
	private IPresentationReconciler fPresentationReconciler;
	private IReconciler fReconciler;
	private IContentAssistant fContentAssistant;
	private boolean fContentAssistantInstalled;
	private IQuickAssistAssistant fQuickAssistAssistant;
	private boolean fQuickAssistAssistantInstalled;
	private IContentFormatter fContentFormatter;
	private IInformationPresenter fInformationPresenter;
	private IAnnotationHover fOverviewRulerAnnotationHover;
	private IInformationControlCreator fHoverControlCreator;
	private HyperlinkManager fHyperlinkManager;
	private IHyperlinkPresenter fHyperlinkPresenter;
	private IHyperlinkDetector[] fHyperlinkDetectors;
	private int fHyperlinkStateMask;
	private Map<String,List<IAutoEditStrategy>> fAutoIndentStrategies;
	private ContentAssistantFacade fContentAssistantFacade;

	public SourceViewer() {
		
	}
	
	public void configure(SourceViewerConfiguration configuration) {
		if (getTextWidget() == null)
			return;

		setDocumentPartitioning(configuration.getConfiguredDocumentPartitioning(this));

		// install content type independent plug-ins
		fPresentationReconciler= configuration.getPresentationReconciler(this); 
		if (fPresentationReconciler != null)
			fPresentationReconciler.install(this);

		fReconciler= configuration.getReconciler(this);
		if (fReconciler != null)
			fReconciler.install(this);

		fContentAssistant= configuration.getContentAssistant(this);
		if (fContentAssistant != null) {
			fContentAssistant.install(this);
			if (fContentAssistant instanceof IContentAssistantExtension2 && fContentAssistant instanceof IContentAssistantExtension4)
				fContentAssistantFacade= new ContentAssistantFacade(fContentAssistant);
			fContentAssistantInstalled= true;
		}

		fQuickAssistAssistant= configuration.getQuickAssistAssistant(this);
		if (fQuickAssistAssistant != null) {
			fQuickAssistAssistant.install(this);
			fQuickAssistAssistantInstalled= true;
		}

		fContentFormatter= configuration.getContentFormatter(this);

		fInformationPresenter= configuration.getInformationPresenter(this);
		if (fInformationPresenter != null)
			fInformationPresenter.install(this);

		setUndoManager(configuration.getUndoManager(this));

		getTextWidget().setTabs(configuration.getTabWidth(this));

		setAnnotationHover(configuration.getAnnotationHover(this));
		setOverviewRulerAnnotationHover(configuration.getOverviewRulerAnnotationHover(this));

		setHoverControlCreator(configuration.getInformationControlCreator(this));

		setHyperlinkPresenter(configuration.getHyperlinkPresenter(this));
		IHyperlinkDetector[] hyperlinkDetectors= configuration.getHyperlinkDetectors(this);
		int eventStateMask= configuration.getHyperlinkStateMask(this);
		setHyperlinkDetectors(hyperlinkDetectors, eventStateMask);

		// install content type specific plug-ins
		String[] types= configuration.getConfiguredContentTypes(this);
		for (int i= 0; i < types.length; i++) {

			String t= types[i];

			setAutoEditStrategies(configuration.getAutoEditStrategies(this, t), t);
			setTextDoubleClickStrategy(configuration.getDoubleClickStrategy(this, t), t);

			int[] stateMasks= configuration.getConfiguredTextHoverStateMasks(this, t);
			if (stateMasks != null) {
				for (int j= 0; j < stateMasks.length; j++)	{
					int stateMask= stateMasks[j];
					setTextHover(configuration.getTextHover(this, t, stateMask), t, stateMask);
				}
			} else {
				setTextHover(configuration.getTextHover(this, t), t, ITextViewerExtension2.DEFAULT_HOVER_STATE_MASK);
			}

			String[] prefixes= configuration.getIndentPrefixes(this, t);
			if (prefixes != null && prefixes.length > 0)
				setIndentPrefixes(prefixes, t);

			prefixes= configuration.getDefaultPrefixes(this, t);
			if (prefixes != null && prefixes.length > 0)
				setDefaultPrefixes(prefixes, t);
		}

		activatePlugins();
	}
	
	/**
	 * Sets the document partitioning of this viewer. The partitioning is used by this viewer to
	 * access partitioning information of the viewers input document.
	 *
	 * @param partitioning the partitioning name
	 * @since 3.0
	 */
	public void setDocumentPartitioning(String partitioning) {
		fPartitioning= partitioning;
	}
	
	/**
	 * Sets the overview ruler's annotation hover of this source viewer.
	 * The annotation hover provides the information to be displayed in a hover
	 * popup window if requested over the overview rulers area. The annotation
	 * hover is assumed to be line oriented.
	 *
	 * @param annotationHover the hover to be used, <code>null</code> is a valid argument
	 * @since 3.0
	 */
	public void setOverviewRulerAnnotationHover(IAnnotationHover annotationHover) {
		fOverviewRulerAnnotationHover= annotationHover;
	}
	
	/**
	 * Sets the creator for the hover controls.
	 *
	 * @param creator the hover control creator
	 * @since 2.0
	 */
	public void setHoverControlCreator(IInformationControlCreator creator) {
		fHoverControlCreator= creator;
	}
	
	/**
	 * Sets the hyperlink presenter.
	 * <p>
	 * This is only valid as long as the hyperlink manager hasn't
	 * been created yet.
	 * </p>
	 *
	 * @param hyperlinkPresenter the hyperlink presenter
	 * @throws IllegalStateException if the hyperlink manager has already been created
	 * @since 3.1
	 */
	public void setHyperlinkPresenter(IHyperlinkPresenter hyperlinkPresenter) throws IllegalStateException {
		if (fHyperlinkManager != null)
			throw new IllegalStateException();

		fHyperlinkPresenter= hyperlinkPresenter;
		ensureHyperlinkManagerInstalled();
	}
	
	/**
	 * Ensures that the hyperlink manager has been
	 * installed if a hyperlink detector is available.
	 *
	 * @since 3.1
	 */
	private void ensureHyperlinkManagerInstalled() {
		if (fHyperlinkDetectors != null && fHyperlinkDetectors.length > 0 && fHyperlinkPresenter != null && fHyperlinkManager == null) {
			DETECTION_STRATEGY strategy= fHyperlinkPresenter.canShowMultipleHyperlinks() ? HyperlinkManager.ALL : HyperlinkManager.FIRST;
			fHyperlinkManager= new HyperlinkManager(strategy);
			fHyperlinkManager.install(this, fHyperlinkPresenter, fHyperlinkDetectors, fHyperlinkStateMask); 
		}
	}
	
	public void setHyperlinkDetectors(IHyperlinkDetector[] hyperlinkDetectors, int eventStateMask) {
		if (fHyperlinkDetectors != null) {
			for (int i= 0; i < fHyperlinkDetectors.length; i++) {
				if (fHyperlinkDetectors[i] instanceof IHyperlinkDetectorExtension)
					((IHyperlinkDetectorExtension)fHyperlinkDetectors[i]).dispose();
			}
		}

		boolean enable= hyperlinkDetectors != null && hyperlinkDetectors.length > 0;
		fHyperlinkStateMask= eventStateMask;
		fHyperlinkDetectors= hyperlinkDetectors;
		if (enable) {
			if (fHyperlinkManager != null) {
				fHyperlinkManager.setHyperlinkDetectors(fHyperlinkDetectors);
				fHyperlinkManager.setHyperlinkStateMask(fHyperlinkStateMask);
			}
			ensureHyperlinkManagerInstalled();
		} else {
			if (fHyperlinkManager != null)
				fHyperlinkManager.uninstall();
			fHyperlinkManager= null;
		}
	}
	
	/**
	 * Sets the given edit strategy as the only strategy for the given content type.
	 *
	 * @param strategies the auto edit strategies
	 * @param contentType the content type
	 * @since 3.1
	 */
	protected final void setAutoEditStrategies(IAutoEditStrategy[] strategies, String contentType) {
		if (fAutoIndentStrategies == null)
			fAutoIndentStrategies= new HashMap<String,List<IAutoEditStrategy>>();

		List<IAutoEditStrategy> autoEditStrategies= fAutoIndentStrategies.get(contentType);

		if (strategies == null) {
			if (autoEditStrategies == null)
				return;

			fAutoIndentStrategies.put(contentType, null);

		} else {
			if (autoEditStrategies == null) {
				autoEditStrategies= new ArrayList<IAutoEditStrategy>();
				fAutoIndentStrategies.put(contentType, autoEditStrategies);
			}

			autoEditStrategies.clear();
			autoEditStrategies.addAll(Arrays.asList(strategies));
		}
	}
	
	// -----------------------------------------------------------------------------
	// -----------------------------------------------------------------------------
	// -----------------------------------------------------------------------------
	// -----------------------------------------------------------------------------
	// -----------------------------------------------------------------------------
	// -----------------------------------------------------------------------------

	@Override
	public void setAnnotationHover(IAnnotationHover annotationHover) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDocument(IDocument document, IAnnotationModel annotationModel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDocument(IDocument document,
			IAnnotationModel annotationModel, int modelRangeOffset,
			int modelRangeLength) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IAnnotationModel getAnnotationModel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setRangeIndicator(Annotation rangeIndicator) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setRangeIndication(int offset, int length, boolean moveCursor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IRegion getRangeIndication() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeRangeIndication() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showAnnotations(boolean show) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
