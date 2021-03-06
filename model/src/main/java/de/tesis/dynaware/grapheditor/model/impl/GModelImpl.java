/**
 */
package de.tesis.dynaware.grapheditor.model.impl;

import de.tesis.dynaware.grapheditor.model.GCategory;
import de.tesis.dynaware.grapheditor.model.GConnection;
import de.tesis.dynaware.grapheditor.model.GGroup;
import de.tesis.dynaware.grapheditor.model.GModel;
import de.tesis.dynaware.grapheditor.model.GNode;
import de.tesis.dynaware.grapheditor.model.GText;
import de.tesis.dynaware.grapheditor.model.GraphPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GModel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GModelImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link GModelImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link GModelImpl#getType <em>Type</em>}</li>
 *   <li>{@link GModelImpl#getContentWidth <em>Content Width</em>}</li>
 *   <li>{@link GModelImpl#getContentHeight <em>Content Height</em>}</li>
 *   <li>{@link GModelImpl#getSupergraph <em>Supergraph</em>}</li>
 *   <li>{@link GModelImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link GModelImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link GModelImpl#getTexts <em>Texts</em>}</li>
 *   <li>{@link GModelImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GModelImpl extends MinimalEObjectImpl.Container implements GModel {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<GNode> nodes;

	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<GConnection> connections;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentWidth() <em>Content Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double CONTENT_WIDTH_EDEFAULT = 3000.0;

	/**
	 * The cached value of the '{@link #getContentWidth() <em>Content Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentWidth()
	 * @generated
	 * @ordered
	 */
	protected double contentWidth = CONTENT_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentHeight() <em>Content Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double CONTENT_HEIGHT_EDEFAULT = 2250.0;

	/**
	 * The cached value of the '{@link #getContentHeight() <em>Content Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentHeight()
	 * @generated
	 * @ordered
	 */
	protected double contentHeight = CONTENT_HEIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<GGroup> groups;

	/**
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<GCategory> categories;

	/**
	 * The cached value of the '{@link #getTexts() <em>Texts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexts()
	 * @generated
	 * @ordered
	 */
	protected EList<GText> texts;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphPackage.Literals.GMODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GNode> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<GNode>(GNode.class, this, GraphPackage.GMODEL__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GConnection> getConnections() {
		if (connections == null) {
			connections = new EObjectContainmentEList<GConnection>(GConnection.class, this, GraphPackage.GMODEL__CONNECTIONS);
		}
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GMODEL__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getContentWidth() {
		return contentWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentWidth(double newContentWidth) {
		double oldContentWidth = contentWidth;
		contentWidth = newContentWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GMODEL__CONTENT_WIDTH, oldContentWidth, contentWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getContentHeight() {
		return contentHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentHeight(double newContentHeight) {
		double oldContentHeight = contentHeight;
		contentHeight = newContentHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GMODEL__CONTENT_HEIGHT, oldContentHeight, contentHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GNode getSupergraph() {
		if (eContainerFeatureID() != GraphPackage.GMODEL__SUPERGRAPH) return null;
		return (GNode)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GGroup> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentEList<GGroup>(GGroup.class, this, GraphPackage.GMODEL__GROUPS);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GCategory> getCategories() {
		if (categories == null) {
			categories = new EObjectContainmentEList<GCategory>(GCategory.class, this, GraphPackage.GMODEL__CATEGORIES);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GText> getTexts() {
		if (texts == null) {
			texts = new EObjectContainmentEList<GText>(GText.class, this, GraphPackage.GMODEL__TEXTS);
		}
		return texts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GMODEL__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphPackage.GMODEL__SUPERGRAPH:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, GraphPackage.GMODEL__SUPERGRAPH, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphPackage.GMODEL__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case GraphPackage.GMODEL__CONNECTIONS:
				return ((InternalEList<?>)getConnections()).basicRemove(otherEnd, msgs);
			case GraphPackage.GMODEL__SUPERGRAPH:
				return eBasicSetContainer(null, GraphPackage.GMODEL__SUPERGRAPH, msgs);
			case GraphPackage.GMODEL__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
			case GraphPackage.GMODEL__CATEGORIES:
				return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
			case GraphPackage.GMODEL__TEXTS:
				return ((InternalEList<?>)getTexts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case GraphPackage.GMODEL__SUPERGRAPH:
				return eInternalContainer().eInverseRemove(this, GraphPackage.GNODE__SUBGRAPH, GNode.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphPackage.GMODEL__NODES:
				return getNodes();
			case GraphPackage.GMODEL__CONNECTIONS:
				return getConnections();
			case GraphPackage.GMODEL__TYPE:
				return getType();
			case GraphPackage.GMODEL__CONTENT_WIDTH:
				return getContentWidth();
			case GraphPackage.GMODEL__CONTENT_HEIGHT:
				return getContentHeight();
			case GraphPackage.GMODEL__SUPERGRAPH:
				return getSupergraph();
			case GraphPackage.GMODEL__GROUPS:
				return getGroups();
			case GraphPackage.GMODEL__CATEGORIES:
				return getCategories();
			case GraphPackage.GMODEL__TEXTS:
				return getTexts();
			case GraphPackage.GMODEL__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GraphPackage.GMODEL__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends GNode>)newValue);
				return;
			case GraphPackage.GMODEL__CONNECTIONS:
				getConnections().clear();
				getConnections().addAll((Collection<? extends GConnection>)newValue);
				return;
			case GraphPackage.GMODEL__TYPE:
				setType((String)newValue);
				return;
			case GraphPackage.GMODEL__CONTENT_WIDTH:
				setContentWidth((Double)newValue);
				return;
			case GraphPackage.GMODEL__CONTENT_HEIGHT:
				setContentHeight((Double)newValue);
				return;
			case GraphPackage.GMODEL__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends GGroup>)newValue);
				return;
			case GraphPackage.GMODEL__CATEGORIES:
				getCategories().clear();
				getCategories().addAll((Collection<? extends GCategory>)newValue);
				return;
			case GraphPackage.GMODEL__TEXTS:
				getTexts().clear();
				getTexts().addAll((Collection<? extends GText>)newValue);
				return;
			case GraphPackage.GMODEL__ID:
				setId((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GraphPackage.GMODEL__NODES:
				getNodes().clear();
				return;
			case GraphPackage.GMODEL__CONNECTIONS:
				getConnections().clear();
				return;
			case GraphPackage.GMODEL__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case GraphPackage.GMODEL__CONTENT_WIDTH:
				setContentWidth(CONTENT_WIDTH_EDEFAULT);
				return;
			case GraphPackage.GMODEL__CONTENT_HEIGHT:
				setContentHeight(CONTENT_HEIGHT_EDEFAULT);
				return;
			case GraphPackage.GMODEL__GROUPS:
				getGroups().clear();
				return;
			case GraphPackage.GMODEL__CATEGORIES:
				getCategories().clear();
				return;
			case GraphPackage.GMODEL__TEXTS:
				getTexts().clear();
				return;
			case GraphPackage.GMODEL__ID:
				setId(ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GraphPackage.GMODEL__NODES:
				return nodes != null && !nodes.isEmpty();
			case GraphPackage.GMODEL__CONNECTIONS:
				return connections != null && !connections.isEmpty();
			case GraphPackage.GMODEL__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case GraphPackage.GMODEL__CONTENT_WIDTH:
				return contentWidth != CONTENT_WIDTH_EDEFAULT;
			case GraphPackage.GMODEL__CONTENT_HEIGHT:
				return contentHeight != CONTENT_HEIGHT_EDEFAULT;
			case GraphPackage.GMODEL__SUPERGRAPH:
				return getSupergraph() != null;
			case GraphPackage.GMODEL__GROUPS:
				return groups != null && !groups.isEmpty();
			case GraphPackage.GMODEL__CATEGORIES:
				return categories != null && !categories.isEmpty();
			case GraphPackage.GMODEL__TEXTS:
				return texts != null && !texts.isEmpty();
			case GraphPackage.GMODEL__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", contentWidth: ");
		result.append(contentWidth);
		result.append(", contentHeight: ");
		result.append(contentHeight);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //GModelImpl
