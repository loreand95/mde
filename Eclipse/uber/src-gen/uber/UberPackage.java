/**
 */
package uber;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see uber.UberFactory
 * @model kind="package"
 * @generated
 */
public interface UberPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uber";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/uber";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uber";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UberPackage eINSTANCE = uber.impl.UberPackageImpl.init();

	/**
	 * The meta object id for the '{@link uber.impl.CompanyImpl <em>Company</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uber.impl.CompanyImpl
	 * @see uber.impl.UberPackageImpl#getCompany()
	 * @generated
	 */
	int COMPANY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__MANAGER = 1;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__ADDRESS = 2;

	/**
	 * The feature id for the '<em><b>Customers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__CUSTOMERS = 3;

	/**
	 * The feature id for the '<em><b>Riders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__RIDERS = 4;

	/**
	 * The feature id for the '<em><b>Routes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__ROUTES = 5;

	/**
	 * The number of structural features of the '<em>Company</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Company</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uber.Identifiable <em>Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uber.Identifiable
	 * @see uber.impl.UberPackageImpl#getIdentifiable()
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
	 * The meta object id for the '{@link uber.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uber.impl.UserImpl
	 * @see uber.impl.UberPackageImpl#getUser()
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
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uber.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uber.impl.CustomerImpl
	 * @see uber.impl.UberPackageImpl#getCustomer()
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
	 * The meta object id for the '{@link uber.impl.RiderImpl <em>Rider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uber.impl.RiderImpl
	 * @see uber.impl.UberPackageImpl#getRider()
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
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDER__STATUS = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Live Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDER__LIVE_POSITION = USER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Routes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDER__ROUTES = USER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDER_FEATURE_COUNT = USER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Rider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDER_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uber.impl.GeolocationImpl <em>Geolocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uber.impl.GeolocationImpl
	 * @see uber.impl.UberPackageImpl#getGeolocation()
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
	 * The meta object id for the '{@link uber.impl.RouteImpl <em>Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uber.impl.RouteImpl
	 * @see uber.impl.UberPackageImpl#getRoute()
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
	 * The feature id for the '<em><b>Seat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__SEAT = IDENTIFIABLE_FEATURE_COUNT + 8;

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
	 * The meta object id for the '{@link uber.RiderStatus <em>Rider Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uber.RiderStatus
	 * @see uber.impl.UberPackageImpl#getRiderStatus()
	 * @generated
	 */
	int RIDER_STATUS = 7;

	/**
	 * The meta object id for the '{@link uber.RouteStatus <em>Route Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uber.RouteStatus
	 * @see uber.impl.UberPackageImpl#getRouteStatus()
	 * @generated
	 */
	int ROUTE_STATUS = 8;

	/**
	 * The meta object id for the '{@link uber.CustomerStatus <em>Customer Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uber.CustomerStatus
	 * @see uber.impl.UberPackageImpl#getCustomerStatus()
	 * @generated
	 */
	int CUSTOMER_STATUS = 9;

	/**
	 * Returns the meta object for class '{@link uber.Company <em>Company</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Company</em>'.
	 * @see uber.Company
	 * @generated
	 */
	EClass getCompany();

	/**
	 * Returns the meta object for the attribute '{@link uber.Company#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uber.Company#getName()
	 * @see #getCompany()
	 * @generated
	 */
	EAttribute getCompany_Name();

	/**
	 * Returns the meta object for the attribute '{@link uber.Company#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manager</em>'.
	 * @see uber.Company#getManager()
	 * @see #getCompany()
	 * @generated
	 */
	EAttribute getCompany_Manager();

	/**
	 * Returns the meta object for the attribute '{@link uber.Company#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see uber.Company#getAddress()
	 * @see #getCompany()
	 * @generated
	 */
	EAttribute getCompany_Address();

	/**
	 * Returns the meta object for the containment reference list '{@link uber.Company#getCustomers <em>Customers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Customers</em>'.
	 * @see uber.Company#getCustomers()
	 * @see #getCompany()
	 * @generated
	 */
	EReference getCompany_Customers();

	/**
	 * Returns the meta object for the containment reference list '{@link uber.Company#getRiders <em>Riders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Riders</em>'.
	 * @see uber.Company#getRiders()
	 * @see #getCompany()
	 * @generated
	 */
	EReference getCompany_Riders();

	/**
	 * Returns the meta object for the containment reference list '{@link uber.Company#getRoutes <em>Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Routes</em>'.
	 * @see uber.Company#getRoutes()
	 * @see #getCompany()
	 * @generated
	 */
	EReference getCompany_Routes();

	/**
	 * Returns the meta object for class '{@link uber.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see uber.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link uber.User#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uber.User#getName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Name();

	/**
	 * Returns the meta object for the attribute '{@link uber.User#getSurname <em>Surname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surname</em>'.
	 * @see uber.User#getSurname()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Surname();

	/**
	 * Returns the meta object for the attribute '{@link uber.User#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see uber.User#getEmail()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Email();

	/**
	 * Returns the meta object for class '{@link uber.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see uber.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the attribute '{@link uber.Customer#getSubscriptionDate <em>Subscription Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscription Date</em>'.
	 * @see uber.Customer#getSubscriptionDate()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_SubscriptionDate();

	/**
	 * Returns the meta object for the attribute '{@link uber.Customer#getExpirationDate <em>Expiration Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiration Date</em>'.
	 * @see uber.Customer#getExpirationDate()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_ExpirationDate();

	/**
	 * Returns the meta object for the attribute '{@link uber.Customer#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see uber.Customer#getStatus()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Status();

	/**
	 * Returns the meta object for the reference list '{@link uber.Customer#getRoutes <em>Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Routes</em>'.
	 * @see uber.Customer#getRoutes()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Routes();

	/**
	 * Returns the meta object for class '{@link uber.Rider <em>Rider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rider</em>'.
	 * @see uber.Rider
	 * @generated
	 */
	EClass getRider();

	/**
	 * Returns the meta object for the attribute '{@link uber.Rider#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see uber.Rider#getStatus()
	 * @see #getRider()
	 * @generated
	 */
	EAttribute getRider_Status();

	/**
	 * Returns the meta object for the containment reference '{@link uber.Rider#getLivePosition <em>Live Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Live Position</em>'.
	 * @see uber.Rider#getLivePosition()
	 * @see #getRider()
	 * @generated
	 */
	EReference getRider_LivePosition();

	/**
	 * Returns the meta object for the reference list '{@link uber.Rider#getRoutes <em>Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Routes</em>'.
	 * @see uber.Rider#getRoutes()
	 * @see #getRider()
	 * @generated
	 */
	EReference getRider_Routes();

	/**
	 * Returns the meta object for class '{@link uber.Geolocation <em>Geolocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geolocation</em>'.
	 * @see uber.Geolocation
	 * @generated
	 */
	EClass getGeolocation();

	/**
	 * Returns the meta object for the attribute '{@link uber.Geolocation#getLat <em>Lat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lat</em>'.
	 * @see uber.Geolocation#getLat()
	 * @see #getGeolocation()
	 * @generated
	 */
	EAttribute getGeolocation_Lat();

	/**
	 * Returns the meta object for the attribute '{@link uber.Geolocation#getLng <em>Lng</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lng</em>'.
	 * @see uber.Geolocation#getLng()
	 * @see #getGeolocation()
	 * @generated
	 */
	EAttribute getGeolocation_Lng();

	/**
	 * Returns the meta object for class '{@link uber.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route</em>'.
	 * @see uber.Route
	 * @generated
	 */
	EClass getRoute();

	/**
	 * Returns the meta object for the attribute '{@link uber.Route#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see uber.Route#getPrice()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Price();

	/**
	 * Returns the meta object for the attribute '{@link uber.Route#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see uber.Route#getDate()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Date();

	/**
	 * Returns the meta object for the attribute '{@link uber.Route#getStartAddress <em>Start Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Address</em>'.
	 * @see uber.Route#getStartAddress()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_StartAddress();

	/**
	 * Returns the meta object for the attribute '{@link uber.Route#getEndAddress <em>End Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Address</em>'.
	 * @see uber.Route#getEndAddress()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_EndAddress();

	/**
	 * Returns the meta object for the attribute '{@link uber.Route#getFeedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feedback</em>'.
	 * @see uber.Route#getFeedback()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Feedback();

	/**
	 * Returns the meta object for the attribute '{@link uber.Route#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see uber.Route#getStatus()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Status();

	/**
	 * Returns the meta object for the reference '{@link uber.Route#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer</em>'.
	 * @see uber.Route#getCustomer()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Customer();

	/**
	 * Returns the meta object for the reference '{@link uber.Route#getRider <em>Rider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rider</em>'.
	 * @see uber.Route#getRider()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Rider();

	/**
	 * Returns the meta object for the attribute '{@link uber.Route#getSeat <em>Seat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat</em>'.
	 * @see uber.Route#getSeat()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Seat();

	/**
	 * Returns the meta object for class '{@link uber.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable</em>'.
	 * @see uber.Identifiable
	 * @generated
	 */
	EClass getIdentifiable();

	/**
	 * Returns the meta object for the attribute '{@link uber.Identifiable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see uber.Identifiable#getId()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_Id();

	/**
	 * Returns the meta object for enum '{@link uber.RiderStatus <em>Rider Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rider Status</em>'.
	 * @see uber.RiderStatus
	 * @generated
	 */
	EEnum getRiderStatus();

	/**
	 * Returns the meta object for enum '{@link uber.RouteStatus <em>Route Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Route Status</em>'.
	 * @see uber.RouteStatus
	 * @generated
	 */
	EEnum getRouteStatus();

	/**
	 * Returns the meta object for enum '{@link uber.CustomerStatus <em>Customer Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Customer Status</em>'.
	 * @see uber.CustomerStatus
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
	UberFactory getUberFactory();

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
		 * The meta object literal for the '{@link uber.impl.CompanyImpl <em>Company</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uber.impl.CompanyImpl
		 * @see uber.impl.UberPackageImpl#getCompany()
		 * @generated
		 */
		EClass COMPANY = eINSTANCE.getCompany();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPANY__NAME = eINSTANCE.getCompany_Name();

		/**
		 * The meta object literal for the '<em><b>Manager</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPANY__MANAGER = eINSTANCE.getCompany_Manager();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPANY__ADDRESS = eINSTANCE.getCompany_Address();

		/**
		 * The meta object literal for the '<em><b>Customers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPANY__CUSTOMERS = eINSTANCE.getCompany_Customers();

		/**
		 * The meta object literal for the '<em><b>Riders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPANY__RIDERS = eINSTANCE.getCompany_Riders();

		/**
		 * The meta object literal for the '<em><b>Routes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPANY__ROUTES = eINSTANCE.getCompany_Routes();

		/**
		 * The meta object literal for the '{@link uber.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uber.impl.UserImpl
		 * @see uber.impl.UberPackageImpl#getUser()
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
		 * The meta object literal for the '{@link uber.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uber.impl.CustomerImpl
		 * @see uber.impl.UberPackageImpl#getCustomer()
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
		 * The meta object literal for the '{@link uber.impl.RiderImpl <em>Rider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uber.impl.RiderImpl
		 * @see uber.impl.UberPackageImpl#getRider()
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
		 * The meta object literal for the '<em><b>Live Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIDER__LIVE_POSITION = eINSTANCE.getRider_LivePosition();

		/**
		 * The meta object literal for the '<em><b>Routes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIDER__ROUTES = eINSTANCE.getRider_Routes();

		/**
		 * The meta object literal for the '{@link uber.impl.GeolocationImpl <em>Geolocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uber.impl.GeolocationImpl
		 * @see uber.impl.UberPackageImpl#getGeolocation()
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
		 * The meta object literal for the '{@link uber.impl.RouteImpl <em>Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uber.impl.RouteImpl
		 * @see uber.impl.UberPackageImpl#getRoute()
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
		 * The meta object literal for the '<em><b>Seat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__SEAT = eINSTANCE.getRoute_Seat();

		/**
		 * The meta object literal for the '{@link uber.Identifiable <em>Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uber.Identifiable
		 * @see uber.impl.UberPackageImpl#getIdentifiable()
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
		 * The meta object literal for the '{@link uber.RiderStatus <em>Rider Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uber.RiderStatus
		 * @see uber.impl.UberPackageImpl#getRiderStatus()
		 * @generated
		 */
		EEnum RIDER_STATUS = eINSTANCE.getRiderStatus();

		/**
		 * The meta object literal for the '{@link uber.RouteStatus <em>Route Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uber.RouteStatus
		 * @see uber.impl.UberPackageImpl#getRouteStatus()
		 * @generated
		 */
		EEnum ROUTE_STATUS = eINSTANCE.getRouteStatus();

		/**
		 * The meta object literal for the '{@link uber.CustomerStatus <em>Customer Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uber.CustomerStatus
		 * @see uber.impl.UberPackageImpl#getCustomerStatus()
		 * @generated
		 */
		EEnum CUSTOMER_STATUS = eINSTANCE.getCustomerStatus();

	}

} //UberPackage
