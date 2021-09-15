/**
 */
package it.disim.mde.loreand.uber.impl;

import it.disim.mde.loreand.uber.Customer;
import it.disim.mde.loreand.uber.Rider;
import it.disim.mde.loreand.uber.Route;
import it.disim.mde.loreand.uber.Supervisor;
import it.disim.mde.loreand.uber.Uber;
import it.disim.mde.loreand.uber.UberPackage;

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
 *   <li>{@link it.disim.mde.loreand.uber.impl.UberImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.disim.mde.loreand.uber.impl.UberImpl#getManager <em>Manager</em>}</li>
 *   <li>{@link it.disim.mde.loreand.uber.impl.UberImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link it.disim.mde.loreand.uber.impl.UberImpl#getCustomers <em>Customers</em>}</li>
 *   <li>{@link it.disim.mde.loreand.uber.impl.UberImpl#getRiders <em>Riders</em>}</li>
 *   <li>{@link it.disim.mde.loreand.uber.impl.UberImpl#getRoutes <em>Routes</em>}</li>
 *   <li>{@link it.disim.mde.loreand.uber.impl.UberImpl#getSupervisors <em>Supervisors</em>}</li>
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
	 * The cached value of the '{@link #getSupervisors() <em>Supervisors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupervisors()
	 * @generated
	 * @ordered
	 */
	protected EList<Supervisor> supervisors;

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
		return UberPackage.Literals.UBER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UberPackage.UBER__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UberPackage.UBER__MANAGER, oldManager, manager));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UberPackage.UBER__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Customer> getCustomers() {
		if (customers == null) {
			customers = new EObjectContainmentEList<Customer>(Customer.class, this, UberPackage.UBER__CUSTOMERS);
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
			riders = new EObjectContainmentEList<Rider>(Rider.class, this, UberPackage.UBER__RIDERS);
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
			routes = new EObjectContainmentEList<Route>(Route.class, this, UberPackage.UBER__ROUTES);
		}
		return routes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Supervisor> getSupervisors() {
		if (supervisors == null) {
			supervisors = new EObjectContainmentEList<Supervisor>(Supervisor.class, this,
					UberPackage.UBER__SUPERVISORS);
		}
		return supervisors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UberPackage.UBER__CUSTOMERS:
			return ((InternalEList<?>) getCustomers()).basicRemove(otherEnd, msgs);
		case UberPackage.UBER__RIDERS:
			return ((InternalEList<?>) getRiders()).basicRemove(otherEnd, msgs);
		case UberPackage.UBER__ROUTES:
			return ((InternalEList<?>) getRoutes()).basicRemove(otherEnd, msgs);
		case UberPackage.UBER__SUPERVISORS:
			return ((InternalEList<?>) getSupervisors()).basicRemove(otherEnd, msgs);
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
		case UberPackage.UBER__NAME:
			return getName();
		case UberPackage.UBER__MANAGER:
			return getManager();
		case UberPackage.UBER__ADDRESS:
			return getAddress();
		case UberPackage.UBER__CUSTOMERS:
			return getCustomers();
		case UberPackage.UBER__RIDERS:
			return getRiders();
		case UberPackage.UBER__ROUTES:
			return getRoutes();
		case UberPackage.UBER__SUPERVISORS:
			return getSupervisors();
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
		case UberPackage.UBER__NAME:
			setName((String) newValue);
			return;
		case UberPackage.UBER__MANAGER:
			setManager((String) newValue);
			return;
		case UberPackage.UBER__ADDRESS:
			setAddress((String) newValue);
			return;
		case UberPackage.UBER__CUSTOMERS:
			getCustomers().clear();
			getCustomers().addAll((Collection<? extends Customer>) newValue);
			return;
		case UberPackage.UBER__RIDERS:
			getRiders().clear();
			getRiders().addAll((Collection<? extends Rider>) newValue);
			return;
		case UberPackage.UBER__ROUTES:
			getRoutes().clear();
			getRoutes().addAll((Collection<? extends Route>) newValue);
			return;
		case UberPackage.UBER__SUPERVISORS:
			getSupervisors().clear();
			getSupervisors().addAll((Collection<? extends Supervisor>) newValue);
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
		case UberPackage.UBER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case UberPackage.UBER__MANAGER:
			setManager(MANAGER_EDEFAULT);
			return;
		case UberPackage.UBER__ADDRESS:
			setAddress(ADDRESS_EDEFAULT);
			return;
		case UberPackage.UBER__CUSTOMERS:
			getCustomers().clear();
			return;
		case UberPackage.UBER__RIDERS:
			getRiders().clear();
			return;
		case UberPackage.UBER__ROUTES:
			getRoutes().clear();
			return;
		case UberPackage.UBER__SUPERVISORS:
			getSupervisors().clear();
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
		case UberPackage.UBER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case UberPackage.UBER__MANAGER:
			return MANAGER_EDEFAULT == null ? manager != null : !MANAGER_EDEFAULT.equals(manager);
		case UberPackage.UBER__ADDRESS:
			return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
		case UberPackage.UBER__CUSTOMERS:
			return customers != null && !customers.isEmpty();
		case UberPackage.UBER__RIDERS:
			return riders != null && !riders.isEmpty();
		case UberPackage.UBER__ROUTES:
			return routes != null && !routes.isEmpty();
		case UberPackage.UBER__SUPERVISORS:
			return supervisors != null && !supervisors.isEmpty();
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
