package at.bestsolution.efxclipse.tooling.css.cssext.ui.occurrences;

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

import at.bestsolution.efxclipse.tooling.css.cssDsl.ElementSelector;
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
									for (simple_selector ss : s.getSimpleselectors()) {
										if (ss.getElement() != null) {
											ITextRegion declarationRegion = locationInFileProvider.getFullTextRegion(ss.getElement());
											addOccurrenceAnnotation(DECLARATION_ANNOTATION_TYPE, document, declarationRegion, m);
										}
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
