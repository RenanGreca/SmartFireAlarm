/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A type constrains the values represented by a typed element.
 * <p>From package AADLInfrastructure.</p>
 * <!-- end-model-doc -->
 *
 *
 * @see aadl2.Aadl2Package#getType()
 * @model abstract="true"
 * @generated
 */
public interface Type extends NamedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query conformsTo() gives true for a type that conforms to another. By default, two types do not conform to each other. This query is intended to be redefined for specific conformance situations.
	 * <p>From package AADLInfrastructure.</p>
	 * <!-- end-model-doc -->
	 * @model dataType="aadl2.Boolean" required="true" ordered="false" otherRequired="true" otherOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='false'"
	 * @generated
	 */
	boolean conformsTo(Type other);

} // Type
