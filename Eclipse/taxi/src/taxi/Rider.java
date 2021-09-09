/**
 */
package taxi;

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
 *   <li>{@link taxi.Rider#getStatus <em>Status</em>}</li>
 *   <li>{@link taxi.Rider#getLivePosition <em>Live Position</em>}</li>
 *   <li>{@link taxi.Rider#getRoutes <em>Routes</em>}</li>
 * </ul>
 *
 * @see taxi.TaxiPackage#getRider()
 * @model
 * @generated
 */
public interface Rider extends User {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link taxi.RiderStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see taxi.RiderStatus
	 * @see #setStatus(RiderStatus)
	 * @see taxi.TaxiPackage#getRider_Status()
	 * @model required="true"
	 * @generated
	 */
	RiderStatus getStatus();

	/**
	 * Sets the value of the '{@link taxi.Rider#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see taxi.RiderStatus
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
	 * @see taxi.TaxiPackage#getRider_LivePosition()
	 * @model containment="true"
	 * @generated
	 */
	Geolocation getLivePosition();

	/**
	 * Sets the value of the '{@link taxi.Rider#getLivePosition <em>Live Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Live Position</em>' containment reference.
	 * @see #getLivePosition()
	 * @generated
	 */
	void setLivePosition(Geolocation value);

	/**
	 * Returns the value of the '<em><b>Routes</b></em>' reference list.
	 * The list contents are of type {@link taxi.Route}.
	 * It is bidirectional and its opposite is '{@link taxi.Route#getRider <em>Rider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routes</em>' reference list.
	 * @see taxi.TaxiPackage#getRider_Routes()
	 * @see taxi.Route#getRider
	 * @model opposite="rider"
	 * @generated
	 */
	EList<Route> getRoutes();

} // Rider
