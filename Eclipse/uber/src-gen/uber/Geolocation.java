/**
 */
package uber;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geolocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uber.Geolocation#getLat <em>Lat</em>}</li>
 *   <li>{@link uber.Geolocation#getLng <em>Lng</em>}</li>
 * </ul>
 *
 * @see uber.UberPackage#getGeolocation()
 * @model
 * @generated
 */
public interface Geolocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat</em>' attribute.
	 * @see #setLat(double)
	 * @see uber.UberPackage#getGeolocation_Lat()
	 * @model required="true"
	 * @generated
	 */
	double getLat();

	/**
	 * Sets the value of the '{@link uber.Geolocation#getLat <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lat</em>' attribute.
	 * @see #getLat()
	 * @generated
	 */
	void setLat(double value);

	/**
	 * Returns the value of the '<em><b>Lng</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lng</em>' attribute.
	 * @see #setLng(double)
	 * @see uber.UberPackage#getGeolocation_Lng()
	 * @model
	 * @generated
	 */
	double getLng();

	/**
	 * Sets the value of the '{@link uber.Geolocation#getLng <em>Lng</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lng</em>' attribute.
	 * @see #getLng()
	 * @generated
	 */
	void setLng(double value);

} // Geolocation
