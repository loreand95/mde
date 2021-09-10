/**
 */
package it.disim.loreand.mde.impl;

import it.disim.loreand.mde.Customer;
import it.disim.loreand.mde.MdePackage;
import it.disim.loreand.mde.Rider;
import it.disim.loreand.mde.Route;
import it.disim.loreand.mde.Uber;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uber</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.disim.loreand.mde.impl.UberImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.disim.loreand.mde.impl.UberImpl#getManager <em>Manager</em>}</li>
 *   <li>{@link it.disim.loreand.mde.impl.UberImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link it.disim.loreand.mde.impl.UberImpl#getCustomers <em>Customers</em>}</li>
 *   <li>{@link it.disim.loreand.mde.impl.UberImpl#getRiders <em>Riders</em>}</li>
 *   <li>{@link it.disim.loreand.mde.impl.UberImpl#getRoutes <em>Routes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UberImpl extends MinimalEObjectImpl.Container implements Uber {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getManager() <em>Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManager()
	 * @generated
	 * @ordered
	 */
	protected static final String MANAGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManager() <em>Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManager()
	 * @generated
	 * @ordered
	 */
	protected String manager = MANAGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustomers() <em>Customers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomers()
	 * @generated
	 * @ordered
	 */
	protected EList<Customer> customers;

	/**
	 * The cached value of the '{@link #getRiders() <em>Riders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiders()
	 * @generated
	 * @ordered
	 */
	protected EList<Rider> riders;

	/**
	 * The cached value of the '{@link #getRoutes() <em>Routes</em>}' containment reference list.
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
	protected UberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MdePackage.Literals.UBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdePackage.UBER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getManager() {
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManager(String newManager) {
		String oldManager = manager;
		manager = newManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdePackage.UBER__MANAGER, oldManager, manager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdePackage.UBER__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Customer> getCustomers() {
		if (customers == null) {
			customers = new EObjectContainmentEList<Customer>(Customer.class, this, MdePackage.UBER__CUSTOMERS);
		}
		return customers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rider> getRiders() {
		if (riders == null) {
			riders = new EObjectContainmentEList<Rider>(Rider.class, this, MdePackage.UBER__RIDERS);
		}
		return riders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Route> getRoutes() {
		if (routes == null) {
			routes = new EObjectContainmentEList<Route>(Route.class, this, MdePackage.UBER__ROUTES);
		}
		return routes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MdePackage.UBER__CUSTOMERS:
			return ((InternalEList<?>) getCustomers()).basicRemove(otherEnd, msgs);
		case MdePackage.UBER__RIDERS:
			return ((InternalEList<?>) getRiders()).basicRemove(otherEnd, msgs);
		case MdePackage.UBER__ROUTES:
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
		case MdePackage.UBER__NAME:
			return getName();
		case MdePackage.UBER__MANAGER:
			return getManager();
		case MdePackage.UBER__ADDRESS:
			return getAddress();
		case MdePackage.UBER__CUSTOMERS:
			return getCustomers();
		case MdePackage.UBER__RIDERS:
			return getRiders();
		case MdePackage.UBER__ROUTES:
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
		case MdePackage.UBER__NAME:
			setName((String) newValue);
			return;
		case MdePackage.UBER__MANAGER:
			setManager((String) newValue);
			return;
		case MdePackage.UBER__ADDRESS:
			setAddress((String) newValue);
			return;
		case MdePackage.UBER__CUSTOMERS:
			getCustomers().clear();
			getCustomers().addAll((Collection<? extends Customer>) newValue);
			return;
		case MdePackage.UBER__RIDERS:
			getRiders().clear();
			getRiders().addAll((Collection<? extends Rider>) newValue);
			return;
		case MdePackage.UBER__ROUTES:
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
		case MdePackage.UBER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MdePackage.UBER__MANAGER:
			setManager(MANAGER_EDEFAULT);
			return;
		case MdePackage.UBER__ADDRESS:
			setAddress(ADDRESS_EDEFAULT);
			return;
		case MdePackage.UBER__CUSTOMERS:
			getCustomers().clear();
			return;
		case MdePackage.UBER__RIDERS:
			getRiders().clear();
			return;
		case MdePackage.UBER__ROUTES:
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
		case MdePackage.UBER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MdePackage.UBER__MANAGER:
			return MANAGER_EDEFAULT == null ? manager != null : !MANAGER_EDEFAULT.equals(manager);
		case MdePackage.UBER__ADDRESS:
			return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
		case MdePackage.UBER__CUSTOMERS:
			return customers != null && !customers.isEmpty();
		case MdePackage.UBER__RIDERS:
			return riders != null && !riders.isEmpty();
		case MdePackage.UBER__ROUTES:
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
		result.append(" (name: ");
		result.append(name);
		result.append(", manager: ");
		result.append(manager);
		result.append(", address: ");
		result.append(address);
		result.append(')');
		return result.toString();
	}

} //UberImpl
