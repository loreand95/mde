/**
 */
package it.disim.mde.loreand.uber;

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
 *   <li>{@link it.disim.mde.loreand.uber.Uber#getName <em>Name</em>}</li>
 *   <li>{@link it.disim.mde.loreand.uber.Uber#getManager <em>Manager</em>}</li>
 *   <li>{@link it.disim.mde.loreand.uber.Uber#getAddress <em>Address</em>}</li>
 *   <li>{@link it.disim.mde.loreand.uber.Uber#getCustomers <em>Customers</em>}</li>
 *   <li>{@link it.disim.mde.loreand.uber.Uber#getRiders <em>Riders</em>}</li>
 *   <li>{@link it.disim.mde.loreand.uber.Uber#getRoutes <em>Routes</em>}</li>
 *   <li>{@link it.disim.mde.loreand.uber.Uber#getSupervisors <em>Supervisors</em>}</li>
 * </ul>
 *
 * @see it.disim.mde.loreand.uber.UberPackage#getUber()
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
	 * @see it.disim.mde.loreand.uber.UberPackage#getUber_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.disim.mde.loreand.uber.Uber#getName <em>Name</em>}' attribute.
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
	 * @see it.disim.mde.loreand.uber.UberPackage#getUber_Manager()
	 * @model
	 * @generated
	 */
	String getManager();

	/**
	 * Sets the value of the '{@link it.disim.mde.loreand.uber.Uber#getManager <em>Manager</em>}' attribute.
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
	 * @see it.disim.mde.loreand.uber.UberPackage#getUber_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link it.disim.mde.loreand.uber.Uber#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Customers</b></em>' containment reference list.
	 * The list contents are of type {@link it.disim.mde.loreand.uber.Customer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customers</em>' containment reference list.
	 * @see it.disim.mde.loreand.uber.UberPackage#getUber_Customers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Customer> getCustomers();

	/**
	 * Returns the value of the '<em><b>Riders</b></em>' containment reference list.
	 * The list contents are of type {@link it.disim.mde.loreand.uber.Rider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Riders</em>' containment reference list.
	 * @see it.disim.mde.loreand.uber.UberPackage#getUber_Riders()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rider> getRiders();

	/**
	 * Returns the value of the '<em><b>Routes</b></em>' containment reference list.
	 * The list contents are of type {@link it.disim.mde.loreand.uber.Route}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routes</em>' containment reference list.
	 * @see it.disim.mde.loreand.uber.UberPackage#getUber_Routes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Route> getRoutes();

	/**
	 * Returns the value of the '<em><b>Supervisors</b></em>' containment reference list.
	 * The list contents are of type {@link it.disim.mde.loreand.uber.Supervisor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supervisors</em>' containment reference list.
	 * @see it.disim.mde.loreand.uber.UberPackage#getUber_Supervisors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Supervisor> getSupervisors();

} // Uber
