/**
 */
package at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl;

import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BuildProperties;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundlePackage;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundleProject;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ManifestFile;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.PluginXMLFile;

import at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.ProjectImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.BundleProjectImpl#getManifest <em>Manifest</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.BundleProjectImpl#getBuildProperties <em>Build Properties</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.BundleProjectImpl#getPluginxml <em>Pluginxml</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.BundleProjectImpl#getLazy <em>Lazy</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.BundleProjectImpl#getSingleton <em>Singleton</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.BundleProjectImpl#getActivatorClass <em>Activator Class</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.BundleProjectImpl#getVendor <em>Vendor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BundleProjectImpl extends ProjectImpl implements BundleProject {
	/**
	 * The cached value of the '{@link #getManifest() <em>Manifest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManifest()
	 * @generated
	 * @ordered
	 */
	protected ManifestFile manifest;

	/**
	 * The cached value of the '{@link #getBuildProperties() <em>Build Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildProperties()
	 * @generated
	 * @ordered
	 */
	protected BuildProperties buildProperties;

	/**
	 * The cached value of the '{@link #getPluginxml() <em>Pluginxml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginxml()
	 * @generated
	 * @ordered
	 */
	protected PluginXMLFile pluginxml;

	/**
	 * The default value of the '{@link #getLazy() <em>Lazy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLazy()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean LAZY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLazy() <em>Lazy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLazy()
	 * @generated
	 * @ordered
	 */
	protected Boolean lazy = LAZY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSingleton() <em>Singleton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleton()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SINGLETON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSingleton() <em>Singleton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleton()
	 * @generated
	 * @ordered
	 */
	protected Boolean singleton = SINGLETON_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivatorClass() <em>Activator Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivatorClass()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVATOR_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivatorClass() <em>Activator Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivatorClass()
	 * @generated
	 * @ordered
	 */
	protected String activatorClass = ACTIVATOR_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected static final String VENDOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected String vendor = VENDOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BundleProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BundlePackage.Literals.BUNDLE_PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManifestFile getManifest() {
		return manifest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManifest(ManifestFile newManifest, NotificationChain msgs) {
		ManifestFile oldManifest = manifest;
		manifest = newManifest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BundlePackage.BUNDLE_PROJECT__MANIFEST, oldManifest, newManifest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManifest(ManifestFile newManifest) {
		if (newManifest != manifest) {
			NotificationChain msgs = null;
			if (manifest != null)
				msgs = ((InternalEObject)manifest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BundlePackage.BUNDLE_PROJECT__MANIFEST, null, msgs);
			if (newManifest != null)
				msgs = ((InternalEObject)newManifest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BundlePackage.BUNDLE_PROJECT__MANIFEST, null, msgs);
			msgs = basicSetManifest(newManifest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.BUNDLE_PROJECT__MANIFEST, newManifest, newManifest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildProperties getBuildProperties() {
		return buildProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBuildProperties(BuildProperties newBuildProperties, NotificationChain msgs) {
		BuildProperties oldBuildProperties = buildProperties;
		buildProperties = newBuildProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BundlePackage.BUNDLE_PROJECT__BUILD_PROPERTIES, oldBuildProperties, newBuildProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuildProperties(BuildProperties newBuildProperties) {
		if (newBuildProperties != buildProperties) {
			NotificationChain msgs = null;
			if (buildProperties != null)
				msgs = ((InternalEObject)buildProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BundlePackage.BUNDLE_PROJECT__BUILD_PROPERTIES, null, msgs);
			if (newBuildProperties != null)
				msgs = ((InternalEObject)newBuildProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BundlePackage.BUNDLE_PROJECT__BUILD_PROPERTIES, null, msgs);
			msgs = basicSetBuildProperties(newBuildProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.BUNDLE_PROJECT__BUILD_PROPERTIES, newBuildProperties, newBuildProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PluginXMLFile getPluginxml() {
		return pluginxml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPluginxml(PluginXMLFile newPluginxml, NotificationChain msgs) {
		PluginXMLFile oldPluginxml = pluginxml;
		pluginxml = newPluginxml;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BundlePackage.BUNDLE_PROJECT__PLUGINXML, oldPluginxml, newPluginxml);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPluginxml(PluginXMLFile newPluginxml) {
		if (newPluginxml != pluginxml) {
			NotificationChain msgs = null;
			if (pluginxml != null)
				msgs = ((InternalEObject)pluginxml).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BundlePackage.BUNDLE_PROJECT__PLUGINXML, null, msgs);
			if (newPluginxml != null)
				msgs = ((InternalEObject)newPluginxml).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BundlePackage.BUNDLE_PROJECT__PLUGINXML, null, msgs);
			msgs = basicSetPluginxml(newPluginxml, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.BUNDLE_PROJECT__PLUGINXML, newPluginxml, newPluginxml));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getLazy() {
		return lazy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLazy(Boolean newLazy) {
		Boolean oldLazy = lazy;
		lazy = newLazy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.BUNDLE_PROJECT__LAZY, oldLazy, lazy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getSingleton() {
		return singleton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingleton(Boolean newSingleton) {
		Boolean oldSingleton = singleton;
		singleton = newSingleton;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.BUNDLE_PROJECT__SINGLETON, oldSingleton, singleton));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActivatorClass() {
		return activatorClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivatorClass(String newActivatorClass) {
		String oldActivatorClass = activatorClass;
		activatorClass = newActivatorClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.BUNDLE_PROJECT__ACTIVATOR_CLASS, oldActivatorClass, activatorClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVendor() {
		return vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVendor(String newVendor) {
		String oldVendor = vendor;
		vendor = newVendor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.BUNDLE_PROJECT__VENDOR, oldVendor, vendor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BundlePackage.BUNDLE_PROJECT__MANIFEST:
				return basicSetManifest(null, msgs);
			case BundlePackage.BUNDLE_PROJECT__BUILD_PROPERTIES:
				return basicSetBuildProperties(null, msgs);
			case BundlePackage.BUNDLE_PROJECT__PLUGINXML:
				return basicSetPluginxml(null, msgs);
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
			case BundlePackage.BUNDLE_PROJECT__MANIFEST:
				return getManifest();
			case BundlePackage.BUNDLE_PROJECT__BUILD_PROPERTIES:
				return getBuildProperties();
			case BundlePackage.BUNDLE_PROJECT__PLUGINXML:
				return getPluginxml();
			case BundlePackage.BUNDLE_PROJECT__LAZY:
				return getLazy();
			case BundlePackage.BUNDLE_PROJECT__SINGLETON:
				return getSingleton();
			case BundlePackage.BUNDLE_PROJECT__ACTIVATOR_CLASS:
				return getActivatorClass();
			case BundlePackage.BUNDLE_PROJECT__VENDOR:
				return getVendor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BundlePackage.BUNDLE_PROJECT__MANIFEST:
				setManifest((ManifestFile)newValue);
				return;
			case BundlePackage.BUNDLE_PROJECT__BUILD_PROPERTIES:
				setBuildProperties((BuildProperties)newValue);
				return;
			case BundlePackage.BUNDLE_PROJECT__PLUGINXML:
				setPluginxml((PluginXMLFile)newValue);
				return;
			case BundlePackage.BUNDLE_PROJECT__LAZY:
				setLazy((Boolean)newValue);
				return;
			case BundlePackage.BUNDLE_PROJECT__SINGLETON:
				setSingleton((Boolean)newValue);
				return;
			case BundlePackage.BUNDLE_PROJECT__ACTIVATOR_CLASS:
				setActivatorClass((String)newValue);
				return;
			case BundlePackage.BUNDLE_PROJECT__VENDOR:
				setVendor((String)newValue);
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
			case BundlePackage.BUNDLE_PROJECT__MANIFEST:
				setManifest((ManifestFile)null);
				return;
			case BundlePackage.BUNDLE_PROJECT__BUILD_PROPERTIES:
				setBuildProperties((BuildProperties)null);
				return;
			case BundlePackage.BUNDLE_PROJECT__PLUGINXML:
				setPluginxml((PluginXMLFile)null);
				return;
			case BundlePackage.BUNDLE_PROJECT__LAZY:
				setLazy(LAZY_EDEFAULT);
				return;
			case BundlePackage.BUNDLE_PROJECT__SINGLETON:
				setSingleton(SINGLETON_EDEFAULT);
				return;
			case BundlePackage.BUNDLE_PROJECT__ACTIVATOR_CLASS:
				setActivatorClass(ACTIVATOR_CLASS_EDEFAULT);
				return;
			case BundlePackage.BUNDLE_PROJECT__VENDOR:
				setVendor(VENDOR_EDEFAULT);
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
			case BundlePackage.BUNDLE_PROJECT__MANIFEST:
				return manifest != null;
			case BundlePackage.BUNDLE_PROJECT__BUILD_PROPERTIES:
				return buildProperties != null;
			case BundlePackage.BUNDLE_PROJECT__PLUGINXML:
				return pluginxml != null;
			case BundlePackage.BUNDLE_PROJECT__LAZY:
				return LAZY_EDEFAULT == null ? lazy != null : !LAZY_EDEFAULT.equals(lazy);
			case BundlePackage.BUNDLE_PROJECT__SINGLETON:
				return SINGLETON_EDEFAULT == null ? singleton != null : !SINGLETON_EDEFAULT.equals(singleton);
			case BundlePackage.BUNDLE_PROJECT__ACTIVATOR_CLASS:
				return ACTIVATOR_CLASS_EDEFAULT == null ? activatorClass != null : !ACTIVATOR_CLASS_EDEFAULT.equals(activatorClass);
			case BundlePackage.BUNDLE_PROJECT__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
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
		result.append(" (lazy: ");
		result.append(lazy);
		result.append(", singleton: ");
		result.append(singleton);
		result.append(", activatorClass: ");
		result.append(activatorClass);
		result.append(", vendor: ");
		result.append(vendor);
		result.append(')');
		return result.toString();
	}

} //BundleProjectImpl
