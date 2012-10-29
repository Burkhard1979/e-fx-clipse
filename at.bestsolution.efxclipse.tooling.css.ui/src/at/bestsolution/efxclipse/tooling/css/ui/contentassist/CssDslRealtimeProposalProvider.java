/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.efxclipse.tooling.css.ui.contentassist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.templates.TemplateProposal;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.StyledString.Styler;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.TextStyle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.common.types.xtext.ui.JdtHoverProvider.JavadocHoverWrapper;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal.IReplacementTextApplier;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.ui.editor.contentassist.ITemplateProposalProvider;
import org.eclipse.xtext.ui.editor.contentassist.ReplacementTextApplier;
import org.eclipse.xtext.ui.editor.hover.AbstractEObjectHover;
import org.eclipse.xtext.ui.editor.hover.IEObjectHover;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.DialogProposal;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Proposal;
import at.bestsolution.efxclipse.tooling.css.CssExtendedDialectExtension.CssProperty;
import at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslFactory;
import at.bestsolution.efxclipse.tooling.css.cssDsl.CssTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.css_declaration;
import at.bestsolution.efxclipse.tooling.css.cssDsl.ruleset;
import at.bestsolution.efxclipse.tooling.css.ui.internal.CssDialectExtensionComponent;
import at.bestsolution.efxclipse.tooling.css.ui.internal.CssDslActivator;

import com.google.inject.Inject;
/**
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on how to customize content assistant
 */
public class CssDslRealtimeProposalProvider extends AbstractCssDslProposalProvider {
	private CssDialectExtensionComponent extension;
	
	private @Inject ILabelProvider labelProvider;
	
	private @Inject ITemplateProposalProvider templateProposalProvider;
	
	public CssDslRealtimeProposalProvider() {
		BundleContext context = CssDslActivator.getInstance().getBundle().getBundleContext();
		ServiceReference<CssDialectExtensionComponent> ref = context.getServiceReference(CssDialectExtensionComponent.class);
		extension = context.getService(ref);
	}
	
	public void complete_ColorTok(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
//		ConfigurableCompletionProposal dialogProposal = (ConfigurableCompletionProposal) createCompletionProposal("Pick color ...",context);
//		if( dialogProposal != null ) {
//			dialogProposal.setTextApplier(new ReplacementTextApplier() {
//				
//				@Override
//				public String getActualReplacementString(
//						ConfigurableCompletionProposal proposal) {
//					ColorDialog dialog = new ColorDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
//					RGB rgb = dialog.open();
//					if( rgb != null ) {
//						return "rgb("+rgb.red+","+rgb.green+","+rgb.blue+")";
//					}
//					return null;
//				}
//			});
//		}
//		acceptor.accept(dialogProposal); 
		super.complete_ColorTok(model, ruleCall, context, acceptor);
	}
	
