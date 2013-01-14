package at.bestsolution.efxclipse.tooling.css.cssext.parser.result;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Proposal;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRule;
import at.bestsolution.efxclipse.tooling.css.cssext.parser.ParserInputCursor;

public class ResultNode {

	public ParserInputCursor remainingInput;
	public State status;
	
	
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
	
	public List<ResultNode> findLast() {
		List<ResultNode> last = new ArrayList<>();
		Queue<ResultNode> toCheck = new LinkedList<>();
		toCheck.add(this);
		while (!toCheck.isEmpty()) {
			ResultNode check = toCheck.poll();
			if (check.next.isEmpty()) {
				last.add(check);
			}
			else {
				toCheck.addAll(check.next);
			}
		}
		
//		System.err.println("findLast returns : " + last);
		return last;
	}
	
	public boolean isValid() {
		return status != State.INVALID && status != State.PROPOSE;
	}
	
	public static ResultNode createSkipNode(ResultNode src) {
		ResultNode r = new ResultNode();
		r.status = State.SKIP;
		r.remainingInput = src.remainingInput.copy();
		r.nodeSymbol = src.nodeSymbol + "s";
		return r;
	}
	
	private static void dbg(ResultNode cur, int depth, StringBuffer s) {
		final String last = "-->";
		boolean lastMode = false;
		if (cur.next.isEmpty()) {
			lastMode = true;
		}
		for (int i = 0; i < depth; i++) {
			if (lastMode) {
				if (i < last.length()) {
					s.append(last.charAt(i));
				}
				else {
					s.append(" ");
				}
			}
			else {
				s.append(" ");
			}
		}
		s.append("(");
		s.append(cur.nodeSymbol);
		s.append(") ");
		s.append(cur.nodeName);
		s.append(" ");
		s.append(cur.status);
		s.append(" ");
		switch (cur.status) {
		case PROPOSE: s.append(cur.proposal);
		break;
		case INVALID: s.append(cur.message);
		break;
		default: s.append(cur.remainingInput);
		}
		s.append("\n");
		for (ResultNode n : cur.next) {
			dbg(n, depth+1, s);
		}
	}
	
	public static void dbg(ResultNode node) {
		StringBuffer buf = new StringBuffer();
		dbg(node, 0, buf);
		System.err.println(buf.toString());
	}
}
