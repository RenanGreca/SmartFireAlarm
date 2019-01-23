/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLDetails::Features.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.BusAccess#getBusFeatureClassifier <em>Bus Feature Classifier</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getBusAccess()
 * @model
 * @generated
 */
public interface BusAccess extends Access, Bus {
	/**
	 * Returns the value of the '<em><b>Bus Feature Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bus Feature Classifier</em>' reference.
	 * @see #setBusFeatureClassifier(BusSubcomponentType)
	 * @see aadl2.Aadl2Package#getBusAccess_BusFeatureClassifier()
	 * @model ordered="false"
	 * @generated
	 */
	BusSubcomponentType getBusFeatureClassifier();

	/**
	 * Sets the value of the '{@link aadl2.BusAccess#getBusFeatureClassifier <em>Bus Feature Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Feature Classifier</em>' reference.
	 * @see #getBusFeatureClassifier()
	 * @generated
	 */
	void setBusFeatureClassifier(BusSubcomponentType value);

} // BusAccess
