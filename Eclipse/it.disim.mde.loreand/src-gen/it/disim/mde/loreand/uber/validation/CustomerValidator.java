/**
 *
 * $Id$
 */
package it.disim.mde.loreand.uber.validation;

import it.disim.mde.loreand.uber.CardID;
import it.disim.mde.loreand.uber.CustomerStatus;
import it.disim.mde.loreand.uber.Route;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link it.disim.mde.loreand.uber.Customer}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CustomerValidator {
	boolean validate();

	boolean validateSubscriptionDate(String value);

	boolean validateExpirationDate(String value);

	boolean validateStatus(CustomerStatus value);

	boolean validateRoutes(EList<Route> value);

	boolean validateCardID(CardID value);
}