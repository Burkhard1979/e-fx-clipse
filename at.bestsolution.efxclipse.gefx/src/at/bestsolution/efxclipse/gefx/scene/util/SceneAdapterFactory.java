/**
 */
package at.bestsolution.efxclipse.gefx.scene.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import at.bestsolution.efxclipse.gefx.scene.Block;
import at.bestsolution.efxclipse.gefx.scene.Connection;
import at.bestsolution.efxclipse.gefx.scene.Connector;
import at.bestsolution.efxclipse.gefx.scene.LinePoint;
import at.bestsolution.efxclipse.gefx.scene.ScenePackage;
import at.bestsolution.efxclipse.gefx.scene.Shape;
import at.bestsolution.efxclipse.gefx.scene.StraightLine;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see at.bestsolution.efxclipse.gefx.scene.ScenePackage
 * @generated
 */
public class SceneAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ScenePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SceneAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ScenePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SceneSwitch<Adapter> modelSwitch =
		new SceneSwitch<Adapter>() {
			@Override
			public Adapter caseShape(Shape object) {
				return createShapeAdapter();
			}
			@Override
			public Adapter caseSystem(at.bestsolution.efxclipse.gefx.scene.System object) {
				return createSystemAdapter();
			}
			@Override
			public Adapter caseBlock(Block object) {
				return createBlockAdapter();
			}
			@Override
			public Adapter caseConnection(Connection object) {
				return createConnectionAdapter();
			}
			@Override
			public Adapter caseConnector(Connector object) {
				return createConnectorAdapter();
			}
			@Override
			public Adapter caseLinePoint(LinePoint object) {
				return createLinePointAdapter();
			}
			@Override
			public Adapter caseStraightLine(StraightLine object) {
				return createStraightLineAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.gefx.scene.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.gefx.scene.Shape
	 * @generated
	 */
	public Adapter createShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.gefx.scene.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.gefx.scene.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.gefx.scene.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.gefx.scene.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.gefx.scene.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.gefx.scene.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.gefx.scene.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.gefx.scene.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.gefx.scene.LinePoint <em>Line Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.gefx.scene.LinePoint
	 * @generated
	 */
	public Adapter createLinePointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.gefx.scene.StraightLine <em>Straight Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.gefx.scene.StraightLine
	 * @generated
	 */
	public Adapter createStraightLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SceneAdapterFactory
