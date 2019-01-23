/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.ClassifierType;
import aadl2.MetaclassReference;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.ClassifierTypeImpl#getClassifierReference <em>Classifier Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassifierTypeImpl extends NonListTypeImpl implements ClassifierType {
	/**
	 * The cached value of the '{@link #getClassifierReference() <em>Classifier Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierReference()
	 * @generated
	 * @ordered
	 */
	protected EList<MetaclassReference> classifierReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getClassifierType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetaclassReference> getClassifierReference() {
		if (classifierReference == null) {
			classifierReference = new EObjectContainmentEList<MetaclassReference>(MetaclassReference.class, this, Aadl2Package.CLASSIFIER_TYPE__CLASSIFIER_REFERENCE);
		}
		return classifierReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Aadl2Package.CLASSIFIER_TYPE__CLASSIFIER_REFERENCE:
				return ((InternalEList<?>)getClassifierReference()).basicRemove(otherEnd, msgs);
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
			case Aadl2Package.CLASSIFIER_TYPE__CLASSIFIER_REFERENCE:
				return getClassifierReference();
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
			case Aadl2Package.CLASSIFIER_TYPE__CLASSIFIER_REFERENCE:
				getClassifierReference().clear();
				getClassifierReference().addAll((Collection<? extends MetaclassReference>)newValue);
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
			case Aadl2Package.CLASSIFIER_TYPE__CLASSIFIER_REFERENCE:
				getClassifierReference().clear();
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
			case Aadl2Package.CLASSIFIER_TYPE__CLASSIFIER_REFERENCE:
				return classifierReference != null && !classifierReference.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClassifierTypeImpl
