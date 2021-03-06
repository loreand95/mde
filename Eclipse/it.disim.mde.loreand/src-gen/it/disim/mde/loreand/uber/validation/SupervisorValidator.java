/**
 *
 * $Id$
 */
package it.disim.mde.loreand.uber.validation;

import it.disim.mde.loreand.uber.RoleSupervisor;

/**
 * A sample validator interface for {@link it.disim.mde.loreand.uber.Supervisor}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SupervisorValidator {
	boolean validate();

	boolean validateRole(RoleSupervisor value);
}
