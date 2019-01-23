/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Prototype Reference</b></em>'.
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
 *   <li>{@link aadl2.FeaturePrototypeReference#getDirection <em>Direction</em>}</li>
 *   <li>{@link aadl2.FeaturePrototypeReference#getPrototype <em>Prototype</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getFeaturePrototypeReference()
 * @model
 * @generated
 */
public interface FeaturePrototypeReference extends FeaturePrototypeActual {
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
	 * @see aadl2.Aadl2Package#getFeaturePrototypeReference_Direction()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DirectionType getDirection();

	/**
	 * Sets the value of the '{@link aadl2.FeaturePrototypeReference#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see aadl2.DirectionType
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(DirectionType value);

	/**
	 * Returns the value of the '<em><b>Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Templates.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prototype</em>' reference.
	 * @see #setPrototype(FeaturePrototype)
	 * @see aadl2.Aadl2Package#getFeaturePrototypeReference_Prototype()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FeaturePrototype getPrototype();

	/**
	 * Sets the value of the '{@link aadl2.FeaturePrototypeReference#getPrototype <em>Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prototype</em>' reference.
	 * @see #getPrototype()
	 * @generated
	 */
	void setPrototype(FeaturePrototype value);

} // FeaturePrototypeReference
