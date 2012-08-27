package at.bestsolution.efxclipse.tooling.css.cssext.ui.highlighting;

import java.util.Iterator;

import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.BidiTreeIterator;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.impl.HiddenLeafNode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleDefinition;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleId;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleRef;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.Doku;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.ElementDefinition;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PropertyDefinition;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PseudoClassDefinition;

public class CssExtSemanticHighlightingCalculator implements
		ISemanticHighlightingCalculator {

	@Override
	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {
		if( resource == null || resource.getParseResult() == null) {
			return;
		}
		
		INode root = resource.getParseResult().getRootNode();
		BidiTreeIterator<INode> it = root.getAsTreeIterable().iterator();
		while( it.hasNext() ) {
			INode node = it.next();
		
			
			if (node.getSemanticElement() instanceof CSSRuleRef) {
				acceptor.addPosition(node.getOffset(), node.getLength(), CssExtHighlightingConfiguration.REFERENCES_ID);
			}
			
			else if (node.getSemanticElement() instanceof Doku) {
				acceptor.addPosition(node.getOffset(), node.getLength(), CssExtHighlightingConfiguration.CSSDOC_ID);
			}
			
			else if (node.getSemanticElement() instanceof ElementDefinition) {
				ElementDefinition el = (ElementDefinition) node.getSemanticElement();
				BidiTreeIterator<INode> innerIt = node.getAsTreeIterable().iterator();
				while(innerIt.hasNext()) {
					INode n = innerIt.next();
					if (n.getText().equals(el.getName())) {
						acceptor.addPosition(n.getOffset(), n.getLength(), CssExtHighlightingConfiguration.ELEMENT_ID);
						break;
					}
				}
			}
			
			else if (node.getSemanticElement() instanceof PseudoClassDefinition) {
				acceptor.addPosition(node.getOffset(), node.getLength(), CssExtHighlightingConfiguration.ELEMENT_ID);
			}
			
			else if (node.getSemanticElement() instanceof PropertyDefinition) {
				PropertyDefinition el = (PropertyDefinition) node.getSemanticElement();
				BidiTreeIterator<INode> innerIt = node.getAsTreeIterable().iterator();
				while(innerIt.hasNext()) {
					INode n = innerIt.next();
					if (n.getText().equals(el.getName())) {
						acceptor.addPosition(n.getOffset(), n.getLength(), CssExtHighlightingConfiguration.PROPERTY_ID);
						break;
					}
				}
			}
			
			else if (node.getSemanticElement() instanceof CSSRuleId) {
				acceptor.addPosition(node.getOffset(), node.getLength(), CssExtHighlightingConfiguration.RULE_ID);
//				CSSRuleDefinition el = (CSSRuleDefinition) node.getSemanticElement();
//				BidiTreeIterator<INode> innerIt = node.getAsTreeIterable().iterator();
//				while(innerIt.hasNext()) {
//					INode n = innerIt.next();
//					if (n.getText().equals(el.getName())) {
//						acceptor.addPosition(n.getOffset(), n.getLength(), CssExtHighlightingConfiguration.RULE_ID);
//						break;
//					}
//				}
			}
			
			else if (node instanceof HiddenLeafNode  && node.getGrammarElement() instanceof TerminalRule) {
				if(((TerminalRule)node.getGrammarElement()).getName().equalsIgnoreCase("ID")) {
					
					acceptor.addPosition(node.getOffset(), node.getLength(), CssExtHighlightingConfiguration.ELEMENT_ID);
					
				}
				
			}
		}
	}

}
