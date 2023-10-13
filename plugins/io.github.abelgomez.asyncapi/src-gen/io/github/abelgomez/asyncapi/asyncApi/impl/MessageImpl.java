/**
 * generated by Xtext 2.26.0
 */
package io.github.abelgomez.asyncapi.asyncApi.impl;

import io.github.abelgomez.asyncapi.asyncApi.AbstractMessageTrait;
import io.github.abelgomez.asyncapi.asyncApi.AbstractSchema;
import io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage;
import io.github.abelgomez.asyncapi.asyncApi.Message;
import io.github.abelgomez.asyncapi.asyncApi.MessageIdentifier;
import io.github.abelgomez.asyncapi.asyncApi.Tag;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.MessageImpl#getName <em>Name</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.MessageImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.MessageImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.MessageImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.MessageImpl#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.MessageImpl#getHeaders <em>Headers</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.MessageImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.MessageImpl#getPayload <em>Payload</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.MessageImpl#getTraits <em>Traits</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.MessageImpl#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageImpl extends AbstractMessageImpl implements Message
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected static final String TITLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected String title = TITLE_EDEFAULT;

  /**
   * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSummary()
   * @generated
   * @ordered
   */
  protected static final String SUMMARY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSummary() <em>Summary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSummary()
   * @generated
   * @ordered
   */
  protected String summary = SUMMARY_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getDeprecated() <em>Deprecated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeprecated()
   * @generated
   * @ordered
   */
  protected static final io.github.abelgomez.asyncapi.asyncApi.Boolean DEPRECATED_EDEFAULT = io.github.abelgomez.asyncapi.asyncApi.Boolean._FALSE;

  /**
   * The cached value of the '{@link #getDeprecated() <em>Deprecated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeprecated()
   * @generated
   * @ordered
   */
  protected io.github.abelgomez.asyncapi.asyncApi.Boolean deprecated = DEPRECATED_EDEFAULT;

  /**
   * The cached value of the '{@link #getHeaders() <em>Headers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeaders()
   * @generated
   * @ordered
   */
  protected AbstractSchema headers;

  /**
   * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTags()
   * @generated
   * @ordered
   */
  protected EList<Tag> tags;

  /**
   * The cached value of the '{@link #getPayload() <em>Payload</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPayload()
   * @generated
   * @ordered
   */
  protected AbstractSchema payload;

  /**
   * The cached value of the '{@link #getTraits() <em>Traits</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTraits()
   * @generated
   * @ordered
   */
  protected EList<AbstractMessageTrait> traits;

  /**
   * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected static final MessageIdentifier IDENTIFIER_EDEFAULT = MessageIdentifier.NONE;

  /**
   * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected MessageIdentifier identifier = IDENTIFIER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MessageImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AsyncApiPackage.Literals.MESSAGE;
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
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.MESSAGE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTitle(String newTitle)
  {
    String oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.MESSAGE__TITLE, oldTitle, title));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSummary()
  {
    return summary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSummary(String newSummary)
  {
    String oldSummary = summary;
    summary = newSummary;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.MESSAGE__SUMMARY, oldSummary, summary));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.MESSAGE__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public io.github.abelgomez.asyncapi.asyncApi.Boolean getDeprecated()
  {
    return deprecated;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDeprecated(io.github.abelgomez.asyncapi.asyncApi.Boolean newDeprecated)
  {
    io.github.abelgomez.asyncapi.asyncApi.Boolean oldDeprecated = deprecated;
    deprecated = newDeprecated == null ? DEPRECATED_EDEFAULT : newDeprecated;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.MESSAGE__DEPRECATED, oldDeprecated, deprecated));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AbstractSchema getHeaders()
  {
    return headers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHeaders(AbstractSchema newHeaders, NotificationChain msgs)
  {
    AbstractSchema oldHeaders = headers;
    headers = newHeaders;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsyncApiPackage.MESSAGE__HEADERS, oldHeaders, newHeaders);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setHeaders(AbstractSchema newHeaders)
  {
    if (newHeaders != headers)
    {
      NotificationChain msgs = null;
      if (headers != null)
        msgs = ((InternalEObject)headers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsyncApiPackage.MESSAGE__HEADERS, null, msgs);
      if (newHeaders != null)
        msgs = ((InternalEObject)newHeaders).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsyncApiPackage.MESSAGE__HEADERS, null, msgs);
      msgs = basicSetHeaders(newHeaders, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.MESSAGE__HEADERS, newHeaders, newHeaders));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Tag> getTags()
  {
    if (tags == null)
    {
      tags = new EObjectContainmentEList<Tag>(Tag.class, this, AsyncApiPackage.MESSAGE__TAGS);
    }
    return tags;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AbstractSchema getPayload()
  {
    return payload;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPayload(AbstractSchema newPayload, NotificationChain msgs)
  {
    AbstractSchema oldPayload = payload;
    payload = newPayload;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsyncApiPackage.MESSAGE__PAYLOAD, oldPayload, newPayload);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPayload(AbstractSchema newPayload)
  {
    if (newPayload != payload)
    {
      NotificationChain msgs = null;
      if (payload != null)
        msgs = ((InternalEObject)payload).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsyncApiPackage.MESSAGE__PAYLOAD, null, msgs);
      if (newPayload != null)
        msgs = ((InternalEObject)newPayload).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsyncApiPackage.MESSAGE__PAYLOAD, null, msgs);
      msgs = basicSetPayload(newPayload, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.MESSAGE__PAYLOAD, newPayload, newPayload));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<AbstractMessageTrait> getTraits()
  {
    if (traits == null)
    {
      traits = new EObjectContainmentEList<AbstractMessageTrait>(AbstractMessageTrait.class, this, AsyncApiPackage.MESSAGE__TRAITS);
    }
    return traits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MessageIdentifier getIdentifier()
  {
    return identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIdentifier(MessageIdentifier newIdentifier)
  {
    MessageIdentifier oldIdentifier = identifier;
    identifier = newIdentifier == null ? IDENTIFIER_EDEFAULT : newIdentifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.MESSAGE__IDENTIFIER, oldIdentifier, identifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AsyncApiPackage.MESSAGE__HEADERS:
        return basicSetHeaders(null, msgs);
      case AsyncApiPackage.MESSAGE__TAGS:
        return ((InternalEList<?>)getTags()).basicRemove(otherEnd, msgs);
      case AsyncApiPackage.MESSAGE__PAYLOAD:
        return basicSetPayload(null, msgs);
      case AsyncApiPackage.MESSAGE__TRAITS:
        return ((InternalEList<?>)getTraits()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AsyncApiPackage.MESSAGE__NAME:
        return getName();
      case AsyncApiPackage.MESSAGE__TITLE:
        return getTitle();
      case AsyncApiPackage.MESSAGE__SUMMARY:
        return getSummary();
      case AsyncApiPackage.MESSAGE__DESCRIPTION:
        return getDescription();
      case AsyncApiPackage.MESSAGE__DEPRECATED:
        return getDeprecated();
      case AsyncApiPackage.MESSAGE__HEADERS:
        return getHeaders();
      case AsyncApiPackage.MESSAGE__TAGS:
        return getTags();
      case AsyncApiPackage.MESSAGE__PAYLOAD:
        return getPayload();
      case AsyncApiPackage.MESSAGE__TRAITS:
        return getTraits();
      case AsyncApiPackage.MESSAGE__IDENTIFIER:
        return getIdentifier();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AsyncApiPackage.MESSAGE__NAME:
        setName((String)newValue);
        return;
      case AsyncApiPackage.MESSAGE__TITLE:
        setTitle((String)newValue);
        return;
      case AsyncApiPackage.MESSAGE__SUMMARY:
        setSummary((String)newValue);
        return;
      case AsyncApiPackage.MESSAGE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case AsyncApiPackage.MESSAGE__DEPRECATED:
        setDeprecated((io.github.abelgomez.asyncapi.asyncApi.Boolean)newValue);
        return;
      case AsyncApiPackage.MESSAGE__HEADERS:
        setHeaders((AbstractSchema)newValue);
        return;
      case AsyncApiPackage.MESSAGE__TAGS:
        getTags().clear();
        getTags().addAll((Collection<? extends Tag>)newValue);
        return;
      case AsyncApiPackage.MESSAGE__PAYLOAD:
        setPayload((AbstractSchema)newValue);
        return;
      case AsyncApiPackage.MESSAGE__TRAITS:
        getTraits().clear();
        getTraits().addAll((Collection<? extends AbstractMessageTrait>)newValue);
        return;
      case AsyncApiPackage.MESSAGE__IDENTIFIER:
        setIdentifier((MessageIdentifier)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AsyncApiPackage.MESSAGE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AsyncApiPackage.MESSAGE__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case AsyncApiPackage.MESSAGE__SUMMARY:
        setSummary(SUMMARY_EDEFAULT);
        return;
      case AsyncApiPackage.MESSAGE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case AsyncApiPackage.MESSAGE__DEPRECATED:
        setDeprecated(DEPRECATED_EDEFAULT);
        return;
      case AsyncApiPackage.MESSAGE__HEADERS:
        setHeaders((AbstractSchema)null);
        return;
      case AsyncApiPackage.MESSAGE__TAGS:
        getTags().clear();
        return;
      case AsyncApiPackage.MESSAGE__PAYLOAD:
        setPayload((AbstractSchema)null);
        return;
      case AsyncApiPackage.MESSAGE__TRAITS:
        getTraits().clear();
        return;
      case AsyncApiPackage.MESSAGE__IDENTIFIER:
        setIdentifier(IDENTIFIER_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AsyncApiPackage.MESSAGE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AsyncApiPackage.MESSAGE__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case AsyncApiPackage.MESSAGE__SUMMARY:
        return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
      case AsyncApiPackage.MESSAGE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case AsyncApiPackage.MESSAGE__DEPRECATED:
        return deprecated != DEPRECATED_EDEFAULT;
      case AsyncApiPackage.MESSAGE__HEADERS:
        return headers != null;
      case AsyncApiPackage.MESSAGE__TAGS:
        return tags != null && !tags.isEmpty();
      case AsyncApiPackage.MESSAGE__PAYLOAD:
        return payload != null;
      case AsyncApiPackage.MESSAGE__TRAITS:
        return traits != null && !traits.isEmpty();
      case AsyncApiPackage.MESSAGE__IDENTIFIER:
        return identifier != IDENTIFIER_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", title: ");
    result.append(title);
    result.append(", summary: ");
    result.append(summary);
    result.append(", description: ");
    result.append(description);
    result.append(", deprecated: ");
    result.append(deprecated);
    result.append(", identifier: ");
    result.append(identifier);
    result.append(')');
    return result.toString();
  }

} //MessageImpl