	// TODO implement support for filtering by element name
	public void complete_css_property(ruleset model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		URI uri = model.eResource().getURI();
		
		List<CssProperty> properties = extension.getAllProperties(uri);
		if (properties != null) {
			
			Map<Integer, String> alternateSource = new HashMap<Integer, String>();
			Map<Integer, CssProperty> filterMap = new HashMap<Integer, CssProperty>();
			
			for (CssProperty property : properties) {
				CssProperty old = filterMap.put(property.eqHash, property);
				if (old != null) {
					String x = alternateSource.get(property.eqHash);
					if (x != null) {
						alternateSource.put(property.eqHash, x + ", " + property.parent.fQName);
					}
					else {
						alternateSource.put(property.eqHash, old.parent.fQName + ", " + property.parent.fQName);
					}
				}
			}
			
			for (CssProperty property : filterMap.values()) {
				
				StyledString displayString = new StyledString();
				String name = property.name + " ";
				String nfo = "";
				String alternate = alternateSource.get(property.eqHash);
				if (alternate == null) {
					nfo = "(" + property.parent.fQName + ")";
				}
				else {
					nfo = "( " + alternate + " )";
				}
				
				displayString.append(name);
				displayString.append(nfo);
				
				displayString.setStyle(name.length(), nfo.length(), new Styler() {
					@Override
					public void applyStyles(TextStyle textStyle) {
						textStyle.foreground = Display.getDefault().getSystemColor(SWT.COLOR_GRAY);
					}
				});
				
				Image img = labelProvider.getImage(CssDslFactory.eINSTANCE.createcss_property());
				
				ConfigurableCompletionProposal cp = (ConfigurableCompletionProposal) createCompletionProposal(property.name, displayString, img, context);
				
				if (cp != null) {
					cp.setAdditionalProposalInfo(model);
					cp.setHover(new PropertyHover(property));
					cp.setTriggerCharacters(new char[] { ' ' });
					cp.setTextApplier(new IReplacementTextApplier() {
						
						@Override
						public void apply(IDocument document, ConfigurableCompletionProposal proposal) throws BadLocationException {
							document.replace(proposal.getReplacementOffset(), proposal.getReplacementLength(), proposal.getReplacementString() + ": ");
							proposal.setCursorPosition(proposal.getCursorPosition()+2);
						}
					});
					
					acceptor.accept(cp);
				}
			}
		}
		
//		List<Property> properties = extension.getProperties(uri);
//		
//		
//		if (properties != null) {
//		
//			for (Property property : properties) {
//				
//				
//				ConfigurableCompletionProposal cp = (ConfigurableCompletionProposal) createCompletionProposal(property.getName(), property.getName(), null, context);
//				cp.setAdditionalProposalInfo(model);
//				//cp.setHover(new HoverImpl(extension.getDocForProperty(model.eResource().getURI(), property.getName())));
//			
//				cp.setHover(new PropertyHover(uri, property.getName()));
//				
//				cp.setImage(labelProvider.getImage(CssDslFactory.eINSTANCE.createcss_property()));
//				
//				StyledString displayString = new StyledString();
//				String name = property.getName() + " ";
//				String nfo = "(" + "defined in package lala" + ")";
//				
//				displayString.append(name);
//				displayString.append(nfo);
//				
//				displayString.setStyle(name.length(), nfo.length(), new Styler() {
//					@Override
//					public void applyStyles(TextStyle textStyle) {
//						textStyle.foreground = Display.getDefault().getSystemColor(SWT.COLOR_GRAY);
//					}
//				});
//				
//				
//				cp.setDisplayString(displayString);
//				acceptor.accept(cp);
//			}
//		}
	}
	
	
//	@Override
//	public void complete_expr(EObject model, RuleCall ruleCall,
//			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
//		System.err.println("Expression Proposal: " + model);
////		if( context.getCurrentModel() instanceof css_declaration ) {
////			css_declaration o = (css_declaration) model;
////			Property p = getProperty(extension.getProperties(), o.getProperty());
////			
////			if( p != null ) {
////				for( Proposal proposal : p.getInitialTermProposals() ) {
////					acceptor.accept(createCompletionProposal(proposal.getLabel(), proposal.getLabel(), null, context));
////				}
////			}
////		} else {
////			super.complete_expr(model, ruleCall, context, acceptor);
////		}
//	}
	
	
	
//	@Override
//	public void complete_termGroup(EObject model, RuleCall ruleCall,
//			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
//		System.err.println("TermGroup proposal: " + context.getCurrentModel());
////		if( context.getCurrentModel() instanceof css_declaration ) {
////			css_declaration dec = (css_declaration) context.getCurrentModel();
////			
////		}
//		
////		
//		super.complete_termGroup(model, ruleCall, context, acceptor);
//	}
	
