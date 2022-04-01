/**
 */
package io.github.abelgomez.asyncapi.i40;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Signal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.asyncapi.i40.Topic#getName <em>Name</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.i40.Topic#getParameters <em>Parameters</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.i40.Topic#getBase_Signal <em>Base Signal</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.i40.Topic#getPublishOpId <em>Publish Op Id</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.i40.Topic#getSubscribeOpId <em>Subscribe Op Id</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.i40.Topic#getPublishes <em>Publishes</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.i40.Topic#getSubscribes <em>Subscribes</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.i40.Topic#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.asyncapi.i40.I40Package#getTopic()
 * @model
 * @generated
 */
public interface Topic extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see io.github.abelgomez.asyncapi.i40.I40Package#getTopic_Name()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.asyncapi.i40.Topic#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link io.github.abelgomez.asyncapi.i40.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see io.github.abelgomez.asyncapi.i40.I40Package#getTopic_Parameters()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Base Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Signal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Signal</em>' reference.
	 * @see #setBase_Signal(Signal)
	 * @see io.github.abelgomez.asyncapi.i40.I40Package#getTopic_Base_Signal()
	 * @model ordered="false"
	 * @generated
	 */
	Signal getBase_Signal();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.asyncapi.i40.Topic#getBase_Signal <em>Base Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Signal</em>' reference.
	 * @see #getBase_Signal()
	 * @generated
	 */
	void setBase_Signal(Signal value);

	/**
	 * Returns the value of the '<em><b>Publish Op Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publish Op Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publish Op Id</em>' attribute.
	 * @see #setPublishOpId(String)
	 * @see io.github.abelgomez.asyncapi.i40.I40Package#getTopic_PublishOpId()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getPublishOpId();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.asyncapi.i40.Topic#getPublishOpId <em>Publish Op Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publish Op Id</em>' attribute.
	 * @see #getPublishOpId()
	 * @generated
	 */
	void setPublishOpId(String value);

	/**
	 * Returns the value of the '<em><b>Subscribe Op Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscribe Op Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribe Op Id</em>' attribute.
	 * @see #setSubscribeOpId(String)
	 * @see io.github.abelgomez.asyncapi.i40.I40Package#getTopic_SubscribeOpId()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getSubscribeOpId();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.asyncapi.i40.Topic#getSubscribeOpId <em>Subscribe Op Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscribe Op Id</em>' attribute.
	 * @see #getSubscribeOpId()
	 * @generated
	 */
	void setSubscribeOpId(String value);

	/**
	 * Returns the value of the '<em><b>Publishes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publishes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publishes</em>' reference.
	 * @see #setPublishes(Message)
	 * @see io.github.abelgomez.asyncapi.i40.I40Package#getTopic_Publishes()
	 * @model ordered="false"
	 * @generated
	 */
	Message getPublishes();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.asyncapi.i40.Topic#getPublishes <em>Publishes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publishes</em>' reference.
	 * @see #getPublishes()
	 * @generated
	 */
	void setPublishes(Message value);

	/**
	 * Returns the value of the '<em><b>Subscribes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscribes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribes</em>' reference.
	 * @see #setSubscribes(Message)
	 * @see io.github.abelgomez.asyncapi.i40.I40Package#getTopic_Subscribes()
	 * @model ordered="false"
	 * @generated
	 */
	Message getSubscribes();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.asyncapi.i40.Topic#getSubscribes <em>Subscribes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscribes</em>' reference.
	 * @see #getSubscribes()
	 * @generated
	 */
	void setSubscribes(Message value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see io.github.abelgomez.asyncapi.i40.I40Package#getTopic_Description()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.asyncapi.i40.Topic#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Topic
