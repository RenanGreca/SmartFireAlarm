/**
 */
package aadl2;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A named element is an element in a model that may have a name.
 * <p>From package AADLInfrastructure.</p>
 * <p>From package AADLProperties::Associations.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.NamedElement#getName <em>Name</em>}</li>
 *   <li>{@link aadl2.NamedElement#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link aadl2.NamedElement#getOwnedPropertyAssociation <em>Owned Property Association</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getNamedElement()
 * @model abstract="true"
 * @generated
 */
public interface NamedElement extends Element {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the NamedElement.
	 * <p>From package AADLInfrastructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see aadl2.Aadl2Package#getNamedElement_Name()
	 * @model dataType="aadl2.String" ordered="false"
	 *        annotation="http://www.topcased.org/documentation documentation='The name of the NamedElement.'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link aadl2.NamedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name which allows the NamedElement to be identified within a hierarchy of nested Namespaces. It is constructed from the names of the containing namespaces starting at the root of the hierarchy and ending with the name of the NamedElement itself.
	 * <p>From package AADLInfrastructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualified Name</em>' attribute.
	 * @see aadl2.Aadl2Package#getNamedElement_QualifiedName()
	 * @model dataType="aadl2.String" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.topcased.org/documentation documentation='A name which allows the NamedElement to be identified within a hierarchy of nested Namespaces. It is constructed from the names of the containing namespaces starting at the root of the hierarchy and ending with the name of the NamedElement itself.'"
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Returns the value of the '<em><b>Owned Property Association</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.PropertyAssociation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Associations.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Property Association</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getNamedElement_OwnedPropertyAssociation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<PropertyAssociation> getOwnedPropertyAssociation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If there is no name, or one of the containing namespaces has no name, there is no qualified name.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.name-&gt;isEmpty() or self.allNamespaces()-&gt;select(ns | ns.name-&gt;isEmpty())-&gt;notEmpty()) implies self.qualifiedName-&gt;isEmpty()'"
	 * @generated
	 */
	boolean has_no_qualified_name(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When there is a name, and all of the containing namespaces have a name, the qualified name is constructed from the names of the containing namespaces.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.name-&gt;notEmpty() and self.allNamespaces()-&gt;select(ns | ns.name-&gt;isEmpty())-&gt;isEmpty()) \r\nimplies \r\nself.qualifiedName = self.allNamespaces()-&gt;iterate(ns: Namespace; result: String = self.name | ns.name.concat(self.separator()).concat(result))'"
	 * @generated
	 */
	boolean has_qualified_name(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	Namespace getNamespace();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allNamespaces() gives the sequence of namespaces in which the NamedElement is nested, working outwards.
	 * <p>From package AADLInfrastructure.</p>
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.namespace-&gt;isEmpty() then \r\n  Sequence{}\r\nelse\r\n  self.namespace.allNamespaces()-&gt;prepend(self.namespace)\r\nendif'"
	 * @generated
	 */
	EList<Namespace> allNamespaces();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isDistinguishableFrom() determines whether two NamedElements may logically co-exist within a Namespace. By default, two named elements are distinguishable if (a) they have unrelated types or (b) they have related types but different names.
	 * <p>From package AADLInfrastructure.</p>
	 * <!-- end-model-doc -->
	 * @model dataType="aadl2.Boolean" required="true" ordered="false" nRequired="true" nOrdered="false" nsRequired="true" nsOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.oclIsKindOf(n.oclType) or n.oclIsKindOf(self.oclType) then\r\n  ns.getNamesOfMember(self)-&gt;intersection(ns.getNamesOfMember(n))-&gt;isEmpty()\r\nelse\r\n  true\r\nendif'"
	 * @generated
	 */
	boolean isDistinguishableFrom(NamedElement n, Namespace ns);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query separator() gives the string that is used to separate names when constructing a qualified name.
	 * <p>From package AADLInfrastructure.</p>
	 * <!-- end-model-doc -->
	 * @model dataType="aadl2.String" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='\'.\''"
	 * @generated
	 */
	String separator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When there is a name, and all of the containing namespaces have a name, the qualified name is constructed from the names of the containing namespaces.
	 * <p>From package AADLInfrastructure.</p>
	 * <!-- end-model-doc -->
	 * @model dataType="aadl2.String" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.name-&gt;notEmpty() and self.allNamespaces()-&gt;select(ns | ns.name-&gt;isEmpty())-&gt;isEmpty() then\r\n  self.allNamespaces()-&gt;iterate(ns: Namespace; result: String = self.name | ns.name.concat(self.separator()).concat(result))\r\nelse \r\n  \'\' \r\nendif'"
	 * @generated
	 */
	String qualifiedName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLInfrastructure.</p>
	 * <!-- end-model-doc -->
	 * @model ordered="false" propertySetNameDataType="aadl2.String" propertySetNameRequired="true" propertySetNameOrdered="false" propertyNameDataType="aadl2.String" propertyNameRequired="true" propertyNameOrdered="false"
	 * @generated
	 */
	EList<PropertyExpression> getPropertyValues(String propertySetName, String propertyName);

} // NamedElement