	private void handlePropertyCompletion(URI uri, EObject model, List<CssTok> prefixToks, String prefix, String elementName, String propertyName, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		
		
		List<Proposal> proposals = extension.findProposals(uri, elementName, propertyName, prefixToks, prefix);
		
		for (Proposal p : proposals) {
			
			StyledString displayString = new StyledString();
			String name = p.getLabel() + " ";
			String nfo  = "( " + p.getLabel() + " )";
			
			displayString.append(name);
			displayString.append(nfo);
			
			displayString.setStyle(name.length(), nfo.length(), new Styler() {
				@Override
				public void applyStyles(TextStyle textStyle) {
					textStyle.foreground = Display.getDefault().getSystemColor(SWT.COLOR_GRAY);
				}
			});
			
			// TODO fix image
			Image img = labelProvider.getImage(CssDslFactory.eINSTANCE.createcss_property());
			
			ConfigurableCompletionProposal cp = (ConfigurableCompletionProposal) createCompletionProposal(p.getProposal(), displayString, img, context);
			
			
			
			if (cp != null) {
				cp.setAdditionalProposalInfo(model);
				//cp.setHover(new PropertyHover(property));
				cp.setAutoInsertable(true);
				cp.setTriggerCharacters(new char[] { ' ' });
				if( p instanceof DialogProposal ) {
					final DialogProposal dProp = (DialogProposal) p;
					cp.setTextApplier(new ReplacementTextApplier() {
//						
						@Override
						public String getActualReplacementString(
								ConfigurableCompletionProposal proposal) {
							return dProp.openProposal();
						}
					});
				} else {
					cp.setTextApplier(new IReplacementTextApplier() {
						
						@Override
						public void apply(IDocument document, ConfigurableCompletionProposal proposal) throws BadLocationException {
//							proposal.setReplaceContextLength((proposal.getReplacementString() + " ").length());
							
							System.err.println("apply " + proposal.getReplacementString());
							
							if (",".equals(proposal.getReplacementString())) {
								document.replace(proposal.getReplacementOffset()-1, proposal.getReplacementLength() + 1, proposal.getReplacementString() + " ");
//								proposal.setCursorPosition(proposal.getCursorPosition() + 1);
							}
							else if (",".equals(proposal.getReplacementString())) {
								document.replace(proposal.getReplacementOffset()-1, proposal.getReplacementLength() + 1, proposal.getReplacementString() + "\n");
							}
							else {
								document.replace(proposal.getReplacementOffset(), proposal.getReplacementLength(), proposal.getReplacementString() + " ");
								proposal.setCursorPosition(proposal.getCursorPosition() + 1);
								
							}
							
						}
					});
				}
				
				acceptor.accept(cp);
			}
		}
	}
	
