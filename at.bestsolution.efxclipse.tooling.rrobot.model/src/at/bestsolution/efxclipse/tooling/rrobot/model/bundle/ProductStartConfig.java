/**
 */
package at.bestsolution.efxclipse.tooling.rrobot.model.bundle;

import at.bestsolution.efxclipse.tooling.rrobot.model.task.BooleanExpression;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Start Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ProductStartConfig#getId <em>Id</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ProductStartConfig#isAutoStart <em>Auto Start</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ProductStartConfig#getStartLevel <em>Start Level</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ProductStartConfig#getExcludeExpression <em>Exclude Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundlePackage#getProductStartConfig()
 * @model
 * @generated
 */
public interface ProductStartConfig extends EObject {
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
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundlePackage#getProductStartConfig_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ProductStartConfig#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Auto Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Start</em>' attribute.
	 * @see #setAutoStart(boolean)
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundlePackage#getProductStartConfig_AutoStart()
	 * @model
	 * @generated
	 */
	boolean isAutoStart();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ProductStartConfig#isAutoStart <em>Auto Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Start</em>' attribute.
	 * @see #isAutoStart()
	 * @generated
	 */
	void setAutoStart(boolean value);

	/**
	 * Returns the value of the '<em><b>Start Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Level</em>' attribute.
	 * @see #setStartLevel(int)
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundlePackage#getProductStartConfig_StartLevel()
	 * @model
	 * @generated
	 */
	int getStartLevel();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ProductStartConfig#getStartLevel <em>Start Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Level</em>' attribute.
	 * @see #getStartLevel()
	 * @generated
	 */
	void setStartLevel(int value);

	/**
	 * Returns the value of the '<em><b>Exclude Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclude Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude Expression</em>' containment reference.
	 * @see #setExcludeExpression(BooleanExpression)
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundlePackage#getProductStartConfig_ExcludeExpression()
	 * @model containment="true"
	 * @generated
	 */
	BooleanExpression getExcludeExpression();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ProductStartConfig#getExcludeExpression <em>Exclude Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude Expression</em>' containment reference.
	 * @see #getExcludeExpression()
	 * @generated
	 */
	void setExcludeExpression(BooleanExpression value);

} // ProductStartConfig
