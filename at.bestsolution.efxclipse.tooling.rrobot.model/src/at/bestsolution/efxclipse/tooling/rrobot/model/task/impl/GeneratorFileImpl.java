/**
 */
package at.bestsolution.efxclipse.tooling.rrobot.model.task.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import at.bestsolution.efxclipse.tooling.rrobot.model.task.Generator;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.GeneratorFile;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.TaskPackage;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.GeneratorFileImpl#getGeneratorInstance <em>Generator Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneratorFileImpl extends FileImpl implements GeneratorFile {
	/**
	 * The cached value of the '{@link #getGeneratorInstance() <em>Generator Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratorInstance()
	 * @generated
	 * @ordered
	 */
	protected Generator<GeneratorFile> generatorInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskPackage.Literals.GENERATOR_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generator<GeneratorFile> getGeneratorInstance() {
		return generatorInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratorInstance(Generator<GeneratorFile> newGeneratorInstance) {
		Generator<GeneratorFile> oldGeneratorInstance = generatorInstance;
		generatorInstance = newGeneratorInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.GENERATOR_FILE__GENERATOR_INSTANCE, oldGeneratorInstance, generatorInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaskPackage.GENERATOR_FILE__GENERATOR_INSTANCE:
				return getGeneratorInstance();
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
			case TaskPackage.GENERATOR_FILE__GENERATOR_INSTANCE:
				setGeneratorInstance((Generator<GeneratorFile>)newValue);
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
			case TaskPackage.GENERATOR_FILE__GENERATOR_INSTANCE:
				setGeneratorInstance((Generator<GeneratorFile>)null);
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
			case TaskPackage.GENERATOR_FILE__GENERATOR_INSTANCE:
				return generatorInstance != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (generatorInstance: ");
		result.append(generatorInstance);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public InputStream getContent(IProgressMonitor progressMonitor, Map<String, Object> data) throws IOException {
		return generatorInstance.generate(this, data);
	}

} //GeneratorFileImpl
