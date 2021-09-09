/**
 */
package taxi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link taxi.Customer#getSubscriptionDate <em>Subscription Date</em>}</li>
 *   <li>{@link taxi.Customer#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link taxi.Customer#getStatus <em>Status</em>}</li>
 *   <li>{@link taxi.Customer#getRoutes <em>Routes</em>}</li>
 * </ul>
 *
 * @see taxi.TaxiPackage#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends User {
	/**
	 * Returns the value of the '<em><b>Subscription Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription Date</em>' attribute.
	 * @see #setSubscriptionDate(String)
	 * @see taxi.TaxiPackage#getCustomer_SubscriptionDate()
	 * @model
	 * @generated
	 */
	String getSubscriptionDate();

	/**
	 * Sets the value of the '{@link taxi.Customer#getSubscriptionDate <em>Subscription Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Date</em>' attribute.
	 * @see #getSubscriptionDate()
	 * @generated
	 */
	void setSubscriptionDate(String value);

	/**
	 * Returns the value of the '<em><b>Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiration Date</em>' attribute.
	 * @see #setExpirationDate(String)
	 * @see taxi.TaxiPackage#getCustomer_ExpirationDate()
	 * @model required="true"
	 * @generated
	 */
	String getExpirationDate();

	/**
	 * Sets the value of the '{@link taxi.Customer#getExpirationDate <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Date</em>' attribute.
	 * @see #getExpirationDate()
	 * @generated
	 */
	void setExpirationDate(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link taxi.CustomerStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see taxi.CustomerStatus
	 * @see #setStatus(CustomerStatus)
	 * @see taxi.TaxiPackage#getCustomer_Status()
	 * @model required="true"
	 * @generated
	 */
	CustomerStatus getStatus();

	/**
	 * Sets the value of the '{@link taxi.Customer#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see taxi.CustomerStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CustomerStatus value);

	/**
	 * Returns the value of the '<em><b>Routes</b></em>' reference list.
	 * The list contents are of type {@link taxi.Route}.
	 * It is bidirectional and its opposite is '{@link taxi.Route#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routes</em>' reference list.
	 * @see taxi.TaxiPackage#getCustomer_Routes()
	 * @see taxi.Route#getCustomer
	 * @model opposite="customer"
	 * @generated
	 */
	EList<Route> getRoutes();

} // Customer
