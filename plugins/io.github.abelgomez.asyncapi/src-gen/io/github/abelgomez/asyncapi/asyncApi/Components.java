/**
 * generated by Xtext 2.26.0
 */
package io.github.abelgomez.asyncapi.asyncApi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Components</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.Components#getSchemas <em>Schemas</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.Components#getMessages <em>Messages</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.Components#getParameters <em>Parameters</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.Components#getOperationTraits <em>Operation Traits</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.Components#getMessageTraits <em>Message Traits</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.Components#getQosMetrics <em>Qos Metrics</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getComponents()
 * @model
 * @generated
 */
public interface Components extends EObject
{
  /**
   * Returns the value of the '<em><b>Schemas</b></em>' containment reference list.
   * The list contents are of type {@link io.github.abelgomez.asyncapi.asyncApi.NamedSchema}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Schemas</em>' containment reference list.
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getComponents_Schemas()
   * @model containment="true"
   * @generated
   */
  EList<NamedSchema> getSchemas();

  /**
   * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
   * The list contents are of type {@link io.github.abelgomez.asyncapi.asyncApi.NamedMessage}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Messages</em>' containment reference list.
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getComponents_Messages()
   * @model containment="true"
   * @generated
   */
  EList<NamedMessage> getMessages();

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link io.github.abelgomez.asyncapi.asyncApi.NamedParameter}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getComponents_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<NamedParameter> getParameters();

  /**
   * Returns the value of the '<em><b>Operation Traits</b></em>' containment reference list.
   * The list contents are of type {@link io.github.abelgomez.asyncapi.asyncApi.NamedOperationTrait}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation Traits</em>' containment reference list.
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getComponents_OperationTraits()
   * @model containment="true"
   * @generated
   */
  EList<NamedOperationTrait> getOperationTraits();

  /**
   * Returns the value of the '<em><b>Message Traits</b></em>' containment reference list.
   * The list contents are of type {@link io.github.abelgomez.asyncapi.asyncApi.NamedMessageTrait}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Message Traits</em>' containment reference list.
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getComponents_MessageTraits()
   * @model containment="true"
   * @generated
   */
  EList<NamedMessageTrait> getMessageTraits();

  /**
   * Returns the value of the '<em><b>Qos Metrics</b></em>' containment reference list.
   * The list contents are of type {@link io.github.abelgomez.asyncapi.asyncApi.QoSMetric}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qos Metrics</em>' containment reference list.
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getComponents_QosMetrics()
   * @model containment="true"
   * @generated
   */
  EList<QoSMetric> getQosMetrics();

} // Components
