/**
 */
package it.disim.mde.loreand.uber;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card ID</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.disim.mde.loreand.uber.CardID#getPath <em>Path</em>}</li>
 *   <li>{@link it.disim.mde.loreand.uber.CardID#getReleaseDate <em>Release Date</em>}</li>
 *   <li>{@link it.disim.mde.loreand.uber.CardID#getInstitution <em>Institution</em>}</li>
 *   <li>{@link it.disim.mde.loreand.uber.CardID#getApproved <em>Approved</em>}</li>
 * </ul>
 *
 * @see it.disim.mde.loreand.uber.UberPackage#getCardID()
 * @model
 * @generated
 */
public interface CardID extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see it.disim.mde.loreand.uber.UberPackage#getCardID_Path()
	 * @model required="true"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link it.disim.mde.loreand.uber.CardID#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release Date</em>' attribute.
	 * @see #setReleaseDate(String)
	 * @see it.disim.mde.loreand.uber.UberPackage#getCardID_ReleaseDate()
	 * @model required="true"
	 * @generated
	 */
	String getReleaseDate();

	/**
	 * Sets the value of the '{@link it.disim.mde.loreand.uber.CardID#getReleaseDate <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release Date</em>' attribute.
	 * @see #getReleaseDate()
	 * @generated
	 */
	void setReleaseDate(String value);

	/**
	 * Returns the value of the '<em><b>Institution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Institution</em>' attribute.
	 * @see #setInstitution(String)
	 * @see it.disim.mde.loreand.uber.UberPackage#getCardID_Institution()
	 * @model required="true"
	 * @generated
	 */
	String getInstitution();

	/**
	 * Sets the value of the '{@link it.disim.mde.loreand.uber.CardID#getInstitution <em>Institution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Institution</em>' attribute.
	 * @see #getInstitution()
	 * @generated
	 */
	void setInstitution(String value);

	/**
	 * Returns the value of the '<em><b>Approved</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approved</em>' reference.
	 * @see #setApproved(Supervisor)
	 * @see it.disim.mde.loreand.uber.UberPackage#getCardID_Approved()
	 * @model
	 * @generated
	 */
	Supervisor getApproved();

	/**
	 * Sets the value of the '{@link it.disim.mde.loreand.uber.CardID#getApproved <em>Approved</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approved</em>' reference.
	 * @see #getApproved()
	 * @generated
	 */
	void setApproved(Supervisor value);

} // CardID
