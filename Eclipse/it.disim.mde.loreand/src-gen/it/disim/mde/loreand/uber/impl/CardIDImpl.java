/**
 */
package it.disim.mde.loreand.uber.impl;

import it.disim.mde.loreand.uber.CardID;
import it.disim.mde.loreand.uber.Supervisor;
import it.disim.mde.loreand.uber.UberPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Card ID</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.disim.mde.loreand.uber.impl.CardIDImpl#getId <em>Id</em>}</li>
 *   <li>{@link it.disim.mde.loreand.uber.impl.CardIDImpl#getPath <em>Path</em>}</li>
 *   <li>{@link it.disim.mde.loreand.uber.impl.CardIDImpl#getReleaseDate <em>Release Date</em>}</li>
 *   <li>{@link it.disim.mde.loreand.uber.impl.CardIDImpl#getInstitution <em>Institution</em>}</li>
 *   <li>{@link it.disim.mde.loreand.uber.impl.CardIDImpl#getApproved <em>Approved</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CardIDImpl extends MinimalEObjectImpl.Container implements CardID {
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
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getReleaseDate() <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseDate()
	 * @generated
	 * @ordered
	 */
	protected static final String RELEASE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReleaseDate() <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseDate()
	 * @generated
	 * @ordered
	 */
	protected String releaseDate = RELEASE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstitution() <em>Institution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitution()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTITUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstitution() <em>Institution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitution()
	 * @generated
	 * @ordered
	 */
	protected String institution = INSTITUTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getApproved() <em>Approved</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApproved()
	 * @generated
	 * @ordered
	 */
	protected Supervisor approved;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardIDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UberPackage.Literals.CARD_ID;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UberPackage.CARD_ID__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UberPackage.CARD_ID__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReleaseDate() {
		return releaseDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReleaseDate(String newReleaseDate) {
		String oldReleaseDate = releaseDate;
		releaseDate = newReleaseDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UberPackage.CARD_ID__RELEASE_DATE, oldReleaseDate,
					releaseDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstitution() {
		return institution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstitution(String newInstitution) {
		String oldInstitution = institution;
		institution = newInstitution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UberPackage.CARD_ID__INSTITUTION, oldInstitution,
					institution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Supervisor getApproved() {
		if (approved != null && approved.eIsProxy()) {
			InternalEObject oldApproved = (InternalEObject) approved;
			approved = (Supervisor) eResolveProxy(oldApproved);
			if (approved != oldApproved) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UberPackage.CARD_ID__APPROVED,
							oldApproved, approved));
			}
		}
		return approved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Supervisor basicGetApproved() {
		return approved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApproved(Supervisor newApproved) {
		Supervisor oldApproved = approved;
		approved = newApproved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UberPackage.CARD_ID__APPROVED, oldApproved,
					approved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UberPackage.CARD_ID__ID:
			return getId();
		case UberPackage.CARD_ID__PATH:
			return getPath();
		case UberPackage.CARD_ID__RELEASE_DATE:
			return getReleaseDate();
		case UberPackage.CARD_ID__INSTITUTION:
			return getInstitution();
		case UberPackage.CARD_ID__APPROVED:
			if (resolve)
				return getApproved();
			return basicGetApproved();
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
		case UberPackage.CARD_ID__ID:
			setId((String) newValue);
			return;
		case UberPackage.CARD_ID__PATH:
			setPath((String) newValue);
			return;
		case UberPackage.CARD_ID__RELEASE_DATE:
			setReleaseDate((String) newValue);
			return;
		case UberPackage.CARD_ID__INSTITUTION:
			setInstitution((String) newValue);
			return;
		case UberPackage.CARD_ID__APPROVED:
			setApproved((Supervisor) newValue);
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
		case UberPackage.CARD_ID__ID:
			setId(ID_EDEFAULT);
			return;
		case UberPackage.CARD_ID__PATH:
			setPath(PATH_EDEFAULT);
			return;
		case UberPackage.CARD_ID__RELEASE_DATE:
			setReleaseDate(RELEASE_DATE_EDEFAULT);
			return;
		case UberPackage.CARD_ID__INSTITUTION:
			setInstitution(INSTITUTION_EDEFAULT);
			return;
		case UberPackage.CARD_ID__APPROVED:
			setApproved((Supervisor) null);
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
		case UberPackage.CARD_ID__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case UberPackage.CARD_ID__PATH:
			return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
		case UberPackage.CARD_ID__RELEASE_DATE:
			return RELEASE_DATE_EDEFAULT == null ? releaseDate != null : !RELEASE_DATE_EDEFAULT.equals(releaseDate);
		case UberPackage.CARD_ID__INSTITUTION:
			return INSTITUTION_EDEFAULT == null ? institution != null : !INSTITUTION_EDEFAULT.equals(institution);
		case UberPackage.CARD_ID__APPROVED:
			return approved != null;
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
		result.append(", path: ");
		result.append(path);
		result.append(", releaseDate: ");
		result.append(releaseDate);
		result.append(", institution: ");
		result.append(institution);
		result.append(')');
		return result.toString();
	}

} //CardIDImpl
