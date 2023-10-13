/**
 * generated by Xtext 2.26.0
 */
package io.github.abelgomez.asyncapi.asyncApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Boolean</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getBoolean()
 * @model
 * @generated
 */
public enum Boolean implements Enumerator
{
  /**
   * The '<em><b>false</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #_FALSE_VALUE
   * @generated
   * @ordered
   */
  _FALSE(0, "_false", "false"),

  /**
   * The '<em><b>true</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #_TRUE_VALUE
   * @generated
   * @ordered
   */
  _TRUE(1, "_true", "true");

  /**
   * The '<em><b>false</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #_FALSE
   * @model name="_false" literal="false"
   * @generated
   * @ordered
   */
  public static final int _FALSE_VALUE = 0;

  /**
   * The '<em><b>true</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #_TRUE
   * @model name="_true" literal="true"
   * @generated
   * @ordered
   */
  public static final int _TRUE_VALUE = 1;

  /**
   * An array of all the '<em><b>Boolean</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Boolean[] VALUES_ARRAY =
    new Boolean[]
    {
      _FALSE,
      _TRUE,
    };

  /**
   * A public read-only list of all the '<em><b>Boolean</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Boolean> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Boolean</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Boolean get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Boolean result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Boolean</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Boolean getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Boolean result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Boolean</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Boolean get(int value)
  {
    switch (value)
    {
      case _FALSE_VALUE: return _FALSE;
      case _TRUE_VALUE: return _TRUE;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Boolean(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Boolean
