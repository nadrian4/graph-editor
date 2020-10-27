/**
 */
package de.tesis.dynaware.grapheditor.model;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link GNode#getX <em>X</em>}</li>
 *   <li>{@link GNode#getY <em>Y</em>}</li>
 *   <li>{@link GNode#getWidth <em>Width</em>}</li>
 *   <li>{@link GNode#getHeight <em>Height</em>}</li>
 *   <li>{@link GNode#getSubgraph <em>Subgraph</em>}</li>
 *   <li>{@link GNode#getNodeType <em>Node Type</em>}</li>
 *   <li>{@link GNode#getNodeCategory <em>Node Category</em>}</li>
 *   <li>{@link GNode#getGroups <em>Groups</em>}</li>
 *   <li>{@link GNode#getTitle <em>Title</em>}</li>
 *   <li>{@link GNode#getDescription <em>Description</em>}</li>
 *   <li>{@link GNode#getUid <em>Uid</em>}</li>
 * </ul>
 *
 * @see GraphPackage#getGNode()
 * @model
 * @generated
 */
public interface GNode extends GConnectable {
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
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(double)
	 * @see GraphPackage#getGNode_X()
	 * @model default="0" required="true"
	 * @generated
	 */
	double getX();

	/**
	 * Sets the value of the '{@link GNode#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(double value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(double)
	 * @see GraphPackage#getGNode_Y()
	 * @model default="0" required="true"
	 * @generated
	 */
	double getY();

	/**
	 * Sets the value of the '{@link GNode#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(double value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"151"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(double)
	 * @see GraphPackage#getGNode_Width()
	 * @model default="151" required="true"
	 * @generated
	 */
	double getWidth();

	/**
	 * Sets the value of the '{@link GNode#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(double value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * The default value is <code>"101"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(double)
	 * @see GraphPackage#getGNode_Height()
	 * @model default="101" required="true"
	 * @generated
	 */
	double getHeight();

	/**
	 * Sets the value of the '{@link GNode#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(double value);

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
	 * Returns the value of the '<em><b>Node Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Category</em>' attribute.
	 * @see #setNodeCategory(String)
	 * @see GraphPackage#getGNode_NodeCategory()
	 * @model
	 * @generated
	 */
	String getNodeCategory();

	/**
	 * Sets the value of the '{@link GNode#getNodeCategory <em>Node Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Category</em>' attribute.
	 * @see #getNodeCategory()
	 * @generated
	 */
	void setNodeCategory(String value);

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' attribute list.
	 * The list contents are of type {@link String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' attribute list.
	 * @see GraphPackage#getGNode_Groups()
	 * @model
	 * @generated
	 */
	EList<String> getGroups();

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
	 * Returns the value of the '<em><b>Uid</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uid</em>' attribute.
	 * @see #setUid(String)
	 * @see GraphPackage#getGNode_Uid()
	 * @model default="" transient="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link GNode#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

} // GNode
