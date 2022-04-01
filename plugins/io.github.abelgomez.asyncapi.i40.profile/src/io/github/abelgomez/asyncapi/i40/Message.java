/**
 */
package io.github.abelgomez.asyncapi.i40;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.StructuredClassifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.asyncapi.i40.Message#getBase_StructuredClassifier <em>Base Structured Classifier</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.i40.Message#getName <em>Name</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.i40.Message#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.asyncapi.i40.I40Package#getMessage()
 * @model
 * @generated
 */
public interface Message extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Structured Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Structured Classifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Structured Classifier</em>' reference.
	 * @see #setBase_StructuredClassifier(StructuredClassifier)
	 * @see io.github.abelgomez.asyncapi.i40.I40Package#getMessage_Base_StructuredClassifier()
	 * @model ordered="false"
	 * @generated
	 */
	StructuredClassifier getBase_StructuredClassifier();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.asyncapi.i40.Message#getBase_StructuredClassifier <em>Base Structured Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Structured Classifier</em>' reference.
	 * @see #getBase_StructuredClassifier()
	 * @generated
	 */
	void setBase_StructuredClassifier(StructuredClassifier value);

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
	 * @see io.github.abelgomez.asyncapi.i40.I40Package#getMessage_Name()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.asyncapi.i40.Message#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see io.github.abelgomez.asyncapi.i40.I40Package#getMessage_Description()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link io.github.abelgomez.asyncapi.i40.Message#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Message
