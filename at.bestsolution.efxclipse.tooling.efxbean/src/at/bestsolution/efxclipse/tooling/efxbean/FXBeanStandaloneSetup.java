
package at.bestsolution.efxclipse.tooling.efxbean;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class FXBeanStandaloneSetup extends FXBeanStandaloneSetupGenerated{

	public static void doSetup() {
		new FXBeanStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

