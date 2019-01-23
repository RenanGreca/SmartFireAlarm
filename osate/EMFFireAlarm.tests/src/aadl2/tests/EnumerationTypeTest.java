/**
 */
package aadl2.tests;

import aadl2.Aadl2Factory;
import aadl2.EnumerationType;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Enumeration Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link aadl2.Type#conformsTo(aadl2.Type) <em>Conforms To</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class EnumerationTypeTest extends NamespaceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EnumerationTypeTest.class);
	}

	/**
	 * Constructs a new Enumeration Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Enumeration Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EnumerationType getFixture() {
		return (EnumerationType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Aadl2Factory.eINSTANCE.createEnumerationType());
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

	/**
	 * Tests the '{@link aadl2.Type#conformsTo(aadl2.Type) <em>Conforms To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aadl2.Type#conformsTo(aadl2.Type)
	 * @generated
	 */
	public void testConformsTo__Type() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //EnumerationTypeTest
