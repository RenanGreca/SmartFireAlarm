/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.AnnexSubclause;
import aadl2.Classifier;
import aadl2.ClassifierFeature;
import aadl2.Generalization;
import aadl2.NamedElement;
import aadl2.Prototype;
import aadl2.PrototypeBinding;
import aadl2.Type;

import aadl2.util.Aadl2Validator;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.ClassifierImpl#getClassifierFeature <em>Classifier Feature</em>}</li>
 *   <li>{@link aadl2.impl.ClassifierImpl#getInheritedMember <em>Inherited Member</em>}</li>
 *   <li>{@link aadl2.impl.ClassifierImpl#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link aadl2.impl.ClassifierImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link aadl2.impl.ClassifierImpl#getOwnedAnnexSubclause <em>Owned Annex Subclause</em>}</li>
 *   <li>{@link aadl2.impl.ClassifierImpl#getOwnedPrototype <em>Owned Prototype</em>}</li>
 *   <li>{@link aadl2.impl.ClassifierImpl#getOwnedPrototypeBinding <em>Owned Prototype Binding</em>}</li>
 *   <li>{@link aadl2.impl.ClassifierImpl#isNoPrototypes <em>No Prototypes</em>}</li>
 *   <li>{@link aadl2.impl.ClassifierImpl#isNoAnnexes <em>No Annexes</em>}</li>
 *   <li>{@link aadl2.impl.ClassifierImpl#isNoProperties <em>No Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ClassifierImpl extends NamespaceImpl implements Classifier {
	/**
	 * The cached value of the '{@link #getOwnedAnnexSubclause() <em>Owned Annex Subclause</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAnnexSubclause()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnexSubclause> ownedAnnexSubclause;

	/**
	 * The cached value of the '{@link #getOwnedPrototype() <em>Owned Prototype</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPrototype()
	 * @generated
	 * @ordered
	 */
	protected EList<Prototype> ownedPrototype;

	/**
	 * The cached value of the '{@link #getOwnedPrototypeBinding() <em>Owned Prototype Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPrototypeBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<PrototypeBinding> ownedPrototypeBinding;

	/**
	 * The default value of the '{@link #isNoPrototypes() <em>No Prototypes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoPrototypes()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_PROTOTYPES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNoPrototypes() <em>No Prototypes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoPrototypes()
	 * @generated
	 * @ordered
	 */
	protected boolean noPrototypes = NO_PROTOTYPES_EDEFAULT;

	/**
	 * The default value of the '{@link #isNoAnnexes() <em>No Annexes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoAnnexes()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_ANNEXES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNoAnnexes() <em>No Annexes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoAnnexes()
	 * @generated
	 * @ordered
	 */
	protected boolean noAnnexes = NO_ANNEXES_EDEFAULT;

	/**
	 * The default value of the '{@link #isNoProperties() <em>No Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoProperties()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_PROPERTIES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNoProperties() <em>No Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoProperties()
	 * @generated
	 * @ordered
	 */
	protected boolean noProperties = NO_PROPERTIES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getClassifier();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassifierFeature> getClassifierFeature() {
		// TODO: implement this method to return the 'Classifier Feature' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getInheritedMember() {
		// TODO: implement this method to return the 'Inherited Member' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getGeneralization() {
		// TODO: implement this method to return the 'Generalization' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getGeneral() {
		// TODO: implement this method to return the 'General' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnnexSubclause> getOwnedAnnexSubclause() {
		if (ownedAnnexSubclause == null) {
			ownedAnnexSubclause = new EObjectContainmentEList<AnnexSubclause>(AnnexSubclause.class, this, Aadl2Package.CLASSIFIER__OWNED_ANNEX_SUBCLAUSE);
		}
		return ownedAnnexSubclause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Prototype> getOwnedPrototype() {
		if (ownedPrototype == null) {
			ownedPrototype = new EObjectContainmentEList<Prototype>(Prototype.class, this, Aadl2Package.CLASSIFIER__OWNED_PROTOTYPE);
		}
		return ownedPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrototypeBinding> getOwnedPrototypeBinding() {
		if (ownedPrototypeBinding == null) {
			ownedPrototypeBinding = new EObjectContainmentEList<PrototypeBinding>(PrototypeBinding.class, this, Aadl2Package.CLASSIFIER__OWNED_PROTOTYPE_BINDING);
		}
		return ownedPrototypeBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNoPrototypes() {
		return noPrototypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoPrototypes(boolean newNoPrototypes) {
		boolean oldNoPrototypes = noPrototypes;
		noPrototypes = newNoPrototypes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.CLASSIFIER__NO_PROTOTYPES, oldNoPrototypes, noPrototypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNoAnnexes() {
		return noAnnexes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoAnnexes(boolean newNoAnnexes) {
		boolean oldNoAnnexes = noAnnexes;
		noAnnexes = newNoAnnexes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.CLASSIFIER__NO_ANNEXES, oldNoAnnexes, noAnnexes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNoProperties() {
		return noProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoProperties(boolean newNoProperties) {
		boolean oldNoProperties = noProperties;
		noProperties = newNoProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.CLASSIFIER__NO_PROPERTIES, oldNoProperties, noProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean no_cycles_in_generalization(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Aadl2Validator.DIAGNOSTIC_SOURCE,
						 Aadl2Validator.CLASSIFIER__NO_CYCLES_IN_GENERALIZATION,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "no_cycles_in_generalization", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean specialize_type(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Aadl2Validator.DIAGNOSTIC_SOURCE,
						 Aadl2Validator.CLASSIFIER__SPECIALIZE_TYPE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "specialize_type", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassifierFeature> allFeatures() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> inheritedMember() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> parents() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> allParents() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> inheritableMembers(Classifier c) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasVisibilityOf(NamedElement n) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> inherit(EList<NamedElement> inhs) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean maySpecializeType(Classifier c) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Aadl2Package.CLASSIFIER__OWNED_ANNEX_SUBCLAUSE:
				return ((InternalEList<?>)getOwnedAnnexSubclause()).basicRemove(otherEnd, msgs);
			case Aadl2Package.CLASSIFIER__OWNED_PROTOTYPE:
				return ((InternalEList<?>)getOwnedPrototype()).basicRemove(otherEnd, msgs);
			case Aadl2Package.CLASSIFIER__OWNED_PROTOTYPE_BINDING:
				return ((InternalEList<?>)getOwnedPrototypeBinding()).basicRemove(otherEnd, msgs);
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
			case Aadl2Package.CLASSIFIER__CLASSIFIER_FEATURE:
				return getClassifierFeature();
			case Aadl2Package.CLASSIFIER__INHERITED_MEMBER:
				return getInheritedMember();
			case Aadl2Package.CLASSIFIER__GENERALIZATION:
				return getGeneralization();
			case Aadl2Package.CLASSIFIER__GENERAL:
				return getGeneral();
			case Aadl2Package.CLASSIFIER__OWNED_ANNEX_SUBCLAUSE:
				return getOwnedAnnexSubclause();
			case Aadl2Package.CLASSIFIER__OWNED_PROTOTYPE:
				return getOwnedPrototype();
			case Aadl2Package.CLASSIFIER__OWNED_PROTOTYPE_BINDING:
				return getOwnedPrototypeBinding();
			case Aadl2Package.CLASSIFIER__NO_PROTOTYPES:
				return isNoPrototypes();
			case Aadl2Package.CLASSIFIER__NO_ANNEXES:
				return isNoAnnexes();
			case Aadl2Package.CLASSIFIER__NO_PROPERTIES:
				return isNoProperties();
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
			case Aadl2Package.CLASSIFIER__OWNED_ANNEX_SUBCLAUSE:
				getOwnedAnnexSubclause().clear();
				getOwnedAnnexSubclause().addAll((Collection<? extends AnnexSubclause>)newValue);
				return;
			case Aadl2Package.CLASSIFIER__OWNED_PROTOTYPE:
				getOwnedPrototype().clear();
				getOwnedPrototype().addAll((Collection<? extends Prototype>)newValue);
				return;
			case Aadl2Package.CLASSIFIER__OWNED_PROTOTYPE_BINDING:
				getOwnedPrototypeBinding().clear();
				getOwnedPrototypeBinding().addAll((Collection<? extends PrototypeBinding>)newValue);
				return;
			case Aadl2Package.CLASSIFIER__NO_PROTOTYPES:
				setNoPrototypes((Boolean)newValue);
				return;
			case Aadl2Package.CLASSIFIER__NO_ANNEXES:
				setNoAnnexes((Boolean)newValue);
				return;
			case Aadl2Package.CLASSIFIER__NO_PROPERTIES:
				setNoProperties((Boolean)newValue);
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
			case Aadl2Package.CLASSIFIER__OWNED_ANNEX_SUBCLAUSE:
				getOwnedAnnexSubclause().clear();
				return;
			case Aadl2Package.CLASSIFIER__OWNED_PROTOTYPE:
				getOwnedPrototype().clear();
				return;
			case Aadl2Package.CLASSIFIER__OWNED_PROTOTYPE_BINDING:
				getOwnedPrototypeBinding().clear();
				return;
			case Aadl2Package.CLASSIFIER__NO_PROTOTYPES:
				setNoPrototypes(NO_PROTOTYPES_EDEFAULT);
				return;
			case Aadl2Package.CLASSIFIER__NO_ANNEXES:
				setNoAnnexes(NO_ANNEXES_EDEFAULT);
				return;
			case Aadl2Package.CLASSIFIER__NO_PROPERTIES:
				setNoProperties(NO_PROPERTIES_EDEFAULT);
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
			case Aadl2Package.CLASSIFIER__CLASSIFIER_FEATURE:
				return !getClassifierFeature().isEmpty();
			case Aadl2Package.CLASSIFIER__INHERITED_MEMBER:
				return !getInheritedMember().isEmpty();
			case Aadl2Package.CLASSIFIER__GENERALIZATION:
				return !getGeneralization().isEmpty();
			case Aadl2Package.CLASSIFIER__GENERAL:
				return !getGeneral().isEmpty();
			case Aadl2Package.CLASSIFIER__OWNED_ANNEX_SUBCLAUSE:
				return ownedAnnexSubclause != null && !ownedAnnexSubclause.isEmpty();
			case Aadl2Package.CLASSIFIER__OWNED_PROTOTYPE:
				return ownedPrototype != null && !ownedPrototype.isEmpty();
			case Aadl2Package.CLASSIFIER__OWNED_PROTOTYPE_BINDING:
				return ownedPrototypeBinding != null && !ownedPrototypeBinding.isEmpty();
			case Aadl2Package.CLASSIFIER__NO_PROTOTYPES:
				return noPrototypes != NO_PROTOTYPES_EDEFAULT;
			case Aadl2Package.CLASSIFIER__NO_ANNEXES:
				return noAnnexes != NO_ANNEXES_EDEFAULT;
			case Aadl2Package.CLASSIFIER__NO_PROPERTIES:
				return noProperties != NO_PROPERTIES_EDEFAULT;
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
				case Aadl2Package.TYPE___CONFORMS_TO__TYPE: return Aadl2Package.CLASSIFIER___CONFORMS_TO__TYPE;
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Aadl2Package.CLASSIFIER___NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP:
				return no_cycles_in_generalization((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Aadl2Package.CLASSIFIER___SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP:
				return specialize_type((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Aadl2Package.CLASSIFIER___ALL_FEATURES:
				return allFeatures();
			case Aadl2Package.CLASSIFIER___INHERITED_MEMBER:
				return inheritedMember();
			case Aadl2Package.CLASSIFIER___PARENTS:
				return parents();
			case Aadl2Package.CLASSIFIER___ALL_PARENTS:
				return allParents();
			case Aadl2Package.CLASSIFIER___INHERITABLE_MEMBERS__CLASSIFIER:
				return inheritableMembers((Classifier)arguments.get(0));
			case Aadl2Package.CLASSIFIER___HAS_VISIBILITY_OF__NAMEDELEMENT:
				return hasVisibilityOf((NamedElement)arguments.get(0));
			case Aadl2Package.CLASSIFIER___INHERIT__ELIST:
				return inherit((EList<NamedElement>)arguments.get(0));
			case Aadl2Package.CLASSIFIER___MAY_SPECIALIZE_TYPE__CLASSIFIER:
				return maySpecializeType((Classifier)arguments.get(0));
			case Aadl2Package.CLASSIFIER___CONFORMS_TO__TYPE:
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
		result.append(" (noPrototypes: ");
		result.append(noPrototypes);
		result.append(", noAnnexes: ");
		result.append(noAnnexes);
		result.append(", noProperties: ");
		result.append(noProperties);
		result.append(')');
		return result.toString();
	}

} //ClassifierImpl
