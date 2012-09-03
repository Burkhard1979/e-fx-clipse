package at.bestsolution.efxclipse.tooling.css.cssext.ui;

import java.util.List;

import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.ElementDefinition;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PropertyDefinition;

public interface ICssExtManager {

	public abstract PropertyDefinition findPropertyByName(String propertyName);
	public abstract ElementDefinition findElementByName(String elName);
	public abstract List<PropertyDefinition> findAllProperties();
}