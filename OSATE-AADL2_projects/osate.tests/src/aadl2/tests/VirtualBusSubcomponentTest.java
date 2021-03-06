/**
 */
package aadl2.tests;

import aadl2.Aadl2Factory;
import aadl2.VirtualBusSubcomponent;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Virtual Bus Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VirtualBusSubcomponentTest extends SubcomponentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VirtualBusSubcomponentTest.class);
	}

	/**
	 * Constructs a new Virtual Bus Subcomponent test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualBusSubcomponentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Virtual Bus Subcomponent test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected VirtualBusSubcomponent getFixture() {
		return (VirtualBusSubcomponent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Aadl2Factory.eINSTANCE.createVirtualBusSubcomponent());
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

} //VirtualBusSubcomponentTest
