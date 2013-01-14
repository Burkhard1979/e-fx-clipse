package at.bestsolution.efxclipse.tooling.css.cssext.ui;

import java.util.Iterator;
import java.util.Set;

import java.util.HashSet;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.core.widgets.ZestStyles;
import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.SpringLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.TreeLayoutAlgorithm;

import at.bestsolution.efxclipse.tooling.css.cssext.parser.CssExtParser;
import at.bestsolution.efxclipse.tooling.css.cssext.parser.CssExtParser.ParseResultListener;
import at.bestsolution.efxclipse.tooling.css.cssext.parser.result.ResultNode;
import at.bestsolution.efxclipse.tooling.css.cssext.parser.result.State;

import com.google.inject.Inject;

public class ParserDebuggerView extends ViewPart {

	public static final String ID = "at.bestsolution.efxclipse.tooling.css.cssext.ui.ParserDebuggerView";
	
	@Inject 
	private CssExtParser parser;
	
	private Graph graph;
	private Set<GraphNode> nodes = new HashSet<>();
	private int layout = 1;

	private GraphNode dbg(ResultNode cur, ResultNode parent, Graph g) {
		String tmp = "";
		switch (cur.status) {
		case PROPOSE: tmp += cur.proposal;
		break;
		case INVALID: tmp = cur.message;
		break;
		default: tmp += cur.remainingInput;
		}
		String lbl = "("+cur.nodeSymbol+") "+cur.nodeName + "\n" + cur.status + " " + tmp;
		
		GraphNode node = new GraphNode(g, SWT.NONE, lbl);
		
		if (cur.status == State.INVALID) {
			node.setBackgroundColor(node.getDisplay().getSystemColor(SWT.COLOR_RED));
		}
		else if (cur.status == State.MATCH) {
			node.setBackgroundColor(node.getDisplay().getSystemColor(SWT.COLOR_GREEN));
		}
		else if (cur.status == State.SKIP) {
			node.setBackgroundColor(node.getDisplay().getSystemColor(SWT.COLOR_YELLOW));
		}
		node.setHighlightColor(node.getDisplay().getSystemColor(SWT.COLOR_CYAN));
		
		nodes.add(node);
		
		System.err.println("added node " + lbl);
		for (ResultNode n : cur.next) {
			GraphNode child = dbg(n, cur, g);
			new GraphConnection(g, ZestStyles.CONNECTIONS_DIRECTED, child, node);
		}
		
		return node;
	}
	
	@Override
	public void createPartControl(final Composite parent) {
		
		parent.setLayout(new FillLayout());
		
	    // Graph will hold all other objects
	    graph = new Graph(parent, SWT.BORDER);
	    
	    parser.addParseResultListener(new ParseResultListener() {
			@Override
			public void parseFinished(ResultNode result) {
				graph.setRedraw(false);
				Iterator<GraphNode> it = nodes.iterator();
				while (it.hasNext()) {
					it.next().dispose();
					it.remove();
				}
				
				dbg(result, null, graph);
				
				graph.setRedraw(true);
				
				graph.setLayoutAlgorithm(new TreeLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);
			}
		});

	     // Selection listener on graphConnect or GraphNode is not supported
	    // see https://bugs.eclipse.org/bugs/show_bug.cgi?id=236528
	    graph.addSelectionListener(new SelectionAdapter() {
	      @Override
	      public void widgetSelected(SelectionEvent e) {
	        System.out.println(e);
	      }

	    });
	}
	
	public void setLayoutManager() {
	    switch (layout) {
	    case 1:
	      graph.setLayoutAlgorithm(new TreeLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);
	      layout++;
	      break;
	    case 2:
	      graph.setLayoutAlgorithm(new SpringLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);
	      layout = 1;
	      break;

	    }

	  }

	@Override
	public void setFocus() {
	}

}
