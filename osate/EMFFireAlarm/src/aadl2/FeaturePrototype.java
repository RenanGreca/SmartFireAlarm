/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Prototype</b></em>'.
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
 *   <li>{@link aadl2.FeaturePrototype#getDirection <em>Direction</em>}</li>
 *   <li>{@link aadl2.FeaturePrototype#getConstrainingClassifier <em>Constraining Classifier</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getFeaturePrototype()
 * @model
 * @generated
 */
public interface FeaturePrototype extends Prototype {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The default value is <code>"inOut"</code>.
	 * The literals are from the enumeration {@link aadl2.DirectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Templates.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see aadl2.DirectionType
	 * @see #setDirection(DirectionType)
	 * @see aadl2.Aadl2Package#getFeaturePrototype_Direction()
	 * @model default="inOut" required="true" ordered="false"
	 * @generated
	 */
	DirectionType getDirection();

	/**
	 * Sets the value of the '{@link aadl2.FeaturePrototype#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see aadl2.DirectionType
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(DirectionType value);

	/**
	 * Returns the value of the '<em><b>Constraining Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Templates.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraining Classifier</em>' reference.
	 * @see #setConstrainingClassifier(ComponentClassifier)
	 * @see aadl2.Aadl2Package#getFeaturePrototype_ConstrainingClassifier()
	 * @model ordered="false"
	 * @generated
	 */
	ComponentClassifier getConstrainingClassifier();

	/**
	 * Sets the value of the '{@link aadl2.FeaturePrototype#getConstrainingClassifier <em>Constraining Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraining Classifier</em>' reference.
	 * @see #getConstrainingClassifier()
	 * @generated
	 */
	void setConstrainingClassifier(ComponentClassifier value);

} // FeaturePrototype
