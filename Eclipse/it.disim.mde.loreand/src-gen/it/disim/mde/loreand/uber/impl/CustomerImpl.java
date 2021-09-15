/**
 */
package it.disim.mde.loreand.uber.impl;

import it.disim.mde.loreand.uber.CardID;
import it.disim.mde.loreand.uber.Customer;
import it.disim.mde.loreand.uber.CustomerStatus;
import it.disim.mde.loreand.uber.Route;
import it.disim.mde.loreand.uber.UberPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.disim.mde.loreand.uber.impl.CustomerImpl#getSubscriptionDate <em>Subscription Date</em>}</li>
 *   <li>{@link it.disim.mde.loreand.uber.impl.CustomerImpl#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link it.disim.mde.loreand.uber.impl.CustomerImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link it.disim.mde.loreand.uber.impl.CustomerImpl#getRoutes <em>Routes</em>}</li>
 *   <li>{@link it.disim.mde.loreand.uber.impl.CustomerImpl#getCardID <em>Card ID</em>}</li>
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
	 * The cached value of the '{@link #getCardID() <em>Card ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardID()
	 * @generated
	 * @ordered
	 */
	protected CardID cardID;

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
			eNotify(new ENotificationImpl(this, Notification.SET, UberPackage.CUSTOMER__SUBSCRIPTION_DATE,
					oldSubscriptionDate, subscriptionDate));
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
	public CardID getCardID() {
		return cardID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCardID(CardID newCardID, NotificationChain msgs) {
		CardID oldCardID = cardID;
		cardID = newCardID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UberPackage.CUSTOMER__CARD_ID, oldCardID, newCardID);
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
	public void setCardID(CardID newCardID) {
		if (newCardID != cardID) {
			NotificationChain msgs = null;
			if (cardID != null)
				msgs = ((InternalEObject) cardID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UberPackage.CUSTOMER__CARD_ID, null, msgs);
			if (newCardID != null)
				msgs = ((InternalEObject) newCardID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UberPackage.CUSTOMER__CARD_ID, null, msgs);
			msgs = basicSetCardID(newCardID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UberPackage.CUSTOMER__CARD_ID, newCardID, newCardID));
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
		case UberPackage.CUSTOMER__CARD_ID:
			return basicSetCardID(null, msgs);
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
		case UberPackage.CUSTOMER__CARD_ID:
			return getCardID();
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
			setSubscriptionDate((String) newValue);
			return;
		case UberPackage.CUSTOMER__EXPIRATION_DATE:
			setExpirationDate((String) newValue);
			return;
		case UberPackage.CUSTOMER__STATUS:
			setStatus((CustomerStatus) newValue);
			return;
		case UberPackage.CUSTOMER__ROUTES:
			getRoutes().clear();
			getRoutes().addAll((Collection<? extends Route>) newValue);
			return;
		case UberPackage.CUSTOMER__CARD_ID:
			setCardID((CardID) newValue);
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
		case UberPackage.CUSTOMER__CARD_ID:
			setCardID((CardID) null);
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
		case UberPackage.CUSTOMER__CARD_ID:
			return cardID != null;
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
