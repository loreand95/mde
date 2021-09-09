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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import taxi.Company;
import taxi.Customer;
import taxi.Rider;
import taxi.Route;
import taxi.TaxiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Company</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link taxi.impl.CompanyImpl#getName <em>Name</em>}</li>
 *   <li>{@link taxi.impl.CompanyImpl#getManager <em>Manager</em>}</li>
 *   <li>{@link taxi.impl.CompanyImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link taxi.impl.CompanyImpl#getCustomers <em>Customers</em>}</li>
 *   <li>{@link taxi.impl.CompanyImpl#getRiders <em>Riders</em>}</li>
 *   <li>{@link taxi.impl.CompanyImpl#getRoutes <em>Routes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompanyImpl extends MinimalEObjectImpl.Container implements Company {
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
	protected CompanyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxiPackage.Literals.COMPANY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TaxiPackage.COMPANY__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TaxiPackage.COMPANY__MANAGER, oldManager, manager));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TaxiPackage.COMPANY__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Customer> getCustomers() {
		if (customers == null) {
			customers = new EObjectContainmentEList<Customer>(Customer.class, this, TaxiPackage.COMPANY__CUSTOMERS);
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
			riders = new EObjectContainmentEList<Rider>(Rider.class, this, TaxiPackage.COMPANY__RIDERS);
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
			routes = new EObjectContainmentEList<Route>(Route.class, this, TaxiPackage.COMPANY__ROUTES);
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
			case TaxiPackage.COMPANY__CUSTOMERS:
				return ((InternalEList<?>)getCustomers()).basicRemove(otherEnd, msgs);
			case TaxiPackage.COMPANY__RIDERS:
				return ((InternalEList<?>)getRiders()).basicRemove(otherEnd, msgs);
			case TaxiPackage.COMPANY__ROUTES:
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
			case TaxiPackage.COMPANY__NAME:
				return getName();
			case TaxiPackage.COMPANY__MANAGER:
				return getManager();
			case TaxiPackage.COMPANY__ADDRESS:
				return getAddress();
			case TaxiPackage.COMPANY__CUSTOMERS:
				return getCustomers();
			case TaxiPackage.COMPANY__RIDERS:
				return getRiders();
			case TaxiPackage.COMPANY__ROUTES:
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
			case TaxiPackage.COMPANY__NAME:
				setName((String)newValue);
				return;
			case TaxiPackage.COMPANY__MANAGER:
				setManager((String)newValue);
				return;
			case TaxiPackage.COMPANY__ADDRESS:
				setAddress((String)newValue);
				return;
			case TaxiPackage.COMPANY__CUSTOMERS:
				getCustomers().clear();
				getCustomers().addAll((Collection<? extends Customer>)newValue);
				return;
			case TaxiPackage.COMPANY__RIDERS:
				getRiders().clear();
				getRiders().addAll((Collection<? extends Rider>)newValue);
				return;
			case TaxiPackage.COMPANY__ROUTES:
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
			case TaxiPackage.COMPANY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TaxiPackage.COMPANY__MANAGER:
				setManager(MANAGER_EDEFAULT);
				return;
			case TaxiPackage.COMPANY__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case TaxiPackage.COMPANY__CUSTOMERS:
				getCustomers().clear();
				return;
			case TaxiPackage.COMPANY__RIDERS:
				getRiders().clear();
				return;
			case TaxiPackage.COMPANY__ROUTES:
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
			case TaxiPackage.COMPANY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TaxiPackage.COMPANY__MANAGER:
				return MANAGER_EDEFAULT == null ? manager != null : !MANAGER_EDEFAULT.equals(manager);
			case TaxiPackage.COMPANY__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case TaxiPackage.COMPANY__CUSTOMERS:
				return customers != null && !customers.isEmpty();
			case TaxiPackage.COMPANY__RIDERS:
				return riders != null && !riders.isEmpty();
			case TaxiPackage.COMPANY__ROUTES:
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
		result.append(" (name: ");
		result.append(name);
		result.append(", manager: ");
		result.append(manager);
		result.append(", address: ");
		result.append(address);
		result.append(')');
		return result.toString();
	}

} //CompanyImpl
