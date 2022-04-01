/**
 */
package io.github.abelgomez.asyncapi.i40;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see io.github.abelgomez.asyncapi.i40.I40Factory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='I40Profile'"
 * @generated
 */
public interface I40Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "i40";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://io.github.abelgomez/profiles/I4.0/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "i40";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	I40Package eINSTANCE = io.github.abelgomez.asyncapi.i40.impl.I40PackageImpl.init();

	/**
	 * The meta object id for the '{@link io.github.abelgomez.asyncapi.i40.impl.I40ArchitectureImpl <em>Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.asyncapi.i40.impl.I40ArchitectureImpl
	 * @see io.github.abelgomez.asyncapi.i40.impl.I40PackageImpl#getI40Architecture()
	 * @generated
	 */
	int I40_ARCHITECTURE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I40_ARCHITECTURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I40_ARCHITECTURE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I40_ARCHITECTURE__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Base Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I40_ARCHITECTURE__BASE_MODEL = 3;

	/**
	 * The number of structural features of the '<em>Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I40_ARCHITECTURE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I40_ARCHITECTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.asyncapi.i40.impl.BrokerImpl <em>Broker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.asyncapi.i40.impl.BrokerImpl
	 * @see io.github.abelgomez.asyncapi.i40.impl.I40PackageImpl#getBroker()
	 * @generated
	 */
	int BROKER = 2;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.asyncapi.i40.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.asyncapi.i40.impl.MessageImpl
	 * @see io.github.abelgomez.asyncapi.i40.impl.I40PackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 5;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.asyncapi.i40.impl.TopicImpl <em>Topic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.asyncapi.i40.impl.TopicImpl
	 * @see io.github.abelgomez.asyncapi.i40.impl.I40PackageImpl#getTopic()
	 * @generated
	 */
	int TOPIC = 3;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.asyncapi.i40.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.asyncapi.i40.impl.ParameterImpl
	 * @see io.github.abelgomez.asyncapi.i40.impl.I40PackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 4;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.asyncapi.i40.impl.PublisherImpl <em>Publisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.asyncapi.i40.impl.PublisherImpl
	 * @see io.github.abelgomez.asyncapi.i40.impl.I40PackageImpl#getPublisher()
	 * @generated
	 */
	int PUBLISHER = 6;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.asyncapi.i40.impl.SubscriberImpl <em>Subscriber</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.asyncapi.i40.impl.SubscriberImpl
	 * @see io.github.abelgomez.asyncapi.i40.impl.I40PackageImpl#getSubscriber()
	 * @generated
	 */
	int SUBSCRIBER = 7;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.asyncapi.i40.impl.I40ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.asyncapi.i40.impl.I40ComponentImpl
	 * @see io.github.abelgomez.asyncapi.i40.impl.I40PackageImpl#getI40Component()
	 * @generated
	 */
	int I40_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I40_COMPONENT__BASE_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Broker</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I40_COMPONENT__BROKER = 1;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I40_COMPONENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I40_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER__URL = 1;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER__PROTOCOL = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER__BASE_CLASS = 4;

	/**
	 * The number of structural features of the '<em>Broker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Publish</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER___PUBLISH = 0;

	/**
	 * The operation id for the '<em>Subscribe</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER___SUBSCRIBE = 1;

	/**
	 * The number of operations of the '<em>Broker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER_OPERATION_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__PARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Base Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__BASE_SIGNAL = 2;

	/**
	 * The feature id for the '<em><b>Publish Op Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__PUBLISH_OP_ID = 3;

	/**
	 * The feature id for the '<em><b>Subscribe Op Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__SUBSCRIBE_OP_ID = 4;

	/**
	 * The feature id for the '<em><b>Publishes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__PUBLISHES = 5;

	/**
	 * The feature id for the '<em><b>Subscribes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__SUBSCRIBES = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__DESCRIPTION = 7;

	/**
	 * The number of structural features of the '<em>Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___TO_STRING = 0;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Base Structured Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__BASE_STRUCTURED_CLASSIFIER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Base Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__BASE_OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__TOPIC = 1;

	/**
	 * The number of structural features of the '<em>Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Base Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER__BASE_OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER__TOPIC = 1;

	/**
	 * The number of structural features of the '<em>Subscriber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Subscriber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.asyncapi.i40.impl.RedefinablePropertyImpl <em>Redefinable Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.asyncapi.i40.impl.RedefinablePropertyImpl
	 * @see io.github.abelgomez.asyncapi.i40.impl.I40PackageImpl#getRedefinableProperty()
	 * @generated
	 */
	int REDEFINABLE_PROPERTY = 8;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_PROPERTY__BASE_PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_PROPERTY__TITLE = 1;

	/**
	 * The number of structural features of the '<em>Redefinable Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Redefinable Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.github.abelgomez.asyncapi.i40.Protocol <em>Protocol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.github.abelgomez.asyncapi.i40.Protocol
	 * @see io.github.abelgomez.asyncapi.i40.impl.I40PackageImpl#getProtocol()
	 * @generated
	 */
	int PROTOCOL = 9;


	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.asyncapi.i40.I40Architecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architecture</em>'.
	 * @see io.github.abelgomez.asyncapi.i40.I40Architecture
	 * @generated
	 */
	EClass getI40Architecture();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.asyncapi.i40.I40Architecture#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see io.github.abelgomez.asyncapi.i40.I40Architecture#getName()
	 * @see #getI40Architecture()
	 * @generated
	 */
	EAttribute getI40Architecture_Name();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.asyncapi.i40.I40Architecture#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see io.github.abelgomez.asyncapi.i40.I40Architecture#getDescription()
	 * @see #getI40Architecture()
	 * @generated
	 */
	EAttribute getI40Architecture_Description();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.asyncapi.i40.I40Architecture#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see io.github.abelgomez.asyncapi.i40.I40Architecture#getVersion()
	 * @see #getI40Architecture()
	 * @generated
	 */
	EAttribute getI40Architecture_Version();

	/**
	 * Returns the meta object for the reference '{@link io.github.abelgomez.asyncapi.i40.I40Architecture#getBase_Model <em>Base Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Model</em>'.
	 * @see io.github.abelgomez.asyncapi.i40.I40Architecture#getBase_Model()
	 * @see #getI40Architecture()
	 * @generated
	 */
	EReference getI40Architecture_Base_Model();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.asyncapi.i40.Broker <em>Broker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Broker</em>'.
	 * @see io.github.abelgomez.asyncapi.i40.Broker
	 * @generated
	 */
	EClass getBroker();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.asyncapi.i40.Broker#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see io.github.abelgomez.asyncapi.i40.Broker#getName()
	 * @see #getBroker()
	 * @generated
	 */
	EAttribute getBroker_Name();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.asyncapi.i40.Broker#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see io.github.abelgomez.asyncapi.i40.Broker#getUrl()
	 * @see #getBroker()
	 * @generated
	 */
	EAttribute getBroker_Url();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.asyncapi.i40.Broker#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see io.github.abelgomez.asyncapi.i40.Broker#getProtocol()
	 * @see #getBroker()
	 * @generated
	 */
	EAttribute getBroker_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.asyncapi.i40.Broker#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see io.github.abelgomez.asyncapi.i40.Broker#getDescription()
	 * @see #getBroker()
	 * @generated
	 */
	EAttribute getBroker_Description();

	/**
	 * Returns the meta object for the reference '{@link io.github.abelgomez.asyncapi.i40.Broker#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see io.github.abelgomez.asyncapi.i40.Broker#getBase_Class()
	 * @see #getBroker()
	 * @generated
	 */
	EReference getBroker_Base_Class();

	/**
	 * Returns the meta object for the '{@link io.github.abelgomez.asyncapi.i40.Broker#publish() <em>Publish</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Publish</em>' operation.
	 * @see io.github.abelgomez.asyncapi.i40.Broker#publish()
	 * @generated
	 */
	EOperation getBroker__Publish();

	/**
	 * Returns the meta object for the '{@link io.github.abelgomez.asyncapi.i40.Broker#subscribe() <em>Subscribe</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Subscribe</em>' operation.
	 * @see io.github.abelgomez.asyncapi.i40.Broker#subscribe()
	 * @generated
	 */
	EOperation getBroker__Subscribe();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.asyncapi.i40.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see io.github.abelgomez.asyncapi.i40.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the reference '{@link io.github.abelgomez.asyncapi.i40.Message#getBase_StructuredClassifier <em>Base Structured Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Structured Classifier</em>'.
	 * @see io.github.abelgomez.asyncapi.i40.Message#getBase_StructuredClassifier()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Base_StructuredClassifier();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.asyncapi.i40.Message#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see io.github.abelgomez.asyncapi.i40.Message#getName()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Name();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.asyncapi.i40.Message#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see io.github.abelgomez.asyncapi.i40.Message#getDescription()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Description();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.asyncapi.i40.Topic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topic</em>'.
	 * @see io.github.abelgomez.asyncapi.i40.Topic
	 * @generated
	 */
	EClass getTopic();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.asyncapi.i40.Topic#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see io.github.abelgomez.asyncapi.i40.Topic#getName()
	 * @see #getTopic()
	 * @generated
	 */
	EAttribute getTopic_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link io.github.abelgomez.asyncapi.i40.Topic#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see io.github.abelgomez.asyncapi.i40.Topic#getParameters()
	 * @see #getTopic()
	 * @generated
	 */
	EReference getTopic_Parameters();

	/**
	 * Returns the meta object for the reference '{@link io.github.abelgomez.asyncapi.i40.Topic#getBase_Signal <em>Base Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Signal</em>'.
	 * @see io.github.abelgomez.asyncapi.i40.Topic#getBase_Signal()
	 * @see #getTopic()
	 * @generated
	 */
	EReference getTopic_Base_Signal();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.asyncapi.i40.Topic#getPublishOpId <em>Publish Op Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publish Op Id</em>'.
	 * @see io.github.abelgomez.asyncapi.i40.Topic#getPublishOpId()
	 * @see #getTopic()
	 * @generated
	 */
	EAttribute getTopic_PublishOpId();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.asyncapi.i40.Topic#getSubscribeOpId <em>Subscribe Op Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscribe Op Id</em>'.
	 * @see io.github.abelgomez.asyncapi.i40.Topic#getSubscribeOpId()
	 * @see #getTopic()
	 * @generated
	 */
	EAttribute getTopic_SubscribeOpId();

	/**
	 * Returns the meta object for the reference '{@link io.github.abelgomez.asyncapi.i40.Topic#getPublishes <em>Publishes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Publishes</em>'.
	 * @see io.github.abelgomez.asyncapi.i40.Topic#getPublishes()
	 * @see #getTopic()
	 * @generated
	 */
	EReference getTopic_Publishes();

	/**
	 * Returns the meta object for the reference '{@link io.github.abelgomez.asyncapi.i40.Topic#getSubscribes <em>Subscribes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subscribes</em>'.
	 * @see io.github.abelgomez.asyncapi.i40.Topic#getSubscribes()
	 * @see #getTopic()
	 * @generated
	 */
	EReference getTopic_Subscribes();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.asyncapi.i40.Topic#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see io.github.abelgomez.asyncapi.i40.Topic#getDescription()
	 * @see #getTopic()
	 * @generated
	 */
	EAttribute getTopic_Description();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.asyncapi.i40.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see io.github.abelgomez.asyncapi.i40.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.asyncapi.i40.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see io.github.abelgomez.asyncapi.i40.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.asyncapi.i40.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see io.github.abelgomez.asyncapi.i40.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.asyncapi.i40.Parameter#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see io.github.abelgomez.asyncapi.i40.Parameter#getDescription()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Description();

	/**
	 * Returns the meta object for the '{@link io.github.abelgomez.asyncapi.i40.Parameter#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see io.github.abelgomez.asyncapi.i40.Parameter#toString()
	 * @generated
	 */
	EOperation getParameter__ToString();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.asyncapi.i40.Publisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publisher</em>'.
	 * @see io.github.abelgomez.asyncapi.i40.Publisher
	 * @generated
	 */
	EClass getPublisher();

	/**
	 * Returns the meta object for the reference '{@link io.github.abelgomez.asyncapi.i40.Publisher#getBase_Operation <em>Base Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Operation</em>'.
	 * @see io.github.abelgomez.asyncapi.i40.Publisher#getBase_Operation()
	 * @see #getPublisher()
	 * @generated
	 */
	EReference getPublisher_Base_Operation();

	/**
	 * Returns the meta object for the reference '{@link io.github.abelgomez.asyncapi.i40.Publisher#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topic</em>'.
	 * @see io.github.abelgomez.asyncapi.i40.Publisher#getTopic()
	 * @see #getPublisher()
	 * @generated
	 */
	EReference getPublisher_Topic();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.asyncapi.i40.Subscriber <em>Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subscriber</em>'.
	 * @see io.github.abelgomez.asyncapi.i40.Subscriber
	 * @generated
	 */
	EClass getSubscriber();

	/**
	 * Returns the meta object for the reference '{@link io.github.abelgomez.asyncapi.i40.Subscriber#getBase_Operation <em>Base Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Operation</em>'.
	 * @see io.github.abelgomez.asyncapi.i40.Subscriber#getBase_Operation()
	 * @see #getSubscriber()
	 * @generated
	 */
	EReference getSubscriber_Base_Operation();

	/**
	 * Returns the meta object for the reference '{@link io.github.abelgomez.asyncapi.i40.Subscriber#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topic</em>'.
	 * @see io.github.abelgomez.asyncapi.i40.Subscriber#getTopic()
	 * @see #getSubscriber()
	 * @generated
	 */
	EReference getSubscriber_Topic();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.asyncapi.i40.RedefinableProperty <em>Redefinable Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Redefinable Property</em>'.
	 * @see io.github.abelgomez.asyncapi.i40.RedefinableProperty
	 * @generated
	 */
	EClass getRedefinableProperty();

	/**
	 * Returns the meta object for the reference '{@link io.github.abelgomez.asyncapi.i40.RedefinableProperty#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see io.github.abelgomez.asyncapi.i40.RedefinableProperty#getBase_Property()
	 * @see #getRedefinableProperty()
	 * @generated
	 */
	EReference getRedefinableProperty_Base_Property();

	/**
	 * Returns the meta object for the attribute '{@link io.github.abelgomez.asyncapi.i40.RedefinableProperty#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see io.github.abelgomez.asyncapi.i40.RedefinableProperty#getTitle()
	 * @see #getRedefinableProperty()
	 * @generated
	 */
	EAttribute getRedefinableProperty_Title();

	/**
	 * Returns the meta object for class '{@link io.github.abelgomez.asyncapi.i40.I40Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see io.github.abelgomez.asyncapi.i40.I40Component
	 * @generated
	 */
	EClass getI40Component();

	/**
	 * Returns the meta object for the reference '{@link io.github.abelgomez.asyncapi.i40.I40Component#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see io.github.abelgomez.asyncapi.i40.I40Component#getBase_Component()
	 * @see #getI40Component()
	 * @generated
	 */
	EReference getI40Component_Base_Component();

	/**
	 * Returns the meta object for the reference '{@link io.github.abelgomez.asyncapi.i40.I40Component#getBroker <em>Broker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Broker</em>'.
	 * @see io.github.abelgomez.asyncapi.i40.I40Component#getBroker()
	 * @see #getI40Component()
	 * @generated
	 */
	EReference getI40Component_Broker();

	/**
	 * Returns the meta object for enum '{@link io.github.abelgomez.asyncapi.i40.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Protocol</em>'.
	 * @see io.github.abelgomez.asyncapi.i40.Protocol
	 * @generated
	 */
	EEnum getProtocol();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	I40Factory getI40Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link io.github.abelgomez.asyncapi.i40.impl.I40ArchitectureImpl <em>Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.asyncapi.i40.impl.I40ArchitectureImpl
		 * @see io.github.abelgomez.asyncapi.i40.impl.I40PackageImpl#getI40Architecture()
		 * @generated
		 */
		EClass I40_ARCHITECTURE = eINSTANCE.getI40Architecture();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute I40_ARCHITECTURE__NAME = eINSTANCE.getI40Architecture_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute I40_ARCHITECTURE__DESCRIPTION = eINSTANCE.getI40Architecture_Description();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute I40_ARCHITECTURE__VERSION = eINSTANCE.getI40Architecture_Version();

		/**
		 * The meta object literal for the '<em><b>Base Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference I40_ARCHITECTURE__BASE_MODEL = eINSTANCE.getI40Architecture_Base_Model();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.asyncapi.i40.impl.BrokerImpl <em>Broker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.asyncapi.i40.impl.BrokerImpl
		 * @see io.github.abelgomez.asyncapi.i40.impl.I40PackageImpl#getBroker()
		 * @generated
		 */
		EClass BROKER = eINSTANCE.getBroker();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BROKER__NAME = eINSTANCE.getBroker_Name();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BROKER__URL = eINSTANCE.getBroker_Url();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BROKER__PROTOCOL = eINSTANCE.getBroker_Protocol();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BROKER__DESCRIPTION = eINSTANCE.getBroker_Description();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BROKER__BASE_CLASS = eINSTANCE.getBroker_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Publish</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BROKER___PUBLISH = eINSTANCE.getBroker__Publish();

		/**
		 * The meta object literal for the '<em><b>Subscribe</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BROKER___SUBSCRIBE = eINSTANCE.getBroker__Subscribe();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.asyncapi.i40.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.asyncapi.i40.impl.MessageImpl
		 * @see io.github.abelgomez.asyncapi.i40.impl.I40PackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Base Structured Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__BASE_STRUCTURED_CLASSIFIER = eINSTANCE.getMessage_Base_StructuredClassifier();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__NAME = eINSTANCE.getMessage_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__DESCRIPTION = eINSTANCE.getMessage_Description();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.asyncapi.i40.impl.TopicImpl <em>Topic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.asyncapi.i40.impl.TopicImpl
		 * @see io.github.abelgomez.asyncapi.i40.impl.I40PackageImpl#getTopic()
		 * @generated
		 */
		EClass TOPIC = eINSTANCE.getTopic();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC__NAME = eINSTANCE.getTopic_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPIC__PARAMETERS = eINSTANCE.getTopic_Parameters();

		/**
		 * The meta object literal for the '<em><b>Base Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPIC__BASE_SIGNAL = eINSTANCE.getTopic_Base_Signal();

		/**
		 * The meta object literal for the '<em><b>Publish Op Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC__PUBLISH_OP_ID = eINSTANCE.getTopic_PublishOpId();

		/**
		 * The meta object literal for the '<em><b>Subscribe Op Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC__SUBSCRIBE_OP_ID = eINSTANCE.getTopic_SubscribeOpId();

		/**
		 * The meta object literal for the '<em><b>Publishes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPIC__PUBLISHES = eINSTANCE.getTopic_Publishes();

		/**
		 * The meta object literal for the '<em><b>Subscribes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPIC__SUBSCRIBES = eINSTANCE.getTopic_Subscribes();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC__DESCRIPTION = eINSTANCE.getTopic_Description();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.asyncapi.i40.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.asyncapi.i40.impl.ParameterImpl
		 * @see io.github.abelgomez.asyncapi.i40.impl.I40PackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DESCRIPTION = eINSTANCE.getParameter_Description();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___TO_STRING = eINSTANCE.getParameter__ToString();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.asyncapi.i40.impl.PublisherImpl <em>Publisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.asyncapi.i40.impl.PublisherImpl
		 * @see io.github.abelgomez.asyncapi.i40.impl.I40PackageImpl#getPublisher()
		 * @generated
		 */
		EClass PUBLISHER = eINSTANCE.getPublisher();

		/**
		 * The meta object literal for the '<em><b>Base Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLISHER__BASE_OPERATION = eINSTANCE.getPublisher_Base_Operation();

		/**
		 * The meta object literal for the '<em><b>Topic</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLISHER__TOPIC = eINSTANCE.getPublisher_Topic();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.asyncapi.i40.impl.SubscriberImpl <em>Subscriber</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.asyncapi.i40.impl.SubscriberImpl
		 * @see io.github.abelgomez.asyncapi.i40.impl.I40PackageImpl#getSubscriber()
		 * @generated
		 */
		EClass SUBSCRIBER = eINSTANCE.getSubscriber();

		/**
		 * The meta object literal for the '<em><b>Base Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIBER__BASE_OPERATION = eINSTANCE.getSubscriber_Base_Operation();

		/**
		 * The meta object literal for the '<em><b>Topic</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIBER__TOPIC = eINSTANCE.getSubscriber_Topic();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.asyncapi.i40.impl.RedefinablePropertyImpl <em>Redefinable Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.asyncapi.i40.impl.RedefinablePropertyImpl
		 * @see io.github.abelgomez.asyncapi.i40.impl.I40PackageImpl#getRedefinableProperty()
		 * @generated
		 */
		EClass REDEFINABLE_PROPERTY = eINSTANCE.getRedefinableProperty();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDEFINABLE_PROPERTY__BASE_PROPERTY = eINSTANCE.getRedefinableProperty_Base_Property();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REDEFINABLE_PROPERTY__TITLE = eINSTANCE.getRedefinableProperty_Title();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.asyncapi.i40.impl.I40ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.asyncapi.i40.impl.I40ComponentImpl
		 * @see io.github.abelgomez.asyncapi.i40.impl.I40PackageImpl#getI40Component()
		 * @generated
		 */
		EClass I40_COMPONENT = eINSTANCE.getI40Component();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference I40_COMPONENT__BASE_COMPONENT = eINSTANCE.getI40Component_Base_Component();

		/**
		 * The meta object literal for the '<em><b>Broker</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference I40_COMPONENT__BROKER = eINSTANCE.getI40Component_Broker();

		/**
		 * The meta object literal for the '{@link io.github.abelgomez.asyncapi.i40.Protocol <em>Protocol</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.github.abelgomez.asyncapi.i40.Protocol
		 * @see io.github.abelgomez.asyncapi.i40.impl.I40PackageImpl#getProtocol()
		 * @generated
		 */
		EEnum PROTOCOL = eINSTANCE.getProtocol();

	}

} //I40Package
