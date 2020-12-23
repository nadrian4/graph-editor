/**
 */
package de.tesis.dynaware.grapheditor.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GModel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GModel#getNodes <em>Nodes</em>}</li>
 *   <li>{@link GModel#getConnections <em>Connections</em>}</li>
 *   <li>{@link GModel#getType <em>Type</em>}</li>
 *   <li>{@link GModel#getContentWidth <em>Content Width</em>}</li>
 *   <li>{@link GModel#getContentHeight <em>Content Height</em>}</li>
 *   <li>{@link GModel#getSupergraph <em>Supergraph</em>}</li>
 *   <li>{@link GModel#getGroups <em>Groups</em>}</li>
 *   <li>{@link GModel#getCategories <em>Categories</em>}</li>
 *   <li>{@link GModel#getTexts <em>Texts</em>}</li>
 *   <li>{@link GModel#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see GraphPackage#getGModel()
 * @model
 * @generated
 */
public interface GModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link GNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see GraphPackage#getGModel_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<GNode> getNodes();

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link GConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see GraphPackage#getGModel_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<GConnection> getConnections();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see GraphPackage#getGModel_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link GModel#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Content Width</b></em>' attribute.
	 * The default value is <code>"3000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Width</em>' attribute.
	 * @see #setContentWidth(double)
	 * @see GraphPackage#getGModel_ContentWidth()
	 * @model default="3000" required="true"
	 * @generated
	 */
	double getContentWidth();

	/**
	 * Sets the value of the '{@link GModel#getContentWidth <em>Content Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Width</em>' attribute.
	 * @see #getContentWidth()
	 * @generated
	 */
	void setContentWidth(double value);

	/**
	 * Returns the value of the '<em><b>Content Height</b></em>' attribute.
	 * The default value is <code>"2250"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Height</em>' attribute.
	 * @see #setContentHeight(double)
	 * @see GraphPackage#getGModel_ContentHeight()
	 * @model default="2250" required="true"
	 * @generated
	 */
	double getContentHeight();

	/**
	 * Sets the value of the '{@link GModel#getContentHeight <em>Content Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Height</em>' attribute.
	 * @see #getContentHeight()
	 * @generated
	 */
	void setContentHeight(double value);

	/**
	 * Returns the value of the '<em><b>Supergraph</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link GNode#getSubgraph <em>Subgraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supergraph</em>' container reference.
	 * @see GraphPackage#getGModel_Supergraph()
	 * @see GNode#getSubgraph
	 * @model opposite="subgraph" transient="false" changeable="false"
	 * @generated
	 */
	GNode getSupergraph();

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link GGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see GraphPackage#getGModel_Groups()
	 * @model containment="true"
	 * @generated
	 */
	EList<GGroup> getGroups();

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
	 * The list contents are of type {@link GCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference list.
	 * @see GraphPackage#getGModel_Categories()
	 * @model containment="true"
	 * @generated
	 */
	EList<GCategory> getCategories();

	/**
	 * Returns the value of the '<em><b>Texts</b></em>' containment reference list.
	 * The list contents are of type {@link GText}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texts</em>' containment reference list.
	 * @see GraphPackage#getGModel_Texts()
	 * @model containment="true"
	 * @generated
	 */
	EList<GText> getTexts();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see GraphPackage#getGModel_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link GModel#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // GModel
