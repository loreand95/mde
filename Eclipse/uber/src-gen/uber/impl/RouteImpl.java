/**
 */
package uber.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uber.Customer;
import uber.Rider;
import uber.Route;
import uber.RouteStatus;
import uber.UberPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uber.impl.RouteImpl#getId <em>Id</em>}</li>
 *   <li>{@link uber.impl.RouteImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link uber.impl.RouteImpl#getDate <em>Date</em>}</li>
 *   <li>{@link uber.impl.RouteImpl#getStartAddress <em>Start Address</em>}</li>
 *   <li>{@link uber.impl.RouteImpl#getEndAddress <em>End Address</em>}</li>
 *   <li>{@link uber.impl.RouteImpl#getFeedback <em>Feedback</em>}</li>
 *   <li>{@link uber.impl.RouteImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link uber.impl.RouteImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link uber.impl.RouteImpl#getRider <em>Rider</em>}</li>
 *   <li>{@link uber.impl.RouteImpl#getSeat <em>Seat</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RouteImpl extends MinimalEObjectImpl.Container implements Route {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected double price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartAddress() <em>Start Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String START_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartAddress() <em>Start Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartAddress()
	 * @generated
	 * @ordered
	 */
	protected String startAddress = START_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndAddress() <em>End Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String END_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndAddress() <em>End Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndAddress()
	 * @generated
	 * @ordered
	 */
	protected String endAddress = END_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFeedback() <em>Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final int FEEDBACK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFeedback() <em>Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedback()
	 * @generated
	 * @ordered
	 */
	protected int feedback = FEEDBACK_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final RouteStatus STATUS_EDEFAULT = RouteStatus.DONE;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected RouteStatus status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected Customer customer;

	/**
	 * The cached value of the '{@link #getRider() <em>Rider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRider()
	 * @generated
	 * @ordered
	 */
	protected Rider rider;

	/**
	 * The default value of the '{@link #getSeat() <em>Seat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeat()
	 * @generated
	 * @ordered
	 */
	protected static final int SEAT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSeat() <em>Seat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeat()
	 * @generated
	 * @ordered
	 */
	protected int seat = SEAT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RouteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UberPackage.Literals.ROUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UberPackage.ROUTE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(double newPrice) {
		double oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UberPackage.ROUTE__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UberPackage.ROUTE__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartAddress() {
		return startAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartAddress(String newStartAddress) {
		String oldStartAddress = startAddress;
		startAddress = newStartAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UberPackage.ROUTE__START_ADDRESS, oldStartAddress,
					startAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndAddress() {
		return endAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndAddress(String newEndAddress) {
		String oldEndAddress = endAddress;
		endAddress = newEndAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UberPackage.ROUTE__END_ADDRESS, oldEndAddress,
					endAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFeedback() {
		return feedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeedback(int newFeedback) {
		int oldFeedback = feedback;
		feedback = newFeedback;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UberPackage.ROUTE__FEEDBACK, oldFeedback, feedback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(RouteStatus newStatus) {
		RouteStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UberPackage.ROUTE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer getCustomer() {
		if (customer != null && customer.eIsProxy()) {
			InternalEObject oldCustomer = (InternalEObject) customer;
			customer = (Customer) eResolveProxy(oldCustomer);
			if (customer != oldCustomer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UberPackage.ROUTE__CUSTOMER, oldCustomer,
							customer));
			}
		}
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer basicGetCustomer() {
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomer(Customer newCustomer, NotificationChain msgs) {
		Customer oldCustomer = customer;
		customer = newCustomer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UberPackage.ROUTE__CUSTOMER,
					oldCustomer, newCustomer);
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
	public void setCustomer(Customer newCustomer) {
		if (newCustomer != customer) {
			NotificationChain msgs = null;
			if (customer != null)
				msgs = ((InternalEObject) customer).eInverseRemove(this, UberPackage.CUSTOMER__ROUTES, Customer.class,
						msgs);
			if (newCustomer != null)
				msgs = ((InternalEObject) newCustomer).eInverseAdd(this, UberPackage.CUSTOMER__ROUTES, Customer.class,
						msgs);
			msgs = basicSetCustomer(newCustomer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UberPackage.ROUTE__CUSTOMER, newCustomer,
					newCustomer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rider getRider() {
		if (rider != null && rider.eIsProxy()) {
			InternalEObject oldRider = (InternalEObject) rider;
			rider = (Rider) eResolveProxy(oldRider);
			if (rider != oldRider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UberPackage.ROUTE__RIDER, oldRider,
							rider));
			}
		}
		return rider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rider basicGetRider() {
		return rider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRider(Rider newRider, NotificationChain msgs) {
		Rider oldRider = rider;
		rider = newRider;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UberPackage.ROUTE__RIDER,
					oldRider, newRider);
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
	public void setRider(Rider newRider) {
		if (newRider != rider) {
			NotificationChain msgs = null;
			if (rider != null)
				msgs = ((InternalEObject) rider).eInverseRemove(this, UberPackage.RIDER__ROUTES, Rider.class, msgs);
			if (newRider != null)
				msgs = ((InternalEObject) newRider).eInverseAdd(this, UberPackage.RIDER__ROUTES, Rider.class, msgs);
			msgs = basicSetRider(newRider, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UberPackage.ROUTE__RIDER, newRider, newRider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSeat() {
		return seat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeat(int newSeat) {
		int oldSeat = seat;
		seat = newSeat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UberPackage.ROUTE__SEAT, oldSeat, seat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UberPackage.ROUTE__CUSTOMER:
			if (customer != null)
				msgs = ((InternalEObject) customer).eInverseRemove(this, UberPackage.CUSTOMER__ROUTES, Customer.class,
						msgs);
			return basicSetCustomer((Customer) otherEnd, msgs);
		case UberPackage.ROUTE__RIDER:
			if (rider != null)
				msgs = ((InternalEObject) rider).eInverseRemove(this, UberPackage.RIDER__ROUTES, Rider.class, msgs);
			return basicSetRider((Rider) otherEnd, msgs);
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
		case UberPackage.ROUTE__CUSTOMER:
			return basicSetCustomer(null, msgs);
		case UberPackage.ROUTE__RIDER:
			return basicSetRider(null, msgs);
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
		case UberPackage.ROUTE__ID:
			return getId();
		case UberPackage.ROUTE__PRICE:
			return getPrice();
		case UberPackage.ROUTE__DATE:
			return getDate();
		case UberPackage.ROUTE__START_ADDRESS:
			return getStartAddress();
		case UberPackage.ROUTE__END_ADDRESS:
			return getEndAddress();
		case UberPackage.ROUTE__FEEDBACK:
			return getFeedback();
		case UberPackage.ROUTE__STATUS:
			return getStatus();
		case UberPackage.ROUTE__CUSTOMER:
			if (resolve)
				return getCustomer();
			return basicGetCustomer();
		case UberPackage.ROUTE__RIDER:
			if (resolve)
				return getRider();
			return basicGetRider();
		case UberPackage.ROUTE__SEAT:
			return getSeat();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case UberPackage.ROUTE__ID:
			setId((String) newValue);
			return;
		case UberPackage.ROUTE__PRICE:
			setPrice((Double) newValue);
			return;
		case UberPackage.ROUTE__DATE:
			setDate((Date) newValue);
			return;
		case UberPackage.ROUTE__START_ADDRESS:
			setStartAddress((String) newValue);
			return;
		case UberPackage.ROUTE__END_ADDRESS:
			setEndAddress((String) newValue);
			return;
		case UberPackage.ROUTE__FEEDBACK:
			setFeedback((Integer) newValue);
			return;
		case UberPackage.ROUTE__STATUS:
			setStatus((RouteStatus) newValue);
			return;
		case UberPackage.ROUTE__CUSTOMER:
			setCustomer((Customer) newValue);
			return;
		case UberPackage.ROUTE__RIDER:
			setRider((Rider) newValue);
			return;
		case UberPackage.ROUTE__SEAT:
			setSeat((Integer) newValue);
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
		case UberPackage.ROUTE__ID:
			setId(ID_EDEFAULT);
			return;
		case UberPackage.ROUTE__PRICE:
			setPrice(PRICE_EDEFAULT);
			return;
		case UberPackage.ROUTE__DATE:
			setDate(DATE_EDEFAULT);
			return;
		case UberPackage.ROUTE__START_ADDRESS:
			setStartAddress(START_ADDRESS_EDEFAULT);
			return;
		case UberPackage.ROUTE__END_ADDRESS:
			setEndAddress(END_ADDRESS_EDEFAULT);
			return;
		case UberPackage.ROUTE__FEEDBACK:
			setFeedback(FEEDBACK_EDEFAULT);
			return;
		case UberPackage.ROUTE__STATUS:
			setStatus(STATUS_EDEFAULT);
			return;
		case UberPackage.ROUTE__CUSTOMER:
			setCustomer((Customer) null);
			return;
		case UberPackage.ROUTE__RIDER:
			setRider((Rider) null);
			return;
		case UberPackage.ROUTE__SEAT:
			setSeat(SEAT_EDEFAULT);
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
		case UberPackage.ROUTE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case UberPackage.ROUTE__PRICE:
			return price != PRICE_EDEFAULT;
		case UberPackage.ROUTE__DATE:
			return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
		case UberPackage.ROUTE__START_ADDRESS:
			return START_ADDRESS_EDEFAULT == null ? startAddress != null : !START_ADDRESS_EDEFAULT.equals(startAddress);
		case UberPackage.ROUTE__END_ADDRESS:
			return END_ADDRESS_EDEFAULT == null ? endAddress != null : !END_ADDRESS_EDEFAULT.equals(endAddress);
		case UberPackage.ROUTE__FEEDBACK:
			return feedback != FEEDBACK_EDEFAULT;
		case UberPackage.ROUTE__STATUS:
			return status != STATUS_EDEFAULT;
		case UberPackage.ROUTE__CUSTOMER:
			return customer != null;
		case UberPackage.ROUTE__RIDER:
			return rider != null;
		case UberPackage.ROUTE__SEAT:
			return seat != SEAT_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", price: ");
		result.append(price);
		result.append(", date: ");
		result.append(date);
		result.append(", startAddress: ");
		result.append(startAddress);
		result.append(", endAddress: ");
		result.append(endAddress);
		result.append(", feedback: ");
		result.append(feedback);
		result.append(", status: ");
		result.append(status);
		result.append(", seat: ");
		result.append(seat);
		result.append(')');
		return result.toString();
	}

} //RouteImpl
