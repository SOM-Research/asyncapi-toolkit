/**
 * generated by Xtext 2.26.0
 */
package io.github.abelgomez.asyncapi.asyncApi.util;

import io.github.abelgomez.asyncapi.asyncApi.AbstractMessage;
import io.github.abelgomez.asyncapi.asyncApi.AbstractMessageTrait;
import io.github.abelgomez.asyncapi.asyncApi.AbstractOperationTrait;
import io.github.abelgomez.asyncapi.asyncApi.AbstractParameter;
import io.github.abelgomez.asyncapi.asyncApi.AbstractQoSMetric;
import io.github.abelgomez.asyncapi.asyncApi.AbstractSchema;
import io.github.abelgomez.asyncapi.asyncApi.AndExpression;
import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI;
import io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage;
import io.github.abelgomez.asyncapi.asyncApi.BooleanExpression;
import io.github.abelgomez.asyncapi.asyncApi.Channel;
import io.github.abelgomez.asyncapi.asyncApi.ComparisonExpression;
import io.github.abelgomez.asyncapi.asyncApi.Components;
import io.github.abelgomez.asyncapi.asyncApi.Contact;
import io.github.abelgomez.asyncapi.asyncApi.DerivedQoSMetric;
import io.github.abelgomez.asyncapi.asyncApi.GuaranteeTerm;
import io.github.abelgomez.asyncapi.asyncApi.Info;
import io.github.abelgomez.asyncapi.asyncApi.License;
import io.github.abelgomez.asyncapi.asyncApi.Message;
import io.github.abelgomez.asyncapi.asyncApi.MessageTrait;
import io.github.abelgomez.asyncapi.asyncApi.NamedMessage;
import io.github.abelgomez.asyncapi.asyncApi.NamedMessageTrait;
import io.github.abelgomez.asyncapi.asyncApi.NamedOperationTrait;
import io.github.abelgomez.asyncapi.asyncApi.NamedParameter;
import io.github.abelgomez.asyncapi.asyncApi.NamedSchema;
import io.github.abelgomez.asyncapi.asyncApi.Operation;
import io.github.abelgomez.asyncapi.asyncApi.OperationTrait;
import io.github.abelgomez.asyncapi.asyncApi.OrExpression;
import io.github.abelgomez.asyncapi.asyncApi.Parameter;
import io.github.abelgomez.asyncapi.asyncApi.QoSMetric;
import io.github.abelgomez.asyncapi.asyncApi.QoSMetricReference;
import io.github.abelgomez.asyncapi.asyncApi.QualifyingCondition;
import io.github.abelgomez.asyncapi.asyncApi.Reference;
import io.github.abelgomez.asyncapi.asyncApi.Schema;
import io.github.abelgomez.asyncapi.asyncApi.Scope;
import io.github.abelgomez.asyncapi.asyncApi.Server;
import io.github.abelgomez.asyncapi.asyncApi.Sla;
import io.github.abelgomez.asyncapi.asyncApi.Slo;
import io.github.abelgomez.asyncapi.asyncApi.Tag;
import io.github.abelgomez.asyncapi.asyncApi.Variable;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage
 * @generated
 */
