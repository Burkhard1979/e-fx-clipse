package at.bestsolution.efxclipse.tooling.css.cssext.parser;

import java.util.List;
import java.util.Set;

import at.bestsolution.efxclipse.tooling.css.cssDsl.CssTok;

public class ParsePathSegment {

	CssTok inputToken;
	ParseStatus parseStatus;
	
	List<ParsePath> subPath;
	String message;
	
	@Override
	public String toString() {
		if (subPath != null) {
			String nfo = "";
			for (ParsePath s : subPath) {
				nfo += s.getOverallStatus() + " ";
			}
			return "( " + nfo + ")";
		}
		else {
			return parseStatus + " " + inputToken + " '" + message + "'";
		}
	}
}
