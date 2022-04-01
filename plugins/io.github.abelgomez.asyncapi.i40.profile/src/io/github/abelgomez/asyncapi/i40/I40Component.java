/**
 */
package io.github.abelgomez.asyncapi.i40;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.asyncapi.i40.I40Component#getBase_Component <em>Base Component</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.i40.I40Component#getBroker <em>Broker</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.asyncapi.i40.I40Package#getI40Component()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='I4.0 Component'"
 * @generated
 */
public interface I40Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Component</em>' reference.
	 * @see #setBase_Component(Component)
	 * @see io.github.abelgomez.asyncapi.i40.I40Package#getI40Component_Base_Component()
	 * @model ordered="false"
	 * @generated
	 */
	Component getBase_Component();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.asyncapi.i40.I40Component#getBase_Component <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Component</em>' reference.
	 * @see #getBase_Component()
	 * @generated
	 */
	void setBase_Component(Component value);

	/**
	 * Returns the value of the '<em><b>Broker</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Broker</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Broker</em>' reference.
	 * @see #setBroker(Broker)
	 * @see io.github.abelgomez.asyncapi.i40.I40Package#getI40Component_Broker()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Broker getBroker();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.asyncapi.i40.I40Component#getBroker <em>Broker</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Broker</em>' reference.
	 * @see #getBroker()
	 * @generated
	 */
	void setBroker(Broker value);

} // I40Component
