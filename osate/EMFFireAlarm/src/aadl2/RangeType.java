/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLProperties::Types.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.RangeType#getOwnedNumberType <em>Owned Number Type</em>}</li>
 *   <li>{@link aadl2.RangeType#getNumberType <em>Number Type</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getRangeType()
 * @model
 * @generated
 */
public interface RangeType extends NonListType {
	/**
	 * Returns the value of the '<em><b>Owned Number Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Types.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Number Type</em>' containment reference.
	 * @see #setOwnedNumberType(NumberType)
	 * @see aadl2.Aadl2Package#getRangeType_OwnedNumberType()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NumberType getOwnedNumberType();

	/**
	 * Sets the value of the '{@link aadl2.RangeType#getOwnedNumberType <em>Owned Number Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Number Type</em>' containment reference.
	 * @see #getOwnedNumberType()
	 * @generated
	 */
	void setOwnedNumberType(NumberType value);

	/**
	 * Returns the value of the '<em><b>Number Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Types.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Type</em>' reference.
	 * @see #setNumberType(NumberType)
	 * @see aadl2.Aadl2Package#getRangeType_NumberType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	NumberType getNumberType();

	/**
	 * Sets the value of the '{@link aadl2.RangeType#getNumberType <em>Number Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Type</em>' reference.
	 * @see #getNumberType()
	 * @generated
	 */
	void setNumberType(NumberType value);

} // RangeType
