package at.bestsolution.efxclipse.tooling.css.cssext.parser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.cssDsl.CssTok;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRule;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.Definition;

public class ParsePath {

	private String ruleName;
	
	private ParsePath parent;
	
	private List<ParsePath> children;
	
	private List<ParsePathSegment> segments;
	
	public ParsePath() {
		children = new ArrayList<ParsePath>();
		segments = new ArrayList<ParsePathSegment>();
	}
	
	
	public List<ParsePathSegment> getFullPath() {
		List<ParsePathSegment> fullPath = new ArrayList<ParsePathSegment>();
		
		List<ParsePath> parents = new ArrayList<ParsePath>();
		ParsePath parentPath = parent;
		while (parentPath != null) {
			parents.add(parentPath);
			parentPath = parentPath.parent;
		}
		
		Collections.reverse(parents);
		for (ParsePath p : parents) {
			fullPath.addAll(p.segments);
		}
		fullPath.addAll(segments);
		
		return fullPath;
	}


	public ParsePath newSubPath(CSSRule rule) {
		if (rule instanceof Definition) {
			Definition def = (Definition) rule;
			ruleName = def.getName();
		}
		else if (rule.eContainer() instanceof Definition) {
			Definition def = (Definition) rule.eContainer();
			ruleName = def.getName();
		}
		ParsePath p = new ParsePath();
		p.parent = this;
		
		ParsePathSegment s = null;
		if (!segments.isEmpty()) {
			ParsePathSegment lastSegment = segments.get(segments.size()-1);
			if (lastSegment.subPath != null) {
				s = lastSegment;
			}
		}
		
		if (s == null) {
			s = new ParsePathSegment();
			segments.add(s);
			s.subPath = new ArrayList<ParsePath>();
		}
		
		s.subPath.add(p);
		
		children.add(p);
		return p;
	}
	
	@Override
	public String toString() {
		StringBuilder b = new StringBuilder();
		b.append("ParsePath("+ruleName+"):");
		
		List<ParsePath> subPaths = new ArrayList<ParsePath>();
		
		for (ParsePathSegment s : segments) {
			 b.append(s); b.append(" | ");
			 if (s.subPath != null) {
				 subPaths.addAll(s.subPath);
			 }
		}
		
		for (ParsePath s : subPaths) {
			b.append("\n");
			String space = "";
			ParsePath p = s.parent;
			while (p != null) {
				space += " ";
				p = p.parent;
			}
			b.append(space);
			b.append(s.toString());
		}
		
		return b.toString();
	}


	public void newSegment(ParseStatus status, CssTok cur) {
		ParsePathSegment s = new ParsePathSegment();
		s.inputToken = cur;
		s.parseStatus = status;
		segments.add(s);
	}
	
	public void newSegment(ParseStatus status, CssTok cur, String message) {
		ParsePathSegment s = new ParsePathSegment();
		s.inputToken = cur;
		s.parseStatus = status;
		s.message = message;
		segments.add(s);
	}
	
	
	public ParseStatus getOverallStatus() {
		ParseStatus result = null;
		if (!segments.isEmpty()) {
			ParsePathSegment lastSegment = segments.get(segments.size()-1);
			if (lastSegment.subPath != null) {
				boolean match = false;
				for (ParsePath s : lastSegment.subPath) {
					if (s.getOverallStatus() == ParseStatus.MATCH) {
						match = true;
					}
				}
				// TODO invalid is here not the best choice
				result = match?ParseStatus.MATCH:ParseStatus.INVALID;
			}
			else {
				result = lastSegment.parseStatus;
			}
		}
		return result;
	}
}
