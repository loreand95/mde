/**
 */
package it.disim.mde.loreand.uber.impl;

import it.disim.mde.loreand.uber.Car;
import it.disim.mde.loreand.uber.Geolocation;
import it.disim.mde.loreand.uber.Rider;
import it.disim.mde.loreand.uber.RiderStatus;
import it.disim.mde.loreand.uber.Route;
import it.disim.mde.loreand.uber.UberPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.disim.mde.loreand.uber.impl.RiderImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link it.disim.mde.loreand.uber.impl.RiderImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link it.disim.mde.loreand.uber.impl.RiderImpl#getRoutes <em>Routes</em>}</li>
 *   <li>{@link it.disim.mde.loreand.uber.impl.RiderImpl#getCarriedOutRoutes <em>Carried Out Routes</em>}</li>
 *   <li>{@link it.disim.mde.loreand.uber.impl.RiderImpl#getScore <em>Score</em>}</li>
 *   <li>{@link it.disim.mde.loreand.uber.impl.RiderImpl#getCar <em>Car</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RiderImpl extends UserImpl implements Rider {
	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final RiderStatus STATUS_EDEFAULT = RiderStatus.AVAILABLE;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected RiderStatus status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Geolocation location;

	/**
	 * The cached value of the '{@link #getRoutes() <em>Routes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutes()
	 * @generated
	 * @ordered
	 */
	protected EList<Route> routes;

	/**
	 * The cached setting delegate for the '{@link #getCarriedOutRoutes() <em>Carried Out Routes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarriedOutRoutes()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CARRIED_OUT_ROUTES__ESETTING_DELEGATE = ((EStructuralFeature.Internal) UberPackage.Literals.RIDER__CARRIED_OUT_ROUTES)
			.getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getScore() <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SCORE__ESETTING_DELEGATE = ((EStructuralFeature.Internal) UberPackage.Literals.RIDER__SCORE)
			.getSettingDelegate();

	/**
	 * The cached value of the '{@link #getCar() <em>Car</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCar()
	 * @generated
	 * @ordered
	 */
	protected Car car;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RiderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UberPackage.Literals.RIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiderStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(RiderStatus newStatus) {
		RiderStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UberPackage.RIDER__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geolocation getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Geolocation newLocation, NotificationChain msgs) {
		Geolocation oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UberPackage.RIDER__LOCATION,
					oldLocation, newLocation);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Geolocation newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject) location).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UberPackage.RIDER__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject) newLocation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UberPackage.RIDER__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UberPackage.RIDER__LOCATION, newLocation,
					newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Route> getRoutes() {
		if (routes == null) {
			routes = new EObjectWithInverseResolvingEList<Route>(Route.class, this, UberPackage.RIDER__ROUTES,
					UberPackage.ROUTE__RIDER);
		}
		return routes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCarriedOutRoutes() {
		return (Integer) CARRIED_OUT_ROUTES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarriedOutRoutes(int newCarriedOutRoutes) {
		CARRIED_OUT_ROUTES__ESETTING_DELEGATE.dynamicSet(this, null, 0, newCarriedOutRoutes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getScore() {
		return (Double) SCORE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScore(double newScore) {
		SCORE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newScore);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Car getCar() {
		return car;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCar(Car newCar, NotificationChain msgs) {
		Car oldCar = car;
		car = newCar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UberPackage.RIDER__CAR,
					oldCar, newCar);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCar(Car newCar) {
		if (newCar != car) {
			NotificationChain msgs = null;
			if (car != null)
				msgs = ((InternalEObject) car).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UberPackage.RIDER__CAR,
						null, msgs);
			if (newCar != null)
				msgs = ((InternalEObject) newCar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UberPackage.RIDER__CAR,
						null, msgs);
			msgs = basicSetCar(newCar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UberPackage.RIDER__CAR, newCar, newCar));
	}

	/**
	 * The cached invocation delegate for the '{@link #CarriedOutCustomers() <em>Carried Out Customers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CarriedOutCustomers()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate CARRIED_OUT_CUSTOMERS__EINVOCATION_DELEGATE = ((EOperation.Internal) UberPackage.Literals.RIDER___CARRIED_OUT_CUSTOMERS)
			.getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int CarriedOutCustomers() {
		try {
			return (Integer) CARRIED_OUT_CUSTOMERS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		} catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isGoodEmployee() <em>Is Good Employee</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGoodEmployee()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_GOOD_EMPLOYEE__EINVOCATION_DELEGATE = ((EOperation.Internal) UberPackage.Literals.RIDER___IS_GOOD_EMPLOYEE)
			.getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGoodEmployee() {
		try {
			return (Boolean) IS_GOOD_EMPLOYEE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		} catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UberPackage.RIDER__ROUTES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRoutes()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UberPackage.RIDER__LOCATION:
			return basicSetLocation(null, msgs);
		case UberPackage.RIDER__ROUTES:
			return ((InternalEList<?>) getRoutes()).basicRemove(otherEnd, msgs);
		case UberPackage.RIDER__CAR:
			return basicSetCar(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UberPackage.RIDER__STATUS:
			return getStatus();
		case UberPackage.RIDER__LOCATION:
			return getLocation();
		case UberPackage.RIDER__ROUTES:
			return getRoutes();
		case UberPackage.RIDER__CARRIED_OUT_ROUTES:
			return getCarriedOutRoutes();
		case UberPackage.RIDER__SCORE:
			return getScore();
		case UberPackage.RIDER__CAR:
			return getCar();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case UberPackage.RIDER__STATUS:
			setStatus((RiderStatus) newValue);
			return;
		case UberPackage.RIDER__LOCATION:
			setLocation((Geolocation) newValue);
			return;
		case UberPackage.RIDER__ROUTES:
			getRoutes().clear();
			getRoutes().addAll((Collection<? extends Route>) newValue);
			return;
		case UberPackage.RIDER__CARRIED_OUT_ROUTES:
			setCarriedOutRoutes((Integer) newValue);
			return;
		case UberPackage.RIDER__SCORE:
			setScore((Double) newValue);
			return;
		case UberPackage.RIDER__CAR:
			setCar((Car) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case UberPackage.RIDER__STATUS:
			setStatus(STATUS_EDEFAULT);
			return;
		case UberPackage.RIDER__LOCATION:
			setLocation((Geolocation) null);
			return;
		case UberPackage.RIDER__ROUTES:
			getRoutes().clear();
			return;
		case UberPackage.RIDER__CARRIED_OUT_ROUTES:
			CARRIED_OUT_ROUTES__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
			return;
		case UberPackage.RIDER__SCORE:
			SCORE__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
			return;
		case UberPackage.RIDER__CAR:
			setCar((Car) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case UberPackage.RIDER__STATUS:
			return status != STATUS_EDEFAULT;
		case UberPackage.RIDER__LOCATION:
			return location != null;
		case UberPackage.RIDER__ROUTES:
			return routes != null && !routes.isEmpty();
		case UberPackage.RIDER__CARRIED_OUT_ROUTES:
			return CARRIED_OUT_ROUTES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		case UberPackage.RIDER__SCORE:
			return SCORE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		case UberPackage.RIDER__CAR:
			return car != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case UberPackage.RIDER___CARRIED_OUT_CUSTOMERS:
			return CarriedOutCustomers();
		case UberPackage.RIDER___IS_GOOD_EMPLOYEE:
			return isGoodEmployee();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //RiderImpl
