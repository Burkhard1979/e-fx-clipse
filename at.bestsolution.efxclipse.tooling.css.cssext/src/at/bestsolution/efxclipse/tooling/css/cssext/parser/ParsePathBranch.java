package at.bestsolution.efxclipse.tooling.css.cssext.parser;

import java.util.ArrayList;
import java.util.List;

public class ParsePathBranch extends ParsePathSegment {

	List<ParsePath> branches;
	
	private ParseStatus parseStatus = null;
	
	public ParsePathBranch() {
		branches = new ArrayList<>();
	}
	
	@Override
	ParseStatus getStatus() {
		if (parseStatus == null) {
			ParseStatus result = ParseStatus.INVALID;
			for (ParsePath p : branches) {
				if (p.getOverallStatus()==ParseStatus.MATCH) {
					result = ParseStatus.MATCH;
					break;
				}
			}
			return result;
		}
		else {
			return parseStatus;
		}
	}
	
	@Override
	public String toString() {
		return super.toString()  + "(of "+branches.size()+")";
	}
	
	@Override
	public void skip() {
		this.parseStatus = ParseStatus.SKIP;
	}
}
