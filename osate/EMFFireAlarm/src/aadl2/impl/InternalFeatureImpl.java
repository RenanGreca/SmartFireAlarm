/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.ConnectionEnd;
import aadl2.DirectionType;
import aadl2.FeatureConnectionEnd;
import aadl2.InternalFeature;
import aadl2.ModalElement;
import aadl2.Mode;
import aadl2.PortConnectionEnd;
import aadl2.TriggerPort;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Internal Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.InternalFeatureImpl#getInMode <em>In Mode</em>}</li>
 *   <li>{@link aadl2.impl.InternalFeatureImpl#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InternalFeatureImpl extends StructuralFeatureImpl implements InternalFeature {
	/**
	 * The cached value of the '{@link #getInMode() <em>In Mode</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInMode()
	 * @generated
	 * @ordered
	 */
	protected EList<Mode> inMode;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getInternalFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mode> getInMode() {
		if (inMode == null) {
			inMode = new EObjectResolvingEList<Mode>(Mode.class, this, Aadl2Package.INTERNAL_FEATURE__IN_MODE);
		}
		return inMode;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.INTERNAL_FEATURE__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mode> getAllInModes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.INTERNAL_FEATURE__IN_MODE:
				return getInMode();
			case Aadl2Package.INTERNAL_FEATURE__DIRECTION:
				return getDirection();
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
			case Aadl2Package.INTERNAL_FEATURE__IN_MODE:
				getInMode().clear();
				getInMode().addAll((Collection<? extends Mode>)newValue);
				return;
			case Aadl2Package.INTERNAL_FEATURE__DIRECTION:
				setDirection((DirectionType)newValue);
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
			case Aadl2Package.INTERNAL_FEATURE__IN_MODE:
				getInMode().clear();
				return;
			case Aadl2Package.INTERNAL_FEATURE__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
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
			case Aadl2Package.INTERNAL_FEATURE__IN_MODE:
				return inMode != null && !inMode.isEmpty();
			case Aadl2Package.INTERNAL_FEATURE__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ModalElement.class) {
			switch (derivedFeatureID) {
				case Aadl2Package.INTERNAL_FEATURE__IN_MODE: return Aadl2Package.MODAL_ELEMENT__IN_MODE;
				default: return -1;
			}
		}
		if (baseClass == ConnectionEnd.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == FeatureConnectionEnd.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PortConnectionEnd.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == TriggerPort.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ModalElement.class) {
			switch (baseFeatureID) {
				case Aadl2Package.MODAL_ELEMENT__IN_MODE: return Aadl2Package.INTERNAL_FEATURE__IN_MODE;
				default: return -1;
			}
		}
		if (baseClass == ConnectionEnd.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == FeatureConnectionEnd.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PortConnectionEnd.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == TriggerPort.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ModalElement.class) {
			switch (baseOperationID) {
				case Aadl2Package.MODAL_ELEMENT___GET_ALL_IN_MODES: return Aadl2Package.INTERNAL_FEATURE___GET_ALL_IN_MODES;
				default: return -1;
			}
		}
		if (baseClass == ConnectionEnd.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == FeatureConnectionEnd.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == PortConnectionEnd.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == TriggerPort.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Aadl2Package.INTERNAL_FEATURE___GET_ALL_IN_MODES:
				return getAllInModes();
		}
		return super.eInvoke(operationID, arguments);
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

} //InternalFeatureImpl
