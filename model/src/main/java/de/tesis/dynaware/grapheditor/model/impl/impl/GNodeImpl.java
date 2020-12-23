/**
 */
package de.tesis.dynaware.grapheditor.model.impl;

import de.tesis.dynaware.grapheditor.model.GCategory;
import de.tesis.dynaware.grapheditor.model.GGroup;
import de.tesis.dynaware.grapheditor.model.GModel;
import de.tesis.dynaware.grapheditor.model.GNode;
import de.tesis.dynaware.grapheditor.model.GResizable;
import de.tesis.dynaware.grapheditor.model.GraphPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GNode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tesis.dynaware.grapheditor.model.impl.GNodeImpl#getX <em>X</em>}</li>
 *   <li>{@link de.tesis.dynaware.grapheditor.model.impl.GNodeImpl#getY <em>Y</em>}</li>
 *   <li>{@link de.tesis.dynaware.grapheditor.model.impl.GNodeImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link de.tesis.dynaware.grapheditor.model.impl.GNodeImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link de.tesis.dynaware.grapheditor.model.impl.GNodeImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.tesis.dynaware.grapheditor.model.impl.GNodeImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.tesis.dynaware.grapheditor.model.impl.GNodeImpl#getSubgraph <em>Subgraph</em>}</li>
 *   <li>{@link de.tesis.dynaware.grapheditor.model.impl.GNodeImpl#getNodeType <em>Node Type</em>}</li>
 *   <li>{@link de.tesis.dynaware.grapheditor.model.impl.GNodeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link de.tesis.dynaware.grapheditor.model.impl.GNodeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.tesis.dynaware.grapheditor.model.impl.GNodeImpl#getUniqueId <em>Unique Id</em>}</li>
 *   <li>{@link de.tesis.dynaware.grapheditor.model.impl.GNodeImpl#getCoreUid <em>Core Uid</em>}</li>
 *   <li>{@link de.tesis.dynaware.grapheditor.model.impl.GNodeImpl#getColor <em>Color</em>}</li>
 *   <li>{@link de.tesis.dynaware.grapheditor.model.impl.GNodeImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link de.tesis.dynaware.grapheditor.model.impl.GNodeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link de.tesis.dynaware.grapheditor.model.impl.GNodeImpl#getActivationType <em>Activation Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GNodeImpl extends GConnectableImpl implements GNode {
	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final double X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected double x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final double Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected double y = Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double WIDTH_EDEFAULT = 151.0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected double width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double HEIGHT_EDEFAULT = 101.0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected double height = HEIGHT_EDEFAULT;

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
	 * The cached value of the '{@link #getSubgraph() <em>Subgraph</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubgraph()
	 * @generated
	 * @ordered
	 */
	protected GModel subgraph;

	/**
	 * The default value of the '{@link #getNodeType() <em>Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeType()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_TYPE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getNodeType() <em>Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeType()
	 * @generated
	 * @ordered
	 */
	protected String nodeType = NODE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUniqueId() <em>Unique Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueId()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIQUE_ID_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getUniqueId() <em>Unique Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueId()
	 * @generated
	 * @ordered
	 */
	protected String uniqueId = UNIQUE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoreUid() <em>Core Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreUid()
	 * @generated
	 * @ordered
	 */
	protected static final String CORE_UID_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getCoreUid() <em>Core Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreUid()
	 * @generated
	 * @ordered
	 */
	protected String coreUid = CORE_UID_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = "0xffffffff";

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected String color = COLOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected GCategory category;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected GGroup group;

	/**
	 * The default value of the '{@link #getActivationType() <em>Activation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationType()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVATION_TYPE_EDEFAULT = "DIRECT";

	/**
	 * The cached value of the '{@link #getActivationType() <em>Activation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationType()
	 * @generated
	 * @ordered
	 */
	protected String activationType = ACTIVATION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphPackage.Literals.GNODE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GNODE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GNODE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setX(double newX) {
		double oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GNODE__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setY(double newY) {
		double oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GNODE__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(double newWidth) {
		double oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GNODE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeight(double newHeight) {
		double oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GNODE__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GModel getSubgraph() {
		return subgraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubgraph(GModel newSubgraph, NotificationChain msgs) {
		GModel oldSubgraph = subgraph;
		subgraph = newSubgraph;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphPackage.GNODE__SUBGRAPH, oldSubgraph, newSubgraph);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubgraph(GModel newSubgraph) {
		if (newSubgraph != subgraph) {
			NotificationChain msgs = null;
			if (subgraph != null)
				msgs = ((InternalEObject)subgraph).eInverseRemove(this, GraphPackage.GMODEL__SUPERGRAPH, GModel.class, msgs);
			if (newSubgraph != null)
				msgs = ((InternalEObject)newSubgraph).eInverseAdd(this, GraphPackage.GMODEL__SUPERGRAPH, GModel.class, msgs);
			msgs = basicSetSubgraph(newSubgraph, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GNODE__SUBGRAPH, newSubgraph, newSubgraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNodeType() {
		return nodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNodeType(String newNodeType) {
		String oldNodeType = nodeType;
		nodeType = newNodeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GNODE__NODE_TYPE, oldNodeType, nodeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GNODE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GNODE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUniqueId() {
		return uniqueId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUniqueId(String newUniqueId) {
		String oldUniqueId = uniqueId;
		uniqueId = newUniqueId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GNODE__UNIQUE_ID, oldUniqueId, uniqueId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCoreUid() {
		return coreUid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoreUid(String newCoreUid) {
		String oldCoreUid = coreUid;
		coreUid = newCoreUid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GNODE__CORE_UID, oldCoreUid, coreUid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColor(String newColor) {
		String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GNODE__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GCategory getCategory() {
		if (category != null && category.eIsProxy()) {
			InternalEObject oldCategory = (InternalEObject)category;
			category = (GCategory)eResolveProxy(oldCategory);
			if (category != oldCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphPackage.GNODE__CATEGORY, oldCategory, category));
			}
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GCategory basicGetCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategory(GCategory newCategory) {
		GCategory oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GNODE__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GGroup getGroup() {
		if (group != null && group.eIsProxy()) {
			InternalEObject oldGroup = (InternalEObject)group;
			group = (GGroup)eResolveProxy(oldGroup);
			if (group != oldGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphPackage.GNODE__GROUP, oldGroup, group));
			}
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GGroup basicGetGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroup(GGroup newGroup) {
		GGroup oldGroup = group;
		group = newGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GNODE__GROUP, oldGroup, group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getActivationType() {
		return activationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivationType(String newActivationType) {
		String oldActivationType = activationType;
		activationType = newActivationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GNODE__ACTIVATION_TYPE, oldActivationType, activationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphPackage.GNODE__SUBGRAPH:
				if (subgraph != null)
					msgs = ((InternalEObject)subgraph).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphPackage.GNODE__SUBGRAPH, null, msgs);
				return basicSetSubgraph((GModel)otherEnd, msgs);
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
			case GraphPackage.GNODE__SUBGRAPH:
				return basicSetSubgraph(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphPackage.GNODE__X:
				return getX();
			case GraphPackage.GNODE__Y:
				return getY();
			case GraphPackage.GNODE__WIDTH:
				return getWidth();
			case GraphPackage.GNODE__HEIGHT:
				return getHeight();
			case GraphPackage.GNODE__ID:
				return getId();
			case GraphPackage.GNODE__TYPE:
				return getType();
			case GraphPackage.GNODE__SUBGRAPH:
				return getSubgraph();
			case GraphPackage.GNODE__NODE_TYPE:
				return getNodeType();
			case GraphPackage.GNODE__TITLE:
				return getTitle();
			case GraphPackage.GNODE__DESCRIPTION:
				return getDescription();
			case GraphPackage.GNODE__UNIQUE_ID:
				return getUniqueId();
			case GraphPackage.GNODE__CORE_UID:
				return getCoreUid();
			case GraphPackage.GNODE__COLOR:
				return getColor();
			case GraphPackage.GNODE__CATEGORY:
				if (resolve) return getCategory();
				return basicGetCategory();
			case GraphPackage.GNODE__GROUP:
				if (resolve) return getGroup();
				return basicGetGroup();
			case GraphPackage.GNODE__ACTIVATION_TYPE:
				return getActivationType();
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
			case GraphPackage.GNODE__X:
				setX((Double)newValue);
				return;
			case GraphPackage.GNODE__Y:
				setY((Double)newValue);
				return;
			case GraphPackage.GNODE__WIDTH:
				setWidth((Double)newValue);
				return;
			case GraphPackage.GNODE__HEIGHT:
				setHeight((Double)newValue);
				return;
			case GraphPackage.GNODE__ID:
				setId((String)newValue);
				return;
			case GraphPackage.GNODE__TYPE:
				setType((String)newValue);
				return;
			case GraphPackage.GNODE__SUBGRAPH:
				setSubgraph((GModel)newValue);
				return;
			case GraphPackage.GNODE__NODE_TYPE:
				setNodeType((String)newValue);
				return;
			case GraphPackage.GNODE__TITLE:
				setTitle((String)newValue);
				return;
			case GraphPackage.GNODE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case GraphPackage.GNODE__UNIQUE_ID:
				setUniqueId((String)newValue);
				return;
			case GraphPackage.GNODE__CORE_UID:
				setCoreUid((String)newValue);
				return;
			case GraphPackage.GNODE__COLOR:
				setColor((String)newValue);
				return;
			case GraphPackage.GNODE__CATEGORY:
				setCategory((GCategory)newValue);
				return;
			case GraphPackage.GNODE__GROUP:
				setGroup((GGroup)newValue);
				return;
			case GraphPackage.GNODE__ACTIVATION_TYPE:
				setActivationType((String)newValue);
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
			case GraphPackage.GNODE__X:
				setX(X_EDEFAULT);
				return;
			case GraphPackage.GNODE__Y:
				setY(Y_EDEFAULT);
				return;
			case GraphPackage.GNODE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case GraphPackage.GNODE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case GraphPackage.GNODE__ID:
				setId(ID_EDEFAULT);
				return;
			case GraphPackage.GNODE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case GraphPackage.GNODE__SUBGRAPH:
				setSubgraph((GModel)null);
				return;
			case GraphPackage.GNODE__NODE_TYPE:
				setNodeType(NODE_TYPE_EDEFAULT);
				return;
			case GraphPackage.GNODE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case GraphPackage.GNODE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case GraphPackage.GNODE__UNIQUE_ID:
				setUniqueId(UNIQUE_ID_EDEFAULT);
				return;
			case GraphPackage.GNODE__CORE_UID:
				setCoreUid(CORE_UID_EDEFAULT);
				return;
			case GraphPackage.GNODE__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case GraphPackage.GNODE__CATEGORY:
				setCategory((GCategory)null);
				return;
			case GraphPackage.GNODE__GROUP:
				setGroup((GGroup)null);
				return;
			case GraphPackage.GNODE__ACTIVATION_TYPE:
				setActivationType(ACTIVATION_TYPE_EDEFAULT);
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
			case GraphPackage.GNODE__X:
				return x != X_EDEFAULT;
			case GraphPackage.GNODE__Y:
				return y != Y_EDEFAULT;
			case GraphPackage.GNODE__WIDTH:
				return width != WIDTH_EDEFAULT;
			case GraphPackage.GNODE__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case GraphPackage.GNODE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GraphPackage.GNODE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case GraphPackage.GNODE__SUBGRAPH:
				return subgraph != null;
			case GraphPackage.GNODE__NODE_TYPE:
				return NODE_TYPE_EDEFAULT == null ? nodeType != null : !NODE_TYPE_EDEFAULT.equals(nodeType);
			case GraphPackage.GNODE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case GraphPackage.GNODE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case GraphPackage.GNODE__UNIQUE_ID:
				return UNIQUE_ID_EDEFAULT == null ? uniqueId != null : !UNIQUE_ID_EDEFAULT.equals(uniqueId);
			case GraphPackage.GNODE__CORE_UID:
				return CORE_UID_EDEFAULT == null ? coreUid != null : !CORE_UID_EDEFAULT.equals(coreUid);
			case GraphPackage.GNODE__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case GraphPackage.GNODE__CATEGORY:
				return category != null;
			case GraphPackage.GNODE__GROUP:
				return group != null;
			case GraphPackage.GNODE__ACTIVATION_TYPE:
				return ACTIVATION_TYPE_EDEFAULT == null ? activationType != null : !ACTIVATION_TYPE_EDEFAULT.equals(activationType);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == GResizable.class) {
			switch (derivedFeatureID) {
				case GraphPackage.GNODE__X: return GraphPackage.GRESIZABLE__X;
				case GraphPackage.GNODE__Y: return GraphPackage.GRESIZABLE__Y;
				case GraphPackage.GNODE__WIDTH: return GraphPackage.GRESIZABLE__WIDTH;
				case GraphPackage.GNODE__HEIGHT: return GraphPackage.GRESIZABLE__HEIGHT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == GResizable.class) {
			switch (baseFeatureID) {
				case GraphPackage.GRESIZABLE__X: return GraphPackage.GNODE__X;
				case GraphPackage.GRESIZABLE__Y: return GraphPackage.GNODE__Y;
				case GraphPackage.GRESIZABLE__WIDTH: return GraphPackage.GNODE__WIDTH;
				case GraphPackage.GRESIZABLE__HEIGHT: return GraphPackage.GNODE__HEIGHT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", id: ");
		result.append(id);
		result.append(", type: ");
		result.append(type);
		result.append(", nodeType: ");
		result.append(nodeType);
		result.append(", title: ");
		result.append(title);
		result.append(", description: ");
		result.append(description);
		result.append(", uniqueId: ");
		result.append(uniqueId);
		result.append(", coreUid: ");
		result.append(coreUid);
		result.append(", color: ");
		result.append(color);
		result.append(", activationType: ");
		result.append(activationType);
		result.append(')');
		return result.toString();
	}

} //GNodeImpl
