/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.BasicProperty;
import aadl2.PropertyType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.BasicPropertyImpl#getPropertyType <em>Property Type</em>}</li>
 *   <li>{@link aadl2.impl.BasicPropertyImpl#getOwnedPropertyType <em>Owned Property Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BasicPropertyImpl extends TypedElementImpl implements BasicProperty {
	/**
	 * The cached value of the '{@link #getPropertyType() <em>Property Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyType()
	 * @generated
	 * @ordered
	 */
	protected PropertyType propertyType;

	/**
	 * The cached value of the '{@link #getOwnedPropertyType() <em>Owned Property Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPropertyType()
	 * @generated
	 * @ordered
	 */
	protected PropertyType ownedPropertyType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getBasicProperty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType getPropertyType() {
		if (propertyType != null && propertyType.eIsProxy()) {
			InternalEObject oldPropertyType = (InternalEObject)propertyType;
			propertyType = (PropertyType)eResolveProxy(oldPropertyType);
			if (propertyType != oldPropertyType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.BASIC_PROPERTY__PROPERTY_TYPE, oldPropertyType, propertyType));
			}
		}
		return propertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType basicGetPropertyType() {
		return propertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyType(PropertyType newPropertyType) {
		PropertyType oldPropertyType = propertyType;
		propertyType = newPropertyType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.BASIC_PROPERTY__PROPERTY_TYPE, oldPropertyType, propertyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType getOwnedPropertyType() {
		return ownedPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedPropertyType(PropertyType newOwnedPropertyType, NotificationChain msgs) {
		PropertyType oldOwnedPropertyType = ownedPropertyType;
		ownedPropertyType = newOwnedPropertyType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Aadl2Package.BASIC_PROPERTY__OWNED_PROPERTY_TYPE, oldOwnedPropertyType, newOwnedPropertyType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedPropertyType(PropertyType newOwnedPropertyType) {
		if (newOwnedPropertyType != ownedPropertyType) {
			NotificationChain msgs = null;
			if (ownedPropertyType != null)
				msgs = ((InternalEObject)ownedPropertyType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.BASIC_PROPERTY__OWNED_PROPERTY_TYPE, null, msgs);
			if (newOwnedPropertyType != null)
				msgs = ((InternalEObject)newOwnedPropertyType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.BASIC_PROPERTY__OWNED_PROPERTY_TYPE, null, msgs);
			msgs = basicSetOwnedPropertyType(newOwnedPropertyType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.BASIC_PROPERTY__OWNED_PROPERTY_TYPE, newOwnedPropertyType, newOwnedPropertyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Aadl2Package.BASIC_PROPERTY__OWNED_PROPERTY_TYPE:
				return basicSetOwnedPropertyType(null, msgs);
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
			case Aadl2Package.BASIC_PROPERTY__PROPERTY_TYPE:
				if (resolve) return getPropertyType();
				return basicGetPropertyType();
			case Aadl2Package.BASIC_PROPERTY__OWNED_PROPERTY_TYPE:
				return getOwnedPropertyType();
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
			case Aadl2Package.BASIC_PROPERTY__PROPERTY_TYPE:
				setPropertyType((PropertyType)newValue);
				return;
			case Aadl2Package.BASIC_PROPERTY__OWNED_PROPERTY_TYPE:
				setOwnedPropertyType((PropertyType)newValue);
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
			case Aadl2Package.BASIC_PROPERTY__PROPERTY_TYPE:
				setPropertyType((PropertyType)null);
				return;
			case Aadl2Package.BASIC_PROPERTY__OWNED_PROPERTY_TYPE:
				setOwnedPropertyType((PropertyType)null);
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
			case Aadl2Package.BASIC_PROPERTY__PROPERTY_TYPE:
				return propertyType != null;
			case Aadl2Package.BASIC_PROPERTY__OWNED_PROPERTY_TYPE:
				return ownedPropertyType != null;
		}
		return super.eIsSet(featureID);
	}

} //BasicPropertyImpl
