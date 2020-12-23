/**
 */
package de.tesis.dynaware.grapheditor.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GConnectable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GConnectable#getConnectors <em>Connectors</em>}</li>
 * </ul>
 *
 * @see GraphPackage#getGConnectable()
 * @model abstract="true"
 * @generated
 */
public interface GConnectable extends EObject {
	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link GConnector}.
	 * It is bidirectional and its opposite is '{@link GConnector#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' containment reference list.
	 * @see GraphPackage#getGConnectable_Connectors()
	 * @see GConnector#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<GConnector> getConnectors();

} // GConnectable
