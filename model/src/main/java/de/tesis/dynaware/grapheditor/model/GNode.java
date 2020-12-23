/**
 */
package de.tesis.dynaware.grapheditor.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GNode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GNode#getId <em>Id</em>}</li>
 *   <li>{@link GNode#getType <em>Type</em>}</li>
 *   <li>{@link GNode#getSubgraph <em>Subgraph</em>}</li>
 *   <li>{@link GNode#getNodeType <em>Node Type</em>}</li>
 *   <li>{@link GNode#getTitle <em>Title</em>}</li>
 *   <li>{@link GNode#getDescription <em>Description</em>}</li>
 *   <li>{@link GNode#getUniqueId <em>Unique Id</em>}</li>
 *   <li>{@link GNode#getCoreUid <em>Core Uid</em>}</li>
 *   <li>{@link GNode#getColor <em>Color</em>}</li>
 *   <li>{@link GNode#getCategory <em>Category</em>}</li>
 *   <li>{@link GNode#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see GraphPackage#getGNode()
 * @model
 * @generated
 */
public interface GNode extends GConnectable, GResizable {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see GraphPackage#getGNode_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link GNode#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see GraphPackage#getGNode_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link GNode#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Subgraph</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link GModel#getSupergraph <em>Supergraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subgraph</em>' containment reference.
	 * @see #setSubgraph(GModel)
	 * @see GraphPackage#getGNode_Subgraph()
	 * @see GModel#getSupergraph
	 * @model opposite="supergraph" containment="true"
	 * @generated
	 */
	GModel getSubgraph();

	/**
	 * Sets the value of the '{@link GNode#getSubgraph <em>Subgraph</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subgraph</em>' containment reference.
	 * @see #getSubgraph()
	 * @generated
	 */
	void setSubgraph(GModel value);

	/**
	 * Returns the value of the '<em><b>Node Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Type</em>' attribute.
	 * @see #setNodeType(String)
	 * @see GraphPackage#getGNode_NodeType()
	 * @model default=""
	 * @generated
	 */
	String getNodeType();

	/**
	 * Sets the value of the '{@link GNode#getNodeType <em>Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Type</em>' attribute.
	 * @see #getNodeType()
	 * @generated
	 */
	void setNodeType(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see GraphPackage#getGNode_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link GNode#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see GraphPackage#getGNode_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link GNode#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Unique Id</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique Id</em>' attribute.
	 * @see #setUniqueId(String)
	 * @see GraphPackage#getGNode_UniqueId()
	 * @model default=""
	 * @generated
	 */
	String getUniqueId();

	/**
	 * Sets the value of the '{@link GNode#getUniqueId <em>Unique Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Id</em>' attribute.
	 * @see #getUniqueId()
	 * @generated
	 */
	void setUniqueId(String value);

	/**
	 * Returns the value of the '<em><b>Core Uid</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Uid</em>' attribute.
	 * @see #setCoreUid(String)
	 * @see GraphPackage#getGNode_CoreUid()
	 * @model default=""
	 * @generated
	 */
	String getCoreUid();

	/**
	 * Sets the value of the '{@link GNode#getCoreUid <em>Core Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Uid</em>' attribute.
	 * @see #getCoreUid()
	 * @generated
	 */
	void setCoreUid(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The default value is <code>"0xffffffff"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see GraphPackage#getGNode_Color()
	 * @model default="0xffffffff"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link GNode#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference.
	 * @see #setCategory(GCategory)
	 * @see GraphPackage#getGNode_Category()
	 * @model required="true"
	 * @generated
	 */
	GCategory getCategory();

	/**
	 * Sets the value of the '{@link GNode#getCategory <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(GCategory value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' reference.
	 * @see #setGroup(GGroup)
	 * @see GraphPackage#getGNode_Group()
	 * @model
	 * @generated
	 */
	GGroup getGroup();

	/**
	 * Sets the value of the '{@link GNode#getGroup <em>Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(GGroup value);

} // GNode
