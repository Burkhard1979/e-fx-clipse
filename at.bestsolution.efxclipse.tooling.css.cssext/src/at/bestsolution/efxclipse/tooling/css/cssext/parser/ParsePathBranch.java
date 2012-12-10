package at.bestsolution.efxclipse.tooling.css.cssext.parser;

import java.util.ArrayList;
import java.util.List;

public class ParsePathBranch extends ParsePathSegment {

	List<ParsePath> branches;
	
	public ParsePathBranch() {
		branches = new ArrayList<>();
	}
	
	@Override
	ParseStatus getStatus() {
		ParseStatus result = ParseStatus.INVALID;
		for (ParsePath p : branches) {
			if (p.getOverallStatus()==ParseStatus.MATCH) {
				result = ParseStatus.MATCH;
				break;
			}
		}
		return result;
	}
	
	@Override
	public String toString() {
		return super.toString()  + "(of "+branches.size()+")";
	}
}
