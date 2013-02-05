package at.bestsolution.efxclipse.tooling.css.ui.occurrences;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.ILocationInFileProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.occurrences.DefaultOccurrenceComputer;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtext.util.TextRegion;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import at.bestsolution.efxclipse.tooling.css.CssExtendedDialectExtension.CssProperty;
import at.bestsolution.efxclipse.tooling.css.cssDsl.ClassSelector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.CssSelector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.ElementSelector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.IdSelector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.css_declaration;
import at.bestsolution.efxclipse.tooling.css.cssDsl.css_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.ruleset;
import at.bestsolution.efxclipse.tooling.css.cssDsl.selector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.simple_selector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.stylesheet;

import com.google.inject.Inject;

public class CssDslOccurenceComputer extends DefaultOccurrenceComputer {

	@Inject
	private EObjectAtOffsetHelper eObjectAtOffsetHelper;

	@Inject
	private ILocationInFileProvider locationInFileProvider;
	
	@Override
	public Map<Annotation, Position> createAnnotationMap(XtextEditor editor, final ITextSelection selection, SubMonitor monitor) {
		Map<Annotation, Position> map = null;
		
		final IXtextDocument document = editor.getDocument();
		if(document != null) {
			map = document.readOnly(new IUnitOfWork<Map<Annotation, Position>, XtextResource>() {
				public Map<Annotation, Position> exec(final XtextResource resource) throws Exception {
					Map<Annotation,Position> m = new HashMap<Annotation, Position>();
					
					if(resource != null) {
						EObject target = eObjectAtOffsetHelper.resolveElementAt(resource, (selection).getOffset());
						
						// ElementSelectors:
						if (target instanceof ElementSelector) {
							stylesheet root = (stylesheet) resource.getContents().get(0);
							for (ruleset r : root.getRuleset()) {
								for (selector s : r.getSelectors()) {
									selector cur = s;
									while (cur != null) {
										for (simple_selector ss : cur.getSimpleselectors()) {
											if (ss.getElement() != null) {
												ElementSelector check = ss.getElement();
												if (check.getName().equals(((ElementSelector) target).getName())) {
													ITextRegion declarationRegion = locationInFileProvider.getFullTextRegion(ss.getElement());
													addOccurrenceAnnotation(DECLARATION_ANNOTATION_TYPE, document, declarationRegion, m);
												}
											}
										}
										cur = cur.getSelector();
									}
								}
							}
						}
						
						// ClassSelector:
						if (target instanceof ClassSelector) {
							stylesheet root = (stylesheet) resource.getContents().get(0);
							for (ruleset r : root.getRuleset()) {
								for (selector s : r.getSelectors()) {
									selector cur = s;
									while (cur != null) {
										for (simple_selector ss : cur.getSimpleselectors()) {
											for (CssSelector subSel : ss.getSubSelectors()) {
												if (subSel instanceof ClassSelector) {
													ClassSelector check = (ClassSelector) subSel;
													if (check.getName() != null) {
														// TODO i don't get get a ClassSelectors name can be null
														if (check.getName().equals(((ClassSelector) target).getName())) {
															ITextRegion declarationRegion = locationInFileProvider.getFullTextRegion(subSel);
															addOccurrenceAnnotation(DECLARATION_ANNOTATION_TYPE, document, declarationRegion, m);
														}
													}
												}
											}
											if (ss.getElement() != null) {
												
											}
										}
										cur = cur.getSelector();
									}
								}
							}
						}
						// ClassSelector:
						if (target instanceof IdSelector) {
							stylesheet root = (stylesheet) resource.getContents().get(0);
							for (ruleset r : root.getRuleset()) {
								for (selector s : r.getSelectors()) {
									selector cur = s;
									while (cur != null) {
										for (simple_selector ss : cur.getSimpleselectors()) {
											for (CssSelector subSel : ss.getSubSelectors()) {
												if (subSel instanceof IdSelector) {
													IdSelector check = (IdSelector) subSel;
													if (check.getName().equals(((IdSelector) target).getName())) {
														ITextRegion declarationRegion = locationInFileProvider.getFullTextRegion(subSel);
														addOccurrenceAnnotation(DECLARATION_ANNOTATION_TYPE, document, declarationRegion, m);
													}
												}
											}
											if (ss.getElement() != null) {
												
											}
										}
										cur = cur.getSelector();
									}
								}
							}
						}
						
						// Properties
						if (target instanceof css_property) {
							stylesheet root = (stylesheet) resource.getContents().get(0);
							for (ruleset r : root.getRuleset()) {
								for (css_declaration d : r.getDeclarations()) {
									if (d.getProperty().getName().equals(((css_property) target).getName())) {
										ITextRegion declarationRegion = locationInFileProvider.getFullTextRegion(d.getProperty());
										addOccurrenceAnnotation(DECLARATION_ANNOTATION_TYPE, document, declarationRegion, m);
									}
								}
							}
						}
					}
					return m;
				}
			});
		}
			
		
		return map;
	}
}
