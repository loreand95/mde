/**
 */
package taxi;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see taxi.TaxiPackage
 * @generated
 */
public interface TaxiFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TaxiFactory eINSTANCE = taxi.impl.TaxiFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Company</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Company</em>'.
	 * @generated
	 */
	Company createCompany();

	/**
	 * Returns a new object of class '<em>Customer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer</em>'.
	 * @generated
	 */
	Customer createCustomer();

	/**
	 * Returns a new object of class '<em>Rider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rider</em>'.
	 * @generated
	 */
	Rider createRider();

	/**
	 * Returns a new object of class '<em>Geolocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Geolocation</em>'.
	 * @generated
	 */
	Geolocation createGeolocation();

	/**
	 * Returns a new object of class '<em>Route</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Route</em>'.
	 * @generated
	 */
	Route createRoute();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TaxiPackage getTaxiPackage();

} //TaxiFactory
