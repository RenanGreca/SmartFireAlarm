/**
 */
package instance.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>instance</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstanceTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new InstanceTests("instance Tests");
		suite.addTestSuite(FeatureInstanceTest.class);
		suite.addTestSuite(PropertyAssociationInstanceTest.class);
		suite.addTestSuite(ConnectionInstanceTest.class);
		suite.addTestSuite(SystemOperationModeTest.class);
		suite.addTestSuite(ModeInstanceTest.class);
		suite.addTestSuite(ModeTransitionInstanceTest.class);
		suite.addTestSuite(ConnectionReferenceTest.class);
		suite.addTestSuite(ComponentInstanceTest.class);
		suite.addTestSuite(FlowSpecificationInstanceTest.class);
		suite.addTestSuite(EndToEndFlowInstanceTest.class);
		suite.addTestSuite(SystemInstanceTest.class);
		suite.addTestSuite(InstanceReferenceValueTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceTests(String name) {
		super(name);
	}

} //InstanceTests
