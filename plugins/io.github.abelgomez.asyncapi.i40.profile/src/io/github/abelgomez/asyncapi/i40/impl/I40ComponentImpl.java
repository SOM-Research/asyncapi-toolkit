/**
 */
package io.github.abelgomez.asyncapi.i40.impl;

import io.github.abelgomez.asyncapi.i40.Broker;
import io.github.abelgomez.asyncapi.i40.I40Component;
import io.github.abelgomez.asyncapi.i40.I40Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.asyncapi.i40.impl.I40ComponentImpl#getBase_Component <em>Base Component</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.i40.impl.I40ComponentImpl#getBroker <em>Broker</em>}</li>
 * </ul>
 *
 * @generated
 */
public class I40ComponentImpl extends MinimalEObjectImpl.Container implements I40Component {
	/**
	 * The cached value of the '{@link #getBase_Component() <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Component()
	 * @generated
	 * @ordered
	 */
	protected Component base_Component;

	/**
	 * The cached value of the '{@link #getBroker() <em>Broker</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBroker()
	 * @generated
	 * @ordered
	 */
	protected Broker broker;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected I40ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return I40Package.Literals.I40_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getBase_Component() {
		if (base_Component != null && base_Component.eIsProxy()) {
			InternalEObject oldBase_Component = (InternalEObject)base_Component;
			base_Component = (Component)eResolveProxy(oldBase_Component);
			if (base_Component != oldBase_Component) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, I40Package.I40_COMPONENT__BASE_COMPONENT, oldBase_Component, base_Component));
			}
		}
		return base_Component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetBase_Component() {
		return base_Component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Component(Component newBase_Component) {
		Component oldBase_Component = base_Component;
		base_Component = newBase_Component;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, I40Package.I40_COMPONENT__BASE_COMPONENT, oldBase_Component, base_Component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Broker getBroker() {
		if (broker != null && broker.eIsProxy()) {
			InternalEObject oldBroker = (InternalEObject)broker;
			broker = (Broker)eResolveProxy(oldBroker);
			if (broker != oldBroker) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, I40Package.I40_COMPONENT__BROKER, oldBroker, broker));
			}
		}
		return broker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Broker basicGetBroker() {
		return broker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBroker(Broker newBroker) {
		Broker oldBroker = broker;
		broker = newBroker;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, I40Package.I40_COMPONENT__BROKER, oldBroker, broker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case I40Package.I40_COMPONENT__BASE_COMPONENT:
				if (resolve) return getBase_Component();
				return basicGetBase_Component();
			case I40Package.I40_COMPONENT__BROKER:
				if (resolve) return getBroker();
				return basicGetBroker();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case I40Package.I40_COMPONENT__BASE_COMPONENT:
				setBase_Component((Component)newValue);
				return;
			case I40Package.I40_COMPONENT__BROKER:
				setBroker((Broker)newValue);
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
			case I40Package.I40_COMPONENT__BASE_COMPONENT:
				setBase_Component((Component)null);
				return;
			case I40Package.I40_COMPONENT__BROKER:
				setBroker((Broker)null);
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
			case I40Package.I40_COMPONENT__BASE_COMPONENT:
				return base_Component != null;
			case I40Package.I40_COMPONENT__BROKER:
				return broker != null;
		}
		return super.eIsSet(featureID);
	}

} //I40ComponentImpl
