/*
 * generated by Xtext 2.25.0
 */
package it.disim.mde.loreand.xtext;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class UberDslStandaloneSetup extends UberDslStandaloneSetupGenerated {

	public static void doSetup() {
		new UberDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
