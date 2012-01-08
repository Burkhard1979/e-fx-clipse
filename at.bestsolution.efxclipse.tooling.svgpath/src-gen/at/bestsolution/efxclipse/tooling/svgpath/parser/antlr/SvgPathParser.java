/*
* generated by Xtext
*/
package at.bestsolution.efxclipse.tooling.svgpath.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import at.bestsolution.efxclipse.tooling.svgpath.services.SvgPathGrammarAccess;

public class SvgPathParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private SvgPathGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WSP");
	}
	
	@Override
	protected at.bestsolution.efxclipse.tooling.svgpath.parser.antlr.internal.InternalSvgPathParser createParser(XtextTokenStream stream) {
		return new at.bestsolution.efxclipse.tooling.svgpath.parser.antlr.internal.InternalSvgPathParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "svg_path";
	}
	
	public SvgPathGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SvgPathGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