public class AsyncApiSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AsyncApiPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AsyncApiSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = AsyncApiPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case AsyncApiPackage.ASYNC_API:
      {
        AsyncAPI asyncAPI = (AsyncAPI)theEObject;
        T result = caseAsyncAPI(asyncAPI);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsyncApiPackage.INFO:
      {
        Info info = (Info)theEObject;
        T result = caseInfo(info);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsyncApiPackage.CONTACT:
      {
        Contact contact = (Contact)theEObject;
        T result = caseContact(contact);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsyncApiPackage.LICENSE:
      {
        License license = (License)theEObject;
        T result = caseLicense(license);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsyncApiPackage.SERVER:
      {
        Server server = (Server)theEObject;
        T result = caseServer(server);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsyncApiPackage.VARIABLE:
      {
        Variable variable = (Variable)theEObject;
        T result = caseVariable(variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsyncApiPackage.CHANNEL:
      {
        Channel channel = (Channel)theEObject;
        T result = caseChannel(channel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsyncApiPackage.OPERATION:
      {
        Operation operation = (Operation)theEObject;
        T result = caseOperation(operation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsyncApiPackage.ABSTRACT_MESSAGE:
      {
        AbstractMessage abstractMessage = (AbstractMessage)theEObject;
        T result = caseAbstractMessage(abstractMessage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsyncApiPackage.MESSAGE:
      {
        Message message = (Message)theEObject;
        T result = caseMessage(message);
        if (result == null) result = caseAbstractMessage(message);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsyncApiPackage.NAMED_MESSAGE:
      {
        NamedMessage namedMessage = (NamedMessage)theEObject;
        T result = caseNamedMessage(namedMessage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsyncApiPackage.TAG:
      {
        Tag tag = (Tag)theEObject;
        T result = caseTag(tag);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsyncApiPackage.ABSTRACT_SCHEMA:
      {
        AbstractSchema abstractSchema = (AbstractSchema)theEObject;
        T result = caseAbstractSchema(abstractSchema);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsyncApiPackage.SCHEMA:
      {
        Schema schema = (Schema)theEObject;
        T result = caseSchema(schema);
        if (result == null) result = caseAbstractSchema(schema);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsyncApiPackage.NAMED_SCHEMA:
      {
        NamedSchema namedSchema = (NamedSchema)theEObject;
        T result = caseNamedSchema(namedSchema);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsyncApiPackage.ABSTRACT_PARAMETER:
      {
        AbstractParameter abstractParameter = (AbstractParameter)theEObject;
        T result = caseAbstractParameter(abstractParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsyncApiPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = caseAbstractParameter(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsyncApiPackage.NAMED_PARAMETER:
      {
        NamedParameter namedParameter = (NamedParameter)theEObject;
        T result = caseNamedParameter(namedParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsyncApiPackage.ABSTRACT_OPERATION_TRAIT:
      {
        AbstractOperationTrait abstractOperationTrait = (AbstractOperationTrait)theEObject;
        T result = caseAbstractOperationTrait(abstractOperationTrait);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsyncApiPackage.OPERATION_TRAIT:
      {
        OperationTrait operationTrait = (OperationTrait)theEObject;
        T result = caseOperationTrait(operationTrait);
        if (result == null) result = caseAbstractOperationTrait(operationTrait);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsyncApiPackage.NAMED_OPERATION_TRAIT:
      {
        NamedOperationTrait namedOperationTrait = (NamedOperationTrait)theEObject;
        T result = caseNamedOperationTrait(namedOperationTrait);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsyncApiPackage.ABSTRACT_MESSAGE_TRAIT:
      {
        AbstractMessageTrait abstractMessageTrait = (AbstractMessageTrait)theEObject;
        T result = caseAbstractMessageTrait(abstractMessageTrait);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsyncApiPackage.MESSAGE_TRAIT:
      {
        MessageTrait messageTrait = (MessageTrait)theEObject;
        T result = caseMessageTrait(messageTrait);
        if (result == null) result = caseAbstractMessageTrait(messageTrait);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsyncApiPackage.NAMED_MESSAGE_TRAIT:
      {
        NamedMessageTrait namedMessageTrait = (NamedMessageTrait)theEObject;
        T result = caseNamedMessageTrait(namedMessageTrait);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsyncApiPackage.COMPONENTS:
      {
        Components components = (Components)theEObject;
        T result = caseComponents(components);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsyncApiPackage.SLA:
      {
        Sla sla = (Sla)theEObject;
        T result = caseSla(sla);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsyncApiPackage.GUARANTEE_TERM:
      {
        GuaranteeTerm guaranteeTerm = (GuaranteeTerm)theEObject;
        T result = caseGuaranteeTerm(guaranteeTerm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsyncApiPackage.SCOPE:
      {
        Scope scope = (Scope)theEObject;
        T result = caseScope(scope);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsyncApiPackage.QUALIFYING_CONDITION:
      {
        QualifyingCondition qualifyingCondition = (QualifyingCondition)theEObject;
        T result = caseQualifyingCondition(qualifyingCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsyncApiPackage.SLO:
      {
        Slo slo = (Slo)theEObject;
        T result = caseSlo(slo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsyncApiPackage.ABSTRACT_QO_SMETRIC:
      {
        AbstractQoSMetric abstractQoSMetric = (AbstractQoSMetric)theEObject;
        T result = caseAbstractQoSMetric(abstractQoSMetric);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsyncApiPackage.QO_SMETRIC_REFERENCE:
      {
        QoSMetricReference qoSMetricReference = (QoSMetricReference)theEObject;
        T result = caseQoSMetricReference(qoSMetricReference);
        if (result == null) result = caseAbstractQoSMetric(qoSMetricReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsyncApiPackage.QO_SMETRIC:
      {
        QoSMetric qoSMetric = (QoSMetric)theEObject;
        T result = caseQoSMetric(qoSMetric);
        if (result == null) result = caseAbstractQoSMetric(qoSMetric);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsyncApiPackage.DERIVED_QO_SMETRIC:
      {
        DerivedQoSMetric derivedQoSMetric = (DerivedQoSMetric)theEObject;
        T result = caseDerivedQoSMetric(derivedQoSMetric);
        if (result == null) result = caseQoSMetric(derivedQoSMetric);
        if (result == null) result = caseAbstractQoSMetric(derivedQoSMetric);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsyncApiPackage.BOOLEAN_EXPRESSION:
      {
        BooleanExpression booleanExpression = (BooleanExpression)theEObject;
        T result = caseBooleanExpression(booleanExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsyncApiPackage.AND_EXPRESSION:
      {
        AndExpression andExpression = (AndExpression)theEObject;
        T result = caseAndExpression(andExpression);
        if (result == null) result = caseBooleanExpression(andExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsyncApiPackage.OR_EXPRESSION:
      {
        OrExpression orExpression = (OrExpression)theEObject;
        T result = caseOrExpression(orExpression);
        if (result == null) result = caseBooleanExpression(orExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsyncApiPackage.COMPARISON_EXPRESSION:
      {
        ComparisonExpression comparisonExpression = (ComparisonExpression)theEObject;
        T result = caseComparisonExpression(comparisonExpression);
        if (result == null) result = caseBooleanExpression(comparisonExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AsyncApiPackage.REFERENCE:
      {
        Reference reference = (Reference)theEObject;
        T result = caseReference(reference);
        if (result == null) result = caseAbstractMessage(reference);
        if (result == null) result = caseAbstractSchema(reference);
        if (result == null) result = caseAbstractParameter(reference);
        if (result == null) result = caseAbstractOperationTrait(reference);
        if (result == null) result = caseAbstractMessageTrait(reference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Async API</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Async API</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAsyncAPI(AsyncAPI object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Info</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Info</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInfo(Info object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Contact</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Contact</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContact(Contact object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>License</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>License</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLicense(License object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Server</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Server</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseServer(Server object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable(Variable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Channel</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Channel</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChannel(Channel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperation(Operation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Message</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Message</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractMessage(AbstractMessage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Message</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMessage(Message object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Message</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Message</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedMessage(NamedMessage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tag</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tag</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTag(Tag object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Schema</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Schema</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractSchema(AbstractSchema object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Schema</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Schema</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSchema(Schema object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Schema</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Schema</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedSchema(NamedSchema object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractParameter(AbstractParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedParameter(NamedParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Operation Trait</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Operation Trait</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractOperationTrait(AbstractOperationTrait object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation Trait</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation Trait</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperationTrait(OperationTrait object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Operation Trait</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Operation Trait</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedOperationTrait(NamedOperationTrait object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Message Trait</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Message Trait</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractMessageTrait(AbstractMessageTrait object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Message Trait</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Message Trait</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMessageTrait(MessageTrait object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Message Trait</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Message Trait</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedMessageTrait(NamedMessageTrait object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Components</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Components</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponents(Components object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sla</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sla</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSla(Sla object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Guarantee Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Guarantee Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGuaranteeTerm(GuaranteeTerm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scope</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scope</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScope(Scope object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qualifying Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qualifying Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQualifyingCondition(QualifyingCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slo</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slo</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlo(Slo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Qo SMetric</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Qo SMetric</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractQoSMetric(AbstractQoSMetric object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qo SMetric Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qo SMetric Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQoSMetricReference(QoSMetricReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qo SMetric</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qo SMetric</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQoSMetric(QoSMetric object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Derived Qo SMetric</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Derived Qo SMetric</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDerivedQoSMetric(DerivedQoSMetric object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanExpression(BooleanExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndExpression(AndExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrExpression(OrExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comparison Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comparison Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComparisonExpression(ComparisonExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReference(Reference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //AsyncApiSwitch
