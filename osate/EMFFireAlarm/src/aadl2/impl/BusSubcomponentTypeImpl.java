/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.BusSubcomponentType;
import aadl2.FeatureClassifier;
import aadl2.SubcomponentType;
import aadl2.Type;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bus Subcomponent Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class BusSubcomponentTypeImpl extends BusImpl implements BusSubcomponentType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusSubcomponentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getBusSubcomponentType();
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Type.class) {
			switch (baseOperationID) {
				case Aadl2Package.TYPE___CONFORMS_TO__TYPE: return Aadl2Package.BUS_SUBCOMPONENT_TYPE___CONFORMS_TO__TYPE;
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
			case Aadl2Package.BUS_SUBCOMPONENT_TYPE___CONFORMS_TO__TYPE:
				return conformsTo((Type)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //BusSubcomponentTypeImpl