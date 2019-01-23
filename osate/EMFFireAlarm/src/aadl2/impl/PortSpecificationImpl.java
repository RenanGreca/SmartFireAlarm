/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.ComponentClassifier;
import aadl2.ComponentPrototype;
import aadl2.DirectionType;
import aadl2.PortCategory;
import aadl2.PortSpecification;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.PortSpecificationImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link aadl2.impl.PortSpecificationImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link aadl2.impl.PortSpecificationImpl#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link aadl2.impl.PortSpecificationImpl#getComponentPrototype <em>Component Prototype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortSpecificationImpl extends FeaturePrototypeActualImpl implements PortSpecification {
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
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final PortCategory CATEGORY_EDEFAULT = PortCategory.DATA;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected PortCategory category = CATEGORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier()
	 * @generated
	 * @ordered
	 */
	protected ComponentClassifier classifier;

	/**
	 * The cached value of the '{@link #getComponentPrototype() <em>Component Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentPrototype()
	 * @generated
	 * @ordered
	 */
	protected ComponentPrototype componentPrototype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getPortSpecification();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.PORT_SPECIFICATION__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortCategory getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(PortCategory newCategory) {
		PortCategory oldCategory = category;
		category = newCategory == null ? CATEGORY_EDEFAULT : newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.PORT_SPECIFICATION__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentClassifier getClassifier() {
		if (classifier != null && classifier.eIsProxy()) {
			InternalEObject oldClassifier = (InternalEObject)classifier;
			classifier = (ComponentClassifier)eResolveProxy(oldClassifier);
			if (classifier != oldClassifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.PORT_SPECIFICATION__CLASSIFIER, oldClassifier, classifier));
			}
		}
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentClassifier basicGetClassifier() {
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifier(ComponentClassifier newClassifier) {
		ComponentClassifier oldClassifier = classifier;
		classifier = newClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.PORT_SPECIFICATION__CLASSIFIER, oldClassifier, classifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentPrototype getComponentPrototype() {
		if (componentPrototype != null && componentPrototype.eIsProxy()) {
			InternalEObject oldComponentPrototype = (InternalEObject)componentPrototype;
			componentPrototype = (ComponentPrototype)eResolveProxy(oldComponentPrototype);
			if (componentPrototype != oldComponentPrototype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.PORT_SPECIFICATION__COMPONENT_PROTOTYPE, oldComponentPrototype, componentPrototype));
			}
		}
		return componentPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentPrototype basicGetComponentPrototype() {
		return componentPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentPrototype(ComponentPrototype newComponentPrototype) {
		ComponentPrototype oldComponentPrototype = componentPrototype;
		componentPrototype = newComponentPrototype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.PORT_SPECIFICATION__COMPONENT_PROTOTYPE, oldComponentPrototype, componentPrototype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.PORT_SPECIFICATION__DIRECTION:
				return getDirection();
			case Aadl2Package.PORT_SPECIFICATION__CATEGORY:
				return getCategory();
			case Aadl2Package.PORT_SPECIFICATION__CLASSIFIER:
				if (resolve) return getClassifier();
				return basicGetClassifier();
			case Aadl2Package.PORT_SPECIFICATION__COMPONENT_PROTOTYPE:
				if (resolve) return getComponentPrototype();
				return basicGetComponentPrototype();
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
			case Aadl2Package.PORT_SPECIFICATION__DIRECTION:
				setDirection((DirectionType)newValue);
				return;
			case Aadl2Package.PORT_SPECIFICATION__CATEGORY:
				setCategory((PortCategory)newValue);
				return;
			case Aadl2Package.PORT_SPECIFICATION__CLASSIFIER:
				setClassifier((ComponentClassifier)newValue);
				return;
			case Aadl2Package.PORT_SPECIFICATION__COMPONENT_PROTOTYPE:
				setComponentPrototype((ComponentPrototype)newValue);
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
			case Aadl2Package.PORT_SPECIFICATION__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case Aadl2Package.PORT_SPECIFICATION__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case Aadl2Package.PORT_SPECIFICATION__CLASSIFIER:
				setClassifier((ComponentClassifier)null);
				return;
			case Aadl2Package.PORT_SPECIFICATION__COMPONENT_PROTOTYPE:
				setComponentPrototype((ComponentPrototype)null);
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
			case Aadl2Package.PORT_SPECIFICATION__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case Aadl2Package.PORT_SPECIFICATION__CATEGORY:
				return category != CATEGORY_EDEFAULT;
			case Aadl2Package.PORT_SPECIFICATION__CLASSIFIER:
				return classifier != null;
			case Aadl2Package.PORT_SPECIFICATION__COMPONENT_PROTOTYPE:
				return componentPrototype != null;
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
		result.append(", category: ");
		result.append(category);
		result.append(')');
		return result.toString();
	}

} //PortSpecificationImpl
