/**
 */
package taxi.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import taxi.Geolocation;
import taxi.Rider;
import taxi.RiderStatus;
import taxi.Route;
import taxi.TaxiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link taxi.impl.RiderImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link taxi.impl.RiderImpl#getLivePosition <em>Live Position</em>}</li>
 *   <li>{@link taxi.impl.RiderImpl#getRoutes <em>Routes</em>}</li>
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
	 * The cached value of the '{@link #getLivePosition() <em>Live Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLivePosition()
	 * @generated
	 * @ordered
	 */
	protected Geolocation livePosition;

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
		return TaxiPackage.Literals.RIDER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TaxiPackage.RIDER__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geolocation getLivePosition() {
		return livePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLivePosition(Geolocation newLivePosition, NotificationChain msgs) {
		Geolocation oldLivePosition = livePosition;
		livePosition = newLivePosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaxiPackage.RIDER__LIVE_POSITION, oldLivePosition, newLivePosition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLivePosition(Geolocation newLivePosition) {
		if (newLivePosition != livePosition) {
			NotificationChain msgs = null;
			if (livePosition != null)
				msgs = ((InternalEObject)livePosition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TaxiPackage.RIDER__LIVE_POSITION, null, msgs);
			if (newLivePosition != null)
				msgs = ((InternalEObject)newLivePosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TaxiPackage.RIDER__LIVE_POSITION, null, msgs);
			msgs = basicSetLivePosition(newLivePosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxiPackage.RIDER__LIVE_POSITION, newLivePosition, newLivePosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Route> getRoutes() {
		if (routes == null) {
			routes = new EObjectWithInverseResolvingEList<Route>(Route.class, this, TaxiPackage.RIDER__ROUTES, TaxiPackage.ROUTE__RIDER);
		}
		return routes;
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
			case TaxiPackage.RIDER__ROUTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoutes()).basicAdd(otherEnd, msgs);
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
			case TaxiPackage.RIDER__LIVE_POSITION:
				return basicSetLivePosition(null, msgs);
			case TaxiPackage.RIDER__ROUTES:
				return ((InternalEList<?>)getRoutes()).basicRemove(otherEnd, msgs);
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
			case TaxiPackage.RIDER__STATUS:
				return getStatus();
			case TaxiPackage.RIDER__LIVE_POSITION:
				return getLivePosition();
			case TaxiPackage.RIDER__ROUTES:
				return getRoutes();
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
			case TaxiPackage.RIDER__STATUS:
				setStatus((RiderStatus)newValue);
				return;
			case TaxiPackage.RIDER__LIVE_POSITION:
				setLivePosition((Geolocation)newValue);
				return;
			case TaxiPackage.RIDER__ROUTES:
				getRoutes().clear();
				getRoutes().addAll((Collection<? extends Route>)newValue);
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
			case TaxiPackage.RIDER__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case TaxiPackage.RIDER__LIVE_POSITION:
				setLivePosition((Geolocation)null);
				return;
			case TaxiPackage.RIDER__ROUTES:
				getRoutes().clear();
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
			case TaxiPackage.RIDER__STATUS:
				return status != STATUS_EDEFAULT;
			case TaxiPackage.RIDER__LIVE_POSITION:
				return livePosition != null;
			case TaxiPackage.RIDER__ROUTES:
				return routes != null && !routes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //RiderImpl
