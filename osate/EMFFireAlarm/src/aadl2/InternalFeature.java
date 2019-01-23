/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLDetails::Special Features.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.InternalFeature#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getInternalFeature()
 * @model abstract="true"
 * @generated
 */
public interface InternalFeature extends StructuralFeature, ModalElement, FeatureConnectionEnd, PortConnectionEnd, TriggerPort {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link aadl2.DirectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Special Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see aadl2.DirectionType
	 * @see #setDirection(DirectionType)
	 * @see aadl2.Aadl2Package#getInternalFeature_Direction()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DirectionType getDirection();

	/**
	 * Sets the value of the '{@link aadl2.InternalFeature#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see aadl2.DirectionType
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(DirectionType value);

} // InternalFeature
