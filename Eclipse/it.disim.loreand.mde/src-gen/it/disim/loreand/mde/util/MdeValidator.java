/**
 */
package it.disim.loreand.mde.util;

import it.disim.loreand.mde.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see it.disim.loreand.mde.MdePackage
 * @generated
 */
public class MdeValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MdeValidator INSTANCE = new MdeValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "it.disim.loreand.mde";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdeValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return MdePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case MdePackage.UBER:
			return validateUber((Uber) value, diagnostics, context);
		case MdePackage.USER:
			return validateUser((User) value, diagnostics, context);
		case MdePackage.CUSTOMER:
			return validateCustomer((Customer) value, diagnostics, context);
		case MdePackage.RIDER:
			return validateRider((Rider) value, diagnostics, context);
		case MdePackage.GEOLOCATION:
			return validateGeolocation((Geolocation) value, diagnostics, context);
		case MdePackage.ROUTE:
			return validateRoute((Route) value, diagnostics, context);
		case MdePackage.IDENTIFIABLE:
			return validateIdentifiable((Identifiable) value, diagnostics, context);
		case MdePackage.RIDER_STATUS:
			return validateRiderStatus((RiderStatus) value, diagnostics, context);
		case MdePackage.ROUTE_STATUS:
			return validateRouteStatus((RouteStatus) value, diagnostics, context);
		case MdePackage.CUSTOMER_STATUS:
			return validateCustomerStatus((CustomerStatus) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUber(Uber uber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uber, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUser(User user, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(user, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomer(Customer customer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(customer, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(customer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(customer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(customer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(customer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(customer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(customer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(customer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(customer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCustomer_FutureDate(customer, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the FutureDate constraint of '<em>Customer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CUSTOMER__FUTURE_DATE__EEXPRESSION = "self.expirationDate >= self.subscriptionDate";

	/**
	 * Validates the FutureDate constraint of '<em>Customer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomer_FutureDate(Customer customer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(MdePackage.Literals.CUSTOMER, customer, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "FutureDate", CUSTOMER__FUTURE_DATE__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRider(Rider rider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rider, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeolocation(Geolocation geolocation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geolocation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoute(Route route, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(route, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(route, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(route, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(route, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(route, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(route, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(route, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(route, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(route, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRoute_MaxSeats(route, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRoute_MaxPrice(route, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRoute_MinPrice(route, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRoute_Reviwed(route, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the MaxSeats constraint of '<em>Route</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROUTE__MAX_SEATS__EEXPRESSION = "self.seats <= 4";

	/**
	 * Validates the MaxSeats constraint of '<em>Route</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoute_MaxSeats(Route route, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(MdePackage.Literals.ROUTE, route, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "MaxSeats", ROUTE__MAX_SEATS__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the MaxPrice constraint of '<em>Route</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROUTE__MAX_PRICE__EEXPRESSION = "self.price <= 100";

	/**
	 * Validates the MaxPrice constraint of '<em>Route</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoute_MaxPrice(Route route, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(MdePackage.Literals.ROUTE, route, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "MaxPrice", ROUTE__MAX_PRICE__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the MinPrice constraint of '<em>Route</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROUTE__MIN_PRICE__EEXPRESSION = "self.price >= 1";

	/**
	 * Validates the MinPrice constraint of '<em>Route</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoute_MinPrice(Route route, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(MdePackage.Literals.ROUTE, route, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "MinPrice", ROUTE__MIN_PRICE__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the Reviwed constraint of '<em>Route</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROUTE__REVIWED__EEXPRESSION = "self.status = RouteStatus::DONE or (self.feedback = 0 and self.status <> RouteStatus::DONE)";

	/**
	 * Validates the Reviwed constraint of '<em>Route</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoute_Reviwed(Route route, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(MdePackage.Literals.ROUTE, route, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "Reviwed", ROUTE__REVIWED__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifiable(Identifiable identifiable, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(identifiable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiderStatus(RiderStatus riderStatus, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRouteStatus(RouteStatus routeStatus, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomerStatus(CustomerStatus customerStatus, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //MdeValidator
