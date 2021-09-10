/**
 */
package it.disim.loreand.mde;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see it.disim.loreand.mde.MdeFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface MdePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mde";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.loreand.it/mde";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mde";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MdePackage eINSTANCE = it.disim.loreand.mde.impl.MdePackageImpl.init();

	/**
	 * The meta object id for the '{@link it.disim.loreand.mde.impl.UberImpl <em>Uber</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.loreand.mde.impl.UberImpl
	 * @see it.disim.loreand.mde.impl.MdePackageImpl#getUber()
	 * @generated
	 */
	int UBER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBER__MANAGER = 1;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBER__ADDRESS = 2;

	/**
	 * The feature id for the '<em><b>Customers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBER__CUSTOMERS = 3;

	/**
	 * The feature id for the '<em><b>Riders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBER__RIDERS = 4;

	/**
	 * The feature id for the '<em><b>Routes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBER__ROUTES = 5;

	/**
	 * The number of structural features of the '<em>Uber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Uber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.disim.loreand.mde.Identifiable <em>Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.loreand.mde.Identifiable
	 * @see it.disim.loreand.mde.impl.MdePackageImpl#getIdentifiable()
	 * @generated
	 */
	int IDENTIFIABLE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__ID = 0;

	/**
	 * The number of structural features of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.disim.loreand.mde.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.loreand.mde.impl.UserImpl
	 * @see it.disim.loreand.mde.impl.MdePackageImpl#getUser()
	 * @generated
	 */
	int USER = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__SURNAME = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__EMAIL = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__FULL_NAME = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.disim.loreand.mde.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.loreand.mde.impl.CustomerImpl
	 * @see it.disim.loreand.mde.impl.MdePackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ID = USER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__NAME = USER__NAME;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__SURNAME = USER__SURNAME;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__EMAIL = USER__EMAIL;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__FULL_NAME = USER__FULL_NAME;

	/**
	 * The feature id for the '<em><b>Subscription Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__SUBSCRIPTION_DATE = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__EXPIRATION_DATE = USER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__STATUS = USER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Routes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ROUTES = USER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = USER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.disim.loreand.mde.impl.RiderImpl <em>Rider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.loreand.mde.impl.RiderImpl
	 * @see it.disim.loreand.mde.impl.MdePackageImpl#getRider()
	 * @generated
	 */
	int RIDER = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDER__ID = USER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDER__NAME = USER__NAME;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDER__SURNAME = USER__SURNAME;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDER__EMAIL = USER__EMAIL;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDER__FULL_NAME = USER__FULL_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDER__STATUS = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDER__LOCATION = USER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Routes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDER__ROUTES = USER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Carried Out Routes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDER__CARRIED_OUT_ROUTES = USER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDER__SCORE = USER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Rider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDER_FEATURE_COUNT = USER_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Carried Out Customers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDER___CARRIED_OUT_CUSTOMERS = USER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Good Employee</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDER___IS_GOOD_EMPLOYEE = USER_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDER_OPERATION_COUNT = USER_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.disim.loreand.mde.impl.GeolocationImpl <em>Geolocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.loreand.mde.impl.GeolocationImpl
	 * @see it.disim.loreand.mde.impl.MdePackageImpl#getGeolocation()
	 * @generated
	 */
	int GEOLOCATION = 4;

	/**
	 * The feature id for the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOLOCATION__LAT = 0;

	/**
	 * The feature id for the '<em><b>Lng</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOLOCATION__LNG = 1;

	/**
	 * The number of structural features of the '<em>Geolocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOLOCATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Geolocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOLOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.disim.loreand.mde.impl.RouteImpl <em>Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.loreand.mde.impl.RouteImpl
	 * @see it.disim.loreand.mde.impl.MdePackageImpl#getRoute()
	 * @generated
	 */
	int ROUTE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__PRICE = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__DATE = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__START_ADDRESS = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__END_ADDRESS = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__FEEDBACK = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__STATUS = IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__CUSTOMER = IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Rider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__RIDER = IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Seats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__SEATS = IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.disim.loreand.mde.RiderStatus <em>Rider Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.loreand.mde.RiderStatus
	 * @see it.disim.loreand.mde.impl.MdePackageImpl#getRiderStatus()
	 * @generated
	 */
	int RIDER_STATUS = 7;

	/**
	 * The meta object id for the '{@link it.disim.loreand.mde.RouteStatus <em>Route Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.loreand.mde.RouteStatus
	 * @see it.disim.loreand.mde.impl.MdePackageImpl#getRouteStatus()
	 * @generated
	 */
	int ROUTE_STATUS = 8;

	/**
	 * The meta object id for the '{@link it.disim.loreand.mde.CustomerStatus <em>Customer Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.loreand.mde.CustomerStatus
	 * @see it.disim.loreand.mde.impl.MdePackageImpl#getCustomerStatus()
	 * @generated
	 */
	int CUSTOMER_STATUS = 9;

	/**
	 * Returns the meta object for class '{@link it.disim.loreand.mde.Uber <em>Uber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uber</em>'.
	 * @see it.disim.loreand.mde.Uber
	 * @generated
	 */
	EClass getUber();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.loreand.mde.Uber#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.disim.loreand.mde.Uber#getName()
	 * @see #getUber()
	 * @generated
	 */
	EAttribute getUber_Name();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.loreand.mde.Uber#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manager</em>'.
	 * @see it.disim.loreand.mde.Uber#getManager()
	 * @see #getUber()
	 * @generated
	 */
	EAttribute getUber_Manager();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.loreand.mde.Uber#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see it.disim.loreand.mde.Uber#getAddress()
	 * @see #getUber()
	 * @generated
	 */
	EAttribute getUber_Address();

	/**
	 * Returns the meta object for the containment reference list '{@link it.disim.loreand.mde.Uber#getCustomers <em>Customers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Customers</em>'.
	 * @see it.disim.loreand.mde.Uber#getCustomers()
	 * @see #getUber()
	 * @generated
	 */
	EReference getUber_Customers();

	/**
	 * Returns the meta object for the containment reference list '{@link it.disim.loreand.mde.Uber#getRiders <em>Riders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Riders</em>'.
	 * @see it.disim.loreand.mde.Uber#getRiders()
	 * @see #getUber()
	 * @generated
	 */
	EReference getUber_Riders();

	/**
	 * Returns the meta object for the containment reference list '{@link it.disim.loreand.mde.Uber#getRoutes <em>Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Routes</em>'.
	 * @see it.disim.loreand.mde.Uber#getRoutes()
	 * @see #getUber()
	 * @generated
	 */
	EReference getUber_Routes();

	/**
	 * Returns the meta object for class '{@link it.disim.loreand.mde.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see it.disim.loreand.mde.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.loreand.mde.User#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.disim.loreand.mde.User#getName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Name();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.loreand.mde.User#getSurname <em>Surname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surname</em>'.
	 * @see it.disim.loreand.mde.User#getSurname()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Surname();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.loreand.mde.User#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see it.disim.loreand.mde.User#getEmail()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Email();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.loreand.mde.User#getFullName <em>Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Name</em>'.
	 * @see it.disim.loreand.mde.User#getFullName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_FullName();

	/**
	 * Returns the meta object for class '{@link it.disim.loreand.mde.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see it.disim.loreand.mde.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.loreand.mde.Customer#getSubscriptionDate <em>Subscription Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscription Date</em>'.
	 * @see it.disim.loreand.mde.Customer#getSubscriptionDate()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_SubscriptionDate();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.loreand.mde.Customer#getExpirationDate <em>Expiration Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiration Date</em>'.
	 * @see it.disim.loreand.mde.Customer#getExpirationDate()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_ExpirationDate();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.loreand.mde.Customer#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see it.disim.loreand.mde.Customer#getStatus()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Status();

	/**
	 * Returns the meta object for the reference list '{@link it.disim.loreand.mde.Customer#getRoutes <em>Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Routes</em>'.
	 * @see it.disim.loreand.mde.Customer#getRoutes()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Routes();

	/**
	 * Returns the meta object for class '{@link it.disim.loreand.mde.Rider <em>Rider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rider</em>'.
	 * @see it.disim.loreand.mde.Rider
	 * @generated
	 */
	EClass getRider();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.loreand.mde.Rider#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see it.disim.loreand.mde.Rider#getStatus()
	 * @see #getRider()
	 * @generated
	 */
	EAttribute getRider_Status();

	/**
	 * Returns the meta object for the containment reference '{@link it.disim.loreand.mde.Rider#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see it.disim.loreand.mde.Rider#getLocation()
	 * @see #getRider()
	 * @generated
	 */
	EReference getRider_Location();

	/**
	 * Returns the meta object for the reference list '{@link it.disim.loreand.mde.Rider#getRoutes <em>Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Routes</em>'.
	 * @see it.disim.loreand.mde.Rider#getRoutes()
	 * @see #getRider()
	 * @generated
	 */
	EReference getRider_Routes();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.loreand.mde.Rider#getCarriedOutRoutes <em>Carried Out Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Carried Out Routes</em>'.
	 * @see it.disim.loreand.mde.Rider#getCarriedOutRoutes()
	 * @see #getRider()
	 * @generated
	 */
	EAttribute getRider_CarriedOutRoutes();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.loreand.mde.Rider#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score</em>'.
	 * @see it.disim.loreand.mde.Rider#getScore()
	 * @see #getRider()
	 * @generated
	 */
	EAttribute getRider_Score();

	/**
	 * Returns the meta object for the '{@link it.disim.loreand.mde.Rider#CarriedOutCustomers() <em>Carried Out Customers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Carried Out Customers</em>' operation.
	 * @see it.disim.loreand.mde.Rider#CarriedOutCustomers()
	 * @generated
	 */
	EOperation getRider__CarriedOutCustomers();

	/**
	 * Returns the meta object for the '{@link it.disim.loreand.mde.Rider#isGoodEmployee() <em>Is Good Employee</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Good Employee</em>' operation.
	 * @see it.disim.loreand.mde.Rider#isGoodEmployee()
	 * @generated
	 */
	EOperation getRider__IsGoodEmployee();

	/**
	 * Returns the meta object for class '{@link it.disim.loreand.mde.Geolocation <em>Geolocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geolocation</em>'.
	 * @see it.disim.loreand.mde.Geolocation
	 * @generated
	 */
	EClass getGeolocation();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.loreand.mde.Geolocation#getLat <em>Lat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lat</em>'.
	 * @see it.disim.loreand.mde.Geolocation#getLat()
	 * @see #getGeolocation()
	 * @generated
	 */
	EAttribute getGeolocation_Lat();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.loreand.mde.Geolocation#getLng <em>Lng</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lng</em>'.
	 * @see it.disim.loreand.mde.Geolocation#getLng()
	 * @see #getGeolocation()
	 * @generated
	 */
	EAttribute getGeolocation_Lng();

	/**
	 * Returns the meta object for class '{@link it.disim.loreand.mde.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route</em>'.
	 * @see it.disim.loreand.mde.Route
	 * @generated
	 */
	EClass getRoute();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.loreand.mde.Route#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see it.disim.loreand.mde.Route#getPrice()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Price();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.loreand.mde.Route#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see it.disim.loreand.mde.Route#getDate()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Date();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.loreand.mde.Route#getStartAddress <em>Start Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Address</em>'.
	 * @see it.disim.loreand.mde.Route#getStartAddress()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_StartAddress();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.loreand.mde.Route#getEndAddress <em>End Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Address</em>'.
	 * @see it.disim.loreand.mde.Route#getEndAddress()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_EndAddress();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.loreand.mde.Route#getFeedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feedback</em>'.
	 * @see it.disim.loreand.mde.Route#getFeedback()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Feedback();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.loreand.mde.Route#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see it.disim.loreand.mde.Route#getStatus()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Status();

	/**
	 * Returns the meta object for the reference '{@link it.disim.loreand.mde.Route#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer</em>'.
	 * @see it.disim.loreand.mde.Route#getCustomer()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Customer();

	/**
	 * Returns the meta object for the reference '{@link it.disim.loreand.mde.Route#getRider <em>Rider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rider</em>'.
	 * @see it.disim.loreand.mde.Route#getRider()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Rider();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.loreand.mde.Route#getSeats <em>Seats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seats</em>'.
	 * @see it.disim.loreand.mde.Route#getSeats()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Seats();

	/**
	 * Returns the meta object for class '{@link it.disim.loreand.mde.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable</em>'.
	 * @see it.disim.loreand.mde.Identifiable
	 * @generated
	 */
	EClass getIdentifiable();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.loreand.mde.Identifiable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.disim.loreand.mde.Identifiable#getId()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_Id();

	/**
	 * Returns the meta object for enum '{@link it.disim.loreand.mde.RiderStatus <em>Rider Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rider Status</em>'.
	 * @see it.disim.loreand.mde.RiderStatus
	 * @generated
	 */
	EEnum getRiderStatus();

	/**
	 * Returns the meta object for enum '{@link it.disim.loreand.mde.RouteStatus <em>Route Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Route Status</em>'.
	 * @see it.disim.loreand.mde.RouteStatus
	 * @generated
	 */
	EEnum getRouteStatus();

	/**
	 * Returns the meta object for enum '{@link it.disim.loreand.mde.CustomerStatus <em>Customer Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Customer Status</em>'.
	 * @see it.disim.loreand.mde.CustomerStatus
	 * @generated
	 */
	EEnum getCustomerStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MdeFactory getMdeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link it.disim.loreand.mde.impl.UberImpl <em>Uber</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.loreand.mde.impl.UberImpl
		 * @see it.disim.loreand.mde.impl.MdePackageImpl#getUber()
		 * @generated
		 */
		EClass UBER = eINSTANCE.getUber();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBER__NAME = eINSTANCE.getUber_Name();

		/**
		 * The meta object literal for the '<em><b>Manager</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBER__MANAGER = eINSTANCE.getUber_Manager();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBER__ADDRESS = eINSTANCE.getUber_Address();

		/**
		 * The meta object literal for the '<em><b>Customers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBER__CUSTOMERS = eINSTANCE.getUber_Customers();

		/**
		 * The meta object literal for the '<em><b>Riders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBER__RIDERS = eINSTANCE.getUber_Riders();

		/**
		 * The meta object literal for the '<em><b>Routes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBER__ROUTES = eINSTANCE.getUber_Routes();

		/**
		 * The meta object literal for the '{@link it.disim.loreand.mde.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.loreand.mde.impl.UserImpl
		 * @see it.disim.loreand.mde.impl.MdePackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NAME = eINSTANCE.getUser_Name();

		/**
		 * The meta object literal for the '<em><b>Surname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__SURNAME = eINSTANCE.getUser_Surname();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__EMAIL = eINSTANCE.getUser_Email();

		/**
		 * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__FULL_NAME = eINSTANCE.getUser_FullName();

		/**
		 * The meta object literal for the '{@link it.disim.loreand.mde.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.loreand.mde.impl.CustomerImpl
		 * @see it.disim.loreand.mde.impl.MdePackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>Subscription Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__SUBSCRIPTION_DATE = eINSTANCE.getCustomer_SubscriptionDate();

		/**
		 * The meta object literal for the '<em><b>Expiration Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__EXPIRATION_DATE = eINSTANCE.getCustomer_ExpirationDate();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__STATUS = eINSTANCE.getCustomer_Status();

		/**
		 * The meta object literal for the '<em><b>Routes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__ROUTES = eINSTANCE.getCustomer_Routes();

		/**
		 * The meta object literal for the '{@link it.disim.loreand.mde.impl.RiderImpl <em>Rider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.loreand.mde.impl.RiderImpl
		 * @see it.disim.loreand.mde.impl.MdePackageImpl#getRider()
		 * @generated
		 */
		EClass RIDER = eINSTANCE.getRider();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIDER__STATUS = eINSTANCE.getRider_Status();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIDER__LOCATION = eINSTANCE.getRider_Location();

		/**
		 * The meta object literal for the '<em><b>Routes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIDER__ROUTES = eINSTANCE.getRider_Routes();

		/**
		 * The meta object literal for the '<em><b>Carried Out Routes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIDER__CARRIED_OUT_ROUTES = eINSTANCE.getRider_CarriedOutRoutes();

		/**
		 * The meta object literal for the '<em><b>Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIDER__SCORE = eINSTANCE.getRider_Score();

		/**
		 * The meta object literal for the '<em><b>Carried Out Customers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIDER___CARRIED_OUT_CUSTOMERS = eINSTANCE.getRider__CarriedOutCustomers();

		/**
		 * The meta object literal for the '<em><b>Is Good Employee</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RIDER___IS_GOOD_EMPLOYEE = eINSTANCE.getRider__IsGoodEmployee();

		/**
		 * The meta object literal for the '{@link it.disim.loreand.mde.impl.GeolocationImpl <em>Geolocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.loreand.mde.impl.GeolocationImpl
		 * @see it.disim.loreand.mde.impl.MdePackageImpl#getGeolocation()
		 * @generated
		 */
		EClass GEOLOCATION = eINSTANCE.getGeolocation();

		/**
		 * The meta object literal for the '<em><b>Lat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOLOCATION__LAT = eINSTANCE.getGeolocation_Lat();

		/**
		 * The meta object literal for the '<em><b>Lng</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOLOCATION__LNG = eINSTANCE.getGeolocation_Lng();

		/**
		 * The meta object literal for the '{@link it.disim.loreand.mde.impl.RouteImpl <em>Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.loreand.mde.impl.RouteImpl
		 * @see it.disim.loreand.mde.impl.MdePackageImpl#getRoute()
		 * @generated
		 */
		EClass ROUTE = eINSTANCE.getRoute();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__PRICE = eINSTANCE.getRoute_Price();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__DATE = eINSTANCE.getRoute_Date();

		/**
		 * The meta object literal for the '<em><b>Start Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__START_ADDRESS = eINSTANCE.getRoute_StartAddress();

		/**
		 * The meta object literal for the '<em><b>End Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__END_ADDRESS = eINSTANCE.getRoute_EndAddress();

		/**
		 * The meta object literal for the '<em><b>Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__FEEDBACK = eINSTANCE.getRoute_Feedback();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__STATUS = eINSTANCE.getRoute_Status();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__CUSTOMER = eINSTANCE.getRoute_Customer();

		/**
		 * The meta object literal for the '<em><b>Rider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__RIDER = eINSTANCE.getRoute_Rider();

		/**
		 * The meta object literal for the '<em><b>Seats</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__SEATS = eINSTANCE.getRoute_Seats();

		/**
		 * The meta object literal for the '{@link it.disim.loreand.mde.Identifiable <em>Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.loreand.mde.Identifiable
		 * @see it.disim.loreand.mde.impl.MdePackageImpl#getIdentifiable()
		 * @generated
		 */
		EClass IDENTIFIABLE = eINSTANCE.getIdentifiable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__ID = eINSTANCE.getIdentifiable_Id();

		/**
		 * The meta object literal for the '{@link it.disim.loreand.mde.RiderStatus <em>Rider Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.loreand.mde.RiderStatus
		 * @see it.disim.loreand.mde.impl.MdePackageImpl#getRiderStatus()
		 * @generated
		 */
		EEnum RIDER_STATUS = eINSTANCE.getRiderStatus();

		/**
		 * The meta object literal for the '{@link it.disim.loreand.mde.RouteStatus <em>Route Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.loreand.mde.RouteStatus
		 * @see it.disim.loreand.mde.impl.MdePackageImpl#getRouteStatus()
		 * @generated
		 */
		EEnum ROUTE_STATUS = eINSTANCE.getRouteStatus();

		/**
		 * The meta object literal for the '{@link it.disim.loreand.mde.CustomerStatus <em>Customer Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.loreand.mde.CustomerStatus
		 * @see it.disim.loreand.mde.impl.MdePackageImpl#getCustomerStatus()
		 * @generated
		 */
		EEnum CUSTOMER_STATUS = eINSTANCE.getCustomerStatus();

	}

} //MdePackage
