/**
 */
package de.tesis.dynaware.grapheditor.model.util;

import de.tesis.dynaware.grapheditor.model.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see GraphPackage
 * @generated
 */
public class GraphSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GraphPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphSwitch() {
		if (modelPackage == null) {
			modelPackage = GraphPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GraphPackage.GMODEL: {
				GModel gModel = (GModel)theEObject;
				T result = caseGModel(gModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphPackage.GCONNECTABLE: {
				GConnectable gConnectable = (GConnectable)theEObject;
				T result = caseGConnectable(gConnectable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphPackage.GNODE: {
				GNode gNode = (GNode)theEObject;
				T result = caseGNode(gNode);
				if (result == null) result = caseGConnectable(gNode);
				if (result == null) result = caseGResizable(gNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphPackage.GCONNECTION: {
				GConnection gConnection = (GConnection)theEObject;
				T result = caseGConnection(gConnection);
				if (result == null) result = caseGConnectable(gConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphPackage.GCONNECTOR: {
				GConnector gConnector = (GConnector)theEObject;
				T result = caseGConnector(gConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphPackage.GJOINT: {
				GJoint gJoint = (GJoint)theEObject;
				T result = caseGJoint(gJoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphPackage.GCATEGORY: {
				GCategory gCategory = (GCategory)theEObject;
				T result = caseGCategory(gCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphPackage.GGROUP: {
				GGroup gGroup = (GGroup)theEObject;
				T result = caseGGroup(gGroup);
				if (result == null) result = caseGResizable(gGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphPackage.GTEXT: {
				GText gText = (GText)theEObject;
				T result = caseGText(gText);
				if (result == null) result = caseGResizable(gText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphPackage.GRESIZABLE: {
				GResizable gResizable = (GResizable)theEObject;
				T result = caseGResizable(gResizable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GModel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GModel</em>'.
	 * @see #doSwitch(EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGModel(GModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GConnectable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GConnectable</em>'.
	 * @see #doSwitch(EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGConnectable(GConnectable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GNode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GNode</em>'.
	 * @see #doSwitch(EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGNode(GNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GConnection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GConnection</em>'.
	 * @see #doSwitch(EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGConnection(GConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GConnector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GConnector</em>'.
	 * @see #doSwitch(EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGConnector(GConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GJoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GJoint</em>'.
	 * @see #doSwitch(EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGJoint(GJoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GCategory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GCategory</em>'.
	 * @see #doSwitch(EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGCategory(GCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GGroup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GGroup</em>'.
	 * @see #doSwitch(EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGGroup(GGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GText</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GText</em>'.
	 * @see #doSwitch(EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGText(GText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GResizable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GResizable</em>'.
	 * @see #doSwitch(EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGResizable(GResizable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GraphSwitch
