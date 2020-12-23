/**
 */
package de.tesis.dynaware.grapheditor.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see GraphFactory
 * @model kind="package"
 * @generated
 */
public interface GraphPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://de.tesis.dynaware.grapheditor.model/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "graph";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GraphPackage eINSTANCE = de.tesis.dynaware.grapheditor.model.impl.GraphPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.tesis.dynaware.grapheditor.model.impl.GModelImpl <em>GModel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tesis.dynaware.grapheditor.model.impl.GModelImpl
	 * @see de.tesis.dynaware.grapheditor.model.impl.GraphPackageImpl#getGModel()
	 * @generated
	 */
	int GMODEL = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GMODEL__NODES = 0;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GMODEL__CONNECTIONS = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GMODEL__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Content Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GMODEL__CONTENT_WIDTH = 3;

	/**
	 * The feature id for the '<em><b>Content Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GMODEL__CONTENT_HEIGHT = 4;

	/**
	 * The feature id for the '<em><b>Supergraph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GMODEL__SUPERGRAPH = 5;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GMODEL__GROUPS = 6;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GMODEL__CATEGORIES = 7;

	/**
	 * The feature id for the '<em><b>Texts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GMODEL__TEXTS = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GMODEL__ID = 9;

	/**
	 * The number of structural features of the '<em>GModel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GMODEL_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>GModel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GMODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tesis.dynaware.grapheditor.model.impl.GConnectableImpl <em>GConnectable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tesis.dynaware.grapheditor.model.impl.GConnectableImpl
	 * @see de.tesis.dynaware.grapheditor.model.impl.GraphPackageImpl#getGConnectable()
	 * @generated
	 */
	int GCONNECTABLE = 1;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCONNECTABLE__CONNECTORS = 0;

	/**
	 * The number of structural features of the '<em>GConnectable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCONNECTABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GConnectable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCONNECTABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tesis.dynaware.grapheditor.model.impl.GNodeImpl <em>GNode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tesis.dynaware.grapheditor.model.impl.GNodeImpl
	 * @see de.tesis.dynaware.grapheditor.model.impl.GraphPackageImpl#getGNode()
	 * @generated
	 */
	int GNODE = 2;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNODE__CONNECTORS = GCONNECTABLE__CONNECTORS;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNODE__X = GCONNECTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNODE__Y = GCONNECTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNODE__WIDTH = GCONNECTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNODE__HEIGHT = GCONNECTABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNODE__ID = GCONNECTABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNODE__TYPE = GCONNECTABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Subgraph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNODE__SUBGRAPH = GCONNECTABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNODE__NODE_TYPE = GCONNECTABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNODE__TITLE = GCONNECTABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNODE__DESCRIPTION = GCONNECTABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNODE__UNIQUE_ID = GCONNECTABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Core Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNODE__CORE_UID = GCONNECTABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNODE__NODE_ID = GCONNECTABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNODE__COLOR = GCONNECTABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNODE__CATEGORY = GCONNECTABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNODE__GROUP = GCONNECTABLE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Activation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNODE__ACTIVATION_TYPE = GCONNECTABLE_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>GNode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNODE_FEATURE_COUNT = GCONNECTABLE_FEATURE_COUNT + 17;

	/**
	 * The number of operations of the '<em>GNode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNODE_OPERATION_COUNT = GCONNECTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tesis.dynaware.grapheditor.model.impl.GConnectionImpl <em>GConnection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tesis.dynaware.grapheditor.model.impl.GConnectionImpl
	 * @see de.tesis.dynaware.grapheditor.model.impl.GraphPackageImpl#getGConnection()
	 * @generated
	 */
	int GCONNECTION = 3;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCONNECTION__CONNECTORS = GCONNECTABLE__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCONNECTION__ID = GCONNECTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCONNECTION__TYPE = GCONNECTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCONNECTION__SOURCE = GCONNECTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCONNECTION__TARGET = GCONNECTABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Joints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCONNECTION__JOINTS = GCONNECTABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCONNECTION__UID = GCONNECTABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>GConnection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCONNECTION_FEATURE_COUNT = GCONNECTABLE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>GConnection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCONNECTION_OPERATION_COUNT = GCONNECTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tesis.dynaware.grapheditor.model.impl.GConnectorImpl <em>GConnector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tesis.dynaware.grapheditor.model.impl.GConnectorImpl
	 * @see de.tesis.dynaware.grapheditor.model.impl.GraphPackageImpl#getGConnector()
	 * @generated
	 */
	int GCONNECTOR = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCONNECTOR__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCONNECTOR__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCONNECTOR__PARENT = 2;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCONNECTOR__CONNECTIONS = 3;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCONNECTOR__X = 4;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCONNECTOR__Y = 5;

	/**
	 * The feature id for the '<em><b>Connection Detached On Drag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCONNECTOR__CONNECTION_DETACHED_ON_DRAG = 6;

	/**
	 * The number of structural features of the '<em>GConnector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCONNECTOR_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>GConnector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCONNECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tesis.dynaware.grapheditor.model.impl.GJointImpl <em>GJoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tesis.dynaware.grapheditor.model.impl.GJointImpl
	 * @see de.tesis.dynaware.grapheditor.model.impl.GraphPackageImpl#getGJoint()
	 * @generated
	 */
	int GJOINT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GJOINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GJOINT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GJOINT__CONNECTION = 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GJOINT__X = 3;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GJOINT__Y = 4;

	/**
	 * The number of structural features of the '<em>GJoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GJOINT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>GJoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GJOINT_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link de.tesis.dynaware.grapheditor.model.impl.GCategoryImpl <em>GCategory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tesis.dynaware.grapheditor.model.impl.GCategoryImpl
	 * @see de.tesis.dynaware.grapheditor.model.impl.GraphPackageImpl#getGCategory()
	 * @generated
	 */
	int GCATEGORY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCATEGORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Removal Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCATEGORY__REMOVAL_COST = 1;

	/**
	 * The number of structural features of the '<em>GCategory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCATEGORY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GCategory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCATEGORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tesis.dynaware.grapheditor.model.impl.GResizableImpl <em>GResizable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tesis.dynaware.grapheditor.model.impl.GResizableImpl
	 * @see de.tesis.dynaware.grapheditor.model.impl.GraphPackageImpl#getGResizable()
	 * @generated
	 */
	int GRESIZABLE = 9;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRESIZABLE__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRESIZABLE__Y = 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRESIZABLE__WIDTH = 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRESIZABLE__HEIGHT = 3;

	/**
	 * The number of structural features of the '<em>GResizable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRESIZABLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GResizable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRESIZABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tesis.dynaware.grapheditor.model.impl.GGroupImpl <em>GGroup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tesis.dynaware.grapheditor.model.impl.GGroupImpl
	 * @see de.tesis.dynaware.grapheditor.model.impl.GraphPackageImpl#getGGroup()
	 * @generated
	 */
	int GGROUP = 7;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GGROUP__X = GRESIZABLE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GGROUP__Y = GRESIZABLE__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GGROUP__WIDTH = GRESIZABLE__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GGROUP__HEIGHT = GRESIZABLE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GGROUP__ID = GRESIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GGROUP__NAME = GRESIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GGROUP__UNIQUE_ID = GRESIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GGROUP__NODES = GRESIZABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>GGroup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GGROUP_FEATURE_COUNT = GRESIZABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>GGroup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GGROUP_OPERATION_COUNT = GRESIZABLE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link de.tesis.dynaware.grapheditor.model.impl.GTextImpl <em>GText</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tesis.dynaware.grapheditor.model.impl.GTextImpl
	 * @see de.tesis.dynaware.grapheditor.model.impl.GraphPackageImpl#getGText()
	 * @generated
	 */
	int GTEXT = 8;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTEXT__X = GRESIZABLE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTEXT__Y = GRESIZABLE__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTEXT__WIDTH = GRESIZABLE__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTEXT__HEIGHT = GRESIZABLE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTEXT__ID = GRESIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTEXT__TEXT = GRESIZABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>GText</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTEXT_FEATURE_COUNT = GRESIZABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>GText</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTEXT_OPERATION_COUNT = GRESIZABLE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link GModel <em>GModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GModel</em>'.
	 * @see GModel
	 * @generated
	 */
	EClass getGModel();

	/**
	 * Returns the meta object for the containment reference list '{@link GModel#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see GModel#getNodes()
	 * @see #getGModel()
	 * @generated
	 */
	EReference getGModel_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link GModel#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see GModel#getConnections()
	 * @see #getGModel()
	 * @generated
	 */
	EReference getGModel_Connections();

	/**
	 * Returns the meta object for the attribute '{@link GModel#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see GModel#getType()
	 * @see #getGModel()
	 * @generated
	 */
	EAttribute getGModel_Type();

	/**
	 * Returns the meta object for the attribute '{@link GModel#getContentWidth <em>Content Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Width</em>'.
	 * @see GModel#getContentWidth()
	 * @see #getGModel()
	 * @generated
	 */
	EAttribute getGModel_ContentWidth();

	/**
	 * Returns the meta object for the attribute '{@link GModel#getContentHeight <em>Content Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Height</em>'.
	 * @see GModel#getContentHeight()
	 * @see #getGModel()
	 * @generated
	 */
	EAttribute getGModel_ContentHeight();

	/**
	 * Returns the meta object for the container reference '{@link GModel#getSupergraph <em>Supergraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Supergraph</em>'.
	 * @see GModel#getSupergraph()
	 * @see #getGModel()
	 * @generated
	 */
	EReference getGModel_Supergraph();

	/**
	 * Returns the meta object for the containment reference list '{@link GModel#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see GModel#getGroups()
	 * @see #getGModel()
	 * @generated
	 */
	EReference getGModel_Groups();

	/**
	 * Returns the meta object for the containment reference list '{@link GModel#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see GModel#getCategories()
	 * @see #getGModel()
	 * @generated
	 */
	EReference getGModel_Categories();

	/**
	 * Returns the meta object for the containment reference list '{@link GModel#getTexts <em>Texts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Texts</em>'.
	 * @see GModel#getTexts()
	 * @see #getGModel()
	 * @generated
	 */
	EReference getGModel_Texts();

	/**
	 * Returns the meta object for the attribute '{@link GModel#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see GModel#getId()
	 * @see #getGModel()
	 * @generated
	 */
	EAttribute getGModel_Id();

	/**
	 * Returns the meta object for class '{@link GConnectable <em>GConnectable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GConnectable</em>'.
	 * @see GConnectable
	 * @generated
	 */
	EClass getGConnectable();

	/**
	 * Returns the meta object for the containment reference list '{@link GConnectable#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectors</em>'.
	 * @see GConnectable#getConnectors()
	 * @see #getGConnectable()
	 * @generated
	 */
	EReference getGConnectable_Connectors();

	/**
	 * Returns the meta object for class '{@link GNode <em>GNode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GNode</em>'.
	 * @see GNode
	 * @generated
	 */
	EClass getGNode();

	/**
	 * Returns the meta object for the attribute '{@link GNode#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see GNode#getId()
	 * @see #getGNode()
	 * @generated
	 */
	EAttribute getGNode_Id();

	/**
	 * Returns the meta object for the attribute '{@link GNode#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see GNode#getType()
	 * @see #getGNode()
	 * @generated
	 */
	EAttribute getGNode_Type();

	/**
	 * Returns the meta object for the containment reference '{@link GNode#getSubgraph <em>Subgraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subgraph</em>'.
	 * @see GNode#getSubgraph()
	 * @see #getGNode()
	 * @generated
	 */
	EReference getGNode_Subgraph();

	/**
	 * Returns the meta object for the attribute '{@link GNode#getNodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Type</em>'.
	 * @see GNode#getNodeType()
	 * @see #getGNode()
	 * @generated
	 */
	EAttribute getGNode_NodeType();

	/**
	 * Returns the meta object for the attribute '{@link GNode#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see GNode#getTitle()
	 * @see #getGNode()
	 * @generated
	 */
	EAttribute getGNode_Title();

	/**
	 * Returns the meta object for the attribute '{@link GNode#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see GNode#getDescription()
	 * @see #getGNode()
	 * @generated
	 */
	EAttribute getGNode_Description();

	/**
	 * Returns the meta object for the attribute '{@link GNode#getUniqueId <em>Unique Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Id</em>'.
	 * @see GNode#getUniqueId()
	 * @see #getGNode()
	 * @generated
	 */
	EAttribute getGNode_UniqueId();

	/**
	 * Returns the meta object for the attribute '{@link GNode#getCoreUid <em>Core Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core Uid</em>'.
	 * @see GNode#getCoreUid()
	 * @see #getGNode()
	 * @generated
	 */
	EAttribute getGNode_CoreUid();

	/**
	 * Returns the meta object for the attribute '{@link GNode#getNodeId <em>Node Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Id</em>'.
	 * @see GNode#getNodeId()
	 * @see #getGNode()
	 * @generated
	 */
	EAttribute getGNode_NodeId();

	/**
	 * Returns the meta object for the attribute '{@link GNode#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see GNode#getColor()
	 * @see #getGNode()
	 * @generated
	 */
	EAttribute getGNode_Color();

	/**
	 * Returns the meta object for the reference '{@link GNode#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Category</em>'.
	 * @see GNode#getCategory()
	 * @see #getGNode()
	 * @generated
	 */
	EReference getGNode_Category();

	/**
	 * Returns the meta object for the reference '{@link GNode#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Group</em>'.
	 * @see GNode#getGroup()
	 * @see #getGNode()
	 * @generated
	 */
	EReference getGNode_Group();

	/**
	 * Returns the meta object for the attribute '{@link GNode#getActivationType <em>Activation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activation Type</em>'.
	 * @see GNode#getActivationType()
	 * @see #getGNode()
	 * @generated
	 */
	EAttribute getGNode_ActivationType();

	/**
	 * Returns the meta object for class '{@link GConnection <em>GConnection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GConnection</em>'.
	 * @see GConnection
	 * @generated
	 */
	EClass getGConnection();

	/**
	 * Returns the meta object for the attribute '{@link GConnection#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see GConnection#getId()
	 * @see #getGConnection()
	 * @generated
	 */
	EAttribute getGConnection_Id();

	/**
	 * Returns the meta object for the attribute '{@link GConnection#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see GConnection#getType()
	 * @see #getGConnection()
	 * @generated
	 */
	EAttribute getGConnection_Type();

	/**
	 * Returns the meta object for the reference '{@link GConnection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see GConnection#getSource()
	 * @see #getGConnection()
	 * @generated
	 */
	EReference getGConnection_Source();

	/**
	 * Returns the meta object for the reference '{@link GConnection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see GConnection#getTarget()
	 * @see #getGConnection()
	 * @generated
	 */
	EReference getGConnection_Target();

	/**
	 * Returns the meta object for the containment reference list '{@link GConnection#getJoints <em>Joints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Joints</em>'.
	 * @see GConnection#getJoints()
	 * @see #getGConnection()
	 * @generated
	 */
	EReference getGConnection_Joints();

	/**
	 * Returns the meta object for the attribute '{@link GConnection#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see GConnection#getUid()
	 * @see #getGConnection()
	 * @generated
	 */
	EAttribute getGConnection_Uid();

	/**
	 * Returns the meta object for class '{@link GConnector <em>GConnector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GConnector</em>'.
	 * @see GConnector
	 * @generated
	 */
	EClass getGConnector();

	/**
	 * Returns the meta object for the attribute '{@link GConnector#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see GConnector#getId()
	 * @see #getGConnector()
	 * @generated
	 */
	EAttribute getGConnector_Id();

	/**
	 * Returns the meta object for the attribute '{@link GConnector#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see GConnector#getType()
	 * @see #getGConnector()
	 * @generated
	 */
	EAttribute getGConnector_Type();

	/**
	 * Returns the meta object for the container reference '{@link GConnector#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see GConnector#getParent()
	 * @see #getGConnector()
	 * @generated
	 */
	EReference getGConnector_Parent();

	/**
	 * Returns the meta object for the reference list '{@link GConnector#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connections</em>'.
	 * @see GConnector#getConnections()
	 * @see #getGConnector()
	 * @generated
	 */
	EReference getGConnector_Connections();

	/**
	 * Returns the meta object for the attribute '{@link GConnector#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see GConnector#getX()
	 * @see #getGConnector()
	 * @generated
	 */
	EAttribute getGConnector_X();

	/**
	 * Returns the meta object for the attribute '{@link GConnector#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see GConnector#getY()
	 * @see #getGConnector()
	 * @generated
	 */
	EAttribute getGConnector_Y();

	/**
	 * Returns the meta object for the attribute '{@link GConnector#isConnectionDetachedOnDrag <em>Connection Detached On Drag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Detached On Drag</em>'.
	 * @see GConnector#isConnectionDetachedOnDrag()
	 * @see #getGConnector()
	 * @generated
	 */
	EAttribute getGConnector_ConnectionDetachedOnDrag();

	/**
	 * Returns the meta object for class '{@link GJoint <em>GJoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GJoint</em>'.
	 * @see GJoint
	 * @generated
	 */
	EClass getGJoint();

	/**
	 * Returns the meta object for the attribute '{@link GJoint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see GJoint#getId()
	 * @see #getGJoint()
	 * @generated
	 */
	EAttribute getGJoint_Id();

	/**
	 * Returns the meta object for the attribute '{@link GJoint#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see GJoint#getType()
	 * @see #getGJoint()
	 * @generated
	 */
	EAttribute getGJoint_Type();

	/**
	 * Returns the meta object for the container reference '{@link GJoint#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Connection</em>'.
	 * @see GJoint#getConnection()
	 * @see #getGJoint()
	 * @generated
	 */
	EReference getGJoint_Connection();

	/**
	 * Returns the meta object for the attribute '{@link GJoint#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see GJoint#getX()
	 * @see #getGJoint()
	 * @generated
	 */
	EAttribute getGJoint_X();

	/**
	 * Returns the meta object for the attribute '{@link GJoint#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see GJoint#getY()
	 * @see #getGJoint()
	 * @generated
	 */
	EAttribute getGJoint_Y();

	/**
	 * Returns the meta object for class '{@link GCategory <em>GCategory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GCategory</em>'.
	 * @see GCategory
	 * @generated
	 */
	EClass getGCategory();

	/**
	 * Returns the meta object for the attribute '{@link GCategory#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see GCategory#getName()
	 * @see #getGCategory()
	 * @generated
	 */
	EAttribute getGCategory_Name();

	/**
	 * Returns the meta object for the attribute '{@link GCategory#getRemovalCost <em>Removal Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Removal Cost</em>'.
	 * @see GCategory#getRemovalCost()
	 * @see #getGCategory()
	 * @generated
	 */
	EAttribute getGCategory_RemovalCost();

	/**
	 * Returns the meta object for class '{@link GGroup <em>GGroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GGroup</em>'.
	 * @see GGroup
	 * @generated
	 */
	EClass getGGroup();

	/**
	 * Returns the meta object for the attribute '{@link GGroup#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see GGroup#getId()
	 * @see #getGGroup()
	 * @generated
	 */
	EAttribute getGGroup_Id();

	/**
	 * Returns the meta object for the attribute '{@link GGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see GGroup#getName()
	 * @see #getGGroup()
	 * @generated
	 */
	EAttribute getGGroup_Name();

	/**
	 * Returns the meta object for the attribute '{@link GGroup#getUniqueId <em>Unique Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Id</em>'.
	 * @see GGroup#getUniqueId()
	 * @see #getGGroup()
	 * @generated
	 */
	EAttribute getGGroup_UniqueId();

	/**
	 * Returns the meta object for the reference list '{@link GGroup#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nodes</em>'.
	 * @see GGroup#getNodes()
	 * @see #getGGroup()
	 * @generated
	 */
	EReference getGGroup_Nodes();

	/**
	 * Returns the meta object for class '{@link GText <em>GText</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GText</em>'.
	 * @see GText
	 * @generated
	 */
	EClass getGText();

	/**
	 * Returns the meta object for the attribute '{@link GText#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see GText#getId()
	 * @see #getGText()
	 * @generated
	 */
	EAttribute getGText_Id();

	/**
	 * Returns the meta object for the attribute '{@link GText#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see GText#getText()
	 * @see #getGText()
	 * @generated
	 */
	EAttribute getGText_Text();

	/**
	 * Returns the meta object for class '{@link GResizable <em>GResizable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GResizable</em>'.
	 * @see GResizable
	 * @generated
	 */
	EClass getGResizable();

	/**
	 * Returns the meta object for the attribute '{@link GResizable#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see GResizable#getX()
	 * @see #getGResizable()
	 * @generated
	 */
	EAttribute getGResizable_X();

	/**
	 * Returns the meta object for the attribute '{@link GResizable#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see GResizable#getY()
	 * @see #getGResizable()
	 * @generated
	 */
	EAttribute getGResizable_Y();

	/**
	 * Returns the meta object for the attribute '{@link GResizable#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see GResizable#getWidth()
	 * @see #getGResizable()
	 * @generated
	 */
	EAttribute getGResizable_Width();

	/**
	 * Returns the meta object for the attribute '{@link GResizable#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see GResizable#getHeight()
	 * @see #getGResizable()
	 * @generated
	 */
	EAttribute getGResizable_Height();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GraphFactory getGraphFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.tesis.dynaware.grapheditor.model.impl.GModelImpl <em>GModel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tesis.dynaware.grapheditor.model.impl.GModelImpl
		 * @see de.tesis.dynaware.grapheditor.model.impl.GraphPackageImpl#getGModel()
		 * @generated
		 */
		EClass GMODEL = eINSTANCE.getGModel();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GMODEL__NODES = eINSTANCE.getGModel_Nodes();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GMODEL__CONNECTIONS = eINSTANCE.getGModel_Connections();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GMODEL__TYPE = eINSTANCE.getGModel_Type();

		/**
		 * The meta object literal for the '<em><b>Content Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GMODEL__CONTENT_WIDTH = eINSTANCE.getGModel_ContentWidth();

		/**
		 * The meta object literal for the '<em><b>Content Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GMODEL__CONTENT_HEIGHT = eINSTANCE.getGModel_ContentHeight();

		/**
		 * The meta object literal for the '<em><b>Supergraph</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GMODEL__SUPERGRAPH = eINSTANCE.getGModel_Supergraph();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GMODEL__GROUPS = eINSTANCE.getGModel_Groups();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GMODEL__CATEGORIES = eINSTANCE.getGModel_Categories();

		/**
		 * The meta object literal for the '<em><b>Texts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GMODEL__TEXTS = eINSTANCE.getGModel_Texts();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GMODEL__ID = eINSTANCE.getGModel_Id();

		/**
		 * The meta object literal for the '{@link de.tesis.dynaware.grapheditor.model.impl.GConnectableImpl <em>GConnectable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tesis.dynaware.grapheditor.model.impl.GConnectableImpl
		 * @see de.tesis.dynaware.grapheditor.model.impl.GraphPackageImpl#getGConnectable()
		 * @generated
		 */
		EClass GCONNECTABLE = eINSTANCE.getGConnectable();

		/**
		 * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GCONNECTABLE__CONNECTORS = eINSTANCE.getGConnectable_Connectors();

		/**
		 * The meta object literal for the '{@link de.tesis.dynaware.grapheditor.model.impl.GNodeImpl <em>GNode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tesis.dynaware.grapheditor.model.impl.GNodeImpl
		 * @see de.tesis.dynaware.grapheditor.model.impl.GraphPackageImpl#getGNode()
		 * @generated
		 */
		EClass GNODE = eINSTANCE.getGNode();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GNODE__ID = eINSTANCE.getGNode_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GNODE__TYPE = eINSTANCE.getGNode_Type();

		/**
		 * The meta object literal for the '<em><b>Subgraph</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GNODE__SUBGRAPH = eINSTANCE.getGNode_Subgraph();

		/**
		 * The meta object literal for the '<em><b>Node Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GNODE__NODE_TYPE = eINSTANCE.getGNode_NodeType();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GNODE__TITLE = eINSTANCE.getGNode_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GNODE__DESCRIPTION = eINSTANCE.getGNode_Description();

		/**
		 * The meta object literal for the '<em><b>Unique Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GNODE__UNIQUE_ID = eINSTANCE.getGNode_UniqueId();

		/**
		 * The meta object literal for the '<em><b>Core Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GNODE__CORE_UID = eINSTANCE.getGNode_CoreUid();

		/**
		 * The meta object literal for the '<em><b>Node Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GNODE__NODE_ID = eINSTANCE.getGNode_NodeId();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GNODE__COLOR = eINSTANCE.getGNode_Color();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GNODE__CATEGORY = eINSTANCE.getGNode_Category();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GNODE__GROUP = eINSTANCE.getGNode_Group();

		/**
		 * The meta object literal for the '<em><b>Activation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GNODE__ACTIVATION_TYPE = eINSTANCE.getGNode_ActivationType();

		/**
		 * The meta object literal for the '{@link de.tesis.dynaware.grapheditor.model.impl.GConnectionImpl <em>GConnection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tesis.dynaware.grapheditor.model.impl.GConnectionImpl
		 * @see de.tesis.dynaware.grapheditor.model.impl.GraphPackageImpl#getGConnection()
		 * @generated
		 */
		EClass GCONNECTION = eINSTANCE.getGConnection();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GCONNECTION__ID = eINSTANCE.getGConnection_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GCONNECTION__TYPE = eINSTANCE.getGConnection_Type();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GCONNECTION__SOURCE = eINSTANCE.getGConnection_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GCONNECTION__TARGET = eINSTANCE.getGConnection_Target();

		/**
		 * The meta object literal for the '<em><b>Joints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GCONNECTION__JOINTS = eINSTANCE.getGConnection_Joints();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GCONNECTION__UID = eINSTANCE.getGConnection_Uid();

		/**
		 * The meta object literal for the '{@link de.tesis.dynaware.grapheditor.model.impl.GConnectorImpl <em>GConnector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tesis.dynaware.grapheditor.model.impl.GConnectorImpl
		 * @see de.tesis.dynaware.grapheditor.model.impl.GraphPackageImpl#getGConnector()
		 * @generated
		 */
		EClass GCONNECTOR = eINSTANCE.getGConnector();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GCONNECTOR__ID = eINSTANCE.getGConnector_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GCONNECTOR__TYPE = eINSTANCE.getGConnector_Type();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GCONNECTOR__PARENT = eINSTANCE.getGConnector_Parent();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GCONNECTOR__CONNECTIONS = eINSTANCE.getGConnector_Connections();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GCONNECTOR__X = eINSTANCE.getGConnector_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GCONNECTOR__Y = eINSTANCE.getGConnector_Y();

		/**
		 * The meta object literal for the '<em><b>Connection Detached On Drag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GCONNECTOR__CONNECTION_DETACHED_ON_DRAG = eINSTANCE.getGConnector_ConnectionDetachedOnDrag();

		/**
		 * The meta object literal for the '{@link de.tesis.dynaware.grapheditor.model.impl.GJointImpl <em>GJoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tesis.dynaware.grapheditor.model.impl.GJointImpl
		 * @see de.tesis.dynaware.grapheditor.model.impl.GraphPackageImpl#getGJoint()
		 * @generated
		 */
		EClass GJOINT = eINSTANCE.getGJoint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GJOINT__ID = eINSTANCE.getGJoint_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GJOINT__TYPE = eINSTANCE.getGJoint_Type();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GJOINT__CONNECTION = eINSTANCE.getGJoint_Connection();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GJOINT__X = eINSTANCE.getGJoint_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GJOINT__Y = eINSTANCE.getGJoint_Y();

		/**
		 * The meta object literal for the '{@link de.tesis.dynaware.grapheditor.model.impl.GCategoryImpl <em>GCategory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tesis.dynaware.grapheditor.model.impl.GCategoryImpl
		 * @see de.tesis.dynaware.grapheditor.model.impl.GraphPackageImpl#getGCategory()
		 * @generated
		 */
		EClass GCATEGORY = eINSTANCE.getGCategory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GCATEGORY__NAME = eINSTANCE.getGCategory_Name();

		/**
		 * The meta object literal for the '<em><b>Removal Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GCATEGORY__REMOVAL_COST = eINSTANCE.getGCategory_RemovalCost();

		/**
		 * The meta object literal for the '{@link de.tesis.dynaware.grapheditor.model.impl.GGroupImpl <em>GGroup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tesis.dynaware.grapheditor.model.impl.GGroupImpl
		 * @see de.tesis.dynaware.grapheditor.model.impl.GraphPackageImpl#getGGroup()
		 * @generated
		 */
		EClass GGROUP = eINSTANCE.getGGroup();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GGROUP__ID = eINSTANCE.getGGroup_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GGROUP__NAME = eINSTANCE.getGGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Unique Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GGROUP__UNIQUE_ID = eINSTANCE.getGGroup_UniqueId();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GGROUP__NODES = eINSTANCE.getGGroup_Nodes();

		/**
		 * The meta object literal for the '{@link de.tesis.dynaware.grapheditor.model.impl.GTextImpl <em>GText</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tesis.dynaware.grapheditor.model.impl.GTextImpl
		 * @see de.tesis.dynaware.grapheditor.model.impl.GraphPackageImpl#getGText()
		 * @generated
		 */
		EClass GTEXT = eINSTANCE.getGText();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GTEXT__ID = eINSTANCE.getGText_Id();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GTEXT__TEXT = eINSTANCE.getGText_Text();

		/**
		 * The meta object literal for the '{@link de.tesis.dynaware.grapheditor.model.impl.GResizableImpl <em>GResizable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tesis.dynaware.grapheditor.model.impl.GResizableImpl
		 * @see de.tesis.dynaware.grapheditor.model.impl.GraphPackageImpl#getGResizable()
		 * @generated
		 */
		EClass GRESIZABLE = eINSTANCE.getGResizable();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRESIZABLE__X = eINSTANCE.getGResizable_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRESIZABLE__Y = eINSTANCE.getGResizable_Y();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRESIZABLE__WIDTH = eINSTANCE.getGResizable_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRESIZABLE__HEIGHT = eINSTANCE.getGResizable_Height();

	}

} //GraphPackage
