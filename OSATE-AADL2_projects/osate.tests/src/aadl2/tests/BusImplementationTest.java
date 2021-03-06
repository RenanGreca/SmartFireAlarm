/**
 */
package aadl2.tests;

import aadl2.Aadl2Factory;
import aadl2.BusImplementation;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bus Implementation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BusImplementationTest extends ComponentImplementationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BusImplementationTest.class);
	}

	/**
	 * Constructs a new Bus Implementation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusImplementationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bus Implementation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BusImplementation getFixture() {
		return (BusImplementation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Aadl2Factory.eINSTANCE.createBusImplementation());
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

} //BusImplementationTest
