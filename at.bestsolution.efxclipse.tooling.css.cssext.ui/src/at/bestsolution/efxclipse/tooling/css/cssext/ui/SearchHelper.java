package at.bestsolution.efxclipse.tooling.css.cssext.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtension;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.ElementDefinition;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PackageDefinition;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PropertyDefinition;

public class SearchHelper {

	public static interface PropertyDefinitionFilter {
		public boolean filter(PropertyDefinition def);
		public boolean returnOnFirstHit();
	}
	
	public static interface ElementDefinitionFilter {
		public boolean filter(ElementDefinition def);
		public boolean returnOnFirstHit();
	}
	
	private Set<CssExtension> model;
	
	public SearchHelper(Set<CssExtension> model) {
		this.model = model;
	}
	
	public SearchHelper(CssExtension model) {
		this.model = new HashSet<CssExtension>();
		this.model.add(model);
	}
	
	public SearchHelper(Collection<CssExtension> model) {
		this.model = new HashSet<CssExtension>(model);
	}
	
	public List<PropertyDefinition> findPropertiesByFilter(PropertyDefinitionFilter filter) {
		List<PropertyDefinition> result = new ArrayList<PropertyDefinition>();
		for (CssExtension e : model) {
			recFindProperties(e, result, filter);
		}
		return result;
	}
	
	private void recFindProperties(EObject obj, List<PropertyDefinition> result, PropertyDefinitionFilter filter) {
		if (filter.returnOnFirstHit() && !result.isEmpty()) return;
		else if (obj instanceof CssExtension) {
			CssExtension e = (CssExtension) obj;
			recFindProperties(e.getPackageDef(), result, filter);
		}
		else if (obj instanceof PackageDefinition) {
			PackageDefinition pkg = (PackageDefinition) obj;
			for (ElementDefinition el : pkg.getElements()) {
				for (PropertyDefinition prop : el.getProperties()) {
					if (filter.filter(prop)) {
						result.add(prop);
						if (filter.returnOnFirstHit()) {
							return;
						}
					}
				}
			}
			for (PackageDefinition subPkg : pkg.getSubpackages()) {
				recFindProperties(subPkg, result, filter);
			}
		}
	}
	
	public List<ElementDefinition> findElementByFilter(ElementDefinitionFilter filter) {
		List<ElementDefinition> result = new ArrayList<ElementDefinition>();
		for (CssExtension e : model) {
			recFindElements(e, result, filter);
		}
		return result;
	}
	
	private void recFindElements(EObject obj, List<ElementDefinition> result, ElementDefinitionFilter filter) {
		if (filter.returnOnFirstHit() && !result.isEmpty()) return;
		else if (obj instanceof CssExtension) {
			CssExtension e = (CssExtension) obj;
			recFindElements(e.getPackageDef(), result, filter);
		}
		else if (obj instanceof PackageDefinition) {
			PackageDefinition pkg = (PackageDefinition) obj;
			for (ElementDefinition el : pkg.getElements()) {
				if (filter.filter(el)) {
					result.add(el);
					if (filter.returnOnFirstHit()) return;
				}
			}
			for (PackageDefinition subPkg : pkg.getSubpackages()) {
				recFindElements(subPkg, result, filter);
			}
		}
	}
}
