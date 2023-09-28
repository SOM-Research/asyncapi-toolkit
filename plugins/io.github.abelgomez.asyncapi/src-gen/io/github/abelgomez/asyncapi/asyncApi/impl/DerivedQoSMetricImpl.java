/**
 * generated by Xtext 2.26.0
 */
package io.github.abelgomez.asyncapi.asyncApi.impl;

import io.github.abelgomez.asyncapi.asyncApi.AggregationFunction;
import io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage;
import io.github.abelgomez.asyncapi.asyncApi.DerivedQoSMetric;
import io.github.abelgomez.asyncapi.asyncApi.WindowUnit;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Derived Qo SMetric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.DerivedQoSMetricImpl#getWindow <em>Window</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.DerivedQoSMetricImpl#getWindowUnit <em>Window Unit</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.DerivedQoSMetricImpl#getAggregationFunction <em>Aggregation Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DerivedQoSMetricImpl extends QoSMetricImpl implements DerivedQoSMetric
{
  /**
   * The default value of the '{@link #getWindow() <em>Window</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWindow()
   * @generated
   * @ordered
   */
  protected static final String WINDOW_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWindow() <em>Window</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWindow()
   * @generated
   * @ordered
   */
  protected String window = WINDOW_EDEFAULT;

  /**
   * The default value of the '{@link #getWindowUnit() <em>Window Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWindowUnit()
   * @generated
   * @ordered
   */
  protected static final WindowUnit WINDOW_UNIT_EDEFAULT = WindowUnit.SECONDS;

  /**
   * The cached value of the '{@link #getWindowUnit() <em>Window Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWindowUnit()
   * @generated
   * @ordered
   */
  protected WindowUnit windowUnit = WINDOW_UNIT_EDEFAULT;

  /**
   * The default value of the '{@link #getAggregationFunction() <em>Aggregation Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAggregationFunction()
   * @generated
   * @ordered
   */
  protected static final AggregationFunction AGGREGATION_FUNCTION_EDEFAULT = AggregationFunction.AVG;

  /**
   * The cached value of the '{@link #getAggregationFunction() <em>Aggregation Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAggregationFunction()
   * @generated
   * @ordered
   */
  protected AggregationFunction aggregationFunction = AGGREGATION_FUNCTION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DerivedQoSMetricImpl()
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
    return AsyncApiPackage.Literals.DERIVED_QO_SMETRIC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getWindow()
  {
    return window;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setWindow(String newWindow)
  {
    String oldWindow = window;
    window = newWindow;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.DERIVED_QO_SMETRIC__WINDOW, oldWindow, window));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WindowUnit getWindowUnit()
  {
    return windowUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setWindowUnit(WindowUnit newWindowUnit)
  {
    WindowUnit oldWindowUnit = windowUnit;
    windowUnit = newWindowUnit == null ? WINDOW_UNIT_EDEFAULT : newWindowUnit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.DERIVED_QO_SMETRIC__WINDOW_UNIT, oldWindowUnit, windowUnit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AggregationFunction getAggregationFunction()
  {
    return aggregationFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAggregationFunction(AggregationFunction newAggregationFunction)
  {
    AggregationFunction oldAggregationFunction = aggregationFunction;
    aggregationFunction = newAggregationFunction == null ? AGGREGATION_FUNCTION_EDEFAULT : newAggregationFunction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.DERIVED_QO_SMETRIC__AGGREGATION_FUNCTION, oldAggregationFunction, aggregationFunction));
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
      case AsyncApiPackage.DERIVED_QO_SMETRIC__WINDOW:
        return getWindow();
      case AsyncApiPackage.DERIVED_QO_SMETRIC__WINDOW_UNIT:
        return getWindowUnit();
      case AsyncApiPackage.DERIVED_QO_SMETRIC__AGGREGATION_FUNCTION:
        return getAggregationFunction();
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
      case AsyncApiPackage.DERIVED_QO_SMETRIC__WINDOW:
        setWindow((String)newValue);
        return;
      case AsyncApiPackage.DERIVED_QO_SMETRIC__WINDOW_UNIT:
        setWindowUnit((WindowUnit)newValue);
        return;
      case AsyncApiPackage.DERIVED_QO_SMETRIC__AGGREGATION_FUNCTION:
        setAggregationFunction((AggregationFunction)newValue);
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
      case AsyncApiPackage.DERIVED_QO_SMETRIC__WINDOW:
        setWindow(WINDOW_EDEFAULT);
        return;
      case AsyncApiPackage.DERIVED_QO_SMETRIC__WINDOW_UNIT:
        setWindowUnit(WINDOW_UNIT_EDEFAULT);
        return;
      case AsyncApiPackage.DERIVED_QO_SMETRIC__AGGREGATION_FUNCTION:
        setAggregationFunction(AGGREGATION_FUNCTION_EDEFAULT);
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
      case AsyncApiPackage.DERIVED_QO_SMETRIC__WINDOW:
        return WINDOW_EDEFAULT == null ? window != null : !WINDOW_EDEFAULT.equals(window);
      case AsyncApiPackage.DERIVED_QO_SMETRIC__WINDOW_UNIT:
        return windowUnit != WINDOW_UNIT_EDEFAULT;
      case AsyncApiPackage.DERIVED_QO_SMETRIC__AGGREGATION_FUNCTION:
        return aggregationFunction != AGGREGATION_FUNCTION_EDEFAULT;
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
    result.append(" (window: ");
    result.append(window);
    result.append(", windowUnit: ");
    result.append(windowUnit);
    result.append(", aggregationFunction: ");
    result.append(aggregationFunction);
    result.append(')');
    return result.toString();
  }

} //DerivedQoSMetricImpl
