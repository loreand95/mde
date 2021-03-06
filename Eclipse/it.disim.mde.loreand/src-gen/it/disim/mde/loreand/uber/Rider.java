/**
 */
package it.disim.mde.loreand.uber;

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
 *   <li>{@link it.disim.mde.loreand.uber.Rider#getStatus <em>Status</em>}</li>
 *   <li>{@link it.disim.mde.loreand.uber.Rider#getLocation <em>Location</em>}</li>
 *   <li>{@link it.disim.mde.loreand.uber.Rider#getRoutes <em>Routes</em>}</li>
 *   <li>{@link it.disim.mde.loreand.uber.Rider#getCarriedOutRoutes <em>Carried Out Routes</em>}</li>
 *   <li>{@link it.disim.mde.loreand.uber.Rider#getScore <em>Score</em>}</li>
 *   <li>{@link it.disim.mde.loreand.uber.Rider#getCar <em>Car</em>}</li>
 * </ul>
 *
 * @see it.disim.mde.loreand.uber.UberPackage#getRider()
 * @model
 * @generated
 */
public interface Rider extends User {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link it.disim.mde.loreand.uber.RiderStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see it.disim.mde.loreand.uber.RiderStatus
	 * @see #setStatus(RiderStatus)
	 * @see it.disim.mde.loreand.uber.UberPackage#getRider_Status()
	 * @model required="true"
	 * @generated
	 */
	RiderStatus getStatus();

	/**
	 * Sets the value of the '{@link it.disim.mde.loreand.uber.Rider#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see it.disim.mde.loreand.uber.RiderStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(RiderStatus value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Geolocation)
	 * @see it.disim.mde.loreand.uber.UberPackage#getRider_Location()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Geolocation getLocation();

	/**
	 * Sets the value of the '{@link it.disim.mde.loreand.uber.Rider#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Geolocation value);

	/**
	 * Returns the value of the '<em><b>Routes</b></em>' reference list.
	 * The list contents are of type {@link it.disim.mde.loreand.uber.Route}.
	 * It is bidirectional and its opposite is '{@link it.disim.mde.loreand.uber.Route#getRider <em>Rider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routes</em>' reference list.
	 * @see it.disim.mde.loreand.uber.UberPackage#getRider_Routes()
	 * @see it.disim.mde.loreand.uber.Route#getRider
	 * @model opposite="rider"
	 * @generated
	 */
	EList<Route> getRoutes();

	/**
	 * Returns the value of the '<em><b>Carried Out Routes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carried Out Routes</em>' attribute.
	 * @see #setCarriedOutRoutes(int)
	 * @see it.disim.mde.loreand.uber.UberPackage#getRider_CarriedOutRoutes()
	 * @model required="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='Route.allInstances()-&gt;select(rider=self)-&gt;size()'"
	 * @generated
	 */
	int getCarriedOutRoutes();

	/**
	 * Sets the value of the '{@link it.disim.mde.loreand.uber.Rider#getCarriedOutRoutes <em>Carried Out Routes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carried Out Routes</em>' attribute.
	 * @see #getCarriedOutRoutes()
	 * @generated
	 */
	void setCarriedOutRoutes(int value);

	/**
	 * Returns the value of the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score</em>' attribute.
	 * @see #setScore(double)
	 * @see it.disim.mde.loreand.uber.UberPackage#getRider_Score()
	 * @model required="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='Route.allInstances()-&gt;select(rider=self).feedback -&gt;sum() / (self.CarriedOutRoutes +1)'"
	 * @generated
	 */
	double getScore();

	/**
	 * Sets the value of the '{@link it.disim.mde.loreand.uber.Rider#getScore <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' attribute.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(double value);

	/**
	 * Returns the value of the '<em><b>Car</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Car</em>' containment reference.
	 * @see #setCar(Car)
	 * @see it.disim.mde.loreand.uber.UberPackage#getRider_Car()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Car getCar();

	/**
	 * Sets the value of the '{@link it.disim.mde.loreand.uber.Rider#getCar <em>Car</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Car</em>' containment reference.
	 * @see #getCar()
	 * @generated
	 */
	void setCar(Car value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Route.allInstances()-&gt;select(rider=self).seats -&gt;sum()'"
	 * @generated
	 */
	int CarriedOutCustomers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.score &gt;= 6'"
	 * @generated
	 */
	boolean isGoodEmployee();

} // Rider
