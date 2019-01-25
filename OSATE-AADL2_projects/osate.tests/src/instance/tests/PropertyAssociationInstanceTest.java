/**
 */
package instance.tests;

import aadl2.tests.PropertyAssociationTest;

import instance.InstanceFactory;
import instance.PropertyAssociationInstance;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Property Association Instance</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertyAssociationInstanceTest extends PropertyAssociationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PropertyAssociationInstanceTest.class);
	}

	/**
	 * Constructs a new Property Association Instance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyAssociationInstanceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Property Association Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PropertyAssociationInstance getFixture() {
		return (PropertyAssociationInstance)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InstanceFactory.eINSTANCE.createPropertyAssociationInstance());
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

} //PropertyAssociationInstanceTest
