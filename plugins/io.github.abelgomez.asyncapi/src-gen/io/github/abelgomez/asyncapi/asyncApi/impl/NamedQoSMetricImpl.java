/**
 * generated by Xtext 2.26.0
 */
package io.github.abelgomez.asyncapi.asyncApi.impl;

import io.github.abelgomez.asyncapi.asyncApi.AbstractQoSMetric;
import io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage;
import io.github.abelgomez.asyncapi.asyncApi.NamedQoSMetric;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Qo SMetric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.NamedQoSMetricImpl#getName <em>Name</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.NamedQoSMetricImpl#getQosMetric <em>Qos Metric</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamedQoSMetricImpl extends MinimalEObjectImpl.Container implements NamedQoSMetric
{
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
   * The cached value of the '{@link #getQosMetric() <em>Qos Metric</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQosMetric()
   * @generated
   * @ordered
   */
  protected AbstractQoSMetric qosMetric;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NamedQoSMetricImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AsyncApiPackage.Literals.NAMED_QO_SMETRIC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.NAMED_QO_SMETRIC__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AbstractQoSMetric getQosMetric()
  {
    return qosMetric;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQosMetric(AbstractQoSMetric newQosMetric, NotificationChain msgs)
  {
    AbstractQoSMetric oldQosMetric = qosMetric;
    qosMetric = newQosMetric;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsyncApiPackage.NAMED_QO_SMETRIC__QOS_METRIC, oldQosMetric, newQosMetric);
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
  public void setQosMetric(AbstractQoSMetric newQosMetric)
  {
    if (newQosMetric != qosMetric)
    {
      NotificationChain msgs = null;
      if (qosMetric != null)
        msgs = ((InternalEObject)qosMetric).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsyncApiPackage.NAMED_QO_SMETRIC__QOS_METRIC, null, msgs);
      if (newQosMetric != null)
        msgs = ((InternalEObject)newQosMetric).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsyncApiPackage.NAMED_QO_SMETRIC__QOS_METRIC, null, msgs);
      msgs = basicSetQosMetric(newQosMetric, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.NAMED_QO_SMETRIC__QOS_METRIC, newQosMetric, newQosMetric));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AsyncApiPackage.NAMED_QO_SMETRIC__QOS_METRIC:
        return basicSetQosMetric(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AsyncApiPackage.NAMED_QO_SMETRIC__NAME:
        return getName();
      case AsyncApiPackage.NAMED_QO_SMETRIC__QOS_METRIC:
        return getQosMetric();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AsyncApiPackage.NAMED_QO_SMETRIC__NAME:
        setName((String)newValue);
        return;
      case AsyncApiPackage.NAMED_QO_SMETRIC__QOS_METRIC:
        setQosMetric((AbstractQoSMetric)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AsyncApiPackage.NAMED_QO_SMETRIC__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AsyncApiPackage.NAMED_QO_SMETRIC__QOS_METRIC:
        setQosMetric((AbstractQoSMetric)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AsyncApiPackage.NAMED_QO_SMETRIC__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AsyncApiPackage.NAMED_QO_SMETRIC__QOS_METRIC:
        return qosMetric != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //NamedQoSMetricImpl
