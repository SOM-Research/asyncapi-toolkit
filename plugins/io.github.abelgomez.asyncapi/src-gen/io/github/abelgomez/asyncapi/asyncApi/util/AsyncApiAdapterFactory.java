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
import io.github.abelgomez.asyncapi.asyncApi.NamedQoSMetric;
import io.github.abelgomez.asyncapi.asyncApi.NamedSchema;
import io.github.abelgomez.asyncapi.asyncApi.Operation;
import io.github.abelgomez.asyncapi.asyncApi.OperationTrait;
import io.github.abelgomez.asyncapi.asyncApi.OrExpression;
import io.github.abelgomez.asyncapi.asyncApi.Parameter;
import io.github.abelgomez.asyncapi.asyncApi.QoSMetric;
import io.github.abelgomez.asyncapi.asyncApi.QualifyingCondition;
import io.github.abelgomez.asyncapi.asyncApi.Reference;
import io.github.abelgomez.asyncapi.asyncApi.Schema;
import io.github.abelgomez.asyncapi.asyncApi.Scope;
import io.github.abelgomez.asyncapi.asyncApi.Server;
import io.github.abelgomez.asyncapi.asyncApi.Sla;
import io.github.abelgomez.asyncapi.asyncApi.Slo;
import io.github.abelgomez.asyncapi.asyncApi.Tag;
import io.github.abelgomez.asyncapi.asyncApi.Variable;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage
 * @generated
 */
