/**
 */
package uber.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uber.Geolocation;
import uber.Rider;
import uber.RiderStatus;
import uber.Route;
import uber.UberPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uber.impl.RiderImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link uber.impl.RiderImpl#getLivePosition <em>Live Position</em>}</li>
 *   <li>{@link uber.impl.RiderImpl#getRoutes <em>Routes</em>}</li>
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UberPackage.RIDER__LIVE_POSITION, oldLivePosition, newLivePosition);
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
	public void setLivePosition(Geolocation newLivePosition) {
		if (newLivePosition != livePosition) {
			NotificationChain msgs = null;
			if (livePosition != null)
				msgs = ((InternalEObject) livePosition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UberPackage.RIDER__LIVE_POSITION, null, msgs);
			if (newLivePosition != null)
				msgs = ((InternalEObject) newLivePosition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UberPackage.RIDER__LIVE_POSITION, null, msgs);
			msgs = basicSetLivePosition(newLivePosition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UberPackage.RIDER__LIVE_POSITION, newLivePosition,
					newLivePosition));
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
		case UberPackage.RIDER__LIVE_POSITION:
			return basicSetLivePosition(null, msgs);
		case UberPackage.RIDER__ROUTES:
			return ((InternalEList<?>) getRoutes()).basicRemove(otherEnd, msgs);
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
		case UberPackage.RIDER__LIVE_POSITION:
			return getLivePosition();
		case UberPackage.RIDER__ROUTES:
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
		case UberPackage.RIDER__STATUS:
			setStatus((RiderStatus) newValue);
			return;
		case UberPackage.RIDER__LIVE_POSITION:
			setLivePosition((Geolocation) newValue);
			return;
		case UberPackage.RIDER__ROUTES:
			getRoutes().clear();
			getRoutes().addAll((Collection<? extends Route>) newValue);
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
		case UberPackage.RIDER__LIVE_POSITION:
			setLivePosition((Geolocation) null);
			return;
		case UberPackage.RIDER__ROUTES:
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
		case UberPackage.RIDER__STATUS:
			return status != STATUS_EDEFAULT;
		case UberPackage.RIDER__LIVE_POSITION:
			return livePosition != null;
		case UberPackage.RIDER__ROUTES:
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //RiderImpl
