package at.bestsolution.efxclipse.tooling.css.cssext.ui.debug;

import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

import at.bestsolution.efxclipse.tooling.css.cssext.ui.CssExtDslExecutableExtensionFactory;

public class LocalExecutableExtensionFactory extends CssExtDslExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle("at.bestsolution.efxclipse.tooling.css.cssext.ui.debug");
	}
}
