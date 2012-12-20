/**
 */
package at.bestsolution.efxclipse.tooling.rrobot.model.bundle;

import at.bestsolution.efxclipse.tooling.rrobot.model.task.ExcludeableElementMixin;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.BooleanExpression;
import org.eclipse.emf.ecore.EObject;

import org.osgi.framework.Version;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ProductFeature#getId <em>Id</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ProductFeature#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundlePackage#getProductFeature()
 * @model
 * @generated
 */
public interface ProductFeature extends ExcludeableElementMixin {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundlePackage#getProductFeature_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ProductFeature#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundlePackage#getProductFeature_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ProductFeature#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // ProductFeature