	public void complete_CssTok(css_declaration model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.err.println("#reflective CssTok css_declaration");
		
		System.err.println("propertyName: '" + model.getProperty().getName()+"'");
		// TODO find element name
		System.err.println("elementName: '" + ((ruleset)model.eContainer()).getSelectors()+"'");
		System.err.println("prefix: '" + context.getPrefix() + "'");

		URI uri = model.eResource().getURI();
		String elementName = null; // TODO find element from selector
		String propertyName = model.getProperty().getName();
		String prefixString = context.getPrefix();
		
		if (context.getLastCompleteNode().getSemanticElement() instanceof CssTok) {
			CssTok currentTok = (CssTok) context.getLastCompleteNode().getSemanticElement();
			List<CssTok> prefixToks = new ArrayList<CssTok>();
			for (CssTok tok : ((css_declaration)context.getLastCompleteNode().getSemanticElement().eContainer()).getValueTokens()) {
				if (tok == currentTok) break;
				prefixToks.add(tok);
			}
			
			// TEST 
//			prefixToks.add(currentTok);
			
			System.err.println("currentTok = " + currentTok);
			System.err.println("prefixToks");
			for (CssTok tok : prefixToks) {
				System.err.println(" * " + tok);
			}
			
			handlePropertyCompletion(uri, model, prefixToks, prefixString, elementName, propertyName, context, acceptor);
		}
		else {
			handlePropertyCompletion(uri, model, new ArrayList<CssTok>(), prefixString, elementName, propertyName, context, acceptor);
		}
	}
	
	
//	@Override
//	public void complete_term(EObject model, RuleCall ruleCall,
//			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
//		
//		
//		
//		
//		System.err.println("Term proposal: " + context.getCurrentModel());
//		
//////		System.err.println(ruleCall.eContainer());
//		
//		if( context.getCurrentModel() instanceof css_declaration ) {
//			// We get in here on the 1st value of the first group
//			// We get in here on the 2nd ... value of the first group
//			css_declaration dec = (css_declaration) context.getCurrentModel();
//			if( dec.getExpression() == null || dec.getExpression().getTermGroups().size() == 0) {
////				System.err.println("This is the initial");
//				Property p = getProperty(extension.getProperties(model.eResource().getURI()), dec.getProperty().getName());
//				if( p != null ) {
//					addProposals(p.getInitialTermProposals(), acceptor, context);
//					return;
//				}
//			}
//		} else if( context.getCurrentModel() instanceof termGroup ) {
//			// We get in here on 2nd value of first group
//			// We get in here on 2nd value of 2nd ... group
//			termGroup group = (termGroup) context.getCurrentModel();
//			expr expression = (expr) group.eContainer();
//			css_declaration dec = (css_declaration) expression.eContainer();
//			
//			if( expression.getTermGroups().indexOf(group) == 0 ) {
//				Property p = getProperty(extension.getProperties(model.eResource().getURI()), dec.getProperty().getName());
////				System.err.println("This is the first group");
//				if( p instanceof MultiValuesGroupProperty ) {
//					addProposals(((MultiValuesGroupProperty) p).getNextTermProposal(group.getTerms().size(), group, null), acceptor, context);
////					System.err.println("Property with multi terms in a group");
//				}
//			} else {
////				System.err.println("This is 2nd ... in 2nd group");
//				Property p = getProperty(extension.getProperties(model.eResource().getURI()), dec.getProperty().getName());
//				if( p instanceof MultiTermGroupProperty && p instanceof MultiValuesGroupProperty ) {
////					System.err.println("Property with multi terms in a group");
//					addProposals(((MultiValuesGroupProperty) p).getNextTermProposal(group.getTerms().size(), group, null), acceptor, context);
//				}
//			}
//			
//		} else if( context.getCurrentModel() instanceof expr ) {
//			// We get in here on 1st value if 2nd ... group 
//			// We get in here on 2nd value of 2nd ... group
//			expr expression = (expr) context.getCurrentModel();
//			css_declaration dec = (css_declaration) expression.eContainer();
//			Property p = getProperty(extension.getProperties(model.eResource().getURI()), dec.getProperty().getName());
//			if( p instanceof MultiTermGroupProperty ) {
//				addProposals(((MultiTermGroupProperty) p).getInitialTermProposal(0, dec), acceptor, context);
//			}
//			/*if( expression.getTermGroups().size() == 0 ) {
//				System.err.println("First in 2nd group");
//			}*/
////			System.err.println(expression.getTermGroups().size());
//		} else if( context.getCurrentModel() instanceof term ) {
//			term term = (term) context.getCurrentModel();
//			termGroup group = (termGroup) term.eContainer();
//			expr expression = (expr) group.eContainer();
//			if( expression.eContainer() instanceof css_declaration ) {
//				css_declaration dec = (css_declaration) expression.eContainer();
//				
//				Property p = getProperty(extension.getProperties(model.eResource().getURI()), dec.getProperty().getName());
//				if( p != null ) {
//					int groupIdx = expression.getTermGroups().indexOf(group);
//					if( groupIdx == 0 ) {
//						// We are in the first group
//						int idx = group.getTerms().indexOf(term) + 1;
//						if( idx == 0 ) {
//							// We are in the first term in the group
////							System.err.println("First term");
//							addProposals(p.getInitialTermProposals(), acceptor, context);
//						} else if( p instanceof MultiValuesGroupProperty ) {
////							System.err.println("Second term");
//							MultiValuesGroupProperty tmp = (MultiValuesGroupProperty) p;
//							addProposals(tmp.getNextTermProposal(idx, group, term), acceptor, context);
//						}
//					} else {
//						if( p instanceof MultiTermGroupProperty ) {
//							MultiTermGroupProperty tmp = (MultiTermGroupProperty) p;
//							int idx = group.getTerms().indexOf(term) + 1;
//							if( idx == 0 ) {
////								System.err.println("First term in > 1 group");
//								addProposals(tmp.getInitialTermProposal(groupIdx, dec), acceptor, context);
//							} else if( p instanceof MultiValuesGroupProperty ) {
////								System.err.println("2nd term in > 1 group");
//								MultiValuesGroupProperty tmp2 = (MultiValuesGroupProperty) p;
//								addProposals(tmp2.getNextTermProposal(idx, group, term), acceptor, context);
//							}
//						}
//					}
//				}
//			}
//		}
//		
//		
////		if( model instanceof term ) {
////			term t = (term) model;
////			if( t.eContainer() instanceof termGroup ) {
////				termGroup tgr = (termGroup) t.eContainer();
////				if( tgr.eContainer() instanceof expr ) {
////					expr expression = (expr) tgr.eContainer();
////					if( expression.eContainer() instanceof css_declaration ) {
////						css_declaration dec = (css_declaration) expression.eContainer();
////						if( createExpressionFurtherTermProposals(dec, expression, tgr, t) ) {
////							return;
////						}
////					}
////				}
////			}
////		}
//		super.complete_term(model, ruleCall, context, acceptor);
//	}
	
