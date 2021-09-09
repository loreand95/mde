/**
 */
package uber;

import java.util.Date;

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
 *   <li>{@link uber.Customer#getSubscriptionDate <em>Subscription Date</em>}</li>
 *   <li>{@link uber.Customer#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link uber.Customer#getStatus <em>Status</em>}</li>
 *   <li>{@link uber.Customer#getRoutes <em>Routes</em>}</li>
 * </ul>
 *
 * @see uber.UberPackage#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends User {
	/**
	 * Returns the value of the '<em><b>Subscription Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription Date</em>' attribute.
	 * @see #setSubscriptionDate(Date)
	 * @see uber.UberPackage#getCustomer_SubscriptionDate()
	 * @model
	 * @generated
	 */
	Date getSubscriptionDate();

	/**
	 * Sets the value of the '{@link uber.Customer#getSubscriptionDate <em>Subscription Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Date</em>' attribute.
	 * @see #getSubscriptionDate()
	 * @generated
	 */
	void setSubscriptionDate(Date value);

	/**
	 * Returns the value of the '<em><b>Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiration Date</em>' attribute.
	 * @see #setExpirationDate(Date)
	 * @see uber.UberPackage#getCustomer_ExpirationDate()
	 * @model required="true"
	 * @generated
	 */
	Date getExpirationDate();

	/**
	 * Sets the value of the '{@link uber.Customer#getExpirationDate <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Date</em>' attribute.
	 * @see #getExpirationDate()
	 * @generated
	 */
	void setExpirationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link uber.CustomerStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see uber.CustomerStatus
	 * @see #setStatus(CustomerStatus)
	 * @see uber.UberPackage#getCustomer_Status()
	 * @model required="true"
	 * @generated
	 */
	CustomerStatus getStatus();

	/**
	 * Sets the value of the '{@link uber.Customer#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see uber.CustomerStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CustomerStatus value);

	/**
	 * Returns the value of the '<em><b>Routes</b></em>' reference list.
	 * The list contents are of type {@link uber.Route}.
	 * It is bidirectional and its opposite is '{@link uber.Route#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routes</em>' reference list.
	 * @see uber.UberPackage#getCustomer_Routes()
	 * @see uber.Route#getCustomer
	 * @model opposite="customer"
	 * @generated
	 */
	EList<Route> getRoutes();

} // Customer
