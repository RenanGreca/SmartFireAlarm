/**
 */
package instance.tests;

import aadl2.tests.PropertyValueTest;

import instance.InstanceFactory;
import instance.InstanceReferenceValue;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Reference Value</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstanceReferenceValueTest extends PropertyValueTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InstanceReferenceValueTest.class);
	}

	/**
	 * Constructs a new Reference Value test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceReferenceValueTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Reference Value test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InstanceReferenceValue getFixture() {
		return (InstanceReferenceValue)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InstanceFactory.eINSTANCE.createInstanceReferenceValue());
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

} //InstanceReferenceValueTest
