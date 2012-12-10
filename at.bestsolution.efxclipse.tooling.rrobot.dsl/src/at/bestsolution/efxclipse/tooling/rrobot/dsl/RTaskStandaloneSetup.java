
package at.bestsolution.efxclipse.tooling.rrobot.dsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class RTaskStandaloneSetup extends RTaskStandaloneSetupGenerated{

	public static void doSetup() {
		new RTaskStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

