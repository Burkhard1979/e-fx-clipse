package at.bestsolution.efxclipse.text.jface.text.hyperlink;

import org.eclipse.core.runtime.Assert;

import at.bestsolution.efxclipse.text.jface.text.ITextViewer;

public class HyperlinkManager {

	/**
	 * Detection strategy.
	 */
	public static final class DETECTION_STRATEGY {

		String fName;

		private DETECTION_STRATEGY(String name) {
			fName= name;
		}

		/*
		 * @see java.lang.Object#toString()
		 */
		public String toString() {
			return fName;
		}
	}
	
	/**
	 * The first detected hyperlink is passed to the
	 * hyperlink presenter and no further detector
	 * is consulted.
	 */
	public static final DETECTION_STRATEGY FIRST= new DETECTION_STRATEGY("first"); //$NON-NLS-1$

	/**
	 * All detected hyperlinks from all detectors are collected
	 * and passed to the hyperlink presenter.
	 * <p>
	 * This strategy is only allowed if {@link IHyperlinkPresenter#canShowMultipleHyperlinks()}
	 * returns <code>true</code>.
	 * </p>
	 */
	public static final DETECTION_STRATEGY ALL= new DETECTION_STRATEGY("all"); //$NON-NLS-1$

	/**
	 * All detected hyperlinks from all detectors are collected
	 * and all those with the longest region are passed to the
	 * hyperlink presenter.
	 * <p>
	 * This strategy is only allowed if {@link IHyperlinkPresenter#canShowMultipleHyperlinks()}
	 * returns <code>true</code>.
	 * </p>
	 */
	public static final DETECTION_STRATEGY LONGEST_REGION_ALL= new DETECTION_STRATEGY("all with same longest region"); //$NON-NLS-1$

	/**
	 * All detected hyperlinks from all detectors are collected
	 * and form all those with the longest region only the first
	 * one is passed to the hyperlink presenter.
	 */
	public static final DETECTION_STRATEGY LONGEST_REGION_FIRST= new DETECTION_STRATEGY("first with longest region"); //$NON-NLS-1$

	private DETECTION_STRATEGY fDetectionStrategy;
 

	public HyperlinkManager(DETECTION_STRATEGY detectionStrategy) {
		Assert.isNotNull(detectionStrategy);
		fDetectionStrategy= detectionStrategy;
	}
	
	public void install(ITextViewer textViewer, IHyperlinkPresenter hyperlinkPresenter, IHyperlinkDetector[] hyperlinkDetectors, int eventStateMask) {
		
	}

	public void setHyperlinkDetectors(IHyperlinkDetector[] fHyperlinkDetectors) {
		// TODO Auto-generated method stub
		
	}

	public void setHyperlinkStateMask(int fHyperlinkStateMask) {
		// TODO Auto-generated method stub
		
	}

	public void uninstall() {
		// TODO Auto-generated method stub
		
	}
}