	private void addProposals(List<Proposal> proposals, ICompletionProposalAcceptor acceptor, ContentAssistContext context) {
		for( Proposal proposal : proposals ) {
			if( proposal instanceof DialogProposal ) {
				final DialogProposal dProp = (DialogProposal) proposal;
				ConfigurableCompletionProposal dialogProposal = (ConfigurableCompletionProposal) createCompletionProposal(proposal.getLabel(),context);
				if( dialogProposal != null ) {
					dialogProposal.setTextApplier(new ReplacementTextApplier() {
						
						@Override
						public String getActualReplacementString(
								ConfigurableCompletionProposal proposal) {
							return dProp.openProposal();
						}
					});
				}
				acceptor.accept(dialogProposal); 
			} else {
				acceptor.accept(createCompletionProposal(proposal.getLabel(), new StyledString(proposal.getLabel()), null, proposal.getPriority(), context.getPrefix(), context));	
			}
		}
	}
	
//	private boolean createExpressionFurtherTermProposals(css_declaration dec, expr expression, termGroup tgr, term t) {
//		// This is the >= 2nd group
//		if( expression.getTermGroups().indexOf(tgr) != 0 ) {
//			Property p = getProperty(extension.getProperties(dec.eResource().getURI()), dec.getProperty().getName());
//			if( p instanceof MultiTermGroupProperty ) {
//				if( tgr.getTerms().indexOf(t) == 0 ) {
//					// Show the initial proposals
//					return true;
//				} else if( p instanceof MultiValuesGroupProperty ) {
//					// Show the extended proposals
//				}
//				
//				return true;
//			}
//		} else {
//			Property p = getProperty(extension.getProperties(dec.eResource().getURI()), dec.getProperty().getName());
//			if( p instanceof MultiValuesGroupProperty ) {
//				if( tgr.getTerms().indexOf(t) > 0 ) {
//					// Show the extended proposals
//				}
//			}
//		}
//		
//		return false;
//	}
	
	private static Property getProperty(List<Property> properties, String property) {
		if( property == null || property.trim().length() == 0 ) {
			return null;
		}
		
		for( Property p : properties ) {
			if( property.equals(p.getName()) ) {
				return p;
			}
		}
		
		return null;
	}
	
//	public static List<String> getProposals(String property) {
//		if( property.equals("border-top-style") 
//				|| property.equals("border-right-style") 
//				|| property.equals("border-bottom-style")
//				|| property.equals("border-left-style") ) {
//			return Arrays.asList("none", "hidden", "dotted", "dashed", "solid", "double", "groove", "ridge", "inset", "outset" );
//		}
//		return Collections.emptyList();
//	}
	
	public class PropertyHover extends AbstractEObjectHover {

		private CssProperty property;
		
		public PropertyHover(CssProperty property) {
			this.property = property;
		}
			
		@Override
		public Object getHoverInfo(EObject eObject, ITextViewer textViewer, IRegion hoverRegion) {
			return property.getDoc();
		}

		
	}
	
	public static class HoverImpl implements IEObjectHover {
		private JavadocHoverWrapper javadocHover = new JavadocHoverWrapper();
		private String doc;

		public HoverImpl(String doc) {
			this.doc = doc;
		}

		@Override
		public Object getHoverInfo(EObject eObject, ITextViewer textViewer, IRegion hoverRegion) {
			//javadocHover.setJavaElement(javaElement);
			return doc; //javadocHover.getHoverInfo2(textViewer, hoverRegion);
		}

//		@Override
//		public IInformationControlCreator getHoverControlCreator() {
//			return javadocHover.getHoverControlCreator();
//		}
	}
}