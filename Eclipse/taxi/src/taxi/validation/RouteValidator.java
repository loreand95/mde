/**
 *
 * $Id$
 */
package taxi.validation;

import taxi.Customer;
import taxi.Rider;
import taxi.RouteStatus;

/**
 * A sample validator interface for {@link taxi.Route}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RouteValidator {
	boolean validate();

	boolean validatePrice(double value);
	boolean validateDate(String value);
	boolean validateStartAddress(String value);
	boolean validateEndAddress(String value);
	boolean validateFeedback(int value);
	boolean validateStatus(RouteStatus value);
	boolean validateCustomer(Customer value);
	boolean validateRider(Rider value);
	boolean validateSeat(int value);
}
