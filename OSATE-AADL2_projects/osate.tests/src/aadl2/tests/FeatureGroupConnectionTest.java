/**
 */
package aadl2.tests;

import aadl2.Aadl2Factory;
import aadl2.FeatureGroupConnection;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Feature Group Connection</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureGroupConnectionTest extends ConnectionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FeatureGroupConnectionTest.class);
	}

	/**
	 * Constructs a new Feature Group Connection test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureGroupConnectionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Feature Group Connection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FeatureGroupConnection getFixture() {
		return (FeatureGroupConnection)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Aadl2Factory.eINSTANCE.createFeatureGroupConnection());
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

} //FeatureGroupConnectionTest
