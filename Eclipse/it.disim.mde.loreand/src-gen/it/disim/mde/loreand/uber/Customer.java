/**
 */
package it.disim.mde.loreand.uber;

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
 *   <li>{@link it.disim.mde.loreand.uber.Customer#getSubscriptionDate <em>Subscription Date</em>}</li>
 *   <li>{@link it.disim.mde.loreand.uber.Customer#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link it.disim.mde.loreand.uber.Customer#getStatus <em>Status</em>}</li>
 *   <li>{@link it.disim.mde.loreand.uber.Customer#getRoutes <em>Routes</em>}</li>
 *   <li>{@link it.disim.mde.loreand.uber.Customer#getCardID <em>Card ID</em>}</li>
 * </ul>
 *
 * @see it.disim.mde.loreand.uber.UberPackage#getCustomer()
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
	 * @see it.disim.mde.loreand.uber.UberPackage#getCustomer_SubscriptionDate()
	 * @model
	 * @generated
	 */
	String getSubscriptionDate();

	/**
	 * Sets the value of the '{@link it.disim.mde.loreand.uber.Customer#getSubscriptionDate <em>Subscription Date</em>}' attribute.
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
	 * @see it.disim.mde.loreand.uber.UberPackage#getCustomer_ExpirationDate()
	 * @model required="true"
	 * @generated
	 */
	String getExpirationDate();

	/**
	 * Sets the value of the '{@link it.disim.mde.loreand.uber.Customer#getExpirationDate <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Date</em>' attribute.
	 * @see #getExpirationDate()
	 * @generated
	 */
	void setExpirationDate(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link it.disim.mde.loreand.uber.CustomerStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see it.disim.mde.loreand.uber.CustomerStatus
	 * @see #setStatus(CustomerStatus)
	 * @see it.disim.mde.loreand.uber.UberPackage#getCustomer_Status()
	 * @model required="true"
	 * @generated
	 */
	CustomerStatus getStatus();

	/**
	 * Sets the value of the '{@link it.disim.mde.loreand.uber.Customer#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see it.disim.mde.loreand.uber.CustomerStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CustomerStatus value);

	/**
	 * Returns the value of the '<em><b>Routes</b></em>' reference list.
	 * The list contents are of type {@link it.disim.mde.loreand.uber.Route}.
	 * It is bidirectional and its opposite is '{@link it.disim.mde.loreand.uber.Route#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routes</em>' reference list.
	 * @see it.disim.mde.loreand.uber.UberPackage#getCustomer_Routes()
	 * @see it.disim.mde.loreand.uber.Route#getCustomer
	 * @model opposite="customer"
	 * @generated
	 */
	EList<Route> getRoutes();

	/**
	 * Returns the value of the '<em><b>Card ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card ID</em>' containment reference.
	 * @see #setCardID(CardID)
	 * @see it.disim.mde.loreand.uber.UberPackage#getCustomer_CardID()
	 * @model containment="true"
	 * @generated
	 */
	CardID getCardID();

	/**
	 * Sets the value of the '{@link it.disim.mde.loreand.uber.Customer#getCardID <em>Card ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card ID</em>' containment reference.
	 * @see #getCardID()
	 * @generated
	 */
	void setCardID(CardID value);

} // Customer
