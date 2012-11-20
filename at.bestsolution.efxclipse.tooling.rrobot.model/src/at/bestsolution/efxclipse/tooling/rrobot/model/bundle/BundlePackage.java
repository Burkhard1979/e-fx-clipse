/**
 */
package at.bestsolution.efxclipse.tooling.rrobot.model.bundle;

import at.bestsolution.efxclipse.tooling.rrobot.model.task.TaskPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundleFactory
 * @model kind="package"
 * @generated
 */
public interface BundlePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bundle";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.efxclipse.org/rrobot/task/bundle/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bundle";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BundlePackage eINSTANCE = at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.BundlePackageImpl.init();

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.BundleProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.BundleProjectImpl
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.BundlePackageImpl#getBundleProject()
	 * @generated
	 */
	int BUNDLE_PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_PROJECT__NAME = TaskPackage.PROJECT__NAME;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_PROJECT__RESOURCES = TaskPackage.PROJECT__RESOURCES;

	/**
	 * The feature id for the '<em><b>Manifest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_PROJECT__MANIFEST = TaskPackage.PROJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Build Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_PROJECT__BUILD_PROPERTIES = TaskPackage.PROJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pluginxml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_PROJECT__PLUGINXML = TaskPackage.PROJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lazy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_PROJECT__LAZY = TaskPackage.PROJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Singleton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_PROJECT__SINGLETON = TaskPackage.PROJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Activator Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_PROJECT__ACTIVATOR_CLASS = TaskPackage.PROJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_PROJECT__VENDOR = TaskPackage.PROJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_PROJECT_FEATURE_COUNT = TaskPackage.PROJECT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.ManifestFileImpl <em>Manifest File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.ManifestFileImpl
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.BundlePackageImpl#getManifestFile()
	 * @generated
	 */
	int MANIFEST_FILE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST_FILE__NAME = TaskPackage.TEMPLATED_FILE__NAME;

	/**
	 * The feature id for the '<em><b>Generator Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST_FILE__GENERATOR_TYPE = TaskPackage.TEMPLATED_FILE__GENERATOR_TYPE;

	/**
	 * The feature id for the '<em><b>Bundlename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST_FILE__BUNDLENAME = TaskPackage.TEMPLATED_FILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Symbolicname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST_FILE__SYMBOLICNAME = TaskPackage.TEMPLATED_FILE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST_FILE__VERSION = TaskPackage.TEMPLATED_FILE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Exported Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST_FILE__EXPORTED_PACKAGES = TaskPackage.TEMPLATED_FILE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Imported Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST_FILE__IMPORTED_PACKAGES = TaskPackage.TEMPLATED_FILE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Execution Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST_FILE__EXECUTION_ENVIRONMENT = TaskPackage.TEMPLATED_FILE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Required Bundles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST_FILE__REQUIRED_BUNDLES = TaskPackage.TEMPLATED_FILE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Manifest File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST_FILE_FEATURE_COUNT = TaskPackage.TEMPLATED_FILE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.PluginXMLFileImpl <em>Plugin XML File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.PluginXMLFileImpl
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.BundlePackageImpl#getPluginXMLFile()
	 * @generated
	 */
	int PLUGIN_XML_FILE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_XML_FILE__NAME = TaskPackage.TEMPLATED_FILE__NAME;

	/**
	 * The feature id for the '<em><b>Generator Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_XML_FILE__GENERATOR_TYPE = TaskPackage.TEMPLATED_FILE__GENERATOR_TYPE;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_XML_FILE__EXTENSIONS = TaskPackage.TEMPLATED_FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Plugin XML File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_XML_FILE_FEATURE_COUNT = TaskPackage.TEMPLATED_FILE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.BuildPropertiesImpl <em>Build Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.BuildPropertiesImpl
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.BundlePackageImpl#getBuildProperties()
	 * @generated
	 */
	int BUILD_PROPERTIES = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_PROPERTIES__NAME = TaskPackage.TEMPLATED_FILE__NAME;

	/**
	 * The feature id for the '<em><b>Generator Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_PROPERTIES__GENERATOR_TYPE = TaskPackage.TEMPLATED_FILE__GENERATOR_TYPE;

	/**
	 * The feature id for the '<em><b>Bin Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_PROPERTIES__BIN_INCLUDES = TaskPackage.TEMPLATED_FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Build Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_PROPERTIES_FEATURE_COUNT = TaskPackage.TEMPLATED_FILE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.ImportedPackageImpl <em>Imported Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.ImportedPackageImpl
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.BundlePackageImpl#getImportedPackage()
	 * @generated
	 */
	int IMPORTED_PACKAGE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_PACKAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Min Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_PACKAGE__MIN_VERSION = 1;

	/**
	 * The feature id for the '<em><b>Max Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_PACKAGE__MAX_VERSION = 2;

	/**
	 * The feature id for the '<em><b>Min Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_PACKAGE__MIN_EXCLUSIVE = 3;

	/**
	 * The feature id for the '<em><b>Max Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_PACKAGE__MAX_EXCLUSIVE = 4;

	/**
	 * The number of structural features of the '<em>Imported Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_PACKAGE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.ExportedPackageImpl <em>Exported Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.ExportedPackageImpl
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.BundlePackageImpl#getExportedPackage()
	 * @generated
	 */
	int EXPORTED_PACKAGE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTED_PACKAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTED_PACKAGE__VERSION = 1;

	/**
	 * The number of structural features of the '<em>Exported Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTED_PACKAGE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.ExtensionImpl <em>Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.ExtensionImpl
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.BundlePackageImpl#getExtension()
	 * @generated
	 */
	int EXTENSION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__ID = 0;

	/**
	 * The feature id for the '<em><b>Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__POINT = 1;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__ELEMENTS = 2;

	/**
	 * The number of structural features of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.ElementImpl
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.BundlePackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ATTRIBUTES = 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CHILDREN = 2;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.AttributeImpl
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.BundlePackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.RequiredBundleImpl <em>Required Bundle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.RequiredBundleImpl
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.BundlePackageImpl#getRequiredBundle()
	 * @generated
	 */
	int REQUIRED_BUNDLE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_BUNDLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Min Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_BUNDLE__MIN_VERSION = 1;

	/**
	 * The feature id for the '<em><b>Max Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_BUNDLE__MAX_VERSION = 2;

	/**
	 * The feature id for the '<em><b>Min Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_BUNDLE__MIN_EXCLUSIVE = 3;

	/**
	 * The feature id for the '<em><b>Max Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_BUNDLE__MAX_EXCLUSIVE = 4;

	/**
	 * The number of structural features of the '<em>Required Bundle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_BUNDLE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '<em>Version</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osgi.framework.Version
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.BundlePackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 10;


	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundleProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundleProject
	 * @generated
	 */
	EClass getBundleProject();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundleProject#getManifest <em>Manifest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Manifest</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundleProject#getManifest()
	 * @see #getBundleProject()
	 * @generated
	 */
	EReference getBundleProject_Manifest();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundleProject#getBuildProperties <em>Build Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Build Properties</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundleProject#getBuildProperties()
	 * @see #getBundleProject()
	 * @generated
	 */
	EReference getBundleProject_BuildProperties();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundleProject#getPluginxml <em>Pluginxml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pluginxml</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundleProject#getPluginxml()
	 * @see #getBundleProject()
	 * @generated
	 */
	EReference getBundleProject_Pluginxml();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundleProject#getLazy <em>Lazy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lazy</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundleProject#getLazy()
	 * @see #getBundleProject()
	 * @generated
	 */
	EAttribute getBundleProject_Lazy();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundleProject#getSingleton <em>Singleton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Singleton</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundleProject#getSingleton()
	 * @see #getBundleProject()
	 * @generated
	 */
	EAttribute getBundleProject_Singleton();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundleProject#getActivatorClass <em>Activator Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activator Class</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundleProject#getActivatorClass()
	 * @see #getBundleProject()
	 * @generated
	 */
	EAttribute getBundleProject_ActivatorClass();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundleProject#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundleProject#getVendor()
	 * @see #getBundleProject()
	 * @generated
	 */
	EAttribute getBundleProject_Vendor();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ManifestFile <em>Manifest File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manifest File</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ManifestFile
	 * @generated
	 */
	EClass getManifestFile();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ManifestFile#getBundlename <em>Bundlename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bundlename</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ManifestFile#getBundlename()
	 * @see #getManifestFile()
	 * @generated
	 */
	EAttribute getManifestFile_Bundlename();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ManifestFile#getSymbolicname <em>Symbolicname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbolicname</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ManifestFile#getSymbolicname()
	 * @see #getManifestFile()
	 * @generated
	 */
	EAttribute getManifestFile_Symbolicname();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ManifestFile#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ManifestFile#getVersion()
	 * @see #getManifestFile()
	 * @generated
	 */
	EAttribute getManifestFile_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ManifestFile#getExportedPackages <em>Exported Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exported Packages</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ManifestFile#getExportedPackages()
	 * @see #getManifestFile()
	 * @generated
	 */
	EReference getManifestFile_ExportedPackages();

	/**
	 * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ManifestFile#getImportedPackages <em>Imported Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imported Packages</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ManifestFile#getImportedPackages()
	 * @see #getManifestFile()
	 * @generated
	 */
	EReference getManifestFile_ImportedPackages();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ManifestFile#getExecutionEnvironment <em>Execution Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Environment</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ManifestFile#getExecutionEnvironment()
	 * @see #getManifestFile()
	 * @generated
	 */
	EAttribute getManifestFile_ExecutionEnvironment();

	/**
	 * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ManifestFile#getRequiredBundles <em>Required Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Bundles</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ManifestFile#getRequiredBundles()
	 * @see #getManifestFile()
	 * @generated
	 */
	EReference getManifestFile_RequiredBundles();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.PluginXMLFile <em>Plugin XML File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugin XML File</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.PluginXMLFile
	 * @generated
	 */
	EClass getPluginXMLFile();

	/**
	 * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.PluginXMLFile#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extensions</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.PluginXMLFile#getExtensions()
	 * @see #getPluginXMLFile()
	 * @generated
	 */
	EReference getPluginXMLFile_Extensions();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BuildProperties <em>Build Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Build Properties</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BuildProperties
	 * @generated
	 */
	EClass getBuildProperties();

	/**
	 * Returns the meta object for the reference list '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BuildProperties#getBinIncludes <em>Bin Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bin Includes</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BuildProperties#getBinIncludes()
	 * @see #getBuildProperties()
	 * @generated
	 */
	EReference getBuildProperties_BinIncludes();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ImportedPackage <em>Imported Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imported Package</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ImportedPackage
	 * @generated
	 */
	EClass getImportedPackage();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ImportedPackage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ImportedPackage#getName()
	 * @see #getImportedPackage()
	 * @generated
	 */
	EAttribute getImportedPackage_Name();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ImportedPackage#getMinVersion <em>Min Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Version</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ImportedPackage#getMinVersion()
	 * @see #getImportedPackage()
	 * @generated
	 */
	EAttribute getImportedPackage_MinVersion();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ImportedPackage#getMaxVersion <em>Max Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Version</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ImportedPackage#getMaxVersion()
	 * @see #getImportedPackage()
	 * @generated
	 */
	EAttribute getImportedPackage_MaxVersion();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ImportedPackage#isMinExclusive <em>Min Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Exclusive</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ImportedPackage#isMinExclusive()
	 * @see #getImportedPackage()
	 * @generated
	 */
	EAttribute getImportedPackage_MinExclusive();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ImportedPackage#isMaxExclusive <em>Max Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Exclusive</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ImportedPackage#isMaxExclusive()
	 * @see #getImportedPackage()
	 * @generated
	 */
	EAttribute getImportedPackage_MaxExclusive();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ExportedPackage <em>Exported Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exported Package</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ExportedPackage
	 * @generated
	 */
	EClass getExportedPackage();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ExportedPackage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ExportedPackage#getName()
	 * @see #getExportedPackage()
	 * @generated
	 */
	EAttribute getExportedPackage_Name();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ExportedPackage#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ExportedPackage#getVersion()
	 * @see #getExportedPackage()
	 * @generated
	 */
	EAttribute getExportedPackage_Version();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.Extension
	 * @generated
	 */
	EClass getExtension();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.Extension#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.Extension#getId()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Id();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.Extension#getPoint <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Point</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.Extension#getPoint()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Point();

	/**
	 * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.Extension#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.Extension#getElements()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_Elements();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.Element#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.Element#getAttributes()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Attributes();

	/**
	 * Returns the meta object for the reference list '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.Element#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.Element#getChildren()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Children();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.Attribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.Attribute#getValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Value();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.RequiredBundle <em>Required Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Bundle</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.RequiredBundle
	 * @generated
	 */
	EClass getRequiredBundle();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.RequiredBundle#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.RequiredBundle#getName()
	 * @see #getRequiredBundle()
	 * @generated
	 */
	EAttribute getRequiredBundle_Name();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.RequiredBundle#getMinVersion <em>Min Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Version</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.RequiredBundle#getMinVersion()
	 * @see #getRequiredBundle()
	 * @generated
	 */
	EAttribute getRequiredBundle_MinVersion();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.RequiredBundle#getMaxVersion <em>Max Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Version</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.RequiredBundle#getMaxVersion()
	 * @see #getRequiredBundle()
	 * @generated
	 */
	EAttribute getRequiredBundle_MaxVersion();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.RequiredBundle#isMinExclusive <em>Min Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Exclusive</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.RequiredBundle#isMinExclusive()
	 * @see #getRequiredBundle()
	 * @generated
	 */
	EAttribute getRequiredBundle_MinExclusive();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.RequiredBundle#isMaxExclusive <em>Max Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Exclusive</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.RequiredBundle#isMaxExclusive()
	 * @see #getRequiredBundle()
	 * @generated
	 */
	EAttribute getRequiredBundle_MaxExclusive();

	/**
	 * Returns the meta object for data type '{@link org.osgi.framework.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Version</em>'.
	 * @see org.osgi.framework.Version
	 * @model instanceClass="org.osgi.framework.Version"
	 * @generated
	 */
	EDataType getVersion();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BundleFactory getBundleFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.BundleProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.BundleProjectImpl
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.BundlePackageImpl#getBundleProject()
		 * @generated
		 */
		EClass BUNDLE_PROJECT = eINSTANCE.getBundleProject();

		/**
		 * The meta object literal for the '<em><b>Manifest</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_PROJECT__MANIFEST = eINSTANCE.getBundleProject_Manifest();

		/**
		 * The meta object literal for the '<em><b>Build Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_PROJECT__BUILD_PROPERTIES = eINSTANCE.getBundleProject_BuildProperties();

		/**
		 * The meta object literal for the '<em><b>Pluginxml</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_PROJECT__PLUGINXML = eINSTANCE.getBundleProject_Pluginxml();

		/**
		 * The meta object literal for the '<em><b>Lazy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE_PROJECT__LAZY = eINSTANCE.getBundleProject_Lazy();

		/**
		 * The meta object literal for the '<em><b>Singleton</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE_PROJECT__SINGLETON = eINSTANCE.getBundleProject_Singleton();

		/**
		 * The meta object literal for the '<em><b>Activator Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE_PROJECT__ACTIVATOR_CLASS = eINSTANCE.getBundleProject_ActivatorClass();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE_PROJECT__VENDOR = eINSTANCE.getBundleProject_Vendor();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.ManifestFileImpl <em>Manifest File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.ManifestFileImpl
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.BundlePackageImpl#getManifestFile()
		 * @generated
		 */
		EClass MANIFEST_FILE = eINSTANCE.getManifestFile();

		/**
		 * The meta object literal for the '<em><b>Bundlename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANIFEST_FILE__BUNDLENAME = eINSTANCE.getManifestFile_Bundlename();

		/**
		 * The meta object literal for the '<em><b>Symbolicname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANIFEST_FILE__SYMBOLICNAME = eINSTANCE.getManifestFile_Symbolicname();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANIFEST_FILE__VERSION = eINSTANCE.getManifestFile_Version();

		/**
		 * The meta object literal for the '<em><b>Exported Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANIFEST_FILE__EXPORTED_PACKAGES = eINSTANCE.getManifestFile_ExportedPackages();

		/**
		 * The meta object literal for the '<em><b>Imported Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANIFEST_FILE__IMPORTED_PACKAGES = eINSTANCE.getManifestFile_ImportedPackages();

		/**
		 * The meta object literal for the '<em><b>Execution Environment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANIFEST_FILE__EXECUTION_ENVIRONMENT = eINSTANCE.getManifestFile_ExecutionEnvironment();

		/**
		 * The meta object literal for the '<em><b>Required Bundles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANIFEST_FILE__REQUIRED_BUNDLES = eINSTANCE.getManifestFile_RequiredBundles();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.PluginXMLFileImpl <em>Plugin XML File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.PluginXMLFileImpl
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.BundlePackageImpl#getPluginXMLFile()
		 * @generated
		 */
		EClass PLUGIN_XML_FILE = eINSTANCE.getPluginXMLFile();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN_XML_FILE__EXTENSIONS = eINSTANCE.getPluginXMLFile_Extensions();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.BuildPropertiesImpl <em>Build Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.BuildPropertiesImpl
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.BundlePackageImpl#getBuildProperties()
		 * @generated
		 */
		EClass BUILD_PROPERTIES = eINSTANCE.getBuildProperties();

		/**
		 * The meta object literal for the '<em><b>Bin Includes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD_PROPERTIES__BIN_INCLUDES = eINSTANCE.getBuildProperties_BinIncludes();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.ImportedPackageImpl <em>Imported Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.ImportedPackageImpl
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.BundlePackageImpl#getImportedPackage()
		 * @generated
		 */
		EClass IMPORTED_PACKAGE = eINSTANCE.getImportedPackage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORTED_PACKAGE__NAME = eINSTANCE.getImportedPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Min Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORTED_PACKAGE__MIN_VERSION = eINSTANCE.getImportedPackage_MinVersion();

		/**
		 * The meta object literal for the '<em><b>Max Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORTED_PACKAGE__MAX_VERSION = eINSTANCE.getImportedPackage_MaxVersion();

		/**
		 * The meta object literal for the '<em><b>Min Exclusive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORTED_PACKAGE__MIN_EXCLUSIVE = eINSTANCE.getImportedPackage_MinExclusive();

		/**
		 * The meta object literal for the '<em><b>Max Exclusive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORTED_PACKAGE__MAX_EXCLUSIVE = eINSTANCE.getImportedPackage_MaxExclusive();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.ExportedPackageImpl <em>Exported Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.ExportedPackageImpl
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.BundlePackageImpl#getExportedPackage()
		 * @generated
		 */
		EClass EXPORTED_PACKAGE = eINSTANCE.getExportedPackage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPORTED_PACKAGE__NAME = eINSTANCE.getExportedPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPORTED_PACKAGE__VERSION = eINSTANCE.getExportedPackage_Version();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.ExtensionImpl <em>Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.ExtensionImpl
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.BundlePackageImpl#getExtension()
		 * @generated
		 */
		EClass EXTENSION = eINSTANCE.getExtension();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__ID = eINSTANCE.getExtension_Id();

		/**
		 * The meta object literal for the '<em><b>Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__POINT = eINSTANCE.getExtension_Point();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__ELEMENTS = eINSTANCE.getExtension_Elements();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.ElementImpl
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.BundlePackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__ATTRIBUTES = eINSTANCE.getElement_Attributes();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__CHILDREN = eINSTANCE.getElement_Children();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.AttributeImpl
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.BundlePackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.RequiredBundleImpl <em>Required Bundle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.RequiredBundleImpl
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.BundlePackageImpl#getRequiredBundle()
		 * @generated
		 */
		EClass REQUIRED_BUNDLE = eINSTANCE.getRequiredBundle();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_BUNDLE__NAME = eINSTANCE.getRequiredBundle_Name();

		/**
		 * The meta object literal for the '<em><b>Min Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_BUNDLE__MIN_VERSION = eINSTANCE.getRequiredBundle_MinVersion();

		/**
		 * The meta object literal for the '<em><b>Max Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_BUNDLE__MAX_VERSION = eINSTANCE.getRequiredBundle_MaxVersion();

		/**
		 * The meta object literal for the '<em><b>Min Exclusive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_BUNDLE__MIN_EXCLUSIVE = eINSTANCE.getRequiredBundle_MinExclusive();

		/**
		 * The meta object literal for the '<em><b>Max Exclusive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_BUNDLE__MAX_EXCLUSIVE = eINSTANCE.getRequiredBundle_MaxExclusive();

		/**
		 * The meta object literal for the '<em>Version</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osgi.framework.Version
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.impl.BundlePackageImpl#getVersion()
		 * @generated
		 */
		EDataType VERSION = eINSTANCE.getVersion();

	}

} //BundlePackage
