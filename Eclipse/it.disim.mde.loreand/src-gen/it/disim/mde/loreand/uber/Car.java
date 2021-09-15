/**
 */
package it.disim.mde.loreand.uber;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Car</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.disim.mde.loreand.uber.Car#getLicencePlate <em>Licence Plate</em>}</li>
 *   <li>{@link it.disim.mde.loreand.uber.Car#getModel <em>Model</em>}</li>
 *   <li>{@link it.disim.mde.loreand.uber.Car#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see it.disim.mde.loreand.uber.UberPackage#getCar()
 * @model
 * @generated
 */
public interface Car extends EObject {
	/**
	 * Returns the value of the '<em><b>Licence Plate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Licence Plate</em>' attribute.
	 * @see #setLicencePlate(String)
	 * @see it.disim.mde.loreand.uber.UberPackage#getCar_LicencePlate()
	 * @model required="true"
	 * @generated
	 */
	String getLicencePlate();

	/**
	 * Sets the value of the '{@link it.disim.mde.loreand.uber.Car#getLicencePlate <em>Licence Plate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Licence Plate</em>' attribute.
	 * @see #getLicencePlate()
	 * @generated
	 */
	void setLicencePlate(String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see it.disim.mde.loreand.uber.UberPackage#getCar_Model()
	 * @model required="true"
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link it.disim.mde.loreand.uber.Car#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see it.disim.mde.loreand.uber.UberPackage#getCar_Color()
	 * @model required="true"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link it.disim.mde.loreand.uber.Car#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

} // Car
