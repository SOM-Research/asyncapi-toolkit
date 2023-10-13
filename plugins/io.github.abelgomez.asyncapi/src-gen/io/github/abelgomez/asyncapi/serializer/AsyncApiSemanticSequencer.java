/*
 * generated by Xtext 2.26.0
 */
package io.github.abelgomez.asyncapi.serializer;

import com.google.inject.Inject;
import io.github.abelgomez.asyncapi.asyncApi.AndExpression;
import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI;
import io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage;
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
import io.github.abelgomez.asyncapi.services.AsyncApiGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class AsyncApiSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AsyncApiGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == AsyncApiPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case AsyncApiPackage.AND_EXPRESSION:
				sequence_AndExpression(context, (AndExpression) semanticObject); 
				return; 
			case AsyncApiPackage.ASYNC_API:
				sequence_AsyncAPI(context, (AsyncAPI) semanticObject); 
				return; 
			case AsyncApiPackage.CHANNEL:
				sequence_Channel(context, (Channel) semanticObject); 
				return; 
			case AsyncApiPackage.COMPARISON_EXPRESSION:
				sequence_ComparisonExpression(context, (ComparisonExpression) semanticObject); 
				return; 
			case AsyncApiPackage.COMPONENTS:
				sequence_Components(context, (Components) semanticObject); 
				return; 
			case AsyncApiPackage.CONTACT:
				sequence_Contact(context, (Contact) semanticObject); 
				return; 
			case AsyncApiPackage.DERIVED_QO_SMETRIC:
				sequence_DerivedQoSMetric(context, (DerivedQoSMetric) semanticObject); 
				return; 
			case AsyncApiPackage.GUARANTEE_TERM:
				sequence_GuaranteeTerm(context, (GuaranteeTerm) semanticObject); 
				return; 
			case AsyncApiPackage.INFO:
				sequence_Info(context, (Info) semanticObject); 
				return; 
			case AsyncApiPackage.LICENSE:
				sequence_License(context, (License) semanticObject); 
				return; 
			case AsyncApiPackage.MESSAGE:
				sequence_Message(context, (Message) semanticObject); 
				return; 
			case AsyncApiPackage.MESSAGE_TRAIT:
				sequence_MessageTrait(context, (MessageTrait) semanticObject); 
				return; 
			case AsyncApiPackage.NAMED_MESSAGE:
				sequence_NamedMessage(context, (NamedMessage) semanticObject); 
				return; 
			case AsyncApiPackage.NAMED_MESSAGE_TRAIT:
				sequence_NamedMessageTrait(context, (NamedMessageTrait) semanticObject); 
				return; 
			case AsyncApiPackage.NAMED_OPERATION_TRAIT:
				sequence_NamedOperationTrait(context, (NamedOperationTrait) semanticObject); 
				return; 
			case AsyncApiPackage.NAMED_PARAMETER:
				sequence_NamedParameter(context, (NamedParameter) semanticObject); 
				return; 
			case AsyncApiPackage.NAMED_QO_SMETRIC:
				sequence_NamedQoSMetric(context, (NamedQoSMetric) semanticObject); 
				return; 
			case AsyncApiPackage.NAMED_SCHEMA:
				sequence_NamedSchema(context, (NamedSchema) semanticObject); 
				return; 
			case AsyncApiPackage.OPERATION:
				sequence_Operation(context, (Operation) semanticObject); 
				return; 
			case AsyncApiPackage.OPERATION_TRAIT:
				sequence_OperationTrait(context, (OperationTrait) semanticObject); 
				return; 
			case AsyncApiPackage.OR_EXPRESSION:
				sequence_OrExpression(context, (OrExpression) semanticObject); 
				return; 
			case AsyncApiPackage.PARAMETER:
				sequence_Parameter(context, (io.github.abelgomez.asyncapi.asyncApi.Parameter) semanticObject); 
				return; 
			case AsyncApiPackage.QO_SMETRIC:
				sequence_QoSMetric(context, (QoSMetric) semanticObject); 
				return; 
			case AsyncApiPackage.QUALIFYING_CONDITION:
				sequence_QualifyingCondition(context, (QualifyingCondition) semanticObject); 
				return; 
			case AsyncApiPackage.REFERENCE:
				sequence_Reference(context, (Reference) semanticObject); 
				return; 
			case AsyncApiPackage.SCHEMA:
				sequence_Schema(context, (Schema) semanticObject); 
				return; 
			case AsyncApiPackage.SCOPE:
				sequence_Scope(context, (Scope) semanticObject); 
				return; 
			case AsyncApiPackage.SERVER:
				sequence_Server(context, (Server) semanticObject); 
				return; 
			case AsyncApiPackage.SLA:
				sequence_Sla(context, (Sla) semanticObject); 
				return; 
			case AsyncApiPackage.SLO:
				sequence_Slo(context, (Slo) semanticObject); 
				return; 
			case AsyncApiPackage.TAG:
				sequence_Tag(context, (Tag) semanticObject); 
				return; 
			case AsyncApiPackage.VARIABLE:
				sequence_Variable(context, (Variable) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     BooleanExpression returns AndExpression
	 *     AndExpression returns AndExpression
	 *
	 * Constraint:
	 *     (conditions+=BooleanExpression conditions+=BooleanExpression*)
	 * </pre>
	 */
	protected void sequence_AndExpression(ISerializationContext context, AndExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     AsyncAPI returns AsyncAPI
	 *
	 * Constraint:
	 *     (
	 *         (version=VersionNumber | info=Info | components=Components | sla=Sla)? 
	 *         (servers+=Server servers+=Server*)? 
	 *         (channels+=Channel channels+=Channel*)?
	 *     )+
	 * </pre>
	 */
	protected void sequence_AsyncAPI(ISerializationContext context, AsyncAPI semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Channel returns Channel
	 *
	 * Constraint:
	 *     (
	 *         name=AnyString 
	 *         (
	 *             (description=AnyString | publish=Operation | subscribe=Operation | title=AnyString)? 
	 *             (parameters+=NamedParameter parameters+=NamedParameter*)?
	 *         )+
	 *     )
	 * </pre>
	 */
	protected void sequence_Channel(ISerializationContext context, Channel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     BooleanExpression returns ComparisonExpression
	 *     ComparisonExpression returns ComparisonExpression
	 *
	 * Constraint:
	 *     (qosMetric=AbstractQoSMetric operator=Operator value=AnyString)
	 * </pre>
	 */
	protected void sequence_ComparisonExpression(ISerializationContext context, ComparisonExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AsyncApiPackage.Literals.COMPARISON_EXPRESSION__QOS_METRIC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AsyncApiPackage.Literals.COMPARISON_EXPRESSION__QOS_METRIC));
			if (transientValues.isValueTransient(semanticObject, AsyncApiPackage.Literals.COMPARISON_EXPRESSION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AsyncApiPackage.Literals.COMPARISON_EXPRESSION__OPERATOR));
			if (transientValues.isValueTransient(semanticObject, AsyncApiPackage.Literals.COMPARISON_EXPRESSION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AsyncApiPackage.Literals.COMPARISON_EXPRESSION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComparisonExpressionAccess().getQosMetricAbstractQoSMetricParserRuleCall_4_0(), semanticObject.getQosMetric());
		feeder.accept(grammarAccess.getComparisonExpressionAccess().getOperatorOperatorEnumRuleCall_8_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getComparisonExpressionAccess().getValueAnyStringParserRuleCall_12_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Components returns Components
	 *
	 * Constraint:
	 *     (
	 *         (schemas+=NamedSchema schemas+=NamedSchema*) | 
	 *         (messages+=NamedMessage messages+=NamedMessage*) | 
	 *         (parameters+=NamedParameter parameters+=NamedParameter*) | 
	 *         (operationTraits+=NamedOperationTrait operationTraits+=NamedOperationTrait*) | 
	 *         (messageTraits+=NamedMessageTrait messageTraits+=NamedMessageTrait*) | 
	 *         (qosMetrics+=NamedQoSMetric qosMetrics+=NamedQoSMetric*)
	 *     )*
	 * </pre>
	 */
	protected void sequence_Components(ISerializationContext context, Components semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Contact returns Contact
	 *
	 * Constraint:
	 *     (name=AnyString | url=AnyString | email=AnyString)*
	 * </pre>
	 */
	protected void sequence_Contact(ISerializationContext context, Contact semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     AbstractQoSMetric returns DerivedQoSMetric
	 *     QoSMetric returns DerivedQoSMetric
	 *     DerivedQoSMetric returns DerivedQoSMetric
	 *
	 * Constraint:
	 *     (window=AnyString | windowUnit=WindowUnit | aggregationFunction=AggregationFunction)+
	 * </pre>
	 */
	protected void sequence_DerivedQoSMetric(ISerializationContext context, DerivedQoSMetric semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     GuaranteeTerm returns GuaranteeTerm
	 *
	 * Constraint:
	 *     (
	 *         name=AnyString 
	 *         ((scopes+=Scope scopes+=Scope*) | (qualifyingConditions+=QualifyingCondition qualifyingConditions+=QualifyingCondition*) | (slos+=Slo slos+=Slo*))*
	 *     )
	 * </pre>
	 */
	protected void sequence_GuaranteeTerm(ISerializationContext context, GuaranteeTerm semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Info returns Info
	 *
	 * Constraint:
	 *     (
	 *         title=AnyString | 
	 *         version=AnyString | 
	 *         description=AnyString | 
	 *         termsOfService=AnyString | 
	 *         contact=Contact | 
	 *         license=License | 
	 *         basePackage=AnyString
	 *     )*
	 * </pre>
	 */
	protected void sequence_Info(ISerializationContext context, Info semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     License returns License
	 *
	 * Constraint:
	 *     (name=AnyString | url=AnyString)*
	 * </pre>
	 */
	protected void sequence_License(ISerializationContext context, License semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     AbstractMessageTrait returns MessageTrait
	 *     MessageTrait returns MessageTrait
	 *
	 * Constraint:
	 *     ((summary=AnyString | description=AnyString | deprecated=Boolean | headers=AbstractSchema)? (tags+=Tag tags+=Tag*)?)+
	 * </pre>
	 */
	protected void sequence_MessageTrait(ISerializationContext context, MessageTrait semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     AbstractMessage returns Message
	 *     Message returns Message
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             name=AnyString | 
	 *             title=AnyString | 
	 *             summary=AnyString | 
	 *             description=AnyString | 
	 *             deprecated=Boolean | 
	 *             headers=AbstractSchema | 
	 *             payload=AbstractSchema | 
	 *             identifier=MessageIdentifier
	 *         )? 
	 *         (tags+=Tag tags+=Tag*)? 
	 *         (traits+=AbstractMessageTrait traits+=AbstractMessageTrait*)?
	 *     )+
	 * </pre>
	 */
	protected void sequence_Message(ISerializationContext context, Message semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NamedMessageTrait returns NamedMessageTrait
	 *
	 * Constraint:
	 *     (name=AnyString messageTrait=AbstractMessageTrait)
	 * </pre>
	 */
	protected void sequence_NamedMessageTrait(ISerializationContext context, NamedMessageTrait semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AsyncApiPackage.Literals.NAMED_MESSAGE_TRAIT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AsyncApiPackage.Literals.NAMED_MESSAGE_TRAIT__NAME));
			if (transientValues.isValueTransient(semanticObject, AsyncApiPackage.Literals.NAMED_MESSAGE_TRAIT__MESSAGE_TRAIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AsyncApiPackage.Literals.NAMED_MESSAGE_TRAIT__MESSAGE_TRAIT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNamedMessageTraitAccess().getNameAnyStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getNamedMessageTraitAccess().getMessageTraitAbstractMessageTraitParserRuleCall_3_0(), semanticObject.getMessageTrait());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NamedMessage returns NamedMessage
	 *
	 * Constraint:
	 *     (name=AnyString message=AbstractMessage)
	 * </pre>
	 */
	protected void sequence_NamedMessage(ISerializationContext context, NamedMessage semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AsyncApiPackage.Literals.NAMED_MESSAGE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AsyncApiPackage.Literals.NAMED_MESSAGE__NAME));
			if (transientValues.isValueTransient(semanticObject, AsyncApiPackage.Literals.NAMED_MESSAGE__MESSAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AsyncApiPackage.Literals.NAMED_MESSAGE__MESSAGE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNamedMessageAccess().getNameAnyStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getNamedMessageAccess().getMessageAbstractMessageParserRuleCall_3_0(), semanticObject.getMessage());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NamedOperationTrait returns NamedOperationTrait
	 *
	 * Constraint:
	 *     (name=AnyString operationTrait=AbstractOperationTrait)
	 * </pre>
	 */
	protected void sequence_NamedOperationTrait(ISerializationContext context, NamedOperationTrait semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AsyncApiPackage.Literals.NAMED_OPERATION_TRAIT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AsyncApiPackage.Literals.NAMED_OPERATION_TRAIT__NAME));
			if (transientValues.isValueTransient(semanticObject, AsyncApiPackage.Literals.NAMED_OPERATION_TRAIT__OPERATION_TRAIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AsyncApiPackage.Literals.NAMED_OPERATION_TRAIT__OPERATION_TRAIT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNamedOperationTraitAccess().getNameAnyStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getNamedOperationTraitAccess().getOperationTraitAbstractOperationTraitParserRuleCall_3_0(), semanticObject.getOperationTrait());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NamedParameter returns NamedParameter
	 *
	 * Constraint:
	 *     (name=AnyString parameter=AbstractParameter)
	 * </pre>
	 */
	protected void sequence_NamedParameter(ISerializationContext context, NamedParameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AsyncApiPackage.Literals.NAMED_PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AsyncApiPackage.Literals.NAMED_PARAMETER__NAME));
			if (transientValues.isValueTransient(semanticObject, AsyncApiPackage.Literals.NAMED_PARAMETER__PARAMETER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AsyncApiPackage.Literals.NAMED_PARAMETER__PARAMETER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNamedParameterAccess().getNameAnyStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getNamedParameterAccess().getParameterAbstractParameterParserRuleCall_3_0(), semanticObject.getParameter());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NamedQoSMetric returns NamedQoSMetric
	 *
	 * Constraint:
	 *     (name=AnyString qosMetric=AbstractQoSMetric)
	 * </pre>
	 */
	protected void sequence_NamedQoSMetric(ISerializationContext context, NamedQoSMetric semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AsyncApiPackage.Literals.NAMED_QO_SMETRIC__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AsyncApiPackage.Literals.NAMED_QO_SMETRIC__NAME));
			if (transientValues.isValueTransient(semanticObject, AsyncApiPackage.Literals.NAMED_QO_SMETRIC__QOS_METRIC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AsyncApiPackage.Literals.NAMED_QO_SMETRIC__QOS_METRIC));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNamedQoSMetricAccess().getNameAnyStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getNamedQoSMetricAccess().getQosMetricAbstractQoSMetricParserRuleCall_3_0(), semanticObject.getQosMetric());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NamedSchema returns NamedSchema
	 *
	 * Constraint:
	 *     (name=AnyString schema=AbstractSchema)
	 * </pre>
	 */
	protected void sequence_NamedSchema(ISerializationContext context, NamedSchema semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AsyncApiPackage.Literals.NAMED_SCHEMA__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AsyncApiPackage.Literals.NAMED_SCHEMA__NAME));
			if (transientValues.isValueTransient(semanticObject, AsyncApiPackage.Literals.NAMED_SCHEMA__SCHEMA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AsyncApiPackage.Literals.NAMED_SCHEMA__SCHEMA));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNamedSchemaAccess().getNameAnyStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getNamedSchemaAccess().getSchemaAbstractSchemaParserRuleCall_3_0(), semanticObject.getSchema());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     AbstractOperationTrait returns OperationTrait
	 *     OperationTrait returns OperationTrait
	 *
	 * Constraint:
	 *     (operationId=AnyString | summary=AnyString | description=AnyString)*
	 * </pre>
	 */
	protected void sequence_OperationTrait(ISerializationContext context, OperationTrait semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Operation returns Operation
	 *
	 * Constraint:
	 *     (
	 *         (operationId=AnyString | summary=AnyString | description=AnyString | message=AbstractMessage)? 
	 *         (traits+=AbstractOperationTrait traits+=AbstractOperationTrait*)?
	 *     )+
	 * </pre>
	 */
	protected void sequence_Operation(ISerializationContext context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     BooleanExpression returns OrExpression
	 *     OrExpression returns OrExpression
	 *
	 * Constraint:
	 *     (conditions+=BooleanExpression conditions+=BooleanExpression*)
	 * </pre>
	 */
	protected void sequence_OrExpression(ISerializationContext context, OrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     AbstractParameter returns Parameter
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     (description=AnyString | schema=AbstractSchema | location=AnyString)*
	 * </pre>
	 */
	protected void sequence_Parameter(ISerializationContext context, io.github.abelgomez.asyncapi.asyncApi.Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     AbstractQoSMetric returns QoSMetric
	 *     QoSMetric returns QoSMetric
	 *
	 * Constraint:
	 *     (metricType=QoSMetricType | description=AnyString | unit=QoSMetricUnit | groupedByEvent=Boolean)+
	 * </pre>
	 */
	protected void sequence_QoSMetric(ISerializationContext context, QoSMetric semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     QualifyingCondition returns QualifyingCondition
	 *
	 * Constraint:
	 *     (name=AnyString condition=BooleanExpression)
	 * </pre>
	 */
	protected void sequence_QualifyingCondition(ISerializationContext context, QualifyingCondition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AsyncApiPackage.Literals.QUALIFYING_CONDITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AsyncApiPackage.Literals.QUALIFYING_CONDITION__NAME));
			if (transientValues.isValueTransient(semanticObject, AsyncApiPackage.Literals.QUALIFYING_CONDITION__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AsyncApiPackage.Literals.QUALIFYING_CONDITION__CONDITION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getQualifyingConditionAccess().getNameAnyStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getQualifyingConditionAccess().getConditionBooleanExpressionParserRuleCall_3_0(), semanticObject.getCondition());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     AbstractMessage returns Reference
	 *     AbstractSchema returns Reference
	 *     AbstractParameter returns Reference
	 *     AbstractOperationTrait returns Reference
	 *     AbstractMessageTrait returns Reference
	 *     AbstractQoSMetric returns Reference
	 *     Reference returns Reference
	 *
	 * Constraint:
	 *     uri=AnyString
	 * </pre>
	 */
	protected void sequence_Reference(ISerializationContext context, Reference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AsyncApiPackage.Literals.REFERENCE__URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AsyncApiPackage.Literals.REFERENCE__URI));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getReferenceAccess().getUriAnyStringParserRuleCall_4_0(), semanticObject.getUri());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     AbstractSchema returns Schema
	 *     Schema returns Schema
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             title=AnyString | 
	 *             type=JsonType | 
	 *             description=AnyString | 
	 *             format=AnyString | 
	 *             minimum=INT | 
	 *             maximum=INT | 
	 *             minItems=INT | 
	 *             maxItems=INT | 
	 *             default=PrimitiveValue | 
	 *             items=AbstractSchema
	 *         )? 
	 *         (enum+=PrimitiveValue enum+=PrimitiveValue*)? 
	 *         (properties+=NamedSchema properties+=NamedSchema*)? 
	 *         (required+=AnyString required+=AnyString*)?
	 *     )+
	 * </pre>
	 */
	protected void sequence_Schema(ISerializationContext context, Schema semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Scope returns Scope
	 *
	 * Constraint:
	 *     (name=AnyString reference=[Channel|AnyString])
	 * </pre>
	 */
	protected void sequence_Scope(ISerializationContext context, Scope semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AsyncApiPackage.Literals.SCOPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AsyncApiPackage.Literals.SCOPE__NAME));
			if (transientValues.isValueTransient(semanticObject, AsyncApiPackage.Literals.SCOPE__REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AsyncApiPackage.Literals.SCOPE__REFERENCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getScopeAccess().getNameAnyStringParserRuleCall_1_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getScopeAccess().getReferenceChannelAnyStringParserRuleCall_1_2_0_1(), semanticObject.eGet(AsyncApiPackage.Literals.SCOPE__REFERENCE, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Server returns Server
	 *
	 * Constraint:
	 *     (
	 *         name=AnyString 
	 *         ((url=AnyString | protocol=Protocol | description=AnyString | isMonitored=Boolean)? (variables+=Variable variables+=Variable*)?)+
	 *     )
	 * </pre>
	 */
	protected void sequence_Server(ISerializationContext context, Server semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Sla returns Sla
	 *
	 * Constraint:
	 *     (guaranteeTerms+=GuaranteeTerm guaranteeTerms+=GuaranteeTerm*)?
	 * </pre>
	 */
	protected void sequence_Sla(ISerializationContext context, Sla semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Slo returns Slo
	 *
	 * Constraint:
	 *     (name=AnyString condition=BooleanExpression)
	 * </pre>
	 */
	protected void sequence_Slo(ISerializationContext context, Slo semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AsyncApiPackage.Literals.SLO__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AsyncApiPackage.Literals.SLO__NAME));
			if (transientValues.isValueTransient(semanticObject, AsyncApiPackage.Literals.SLO__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AsyncApiPackage.Literals.SLO__CONDITION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSloAccess().getNameAnyStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSloAccess().getConditionBooleanExpressionParserRuleCall_3_0(), semanticObject.getCondition());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Tag returns Tag
	 *
	 * Constraint:
	 *     (name=AnyString | description=AnyString)*
	 * </pre>
	 */
	protected void sequence_Tag(ISerializationContext context, Tag semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Variable returns Variable
	 *
	 * Constraint:
	 *     (name=AnyString ((description=AnyString | default=AnyString)? (enum+=AnyString enum+=AnyString*)?)+)
	 * </pre>
	 */
	protected void sequence_Variable(ISerializationContext context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
