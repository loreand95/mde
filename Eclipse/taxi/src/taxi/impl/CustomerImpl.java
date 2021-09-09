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

import taxi.Customer;
import taxi.CustomerStatus;
import taxi.Route;
import taxi.TaxiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link taxi.impl.CustomerImpl#getSubscriptionDate <em>Subscription Date</em>}</li>
 *   <li>{@link taxi.impl.CustomerImpl#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link taxi.impl.CustomerImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link taxi.impl.CustomerImpl#getRoutes <em>Routes</em>}</li>
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
	protected static final String SUBSCRIPTION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubscriptionDate() <em>Subscription Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionDate()
	 * @generated
	 * @ordered
	 */
	protected String subscriptionDate = SUBSCRIPTION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPIRATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected String expirationDate = EXPIRATION_DATE_EDEFAULT;

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
		return TaxiPackage.Literals.CUSTOMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubscriptionDate() {
		return subscriptionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriptionDate(String newSubscriptionDate) {
		String oldSubscriptionDate = subscriptionDate;
		subscriptionDate = newSubscriptionDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxiPackage.CUSTOMER__SUBSCRIPTION_DATE, oldSubscriptionDate, subscriptionDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpirationDate() {
		return expirationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpirationDate(String newExpirationDate) {
		String oldExpirationDate = expirationDate;
		expirationDate = newExpirationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxiPackage.CUSTOMER__EXPIRATION_DATE, oldExpirationDate, expirationDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TaxiPackage.CUSTOMER__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Route> getRoutes() {
		if (routes == null) {
			routes = new EObjectWithInverseResolvingEList<Route>(Route.class, this, TaxiPackage.CUSTOMER__ROUTES, TaxiPackage.ROUTE__CUSTOMER);
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
			case TaxiPackage.CUSTOMER__ROUTES:
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
			case TaxiPackage.CUSTOMER__ROUTES:
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
			case TaxiPackage.CUSTOMER__SUBSCRIPTION_DATE:
				return getSubscriptionDate();
			case TaxiPackage.CUSTOMER__EXPIRATION_DATE:
				return getExpirationDate();
			case TaxiPackage.CUSTOMER__STATUS:
				return getStatus();
			case TaxiPackage.CUSTOMER__ROUTES:
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
			case TaxiPackage.CUSTOMER__SUBSCRIPTION_DATE:
				setSubscriptionDate((String)newValue);
				return;
			case TaxiPackage.CUSTOMER__EXPIRATION_DATE:
				setExpirationDate((String)newValue);
				return;
			case TaxiPackage.CUSTOMER__STATUS:
				setStatus((CustomerStatus)newValue);
				return;
			case TaxiPackage.CUSTOMER__ROUTES:
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
			case TaxiPackage.CUSTOMER__SUBSCRIPTION_DATE:
				setSubscriptionDate(SUBSCRIPTION_DATE_EDEFAULT);
				return;
			case TaxiPackage.CUSTOMER__EXPIRATION_DATE:
				setExpirationDate(EXPIRATION_DATE_EDEFAULT);
				return;
			case TaxiPackage.CUSTOMER__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case TaxiPackage.CUSTOMER__ROUTES:
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
			case TaxiPackage.CUSTOMER__SUBSCRIPTION_DATE:
				return SUBSCRIPTION_DATE_EDEFAULT == null ? subscriptionDate != null : !SUBSCRIPTION_DATE_EDEFAULT.equals(subscriptionDate);
			case TaxiPackage.CUSTOMER__EXPIRATION_DATE:
				return EXPIRATION_DATE_EDEFAULT == null ? expirationDate != null : !EXPIRATION_DATE_EDEFAULT.equals(expirationDate);
			case TaxiPackage.CUSTOMER__STATUS:
				return status != STATUS_EDEFAULT;
			case TaxiPackage.CUSTOMER__ROUTES:
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
