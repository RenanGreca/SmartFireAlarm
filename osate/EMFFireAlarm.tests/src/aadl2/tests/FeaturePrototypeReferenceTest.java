/**
 */
package aadl2.tests;

import aadl2.Aadl2Factory;
import aadl2.FeaturePrototypeReference;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Feature Prototype Reference</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeaturePrototypeReferenceTest extends FeaturePrototypeActualTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FeaturePrototypeReferenceTest.class);
	}

	/**
	 * Constructs a new Feature Prototype Reference test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturePrototypeReferenceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Feature Prototype Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FeaturePrototypeReference getFixture() {
		return (FeaturePrototypeReference)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Aadl2Factory.eINSTANCE.createFeaturePrototypeReference());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //FeaturePrototypeReferenceTest
