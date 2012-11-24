/**
 */
package at.bestsolution.efxclipse.tooling.rrobot.model.bundle.util;

import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.*;

import at.bestsolution.efxclipse.tooling.rrobot.model.task.File;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.Project;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.Resource;

import at.bestsolution.efxclipse.tooling.rrobot.model.task.TemplatedFile;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundlePackage
 * @generated
 */
public class BundleAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BundlePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BundlePackage.eINSTANCE;
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
	protected BundleSwitch<Adapter> modelSwitch =
		new BundleSwitch<Adapter>() {
			@Override
			public Adapter caseBundleProject(BundleProject object) {
				return createBundleProjectAdapter();
			}
			@Override
			public Adapter caseFeatureProject(FeatureProject object) {
				return createFeatureProjectAdapter();
			}
			@Override
			public Adapter caseManifestFile(ManifestFile object) {
				return createManifestFileAdapter();
			}
			@Override
			public Adapter casePluginXMLFile(PluginXMLFile object) {
				return createPluginXMLFileAdapter();
			}
			@Override
			public Adapter caseBuildProperties(BuildProperties object) {
				return createBuildPropertiesAdapter();
			}
			@Override
			public Adapter caseProductFile(ProductFile object) {
				return createProductFileAdapter();
			}
			@Override
			public Adapter caseProductFileFeaturebase(ProductFileFeaturebase object) {
				return createProductFileFeaturebaseAdapter();
			}
			@Override
			public Adapter caseFeatureFile(FeatureFile object) {
				return createFeatureFileAdapter();
			}
			@Override
			public Adapter caseImportedPackage(ImportedPackage object) {
				return createImportedPackageAdapter();
			}
			@Override
			public Adapter caseExportedPackage(ExportedPackage object) {
				return createExportedPackageAdapter();
			}
			@Override
			public Adapter caseExtension(Extension object) {
				return createExtensionAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseRequiredBundle(RequiredBundle object) {
				return createRequiredBundleAdapter();
			}
			@Override
			public Adapter caseLinkedString(LinkedString object) {
				return createLinkedStringAdapter();
			}
			@Override
			public Adapter caseFeaturePlugin(FeaturePlugin object) {
				return createFeaturePluginAdapter();
			}
			@Override
			public Adapter caseRequiredFeature(RequiredFeature object) {
				return createRequiredFeatureAdapter();
			}
			@Override
			public Adapter caseIncludedFeature(IncludedFeature object) {
				return createIncludedFeatureAdapter();
			}
			@Override
			public Adapter caseProject(Project object) {
				return createProjectAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseFile(File object) {
				return createFileAdapter();
			}
			@Override
			public Adapter caseTemplatedFile(TemplatedFile object) {
				return createTemplatedFileAdapter();
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
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundleProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BundleProject
	 * @generated
	 */
	public Adapter createBundleProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.FeatureProject <em>Feature Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.FeatureProject
	 * @generated
	 */
	public Adapter createFeatureProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ManifestFile <em>Manifest File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ManifestFile
	 * @generated
	 */
	public Adapter createManifestFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.PluginXMLFile <em>Plugin XML File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.PluginXMLFile
	 * @generated
	 */
	public Adapter createPluginXMLFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BuildProperties <em>Build Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.BuildProperties
	 * @generated
	 */
	public Adapter createBuildPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ProductFile <em>Product File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ProductFile
	 * @generated
	 */
	public Adapter createProductFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ProductFileFeaturebase <em>Product File Featurebase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ProductFileFeaturebase
	 * @generated
	 */
	public Adapter createProductFileFeaturebaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.FeatureFile <em>Feature File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.FeatureFile
	 * @generated
	 */
	public Adapter createFeatureFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ImportedPackage <em>Imported Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ImportedPackage
	 * @generated
	 */
	public Adapter createImportedPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ExportedPackage <em>Exported Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.ExportedPackage
	 * @generated
	 */
	public Adapter createExportedPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.Extension
	 * @generated
	 */
	public Adapter createExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.RequiredBundle <em>Required Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.RequiredBundle
	 * @generated
	 */
	public Adapter createRequiredBundleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.LinkedString <em>Linked String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.LinkedString
	 * @generated
	 */
	public Adapter createLinkedStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.FeaturePlugin <em>Feature Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.FeaturePlugin
	 * @generated
	 */
	public Adapter createFeaturePluginAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.RequiredFeature <em>Required Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.RequiredFeature
	 * @generated
	 */
	public Adapter createRequiredFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.IncludedFeature <em>Included Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.IncludedFeature
	 * @generated
	 */
	public Adapter createIncludedFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.Project
	 * @generated
	 */
	public Adapter createProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.File
	 * @generated
	 */
	public Adapter createFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.TemplatedFile <em>Templated File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.TemplatedFile
	 * @generated
	 */
	public Adapter createTemplatedFileAdapter() {
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

} //BundleAdapterFactory
