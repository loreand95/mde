/**
 */
package it.disim.loreand.mde;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uber</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.disim.loreand.mde.Uber#getName <em>Name</em>}</li>
 *   <li>{@link it.disim.loreand.mde.Uber#getManager <em>Manager</em>}</li>
 *   <li>{@link it.disim.loreand.mde.Uber#getAddress <em>Address</em>}</li>
 *   <li>{@link it.disim.loreand.mde.Uber#getCustomers <em>Customers</em>}</li>
 *   <li>{@link it.disim.loreand.mde.Uber#getRiders <em>Riders</em>}</li>
 *   <li>{@link it.disim.loreand.mde.Uber#getRoutes <em>Routes</em>}</li>
 * </ul>
 *
 * @see it.disim.loreand.mde.MdePackage#getUber()
 * @model
 * @generated
 */
public interface Uber extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see it.disim.loreand.mde.MdePackage#getUber_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.disim.loreand.mde.Uber#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager</em>' attribute.
	 * @see #setManager(String)
	 * @see it.disim.loreand.mde.MdePackage#getUber_Manager()
	 * @model
	 * @generated
	 */
	String getManager();

	/**
	 * Sets the value of the '{@link it.disim.loreand.mde.Uber#getManager <em>Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager</em>' attribute.
	 * @see #getManager()
	 * @generated
	 */
	void setManager(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see it.disim.loreand.mde.MdePackage#getUber_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link it.disim.loreand.mde.Uber#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Customers</b></em>' containment reference list.
	 * The list contents are of type {@link it.disim.loreand.mde.Customer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customers</em>' containment reference list.
	 * @see it.disim.loreand.mde.MdePackage#getUber_Customers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Customer> getCustomers();

	/**
	 * Returns the value of the '<em><b>Riders</b></em>' containment reference list.
	 * The list contents are of type {@link it.disim.loreand.mde.Rider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Riders</em>' containment reference list.
	 * @see it.disim.loreand.mde.MdePackage#getUber_Riders()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rider> getRiders();

	/**
	 * Returns the value of the '<em><b>Routes</b></em>' containment reference list.
	 * The list contents are of type {@link it.disim.loreand.mde.Route}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routes</em>' containment reference list.
	 * @see it.disim.loreand.mde.MdePackage#getUber_Routes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Route> getRoutes();

} // Uber
