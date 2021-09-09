/**
 */
package taxi;

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
 *   <li>{@link taxi.Company#getName <em>Name</em>}</li>
 *   <li>{@link taxi.Company#getManager <em>Manager</em>}</li>
 *   <li>{@link taxi.Company#getAddress <em>Address</em>}</li>
 *   <li>{@link taxi.Company#getCustomers <em>Customers</em>}</li>
 *   <li>{@link taxi.Company#getRiders <em>Riders</em>}</li>
 *   <li>{@link taxi.Company#getRoutes <em>Routes</em>}</li>
 * </ul>
 *
 * @see taxi.TaxiPackage#getCompany()
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
	 * @see taxi.TaxiPackage#getCompany_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link taxi.Company#getName <em>Name</em>}' attribute.
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
	 * @see taxi.TaxiPackage#getCompany_Manager()
	 * @model
	 * @generated
	 */
	String getManager();

	/**
	 * Sets the value of the '{@link taxi.Company#getManager <em>Manager</em>}' attribute.
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
	 * @see taxi.TaxiPackage#getCompany_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link taxi.Company#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Customers</b></em>' containment reference list.
	 * The list contents are of type {@link taxi.Customer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customers</em>' containment reference list.
	 * @see taxi.TaxiPackage#getCompany_Customers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Customer> getCustomers();

	/**
	 * Returns the value of the '<em><b>Riders</b></em>' containment reference list.
	 * The list contents are of type {@link taxi.Rider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Riders</em>' containment reference list.
	 * @see taxi.TaxiPackage#getCompany_Riders()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rider> getRiders();

	/**
	 * Returns the value of the '<em><b>Routes</b></em>' containment reference list.
	 * The list contents are of type {@link taxi.Route}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routes</em>' containment reference list.
	 * @see taxi.TaxiPackage#getCompany_Routes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Route> getRoutes();

} // Company
