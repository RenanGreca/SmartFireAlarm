/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.AbstractFeature;
import aadl2.FeaturePrototype;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.AbstractFeatureImpl#getFeaturePrototype <em>Feature Prototype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractFeatureImpl extends DirectedFeatureImpl implements AbstractFeature {
	/**
	 * The cached value of the '{@link #getFeaturePrototype() <em>Feature Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeaturePrototype()
	 * @generated
	 * @ordered
	 */
	protected FeaturePrototype featurePrototype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getAbstractFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturePrototype getFeaturePrototype() {
		if (featurePrototype != null && featurePrototype.eIsProxy()) {
			InternalEObject oldFeaturePrototype = (InternalEObject)featurePrototype;
			featurePrototype = (FeaturePrototype)eResolveProxy(oldFeaturePrototype);
			if (featurePrototype != oldFeaturePrototype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.ABSTRACT_FEATURE__FEATURE_PROTOTYPE, oldFeaturePrototype, featurePrototype));
			}
		}
		return featurePrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturePrototype basicGetFeaturePrototype() {
		return featurePrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeaturePrototype(FeaturePrototype newFeaturePrototype) {
		FeaturePrototype oldFeaturePrototype = featurePrototype;
		featurePrototype = newFeaturePrototype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.ABSTRACT_FEATURE__FEATURE_PROTOTYPE, oldFeaturePrototype, featurePrototype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.ABSTRACT_FEATURE__FEATURE_PROTOTYPE:
				if (resolve) return getFeaturePrototype();
				return basicGetFeaturePrototype();
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
			case Aadl2Package.ABSTRACT_FEATURE__FEATURE_PROTOTYPE:
				setFeaturePrototype((FeaturePrototype)newValue);
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
			case Aadl2Package.ABSTRACT_FEATURE__FEATURE_PROTOTYPE:
				setFeaturePrototype((FeaturePrototype)null);
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
			case Aadl2Package.ABSTRACT_FEATURE__FEATURE_PROTOTYPE:
				return featurePrototype != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractFeatureImpl
