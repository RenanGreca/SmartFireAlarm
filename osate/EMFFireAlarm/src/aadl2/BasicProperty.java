/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLProperties::Definitions.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.BasicProperty#getPropertyType <em>Property Type</em>}</li>
 *   <li>{@link aadl2.BasicProperty#getOwnedPropertyType <em>Owned Property Type</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getBasicProperty()
 * @model
 * @generated
 */
public interface BasicProperty extends TypedElement {
	/**
	 * Returns the value of the '<em><b>Property Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Definitions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property Type</em>' reference.
	 * @see #setPropertyType(PropertyType)
	 * @see aadl2.Aadl2Package#getBasicProperty_PropertyType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PropertyType getPropertyType();

	/**
	 * Sets the value of the '{@link aadl2.BasicProperty#getPropertyType <em>Property Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Type</em>' reference.
	 * @see #getPropertyType()
	 * @generated
	 */
	void setPropertyType(PropertyType value);

	/**
	 * Returns the value of the '<em><b>Owned Property Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Definitions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Property Type</em>' containment reference.
	 * @see #setOwnedPropertyType(PropertyType)
	 * @see aadl2.Aadl2Package#getBasicProperty_OwnedPropertyType()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	PropertyType getOwnedPropertyType();

	/**
	 * Sets the value of the '{@link aadl2.BasicProperty#getOwnedPropertyType <em>Owned Property Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Property Type</em>' containment reference.
	 * @see #getOwnedPropertyType()
	 * @generated
	 */
	void setOwnedPropertyType(PropertyType value);

} // BasicProperty
