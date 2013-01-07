package at.bestsolution.efxclipse.tooling.css.cssext.parser.result;

import java.util.ArrayList;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Proposal;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRule;
import at.bestsolution.efxclipse.tooling.css.cssext.parser.ParserInputCursor;

public class ResultNode<R extends CSSRule> {

	public ParserInputCursor remainingInput;
	public State status;
	
	public boolean mayConsumeWS;
	public R rule;
	
	public List<ResultNode> next = new ArrayList<>();
	
	public String nodeName;
	public String nodeSymbol;
	
	public Proposal proposal;
	public String message;
	public boolean partial = false;
	
	@Override
	public String toString() {
		return status+"|"+remainingInput+"|"+proposal + "|" + partial + " (" + message +")";
	}
}
