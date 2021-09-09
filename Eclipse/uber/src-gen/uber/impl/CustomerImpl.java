/**
 */
package uber.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uber.Customer;
import uber.CustomerStatus;
import uber.Route;
import uber.UberPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uber.impl.CustomerImpl#getSubscriptionDate <em>Subscription Date</em>}</li>
 *   <li>{@link uber.impl.CustomerImpl#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link uber.impl.CustomerImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link uber.impl.CustomerImpl#getRoutes <em>Routes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerImpl extends UserImpl implements Customer {
	/**
	 * The default value of the '{@link #getSubscriptionDate() <em>Subscription Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date SUBSCRIPTION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubscriptionDate() <em>Subscription Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionDate()
	 * @generated
	 * @ordered
	 */
	protected Date subscriptionDate = SUBSCRIPTION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date EXPIRATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected Date expirationDate = EXPIRATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final CustomerStatus STATUS_EDEFAULT = CustomerStatus.PENDING;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected CustomerStatus status = STATUS_EDEFAULT;

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
	protected CustomerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UberPackage.Literals.CUSTOMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getSubscriptionDate() {
		return subscriptionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriptionDate(Date newSubscriptionDate) {
		Date oldSubscriptionDate = subscriptionDate;
		subscriptionDate = newSubscriptionDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UberPackage.CUSTOMER__SUBSCRIPTION_DATE,
					oldSubscriptionDate, subscriptionDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getExpirationDate() {
		return expirationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpirationDate(Date newExpirationDate) {
		Date oldExpirationDate = expirationDate;
		expirationDate = newExpirationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UberPackage.CUSTOMER__EXPIRATION_DATE,
					oldExpirationDate, expirationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(CustomerStatus newStatus) {
		CustomerStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UberPackage.CUSTOMER__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Route> getRoutes() {
		if (routes == null) {
			routes = new EObjectWithInverseResolvingEList<Route>(Route.class, this, UberPackage.CUSTOMER__ROUTES,
					UberPackage.ROUTE__CUSTOMER);
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
		case UberPackage.CUSTOMER__ROUTES:
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
		case UberPackage.CUSTOMER__ROUTES:
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
		case UberPackage.CUSTOMER__SUBSCRIPTION_DATE:
			return getSubscriptionDate();
		case UberPackage.CUSTOMER__EXPIRATION_DATE:
			return getExpirationDate();
		case UberPackage.CUSTOMER__STATUS:
			return getStatus();
		case UberPackage.CUSTOMER__ROUTES:
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
		case UberPackage.CUSTOMER__SUBSCRIPTION_DATE:
			setSubscriptionDate((Date) newValue);
			return;
		case UberPackage.CUSTOMER__EXPIRATION_DATE:
			setExpirationDate((Date) newValue);
			return;
		case UberPackage.CUSTOMER__STATUS:
			setStatus((CustomerStatus) newValue);
			return;
		case UberPackage.CUSTOMER__ROUTES:
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
		case UberPackage.CUSTOMER__SUBSCRIPTION_DATE:
			setSubscriptionDate(SUBSCRIPTION_DATE_EDEFAULT);
			return;
		case UberPackage.CUSTOMER__EXPIRATION_DATE:
			setExpirationDate(EXPIRATION_DATE_EDEFAULT);
			return;
		case UberPackage.CUSTOMER__STATUS:
			setStatus(STATUS_EDEFAULT);
			return;
		case UberPackage.CUSTOMER__ROUTES:
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
		case UberPackage.CUSTOMER__SUBSCRIPTION_DATE:
			return SUBSCRIPTION_DATE_EDEFAULT == null ? subscriptionDate != null
					: !SUBSCRIPTION_DATE_EDEFAULT.equals(subscriptionDate);
		case UberPackage.CUSTOMER__EXPIRATION_DATE:
			return EXPIRATION_DATE_EDEFAULT == null ? expirationDate != null
					: !EXPIRATION_DATE_EDEFAULT.equals(expirationDate);
		case UberPackage.CUSTOMER__STATUS:
			return status != STATUS_EDEFAULT;
		case UberPackage.CUSTOMER__ROUTES:
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
		result.append(" (subscriptionDate: ");
		result.append(subscriptionDate);
		result.append(", expirationDate: ");
		result.append(expirationDate);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //CustomerImpl
