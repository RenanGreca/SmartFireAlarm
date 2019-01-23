/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.ComponentClassifier;
import aadl2.ComponentPrototype;
import aadl2.FeatureClassifier;
import aadl2.SubcomponentType;
import aadl2.Type;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Prototype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.ComponentPrototypeImpl#isArray <em>Array</em>}</li>
 *   <li>{@link aadl2.impl.ComponentPrototypeImpl#getConstrainingClassifier <em>Constraining Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComponentPrototypeImpl extends PrototypeImpl implements ComponentPrototype {
	/**
	 * The default value of the '{@link #isArray() <em>Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArray()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ARRAY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isArray() <em>Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArray()
	 * @generated
	 * @ordered
	 */
	protected boolean array = ARRAY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConstrainingClassifier() <em>Constraining Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainingClassifier()
	 * @generated
	 * @ordered
	 */
	protected ComponentClassifier constrainingClassifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentPrototypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getComponentPrototype();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isArray() {
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArray(boolean newArray) {
		boolean oldArray = array;
		array = newArray;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.COMPONENT_PROTOTYPE__ARRAY, oldArray, array));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentClassifier getConstrainingClassifier() {
		if (constrainingClassifier != null && constrainingClassifier.eIsProxy()) {
			InternalEObject oldConstrainingClassifier = (InternalEObject)constrainingClassifier;
			constrainingClassifier = (ComponentClassifier)eResolveProxy(oldConstrainingClassifier);
			if (constrainingClassifier != oldConstrainingClassifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.COMPONENT_PROTOTYPE__CONSTRAINING_CLASSIFIER, oldConstrainingClassifier, constrainingClassifier));
			}
		}
		return constrainingClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentClassifier basicGetConstrainingClassifier() {
		return constrainingClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstrainingClassifier(ComponentClassifier newConstrainingClassifier) {
		ComponentClassifier oldConstrainingClassifier = constrainingClassifier;
		constrainingClassifier = newConstrainingClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.COMPONENT_PROTOTYPE__CONSTRAINING_CLASSIFIER, oldConstrainingClassifier, constrainingClassifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean conformsTo(Type other) {
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
			case Aadl2Package.COMPONENT_PROTOTYPE__ARRAY:
				return isArray();
			case Aadl2Package.COMPONENT_PROTOTYPE__CONSTRAINING_CLASSIFIER:
				if (resolve) return getConstrainingClassifier();
				return basicGetConstrainingClassifier();
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
			case Aadl2Package.COMPONENT_PROTOTYPE__ARRAY:
				setArray((Boolean)newValue);
				return;
			case Aadl2Package.COMPONENT_PROTOTYPE__CONSTRAINING_CLASSIFIER:
				setConstrainingClassifier((ComponentClassifier)newValue);
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
			case Aadl2Package.COMPONENT_PROTOTYPE__ARRAY:
				setArray(ARRAY_EDEFAULT);
				return;
			case Aadl2Package.COMPONENT_PROTOTYPE__CONSTRAINING_CLASSIFIER:
				setConstrainingClassifier((ComponentClassifier)null);
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
			case Aadl2Package.COMPONENT_PROTOTYPE__ARRAY:
				return array != ARRAY_EDEFAULT;
			case Aadl2Package.COMPONENT_PROTOTYPE__CONSTRAINING_CLASSIFIER:
				return constrainingClassifier != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Type.class) {
			switch (baseOperationID) {
				case Aadl2Package.TYPE___CONFORMS_TO__TYPE: return Aadl2Package.COMPONENT_PROTOTYPE___CONFORMS_TO__TYPE;
				default: return -1;
			}
		}
		if (baseClass == SubcomponentType.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == FeatureClassifier.class) {
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
			case Aadl2Package.COMPONENT_PROTOTYPE___CONFORMS_TO__TYPE:
				return conformsTo((Type)arguments.get(0));
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
		result.append(" (array: ");
		result.append(array);
		result.append(')');
		return result.toString();
	}

} //ComponentPrototypeImpl