public class AsyncApiAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AsyncApiPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AsyncApiAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = AsyncApiPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AsyncApiSwitch<Adapter> modelSwitch =
    new AsyncApiSwitch<Adapter>()
    {
      @Override
      public Adapter caseAsyncAPI(AsyncAPI object)
      {
        return createAsyncAPIAdapter();
      }
      @Override
      public Adapter caseInfo(Info object)
      {
        return createInfoAdapter();
      }
      @Override
      public Adapter caseContact(Contact object)
      {
        return createContactAdapter();
      }
      @Override
      public Adapter caseLicense(License object)
      {
        return createLicenseAdapter();
      }
      @Override
      public Adapter caseServer(Server object)
      {
        return createServerAdapter();
      }
      @Override
      public Adapter caseVariable(Variable object)
      {
        return createVariableAdapter();
      }
      @Override
      public Adapter caseChannel(Channel object)
      {
        return createChannelAdapter();
      }
      @Override
      public Adapter caseOperation(Operation object)
      {
        return createOperationAdapter();
      }
      @Override
      public Adapter caseAbstractMessage(AbstractMessage object)
      {
        return createAbstractMessageAdapter();
      }
      @Override
      public Adapter caseMessage(Message object)
      {
        return createMessageAdapter();
      }
      @Override
      public Adapter caseNamedMessage(NamedMessage object)
      {
        return createNamedMessageAdapter();
      }
      @Override
      public Adapter caseTag(Tag object)
      {
        return createTagAdapter();
      }
      @Override
      public Adapter caseAbstractSchema(AbstractSchema object)
      {
        return createAbstractSchemaAdapter();
      }
      @Override
      public Adapter caseSchema(Schema object)
      {
        return createSchemaAdapter();
      }
      @Override
      public Adapter caseNamedSchema(NamedSchema object)
      {
        return createNamedSchemaAdapter();
      }
      @Override
      public Adapter caseAbstractParameter(AbstractParameter object)
      {
        return createAbstractParameterAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseNamedParameter(NamedParameter object)
      {
        return createNamedParameterAdapter();
      }
      @Override
      public Adapter caseAbstractOperationTrait(AbstractOperationTrait object)
      {
        return createAbstractOperationTraitAdapter();
      }
      @Override
      public Adapter caseOperationTrait(OperationTrait object)
      {
        return createOperationTraitAdapter();
      }
      @Override
      public Adapter caseNamedOperationTrait(NamedOperationTrait object)
      {
        return createNamedOperationTraitAdapter();
      }
      @Override
      public Adapter caseAbstractMessageTrait(AbstractMessageTrait object)
      {
        return createAbstractMessageTraitAdapter();
      }
      @Override
      public Adapter caseMessageTrait(MessageTrait object)
      {
        return createMessageTraitAdapter();
      }
      @Override
      public Adapter caseNamedMessageTrait(NamedMessageTrait object)
      {
        return createNamedMessageTraitAdapter();
      }
      @Override
      public Adapter caseComponents(Components object)
      {
        return createComponentsAdapter();
      }
      @Override
      public Adapter caseSla(Sla object)
      {
        return createSlaAdapter();
      }
      @Override
      public Adapter caseGuaranteeTerm(GuaranteeTerm object)
      {
        return createGuaranteeTermAdapter();
      }
      @Override
      public Adapter caseScope(Scope object)
      {
        return createScopeAdapter();
      }
      @Override
      public Adapter caseQualifyingCondition(QualifyingCondition object)
      {
        return createQualifyingConditionAdapter();
      }
      @Override
      public Adapter caseSlo(Slo object)
      {
        return createSloAdapter();
      }
      @Override
      public Adapter caseAbstractQoSMetric(AbstractQoSMetric object)
      {
        return createAbstractQoSMetricAdapter();
      }
      @Override
      public Adapter caseQoSMetric(QoSMetric object)
      {
        return createQoSMetricAdapter();
      }
      @Override
      public Adapter caseNamedQoSMetric(NamedQoSMetric object)
      {
        return createNamedQoSMetricAdapter();
      }
      @Override
      public Adapter caseDerivedQoSMetric(DerivedQoSMetric object)
      {
        return createDerivedQoSMetricAdapter();
      }
      @Override
      public Adapter caseBooleanExpression(BooleanExpression object)
      {
        return createBooleanExpressionAdapter();
      }
      @Override
      public Adapter caseAndExpression(AndExpression object)
      {
        return createAndExpressionAdapter();
      }
      @Override
      public Adapter caseOrExpression(OrExpression object)
      {
        return createOrExpressionAdapter();
      }
      @Override
      public Adapter caseComparisonExpression(ComparisonExpression object)
      {
        return createComparisonExpressionAdapter();
      }
      @Override
      public Adapter caseReference(Reference object)
      {
        return createReferenceAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link io.github.abelgomez.asyncapi.asyncApi.AsyncAPI <em>Async API</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncAPI
   * @generated
   */
  public Adapter createAsyncAPIAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.abelgomez.asyncapi.asyncApi.Info <em>Info</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.abelgomez.asyncapi.asyncApi.Info
   * @generated
   */
  public Adapter createInfoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.abelgomez.asyncapi.asyncApi.Contact <em>Contact</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.abelgomez.asyncapi.asyncApi.Contact
   * @generated
   */
  public Adapter createContactAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.abelgomez.asyncapi.asyncApi.License <em>License</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.abelgomez.asyncapi.asyncApi.License
   * @generated
   */
  public Adapter createLicenseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.abelgomez.asyncapi.asyncApi.Server <em>Server</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.abelgomez.asyncapi.asyncApi.Server
   * @generated
   */
  public Adapter createServerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.abelgomez.asyncapi.asyncApi.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.abelgomez.asyncapi.asyncApi.Variable
   * @generated
   */
  public Adapter createVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.abelgomez.asyncapi.asyncApi.Channel <em>Channel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.abelgomez.asyncapi.asyncApi.Channel
   * @generated
   */
  public Adapter createChannelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.abelgomez.asyncapi.asyncApi.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.abelgomez.asyncapi.asyncApi.Operation
   * @generated
   */
  public Adapter createOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.abelgomez.asyncapi.asyncApi.AbstractMessage <em>Abstract Message</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.abelgomez.asyncapi.asyncApi.AbstractMessage
   * @generated
   */
  public Adapter createAbstractMessageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.abelgomez.asyncapi.asyncApi.Message <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.abelgomez.asyncapi.asyncApi.Message
   * @generated
   */
  public Adapter createMessageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.abelgomez.asyncapi.asyncApi.NamedMessage <em>Named Message</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.abelgomez.asyncapi.asyncApi.NamedMessage
   * @generated
   */
  public Adapter createNamedMessageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.abelgomez.asyncapi.asyncApi.Tag <em>Tag</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.abelgomez.asyncapi.asyncApi.Tag
   * @generated
   */
  public Adapter createTagAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.abelgomez.asyncapi.asyncApi.AbstractSchema <em>Abstract Schema</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.abelgomez.asyncapi.asyncApi.AbstractSchema
   * @generated
   */
  public Adapter createAbstractSchemaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.abelgomez.asyncapi.asyncApi.Schema <em>Schema</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.abelgomez.asyncapi.asyncApi.Schema
   * @generated
   */
  public Adapter createSchemaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.abelgomez.asyncapi.asyncApi.NamedSchema <em>Named Schema</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.abelgomez.asyncapi.asyncApi.NamedSchema
   * @generated
   */
  public Adapter createNamedSchemaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.abelgomez.asyncapi.asyncApi.AbstractParameter <em>Abstract Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.abelgomez.asyncapi.asyncApi.AbstractParameter
   * @generated
   */
  public Adapter createAbstractParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.abelgomez.asyncapi.asyncApi.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.abelgomez.asyncapi.asyncApi.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.abelgomez.asyncapi.asyncApi.NamedParameter <em>Named Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.abelgomez.asyncapi.asyncApi.NamedParameter
   * @generated
   */
  public Adapter createNamedParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.abelgomez.asyncapi.asyncApi.AbstractOperationTrait <em>Abstract Operation Trait</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.abelgomez.asyncapi.asyncApi.AbstractOperationTrait
   * @generated
   */
  public Adapter createAbstractOperationTraitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.abelgomez.asyncapi.asyncApi.OperationTrait <em>Operation Trait</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.abelgomez.asyncapi.asyncApi.OperationTrait
   * @generated
   */
  public Adapter createOperationTraitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.abelgomez.asyncapi.asyncApi.NamedOperationTrait <em>Named Operation Trait</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.abelgomez.asyncapi.asyncApi.NamedOperationTrait
   * @generated
   */
  public Adapter createNamedOperationTraitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.abelgomez.asyncapi.asyncApi.AbstractMessageTrait <em>Abstract Message Trait</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.abelgomez.asyncapi.asyncApi.AbstractMessageTrait
   * @generated
   */
  public Adapter createAbstractMessageTraitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.abelgomez.asyncapi.asyncApi.MessageTrait <em>Message Trait</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.abelgomez.asyncapi.asyncApi.MessageTrait
   * @generated
   */
  public Adapter createMessageTraitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.abelgomez.asyncapi.asyncApi.NamedMessageTrait <em>Named Message Trait</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.abelgomez.asyncapi.asyncApi.NamedMessageTrait
   * @generated
   */
  public Adapter createNamedMessageTraitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.abelgomez.asyncapi.asyncApi.Components <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.abelgomez.asyncapi.asyncApi.Components
   * @generated
   */
  public Adapter createComponentsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.abelgomez.asyncapi.asyncApi.Sla <em>Sla</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.abelgomez.asyncapi.asyncApi.Sla
   * @generated
   */
  public Adapter createSlaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.abelgomez.asyncapi.asyncApi.GuaranteeTerm <em>Guarantee Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.abelgomez.asyncapi.asyncApi.GuaranteeTerm
   * @generated
   */
  public Adapter createGuaranteeTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.abelgomez.asyncapi.asyncApi.Scope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.abelgomez.asyncapi.asyncApi.Scope
   * @generated
   */
  public Adapter createScopeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.abelgomez.asyncapi.asyncApi.QualifyingCondition <em>Qualifying Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.abelgomez.asyncapi.asyncApi.QualifyingCondition
   * @generated
   */
  public Adapter createQualifyingConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.abelgomez.asyncapi.asyncApi.Slo <em>Slo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.abelgomez.asyncapi.asyncApi.Slo
   * @generated
   */
  public Adapter createSloAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.abelgomez.asyncapi.asyncApi.AbstractQoSMetric <em>Abstract Qo SMetric</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.abelgomez.asyncapi.asyncApi.AbstractQoSMetric
   * @generated
   */
  public Adapter createAbstractQoSMetricAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.abelgomez.asyncapi.asyncApi.QoSMetric <em>Qo SMetric</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.abelgomez.asyncapi.asyncApi.QoSMetric
   * @generated
   */
  public Adapter createQoSMetricAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.abelgomez.asyncapi.asyncApi.NamedQoSMetric <em>Named Qo SMetric</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.abelgomez.asyncapi.asyncApi.NamedQoSMetric
   * @generated
   */
  public Adapter createNamedQoSMetricAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.abelgomez.asyncapi.asyncApi.DerivedQoSMetric <em>Derived Qo SMetric</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.abelgomez.asyncapi.asyncApi.DerivedQoSMetric
   * @generated
   */
  public Adapter createDerivedQoSMetricAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.abelgomez.asyncapi.asyncApi.BooleanExpression <em>Boolean Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.abelgomez.asyncapi.asyncApi.BooleanExpression
   * @generated
   */
  public Adapter createBooleanExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.abelgomez.asyncapi.asyncApi.AndExpression <em>And Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.abelgomez.asyncapi.asyncApi.AndExpression
   * @generated
   */
  public Adapter createAndExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.abelgomez.asyncapi.asyncApi.OrExpression <em>Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.abelgomez.asyncapi.asyncApi.OrExpression
   * @generated
   */
  public Adapter createOrExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.abelgomez.asyncapi.asyncApi.ComparisonExpression <em>Comparison Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.abelgomez.asyncapi.asyncApi.ComparisonExpression
   * @generated
   */
  public Adapter createComparisonExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.abelgomez.asyncapi.asyncApi.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.abelgomez.asyncapi.asyncApi.Reference
   * @generated
   */
  public Adapter createReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //AsyncApiAdapterFactory
