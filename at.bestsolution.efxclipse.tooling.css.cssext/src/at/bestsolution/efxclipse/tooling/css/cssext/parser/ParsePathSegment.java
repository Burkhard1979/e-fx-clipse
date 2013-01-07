package at.bestsolution.efxclipse.tooling.css.cssext.parser;


public abstract class ParsePathSegment {

	abstract ParseStatus getStatus();
	
	@Override
	public String toString() {
		return getStatus().toString();
	}
	
	public abstract void skip();
}
