/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLConstructs::Templates.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.PortSpecification#getDirection <em>Direction</em>}</li>
 *   <li>{@link aadl2.PortSpecification#getCategory <em>Category</em>}</li>
 *   <li>{@link aadl2.PortSpecification#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link aadl2.PortSpecification#getComponentPrototype <em>Component Prototype</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getPortSpecification()
 * @model
 * @generated
 */
public interface PortSpecification extends FeaturePrototypeActual {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link aadl2.DirectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Templates.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see aadl2.DirectionType
	 * @see #setDirection(DirectionType)
	 * @see aadl2.Aadl2Package#getPortSpecification_Direction()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DirectionType getDirection();

	/**
	 * Sets the value of the '{@link aadl2.PortSpecification#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see aadl2.DirectionType
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(DirectionType value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link aadl2.PortCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Templates.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see aadl2.PortCategory
	 * @see #setCategory(PortCategory)
	 * @see aadl2.Aadl2Package#getPortSpecification_Category()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PortCategory getCategory();

	/**
	 * Sets the value of the '{@link aadl2.PortSpecification#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see aadl2.PortCategory
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(PortCategory value);

	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Templates.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classifier</em>' reference.
	 * @see #setClassifier(ComponentClassifier)
	 * @see aadl2.Aadl2Package#getPortSpecification_Classifier()
	 * @model ordered="false"
	 * @generated
	 */
	ComponentClassifier getClassifier();

	/**
	 * Sets the value of the '{@link aadl2.PortSpecification#getClassifier <em>Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier</em>' reference.
	 * @see #getClassifier()
	 * @generated
	 */
	void setClassifier(ComponentClassifier value);

	/**
	 * Returns the value of the '<em><b>Component Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Templates.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Prototype</em>' reference.
	 * @see #setComponentPrototype(ComponentPrototype)
	 * @see aadl2.Aadl2Package#getPortSpecification_ComponentPrototype()
	 * @model ordered="false"
	 * @generated
	 */
	ComponentPrototype getComponentPrototype();

	/**
	 * Sets the value of the '{@link aadl2.PortSpecification#getComponentPrototype <em>Component Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Prototype</em>' reference.
	 * @see #getComponentPrototype()
	 * @generated
	 */
	void setComponentPrototype(ComponentPrototype value);

} // PortSpecification
