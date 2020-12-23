/**
 */
package de.tesis.dynaware.grapheditor.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GCategory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tesis.dynaware.grapheditor.model.GCategory#getName <em>Name</em>}</li>
 *   <li>{@link de.tesis.dynaware.grapheditor.model.GCategory#getRemovalCost <em>Removal Cost</em>}</li>
 * </ul>
 *
 * @see de.tesis.dynaware.grapheditor.model.GraphPackage#getGCategory()
 * @model
 * @generated
 */
public interface GCategory extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.tesis.dynaware.grapheditor.model.GraphPackage#getGCategory_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.tesis.dynaware.grapheditor.model.GCategory#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Removal Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Removal Cost</em>' attribute.
	 * @see #setRemovalCost(double)
	 * @see de.tesis.dynaware.grapheditor.model.GraphPackage#getGCategory_RemovalCost()
	 * @model
	 * @generated
	 */
	double getRemovalCost();

	/**
	 * Sets the value of the '{@link de.tesis.dynaware.grapheditor.model.GCategory#getRemovalCost <em>Removal Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Removal Cost</em>' attribute.
	 * @see #getRemovalCost()
	 * @generated
	 */
	void setRemovalCost(double value);

} // GCategory
