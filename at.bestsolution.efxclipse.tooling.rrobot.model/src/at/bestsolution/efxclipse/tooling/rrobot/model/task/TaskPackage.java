/**
 */
package at.bestsolution.efxclipse.tooling.rrobot.model.task;

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
 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.TaskFactory
 * @model kind="package"
 * @generated
 */
public interface TaskPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "task";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.efxclipse.org/rrobot/task/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "task";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TaskPackage eINSTANCE = at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.TaskPackageImpl.init();

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.RobotTaskImpl <em>Robot Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.RobotTaskImpl
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.TaskPackageImpl#getRobotTask()
	 * @generated
	 */
	int ROBOT_TASK = 0;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_TASK__PROJECTS = 0;

	/**
	 * The number of structural features of the '<em>Robot Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_TASK_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.ProjectImpl
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.TaskPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__RESOURCES = 1;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.ResourceImpl
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.TaskPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.FolderImpl <em>Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.FolderImpl
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.TaskPackageImpl#getFolder()
	 * @generated
	 */
	int FOLDER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__CHILDREN = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.FileImpl
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.TaskPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__NAME = RESOURCE__NAME;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '<em>IProgress Monitor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.runtime.IProgressMonitor
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.TaskPackageImpl#getIProgressMonitor()
	 * @generated
	 */
	int IPROGRESS_MONITOR = 10;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.TemplatedFileImpl <em>Templated File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.TemplatedFileImpl
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.TaskPackageImpl#getTemplatedFile()
	 * @generated
	 */
	int TEMPLATED_FILE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATED_FILE__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>Generator Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATED_FILE__GENERATOR_TYPE = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Templated File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATED_FILE_FEATURE_COUNT = FILE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.DataFileImpl <em>Data File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.DataFileImpl
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.TaskPackageImpl#getDataFile()
	 * @generated
	 */
	int DATA_FILE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILE__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILE__CONTENT = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILE_FEATURE_COUNT = FILE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.URLFileImpl <em>URL File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.URLFileImpl
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.TaskPackageImpl#getURLFile()
	 * @generated
	 */
	int URL_FILE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_FILE__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_FILE__URI = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>URL File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_FILE_FEATURE_COUNT = FILE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.GeneratorFileImpl <em>Generator File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.GeneratorFileImpl
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.TaskPackageImpl#getGeneratorFile()
	 * @generated
	 */
	int GENERATOR_FILE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_FILE__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>Generator Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_FILE__GENERATOR_INSTANCE = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Generator File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_FILE_FEATURE_COUNT = FILE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '<em>Input Stream</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.InputStream
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.TaskPackageImpl#getInputStream()
	 * @generated
	 */
	int INPUT_STREAM = 11;

	/**
	 * The meta object id for the '<em>Generator</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.Generator
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.TaskPackageImpl#getGenerator()
	 * @generated
	 */
	int GENERATOR = 12;

	/**
	 * The meta object id for the '<em>IO Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.IOException
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.TaskPackageImpl#getIOException()
	 * @generated
	 */
	int IO_EXCEPTION = 9;

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.RobotTask <em>Robot Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot Task</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.RobotTask
	 * @generated
	 */
	EClass getRobotTask();

	/**
	 * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.RobotTask#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Projects</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.RobotTask#getProjects()
	 * @see #getRobotTask()
	 * @generated
	 */
	EReference getRobotTask_Projects();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.Project#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.Project#getResources()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Resources();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.Resource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.Resource#getName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Name();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.Folder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.Folder
	 * @generated
	 */
	EClass getFolder();

	/**
	 * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.Folder#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.Folder#getChildren()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_Children();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.runtime.IProgressMonitor <em>IProgress Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IProgress Monitor</em>'.
	 * @see org.eclipse.core.runtime.IProgressMonitor
	 * @model instanceClass="org.eclipse.core.runtime.IProgressMonitor" serializeable="false"
	 * @generated
	 */
	EDataType getIProgressMonitor();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.TemplatedFile <em>Templated File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Templated File</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.TemplatedFile
	 * @generated
	 */
	EClass getTemplatedFile();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.TemplatedFile#getGeneratorType <em>Generator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generator Type</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.TemplatedFile#getGeneratorType()
	 * @see #getTemplatedFile()
	 * @generated
	 */
	EAttribute getTemplatedFile_GeneratorType();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.DataFile <em>Data File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data File</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.DataFile
	 * @generated
	 */
	EClass getDataFile();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.DataFile#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.DataFile#getContent()
	 * @see #getDataFile()
	 * @generated
	 */
	EAttribute getDataFile_Content();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.URLFile <em>URL File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>URL File</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.URLFile
	 * @generated
	 */
	EClass getURLFile();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.URLFile#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.URLFile#getUri()
	 * @see #getURLFile()
	 * @generated
	 */
	EAttribute getURLFile_Uri();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.GeneratorFile <em>Generator File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator File</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.GeneratorFile
	 * @generated
	 */
	EClass getGeneratorFile();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.GeneratorFile#getGeneratorInstance <em>Generator Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generator Instance</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.GeneratorFile#getGeneratorInstance()
	 * @see #getGeneratorFile()
	 * @generated
	 */
	EAttribute getGeneratorFile_GeneratorInstance();

	/**
	 * Returns the meta object for data type '{@link java.io.InputStream <em>Input Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Input Stream</em>'.
	 * @see java.io.InputStream
	 * @model instanceClass="java.io.InputStream"
	 * @generated
	 */
	EDataType getInputStream();

	/**
	 * Returns the meta object for data type '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.Generator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Generator</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.Generator
	 * @model instanceClass="at.bestsolution.efxclipse.tooling.rrobot.model.task.Generator" typeParameters="F"
	 * @generated
	 */
	EDataType getGenerator();

	/**
	 * Returns the meta object for data type '{@link java.io.IOException <em>IO Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IO Exception</em>'.
	 * @see java.io.IOException
	 * @model instanceClass="java.io.IOException" serializeable="false"
	 * @generated
	 */
	EDataType getIOException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TaskFactory getTaskFactory();

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
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.RobotTaskImpl <em>Robot Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.RobotTaskImpl
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.TaskPackageImpl#getRobotTask()
		 * @generated
		 */
		EClass ROBOT_TASK = eINSTANCE.getRobotTask();

		/**
		 * The meta object literal for the '<em><b>Projects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT_TASK__PROJECTS = eINSTANCE.getRobotTask_Projects();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.ProjectImpl
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.TaskPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__RESOURCES = eINSTANCE.getProject_Resources();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.ResourceImpl
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.TaskPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.FolderImpl <em>Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.FolderImpl
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.TaskPackageImpl#getFolder()
		 * @generated
		 */
		EClass FOLDER = eINSTANCE.getFolder();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__CHILDREN = eINSTANCE.getFolder_Children();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.FileImpl
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.TaskPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em>IProgress Monitor</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.runtime.IProgressMonitor
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.TaskPackageImpl#getIProgressMonitor()
		 * @generated
		 */
		EDataType IPROGRESS_MONITOR = eINSTANCE.getIProgressMonitor();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.TemplatedFileImpl <em>Templated File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.TemplatedFileImpl
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.TaskPackageImpl#getTemplatedFile()
		 * @generated
		 */
		EClass TEMPLATED_FILE = eINSTANCE.getTemplatedFile();

		/**
		 * The meta object literal for the '<em><b>Generator Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATED_FILE__GENERATOR_TYPE = eINSTANCE.getTemplatedFile_GeneratorType();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.DataFileImpl <em>Data File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.DataFileImpl
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.TaskPackageImpl#getDataFile()
		 * @generated
		 */
		EClass DATA_FILE = eINSTANCE.getDataFile();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FILE__CONTENT = eINSTANCE.getDataFile_Content();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.URLFileImpl <em>URL File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.URLFileImpl
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.TaskPackageImpl#getURLFile()
		 * @generated
		 */
		EClass URL_FILE = eINSTANCE.getURLFile();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_FILE__URI = eINSTANCE.getURLFile_Uri();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.GeneratorFileImpl <em>Generator File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.GeneratorFileImpl
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.TaskPackageImpl#getGeneratorFile()
		 * @generated
		 */
		EClass GENERATOR_FILE = eINSTANCE.getGeneratorFile();

		/**
		 * The meta object literal for the '<em><b>Generator Instance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_FILE__GENERATOR_INSTANCE = eINSTANCE.getGeneratorFile_GeneratorInstance();

		/**
		 * The meta object literal for the '<em>Input Stream</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.InputStream
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.TaskPackageImpl#getInputStream()
		 * @generated
		 */
		EDataType INPUT_STREAM = eINSTANCE.getInputStream();

		/**
		 * The meta object literal for the '<em>Generator</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.Generator
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.TaskPackageImpl#getGenerator()
		 * @generated
		 */
		EDataType GENERATOR = eINSTANCE.getGenerator();

		/**
		 * The meta object literal for the '<em>IO Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.IOException
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.impl.TaskPackageImpl#getIOException()
		 * @generated
		 */
		EDataType IO_EXCEPTION = eINSTANCE.getIOException();

	}

} //TaskPackage
