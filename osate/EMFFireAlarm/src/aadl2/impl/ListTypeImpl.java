/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.ListType;
import aadl2.PropertyType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.ListTypeImpl#getOwnedElementType <em>Owned Element Type</em>}</li>
 *   <li>{@link aadl2.impl.ListTypeImpl#getElementType <em>Element Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListTypeImpl extends PropertyTypeImpl implements ListType {
	/**
	 * The cached value of the '{@link #getOwnedElementType() <em>Owned Element Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElementType()
	 * @generated
	 * @ordered
	 */
	protected PropertyType ownedElementType;

	/**
	 * The cached value of the '{@link #getElementType() <em>Element Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected PropertyType elementType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getListType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType getOwnedElementType() {
		return ownedElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedElementType(PropertyType newOwnedElementType, NotificationChain msgs) {
		PropertyType oldOwnedElementType = ownedElementType;
		ownedElementType = newOwnedElementType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Aadl2Package.LIST_TYPE__OWNED_ELEMENT_TYPE, oldOwnedElementType, newOwnedElementType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedElementType(PropertyType newOwnedElementType) {
		if (newOwnedElementType != ownedElementType) {
			NotificationChain msgs = null;
			if (ownedElementType != null)
				msgs = ((InternalEObject)ownedElementType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.LIST_TYPE__OWNED_ELEMENT_TYPE, null, msgs);
			if (newOwnedElementType != null)
				msgs = ((InternalEObject)newOwnedElementType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.LIST_TYPE__OWNED_ELEMENT_TYPE, null, msgs);
			msgs = basicSetOwnedElementType(newOwnedElementType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.LIST_TYPE__OWNED_ELEMENT_TYPE, newOwnedElementType, newOwnedElementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType getElementType() {
		if (elementType != null && elementType.eIsProxy()) {
			InternalEObject oldElementType = (InternalEObject)elementType;
			elementType = (PropertyType)eResolveProxy(oldElementType);
			if (elementType != oldElementType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.LIST_TYPE__ELEMENT_TYPE, oldElementType, elementType));
			}
		}
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType basicGetElementType() {
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementType(PropertyType newElementType) {
		PropertyType oldElementType = elementType;
		elementType = newElementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.LIST_TYPE__ELEMENT_TYPE, oldElementType, elementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Aadl2Package.LIST_TYPE__OWNED_ELEMENT_TYPE:
				return basicSetOwnedElementType(null, msgs);
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
			case Aadl2Package.LIST_TYPE__OWNED_ELEMENT_TYPE:
				return getOwnedElementType();
			case Aadl2Package.LIST_TYPE__ELEMENT_TYPE:
				if (resolve) return getElementType();
				return basicGetElementType();
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
			case Aadl2Package.LIST_TYPE__OWNED_ELEMENT_TYPE:
				setOwnedElementType((PropertyType)newValue);
				return;
			case Aadl2Package.LIST_TYPE__ELEMENT_TYPE:
				setElementType((PropertyType)newValue);
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
			case Aadl2Package.LIST_TYPE__OWNED_ELEMENT_TYPE:
				setOwnedElementType((PropertyType)null);
				return;
			case Aadl2Package.LIST_TYPE__ELEMENT_TYPE:
				setElementType((PropertyType)null);
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
			case Aadl2Package.LIST_TYPE__OWNED_ELEMENT_TYPE:
				return ownedElementType != null;
			case Aadl2Package.LIST_TYPE__ELEMENT_TYPE:
				return elementType != null;
		}
		return super.eIsSet(featureID);
	}

} //ListTypeImpl
