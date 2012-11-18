/**
 */
package at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl;

import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.Attribute;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BuildProperties;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundleFactory;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundlePackage;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundleProject;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.Element;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ExportedPackage;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.Extension;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ImportedPackage;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ManifestFile;
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.PluginXMLFile;

import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.RequiredBundle;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.TaskPackage;

import at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.TaskPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.osgi.framework.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BundlePackageImpl extends EPackageImpl implements BundlePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manifestFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pluginXMLFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importedPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exportedPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredBundleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType versionEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundlePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BundlePackageImpl() {
		super(eNS_URI, BundleFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BundlePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BundlePackage init() {
		if (isInited) return (BundlePackage)EPackage.Registry.INSTANCE.getEPackage(BundlePackage.eNS_URI);

		// Obtain or create and register package
		BundlePackageImpl theBundlePackage = (BundlePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BundlePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BundlePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TaskPackageImpl theTaskPackage = (TaskPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TaskPackage.eNS_URI) instanceof TaskPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TaskPackage.eNS_URI) : TaskPackage.eINSTANCE);

		// Create package meta-data objects
		theBundlePackage.createPackageContents();
		theTaskPackage.createPackageContents();

		// Initialize created meta-data
		theBundlePackage.initializePackageContents();
		theTaskPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBundlePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BundlePackage.eNS_URI, theBundlePackage);
		return theBundlePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundleProject() {
		return bundleProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleProject_Manifest() {
		return (EReference)bundleProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleProject_BuildProperties() {
		return (EReference)bundleProjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleProject_Pluginxml() {
		return (EReference)bundleProjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBundleProject_Lazy() {
		return (EAttribute)bundleProjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBundleProject_Singleton() {
		return (EAttribute)bundleProjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBundleProject_ActivatorClass() {
		return (EAttribute)bundleProjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBundleProject_Vendor() {
		return (EAttribute)bundleProjectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManifestFile() {
		return manifestFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManifestFile_Bundlename() {
		return (EAttribute)manifestFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManifestFile_Symbolicname() {
		return (EAttribute)manifestFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManifestFile_Version() {
		return (EAttribute)manifestFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManifestFile_ExportedPackages() {
		return (EReference)manifestFileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManifestFile_ImportedPackages() {
		return (EReference)manifestFileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManifestFile_ExecutionEnvironment() {
		return (EAttribute)manifestFileEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManifestFile_RequiredBundles() {
		return (EReference)manifestFileEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPluginXMLFile() {
		return pluginXMLFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPluginXMLFile_Extensions() {
		return (EReference)pluginXMLFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuildProperties() {
		return buildPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuildProperties_BinIncludes() {
		return (EReference)buildPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImportedPackage() {
		return importedPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportedPackage_Name() {
		return (EAttribute)importedPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportedPackage_MinVersion() {
		return (EAttribute)importedPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportedPackage_MaxVersion() {
		return (EAttribute)importedPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportedPackage_MinExclusive() {
		return (EAttribute)importedPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportedPackage_MaxExclusive() {
		return (EAttribute)importedPackageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExportedPackage() {
		return exportedPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExportedPackage_Name() {
		return (EAttribute)exportedPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExportedPackage_Version() {
		return (EAttribute)exportedPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtension() {
		return extensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtension_Id() {
		return (EAttribute)extensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtension_Point() {
		return (EAttribute)extensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_Elements() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Name() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Attributes() {
		return (EReference)elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Children() {
		return (EReference)elementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Name() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Value() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredBundle() {
		return requiredBundleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequiredBundle_Name() {
		return (EAttribute)requiredBundleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequiredBundle_MinVersion() {
		return (EAttribute)requiredBundleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequiredBundle_MaxVersion() {
		return (EAttribute)requiredBundleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequiredBundle_MinExclusive() {
		return (EAttribute)requiredBundleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequiredBundle_MaxExclusive() {
		return (EAttribute)requiredBundleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVersion() {
		return versionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleFactory getBundleFactory() {
		return (BundleFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		bundleProjectEClass = createEClass(BUNDLE_PROJECT);
		createEReference(bundleProjectEClass, BUNDLE_PROJECT__MANIFEST);
		createEReference(bundleProjectEClass, BUNDLE_PROJECT__BUILD_PROPERTIES);
		createEReference(bundleProjectEClass, BUNDLE_PROJECT__PLUGINXML);
		createEAttribute(bundleProjectEClass, BUNDLE_PROJECT__LAZY);
		createEAttribute(bundleProjectEClass, BUNDLE_PROJECT__SINGLETON);
		createEAttribute(bundleProjectEClass, BUNDLE_PROJECT__ACTIVATOR_CLASS);
		createEAttribute(bundleProjectEClass, BUNDLE_PROJECT__VENDOR);

		manifestFileEClass = createEClass(MANIFEST_FILE);
		createEAttribute(manifestFileEClass, MANIFEST_FILE__BUNDLENAME);
		createEAttribute(manifestFileEClass, MANIFEST_FILE__SYMBOLICNAME);
		createEAttribute(manifestFileEClass, MANIFEST_FILE__VERSION);
		createEReference(manifestFileEClass, MANIFEST_FILE__EXPORTED_PACKAGES);
		createEReference(manifestFileEClass, MANIFEST_FILE__IMPORTED_PACKAGES);
		createEAttribute(manifestFileEClass, MANIFEST_FILE__EXECUTION_ENVIRONMENT);
		createEReference(manifestFileEClass, MANIFEST_FILE__REQUIRED_BUNDLES);

		pluginXMLFileEClass = createEClass(PLUGIN_XML_FILE);
		createEReference(pluginXMLFileEClass, PLUGIN_XML_FILE__EXTENSIONS);

		buildPropertiesEClass = createEClass(BUILD_PROPERTIES);
		createEReference(buildPropertiesEClass, BUILD_PROPERTIES__BIN_INCLUDES);

		importedPackageEClass = createEClass(IMPORTED_PACKAGE);
		createEAttribute(importedPackageEClass, IMPORTED_PACKAGE__NAME);
		createEAttribute(importedPackageEClass, IMPORTED_PACKAGE__MIN_VERSION);
		createEAttribute(importedPackageEClass, IMPORTED_PACKAGE__MAX_VERSION);
		createEAttribute(importedPackageEClass, IMPORTED_PACKAGE__MIN_EXCLUSIVE);
		createEAttribute(importedPackageEClass, IMPORTED_PACKAGE__MAX_EXCLUSIVE);

		exportedPackageEClass = createEClass(EXPORTED_PACKAGE);
		createEAttribute(exportedPackageEClass, EXPORTED_PACKAGE__NAME);
		createEAttribute(exportedPackageEClass, EXPORTED_PACKAGE__VERSION);

		extensionEClass = createEClass(EXTENSION);
		createEAttribute(extensionEClass, EXTENSION__ID);
		createEAttribute(extensionEClass, EXTENSION__POINT);
		createEReference(extensionEClass, EXTENSION__ELEMENTS);

		elementEClass = createEClass(ELEMENT);
		createEAttribute(elementEClass, ELEMENT__NAME);
		createEReference(elementEClass, ELEMENT__ATTRIBUTES);
		createEReference(elementEClass, ELEMENT__CHILDREN);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__NAME);
		createEAttribute(attributeEClass, ATTRIBUTE__VALUE);

		requiredBundleEClass = createEClass(REQUIRED_BUNDLE);
		createEAttribute(requiredBundleEClass, REQUIRED_BUNDLE__NAME);
		createEAttribute(requiredBundleEClass, REQUIRED_BUNDLE__MIN_VERSION);
		createEAttribute(requiredBundleEClass, REQUIRED_BUNDLE__MAX_VERSION);
		createEAttribute(requiredBundleEClass, REQUIRED_BUNDLE__MIN_EXCLUSIVE);
		createEAttribute(requiredBundleEClass, REQUIRED_BUNDLE__MAX_EXCLUSIVE);

		// Create data types
		versionEDataType = createEDataType(VERSION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TaskPackage theTaskPackage = (TaskPackage)EPackage.Registry.INSTANCE.getEPackage(TaskPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bundleProjectEClass.getESuperTypes().add(theTaskPackage.getProject());
		manifestFileEClass.getESuperTypes().add(theTaskPackage.getTemplatedFile());
		pluginXMLFileEClass.getESuperTypes().add(theTaskPackage.getTemplatedFile());
		buildPropertiesEClass.getESuperTypes().add(theTaskPackage.getTemplatedFile());

		// Initialize classes and features; add operations and parameters
		initEClass(bundleProjectEClass, BundleProject.class, "BundleProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBundleProject_Manifest(), this.getManifestFile(), null, "manifest", null, 1, 1, BundleProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundleProject_BuildProperties(), this.getBuildProperties(), null, "buildProperties", null, 1, 1, BundleProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundleProject_Pluginxml(), this.getPluginXMLFile(), null, "pluginxml", null, 0, 1, BundleProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBundleProject_Lazy(), ecorePackage.getEBooleanObject(), "lazy", null, 0, 1, BundleProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBundleProject_Singleton(), ecorePackage.getEBooleanObject(), "singleton", null, 0, 1, BundleProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBundleProject_ActivatorClass(), ecorePackage.getEString(), "activatorClass", null, 0, 1, BundleProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBundleProject_Vendor(), ecorePackage.getEString(), "vendor", null, 0, 1, BundleProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(manifestFileEClass, ManifestFile.class, "ManifestFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getManifestFile_Bundlename(), ecorePackage.getEString(), "bundlename", null, 1, 1, ManifestFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManifestFile_Symbolicname(), ecorePackage.getEString(), "symbolicname", null, 1, 1, ManifestFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManifestFile_Version(), this.getVersion(), "version", null, 1, 1, ManifestFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManifestFile_ExportedPackages(), this.getExportedPackage(), null, "exportedPackages", null, 0, -1, ManifestFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManifestFile_ImportedPackages(), this.getImportedPackage(), null, "importedPackages", null, 0, -1, ManifestFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManifestFile_ExecutionEnvironment(), ecorePackage.getEString(), "executionEnvironment", null, 1, 1, ManifestFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManifestFile_RequiredBundles(), this.getRequiredBundle(), null, "requiredBundles", null, 0, -1, ManifestFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pluginXMLFileEClass, PluginXMLFile.class, "PluginXMLFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPluginXMLFile_Extensions(), this.getExtension(), null, "extensions", null, 0, -1, PluginXMLFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buildPropertiesEClass, BuildProperties.class, "BuildProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBuildProperties_BinIncludes(), theTaskPackage.getResource(), null, "binIncludes", null, 0, -1, BuildProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importedPackageEClass, ImportedPackage.class, "ImportedPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImportedPackage_Name(), ecorePackage.getEString(), "name", null, 1, 1, ImportedPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImportedPackage_MinVersion(), this.getVersion(), "minVersion", null, 0, 1, ImportedPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImportedPackage_MaxVersion(), this.getVersion(), "maxVersion", null, 0, 1, ImportedPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImportedPackage_MinExclusive(), ecorePackage.getEBoolean(), "minExclusive", null, 0, 1, ImportedPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImportedPackage_MaxExclusive(), ecorePackage.getEBoolean(), "maxExclusive", null, 0, 1, ImportedPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exportedPackageEClass, ExportedPackage.class, "ExportedPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExportedPackage_Name(), ecorePackage.getEString(), "name", null, 1, 1, ExportedPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExportedPackage_Version(), this.getVersion(), "version", null, 0, 1, ExportedPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extensionEClass, Extension.class, "Extension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtension_Id(), ecorePackage.getEString(), "id", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtension_Point(), ecorePackage.getEString(), "point", null, 1, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_Elements(), this.getElement(), null, "elements", null, 0, -1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Children(), this.getElement(), null, "children", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Value(), ecorePackage.getEString(), "value", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredBundleEClass, RequiredBundle.class, "RequiredBundle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequiredBundle_Name(), ecorePackage.getEString(), "name", null, 1, 1, RequiredBundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequiredBundle_MinVersion(), this.getVersion(), "minVersion", null, 0, 1, RequiredBundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequiredBundle_MaxVersion(), this.getVersion(), "maxVersion", null, 0, 1, RequiredBundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequiredBundle_MinExclusive(), ecorePackage.getEBoolean(), "minExclusive", null, 0, 1, RequiredBundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequiredBundle_MaxExclusive(), ecorePackage.getEBoolean(), "maxExclusive", null, 0, 1, RequiredBundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(versionEDataType, Version.class, "Version", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //BundlePackageImpl
