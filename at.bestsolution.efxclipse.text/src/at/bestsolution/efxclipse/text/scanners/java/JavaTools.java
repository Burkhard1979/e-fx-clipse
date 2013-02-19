/*******************************************************************************
 * Copyright (c) 2000, 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package at.bestsolution.efxclipse.text.scanners.java;

import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentExtension3;
import org.eclipse.jface.text.IDocumentPartitioner;

import at.bestsolution.efxclipse.text.jface.text.TextAttribute;
import at.bestsolution.efxclipse.text.jface.text.rules.FastPartitioner;
import at.bestsolution.efxclipse.text.jface.text.rules.IPartitionTokenScanner;
import at.bestsolution.efxclipse.text.jface.text.rules.ITokenScanner;
import at.bestsolution.efxclipse.text.scanners.SingleTokenJavaScanner;
import at.bestsolution.efxclipse.text.scanners.TextAttributesManager;

public class JavaTools {
	/**
	 * Array with legal content types.
	 * @since 3.0
	 */
	private final static String[] LEGAL_CONTENT_TYPES= new String[] {
		IJavaPartitions.JAVA_DOC,
		IJavaPartitions.JAVA_MULTI_LINE_COMMENT,
		IJavaPartitions.JAVA_SINGLE_LINE_COMMENT,
		IJavaPartitions.JAVA_STRING,
		IJavaPartitions.JAVA_CHARACTER
	};

	/** The Java source code scanner. */
	private JavaCodeScanner fCodeScanner;
	/** The Java multi-line comment scanner. */
	private JavaCommentScanner fMultilineCommentScanner;
	/** The Java single-line comment scanner. */
	private JavaCommentScanner fSinglelineCommentScanner;
	/** The Java string scanner. */
	private SingleTokenJavaScanner fStringScanner;
	/** The JavaDoc scanner. */
	private JavaScanner fJavaDocScanner;

	public JavaTools() {
		Font regular = new Font("Courier", 15);
		Font boldFont = Font.font("Courier", FontWeight.BOLD, 15);
		
		TextAttributesManager manager = new TextAttributesManager();
		manager.registerToken(ResourceProvider.JAVA_BRACKET, Color.valueOf("rgb(0,0,0)"), null, regular);
		manager.registerToken(ResourceProvider.JAVA_DEFAULT, Color.valueOf("rgb(0,0,0)"), null, regular);
		manager.registerToken(ResourceProvider.JAVA_KEYWORD, Color.valueOf("rgb(153,51,102)"), null, boldFont);
		manager.registerToken(ResourceProvider.JAVA_KEYWORD_RETURN, Color.valueOf("rgb(153,51,102)"), null, boldFont);
		manager.registerToken(ResourceProvider.JAVA_MULTI_LINE_COMMENT, Color.valueOf("rgb(102,153,102)"), null, regular);
		manager.registerToken(ResourceProvider.JAVA_OPERATOR, Color.valueOf("rgb(0,0,0)"), null, regular);
		manager.registerToken(ResourceProvider.JAVA_SINGLE_LINE_COMMENT, Color.valueOf("rgb(102,153,102)"), null, regular);
		manager.registerToken(ResourceProvider.JAVA_STRING, Color.valueOf("rgb(51,0,255)"), null, regular);
		manager.registerToken(ResourceProvider.JAVADOC_DEFAULT, Color.valueOf("rgb(51,102,204)"), null, regular);
		manager.registerToken(ResourceProvider.JAVADOC_TAG, Color.valueOf("rgb(51,102,204)"), null, regular);
		manager.registerToken(ResourceProvider.JAVADOC_KEYWORD, Color.valueOf("rgb(51,102,204)"), null, boldFont);
		manager.registerToken(ResourceProvider.JAVADOC_LINK, Color.valueOf("rgb(51,102,204)"), null, regular);
		manager.registerToken(ResourceProvider.TASK_TAG, Color.valueOf("rgb(255,255,0)"), null, regular);
		
		fCodeScanner= new JavaCodeScanner(manager);
		fMultilineCommentScanner= new JavaCommentScanner(manager,ResourceProvider.JAVA_MULTI_LINE_COMMENT);
		fSinglelineCommentScanner= new JavaCommentScanner(manager,ResourceProvider.JAVA_SINGLE_LINE_COMMENT);
		fStringScanner= new SingleTokenJavaScanner(manager,ResourceProvider.JAVA_STRING);
		fJavaDocScanner= new JavaScanner(manager);
	}
	
	public ITokenScanner getMultilineCommentScanner() {
		return fMultilineCommentScanner;
	}
	
	public ITokenScanner getSinglelineCommentScanner() {
		return fSinglelineCommentScanner;
	}
	
	public ITokenScanner getStringScanner() {
		return fStringScanner;
	}
	
	public ITokenScanner getJavaDocScanner() {
		return fJavaDocScanner;
	}
	
	public ITokenScanner getCodeScanner() {
		return fCodeScanner;
	}
	
	/**
	 * Sets up the Java document partitioner for the given document for the given partitioning.
	 *
	 * @param document the document to be set up
	 * @param partitioning the document partitioning
	 * @since 3.0
	 */
	public void setupJavaDocumentPartitioner(IDocument document, String partitioning) {
		IDocumentPartitioner partitioner= createDocumentPartitioner();
		if (document instanceof IDocumentExtension3) {
			IDocumentExtension3 extension3= (IDocumentExtension3) document;
			extension3.setDocumentPartitioner(partitioning, partitioner);
		} else {
			document.setDocumentPartitioner(partitioner);
		}
		partitioner.connect(document);
	}
	
	/**
	 * Returns a scanner which is configured to scan
	 * Java-specific partitions, which are multi-line comments,
	 * Javadoc comments, and regular Java source code.
	 *
	 * @return a Java partition scanner
	 */
	public IPartitionTokenScanner getPartitionScanner() {
		return new FastJavaPartitionScanner();
	}

	/**
	 * Factory method for creating a Java-specific document partitioner
	 * using this object's partitions scanner. This method is a
	 * convenience method.
	 *
	 * @return a newly created Java document partitioner
	 */
	public IDocumentPartitioner createDocumentPartitioner() {
		return new FastPartitioner(getPartitionScanner(), LEGAL_CONTENT_TYPES);
	}
	
//	/**
//	 * Adapts the behavior of the contained components to the change
//	 * encoded in the given event.
//	 *
//	 * @param event the event to which to adapt
//	 * @since 2.0
//	 */
//	private void adaptToPreferenceChange(PropertyChangeEvent event) {
//		if (fCodeScanner.affectsBehavior(event))
//			fCodeScanner.adaptToPreferenceChange(event);
//		if (fMultilineCommentScanner.affectsBehavior(event))
//			fMultilineCommentScanner.adaptToPreferenceChange(event);
//		if (fSinglelineCommentScanner.affectsBehavior(event))
//			fSinglelineCommentScanner.adaptToPreferenceChange(event);
//		if (fStringScanner.affectsBehavior(event))
//			fStringScanner.adaptToPreferenceChange(event);
//		if (fJavaDocScanner.affectsBehavior(event))
//			fJavaDocScanner.adaptToPreferenceChange(event);
//	}
}
