/**
 */
package it.disim.loreand.mde;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.disim.loreand.mde.Route#getPrice <em>Price</em>}</li>
 *   <li>{@link it.disim.loreand.mde.Route#getDate <em>Date</em>}</li>
 *   <li>{@link it.disim.loreand.mde.Route#getStartAddress <em>Start Address</em>}</li>
 *   <li>{@link it.disim.loreand.mde.Route#getEndAddress <em>End Address</em>}</li>
 *   <li>{@link it.disim.loreand.mde.Route#getFeedback <em>Feedback</em>}</li>
 *   <li>{@link it.disim.loreand.mde.Route#getStatus <em>Status</em>}</li>
 *   <li>{@link it.disim.loreand.mde.Route#getCustomer <em>Customer</em>}</li>
 *   <li>{@link it.disim.loreand.mde.Route#getRider <em>Rider</em>}</li>
 *   <li>{@link it.disim.loreand.mde.Route#getSeats <em>Seats</em>}</li>
 * </ul>
 *
 * @see it.disim.loreand.mde.MdePackage#getRoute()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MaxSeats MaxPrice MinPrice Reviwed'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot MaxSeats='self.seats &lt;= 4' MaxPrice='self.price &lt;= 100' MinPrice='self.price &gt;= 1' Reviwed='self.status = RouteStatus::DONE or (self.feedback = 0 and self.status &lt;&gt; RouteStatus::DONE)'"
 * @generated
 */
public interface Route extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(double)
	 * @see it.disim.loreand.mde.MdePackage#getRoute_Price()
	 * @model required="true"
	 * @generated
	 */
	double getPrice();

	/**
	 * Sets the value of the '{@link it.disim.loreand.mde.Route#getPrice <em>Price</em>}' attribute.
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
	 * @see #setDate(Date)
	 * @see it.disim.loreand.mde.MdePackage#getRoute_Date()
	 * @model required="true"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link it.disim.loreand.mde.Route#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Start Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Address</em>' attribute.
	 * @see #setStartAddress(String)
	 * @see it.disim.loreand.mde.MdePackage#getRoute_StartAddress()
	 * @model required="true"
	 * @generated
	 */
	String getStartAddress();

	/**
	 * Sets the value of the '{@link it.disim.loreand.mde.Route#getStartAddress <em>Start Address</em>}' attribute.
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
	 * @see it.disim.loreand.mde.MdePackage#getRoute_EndAddress()
	 * @model required="true"
	 * @generated
	 */
	String getEndAddress();

	/**
	 * Sets the value of the '{@link it.disim.loreand.mde.Route#getEndAddress <em>End Address</em>}' attribute.
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
	 * @see it.disim.loreand.mde.MdePackage#getRoute_Feedback()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getFeedback();

	/**
	 * Sets the value of the '{@link it.disim.loreand.mde.Route#getFeedback <em>Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feedback</em>' attribute.
	 * @see #getFeedback()
	 * @generated
	 */
	void setFeedback(int value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link it.disim.loreand.mde.RouteStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see it.disim.loreand.mde.RouteStatus
	 * @see #setStatus(RouteStatus)
	 * @see it.disim.loreand.mde.MdePackage#getRoute_Status()
	 * @model required="true"
	 * @generated
	 */
	RouteStatus getStatus();

	/**
	 * Sets the value of the '{@link it.disim.loreand.mde.Route#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see it.disim.loreand.mde.RouteStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(RouteStatus value);

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link it.disim.loreand.mde.Customer#getRoutes <em>Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference.
	 * @see #setCustomer(Customer)
	 * @see it.disim.loreand.mde.MdePackage#getRoute_Customer()
	 * @see it.disim.loreand.mde.Customer#getRoutes
	 * @model opposite="routes" required="true"
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link it.disim.loreand.mde.Route#getCustomer <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(Customer value);

	/**
	 * Returns the value of the '<em><b>Rider</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link it.disim.loreand.mde.Rider#getRoutes <em>Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rider</em>' reference.
	 * @see #setRider(Rider)
	 * @see it.disim.loreand.mde.MdePackage#getRoute_Rider()
	 * @see it.disim.loreand.mde.Rider#getRoutes
	 * @model opposite="routes" required="true"
	 * @generated
	 */
	Rider getRider();

	/**
	 * Sets the value of the '{@link it.disim.loreand.mde.Route#getRider <em>Rider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rider</em>' reference.
	 * @see #getRider()
	 * @generated
	 */
	void setRider(Rider value);

	/**
	 * Returns the value of the '<em><b>Seats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seats</em>' attribute.
	 * @see #setSeats(int)
	 * @see it.disim.loreand.mde.MdePackage#getRoute_Seats()
	 * @model required="true"
	 * @generated
	 */
	int getSeats();

	/**
	 * Sets the value of the '{@link it.disim.loreand.mde.Route#getSeats <em>Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seats</em>' attribute.
	 * @see #getSeats()
	 * @generated
	 */
	void setSeats(int value);

} // Route
