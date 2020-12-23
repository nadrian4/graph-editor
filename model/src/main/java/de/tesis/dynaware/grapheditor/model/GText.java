/**
 */
package de.tesis.dynaware.grapheditor.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GText</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tesis.dynaware.grapheditor.model.GText#getId <em>Id</em>}</li>
 *   <li>{@link de.tesis.dynaware.grapheditor.model.GText#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see de.tesis.dynaware.grapheditor.model.GraphPackage#getGText()
 * @model
 * @generated
 */
public interface GText extends GResizable {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.tesis.dynaware.grapheditor.model.GraphPackage#getGText_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.tesis.dynaware.grapheditor.model.GText#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see de.tesis.dynaware.grapheditor.model.GraphPackage#getGText_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link de.tesis.dynaware.grapheditor.model.GText#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // GText
