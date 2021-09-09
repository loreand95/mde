/**
 */
package taxi.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import taxi.Geolocation;
import taxi.TaxiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geolocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link taxi.impl.GeolocationImpl#getLat <em>Lat</em>}</li>
 *   <li>{@link taxi.impl.GeolocationImpl#getLng <em>Lng</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeolocationImpl extends MinimalEObjectImpl.Container implements Geolocation {
	/**
	 * The default value of the '{@link #getLat() <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLat()
	 * @generated
	 * @ordered
	 */
	protected static final double LAT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLat() <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLat()
	 * @generated
	 * @ordered
	 */
	protected double lat = LAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLng() <em>Lng</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLng()
	 * @generated
	 * @ordered
	 */
	protected static final double LNG_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLng() <em>Lng</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLng()
	 * @generated
	 * @ordered
	 */
	protected double lng = LNG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeolocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxiPackage.Literals.GEOLOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLat() {
		return lat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLat(double newLat) {
		double oldLat = lat;
		lat = newLat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxiPackage.GEOLOCATION__LAT, oldLat, lat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLng() {
		return lng;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLng(double newLng) {
		double oldLng = lng;
		lng = newLng;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxiPackage.GEOLOCATION__LNG, oldLng, lng));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaxiPackage.GEOLOCATION__LAT:
				return getLat();
			case TaxiPackage.GEOLOCATION__LNG:
				return getLng();
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
			case TaxiPackage.GEOLOCATION__LAT:
				setLat((Double)newValue);
				return;
			case TaxiPackage.GEOLOCATION__LNG:
				setLng((Double)newValue);
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
			case TaxiPackage.GEOLOCATION__LAT:
				setLat(LAT_EDEFAULT);
				return;
			case TaxiPackage.GEOLOCATION__LNG:
				setLng(LNG_EDEFAULT);
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
			case TaxiPackage.GEOLOCATION__LAT:
				return lat != LAT_EDEFAULT;
			case TaxiPackage.GEOLOCATION__LNG:
				return lng != LNG_EDEFAULT;
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
		result.append(" (lat: ");
		result.append(lat);
		result.append(", lng: ");
		result.append(lng);
		result.append(')');
		return result.toString();
	}

} //GeolocationImpl
