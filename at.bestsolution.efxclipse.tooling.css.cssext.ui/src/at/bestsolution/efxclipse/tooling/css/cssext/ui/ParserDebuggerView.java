package at.bestsolution.efxclipse.tooling.css.cssext.ui;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.draw2d.Label;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.zest.core.viewers.AbstractZoomableViewer;
import org.eclipse.zest.core.viewers.GraphViewer;
import org.eclipse.zest.core.viewers.IZoomableWorkbenchPart;
import org.eclipse.zest.core.viewers.ZoomContributionViewItem;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.core.widgets.ZestStyles;
import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.AbstractLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.DirectedGraphLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.HorizontalTreeLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.RadialLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.SpringLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.TreeLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.VerticalLayoutAlgorithm;

import at.bestsolution.efxclipse.tooling.css.cssext.parser.CssExtParser;
import at.bestsolution.efxclipse.tooling.css.cssext.parser.CssExtParser.ParseResultListener;
import at.bestsolution.efxclipse.tooling.css.cssext.parser.result.ResultNode;
import at.bestsolution.efxclipse.tooling.css.cssext.parser.result.State;

import com.google.inject.Inject;

public class ParserDebuggerView extends ViewPart {

	public static final String ID = "at.bestsolution.efxclipse.tooling.css.cssext.ui.ParserDebuggerView";
	
	@Inject 
	private CssExtParser parser;
	
	private GraphViewer graph;
	private Set<GraphNode> nodes = new HashSet<>();
	private int layout = 1;

	private final IAction layoutTreeAction = new Action("layout Tree") {
        public void run() { 
            layoutTree();
        }
	};

	private final IAction layoutVerticalAction = new Action("layout Tree2") {
		public void run() {
			layoutVertical();
		}
	};
	
	private final IAction layoutRadialAction = new Action("layout Radial") {
		public void run() {
			layoutRadial();
		}
	};
	
	private GraphNode dbg(ResultNode cur, ResultNode parent, GraphViewer g) {
		String tmp = cur.nodeName + "\n";
		switch (cur.status) {
		case PROPOSE: tmp += "Proposal: " + cur.proposal;
		break;
		case INVALID: tmp += "Message: " + cur.message;
		break;
		default: 
			tmp += "Status: " + cur.status + "\nInput: " + cur.remainingInput;
		}
		String lbl = "("+cur.nodeSymbol+")" + (cur.status == State.PROPOSE?" " + cur.proposal:"");
		
		GraphNode node = new GraphNode(g.getGraphControl(), SWT.NONE, lbl);
		
		node.setTooltip(new Label(tmp));
		
		if (cur.status == State.FORWARD) {
//			node.setText("");
//			node.setNodeStyle(ZestStyles.NODES_HIDE_TEXT);
		}
		Display d = node.getDisplay();
		if (cur.status == State.INVALID) {
			node.setBackgroundColor(d.getSystemColor(SWT.COLOR_RED));
			node.setForegroundColor(d.getSystemColor(SWT.COLOR_WHITE));
		}
		else if (cur.status == State.MATCH) {
			node.setBackgroundColor(node.getDisplay().getSystemColor(SWT.COLOR_GREEN));
		}
		else if (cur.status == State.SKIP) {
			node.setBackgroundColor(node.getDisplay().getSystemColor(SWT.COLOR_YELLOW));
		}
		else if (cur.status == State.PROPOSE) {
			node.setBackgroundColor(d.getSystemColor(SWT.COLOR_DARK_GREEN));
			node.setForegroundColor(d.getSystemColor(SWT.COLOR_WHITE));
		}
		node.setHighlightColor(node.getDisplay().getSystemColor(SWT.COLOR_CYAN));
		
		nodes.add(node);
		
		System.err.println("added node " + lbl);
		for (ResultNode n : cur.next) {
			GraphNode child = dbg(n, cur, g);
			new GraphConnection(g.getGraphControl(), ZestStyles.CONNECTIONS_DIRECTED, node, child);
		}
		
		return node;
	}
	
	private void createToolbar() {
        IToolBarManager mgr = getViewSite().getActionBars().getToolBarManager();
        mgr.add(layoutTreeAction);
        mgr.add(layoutVerticalAction);
        mgr.add(layoutRadialAction);
        mgr.add(new ZoomContributionViewItem(new IZoomableWorkbenchPart() {
			@Override
			public AbstractZoomableViewer getZoomableViewer() {
				return graph;
			}
		}));
	}
	
	private void layoutTree() {
		graph.setLayoutAlgorithm(new TreeLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);
	}
	
	private void layoutVertical() {
		graph.setLayoutAlgorithm(new HorizontalTreeLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);
	}
	
	private void layoutRadial() {
		AbstractLayoutAlgorithm layout = new RadialLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING);
		graph.setLayoutAlgorithm(layout, true);
	}
	
	@Override
	public void createPartControl(final Composite parent) {
		
		parent.setLayout(new FillLayout());
		
	    // Graph will hold all other objects
	    graph = new GraphViewer(parent, SWT.BORDER);

	    
	    parser.addParseResultListener(new ParseResultListener() {
			@Override
			public void parseFinished(ResultNode result) {
				graph.getGraphControl().setRedraw(false);
				Iterator<GraphNode> it = nodes.iterator();
				while (it.hasNext()) {
					it.next().dispose();
					it.remove();
				}
				
				dbg(result, null, graph);
				
				graph.getGraphControl().setRedraw(true);
				
				graph.setLayoutAlgorithm(new HorizontalTreeLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);
			}
		});

	     // Selection listener on graphConnect or GraphNode is not supported
	    // see https://bugs.eclipse.org/bugs/show_bug.cgi?id=236528
//	    graph.addSelectionListener(new SelectionAdapter() {
//	      @Override
//	      public void widgetSelected(SelectionEvent e) {
//	        System.out.println(e);
//	      }
//
//	    });
	    
	    createToolbar();
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
