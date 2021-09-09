/**
 */
package uber;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uber.Rider#getStatus <em>Status</em>}</li>
 *   <li>{@link uber.Rider#getLivePosition <em>Live Position</em>}</li>
 *   <li>{@link uber.Rider#getRoutes <em>Routes</em>}</li>
 * </ul>
 *
 * @see uber.UberPackage#getRider()
 * @model
 * @generated
 */
public interface Rider extends User {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link uber.RiderStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see uber.RiderStatus
	 * @see #setStatus(RiderStatus)
	 * @see uber.UberPackage#getRider_Status()
	 * @model required="true"
	 * @generated
	 */
	RiderStatus getStatus();

	/**
	 * Sets the value of the '{@link uber.Rider#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see uber.RiderStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(RiderStatus value);

	/**
	 * Returns the value of the '<em><b>Live Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Live Position</em>' containment reference.
	 * @see #setLivePosition(Geolocation)
	 * @see uber.UberPackage#getRider_LivePosition()
	 * @model containment="true"
	 * @generated
	 */
	Geolocation getLivePosition();

	/**
	 * Sets the value of the '{@link uber.Rider#getLivePosition <em>Live Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Live Position</em>' containment reference.
	 * @see #getLivePosition()
	 * @generated
	 */
	void setLivePosition(Geolocation value);

	/**
	 * Returns the value of the '<em><b>Routes</b></em>' reference list.
	 * The list contents are of type {@link uber.Route}.
	 * It is bidirectional and its opposite is '{@link uber.Route#getRider <em>Rider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routes</em>' reference list.
	 * @see uber.UberPackage#getRider_Routes()
	 * @see uber.Route#getRider
	 * @model opposite="rider"
	 * @generated
	 */
	EList<Route> getRoutes();

} // Rider
