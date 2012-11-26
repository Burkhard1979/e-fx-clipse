package at.bestsolution.efxclipse.tooling.css.cssext.parser;

import at.bestsolution.efxclipse.tooling.css.cssDsl.CssTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.IdentifierTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.WSTok;

public class ParserInputCursor {

	private final ParserInput input;
	
	private int position;
	
	/*package*/ ParserInputCursor(ParserInput input) {
		this(input, 0);
	}
	
	/*package*/ ParserInputCursor(ParserInput input, int position) {
		this.input = input;
		this.position = position;
	}
	
	public boolean isConsumed() {
		return position >= input.input.size()-1;
	}
	
	public CssTok pollNextToken() {
		if (position >= input.input.size()) {
			return null;
		}
		return input.input.get(position++);
	}
	
	public CssTok peekNextToken() {
		if (position+1 >= input.input.size()) {
			return null;
		}
		return input.input.get(position+1);
	}
	
	public ParserInputCursor copy() {
		return new ParserInputCursor(input, position);
	}
	
	@Override
	public String toString() {
		if (isConsumed()) {
			return "EMPTY";
		}
		
		StringBuffer out = new StringBuffer();
		
		for (int x = position; x < input.input.size(); x++) {
			CssTok tok = input.input.get(x);
			
			if (tok instanceof WSTok) {
				out.append("WS");
			}
			else if (tok instanceof IdentifierTok) {
				out.append("'");
				out.append(((IdentifierTok) tok).getName());
				out.append("'");
			}
			else {
				out.append(tok.getClass().getSimpleName());
			}
			
			if (x < input.input.size()-1) {
				out.append(" / ");
			}
			
		}
		return out.toString();
	}

	public int getPosition() {
		return position;
	}
}
