/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.DataClassifier;
import aadl2.DirectionType;
import aadl2.PortProxy;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Proxy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.PortProxyImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link aadl2.impl.PortProxyImpl#getDataClassifier <em>Data Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortProxyImpl extends ProcessorFeatureImpl implements PortProxy {
	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final DirectionType DIRECTION_EDEFAULT = DirectionType.IN;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected DirectionType direction = DIRECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataClassifier() <em>Data Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataClassifier()
	 * @generated
	 * @ordered
	 */
	protected DataClassifier dataClassifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortProxyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getPortProxy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionType getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(DirectionType newDirection) {
		DirectionType oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.PORT_PROXY__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataClassifier getDataClassifier() {
		if (dataClassifier != null && dataClassifier.eIsProxy()) {
			InternalEObject oldDataClassifier = (InternalEObject)dataClassifier;
			dataClassifier = (DataClassifier)eResolveProxy(oldDataClassifier);
			if (dataClassifier != oldDataClassifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.PORT_PROXY__DATA_CLASSIFIER, oldDataClassifier, dataClassifier));
			}
		}
		return dataClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataClassifier basicGetDataClassifier() {
		return dataClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataClassifier(DataClassifier newDataClassifier) {
		DataClassifier oldDataClassifier = dataClassifier;
		dataClassifier = newDataClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.PORT_PROXY__DATA_CLASSIFIER, oldDataClassifier, dataClassifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.PORT_PROXY__DIRECTION:
				return getDirection();
			case Aadl2Package.PORT_PROXY__DATA_CLASSIFIER:
				if (resolve) return getDataClassifier();
				return basicGetDataClassifier();
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
			case Aadl2Package.PORT_PROXY__DIRECTION:
				setDirection((DirectionType)newValue);
				return;
			case Aadl2Package.PORT_PROXY__DATA_CLASSIFIER:
				setDataClassifier((DataClassifier)newValue);
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
			case Aadl2Package.PORT_PROXY__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case Aadl2Package.PORT_PROXY__DATA_CLASSIFIER:
				setDataClassifier((DataClassifier)null);
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
			case Aadl2Package.PORT_PROXY__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case Aadl2Package.PORT_PROXY__DATA_CLASSIFIER:
				return dataClassifier != null;
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
		result.append(" (direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //PortProxyImpl
