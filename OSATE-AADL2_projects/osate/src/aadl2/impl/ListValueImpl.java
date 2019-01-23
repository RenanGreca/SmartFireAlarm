/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.ListValue;
import aadl2.PropertyExpression;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.ListValueImpl#getOwnedListElement <em>Owned List Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListValueImpl extends PropertyExpressionImpl implements ListValue {
	/**
	 * The cached value of the '{@link #getOwnedListElement() <em>Owned List Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedListElement()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyExpression> ownedListElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getListValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyExpression> getOwnedListElement() {
		if (ownedListElement == null) {
			ownedListElement = new EObjectContainmentEList<PropertyExpression>(PropertyExpression.class, this, Aadl2Package.LIST_VALUE__OWNED_LIST_ELEMENT);
		}
		return ownedListElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Aadl2Package.LIST_VALUE__OWNED_LIST_ELEMENT:
				return ((InternalEList<?>)getOwnedListElement()).basicRemove(otherEnd, msgs);
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
			case Aadl2Package.LIST_VALUE__OWNED_LIST_ELEMENT:
				return getOwnedListElement();
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
			case Aadl2Package.LIST_VALUE__OWNED_LIST_ELEMENT:
				getOwnedListElement().clear();
				getOwnedListElement().addAll((Collection<? extends PropertyExpression>)newValue);
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
			case Aadl2Package.LIST_VALUE__OWNED_LIST_ELEMENT:
				getOwnedListElement().clear();
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
			case Aadl2Package.LIST_VALUE__OWNED_LIST_ELEMENT:
				return ownedListElement != null && !ownedListElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListValueImpl
