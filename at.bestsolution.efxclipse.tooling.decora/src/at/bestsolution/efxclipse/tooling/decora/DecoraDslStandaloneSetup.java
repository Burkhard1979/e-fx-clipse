
package at.bestsolution.efxclipse.tooling.decora;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class DecoraDslStandaloneSetup extends DecoraDslStandaloneSetupGenerated{

	public static void doSetup() {
		new DecoraDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

