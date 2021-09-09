/**
 */
package uber;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Company</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uber.Company#getName <em>Name</em>}</li>
 *   <li>{@link uber.Company#getManager <em>Manager</em>}</li>
 *   <li>{@link uber.Company#getAddress <em>Address</em>}</li>
 *   <li>{@link uber.Company#getCustomers <em>Customers</em>}</li>
 *   <li>{@link uber.Company#getRiders <em>Riders</em>}</li>
 *   <li>{@link uber.Company#getRoutes <em>Routes</em>}</li>
 * </ul>
 *
 * @see uber.UberPackage#getCompany()
 * @model
 * @generated
 */
public interface Company extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uber.UberPackage#getCompany_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uber.Company#getName <em>Name</em>}' attribute.
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
	 * @see uber.UberPackage#getCompany_Manager()
	 * @model
	 * @generated
	 */
	String getManager();

	/**
	 * Sets the value of the '{@link uber.Company#getManager <em>Manager</em>}' attribute.
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
	 * @see uber.UberPackage#getCompany_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link uber.Company#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Customers</b></em>' containment reference list.
	 * The list contents are of type {@link uber.Customer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customers</em>' containment reference list.
	 * @see uber.UberPackage#getCompany_Customers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Customer> getCustomers();

	/**
	 * Returns the value of the '<em><b>Riders</b></em>' containment reference list.
	 * The list contents are of type {@link uber.Rider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Riders</em>' containment reference list.
	 * @see uber.UberPackage#getCompany_Riders()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rider> getRiders();

	/**
	 * Returns the value of the '<em><b>Routes</b></em>' containment reference list.
	 * The list contents are of type {@link uber.Route}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routes</em>' containment reference list.
	 * @see uber.UberPackage#getCompany_Routes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Route> getRoutes();

} // Company
