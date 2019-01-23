/**
 */
package aadl2;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A classifier is a classification of instances - it describes a set of instances that have features in common.
 * A classifier can specify a generalization hierarchy by referencing its general classifiers.
 * <p>From package AADLInfrastructure.</p>
 * <p>From package AADLProperties::Associations.</p>
 * <p>From package AADLConstructs::Extensibility.</p>
 * <p>From package AADLConstructs::Templates.</p>
 * <p>From package AADLDetails::NoneSupport.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.Classifier#getClassifierFeature <em>Classifier Feature</em>}</li>
 *   <li>{@link aadl2.Classifier#getInheritedMember <em>Inherited Member</em>}</li>
 *   <li>{@link aadl2.Classifier#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link aadl2.Classifier#getGeneral <em>General</em>}</li>
 *   <li>{@link aadl2.Classifier#getOwnedAnnexSubclause <em>Owned Annex Subclause</em>}</li>
 *   <li>{@link aadl2.Classifier#getOwnedPrototype <em>Owned Prototype</em>}</li>
 *   <li>{@link aadl2.Classifier#getOwnedPrototypeBinding <em>Owned Prototype Binding</em>}</li>
 *   <li>{@link aadl2.Classifier#isNoPrototypes <em>No Prototypes</em>}</li>
 *   <li>{@link aadl2.Classifier#isNoAnnexes <em>No Annexes</em>}</li>
 *   <li>{@link aadl2.Classifier#isNoProperties <em>No Properties</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getClassifier()
 * @model abstract="true"
 * @generated
 */
public interface Classifier extends Namespace, Type {
	/**
	 * Returns the value of the '<em><b>Classifier Feature</b></em>' reference list.
	 * The list contents are of type {@link aadl2.ClassifierFeature}.
	 * It is bidirectional and its opposite is '{@link aadl2.ClassifierFeature#getFeaturingClassifier <em>Featuring Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies each feature defined in the classifier.
	 * <p>From package AADLInfrastructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classifier Feature</em>' reference list.
	 * @see aadl2.Aadl2Package#getClassifier_ClassifierFeature()
	 * @see aadl2.ClassifierFeature#getFeaturingClassifier
	 * @model opposite="featuringClassifier" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ClassifierFeature> getClassifierFeature();

	/**
	 * Returns the value of the '<em><b>Inherited Member</b></em>' reference list.
	 * The list contents are of type {@link aadl2.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies all elements inherited by this classifier from the general classifiers.
	 * <p>From package AADLInfrastructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inherited Member</em>' reference list.
	 * @see aadl2.Aadl2Package#getClassifier_InheritedMember()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<NamedElement> getInheritedMember();

	/**
	 * Returns the value of the '<em><b>Generalization</b></em>' reference list.
	 * The list contents are of type {@link aadl2.Generalization}.
	 * It is bidirectional and its opposite is '{@link aadl2.Generalization#getSpecific <em>Specific</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the Generalization relationships for this Classifier. These Generalizations navigate to more general classifiers in the generalization hierarchy.
	 * <p>From package AADLInfrastructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generalization</em>' reference list.
	 * @see aadl2.Aadl2Package#getClassifier_Generalization()
	 * @see aadl2.Generalization#getSpecific
	 * @model opposite="specific" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Generalization> getGeneralization();

	/**
	 * Returns the value of the '<em><b>General</b></em>' reference list.
	 * The list contents are of type {@link aadl2.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the more general classifiers in the generalization hierarchy for this Classifier.
	 * <p>From package AADLInfrastructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>General</em>' reference list.
	 * @see aadl2.Aadl2Package#getClassifier_General()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Classifier> getGeneral();

	/**
	 * Returns the value of the '<em><b>Owned Annex Subclause</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.AnnexSubclause}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Extensibility.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Annex Subclause</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getClassifier_OwnedAnnexSubclause()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AnnexSubclause> getOwnedAnnexSubclause();

	/**
	 * Returns the value of the '<em><b>Owned Prototype</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.Prototype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Templates.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Prototype</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getClassifier_OwnedPrototype()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Prototype> getOwnedPrototype();

	/**
	 * Returns the value of the '<em><b>Owned Prototype Binding</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.PrototypeBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Templates.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Prototype Binding</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getClassifier_OwnedPrototypeBinding()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<PrototypeBinding> getOwnedPrototypeBinding();

	/**
	 * Returns the value of the '<em><b>No Prototypes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::NoneSupport.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>No Prototypes</em>' attribute.
	 * @see #setNoPrototypes(boolean)
	 * @see aadl2.Aadl2Package#getClassifier_NoPrototypes()
	 * @model dataType="aadl2.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isNoPrototypes();

	/**
	 * Sets the value of the '{@link aadl2.Classifier#isNoPrototypes <em>No Prototypes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Prototypes</em>' attribute.
	 * @see #isNoPrototypes()
	 * @generated
	 */
	void setNoPrototypes(boolean value);

	/**
	 * Returns the value of the '<em><b>No Annexes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::NoneSupport.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>No Annexes</em>' attribute.
	 * @see #setNoAnnexes(boolean)
	 * @see aadl2.Aadl2Package#getClassifier_NoAnnexes()
	 * @model dataType="aadl2.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isNoAnnexes();

	/**
	 * Sets the value of the '{@link aadl2.Classifier#isNoAnnexes <em>No Annexes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Annexes</em>' attribute.
	 * @see #isNoAnnexes()
	 * @generated
	 */
	void setNoAnnexes(boolean value);

	/**
	 * Returns the value of the '<em><b>No Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Associations.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>No Properties</em>' attribute.
	 * @see #setNoProperties(boolean)
	 * @see aadl2.Aadl2Package#getClassifier_NoProperties()
	 * @model dataType="aadl2.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isNoProperties();

	/**
	 * Sets the value of the '{@link aadl2.Classifier#isNoProperties <em>No Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Properties</em>' attribute.
	 * @see #isNoProperties()
	 * @generated
	 */
	void setNoProperties(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generalization hierarchies must be directed and acyclical. A classifier can not be both a transitively general and transitively specific classifier of the same classifier.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.allParents()-&gt;includes(self)'"
	 * @generated
	 */
	boolean no_cycles_in_generalization(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A classifier may only specialize classifiers of a valid type.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.parents()-&gt;forAll(c | self.maySpecializeType(c))'"
	 * @generated
	 */
	boolean specialize_type(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allFeatures() gives all of the features in the namespace of the classifier. In general, through mechanisms such as inheritance, this will be a larger set than feature.
	 * <p>From package AADLInfrastructure.</p>
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='member-&gt;select(oclIsKindOf(Feature))'"
	 * @generated
	 */
	EList<ClassifierFeature> allFeatures();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The inheritedMember association is derived by inheriting the inheritable members of the parents.
	 * <p>From package AADLInfrastructure.</p>
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.inherit(self.parents()-&gt;collect(p | p.inheritableMembers(self))'"
	 * @generated
	 */
	EList<NamedElement> inheritedMember();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query parents() gives all of the immediate ancestors of a generalized Classifier.
	 * <p>From package AADLInfrastructure.</p>
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='general'"
	 * @generated
	 */
	EList<Classifier> parents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allParents() gives all of the direct and indirect ancestors of a generalized Classifier.
	 * <p>From package AADLInfrastructure.</p>
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.parents()-&gt;union(self.parents()-&gt;collect(p | p.allParents())'"
	 * @generated
	 */
	EList<Classifier> allParents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query inheritableMembers() gives all of the members of a classifier that may be inherited in one of its descendants, subject to whatever visibility restrictions apply.
	 * <p>From package AADLInfrastructure.</p>
	 * <!-- end-model-doc -->
	 * @model ordered="false" cRequired="true" cOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='member-&gt;select(m | c.hasVisibilityOf(m))'"
	 * @generated
	 */
	EList<NamedElement> inheritableMembers(Classifier c);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query hasVisibilityOf() determines whether a named element is visible in the classifier. By default all are visible. It is only called when the argument is something owned by a parent.
	 * <p>From package AADLInfrastructure.</p>
	 * <!-- end-model-doc -->
	 * @model dataType="aadl2.Boolean" required="true" ordered="false" nRequired="true" nOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if (self.inheritedMember-&gt;includes (n)) then (n.visibility &lt;&gt; #private) else true'"
	 * @generated
	 */
	boolean hasVisibilityOf(NamedElement n);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query inherit() defines how to inherit a set of elements. Here the operation is defined to inherit them all. It is intended to be redefined in circumstances where inheritance is affected by redefinition.
	 * <p>From package AADLInfrastructure.</p>
	 * <!-- end-model-doc -->
	 * @model ordered="false" inhsMany="true" inhsOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='inhs'"
	 * @generated
	 */
	EList<NamedElement> inherit(EList<NamedElement> inhs);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query maySpecializeType() determines whether this classifier may have a generalization relationship to classifiers of the specified type. By default a classifier may specialize classifiers of the same or a more general type. It is intended to be redefined by classifiers that have different specialization constraints.
	 * <p>From package AADLInfrastructure.</p>
	 * <!-- end-model-doc -->
	 * @model dataType="aadl2.Boolean" required="true" ordered="false" cRequired="true" cOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.oclIsKindOf(c.oclType)'"
	 * @generated
	 */
	boolean maySpecializeType(Classifier c);

} // Classifier
