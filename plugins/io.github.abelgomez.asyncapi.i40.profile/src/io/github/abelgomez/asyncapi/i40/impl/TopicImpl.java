/**
 */
package io.github.abelgomez.asyncapi.i40.impl;

import io.github.abelgomez.asyncapi.i40.I40Package;
import io.github.abelgomez.asyncapi.i40.Message;
import io.github.abelgomez.asyncapi.i40.Parameter;
import io.github.abelgomez.asyncapi.i40.Topic;

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

import org.eclipse.uml2.uml.Signal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.asyncapi.i40.impl.TopicImpl#getName <em>Name</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.i40.impl.TopicImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.i40.impl.TopicImpl#getBase_Signal <em>Base Signal</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.i40.impl.TopicImpl#getPublishOpId <em>Publish Op Id</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.i40.impl.TopicImpl#getSubscribeOpId <em>Subscribe Op Id</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.i40.impl.TopicImpl#getPublishes <em>Publishes</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.i40.impl.TopicImpl#getSubscribes <em>Subscribes</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.i40.impl.TopicImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopicImpl extends MinimalEObjectImpl.Container implements Topic {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getBase_Signal() <em>Base Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Signal()
	 * @generated
	 * @ordered
	 */
	protected Signal base_Signal;

	/**
	 * The default value of the '{@link #getPublishOpId() <em>Publish Op Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishOpId()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLISH_OP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublishOpId() <em>Publish Op Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishOpId()
	 * @generated
	 * @ordered
	 */
	protected String publishOpId = PUBLISH_OP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubscribeOpId() <em>Subscribe Op Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribeOpId()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSCRIBE_OP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubscribeOpId() <em>Subscribe Op Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribeOpId()
	 * @generated
	 * @ordered
	 */
	protected String subscribeOpId = SUBSCRIBE_OP_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPublishes() <em>Publishes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishes()
	 * @generated
	 * @ordered
	 */
	protected Message publishes;

	/**
	 * The cached value of the '{@link #getSubscribes() <em>Subscribes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribes()
	 * @generated
	 * @ordered
	 */
	protected Message subscribes;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return I40Package.Literals.TOPIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, I40Package.TOPIC__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, I40Package.TOPIC__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal getBase_Signal() {
		if (base_Signal != null && base_Signal.eIsProxy()) {
			InternalEObject oldBase_Signal = (InternalEObject)base_Signal;
			base_Signal = (Signal)eResolveProxy(oldBase_Signal);
			if (base_Signal != oldBase_Signal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, I40Package.TOPIC__BASE_SIGNAL, oldBase_Signal, base_Signal));
			}
		}
		return base_Signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal basicGetBase_Signal() {
		return base_Signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Signal(Signal newBase_Signal) {
		Signal oldBase_Signal = base_Signal;
		base_Signal = newBase_Signal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, I40Package.TOPIC__BASE_SIGNAL, oldBase_Signal, base_Signal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublishOpId() {
		return publishOpId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublishOpId(String newPublishOpId) {
		String oldPublishOpId = publishOpId;
		publishOpId = newPublishOpId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, I40Package.TOPIC__PUBLISH_OP_ID, oldPublishOpId, publishOpId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubscribeOpId() {
		return subscribeOpId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscribeOpId(String newSubscribeOpId) {
		String oldSubscribeOpId = subscribeOpId;
		subscribeOpId = newSubscribeOpId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, I40Package.TOPIC__SUBSCRIBE_OP_ID, oldSubscribeOpId, subscribeOpId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getPublishes() {
		if (publishes != null && publishes.eIsProxy()) {
			InternalEObject oldPublishes = (InternalEObject)publishes;
			publishes = (Message)eResolveProxy(oldPublishes);
			if (publishes != oldPublishes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, I40Package.TOPIC__PUBLISHES, oldPublishes, publishes));
			}
		}
		return publishes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetPublishes() {
		return publishes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublishes(Message newPublishes) {
		Message oldPublishes = publishes;
		publishes = newPublishes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, I40Package.TOPIC__PUBLISHES, oldPublishes, publishes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getSubscribes() {
		if (subscribes != null && subscribes.eIsProxy()) {
			InternalEObject oldSubscribes = (InternalEObject)subscribes;
			subscribes = (Message)eResolveProxy(oldSubscribes);
			if (subscribes != oldSubscribes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, I40Package.TOPIC__SUBSCRIBES, oldSubscribes, subscribes));
			}
		}
		return subscribes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetSubscribes() {
		return subscribes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscribes(Message newSubscribes) {
		Message oldSubscribes = subscribes;
		subscribes = newSubscribes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, I40Package.TOPIC__SUBSCRIBES, oldSubscribes, subscribes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, I40Package.TOPIC__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case I40Package.TOPIC__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case I40Package.TOPIC__NAME:
				return getName();
			case I40Package.TOPIC__PARAMETERS:
				return getParameters();
			case I40Package.TOPIC__BASE_SIGNAL:
				if (resolve) return getBase_Signal();
				return basicGetBase_Signal();
			case I40Package.TOPIC__PUBLISH_OP_ID:
				return getPublishOpId();
			case I40Package.TOPIC__SUBSCRIBE_OP_ID:
				return getSubscribeOpId();
			case I40Package.TOPIC__PUBLISHES:
				if (resolve) return getPublishes();
				return basicGetPublishes();
			case I40Package.TOPIC__SUBSCRIBES:
				if (resolve) return getSubscribes();
				return basicGetSubscribes();
			case I40Package.TOPIC__DESCRIPTION:
				return getDescription();
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
			case I40Package.TOPIC__NAME:
				setName((String)newValue);
				return;
			case I40Package.TOPIC__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case I40Package.TOPIC__BASE_SIGNAL:
				setBase_Signal((Signal)newValue);
				return;
			case I40Package.TOPIC__PUBLISH_OP_ID:
				setPublishOpId((String)newValue);
				return;
			case I40Package.TOPIC__SUBSCRIBE_OP_ID:
				setSubscribeOpId((String)newValue);
				return;
			case I40Package.TOPIC__PUBLISHES:
				setPublishes((Message)newValue);
				return;
			case I40Package.TOPIC__SUBSCRIBES:
				setSubscribes((Message)newValue);
				return;
			case I40Package.TOPIC__DESCRIPTION:
				setDescription((String)newValue);
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
			case I40Package.TOPIC__NAME:
				setName(NAME_EDEFAULT);
				return;
			case I40Package.TOPIC__PARAMETERS:
				getParameters().clear();
				return;
			case I40Package.TOPIC__BASE_SIGNAL:
				setBase_Signal((Signal)null);
				return;
			case I40Package.TOPIC__PUBLISH_OP_ID:
				setPublishOpId(PUBLISH_OP_ID_EDEFAULT);
				return;
			case I40Package.TOPIC__SUBSCRIBE_OP_ID:
				setSubscribeOpId(SUBSCRIBE_OP_ID_EDEFAULT);
				return;
			case I40Package.TOPIC__PUBLISHES:
				setPublishes((Message)null);
				return;
			case I40Package.TOPIC__SUBSCRIBES:
				setSubscribes((Message)null);
				return;
			case I40Package.TOPIC__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case I40Package.TOPIC__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case I40Package.TOPIC__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case I40Package.TOPIC__BASE_SIGNAL:
				return base_Signal != null;
			case I40Package.TOPIC__PUBLISH_OP_ID:
				return PUBLISH_OP_ID_EDEFAULT == null ? publishOpId != null : !PUBLISH_OP_ID_EDEFAULT.equals(publishOpId);
			case I40Package.TOPIC__SUBSCRIBE_OP_ID:
				return SUBSCRIBE_OP_ID_EDEFAULT == null ? subscribeOpId != null : !SUBSCRIBE_OP_ID_EDEFAULT.equals(subscribeOpId);
			case I40Package.TOPIC__PUBLISHES:
				return publishes != null;
			case I40Package.TOPIC__SUBSCRIBES:
				return subscribes != null;
			case I40Package.TOPIC__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", publishOpId: ");
		result.append(publishOpId);
		result.append(", subscribeOpId: ");
		result.append(subscribeOpId);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //TopicImpl
