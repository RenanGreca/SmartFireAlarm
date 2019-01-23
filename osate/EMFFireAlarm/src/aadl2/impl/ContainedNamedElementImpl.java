/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.ContainedNamedElement;
import aadl2.ContainmentPathElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contained Named Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.ContainedNamedElementImpl#getContainmentPathElement <em>Containment Path Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainedNamedElementImpl extends ElementImpl implements ContainedNamedElement {
	/**
	 * The cached value of the '{@link #getContainmentPathElement() <em>Containment Path Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainmentPathElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainmentPathElement> containmentPathElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainedNamedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getContainedNamedElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContainmentPathElement> getContainmentPathElement() {
		if (containmentPathElement == null) {
			containmentPathElement = new EObjectContainmentEList<ContainmentPathElement>(ContainmentPathElement.class, this, Aadl2Package.CONTAINED_NAMED_ELEMENT__CONTAINMENT_PATH_ELEMENT);
		}
		return containmentPathElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Aadl2Package.CONTAINED_NAMED_ELEMENT__CONTAINMENT_PATH_ELEMENT:
				return ((InternalEList<?>)getContainmentPathElement()).basicRemove(otherEnd, msgs);
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
			case Aadl2Package.CONTAINED_NAMED_ELEMENT__CONTAINMENT_PATH_ELEMENT:
				return getContainmentPathElement();
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
			case Aadl2Package.CONTAINED_NAMED_ELEMENT__CONTAINMENT_PATH_ELEMENT:
				getContainmentPathElement().clear();
				getContainmentPathElement().addAll((Collection<? extends ContainmentPathElement>)newValue);
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
			case Aadl2Package.CONTAINED_NAMED_ELEMENT__CONTAINMENT_PATH_ELEMENT:
				getContainmentPathElement().clear();
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
			case Aadl2Package.CONTAINED_NAMED_ELEMENT__CONTAINMENT_PATH_ELEMENT:
				return containmentPathElement != null && !containmentPathElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContainedNamedElementImpl
