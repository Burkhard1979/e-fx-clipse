package at.bestsolution.efxclipse.tooling.css.cssext.parser;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.cssDsl.CssTok;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRule;

public class ParsePath {

	private List<ParsePathSegment> segments;
	
	private String ruleName;
	
//	private ParsePath parent;
	
	
	public ParsePath() {
		segments = new ArrayList<ParsePathSegment>();
	}
	
	
	private ParsePathSegment getLastSegment() {
		if (segments.size() > 0) {
			return segments.get(segments.size()-1);
		}
		return null;
	}
	
	public List<ParsePathSegment> getFullPath() {
		return null;
//		List<ParsePathSegment> fullPath = new ArrayList<ParsePathSegment>();
//		
//		List<ParsePath> parents = new ArrayList<ParsePath>();
//		ParsePath parentPath = parent;
//		while (parentPath != null) {
//			parents.add(parentPath);
//			parentPath = parentPath.parent;
//		}
//		
//		Collections.reverse(parents);
//		for (ParsePath p : parents) {
//			fullPath.addAll(p.segments);
//		}
//		fullPath.addAll(segments);
//		
//		return fullPath;
	}

	public List<ParsePathTerminal> getMessage(ParsePath p) {
		List<ParsePathTerminal> msg = new ArrayList<>();
		Iterator<ParsePathSegment> it = p.segments.iterator();
		while (it.hasNext()) {
			ParsePathSegment s = it.next();
			if (s.getStatus() == ParseStatus.INVALID) {
				
				if (s instanceof ParsePathTerminal) {
					msg.add((ParsePathTerminal) s);
				}
				else {
					ParsePathBranch b = (ParsePathBranch) s;
					Iterator<ParsePath> bIt = b.branches.iterator();
					while (bIt.hasNext()) {
						msg.addAll(getMessage(bIt.next()));
					}
				}
			}
		}
		return msg;
	}

	public ParsePath newSubPath(CSSRule rule) {
		ParsePathSegment last = getLastSegment();
		if (last == null || !(last instanceof ParsePathBranch)) {
			last = new ParsePathBranch();
			segments.add(last);
		}
		
		ParsePath newPath = new ParsePath();
		((ParsePathBranch)last).branches.add(newPath);
		
		return newPath;
	}
	
//	private ParsePath createParsePathSegment(CSSRule rule) {
//		String ruleName = "?";
//		if (rule instanceof Definition) {
//			Definition def = (Definition) rule;
//			ruleName = def.getName();
//		}
//		else if (rule.eContainer() instanceof Definition) {
//			Definition def = (Definition) rule.eContainer();
//			ruleName = def.getName();
//		}
//		ParsePath newPath = new ParsePath();
//		
//		newPath.parent = this;
//		newPath.ruleName = ruleName;
//		segments.add(newPath);
//		
//		return newPath;
//	}
	
	@Override
	public String toString() {
		StringBuilder b = new StringBuilder();
		b.append("ParsePath("+segments.size()+"):");
		
		List<ParsePath> subPaths = new ArrayList<ParsePath>();
		
		Iterator<ParsePathSegment> iterator = segments.iterator();
		while (iterator.hasNext()) {
			ParsePathSegment s = iterator.next();
			b.append(s);
			if (iterator.hasNext()) {
				b.append(" / ");
			}
			if (s instanceof ParsePathBranch) {
				subPaths.addAll(((ParsePathBranch) s).branches);
			}
		}
		
		for (ParsePath s : subPaths) {
			b.append("\n");
			String space = "";
			b.append(space);
			b.append(s.toString());
		}
		
		return b.toString();
	}


	public void newSegment(ParseStatus status, CssTok cur) {
		ParsePathTerminal s = new ParsePathTerminal(status, cur);
		segments.add(s);
	}
	
	public void newSegment(ParseStatus status, CssTok cur, String message) {
		ParsePathTerminal s = new ParsePathTerminal(status, cur, message);
		segments.add(s);
	}
	
	public ParseStatus getOverallStatus() {
		ParseStatus result = ParseStatus.MATCH;
		
		for (ParsePathSegment s : segments) {
			if (s.getStatus() == ParseStatus.MATCH) {
				continue;
			}
			else {
				result = ParseStatus.INVALID;
				break;
			}
		}
		
		return result;
		
	}
}
