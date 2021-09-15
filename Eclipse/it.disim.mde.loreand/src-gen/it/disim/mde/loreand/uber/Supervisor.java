/**
 */
package it.disim.mde.loreand.uber;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supervisor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.disim.mde.loreand.uber.Supervisor#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see it.disim.mde.loreand.uber.UberPackage#getSupervisor()
 * @model
 * @generated
 */
public interface Supervisor extends User {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * The default value is <code>"MANAGER"</code>.
	 * The literals are from the enumeration {@link it.disim.mde.loreand.uber.RoleSupervisor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see it.disim.mde.loreand.uber.RoleSupervisor
	 * @see #setRole(RoleSupervisor)
	 * @see it.disim.mde.loreand.uber.UberPackage#getSupervisor_Role()
	 * @model default="MANAGER" required="true"
	 * @generated
	 */
	RoleSupervisor getRole();

	/**
	 * Sets the value of the '{@link it.disim.mde.loreand.uber.Supervisor#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see it.disim.mde.loreand.uber.RoleSupervisor
	 * @see #getRole()
	 * @generated
	 */
	void setRole(RoleSupervisor value);

} // Supervisor
