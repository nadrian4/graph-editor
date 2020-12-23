/**
 */
package de.tesis.dynaware.grapheditor.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GGroup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tesis.dynaware.grapheditor.model.GGroup#getId <em>Id</em>}</li>
 *   <li>{@link de.tesis.dynaware.grapheditor.model.GGroup#getName <em>Name</em>}</li>
 *   <li>{@link de.tesis.dynaware.grapheditor.model.GGroup#getCoreUid <em>Core Uid</em>}</li>
 *   <li>{@link de.tesis.dynaware.grapheditor.model.GGroup#getUniqueId <em>Unique Id</em>}</li>
 *   <li>{@link de.tesis.dynaware.grapheditor.model.GGroup#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @see de.tesis.dynaware.grapheditor.model.GraphPackage#getGGroup()
 * @model
 * @generated
 */
public interface GGroup extends GResizable {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.tesis.dynaware.grapheditor.model.GraphPackage#getGGroup_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.tesis.dynaware.grapheditor.model.GGroup#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.tesis.dynaware.grapheditor.model.GraphPackage#getGGroup_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.tesis.dynaware.grapheditor.model.GGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Core Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Uid</em>' attribute.
	 * @see #setCoreUid(String)
	 * @see de.tesis.dynaware.grapheditor.model.GraphPackage#getGGroup_CoreUid()
	 * @model
	 * @generated
	 */
	String getCoreUid();

	/**
	 * Sets the value of the '{@link de.tesis.dynaware.grapheditor.model.GGroup#getCoreUid <em>Core Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Uid</em>' attribute.
	 * @see #getCoreUid()
	 * @generated
	 */
	void setCoreUid(String value);

	/**
	 * Returns the value of the '<em><b>Unique Id</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique Id</em>' attribute.
	 * @see #setUniqueId(String)
	 * @see de.tesis.dynaware.grapheditor.model.GraphPackage#getGGroup_UniqueId()
	 * @model default=""
	 * @generated
	 */
	String getUniqueId();

	/**
	 * Sets the value of the '{@link de.tesis.dynaware.grapheditor.model.GGroup#getUniqueId <em>Unique Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Id</em>' attribute.
	 * @see #getUniqueId()
	 * @generated
	 */
	void setUniqueId(String value);

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' reference list.
	 * The list contents are of type {@link de.tesis.dynaware.grapheditor.model.GNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' reference list.
	 * @see de.tesis.dynaware.grapheditor.model.GraphPackage#getGGroup_Nodes()
	 * @model
	 * @generated
	 */
	EList<GNode> getNodes();

} // GGroup
