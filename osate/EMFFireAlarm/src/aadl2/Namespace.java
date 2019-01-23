/**
 */
package aadl2;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A namespace is an element in a model that contains a set of named elements that can be identified by name.
 * <p>From package AADLInfrastructure.</p>
 * <p>From package AADLProperties::PropertySets.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.Namespace#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link aadl2.Namespace#getMember <em>Member</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getNamespace()
 * @model abstract="true"
 * @generated
 */
public interface Namespace extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owned Member</b></em>' reference list.
	 * The list contents are of type {@link aadl2.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of NamedElements owned by the Namespace.
	 * <p>From package AADLInfrastructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Member</em>' reference list.
	 * @see aadl2.Aadl2Package#getNamespace_OwnedMember()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.topcased.org/documentation documentation='A collection of NamedElements owned by the Namespace.'"
	 * @generated
	 */
	EList<NamedElement> getOwnedMember();

	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference list.
	 * The list contents are of type {@link aadl2.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of NamedElements identifiable within the Namespace, either by being owned or by being introduced by importing or inheritance.
	 * <p>From package AADLInfrastructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Member</em>' reference list.
	 * @see aadl2.Aadl2Package#getNamespace_Member()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.topcased.org/documentation documentation='A collection of NamedElements identifiable within the Namespace, either by being owned or by being introduced by importing or inheritance.'"
	 * @generated
	 */
	EList<NamedElement> getMember();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All the members of a Namespace are distinguishable within it.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='membersAreDistinguishable()'"
	 * @generated
	 */
	boolean members_distinguishable(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query getNamesOfMember() gives a set of all of the names that a member would have in a Namespace. In general a member can have multiple names in a Namespace if it is imported more than once with different aliases. Those semantics are specified by overriding the getNamesOfMember operation. The specification here simply returns a set containing a single name, or the empty set if no name.
	 * <p>From package AADLInfrastructure.</p>
	 * <!-- end-model-doc -->
	 * @model dataType="aadl2.String" ordered="false" elementRequired="true" elementOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if member-&gt;includes(element) then\r\n  Set{}-&gt;including(element.name)\r\nelse\r\n  Set{}\r\nendif'"
	 * @generated
	 */
	EList<String> getNamesOfMember(NamedElement element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Boolean query membersAreDistinguishable() determines whether all of the namespaces members are distinguishable within it.
	 * <p>From package AADLInfrastructure.</p>
	 * <!-- end-model-doc -->
	 * @model dataType="aadl2.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.member-&gt;forAll( memb | self.member-&gt;excluding(memb)-&gt;forAll(other | memb.isDistinguishableFrom(other, self)))'"
	 * @generated
	 */
	boolean membersAreDistinguishable();

} // Namespace
