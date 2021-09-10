/**
 *
 * $Id$
 */
package it.disim.loreand.mde.validation;

/**
 * A sample validator interface for {@link it.disim.loreand.mde.User}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface UserValidator {
	boolean validate();

	boolean validateName(String value);

	boolean validateSurname(String value);

	boolean validateEmail(String value);

	boolean validateFullName(String value);
}