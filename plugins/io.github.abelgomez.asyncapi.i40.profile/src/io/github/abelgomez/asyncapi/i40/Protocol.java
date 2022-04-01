/**
 */
package io.github.abelgomez.asyncapi.i40;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Protocol</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see io.github.abelgomez.asyncapi.i40.I40Package#getProtocol()
 * @model
 * @generated
 */
public enum Protocol implements Enumerator {
	/**
	 * The '<em><b>Amqp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMQP_VALUE
	 * @generated
	 * @ordered
	 */
	AMQP(0, "amqp", "amqp"),

	/**
	 * The '<em><b>Amqps</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMQPS_VALUE
	 * @generated
	 * @ordered
	 */
	AMQPS(1, "amqps", "amqps"),

	/**
	 * The '<em><b>Mqtt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MQTT_VALUE
	 * @generated
	 * @ordered
	 */
	MQTT(2, "mqtt", "mqtt"),

	/**
	 * The '<em><b>Mqtts</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MQTTS_VALUE
	 * @generated
	 * @ordered
	 */
	MQTTS(3, "mqtts", "mqtts"),

	/**
	 * The '<em><b>Ws</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WS_VALUE
	 * @generated
	 * @ordered
	 */
	WS(4, "ws", "ws"),

	/**
	 * The '<em><b>Wss</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WSS_VALUE
	 * @generated
	 * @ordered
	 */
	WSS(5, "wss", "wss"),

	/**
	 * The '<em><b>Stomp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOMP_VALUE
	 * @generated
	 * @ordered
	 */
	STOMP(6, "stomp", "stomp"),

	/**
	 * The '<em><b>Stomps</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOMPS_VALUE
	 * @generated
	 * @ordered
	 */
	STOMPS(7, "stomps", "stomps");

	/**
	 * The '<em><b>Amqp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMQP
	 * @model name="amqp"
	 * @generated
	 * @ordered
	 */
	public static final int AMQP_VALUE = 0;

	/**
	 * The '<em><b>Amqps</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMQPS
	 * @model name="amqps"
	 * @generated
	 * @ordered
	 */
	public static final int AMQPS_VALUE = 1;

	/**
	 * The '<em><b>Mqtt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MQTT
	 * @model name="mqtt"
	 * @generated
	 * @ordered
	 */
	public static final int MQTT_VALUE = 2;

	/**
	 * The '<em><b>Mqtts</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MQTTS
	 * @model name="mqtts"
	 * @generated
	 * @ordered
	 */
	public static final int MQTTS_VALUE = 3;

	/**
	 * The '<em><b>Ws</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WS
	 * @model name="ws"
	 * @generated
	 * @ordered
	 */
	public static final int WS_VALUE = 4;

	/**
	 * The '<em><b>Wss</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WSS
	 * @model name="wss"
	 * @generated
	 * @ordered
	 */
	public static final int WSS_VALUE = 5;

	/**
	 * The '<em><b>Stomp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOMP
	 * @model name="stomp"
	 * @generated
	 * @ordered
	 */
	public static final int STOMP_VALUE = 6;

	/**
	 * The '<em><b>Stomps</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOMPS
	 * @model name="stomps"
	 * @generated
	 * @ordered
	 */
	public static final int STOMPS_VALUE = 7;

	/**
	 * An array of all the '<em><b>Protocol</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Protocol[] VALUES_ARRAY =
		new Protocol[] {
			AMQP,
			AMQPS,
			MQTT,
			MQTTS,
			WS,
			WSS,
			STOMP,
			STOMPS,
		};

	/**
	 * A public read-only list of all the '<em><b>Protocol</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Protocol> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Protocol</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Protocol get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Protocol result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Protocol</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Protocol getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Protocol result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Protocol</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Protocol get(int value) {
		switch (value) {
			case AMQP_VALUE: return AMQP;
			case AMQPS_VALUE: return AMQPS;
			case MQTT_VALUE: return MQTT;
			case MQTTS_VALUE: return MQTTS;
			case WS_VALUE: return WS;
			case WSS_VALUE: return WSS;
			case STOMP_VALUE: return STOMP;
			case STOMPS_VALUE: return STOMPS;
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
	private Protocol(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Protocol
