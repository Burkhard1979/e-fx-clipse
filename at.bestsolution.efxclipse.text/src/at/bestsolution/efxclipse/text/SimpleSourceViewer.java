package at.bestsolution.efxclipse.text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.jface.text.ITypedRegion;

import at.bestsolution.efxclipse.styledtext.StyleRange;
import at.bestsolution.efxclipse.styledtext.StyledTextArea;
import at.bestsolution.efxclipse.styledtext.StyledTextContent.TextChangeListener;
import at.bestsolution.efxclipse.styledtext.TextChangedEvent;
import at.bestsolution.efxclipse.styledtext.TextChangingEvent;
import at.bestsolution.efxclipse.text.jface.text.DefaultDocumentAdapter;
import at.bestsolution.efxclipse.text.jface.text.TextAttribute;
import at.bestsolution.efxclipse.text.jface.text.rules.IToken;
import at.bestsolution.efxclipse.text.jface.text.rules.ITokenScanner;

public class SimpleSourceViewer {
	private final Map<String, ITokenScanner> tokenScanners;
	private final IDocumentPartitioner partitioner;
	private final StyledTextArea control;
	private IDocument document;
	
	public SimpleSourceViewer(StyledTextArea control, IDocumentPartitioner partitioner, Map<String, ITokenScanner> tokenScanners) {
		this.tokenScanners = new HashMap<>(tokenScanners);
		this.partitioner = partitioner;
		this.control = control;
	}
	
	private void update() {
		ITypedRegion[] regions = partitioner.computePartitioning(0, document.getLength());
		
		List<StyleRange> styleRanges = new ArrayList<>();
		
		for( ITypedRegion r : regions ) {
			ITokenScanner scanner = tokenScanners.get(r.getType());
//			System.err.println("REGION: " + System.identityHashCode(r) + " => " + r.getOffset() + "/" + r.getLength());
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
//							try {
//								System.err.println("TOKEN: " + lastStart + "/" + length + " => " + document.get(lastStart, length));
//							} catch (BadLocationException e) {
//								// TODO Auto-generated catch block
//								e.printStackTrace();
//							}
							styleRanges.add(createStyleRange(lastStart, length, lastAttribute));
						}
							
						firstToken= false;
						lastAttribute= attribute;
						lastStart= scanner.getTokenOffset();
						length= scanner.getTokenLength();
					}
				}
				
//				try {
//					System.err.println("TOKEN: " + lastStart + "/" + length + " => " + document.get(lastStart, length));
//				} catch (BadLocationException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				
				styleRanges.add(createStyleRange(lastStart, length, lastAttribute));
			}
		}
		
		control.setStyleRanges(styleRanges.toArray(new StyleRange[0]));
	}
	
	public void setDocument(IDocument document) {
		this.document = document;
		DefaultDocumentAdapter adapter = new DefaultDocumentAdapter();
		adapter.addTextChangeListener(new TextChangeListener() {
			
			@Override
			public void textChanged(TextChangedEvent event) {
				update();
			}

			@Override
			public void textSet(TextChangedEvent event) {
				update();
			}

			@Override
			public void textChanging(TextChangingEvent event) {
				// TODO Auto-generated method stub
				
			}
		});
		
		adapter.setDocument(document);
		control.setContent(adapter);
		partitioner.connect(document);
		document.setDocumentPartitioner(partitioner);
		update();
	}
	
	private StyleRange createStyleRange(int start, int length, TextAttribute attribute) {
		StyleRange r = new StyleRange(start, length, attribute.getForeground(), attribute.getBackground());
		r.font = attribute.getFont();
		return r;
	}

	private TextAttribute getTokenTextAttribute(IToken token) {
		return (TextAttribute) token.getData();
	}
}
