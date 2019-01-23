/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.BusAccess;
import aadl2.BusSubcomponentType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bus Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.BusAccessImpl#getBusFeatureClassifier <em>Bus Feature Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusAccessImpl extends AccessImpl implements BusAccess {
	/**
	 * The cached value of the '{@link #getBusFeatureClassifier() <em>Bus Feature Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusFeatureClassifier()
	 * @generated
	 * @ordered
	 */
	protected BusSubcomponentType busFeatureClassifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getBusAccess();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusSubcomponentType getBusFeatureClassifier() {
		if (busFeatureClassifier != null && busFeatureClassifier.eIsProxy()) {
			InternalEObject oldBusFeatureClassifier = (InternalEObject)busFeatureClassifier;
			busFeatureClassifier = (BusSubcomponentType)eResolveProxy(oldBusFeatureClassifier);
			if (busFeatureClassifier != oldBusFeatureClassifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.BUS_ACCESS__BUS_FEATURE_CLASSIFIER, oldBusFeatureClassifier, busFeatureClassifier));
			}
		}
		return busFeatureClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusSubcomponentType basicGetBusFeatureClassifier() {
		return busFeatureClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusFeatureClassifier(BusSubcomponentType newBusFeatureClassifier) {
		BusSubcomponentType oldBusFeatureClassifier = busFeatureClassifier;
		busFeatureClassifier = newBusFeatureClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.BUS_ACCESS__BUS_FEATURE_CLASSIFIER, oldBusFeatureClassifier, busFeatureClassifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.BUS_ACCESS__BUS_FEATURE_CLASSIFIER:
				if (resolve) return getBusFeatureClassifier();
				return basicGetBusFeatureClassifier();
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
			case Aadl2Package.BUS_ACCESS__BUS_FEATURE_CLASSIFIER:
				setBusFeatureClassifier((BusSubcomponentType)newValue);
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
			case Aadl2Package.BUS_ACCESS__BUS_FEATURE_CLASSIFIER:
				setBusFeatureClassifier((BusSubcomponentType)null);
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
			case Aadl2Package.BUS_ACCESS__BUS_FEATURE_CLASSIFIER:
				return busFeatureClassifier != null;
		}
		return super.eIsSet(featureID);
	}

} //BusAccessImpl
