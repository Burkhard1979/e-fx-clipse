/**
 */
package at.bestsolution.efxclipse.gefx.scene.impl;

import at.bestsolution.efxclipse.gefx.scene.Block;
import at.bestsolution.efxclipse.gefx.scene.Connection;
import at.bestsolution.efxclipse.gefx.scene.StraightLine;
import at.bestsolution.efxclipse.gefx.scene.ScenePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.gefx.scene.impl.SystemImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.gefx.scene.impl.SystemImpl#getBlocks <em>Blocks</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.gefx.scene.impl.SystemImpl#getLines <em>Lines</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemImpl extends EObjectImpl implements at.bestsolution.efxclipse.gefx.scene.System {
	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connections;

	/**
	 * The cached value of the '{@link #getBlocks() <em>Blocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<Block> blocks;

	/**
	 * The cached value of the '{@link #getLines() <em>Lines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLines()
	 * @generated
	 * @ordered
	 */
	protected EList<StraightLine> lines;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenePackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnections() {
		if (connections == null) {
			connections = new EObjectContainmentWithInverseEList<Connection>(Connection.class, this, ScenePackage.SYSTEM__CONNECTIONS, ScenePackage.CONNECTION__SYSTEM);
		}
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Block> getBlocks() {
		if (blocks == null) {
			blocks = new EObjectContainmentWithInverseEList<Block>(Block.class, this, ScenePackage.SYSTEM__BLOCKS, ScenePackage.BLOCK__SYSTEM);
		}
		return blocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StraightLine> getLines() {
		if (lines == null) {
			lines = new EObjectContainmentEList<StraightLine>(StraightLine.class, this, ScenePackage.SYSTEM__LINES);
		}
		return lines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScenePackage.SYSTEM__CONNECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnections()).basicAdd(otherEnd, msgs);
			case ScenePackage.SYSTEM__BLOCKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBlocks()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScenePackage.SYSTEM__CONNECTIONS:
				return ((InternalEList<?>)getConnections()).basicRemove(otherEnd, msgs);
			case ScenePackage.SYSTEM__BLOCKS:
				return ((InternalEList<?>)getBlocks()).basicRemove(otherEnd, msgs);
			case ScenePackage.SYSTEM__LINES:
				return ((InternalEList<?>)getLines()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScenePackage.SYSTEM__CONNECTIONS:
				return getConnections();
			case ScenePackage.SYSTEM__BLOCKS:
				return getBlocks();
			case ScenePackage.SYSTEM__LINES:
				return getLines();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ScenePackage.SYSTEM__CONNECTIONS:
				getConnections().clear();
				getConnections().addAll((Collection<? extends Connection>)newValue);
				return;
			case ScenePackage.SYSTEM__BLOCKS:
				getBlocks().clear();
				getBlocks().addAll((Collection<? extends Block>)newValue);
				return;
			case ScenePackage.SYSTEM__LINES:
				getLines().clear();
				getLines().addAll((Collection<? extends StraightLine>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ScenePackage.SYSTEM__CONNECTIONS:
				getConnections().clear();
				return;
			case ScenePackage.SYSTEM__BLOCKS:
				getBlocks().clear();
				return;
			case ScenePackage.SYSTEM__LINES:
				getLines().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ScenePackage.SYSTEM__CONNECTIONS:
				return connections != null && !connections.isEmpty();
			case ScenePackage.SYSTEM__BLOCKS:
				return blocks != null && !blocks.isEmpty();
			case ScenePackage.SYSTEM__LINES:
				return lines != null && !lines.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemImpl
