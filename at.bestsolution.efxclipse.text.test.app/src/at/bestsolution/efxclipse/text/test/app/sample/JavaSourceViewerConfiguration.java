package at.bestsolution.efxclipse.text.test.app.sample;

import org.eclipse.jface.text.IDocument;

import at.bestsolution.efxclipse.text.jface.contentassist.ContentAssistant;
import at.bestsolution.efxclipse.text.jface.contentassist.IContentAssistProcessor;
import at.bestsolution.efxclipse.text.jface.contentassist.IContentAssistant;
import at.bestsolution.efxclipse.text.jface.presentation.IPresentationReconciler;
import at.bestsolution.efxclipse.text.jface.presentation.PresentationReconciler;
import at.bestsolution.efxclipse.text.jface.rules.DefaultDamagerRepairer;
import at.bestsolution.efxclipse.text.jface.source.ISourceViewer;
import at.bestsolution.efxclipse.text.jface.source.SourceViewerConfiguration;
import at.bestsolution.efxclipse.text.test.app.sample.jscanners.IJavaPartitions;
import at.bestsolution.efxclipse.text.test.app.sample.jscanners.JavaTextTools;
import at.bestsolution.efxclipse.text.test.app.sample.reconciler.JavaPresentationReconciler;

public class JavaSourceViewerConfiguration extends SourceViewerConfiguration {
	private JavaTextTools textTools;

	public JavaSourceViewerConfiguration(JavaTextTools textTools) {
		this.textTools = textTools;
	}
	
	public String[] getConfiguredContentTypes(ISourceViewer sourceViewer) {
		return new String[] {
				IDocument.DEFAULT_CONTENT_TYPE, 
				IJavaPartitions.JAVA_DOC,
				IJavaPartitions.JAVA_MULTI_LINE_COMMENT,
				IJavaPartitions.JAVA_SINGLE_LINE_COMMENT,
				IJavaPartitions.JAVA_STRING,
				IJavaPartitions.JAVA_CHARACTER
		};
	}
	
	@Override
	public String getConfiguredDocumentPartitioning(ISourceViewer sourceViewer) {
		return IJavaPartitions.JAVA_PARTITIONING;
	}
	
	@Override
	public IPresentationReconciler getPresentationReconciler(ISourceViewer sourceViewer) {
		PresentationReconciler reconciler= new JavaPresentationReconciler();
		reconciler.setDocumentPartitioning(getConfiguredDocumentPartitioning(sourceViewer));
		
		DefaultDamagerRepairer dr= new DefaultDamagerRepairer(textTools.getCodeScanner());
		reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
		reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);

		dr= new DefaultDamagerRepairer(textTools.getJavaDocScanner());
		reconciler.setDamager(dr, IJavaPartitions.JAVA_DOC);
		reconciler.setRepairer(dr, IJavaPartitions.JAVA_DOC);

		dr= new DefaultDamagerRepairer(textTools.getMultilineCommentScanner());
		reconciler.setDamager(dr, IJavaPartitions.JAVA_MULTI_LINE_COMMENT);
		reconciler.setRepairer(dr, IJavaPartitions.JAVA_MULTI_LINE_COMMENT);

		dr= new DefaultDamagerRepairer(textTools.getSinglelineCommentScanner());
		reconciler.setDamager(dr, IJavaPartitions.JAVA_SINGLE_LINE_COMMENT);
		reconciler.setRepairer(dr, IJavaPartitions.JAVA_SINGLE_LINE_COMMENT);

		dr= new DefaultDamagerRepairer(textTools.getStringScanner());
		reconciler.setDamager(dr, IJavaPartitions.JAVA_STRING);
		reconciler.setRepairer(dr, IJavaPartitions.JAVA_STRING);

		dr= new DefaultDamagerRepairer(textTools.getStringScanner());
		reconciler.setDamager(dr, IJavaPartitions.JAVA_CHARACTER);
		reconciler.setRepairer(dr, IJavaPartitions.JAVA_CHARACTER);


		return reconciler;
	}
	
	@Override
	public IContentAssistant getContentAssistant(ISourceViewer sourceViewer) {
		ContentAssistant assist = new ContentAssistant();
		IContentAssistProcessor javaProcessor = new JavaCompletionProcessor();
		assist.setContentAssistProcessor(javaProcessor, IDocument.DEFAULT_CONTENT_TYPE);
		return assist;
	}
}