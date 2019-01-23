/**
 */
package aadl2;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prototype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLConstructs::Templates.</p>
 * <p>From package AADLDetails::Calls.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.Prototype#getRefined <em>Refined</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getPrototype()
 * @model abstract="true"
 * @generated
 */
public interface Prototype extends StructuralFeature, CalledSubprogram {
	/**
	 * Returns the value of the '<em><b>Refined</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Templates.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Refined</em>' reference.
	 * @see #setRefined(Prototype)
	 * @see aadl2.Aadl2Package#getPrototype_Refined()
	 * @model ordered="false"
	 * @generated
	 */
	Prototype getRefined();

	/**
	 * Sets the value of the '{@link aadl2.Prototype#getRefined <em>Refined</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refined</em>' reference.
	 * @see #getRefined()
	 * @generated
	 */
	void setRefined(Prototype value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.constrainingCategory.oclIsUndefined() implies self.constrainingClassifier = self.constrainingCategory'"
	 * @generated
	 */
	boolean categoryConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Prototype
