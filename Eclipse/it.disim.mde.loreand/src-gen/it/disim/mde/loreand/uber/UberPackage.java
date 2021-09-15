/**
 */
package it.disim.mde.loreand.uber;

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
 * @see it.disim.mde.loreand.uber.UberFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
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
	String eNS_URI = "http://www.loreand.it/mde";

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
	UberPackage eINSTANCE = it.disim.mde.loreand.uber.impl.UberPackageImpl.init();

	/**
	 * The meta object id for the '{@link it.disim.mde.loreand.uber.impl.UberImpl <em>Uber</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.mde.loreand.uber.impl.UberImpl
	 * @see it.disim.mde.loreand.uber.impl.UberPackageImpl#getUber()
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
	 * The feature id for the '<em><b>Supervisors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBER__SUPERVISORS = 6;

	/**
	 * The number of structural features of the '<em>Uber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBER_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Uber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.disim.mde.loreand.uber.Identifiable <em>Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.mde.loreand.uber.Identifiable
	 * @see it.disim.mde.loreand.uber.impl.UberPackageImpl#getIdentifiable()
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
	 * The meta object id for the '{@link it.disim.mde.loreand.uber.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.mde.loreand.uber.impl.UserImpl
	 * @see it.disim.mde.loreand.uber.impl.UberPackageImpl#getUser()
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
	 * The meta object id for the '{@link it.disim.mde.loreand.uber.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.mde.loreand.uber.impl.CustomerImpl
	 * @see it.disim.mde.loreand.uber.impl.UberPackageImpl#getCustomer()
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
	 * The feature id for the '<em><b>Card ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CARD_ID = USER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = USER_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.disim.mde.loreand.uber.impl.RiderImpl <em>Rider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.mde.loreand.uber.impl.RiderImpl
	 * @see it.disim.mde.loreand.uber.impl.UberPackageImpl#getRider()
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
	 * The feature id for the '<em><b>Car</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDER__CAR = USER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Rider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIDER_FEATURE_COUNT = USER_FEATURE_COUNT + 6;

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
	 * The meta object id for the '{@link it.disim.mde.loreand.uber.impl.GeolocationImpl <em>Geolocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.mde.loreand.uber.impl.GeolocationImpl
	 * @see it.disim.mde.loreand.uber.impl.UberPackageImpl#getGeolocation()
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
	 * The meta object id for the '{@link it.disim.mde.loreand.uber.impl.RouteImpl <em>Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.mde.loreand.uber.impl.RouteImpl
	 * @see it.disim.mde.loreand.uber.impl.UberPackageImpl#getRoute()
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
	 * The meta object id for the '{@link it.disim.mde.loreand.uber.impl.SupervisorImpl <em>Supervisor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.mde.loreand.uber.impl.SupervisorImpl
	 * @see it.disim.mde.loreand.uber.impl.UberPackageImpl#getSupervisor()
	 * @generated
	 */
	int SUPERVISOR = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISOR__ID = USER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISOR__NAME = USER__NAME;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISOR__SURNAME = USER__SURNAME;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISOR__EMAIL = USER__EMAIL;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISOR__FULL_NAME = USER__FULL_NAME;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISOR__ROLE = USER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Supervisor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISOR_FEATURE_COUNT = USER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Supervisor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISOR_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.disim.mde.loreand.uber.impl.CardIDImpl <em>Card ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.mde.loreand.uber.impl.CardIDImpl
	 * @see it.disim.mde.loreand.uber.impl.UberPackageImpl#getCardID()
	 * @generated
	 */
	int CARD_ID = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_ID__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_ID__PATH = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_ID__RELEASE_DATE = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Institution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_ID__INSTITUTION = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Approved</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_ID__APPROVED = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Card ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_ID_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Card ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_ID_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.disim.mde.loreand.uber.impl.CarImpl <em>Car</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.mde.loreand.uber.impl.CarImpl
	 * @see it.disim.mde.loreand.uber.impl.UberPackageImpl#getCar()
	 * @generated
	 */
	int CAR = 9;

	/**
	 * The feature id for the '<em><b>Licence Plate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__LICENCE_PLATE = 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__MODEL = 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__COLOR = 2;

	/**
	 * The number of structural features of the '<em>Car</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Car</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.disim.mde.loreand.uber.RiderStatus <em>Rider Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.mde.loreand.uber.RiderStatus
	 * @see it.disim.mde.loreand.uber.impl.UberPackageImpl#getRiderStatus()
	 * @generated
	 */
	int RIDER_STATUS = 10;

	/**
	 * The meta object id for the '{@link it.disim.mde.loreand.uber.RouteStatus <em>Route Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.mde.loreand.uber.RouteStatus
	 * @see it.disim.mde.loreand.uber.impl.UberPackageImpl#getRouteStatus()
	 * @generated
	 */
	int ROUTE_STATUS = 11;

	/**
	 * The meta object id for the '{@link it.disim.mde.loreand.uber.CustomerStatus <em>Customer Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.mde.loreand.uber.CustomerStatus
	 * @see it.disim.mde.loreand.uber.impl.UberPackageImpl#getCustomerStatus()
	 * @generated
	 */
	int CUSTOMER_STATUS = 12;

	/**
	 * The meta object id for the '{@link it.disim.mde.loreand.uber.RoleSupervisor <em>Role Supervisor</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.mde.loreand.uber.RoleSupervisor
	 * @see it.disim.mde.loreand.uber.impl.UberPackageImpl#getRoleSupervisor()
	 * @generated
	 */
	int ROLE_SUPERVISOR = 13;

	/**
	 * Returns the meta object for class '{@link it.disim.mde.loreand.uber.Uber <em>Uber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uber</em>'.
	 * @see it.disim.mde.loreand.uber.Uber
	 * @generated
	 */
	EClass getUber();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.mde.loreand.uber.Uber#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.disim.mde.loreand.uber.Uber#getName()
	 * @see #getUber()
	 * @generated
	 */
	EAttribute getUber_Name();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.mde.loreand.uber.Uber#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manager</em>'.
	 * @see it.disim.mde.loreand.uber.Uber#getManager()
	 * @see #getUber()
	 * @generated
	 */
	EAttribute getUber_Manager();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.mde.loreand.uber.Uber#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see it.disim.mde.loreand.uber.Uber#getAddress()
	 * @see #getUber()
	 * @generated
	 */
	EAttribute getUber_Address();

	/**
	 * Returns the meta object for the containment reference list '{@link it.disim.mde.loreand.uber.Uber#getCustomers <em>Customers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Customers</em>'.
	 * @see it.disim.mde.loreand.uber.Uber#getCustomers()
	 * @see #getUber()
	 * @generated
	 */
	EReference getUber_Customers();

	/**
	 * Returns the meta object for the containment reference list '{@link it.disim.mde.loreand.uber.Uber#getRiders <em>Riders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Riders</em>'.
	 * @see it.disim.mde.loreand.uber.Uber#getRiders()
	 * @see #getUber()
	 * @generated
	 */
	EReference getUber_Riders();

	/**
	 * Returns the meta object for the containment reference list '{@link it.disim.mde.loreand.uber.Uber#getRoutes <em>Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Routes</em>'.
	 * @see it.disim.mde.loreand.uber.Uber#getRoutes()
	 * @see #getUber()
	 * @generated
	 */
	EReference getUber_Routes();

	/**
	 * Returns the meta object for the containment reference list '{@link it.disim.mde.loreand.uber.Uber#getSupervisors <em>Supervisors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Supervisors</em>'.
	 * @see it.disim.mde.loreand.uber.Uber#getSupervisors()
	 * @see #getUber()
	 * @generated
	 */
	EReference getUber_Supervisors();

	/**
	 * Returns the meta object for class '{@link it.disim.mde.loreand.uber.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see it.disim.mde.loreand.uber.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.mde.loreand.uber.User#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.disim.mde.loreand.uber.User#getName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Name();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.mde.loreand.uber.User#getSurname <em>Surname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surname</em>'.
	 * @see it.disim.mde.loreand.uber.User#getSurname()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Surname();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.mde.loreand.uber.User#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see it.disim.mde.loreand.uber.User#getEmail()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Email();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.mde.loreand.uber.User#getFullName <em>Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Name</em>'.
	 * @see it.disim.mde.loreand.uber.User#getFullName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_FullName();

	/**
	 * Returns the meta object for class '{@link it.disim.mde.loreand.uber.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see it.disim.mde.loreand.uber.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.mde.loreand.uber.Customer#getSubscriptionDate <em>Subscription Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscription Date</em>'.
	 * @see it.disim.mde.loreand.uber.Customer#getSubscriptionDate()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_SubscriptionDate();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.mde.loreand.uber.Customer#getExpirationDate <em>Expiration Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiration Date</em>'.
	 * @see it.disim.mde.loreand.uber.Customer#getExpirationDate()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_ExpirationDate();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.mde.loreand.uber.Customer#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see it.disim.mde.loreand.uber.Customer#getStatus()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Status();

	/**
	 * Returns the meta object for the reference list '{@link it.disim.mde.loreand.uber.Customer#getRoutes <em>Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Routes</em>'.
	 * @see it.disim.mde.loreand.uber.Customer#getRoutes()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Routes();

	/**
	 * Returns the meta object for the containment reference '{@link it.disim.mde.loreand.uber.Customer#getCardID <em>Card ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Card ID</em>'.
	 * @see it.disim.mde.loreand.uber.Customer#getCardID()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_CardID();

	/**
	 * Returns the meta object for class '{@link it.disim.mde.loreand.uber.Rider <em>Rider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rider</em>'.
	 * @see it.disim.mde.loreand.uber.Rider
	 * @generated
	 */
	EClass getRider();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.mde.loreand.uber.Rider#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see it.disim.mde.loreand.uber.Rider#getStatus()
	 * @see #getRider()
	 * @generated
	 */
	EAttribute getRider_Status();

	/**
	 * Returns the meta object for the containment reference '{@link it.disim.mde.loreand.uber.Rider#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see it.disim.mde.loreand.uber.Rider#getLocation()
	 * @see #getRider()
	 * @generated
	 */
	EReference getRider_Location();

	/**
	 * Returns the meta object for the reference list '{@link it.disim.mde.loreand.uber.Rider#getRoutes <em>Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Routes</em>'.
	 * @see it.disim.mde.loreand.uber.Rider#getRoutes()
	 * @see #getRider()
	 * @generated
	 */
	EReference getRider_Routes();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.mde.loreand.uber.Rider#getCarriedOutRoutes <em>Carried Out Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Carried Out Routes</em>'.
	 * @see it.disim.mde.loreand.uber.Rider#getCarriedOutRoutes()
	 * @see #getRider()
	 * @generated
	 */
	EAttribute getRider_CarriedOutRoutes();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.mde.loreand.uber.Rider#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score</em>'.
	 * @see it.disim.mde.loreand.uber.Rider#getScore()
	 * @see #getRider()
	 * @generated
	 */
	EAttribute getRider_Score();

	/**
	 * Returns the meta object for the containment reference '{@link it.disim.mde.loreand.uber.Rider#getCar <em>Car</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Car</em>'.
	 * @see it.disim.mde.loreand.uber.Rider#getCar()
	 * @see #getRider()
	 * @generated
	 */
	EReference getRider_Car();

	/**
	 * Returns the meta object for the '{@link it.disim.mde.loreand.uber.Rider#CarriedOutCustomers() <em>Carried Out Customers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Carried Out Customers</em>' operation.
	 * @see it.disim.mde.loreand.uber.Rider#CarriedOutCustomers()
	 * @generated
	 */
	EOperation getRider__CarriedOutCustomers();

	/**
	 * Returns the meta object for the '{@link it.disim.mde.loreand.uber.Rider#isGoodEmployee() <em>Is Good Employee</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Good Employee</em>' operation.
	 * @see it.disim.mde.loreand.uber.Rider#isGoodEmployee()
	 * @generated
	 */
	EOperation getRider__IsGoodEmployee();

	/**
	 * Returns the meta object for class '{@link it.disim.mde.loreand.uber.Geolocation <em>Geolocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geolocation</em>'.
	 * @see it.disim.mde.loreand.uber.Geolocation
	 * @generated
	 */
	EClass getGeolocation();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.mde.loreand.uber.Geolocation#getLat <em>Lat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lat</em>'.
	 * @see it.disim.mde.loreand.uber.Geolocation#getLat()
	 * @see #getGeolocation()
	 * @generated
	 */
	EAttribute getGeolocation_Lat();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.mde.loreand.uber.Geolocation#getLng <em>Lng</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lng</em>'.
	 * @see it.disim.mde.loreand.uber.Geolocation#getLng()
	 * @see #getGeolocation()
	 * @generated
	 */
	EAttribute getGeolocation_Lng();

	/**
	 * Returns the meta object for class '{@link it.disim.mde.loreand.uber.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route</em>'.
	 * @see it.disim.mde.loreand.uber.Route
	 * @generated
	 */
	EClass getRoute();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.mde.loreand.uber.Route#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see it.disim.mde.loreand.uber.Route#getPrice()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Price();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.mde.loreand.uber.Route#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see it.disim.mde.loreand.uber.Route#getDate()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Date();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.mde.loreand.uber.Route#getStartAddress <em>Start Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Address</em>'.
	 * @see it.disim.mde.loreand.uber.Route#getStartAddress()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_StartAddress();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.mde.loreand.uber.Route#getEndAddress <em>End Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Address</em>'.
	 * @see it.disim.mde.loreand.uber.Route#getEndAddress()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_EndAddress();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.mde.loreand.uber.Route#getFeedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feedback</em>'.
	 * @see it.disim.mde.loreand.uber.Route#getFeedback()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Feedback();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.mde.loreand.uber.Route#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see it.disim.mde.loreand.uber.Route#getStatus()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Status();

	/**
	 * Returns the meta object for the reference '{@link it.disim.mde.loreand.uber.Route#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer</em>'.
	 * @see it.disim.mde.loreand.uber.Route#getCustomer()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Customer();

	/**
	 * Returns the meta object for the reference '{@link it.disim.mde.loreand.uber.Route#getRider <em>Rider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rider</em>'.
	 * @see it.disim.mde.loreand.uber.Route#getRider()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Rider();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.mde.loreand.uber.Route#getSeats <em>Seats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seats</em>'.
	 * @see it.disim.mde.loreand.uber.Route#getSeats()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Seats();

	/**
	 * Returns the meta object for class '{@link it.disim.mde.loreand.uber.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable</em>'.
	 * @see it.disim.mde.loreand.uber.Identifiable
	 * @generated
	 */
	EClass getIdentifiable();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.mde.loreand.uber.Identifiable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.disim.mde.loreand.uber.Identifiable#getId()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_Id();

	/**
	 * Returns the meta object for class '{@link it.disim.mde.loreand.uber.Supervisor <em>Supervisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supervisor</em>'.
	 * @see it.disim.mde.loreand.uber.Supervisor
	 * @generated
	 */
	EClass getSupervisor();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.mde.loreand.uber.Supervisor#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see it.disim.mde.loreand.uber.Supervisor#getRole()
	 * @see #getSupervisor()
	 * @generated
	 */
	EAttribute getSupervisor_Role();

	/**
	 * Returns the meta object for class '{@link it.disim.mde.loreand.uber.CardID <em>Card ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card ID</em>'.
	 * @see it.disim.mde.loreand.uber.CardID
	 * @generated
	 */
	EClass getCardID();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.mde.loreand.uber.CardID#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see it.disim.mde.loreand.uber.CardID#getPath()
	 * @see #getCardID()
	 * @generated
	 */
	EAttribute getCardID_Path();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.mde.loreand.uber.CardID#getReleaseDate <em>Release Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release Date</em>'.
	 * @see it.disim.mde.loreand.uber.CardID#getReleaseDate()
	 * @see #getCardID()
	 * @generated
	 */
	EAttribute getCardID_ReleaseDate();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.mde.loreand.uber.CardID#getInstitution <em>Institution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Institution</em>'.
	 * @see it.disim.mde.loreand.uber.CardID#getInstitution()
	 * @see #getCardID()
	 * @generated
	 */
	EAttribute getCardID_Institution();

	/**
	 * Returns the meta object for the reference '{@link it.disim.mde.loreand.uber.CardID#getApproved <em>Approved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Approved</em>'.
	 * @see it.disim.mde.loreand.uber.CardID#getApproved()
	 * @see #getCardID()
	 * @generated
	 */
	EReference getCardID_Approved();

	/**
	 * Returns the meta object for class '{@link it.disim.mde.loreand.uber.Car <em>Car</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Car</em>'.
	 * @see it.disim.mde.loreand.uber.Car
	 * @generated
	 */
	EClass getCar();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.mde.loreand.uber.Car#getLicencePlate <em>Licence Plate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Licence Plate</em>'.
	 * @see it.disim.mde.loreand.uber.Car#getLicencePlate()
	 * @see #getCar()
	 * @generated
	 */
	EAttribute getCar_LicencePlate();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.mde.loreand.uber.Car#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see it.disim.mde.loreand.uber.Car#getModel()
	 * @see #getCar()
	 * @generated
	 */
	EAttribute getCar_Model();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.mde.loreand.uber.Car#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see it.disim.mde.loreand.uber.Car#getColor()
	 * @see #getCar()
	 * @generated
	 */
	EAttribute getCar_Color();

	/**
	 * Returns the meta object for enum '{@link it.disim.mde.loreand.uber.RiderStatus <em>Rider Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rider Status</em>'.
	 * @see it.disim.mde.loreand.uber.RiderStatus
	 * @generated
	 */
	EEnum getRiderStatus();

	/**
	 * Returns the meta object for enum '{@link it.disim.mde.loreand.uber.RouteStatus <em>Route Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Route Status</em>'.
	 * @see it.disim.mde.loreand.uber.RouteStatus
	 * @generated
	 */
	EEnum getRouteStatus();

	/**
	 * Returns the meta object for enum '{@link it.disim.mde.loreand.uber.CustomerStatus <em>Customer Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Customer Status</em>'.
	 * @see it.disim.mde.loreand.uber.CustomerStatus
	 * @generated
	 */
	EEnum getCustomerStatus();

	/**
	 * Returns the meta object for enum '{@link it.disim.mde.loreand.uber.RoleSupervisor <em>Role Supervisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Role Supervisor</em>'.
	 * @see it.disim.mde.loreand.uber.RoleSupervisor
	 * @generated
	 */
	EEnum getRoleSupervisor();

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
		 * The meta object literal for the '{@link it.disim.mde.loreand.uber.impl.UberImpl <em>Uber</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.mde.loreand.uber.impl.UberImpl
		 * @see it.disim.mde.loreand.uber.impl.UberPackageImpl#getUber()
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
		 * The meta object literal for the '<em><b>Supervisors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBER__SUPERVISORS = eINSTANCE.getUber_Supervisors();

		/**
		 * The meta object literal for the '{@link it.disim.mde.loreand.uber.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.mde.loreand.uber.impl.UserImpl
		 * @see it.disim.mde.loreand.uber.impl.UberPackageImpl#getUser()
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
		 * The meta object literal for the '{@link it.disim.mde.loreand.uber.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.mde.loreand.uber.impl.CustomerImpl
		 * @see it.disim.mde.loreand.uber.impl.UberPackageImpl#getCustomer()
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
		 * The meta object literal for the '<em><b>Card ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__CARD_ID = eINSTANCE.getCustomer_CardID();

		/**
		 * The meta object literal for the '{@link it.disim.mde.loreand.uber.impl.RiderImpl <em>Rider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.mde.loreand.uber.impl.RiderImpl
		 * @see it.disim.mde.loreand.uber.impl.UberPackageImpl#getRider()
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
		 * The meta object literal for the '<em><b>Car</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIDER__CAR = eINSTANCE.getRider_Car();

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
		 * The meta object literal for the '{@link it.disim.mde.loreand.uber.impl.GeolocationImpl <em>Geolocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.mde.loreand.uber.impl.GeolocationImpl
		 * @see it.disim.mde.loreand.uber.impl.UberPackageImpl#getGeolocation()
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
		 * The meta object literal for the '{@link it.disim.mde.loreand.uber.impl.RouteImpl <em>Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.mde.loreand.uber.impl.RouteImpl
		 * @see it.disim.mde.loreand.uber.impl.UberPackageImpl#getRoute()
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
		 * The meta object literal for the '{@link it.disim.mde.loreand.uber.Identifiable <em>Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.mde.loreand.uber.Identifiable
		 * @see it.disim.mde.loreand.uber.impl.UberPackageImpl#getIdentifiable()
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
		 * The meta object literal for the '{@link it.disim.mde.loreand.uber.impl.SupervisorImpl <em>Supervisor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.mde.loreand.uber.impl.SupervisorImpl
		 * @see it.disim.mde.loreand.uber.impl.UberPackageImpl#getSupervisor()
		 * @generated
		 */
		EClass SUPERVISOR = eINSTANCE.getSupervisor();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPERVISOR__ROLE = eINSTANCE.getSupervisor_Role();

		/**
		 * The meta object literal for the '{@link it.disim.mde.loreand.uber.impl.CardIDImpl <em>Card ID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.mde.loreand.uber.impl.CardIDImpl
		 * @see it.disim.mde.loreand.uber.impl.UberPackageImpl#getCardID()
		 * @generated
		 */
		EClass CARD_ID = eINSTANCE.getCardID();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_ID__PATH = eINSTANCE.getCardID_Path();

		/**
		 * The meta object literal for the '<em><b>Release Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_ID__RELEASE_DATE = eINSTANCE.getCardID_ReleaseDate();

		/**
		 * The meta object literal for the '<em><b>Institution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_ID__INSTITUTION = eINSTANCE.getCardID_Institution();

		/**
		 * The meta object literal for the '<em><b>Approved</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD_ID__APPROVED = eINSTANCE.getCardID_Approved();

		/**
		 * The meta object literal for the '{@link it.disim.mde.loreand.uber.impl.CarImpl <em>Car</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.mde.loreand.uber.impl.CarImpl
		 * @see it.disim.mde.loreand.uber.impl.UberPackageImpl#getCar()
		 * @generated
		 */
		EClass CAR = eINSTANCE.getCar();

		/**
		 * The meta object literal for the '<em><b>Licence Plate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAR__LICENCE_PLATE = eINSTANCE.getCar_LicencePlate();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAR__MODEL = eINSTANCE.getCar_Model();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAR__COLOR = eINSTANCE.getCar_Color();

		/**
		 * The meta object literal for the '{@link it.disim.mde.loreand.uber.RiderStatus <em>Rider Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.mde.loreand.uber.RiderStatus
		 * @see it.disim.mde.loreand.uber.impl.UberPackageImpl#getRiderStatus()
		 * @generated
		 */
		EEnum RIDER_STATUS = eINSTANCE.getRiderStatus();

		/**
		 * The meta object literal for the '{@link it.disim.mde.loreand.uber.RouteStatus <em>Route Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.mde.loreand.uber.RouteStatus
		 * @see it.disim.mde.loreand.uber.impl.UberPackageImpl#getRouteStatus()
		 * @generated
		 */
		EEnum ROUTE_STATUS = eINSTANCE.getRouteStatus();

		/**
		 * The meta object literal for the '{@link it.disim.mde.loreand.uber.CustomerStatus <em>Customer Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.mde.loreand.uber.CustomerStatus
		 * @see it.disim.mde.loreand.uber.impl.UberPackageImpl#getCustomerStatus()
		 * @generated
		 */
		EEnum CUSTOMER_STATUS = eINSTANCE.getCustomerStatus();

		/**
		 * The meta object literal for the '{@link it.disim.mde.loreand.uber.RoleSupervisor <em>Role Supervisor</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.mde.loreand.uber.RoleSupervisor
		 * @see it.disim.mde.loreand.uber.impl.UberPackageImpl#getRoleSupervisor()
		 * @generated
		 */
		EEnum ROLE_SUPERVISOR = eINSTANCE.getRoleSupervisor();

	}

} //UberPackage
