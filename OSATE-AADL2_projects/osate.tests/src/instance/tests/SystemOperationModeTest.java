/**
 */
package instance.tests;

import aadl2.tests.ModeTest;

import instance.InstanceFactory;
import instance.SystemOperationMode;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>System Operation Mode</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemOperationModeTest extends ModeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SystemOperationModeTest.class);
	}

	/**
	 * Constructs a new System Operation Mode test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemOperationModeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this System Operation Mode test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SystemOperationMode getFixture() {
		return (SystemOperationMode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InstanceFactory.eINSTANCE.createSystemOperationMode());
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

} //SystemOperationModeTest
