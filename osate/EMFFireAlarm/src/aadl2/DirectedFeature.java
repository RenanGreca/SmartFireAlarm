/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directed Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLConstructs::Features.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.DirectedFeature#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getDirectedFeature()
 * @model abstract="true"
 * @generated
 */
public interface DirectedFeature extends Feature {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The default value is <code>"inOut"</code>.
	 * The literals are from the enumeration {@link aadl2.DirectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see aadl2.DirectionType
	 * @see #setDirection(DirectionType)
	 * @see aadl2.Aadl2Package#getDirectedFeature_Direction()
	 * @model default="inOut" required="true" ordered="false"
	 * @generated
	 */
	DirectionType getDirection();

	/**
	 * Sets the value of the '{@link aadl2.DirectedFeature#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see aadl2.DirectionType
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(DirectionType value);

} // DirectedFeature
