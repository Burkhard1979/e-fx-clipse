package at.bestsolution.efxclipse.tooling.css.cssext.parser;

import at.bestsolution.efxclipse.tooling.css.cssDsl.CssTok;
import at.bestsolution.efxclipse.tooling.css.util.TokUtil;

public class ParsePathTerminal extends ParsePathSegment {
	
	private final ParseStatus parseStatus;
	public final CssTok inputToken;
	public final String message;
	
	public ParsePathTerminal(ParseStatus parseStatus, CssTok inTok, String message) {
		this.parseStatus = parseStatus;
		this.inputToken = inTok;
		this.message = message;
	}
	
	public ParsePathTerminal(ParseStatus parseStatus, CssTok inTok) {
		this(parseStatus, inTok, null);
	}

	final ParseStatus getStatus() {
		return parseStatus;
	}
	
	@Override
	public String toString() {
		return getStatus().toString() + " " + TokUtil.toString(inputToken) + (message==null?"":" -> " + message);
	}
	
	@Override
	public void skip() {
	}
	
}
