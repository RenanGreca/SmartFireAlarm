/**
 */
package instance.tests;

import instance.FlowSpecificationInstance;
import instance.InstanceFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Flow Specification Instance</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FlowSpecificationInstanceTest extends FlowElementInstanceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FlowSpecificationInstanceTest.class);
	}

	/**
	 * Constructs a new Flow Specification Instance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowSpecificationInstanceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Flow Specification Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FlowSpecificationInstance getFixture() {
		return (FlowSpecificationInstance)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InstanceFactory.eINSTANCE.createFlowSpecificationInstance());
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

} //FlowSpecificationInstanceTest
