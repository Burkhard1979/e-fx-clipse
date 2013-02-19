package at.bestsolution.efxclipse.text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javafx.scene.layout.StackPane;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.jface.text.ITypedRegion;

import at.bestsolution.efxclipse.styledtext.exp1.StyleRange;
import at.bestsolution.efxclipse.styledtext.exp1.StyledTextControl;
import at.bestsolution.efxclipse.text.jface.text.TextAttribute;
import at.bestsolution.efxclipse.text.jface.text.rules.IToken;
import at.bestsolution.efxclipse.text.jface.text.rules.ITokenScanner;

public class SourceViewer {
	private Map<String, ITokenScanner> tokenScanners;
	private IDocumentPartitioner partitioner;
	private StyledTextControl control;
	
	public SourceViewer(StackPane pane, IDocumentPartitioner partitioner, Map<String, ITokenScanner> tokenScanners) {
		this.tokenScanners = new HashMap<>(tokenScanners);
		this.partitioner = partitioner;
		
		control = new StyledTextControl();
//		ScrollPane p = new ScrollPane(control);
//		pane.getChildren().add(p);
		pane.getChildren().add(control);
	}
	
	public void setDocument(IDocument document) {
		long start = System.currentTimeMillis();
		control.setText(document.get());
		partitioner.connect(document);
		ITypedRegion[] regions = partitioner.computePartitioning(0, document.getLength());
		
		List<StyleRange> styleRanges = new ArrayList<>();
		
		for( ITypedRegion r : regions ) {
			ITokenScanner scanner = tokenScanners.get(r.getType());
			if( scanner != null ) {
				
				int lastStart= r.getOffset();
				int length= 0;
				boolean firstToken= true;
				TextAttribute lastAttribute = null;
				
				scanner.setRange(document, r.getOffset(), r.getLength());
				
				while( true ) {
					IToken token= scanner.nextToken();
					if (token.isEOF())
						break;
					
					
					TextAttribute attribute = getTokenTextAttribute(token);
					if (lastAttribute != null && lastAttribute.equals(attribute)) {
						length += scanner.getTokenLength();
						firstToken= false;
					} else {
						if (!firstToken) {
							styleRanges.add(createStyleRange(lastStart, length, lastAttribute));
						}
							
						firstToken= false;
						lastAttribute= attribute;
						lastStart= scanner.getTokenOffset();
						length= scanner.getTokenLength();
					}
				}
				
				styleRanges.add(createStyleRange(lastStart, length, lastAttribute));
			}
		}
		
		long l2 = System.currentTimeMillis();
		System.err.println("Parsing took: " + (l2-start));
		control.setStyleRanges(styleRanges.toArray(new StyleRange[0]));
		
	}
	
	private StyleRange createStyleRange(int start, int length, TextAttribute attribute) {
		return new StyleRange(start, length, attribute.fgColor, attribute.bgColor);
	}

	private TextAttribute getTokenTextAttribute(IToken token) {
		return (TextAttribute) token.getData();
	}
}
