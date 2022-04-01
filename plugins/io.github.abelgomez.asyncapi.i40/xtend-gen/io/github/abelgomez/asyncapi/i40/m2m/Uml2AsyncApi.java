package io.github.abelgomez.asyncapi.i40.m2m;

import com.google.common.collect.Iterables;
import io.github.abelgomez.asyncapi.asyncApi.AbstractSchema;
import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI;
import io.github.abelgomez.asyncapi.asyncApi.AsyncApiFactory;
import io.github.abelgomez.asyncapi.asyncApi.Channel;
import io.github.abelgomez.asyncapi.asyncApi.Components;
import io.github.abelgomez.asyncapi.asyncApi.Info;
import io.github.abelgomez.asyncapi.asyncApi.JsonType;
import io.github.abelgomez.asyncapi.asyncApi.NamedMessage;
import io.github.abelgomez.asyncapi.asyncApi.NamedParameter;
import io.github.abelgomez.asyncapi.asyncApi.NamedSchema;
import io.github.abelgomez.asyncapi.asyncApi.Operation;
import io.github.abelgomez.asyncapi.asyncApi.Protocol;
import io.github.abelgomez.asyncapi.asyncApi.Reference;
import io.github.abelgomez.asyncapi.asyncApi.Schema;
import io.github.abelgomez.asyncapi.asyncApi.Server;
import io.github.abelgomez.asyncapi.asyncApi.VersionNumber;
import io.github.abelgomez.asyncapi.i40.Broker;
import io.github.abelgomez.asyncapi.i40.I40Architecture;
import io.github.abelgomez.asyncapi.i40.Message;
import io.github.abelgomez.asyncapi.i40.Parameter;
import io.github.abelgomez.asyncapi.i40.RedefinableProperty;
import io.github.abelgomez.asyncapi.i40.Topic;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Signal;
import org.eclipse.uml2.uml.StructuredClassifier;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class Uml2AsyncApi {
  private static final String COMPONENTS_URI = "#/components/";
  
  private static final String MESSAGES_URI = (Uml2AsyncApi.COMPONENTS_URI + "messages/");
  
  private static final String SCHEMAS_URI = (Uml2AsyncApi.COMPONENTS_URI + "schemas/");
  
  public static AsyncAPI asyncApi(final Model model) {
    final I40Architecture architecture = UMLUtil.<I40Architecture>getStereotypeApplication(model, I40Architecture.class);
    Assert.isNotNull(architecture, "UML Model must be an I4.0 Architecture");
    AsyncAPI _createAsyncAPI = AsyncApiFactory.eINSTANCE.createAsyncAPI();
    final Procedure1<AsyncAPI> _function = (AsyncAPI it) -> {
      it.setVersion(VersionNumber._200);
      Info _createInfo = AsyncApiFactory.eINSTANCE.createInfo();
      final Procedure1<Info> _function_1 = (Info it_1) -> {
        it_1.setTitle(architecture.getName());
        it_1.setVersion(architecture.getVersion());
      };
      Info _doubleArrow = ObjectExtensions.<Info>operator_doubleArrow(_createInfo, _function_1);
      it.setInfo(_doubleArrow);
      EList<Server> _servers = it.getServers();
      Iterable<Server> _servers_1 = Uml2AsyncApi.servers(model);
      Iterables.<Server>addAll(_servers, _servers_1);
      EList<Channel> _channels = it.getChannels();
      Iterable<Channel> _channels_1 = Uml2AsyncApi.channels(model);
      Iterables.<Channel>addAll(_channels, _channels_1);
      Components _createComponents = AsyncApiFactory.eINSTANCE.createComponents();
      final Procedure1<Components> _function_2 = (Components it_1) -> {
        EList<NamedMessage> _messages = it_1.getMessages();
        Iterable<NamedMessage> _messages_1 = Uml2AsyncApi.messages(model);
        Iterables.<NamedMessage>addAll(_messages, _messages_1);
        EList<NamedSchema> _schemas = it_1.getSchemas();
        Iterable<NamedSchema> _schemas_1 = Uml2AsyncApi.schemas(model);
        Iterables.<NamedSchema>addAll(_schemas, _schemas_1);
      };
      Components _doubleArrow_1 = ObjectExtensions.<Components>operator_doubleArrow(_createComponents, _function_2);
      it.setComponents(_doubleArrow_1);
    };
    return ObjectExtensions.<AsyncAPI>operator_doubleArrow(_createAsyncAPI, _function);
  }
  
  public static Iterable<Server> servers(final Model model) {
    final Function1<org.eclipse.uml2.uml.Class, Broker> _function = (org.eclipse.uml2.uml.Class clazz) -> {
      return UMLUtil.<Broker>getStereotypeApplication(clazz, Broker.class);
    };
    final Function1<Broker, Server> _function_1 = (Broker broker) -> {
      Server _createServer = AsyncApiFactory.eINSTANCE.createServer();
      final Procedure1<Server> _function_2 = (Server it) -> {
        it.setName(broker.getName());
        it.setUrl(broker.getUrl());
        it.setDescription(broker.getDescription());
        it.setProtocol(Protocol.getByName(broker.getProtocol().getName()));
      };
      return ObjectExtensions.<Server>operator_doubleArrow(_createServer, _function_2);
    };
    return IterableExtensions.<Broker, Server>map(IterableExtensions.<Broker>filterNull(ListExtensions.<org.eclipse.uml2.uml.Class, Broker>map(EcoreUtil2.<org.eclipse.uml2.uml.Class>getAllContentsOfType(model, org.eclipse.uml2.uml.Class.class), _function)), _function_1);
  }
  
  public static Iterable<Channel> channels(final Model model) {
    final Function1<Signal, Topic> _function = (Signal signal) -> {
      return UMLUtil.<Topic>getStereotypeApplication(signal, Topic.class);
    };
    final Function1<Topic, Channel> _function_1 = (Topic topic) -> {
      Channel _createChannel = AsyncApiFactory.eINSTANCE.createChannel();
      final Procedure1<Channel> _function_2 = (Channel it) -> {
        it.setName(topic.getName());
        EList<NamedParameter> _parameters = it.getParameters();
        final Function1<Parameter, NamedParameter> _function_3 = (Parameter it_1) -> {
          return Uml2AsyncApi.parameter(it_1);
        };
        List<NamedParameter> _map = ListExtensions.<Parameter, NamedParameter>map(topic.getParameters(), _function_3);
        Iterables.<NamedParameter>addAll(_parameters, _map);
        Operation _xifexpression = null;
        String _publishOpId = topic.getPublishOpId();
        boolean _tripleNotEquals = (_publishOpId != null);
        if (_tripleNotEquals) {
          Operation _createOperation = AsyncApiFactory.eINSTANCE.createOperation();
          final Procedure1<Operation> _function_4 = (Operation it_1) -> {
            it_1.setOperationId(topic.getPublishOpId());
            Reference _createReference = AsyncApiFactory.eINSTANCE.createReference();
            final Procedure1<Reference> _function_5 = (Reference it_2) -> {
              String _name = topic.getPublishes().getName();
              String _plus = (Uml2AsyncApi.MESSAGES_URI + _name);
              it_2.setUri(_plus);
            };
            Reference _doubleArrow = ObjectExtensions.<Reference>operator_doubleArrow(_createReference, _function_5);
            it_1.setMessage(_doubleArrow);
          };
          _xifexpression = ObjectExtensions.<Operation>operator_doubleArrow(_createOperation, _function_4);
        }
        it.setPublish(_xifexpression);
        Operation _xifexpression_1 = null;
        String _subscribeOpId = topic.getSubscribeOpId();
        boolean _tripleNotEquals_1 = (_subscribeOpId != null);
        if (_tripleNotEquals_1) {
          Operation _createOperation_1 = AsyncApiFactory.eINSTANCE.createOperation();
          final Procedure1<Operation> _function_5 = (Operation it_1) -> {
            it_1.setOperationId(topic.getSubscribeOpId());
            Reference _createReference = AsyncApiFactory.eINSTANCE.createReference();
            final Procedure1<Reference> _function_6 = (Reference it_2) -> {
              String _name = topic.getSubscribes().getName();
              String _plus = (Uml2AsyncApi.MESSAGES_URI + _name);
              it_2.setUri(_plus);
            };
            Reference _doubleArrow = ObjectExtensions.<Reference>operator_doubleArrow(_createReference, _function_6);
            it_1.setMessage(_doubleArrow);
          };
          _xifexpression_1 = ObjectExtensions.<Operation>operator_doubleArrow(_createOperation_1, _function_5);
        }
        it.setSubscribe(_xifexpression_1);
      };
      return ObjectExtensions.<Channel>operator_doubleArrow(_createChannel, _function_2);
    };
    return IterableExtensions.<Topic, Channel>map(IterableExtensions.<Topic>filterNull(ListExtensions.<Signal, Topic>map(EcoreUtil2.<Signal>getAllContentsOfType(model, Signal.class), _function)), _function_1);
  }
  
  public static NamedParameter parameter(final Parameter parameter) {
    NamedParameter _createNamedParameter = AsyncApiFactory.eINSTANCE.createNamedParameter();
    final Procedure1<NamedParameter> _function = (NamedParameter it) -> {
      it.setName(parameter.getName());
      io.github.abelgomez.asyncapi.asyncApi.Parameter _createParameter = AsyncApiFactory.eINSTANCE.createParameter();
      final Procedure1<io.github.abelgomez.asyncapi.asyncApi.Parameter> _function_1 = (io.github.abelgomez.asyncapi.asyncApi.Parameter it_1) -> {
        Schema _createSchema = AsyncApiFactory.eINSTANCE.createSchema();
        final Procedure1<Schema> _function_2 = (Schema it_2) -> {
          it_2.setType(JsonType.getByName(parameter.getName().toLowerCase()));
          it_2.setDescription(parameter.getDescription());
        };
        Schema _doubleArrow = ObjectExtensions.<Schema>operator_doubleArrow(_createSchema, _function_2);
        it_1.setSchema(_doubleArrow);
      };
      io.github.abelgomez.asyncapi.asyncApi.Parameter _doubleArrow = ObjectExtensions.<io.github.abelgomez.asyncapi.asyncApi.Parameter>operator_doubleArrow(_createParameter, _function_1);
      it.setParameter(_doubleArrow);
    };
    return ObjectExtensions.<NamedParameter>operator_doubleArrow(_createNamedParameter, _function);
  }
  
  public static Iterable<NamedMessage> messages(final Model model) {
    final Function1<StructuredClassifier, Message> _function = (StructuredClassifier structuredClassifier) -> {
      return UMLUtil.<Message>getStereotypeApplication(structuredClassifier, Message.class);
    };
    final Function1<Message, NamedMessage> _function_1 = (Message msg) -> {
      NamedMessage _createNamedMessage = AsyncApiFactory.eINSTANCE.createNamedMessage();
      final Procedure1<NamedMessage> _function_2 = (NamedMessage it) -> {
        it.setName(msg.getName());
        io.github.abelgomez.asyncapi.asyncApi.Message _createMessage = AsyncApiFactory.eINSTANCE.createMessage();
        final Procedure1<io.github.abelgomez.asyncapi.asyncApi.Message> _function_3 = (io.github.abelgomez.asyncapi.asyncApi.Message it_1) -> {
          it_1.setName(msg.getName());
          Reference _createReference = AsyncApiFactory.eINSTANCE.createReference();
          final Procedure1<Reference> _function_4 = (Reference it_2) -> {
            String _name = msg.getBase_StructuredClassifier().getName();
            String _plus = (Uml2AsyncApi.SCHEMAS_URI + _name);
            it_2.setUri(_plus);
          };
          Reference _doubleArrow = ObjectExtensions.<Reference>operator_doubleArrow(_createReference, _function_4);
          it_1.setPayload(_doubleArrow);
        };
        io.github.abelgomez.asyncapi.asyncApi.Message _doubleArrow = ObjectExtensions.<io.github.abelgomez.asyncapi.asyncApi.Message>operator_doubleArrow(_createMessage, _function_3);
        it.setMessage(_doubleArrow);
      };
      return ObjectExtensions.<NamedMessage>operator_doubleArrow(_createNamedMessage, _function_2);
    };
    return IterableExtensions.<Message, NamedMessage>map(IterableExtensions.<Message>filterNull(ListExtensions.<StructuredClassifier, Message>map(EcoreUtil2.<StructuredClassifier>getAllContentsOfType(model, StructuredClassifier.class), _function)), _function_1);
  }
  
  public static Iterable<NamedSchema> schemas(final Model model) {
    Stack<StructuredClassifier> candidates = new Stack<StructuredClassifier>();
    List<StructuredClassifier> classifiers = new ArrayList<StructuredClassifier>();
    final Function1<StructuredClassifier, Boolean> _function = (StructuredClassifier structuredClassifier) -> {
      Message _stereotypeApplication = UMLUtil.<Message>getStereotypeApplication(structuredClassifier, Message.class);
      return Boolean.valueOf((_stereotypeApplication != null));
    };
    Iterable<StructuredClassifier> _filter = IterableExtensions.<StructuredClassifier>filter(EcoreUtil2.<StructuredClassifier>getAllContentsOfType(model, StructuredClassifier.class), _function);
    Iterables.<StructuredClassifier>addAll(candidates, _filter);
    while ((!candidates.isEmpty())) {
      {
        final StructuredClassifier classifier = candidates.pop();
        classifiers.add(classifier);
        final Function1<Property, Type> _function_1 = (Property attribute) -> {
          return attribute.getType();
        };
        Iterable<StructuredClassifier> _filter_1 = Iterables.<StructuredClassifier>filter(ListExtensions.<Property, Type>map(classifier.getAttributes(), _function_1), StructuredClassifier.class);
        Iterables.<StructuredClassifier>addAll(candidates, _filter_1);
      }
    }
    final Function1<StructuredClassifier, NamedSchema> _function_1 = (StructuredClassifier structuredClassifier) -> {
      NamedSchema _createNamedSchema = AsyncApiFactory.eINSTANCE.createNamedSchema();
      final Procedure1<NamedSchema> _function_2 = (NamedSchema it) -> {
        it.setName(structuredClassifier.getName());
        Schema _createSchema = AsyncApiFactory.eINSTANCE.createSchema();
        final Procedure1<Schema> _function_3 = (Schema it_1) -> {
          it_1.setType(JsonType.OBJECT);
          EList<NamedSchema> _properties = it_1.getProperties();
          final Function1<Property, NamedSchema> _function_4 = (Property it_2) -> {
            return Uml2AsyncApi.schema(it_2);
          };
          List<NamedSchema> _map = ListExtensions.<Property, NamedSchema>map(structuredClassifier.getAttributes(), _function_4);
          Iterables.<NamedSchema>addAll(_properties, _map);
        };
        Schema _doubleArrow = ObjectExtensions.<Schema>operator_doubleArrow(_createSchema, _function_3);
        it.setSchema(_doubleArrow);
      };
      return ObjectExtensions.<NamedSchema>operator_doubleArrow(_createNamedSchema, _function_2);
    };
    return ListExtensions.<StructuredClassifier, NamedSchema>map(classifiers, _function_1);
  }
  
  public static NamedSchema schema(final Property property) {
    NamedSchema _createNamedSchema = AsyncApiFactory.eINSTANCE.createNamedSchema();
    final Procedure1<NamedSchema> _function = (NamedSchema it) -> {
      String _xifexpression = null;
      RedefinableProperty _stereotypeApplication = UMLUtil.<RedefinableProperty>getStereotypeApplication(property, RedefinableProperty.class);
      boolean _tripleNotEquals = (_stereotypeApplication != null);
      if (_tripleNotEquals) {
        _xifexpression = UMLUtil.<RedefinableProperty>getStereotypeApplication(property, RedefinableProperty.class).getTitle();
      } else {
        _xifexpression = property.getName();
      }
      it.setName(_xifexpression);
      boolean _isMultivalued = property.isMultivalued();
      boolean _not = (!_isMultivalued);
      if (_not) {
        it.setSchema(Uml2AsyncApi.schema(property.getType()));
      } else {
        Schema _createSchema = AsyncApiFactory.eINSTANCE.createSchema();
        final Procedure1<Schema> _function_1 = (Schema it_1) -> {
          it_1.setType(JsonType.ARRAY);
          it_1.setItems(Uml2AsyncApi.schema(property.getType()));
          it_1.setMinItems(property.lowerBound());
          it_1.setMaxItems(property.upperBound());
        };
        Schema _doubleArrow = ObjectExtensions.<Schema>operator_doubleArrow(_createSchema, _function_1);
        it.setSchema(_doubleArrow);
      }
    };
    return ObjectExtensions.<NamedSchema>operator_doubleArrow(_createNamedSchema, _function);
  }
  
  public static AbstractSchema schema(final Type type) {
    if ((type instanceof DataType)) {
      return Uml2AsyncApi.schema(((DataType)type));
    } else {
      if ((type instanceof org.eclipse.uml2.uml.Class)) {
        return Uml2AsyncApi.schema(((org.eclipse.uml2.uml.Class)type));
      }
    }
    return null;
  }
  
  public static Schema schema(final DataType dataType) {
    Schema _createSchema = AsyncApiFactory.eINSTANCE.createSchema();
    final Procedure1<Schema> _function = (Schema it) -> {
      JsonType _switchResult = null;
      String _name = dataType.getName();
      if (_name != null) {
        switch (_name) {
          case "Boolean":
            _switchResult = JsonType.BOOLEAN;
            break;
          case "Integer":
            _switchResult = JsonType.INTEGER;
            break;
          case "Real":
            _switchResult = JsonType.NUMBER;
            break;
          case "Number":
            _switchResult = JsonType.NUMBER;
            break;
          case "String":
            _switchResult = JsonType.STRING;
            break;
          case "UnlimitedNatural":
            _switchResult = JsonType.INTEGER;
            break;
          default:
            _switchResult = JsonType.STRING;
            break;
        }
      } else {
        _switchResult = JsonType.STRING;
      }
      it.setType(_switchResult);
      if ((dataType instanceof Enumeration)) {
        it.setType(JsonType.STRING);
        EList<String> _enum = it.getEnum();
        final Function1<EnumerationLiteral, String> _function_1 = (EnumerationLiteral it_1) -> {
          return it_1.getName();
        };
        List<String> _map = ListExtensions.<EnumerationLiteral, String>map(((Enumeration)dataType).getOwnedLiterals(), _function_1);
        Iterables.<String>addAll(_enum, _map);
      }
    };
    return ObjectExtensions.<Schema>operator_doubleArrow(_createSchema, _function);
  }
  
  public static Reference schema(final org.eclipse.uml2.uml.Class clazz) {
    Reference _createReference = AsyncApiFactory.eINSTANCE.createReference();
    final Procedure1<Reference> _function = (Reference it) -> {
      String _name = clazz.getName();
      String _plus = ("#/components/schemas/" + _name);
      it.setUri(_plus);
    };
    return ObjectExtensions.<Reference>operator_doubleArrow(_createReference, _function);
  }
  
  public static String diagnoseUmlFile(final IPath path) {
    final Model model = Uml2AsyncApi.loadModel(path);
    if ((model == null)) {
      return "Selected file is not a valid UML model";
    } else {
      return Uml2AsyncApi.diagnose(model);
    }
  }
  
  public static String diagnose(final Model model) {
    I40Architecture _stereotypeApplication = UMLUtil.<I40Architecture>getStereotypeApplication(model, I40Architecture.class);
    boolean _tripleEquals = (_stereotypeApplication == null);
    if (_tripleEquals) {
      return "Selected file is not a valid I4.0 Architecture UML model";
    }
    final Diagnostic diagnostic = Diagnostician.INSTANCE.validate(model);
    int _severity = diagnostic.getSeverity();
    boolean _notEquals = (_severity != Diagnostic.OK);
    if (_notEquals) {
      final Function1<Diagnostic, String> _function = (Diagnostic it) -> {
        return it.getMessage();
      };
      return IterableExtensions.join(ListExtensions.<Diagnostic, String>map(diagnostic.getChildren(), _function), ", ");
    } else {
      return null;
    }
  }
  
  public static Model loadModel(final IPath path) {
    final URI uri = URI.createPlatformResourceURI(path.toString(), true);
    final ResourceSetImpl resourceSet = new ResourceSetImpl();
    final Model model = UML2Util.<Model>load(resourceSet, uri, UMLPackage.eINSTANCE.getModel());
    Assert.isNotNull(model, "Unable to find a UML Model");
    Assert.isNotNull(UMLUtil.<I40Architecture>getStereotypeApplication(model, I40Architecture.class), "UML Model must be an I4.0 Architecture");
    return model;
  }
  
  public static Model loadModel(final InputStream stream) {
    try {
      final ResourceSetImpl resourceSet = new ResourceSetImpl();
      Map<String, Object> _protocolToFactoryMap = resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _protocolToFactoryMap.put("in-memory", _xMIResourceFactoryImpl);
      final Resource resource = resourceSet.createResource(URI.createURI("in-memory:model"));
      resource.load(stream, Collections.<Object, Object>emptyMap());
      Object _objectByType = EcoreUtil.getObjectByType(resource.getContents(), UMLPackage.eINSTANCE.getModel());
      final Model model = ((Model) _objectByType);
      Assert.isNotNull(model, "Unable to find a UML Model");
      Assert.isNotNull(UMLUtil.<I40Architecture>getStereotypeApplication(model, I40Architecture.class), "UML Model must be an I4.0 Architecture");
      return model;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
