/**
 */
package at.bestsolution.efxclipse.tooling.rrobot.model.bundle;

import at.bestsolution.efxclipse.tooling.rrobot.model.task.Project;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundleProject#getManifest <em>Manifest</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundleProject#getBuildProperties <em>Build Properties</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundleProject#getPluginxml <em>Pluginxml</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundleProject#getLazy <em>Lazy</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundleProject#getSingleton <em>Singleton</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundleProject#getActivatorClass <em>Activator Class</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundleProject#getVendor <em>Vendor</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundlePackage#getBundleProject()
 * @model
 * @generated
 */
public interface BundleProject extends Project {
	/**
	 * Returns the value of the '<em><b>Manifest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manifest</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manifest</em>' containment reference.
	 * @see #setManifest(ManifestFile)
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundlePackage#getBundleProject_Manifest()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ManifestFile getManifest();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundleProject#getManifest <em>Manifest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manifest</em>' containment reference.
	 * @see #getManifest()
	 * @generated
	 */
	void setManifest(ManifestFile value);

	/**
	 * Returns the value of the '<em><b>Build Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Build Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Properties</em>' containment reference.
	 * @see #setBuildProperties(BuildProperties)
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundlePackage#getBundleProject_BuildProperties()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BuildProperties getBuildProperties();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundleProject#getBuildProperties <em>Build Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build Properties</em>' containment reference.
	 * @see #getBuildProperties()
	 * @generated
	 */
	void setBuildProperties(BuildProperties value);

	/**
	 * Returns the value of the '<em><b>Pluginxml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pluginxml</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pluginxml</em>' containment reference.
	 * @see #setPluginxml(PluginXMLFile)
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundlePackage#getBundleProject_Pluginxml()
	 * @model containment="true"
	 * @generated
	 */
	PluginXMLFile getPluginxml();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundleProject#getPluginxml <em>Pluginxml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pluginxml</em>' containment reference.
	 * @see #getPluginxml()
	 * @generated
	 */
	void setPluginxml(PluginXMLFile value);

	/**
	 * Returns the value of the '<em><b>Lazy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lazy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lazy</em>' attribute.
	 * @see #setLazy(Boolean)
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundlePackage#getBundleProject_Lazy()
	 * @model
	 * @generated
	 */
	Boolean getLazy();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundleProject#getLazy <em>Lazy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lazy</em>' attribute.
	 * @see #getLazy()
	 * @generated
	 */
	void setLazy(Boolean value);

	/**
	 * Returns the value of the '<em><b>Singleton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Singleton</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Singleton</em>' attribute.
	 * @see #setSingleton(Boolean)
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundlePackage#getBundleProject_Singleton()
	 * @model
	 * @generated
	 */
	Boolean getSingleton();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundleProject#getSingleton <em>Singleton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Singleton</em>' attribute.
	 * @see #getSingleton()
	 * @generated
	 */
	void setSingleton(Boolean value);

	/**
	 * Returns the value of the '<em><b>Activator Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activator Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activator Class</em>' attribute.
	 * @see #setActivatorClass(String)
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundlePackage#getBundleProject_ActivatorClass()
	 * @model
	 * @generated
	 */
	String getActivatorClass();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundleProject#getActivatorClass <em>Activator Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activator Class</em>' attribute.
	 * @see #getActivatorClass()
	 * @generated
	 */
	void setActivatorClass(String value);

	/**
	 * Returns the value of the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor</em>' attribute.
	 * @see #setVendor(String)
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundlePackage#getBundleProject_Vendor()
	 * @model
	 * @generated
	 */
	String getVendor();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundleProject#getVendor <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor</em>' attribute.
	 * @see #getVendor()
	 * @generated
	 */
	void setVendor(String value);

} // BundleProject
