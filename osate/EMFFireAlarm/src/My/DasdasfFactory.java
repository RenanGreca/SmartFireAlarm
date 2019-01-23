/**
 */
package My;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see My.DasdasfPackage
 * @generated
 */
public interface DasdasfFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DasdasfFactory eINSTANCE = My.impl.DasdasfFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>My Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>My Class</em>'.
	 * @generated
	 */
	MyClass createMyClass();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DasdasfPackage getDasdasfPackage();

} //DasdasfFactory
