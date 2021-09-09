/**
 */
package taxi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link taxi.Route#getPrice <em>Price</em>}</li>
 *   <li>{@link taxi.Route#getDate <em>Date</em>}</li>
 *   <li>{@link taxi.Route#getStartAddress <em>Start Address</em>}</li>
 *   <li>{@link taxi.Route#getEndAddress <em>End Address</em>}</li>
 *   <li>{@link taxi.Route#getFeedback <em>Feedback</em>}</li>
 *   <li>{@link taxi.Route#getStatus <em>Status</em>}</li>
 *   <li>{@link taxi.Route#getCustomer <em>Customer</em>}</li>
 *   <li>{@link taxi.Route#getRider <em>Rider</em>}</li>
 *   <li>{@link taxi.Route#getSeat <em>Seat</em>}</li>
 * </ul>
 *
 * @see taxi.TaxiPackage#getRoute()
 * @model
 * @generated
 */
public interface Route extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(double)
	 * @see taxi.TaxiPackage#getRoute_Price()
	 * @model required="true"
	 * @generated
	 */
	double getPrice();

	/**
	 * Sets the value of the '{@link taxi.Route#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(double value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see taxi.TaxiPackage#getRoute_Date()
	 * @model required="true"
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link taxi.Route#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

	/**
	 * Returns the value of the '<em><b>Start Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Address</em>' attribute.
	 * @see #setStartAddress(String)
	 * @see taxi.TaxiPackage#getRoute_StartAddress()
	 * @model required="true"
	 * @generated
	 */
	String getStartAddress();

	/**
	 * Sets the value of the '{@link taxi.Route#getStartAddress <em>Start Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Address</em>' attribute.
	 * @see #getStartAddress()
	 * @generated
	 */
	void setStartAddress(String value);

	/**
	 * Returns the value of the '<em><b>End Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Address</em>' attribute.
	 * @see #setEndAddress(String)
	 * @see taxi.TaxiPackage#getRoute_EndAddress()
	 * @model required="true"
	 * @generated
	 */
	String getEndAddress();

	/**
	 * Sets the value of the '{@link taxi.Route#getEndAddress <em>End Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Address</em>' attribute.
	 * @see #getEndAddress()
	 * @generated
	 */
	void setEndAddress(String value);

	/**
	 * Returns the value of the '<em><b>Feedback</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedback</em>' attribute.
	 * @see #setFeedback(int)
	 * @see taxi.TaxiPackage#getRoute_Feedback()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getFeedback();

	/**
	 * Sets the value of the '{@link taxi.Route#getFeedback <em>Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feedback</em>' attribute.
	 * @see #getFeedback()
	 * @generated
	 */
	void setFeedback(int value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link taxi.RouteStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see taxi.RouteStatus
	 * @see #setStatus(RouteStatus)
	 * @see taxi.TaxiPackage#getRoute_Status()
	 * @model required="true"
	 * @generated
	 */
	RouteStatus getStatus();

	/**
	 * Sets the value of the '{@link taxi.Route#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see taxi.RouteStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(RouteStatus value);

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link taxi.Customer#getRoutes <em>Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference.
	 * @see #setCustomer(Customer)
	 * @see taxi.TaxiPackage#getRoute_Customer()
	 * @see taxi.Customer#getRoutes
	 * @model opposite="routes" required="true"
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link taxi.Route#getCustomer <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(Customer value);

	/**
	 * Returns the value of the '<em><b>Rider</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link taxi.Rider#getRoutes <em>Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rider</em>' reference.
	 * @see #setRider(Rider)
	 * @see taxi.TaxiPackage#getRoute_Rider()
	 * @see taxi.Rider#getRoutes
	 * @model opposite="routes" required="true"
	 * @generated
	 */
	Rider getRider();

	/**
	 * Sets the value of the '{@link taxi.Route#getRider <em>Rider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rider</em>' reference.
	 * @see #getRider()
	 * @generated
	 */
	void setRider(Rider value);

	/**
	 * Returns the value of the '<em><b>Seat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seat</em>' attribute.
	 * @see #setSeat(int)
	 * @see taxi.TaxiPackage#getRoute_Seat()
	 * @model required="true"
	 * @generated
	 */
	int getSeat();

	/**
	 * Sets the value of the '{@link taxi.Route#getSeat <em>Seat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seat</em>' attribute.
	 * @see #getSeat()
	 * @generated
	 */
	void setSeat(int value);

} // Route
