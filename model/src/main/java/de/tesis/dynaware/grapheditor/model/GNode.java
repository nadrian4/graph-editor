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
 *   <li>{@link de.tesis.dynaware.grapheditor.model.GNode#getId <em>Id</em>}</li>
 *   <li>{@link de.tesis.dynaware.grapheditor.model.GNode#getType <em>Type</em>}</li>
 *   <li>{@link de.tesis.dynaware.grapheditor.model.GNode#getSubgraph <em>Subgraph</em>}</li>
 *   <li>{@link de.tesis.dynaware.grapheditor.model.GNode#getNodeType <em>Node Type</em>}</li>
 *   <li>{@link de.tesis.dynaware.grapheditor.model.GNode#getTitle <em>Title</em>}</li>
 *   <li>{@link de.tesis.dynaware.grapheditor.model.GNode#getDescription <em>Description</em>}</li>
 *   <li>{@link de.tesis.dynaware.grapheditor.model.GNode#getUniqueId <em>Unique Id</em>}</li>
 *   <li>{@link de.tesis.dynaware.grapheditor.model.GNode#getCoreUid <em>Core Uid</em>}</li>
 *   <li>{@link de.tesis.dynaware.grapheditor.model.GNode#getColor <em>Color</em>}</li>
 *   <li>{@link de.tesis.dynaware.grapheditor.model.GNode#getCategory <em>Category</em>}</li>
 *   <li>{@link de.tesis.dynaware.grapheditor.model.GNode#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see de.tesis.dynaware.grapheditor.model.GraphPackage#getGNode()
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
	 * @see de.tesis.dynaware.grapheditor.model.GraphPackage#getGNode_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.tesis.dynaware.grapheditor.model.GNode#getId <em>Id</em>}' attribute.
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
	 * @see de.tesis.dynaware.grapheditor.model.GraphPackage#getGNode_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.tesis.dynaware.grapheditor.model.GNode#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Subgraph</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.tesis.dynaware.grapheditor.model.GModel#getSupergraph <em>Supergraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subgraph</em>' containment reference.
	 * @see #setSubgraph(GModel)
	 * @see de.tesis.dynaware.grapheditor.model.GraphPackage#getGNode_Subgraph()
	 * @see de.tesis.dynaware.grapheditor.model.GModel#getSupergraph
	 * @model opposite="supergraph" containment="true"
	 * @generated
	 */
	GModel getSubgraph();

	/**
	 * Sets the value of the '{@link de.tesis.dynaware.grapheditor.model.GNode#getSubgraph <em>Subgraph</em>}' containment reference.
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
	 * @see de.tesis.dynaware.grapheditor.model.GraphPackage#getGNode_NodeType()
	 * @model default=""
	 * @generated
	 */
	String getNodeType();

	/**
	 * Sets the value of the '{@link de.tesis.dynaware.grapheditor.model.GNode#getNodeType <em>Node Type</em>}' attribute.
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
	 * @see de.tesis.dynaware.grapheditor.model.GraphPackage#getGNode_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link de.tesis.dynaware.grapheditor.model.GNode#getTitle <em>Title</em>}' attribute.
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
	 * @see de.tesis.dynaware.grapheditor.model.GraphPackage#getGNode_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.tesis.dynaware.grapheditor.model.GNode#getDescription <em>Description</em>}' attribute.
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
	 * @see de.tesis.dynaware.grapheditor.model.GraphPackage#getGNode_UniqueId()
	 * @model default=""
	 * @generated
	 */
	String getUniqueId();

	/**
	 * Sets the value of the '{@link de.tesis.dynaware.grapheditor.model.GNode#getUniqueId <em>Unique Id</em>}' attribute.
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
	 * @see de.tesis.dynaware.grapheditor.model.GraphPackage#getGNode_CoreUid()
	 * @model default=""
	 * @generated
	 */
	String getCoreUid();

	/**
	 * Sets the value of the '{@link de.tesis.dynaware.grapheditor.model.GNode#getCoreUid <em>Core Uid</em>}' attribute.
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
	 * @see de.tesis.dynaware.grapheditor.model.GraphPackage#getGNode_Color()
	 * @model default="0xffffffff"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link de.tesis.dynaware.grapheditor.model.GNode#getColor <em>Color</em>}' attribute.
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
	 * @see de.tesis.dynaware.grapheditor.model.GraphPackage#getGNode_Category()
	 * @model required="true"
	 * @generated
	 */
	GCategory getCategory();

	/**
	 * Sets the value of the '{@link de.tesis.dynaware.grapheditor.model.GNode#getCategory <em>Category</em>}' reference.
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
	 * @see de.tesis.dynaware.grapheditor.model.GraphPackage#getGNode_Group()
	 * @model
	 * @generated
	 */
	GGroup getGroup();

	/**
	 * Sets the value of the '{@link de.tesis.dynaware.grapheditor.model.GNode#getGroup <em>Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(GGroup value);

} // GNode
