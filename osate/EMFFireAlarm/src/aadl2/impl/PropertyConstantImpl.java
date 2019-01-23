/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.PropertyConstant;
import aadl2.PropertyExpression;
import aadl2.PropertyType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Constant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.PropertyConstantImpl#getPropertyType <em>Property Type</em>}</li>
 *   <li>{@link aadl2.impl.PropertyConstantImpl#getOwnedPropertyType <em>Owned Property Type</em>}</li>
 *   <li>{@link aadl2.impl.PropertyConstantImpl#getConstantValue <em>Constant Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyConstantImpl extends TypedElementImpl implements PropertyConstant {
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
	 * The cached value of the '{@link #getConstantValue() <em>Constant Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstantValue()
	 * @generated
	 * @ordered
	 */
	protected PropertyExpression constantValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyConstantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getPropertyConstant();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.PROPERTY_CONSTANT__PROPERTY_TYPE, oldPropertyType, propertyType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.PROPERTY_CONSTANT__PROPERTY_TYPE, oldPropertyType, propertyType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Aadl2Package.PROPERTY_CONSTANT__OWNED_PROPERTY_TYPE, oldOwnedPropertyType, newOwnedPropertyType);
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
				msgs = ((InternalEObject)ownedPropertyType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.PROPERTY_CONSTANT__OWNED_PROPERTY_TYPE, null, msgs);
			if (newOwnedPropertyType != null)
				msgs = ((InternalEObject)newOwnedPropertyType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.PROPERTY_CONSTANT__OWNED_PROPERTY_TYPE, null, msgs);
			msgs = basicSetOwnedPropertyType(newOwnedPropertyType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.PROPERTY_CONSTANT__OWNED_PROPERTY_TYPE, newOwnedPropertyType, newOwnedPropertyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyExpression getConstantValue() {
		return constantValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstantValue(PropertyExpression newConstantValue, NotificationChain msgs) {
		PropertyExpression oldConstantValue = constantValue;
		constantValue = newConstantValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Aadl2Package.PROPERTY_CONSTANT__CONSTANT_VALUE, oldConstantValue, newConstantValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstantValue(PropertyExpression newConstantValue) {
		if (newConstantValue != constantValue) {
			NotificationChain msgs = null;
			if (constantValue != null)
				msgs = ((InternalEObject)constantValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.PROPERTY_CONSTANT__CONSTANT_VALUE, null, msgs);
			if (newConstantValue != null)
				msgs = ((InternalEObject)newConstantValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.PROPERTY_CONSTANT__CONSTANT_VALUE, null, msgs);
			msgs = basicSetConstantValue(newConstantValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.PROPERTY_CONSTANT__CONSTANT_VALUE, newConstantValue, newConstantValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Aadl2Package.PROPERTY_CONSTANT__OWNED_PROPERTY_TYPE:
				return basicSetOwnedPropertyType(null, msgs);
			case Aadl2Package.PROPERTY_CONSTANT__CONSTANT_VALUE:
				return basicSetConstantValue(null, msgs);
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
			case Aadl2Package.PROPERTY_CONSTANT__PROPERTY_TYPE:
				if (resolve) return getPropertyType();
				return basicGetPropertyType();
			case Aadl2Package.PROPERTY_CONSTANT__OWNED_PROPERTY_TYPE:
				return getOwnedPropertyType();
			case Aadl2Package.PROPERTY_CONSTANT__CONSTANT_VALUE:
				return getConstantValue();
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
			case Aadl2Package.PROPERTY_CONSTANT__PROPERTY_TYPE:
				setPropertyType((PropertyType)newValue);
				return;
			case Aadl2Package.PROPERTY_CONSTANT__OWNED_PROPERTY_TYPE:
				setOwnedPropertyType((PropertyType)newValue);
				return;
			case Aadl2Package.PROPERTY_CONSTANT__CONSTANT_VALUE:
				setConstantValue((PropertyExpression)newValue);
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
			case Aadl2Package.PROPERTY_CONSTANT__PROPERTY_TYPE:
				setPropertyType((PropertyType)null);
				return;
			case Aadl2Package.PROPERTY_CONSTANT__OWNED_PROPERTY_TYPE:
				setOwnedPropertyType((PropertyType)null);
				return;
			case Aadl2Package.PROPERTY_CONSTANT__CONSTANT_VALUE:
				setConstantValue((PropertyExpression)null);
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
			case Aadl2Package.PROPERTY_CONSTANT__PROPERTY_TYPE:
				return propertyType != null;
			case Aadl2Package.PROPERTY_CONSTANT__OWNED_PROPERTY_TYPE:
				return ownedPropertyType != null;
			case Aadl2Package.PROPERTY_CONSTANT__CONSTANT_VALUE:
				return constantValue != null;
		}
		return super.eIsSet(featureID);
	}

} //PropertyConstantImpl
