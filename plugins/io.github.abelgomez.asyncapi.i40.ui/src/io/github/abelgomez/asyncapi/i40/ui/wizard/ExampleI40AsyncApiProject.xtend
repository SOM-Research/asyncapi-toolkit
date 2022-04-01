package io.github.abelgomez.asyncapi.i40.ui.wizard

import io.github.abelgomez.asyncapi.ui.wizard.AbstractAsyncApiProjectTemplate
import java.io.ByteArrayInputStream

import static extension io.github.abelgomez.asyncapi.generator.AsyncApi2Json.*
import static extension io.github.abelgomez.asyncapi.i40.m2m.Uml2AsyncApi.*

final class ExampleI40AsyncApiProject extends AbstractAsyncApiProjectTemplate {
	
	override getLabel() {
		"Example AsyncAPI Project from I4.0 UML model"
	}

	override getDescription() {
		"<p><b>Example I4.0 UML project</b></p><p>Creates a new AsyncAPI v2.0.0 project from an example I4.0 UML model file. You can set the package the file is created in.</p>"
	}

	override createProjectFactory() {
		super.createProjectFactory => [
			addFile('''«SRC_JAVA»/«path»/I40.uml''', umlFileContents)
			addFile('''«SRC_JAVA»/«path»/I40.di''', diFileContents)
			addFile('''«SRC_JAVA»/«path»/I40.notation''', notationFileContents)
			addFile('''«SRC_JAVA»/«path»/I40.asyncapi''', new ByteArrayInputStream(umlFileContents.toString.bytes).loadModel.asyncApi.generate)
			addFile('''«SRC_JAVA»/main/SubscribeExample.java''', subscribeExampleContents)
			addFile('''«SRC_JAVA»/main/PublishExample.java''', publishExampleContents)
		]
	}
	
	def subscribeExampleContents() '''
			package main;
			
			import java.text.MessageFormat;
			
			import example.architecture.infra.IServer;
			import example.architecture.iotbox._id_.monitor.ReceiveStatusOperation;
			import example.architecture.servers.ProductionServer;
			
			public class SubscribeExample {
				public static void main(String[] args) throws Exception {
					
					// Create Server
					IServer production = ProductionServer.create();
					
					try {
						
						// Subscribe to channel on server, and set the callback function
						ReceiveStatusOperation.subscribe(production, (message, params) -> {
							System.out.println(MessageFormat.format(
								"Message received from IoTBox ''{0}''!",
								params.getId()
							));
							System.out.println(MessageFormat.format(
								"Info about production line ''{0}'':", 
								message.getPayload().getId()
							));
							message.getPayload().getBeltInfos().stream().forEach(
								belt -> System.out.println(
									MessageFormat.format(
										"Belt {0} was running at {1} m/s at {2}",
										belt.getId(),
										belt.getSpeed(),
										belt.getTimestamp()
									)
								)
							);
						});
						
						System.err.println("Press ENTER to exit");
						System.in.read();
					} finally { 
						// Unsubscribe and disconnect
						ReceiveStatusOperation.unsubscribe(production);
						production.disconnect();
					}
				}
			}
		'''
	def publishExampleContents() '''
			package main;
			
			import java.text.MessageFormat;
			import java.time.Instant;
			
			import example.architecture.components.schemas.BeltInfo;
			import example.architecture.components.schemas.PathInfo;
			import example.architecture.infra.IChannel.IChannelPublishConfiguration;
			import example.architecture.infra.IServer;
			import example.architecture.iotbox._id_.monitor.MonitorChannel.MonitorChannelParameters;
			import example.architecture.iotbox._id_.monitor.SendStatusOperation;
			import example.architecture.servers.ProductionServer;
			
			public class PublishExample  {
				public static void main(String[] args) throws Exception {
			
					// Create a connection to the Production server
					IServer production = ProductionServer.create();
			
					try {
						// Create message Payload
						PathInfo payload = PathInfo.newBuilder()
								.withId("Path_A")
								.addToBeltInfos(
									BeltInfo.newBuilder()
										.withId("Belt_A1")
										.withTimestamp(Instant.now().toString())
										.withSpeed(10)
									.build()
								)
								.addToBeltInfos(
									BeltInfo.newBuilder()
										.withId("Belt_A2")
										.withTimestamp(Instant.now().toString())
										.withSpeed(15)
									.build()
								)
							.build();
						
						// Create configuration parameters for Channel
						MonitorChannelParameters params = SendStatusOperation.newParametersBuilder()
								.withId("box1")
							.build();
						
						// Create configuration
						IChannelPublishConfiguration config = SendStatusOperation.newConfiguration(params);
			
						// Publish message
						SendStatusOperation.publish(production, config, payload);
						System.out.println(MessageFormat.format(
								"Publishing on topic ''{0}'':\n{1}", 
								config.getActualChannelName(), 
								payload.toJson()
								));
			
					} finally {
						// Disconnect
						production.disconnect();
					}
				}
			}
		'''
	
	def umlFileContents() '''
			<?xml version="1.0" encoding="UTF-8"?>
			<xmi:XMI xmi:version="20131001" xmlns:xmi="http://www.omg.org/spec/XMI/20131001" xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore" xmlns:i40="https://io.github.abelgomez/profiles/I4.0/1.0" xmlns:uml="http://www.eclipse.org/uml2/5.0.0/UML">
			  <uml:Model xmi:id="_v02EIKvIEeybpKCV4eI_mA" name="I4.0 Architecture">
			    <packageImport xmi:type="uml:PackageImport" xmi:id="_v8GisKvIEeybpKCV4eI_mA">
			      <importedPackage xmi:type="uml:Model" href="pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#_0"/>
			    </packageImport>
			    <packagedElement xmi:type="uml:Class" xmi:id="_yLcIEKvIEeybpKCV4eI_mA" name="Broker"/>
			    <packagedElement xmi:type="uml:Component" xmi:id="_XJKWoK6_EeybpKCV4eI_mA" name="Cloud">
			      <ownedOperation xmi:type="uml:Operation" xmi:id="_c9P1IK6_EeybpKCV4eI_mA" name="handleMonitorMessage"/>
			    </packagedElement>
			    <packagedElement xmi:type="uml:Package" xmi:id="_jWUQAK6_EeybpKCV4eI_mA" name="Topics">
			      <packagedElement xmi:type="uml:Signal" xmi:id="_lafHMK6_EeybpKCV4eI_mA" name="Monitor"/>
			      <packagedElement xmi:type="uml:Signal" xmi:id="_QgUvgK7BEeybpKCV4eI_mA" name="Configure"/>
			    </packagedElement>
			    <packagedElement xmi:type="uml:Package" xmi:id="_xtzS8K6_EeybpKCV4eI_mA" name="Messages">
			      <packagedElement xmi:type="uml:Class" xmi:id="_zwbSAK6_EeybpKCV4eI_mA" name="PathInfo">
			        <ownedAttribute xmi:type="uml:Property" xmi:id="_4OFJEK6_EeybpKCV4eI_mA" name="id">
			          <type xmi:type="uml:PrimitiveType" href="pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String"/>
			        </ownedAttribute>
			        <ownedAttribute xmi:type="uml:Property" xmi:id="_I4WG867AEeybpKCV4eI_mA" name="beltInfos" type="_FrUKQK7AEeybpKCV4eI_mA" aggregation="composite" association="_I4WG8K7AEeybpKCV4eI_mA">
			          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_I4WG9K7AEeybpKCV4eI_mA"/>
			          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_I4WG9a7AEeybpKCV4eI_mA" value="*"/>
			        </ownedAttribute>
			      </packagedElement>
			      <packagedElement xmi:type="uml:Class" xmi:id="_FrUKQK7AEeybpKCV4eI_mA" name="BeltInfo">
			        <ownedAttribute xmi:type="uml:Property" xmi:id="_K6Wa8K7AEeybpKCV4eI_mA" name="id">
			          <type xmi:type="uml:PrimitiveType" href="pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String"/>
			        </ownedAttribute>
			        <ownedAttribute xmi:type="uml:Property" xmi:id="_O0GTsK7AEeybpKCV4eI_mA" name="ts">
			          <type xmi:type="uml:PrimitiveType" href="pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String"/>
			        </ownedAttribute>
			        <ownedAttribute xmi:type="uml:Property" xmi:id="_Rc464K7AEeybpKCV4eI_mA" name="speed">
			          <type xmi:type="uml:PrimitiveType" href="pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer"/>
			        </ownedAttribute>
			      </packagedElement>
			      <packagedElement xmi:type="uml:Class" xmi:id="_r9BxsK7AEeybpKCV4eI_mA" name="Configuration">
			        <ownedAttribute xmi:type="uml:Property" xmi:id="_33RWI67AEeybpKCV4eI_mA" name="monitoringfrequency" type="_wY45AK7AEeybpKCV4eI_mA" aggregation="composite" association="_33RWIK7AEeybpKCV4eI_mA">
			          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_33RWJK7AEeybpKCV4eI_mA"/>
			          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_33RWJa7AEeybpKCV4eI_mA" value="1"/>
			        </ownedAttribute>
			      </packagedElement>
			      <packagedElement xmi:type="uml:Class" xmi:id="_wY45AK7AEeybpKCV4eI_mA" name="MonitoringFrequency">
			        <ownedAttribute xmi:type="uml:Property" xmi:id="_0whAkK7AEeybpKCV4eI_mA" name="value">
			          <type xmi:type="uml:PrimitiveType" href="pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#UnlimitedNatural"/>
			        </ownedAttribute>
			        <ownedAttribute xmi:type="uml:Property" xmi:id="_lbTFsLETEeyBt5AVblrBtA" name="unit" type="_H2TF0LEKEeyyJ9apTmcH_g"/>
			      </packagedElement>
			      <packagedElement xmi:type="uml:Enumeration" xmi:id="_H2TF0LEKEeyyJ9apTmcH_g" name="Unit">
			        <ownedLiteral xmi:type="uml:EnumerationLiteral" xmi:id="_O48CILEKEeyyJ9apTmcH_g" name="seconds"/>
			        <ownedLiteral xmi:type="uml:EnumerationLiteral" xmi:id="_Pu4ysLEKEeyyJ9apTmcH_g" name="minutes"/>
			      </packagedElement>
			    </packagedElement>
			    <packagedElement xmi:type="uml:Association" xmi:id="_I4WG8K7AEeybpKCV4eI_mA" memberEnd="_I4WG867AEeybpKCV4eI_mA _I4WG9q7AEeybpKCV4eI_mA">
			      <eAnnotations xmi:type="ecore:EAnnotation" xmi:id="_I4WG8a7AEeybpKCV4eI_mA" source="org.eclipse.papyrus">
			        <details xmi:type="ecore:EStringToStringMapEntry" xmi:id="_I4WG8q7AEeybpKCV4eI_mA" key="nature" value="UML_Nature"/>
			      </eAnnotations>
			      <ownedEnd xmi:type="uml:Property" xmi:id="_I4WG9q7AEeybpKCV4eI_mA" name="pathinfo" type="_zwbSAK6_EeybpKCV4eI_mA" association="_I4WG8K7AEeybpKCV4eI_mA"/>
			    </packagedElement>
			    <packagedElement xmi:type="uml:Association" xmi:id="_33RWIK7AEeybpKCV4eI_mA" memberEnd="_33RWI67AEeybpKCV4eI_mA _33RWJq7AEeybpKCV4eI_mA">
			      <eAnnotations xmi:type="ecore:EAnnotation" xmi:id="_33RWIa7AEeybpKCV4eI_mA" source="org.eclipse.papyrus">
			        <details xmi:type="ecore:EStringToStringMapEntry" xmi:id="_33RWIq7AEeybpKCV4eI_mA" key="nature" value="UML_Nature"/>
			      </eAnnotations>
			      <ownedEnd xmi:type="uml:Property" xmi:id="_33RWJq7AEeybpKCV4eI_mA" name="configuration" type="_r9BxsK7AEeybpKCV4eI_mA" association="_33RWIK7AEeybpKCV4eI_mA"/>
			    </packagedElement>
			    <packagedElement xmi:type="uml:Component" xmi:id="_uUwBkK7BEeybpKCV4eI_mA" name="IoTBox">
			      <ownedAttribute xmi:type="uml:Property" xmi:id="_NAz2gK7TEey-46jH0ooPYA" name="monitoringFrequency">
			        <type xmi:type="uml:PrimitiveType" href="pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#UnlimitedNatural"/>
			      </ownedAttribute>
			      <ownedOperation xmi:type="uml:Operation" xmi:id="_PTabAK7CEeybpKCV4eI_mA" name="controlLoop"/>
			      <ownedOperation xmi:type="uml:Operation" xmi:id="_QMILsK7CEeybpKCV4eI_mA" name="configure">
			        <ownedParameter xmi:type="uml:Parameter" xmi:id="_TRntQK7TEey-46jH0ooPYA" name="frequency">
			          <type xmi:type="uml:PrimitiveType" href="pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#UnlimitedNatural"/>
			        </ownedParameter>
			      </ownedOperation>
			    </packagedElement>
			    <packagedElement xmi:type="uml:Component" xmi:id="_vmf9UK7BEeybpKCV4eI_mA" name="Path">
			      <ownedAttribute xmi:type="uml:Property" xmi:id="__0Ci8K7BEeybpKCV4eI_mA" name="id">
			        <type xmi:type="uml:PrimitiveType" href="pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String"/>
			      </ownedAttribute>
			      <ownedAttribute xmi:type="uml:Property" xmi:id="_HpeOI67CEeybpKCV4eI_mA" name="belts" type="_wtTNUK7BEeybpKCV4eI_mA" aggregation="shared" association="_HpeOIK7CEeybpKCV4eI_mA">
			        <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_HpeOJK7CEeybpKCV4eI_mA"/>
			        <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_HpeOJa7CEeybpKCV4eI_mA" value="*"/>
			      </ownedAttribute>
			    </packagedElement>
			    <packagedElement xmi:type="uml:Component" xmi:id="_wtTNUK7BEeybpKCV4eI_mA" name="Belt">
			      <ownedAttribute xmi:type="uml:Property" xmi:id="_B6LwEK7CEeybpKCV4eI_mA" name="id">
			        <type xmi:type="uml:PrimitiveType" href="pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String"/>
			      </ownedAttribute>
			      <ownedAttribute xmi:type="uml:Property" xmi:id="_DjXUYK7CEeybpKCV4eI_mA" name="currentSpeed">
			        <type xmi:type="uml:PrimitiveType" href="pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer"/>
			      </ownedAttribute>
			    </packagedElement>
			    <packagedElement xmi:type="uml:Component" xmi:id="_xuTXUK7BEeybpKCV4eI_mA" name="Frontend">
			      <ownedOperation xmi:type="uml:Operation" xmi:id="_RA4CYK7CEeybpKCV4eI_mA" name="configure">
			        <ownedParameter xmi:type="uml:Parameter" xmi:id="_h0JLQK7CEeybpKCV4eI_mA" name="pathId">
			          <type xmi:type="uml:PrimitiveType" href="pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String"/>
			        </ownedParameter>
			        <ownedParameter xmi:type="uml:Parameter" xmi:id="_lxnGYK7CEeybpKCV4eI_mA" name="frequency">
			          <type xmi:type="uml:PrimitiveType" href="pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#UnlimitedNatural"/>
			        </ownedParameter>
			      </ownedOperation>
			    </packagedElement>
			    <packagedElement xmi:type="uml:Association" xmi:id="_HpeOIK7CEeybpKCV4eI_mA" memberEnd="_HpeOI67CEeybpKCV4eI_mA _HpeOJq7CEeybpKCV4eI_mA">
			      <eAnnotations xmi:type="ecore:EAnnotation" xmi:id="_HpeOIa7CEeybpKCV4eI_mA" source="org.eclipse.papyrus">
			        <details xmi:type="ecore:EStringToStringMapEntry" xmi:id="_HpeOIq7CEeybpKCV4eI_mA" key="nature" value="UML_Nature"/>
			      </eAnnotations>
			      <ownedEnd xmi:type="uml:Property" xmi:id="_HpeOJq7CEeybpKCV4eI_mA" name="path" type="_vmf9UK7BEeybpKCV4eI_mA" association="_HpeOIK7CEeybpKCV4eI_mA">
			        <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_KfcVsK7CEeybpKCV4eI_mA"/>
			      </ownedEnd>
			    </packagedElement>
			    <packagedElement xmi:type="uml:Association" xmi:id="_M0EDsK7CEeybpKCV4eI_mA" memberEnd="_M0EDs67CEeybpKCV4eI_mA _M0EDtK7CEeybpKCV4eI_mA">
			      <eAnnotations xmi:type="ecore:EAnnotation" xmi:id="_M0EDsa7CEeybpKCV4eI_mA" source="org.eclipse.papyrus">
			        <details xmi:type="ecore:EStringToStringMapEntry" xmi:id="_M0EDsq7CEeybpKCV4eI_mA" key="nature" value="UML_Nature"/>
			      </eAnnotations>
			      <ownedEnd xmi:type="uml:Property" xmi:id="_M0EDs67CEeybpKCV4eI_mA" name="path" type="_vmf9UK7BEeybpKCV4eI_mA" association="_M0EDsK7CEeybpKCV4eI_mA"/>
			      <ownedEnd xmi:type="uml:Property" xmi:id="_M0EDtK7CEeybpKCV4eI_mA" name="iotbox" type="_uUwBkK7BEeybpKCV4eI_mA" association="_M0EDsK7CEeybpKCV4eI_mA"/>
			    </packagedElement>
			    <profileApplication xmi:type="uml:ProfileApplication" xmi:id="_v6xtAKvIEeybpKCV4eI_mA">
			      <eAnnotations xmi:type="ecore:EAnnotation" xmi:id="_v6ziMKvIEeybpKCV4eI_mA" source="http://www.eclipse.org/uml2/2.0.0/UML">
			        <references xmi:type="ecore:EPackage" href="https://io.github.abelgomez/profiles/I4.0/1.0#/"/>
			      </eAnnotations>
			      <appliedProfile xmi:type="uml:Profile" href="pathmap://I40_PROFILES/i40.profile.uml#_feSzsGGeEeyTgIN4Smg6_Q"/>
			    </profileApplication>
			    <profileApplication xmi:type="uml:ProfileApplication" xmi:id="_5bAPMa6_EeybpKCV4eI_mA">
			      <eAnnotations xmi:type="ecore:EAnnotation" xmi:id="_5bAPMq6_EeybpKCV4eI_mA" source="http://www.eclipse.org/uml2/2.0.0/UML">
			        <references xmi:type="ecore:EPackage" href="pathmap://PAPYRUS_ACTIONLANGUAGE_PROFILE/ActionLanguage-Profile.profile.uml#_Kv8EIKFXEeS_KNX0nfvIVQ"/>
			      </eAnnotations>
			      <appliedProfile xmi:type="uml:Profile" href="pathmap://PAPYRUS_ACTIONLANGUAGE_PROFILE/ActionLanguage-Profile.profile.uml#ActionLanguage"/>
			    </profileApplication>
			  </uml:Model>
			  <i40:Broker xmi:id="_13eU8KvIEeybpKCV4eI_mA" name="production" url="example.com:1883" protocol="mqtt" description="Example production broker" base_Class="_yLcIEKvIEeybpKCV4eI_mA"/>
			  <i40:I40Component xmi:id="_aECzYK6_EeybpKCV4eI_mA" base_Component="_XJKWoK6_EeybpKCV4eI_mA" broker="_13eU8KvIEeybpKCV4eI_mA"/>
			  <i40:Subscriber xmi:id="_ffyqYK6_EeybpKCV4eI_mA" base_Operation="_c9P1IK6_EeybpKCV4eI_mA" topic="_nyGe0K6_EeybpKCV4eI_mA"/>
			  <i40:Topic xmi:id="_nyGe0K6_EeybpKCV4eI_mA" name="iotbox/{id}/monitor" base_Signal="_lafHMK6_EeybpKCV4eI_mA" publishOpId="sendStatus" subscribeOpId="receiveStatus" publishes="_1BobMK6_EeybpKCV4eI_mA" subscribes="_1BobMK6_EeybpKCV4eI_mA">
			    <parameters xmi:type="i40:Parameter" xmi:id="_o54mQK6_EeybpKCV4eI_mA" name="id" type="String"/>
			  </i40:Topic>
			  <i40:Message xmi:id="_1BobMK6_EeybpKCV4eI_mA" base_StructuredClassifier="_zwbSAK6_EeybpKCV4eI_mA" name="MonitorMessage"/>
			  <i40:Message xmi:id="_8LchEK7AEeybpKCV4eI_mA" base_StructuredClassifier="_r9BxsK7AEeybpKCV4eI_mA" name="ConfigurationMessage"/>
			  <i40:Topic xmi:id="_S-KD4K7BEeybpKCV4eI_mA" name="iotbox/{id}/configure" base_Signal="_QgUvgK7BEeybpKCV4eI_mA" publishOpId="sendServiceConfiguration" subscribeOpId="receiveServiceConfiguration" publishes="_8LchEK7AEeybpKCV4eI_mA" subscribes="_8LchEK7AEeybpKCV4eI_mA">
			    <parameters xmi:type="i40:Parameter" xmi:id="_VNaJsK7BEeybpKCV4eI_mA" name="id" type="String"/>
			  </i40:Topic>
			  <i40:I40Component xmi:id="_2xSwEK7BEeybpKCV4eI_mA" base_Component="_uUwBkK7BEeybpKCV4eI_mA" broker="_13eU8KvIEeybpKCV4eI_mA"/>
			  <i40:I40Component xmi:id="_6hwxAK7BEeybpKCV4eI_mA" base_Component="_xuTXUK7BEeybpKCV4eI_mA" broker="_13eU8KvIEeybpKCV4eI_mA"/>
			  <i40:Subscriber xmi:id="_Wg7KkK7CEeybpKCV4eI_mA" base_Operation="_QMILsK7CEeybpKCV4eI_mA" topic="_S-KD4K7BEeybpKCV4eI_mA"/>
			  <i40:Publisher xmi:id="_XLLBcK7CEeybpKCV4eI_mA" base_Operation="_PTabAK7CEeybpKCV4eI_mA" topic="_nyGe0K6_EeybpKCV4eI_mA"/>
			  <i40:Publisher xmi:id="_YDqIoK7CEeybpKCV4eI_mA" base_Operation="_RA4CYK7CEeybpKCV4eI_mA" topic="_S-KD4K7BEeybpKCV4eI_mA"/>
			  <i40:I40Architecture xmi:id="_kqahgLD2EeybW7YPbkN5xw" name="Example Architecture" version="0.1.0" base_Model="_v02EIKvIEeybpKCV4eI_mA"/>
			  <i40:RedefinableProperty xmi:id="_KdHU0LG_Eey86v2jwzb-qA" base_Property="_O0GTsK7AEeybpKCV4eI_mA" title="timestamp"/>
			</xmi:XMI>
			'''
	def diFileContents() '''
			<?xml version="1.0" encoding="UTF-8"?>
			<architecture:ArchitectureDescription xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:architecture="http://www.eclipse.org/papyrus/infra/core/architecture" contextId="org.eclipse.papyrus.infra.services.edit.TypeContext"/>
			'''

	def notationFileContents() '''
			<?xml version="1.0" encoding="UTF-8"?>
			<notation:Diagram xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore" xmlns:notation="http://www.eclipse.org/gmf/runtime/1.0.3/notation" xmlns:style="http://www.eclipse.org/papyrus/infra/gmfdiag/style" xmlns:uml="http://www.eclipse.org/uml2/5.0.0/UML" xmi:id="_v2tFUKvIEeybpKCV4eI_mA" type="PapyrusUMLClassDiagram" name="Class Diagram" measurementUnit="Pixel">
			  <children xmi:type="notation:Shape" xmi:id="_yLkq8KvIEeybpKCV4eI_mA" type="Class_Shape">
			    <children xmi:type="notation:DecorationNode" xmi:id="_yLrYoKvIEeybpKCV4eI_mA" type="Class_NameLabel"/>
			    <children xmi:type="notation:DecorationNode" xmi:id="_yLrYoavIEeybpKCV4eI_mA" type="Class_FloatingNameLabel">
			      <layoutConstraint xmi:type="notation:Location" xmi:id="_yLrYoqvIEeybpKCV4eI_mA" y="15"/>
			    </children>
			    <children xmi:type="notation:BasicCompartment" xmi:id="_yLr_sKvIEeybpKCV4eI_mA" type="Class_AttributeCompartment">
			      <styles xmi:type="notation:TitleStyle" xmi:id="_yLr_savIEeybpKCV4eI_mA"/>
			      <styles xmi:type="notation:SortingStyle" xmi:id="_yLr_sqvIEeybpKCV4eI_mA"/>
			      <styles xmi:type="notation:FilteringStyle" xmi:id="_yLr_s6vIEeybpKCV4eI_mA"/>
			      <layoutConstraint xmi:type="notation:Bounds" xmi:id="_yLr_tKvIEeybpKCV4eI_mA"/>
			    </children>
			    <children xmi:type="notation:BasicCompartment" xmi:id="_yLr_tavIEeybpKCV4eI_mA" type="Class_OperationCompartment">
			      <styles xmi:type="notation:TitleStyle" xmi:id="_yLr_tqvIEeybpKCV4eI_mA"/>
			      <styles xmi:type="notation:SortingStyle" xmi:id="_yLr_t6vIEeybpKCV4eI_mA"/>
			      <styles xmi:type="notation:FilteringStyle" xmi:id="_yLr_uKvIEeybpKCV4eI_mA"/>
			      <layoutConstraint xmi:type="notation:Bounds" xmi:id="_yLr_uavIEeybpKCV4eI_mA"/>
			    </children>
			    <children xmi:type="notation:BasicCompartment" xmi:id="_yLr_uqvIEeybpKCV4eI_mA" type="Class_NestedClassifierCompartment">
			      <styles xmi:type="notation:TitleStyle" xmi:id="_yLr_u6vIEeybpKCV4eI_mA"/>
			      <styles xmi:type="notation:SortingStyle" xmi:id="_yLr_vKvIEeybpKCV4eI_mA"/>
			      <styles xmi:type="notation:FilteringStyle" xmi:id="_yLr_vavIEeybpKCV4eI_mA"/>
			      <layoutConstraint xmi:type="notation:Bounds" xmi:id="_yLr_vqvIEeybpKCV4eI_mA"/>
			    </children>
			    <children xmi:type="notation:BasicCompartment" xmi:id="_146fYKvIEeybpKCV4eI_mA" type="StereotypeCompartment">
			      <eAnnotations xmi:type="ecore:EAnnotation" xmi:id="_AOAq8KvJEeybpKCV4eI_mA" source="PapyrusCSSForceValue">
			        <details xmi:type="ecore:EStringToStringMapEntry" xmi:id="_AOAq8avJEeybpKCV4eI_mA" key="visible" value="true"/>
			      </eAnnotations>
			      <styles xmi:type="notation:TitleStyle" xmi:id="_146fYavIEeybpKCV4eI_mA"/>
			      <styles xmi:type="notation:StringValueStyle" xmi:id="_146fYqvIEeybpKCV4eI_mA" name="stereotype" stringValue="I4.0 Profile::Broker"/>
			      <element xmi:type="uml:Stereotype" href="pathmap://I40_PROFILES/i40.profile.uml#_WAMaMGGhEeyTgIN4Smg6_Q"/>
			      <layoutConstraint xmi:type="notation:Bounds" xmi:id="_146fY6vIEeybpKCV4eI_mA"/>
			    </children>
			    <element xmi:type="uml:Class" href="I40.uml#_yLcIEKvIEeybpKCV4eI_mA"/>
			    <layoutConstraint xmi:type="notation:Bounds" xmi:id="_yLkq8avIEeybpKCV4eI_mA" x="60" y="280" width="341" height="121"/>
			  </children>
			  <children xmi:type="notation:Shape" xmi:id="_XJ0d8K6_EeybpKCV4eI_mA" type="Component_Shape">
			    <children xmi:type="notation:DecorationNode" xmi:id="_XJ0d8q6_EeybpKCV4eI_mA" type="Component_NameLabel"/>
			    <children xmi:type="notation:DecorationNode" xmi:id="_XJ0d866_EeybpKCV4eI_mA" type="Component_FloatingNameLabel">
			      <layoutConstraint xmi:type="notation:Location" xmi:id="_XJ0d9K6_EeybpKCV4eI_mA" y="15"/>
			    </children>
			    <children xmi:type="notation:BasicCompartment" xmi:id="_XJ0d9a6_EeybpKCV4eI_mA" type="Component_AttributeCompartment">
			      <styles xmi:type="notation:TitleStyle" xmi:id="_XJ0d9q6_EeybpKCV4eI_mA"/>
			      <styles xmi:type="notation:SortingStyle" xmi:id="_XJ0d966_EeybpKCV4eI_mA"/>
			      <styles xmi:type="notation:FilteringStyle" xmi:id="_XJ0d-K6_EeybpKCV4eI_mA"/>
			      <layoutConstraint xmi:type="notation:Bounds" xmi:id="_XJ0d-a6_EeybpKCV4eI_mA"/>
			    </children>
			    <children xmi:type="notation:BasicCompartment" xmi:id="_XJ0d-q6_EeybpKCV4eI_mA" type="Component_OperationCompartment">
			      <children xmi:type="notation:Shape" xmi:id="_c9a0QK6_EeybpKCV4eI_mA" type="Operation_ComponentOperationLabel">
			        <children xmi:type="notation:BasicCompartment" xmi:id="_fgiRQ66_EeybpKCV4eI_mA" type="StereotypeBrace">
			          <eAnnotations xmi:type="ecore:EAnnotation" xmi:id="_rpacsK7BEeybpKCV4eI_mA" source="PapyrusCSSForceValue">
			            <details xmi:type="ecore:EStringToStringMapEntry" xmi:id="_rpacsa7BEeybpKCV4eI_mA" key="visible" value="true"/>
			          </eAnnotations>
			          <styles xmi:type="notation:TitleStyle" xmi:id="_fgiRRK6_EeybpKCV4eI_mA"/>
			          <styles xmi:type="notation:StringValueStyle" xmi:id="_fgiRRa6_EeybpKCV4eI_mA" name="stereotype" stringValue="I4.0 Profile::Subscriber"/>
			          <element xmi:type="uml:Stereotype" href="pathmap://I40_PROFILES/i40.profile.uml#_KGYosGGjEeyTgIN4Smg6_Q"/>
			          <layoutConstraint xmi:type="notation:Bounds" xmi:id="_fgiRRq6_EeybpKCV4eI_mA"/>
			        </children>
			        <styles xmi:type="notation:IntValueStyle" xmi:id="_qLyBEK7BEeybpKCV4eI_mA" name="shapeDirection"/>
			        <element xmi:type="uml:Operation" href="I40.uml#_c9P1IK6_EeybpKCV4eI_mA"/>
			        <layoutConstraint xmi:type="notation:Location" xmi:id="_c9a0Qa6_EeybpKCV4eI_mA"/>
			      </children>
			      <styles xmi:type="notation:TitleStyle" xmi:id="_XJ0d-66_EeybpKCV4eI_mA"/>
			      <styles xmi:type="notation:SortingStyle" xmi:id="_XJ0d_K6_EeybpKCV4eI_mA"/>
			      <styles xmi:type="notation:FilteringStyle" xmi:id="_XJ0d_a6_EeybpKCV4eI_mA"/>
			      <layoutConstraint xmi:type="notation:Bounds" xmi:id="_XJ0d_q6_EeybpKCV4eI_mA"/>
			    </children>
			    <children xmi:type="notation:BasicCompartment" xmi:id="_XJ0d_66_EeybpKCV4eI_mA" type="Component_NestedClassifierCompartment">
			      <styles xmi:type="notation:TitleStyle" xmi:id="_XJ0eAK6_EeybpKCV4eI_mA"/>
			      <styles xmi:type="notation:SortingStyle" xmi:id="_XJ0eAa6_EeybpKCV4eI_mA"/>
			      <styles xmi:type="notation:FilteringStyle" xmi:id="_XJ0eAq6_EeybpKCV4eI_mA"/>
			      <layoutConstraint xmi:type="notation:Bounds" xmi:id="_XJ0eA66_EeybpKCV4eI_mA"/>
			    </children>
			    <children xmi:type="notation:BasicCompartment" xmi:id="__rLupq7REey-46jH0ooPYA" type="StereotypeCompartment">
			      <eAnnotations xmi:type="ecore:EAnnotation" xmi:id="_4QoMIK7SEey-46jH0ooPYA" source="PapyrusCSSForceValue">
			        <details xmi:type="ecore:EStringToStringMapEntry" xmi:id="_4QoMIa7SEey-46jH0ooPYA" key="visible" value="true"/>
			      </eAnnotations>
			      <styles xmi:type="notation:TitleStyle" xmi:id="__rLup67REey-46jH0ooPYA"/>
			      <styles xmi:type="notation:StringValueStyle" xmi:id="__rLuqK7REey-46jH0ooPYA" name="stereotype" stringValue="I4.0 Profile::I4.0 Component"/>
			      <element xmi:type="uml:Stereotype" href="pathmap://I40_PROFILES/i40.profile.uml#_dHR00GGlEeyTgIN4Smg6_Q"/>
			      <layoutConstraint xmi:type="notation:Bounds" xmi:id="__rLuqa7REey-46jH0ooPYA"/>
			    </children>
			    <children xmi:type="notation:BasicCompartment" xmi:id="__rEZ4K7REey-46jH0ooPYA" visible="false" type="StereotypeBrace">
			      <eAnnotations xmi:type="ecore:EAnnotation" xmi:id="_5F8qkK7SEey-46jH0ooPYA" source="PapyrusCSSForceValue">
			        <details xmi:type="ecore:EStringToStringMapEntry" xmi:id="_5F9RoK7SEey-46jH0ooPYA" key="visible" value="true"/>
			      </eAnnotations>
			      <styles xmi:type="notation:TitleStyle" xmi:id="__rEZ4a7REey-46jH0ooPYA"/>
			      <styles xmi:type="notation:StringValueStyle" xmi:id="__rEZ4q7REey-46jH0ooPYA" name="stereotype" stringValue="I4.0 Profile::I4.0 Component"/>
			      <element xmi:type="uml:Stereotype" href="pathmap://I40_PROFILES/i40.profile.uml#_dHR00GGlEeyTgIN4Smg6_Q"/>
			      <layoutConstraint xmi:type="notation:Bounds" xmi:id="__rEZ467REey-46jH0ooPYA"/>
			    </children>
			    <styles xmi:type="notation:IntValueStyle" xmi:id="_4AFOsK7SEey-46jH0ooPYA" name="shapeDirection" intValue="4"/>
			    <element xmi:type="uml:Component" href="I40.uml#_XJKWoK6_EeybpKCV4eI_mA"/>
			    <layoutConstraint xmi:type="notation:Bounds" xmi:id="_XJ0d8a6_EeybpKCV4eI_mA" x="60" y="440"/>
			  </children>
			  <children xmi:type="notation:Shape" xmi:id="_jWUQAa6_EeybpKCV4eI_mA" type="Package_Shape">
			    <children xmi:type="notation:DecorationNode" xmi:id="_jWUQA66_EeybpKCV4eI_mA" type="Package_NameLabel"/>
			    <children xmi:type="notation:BasicCompartment" xmi:id="_jWUQBK6_EeybpKCV4eI_mA" type="Package_PackagedElementCompartment">
			      <children xmi:type="notation:Shape" xmi:id="_lao4MK6_EeybpKCV4eI_mA" type="Signal_Shape_CN">
			        <children xmi:type="notation:DecorationNode" xmi:id="_lao4Mq6_EeybpKCV4eI_mA" type="Signal_NameLabel_CN"/>
			        <children xmi:type="notation:DecorationNode" xmi:id="_lao4M66_EeybpKCV4eI_mA" type="Signal_FloatingNameLabel_CN">
			          <layoutConstraint xmi:type="notation:Location" xmi:id="_lao4NK6_EeybpKCV4eI_mA" y="15"/>
			        </children>
			        <children xmi:type="notation:BasicCompartment" xmi:id="_lao4Na6_EeybpKCV4eI_mA" type="Signal_AttributeCompartment_CN">
			          <styles xmi:type="notation:TitleStyle" xmi:id="_lao4Nq6_EeybpKCV4eI_mA"/>
			          <styles xmi:type="notation:SortingStyle" xmi:id="_lao4N66_EeybpKCV4eI_mA"/>
			          <styles xmi:type="notation:FilteringStyle" xmi:id="_lao4OK6_EeybpKCV4eI_mA"/>
			          <layoutConstraint xmi:type="notation:Bounds" xmi:id="_lao4Oa6_EeybpKCV4eI_mA"/>
			        </children>
			        <children xmi:type="notation:BasicCompartment" xmi:id="_ny6XIK6_EeybpKCV4eI_mA" type="StereotypeCompartment">
			          <eAnnotations xmi:type="ecore:EAnnotation" xmi:id="_dm7O0K7AEeybpKCV4eI_mA" source="PapyrusCSSForceValue">
			            <details xmi:type="ecore:EStringToStringMapEntry" xmi:id="_dm7O0a7AEeybpKCV4eI_mA" key="visible" value="true"/>
			            <details xmi:type="ecore:EStringToStringMapEntry" xmi:id="_-cp4QK7MEeygZ9ijIBRV9g" key="collapsed" value="true"/>
			          </eAnnotations>
			          <styles xmi:type="notation:TitleStyle" xmi:id="_ny6XIa6_EeybpKCV4eI_mA"/>
			          <styles xmi:type="notation:StringValueStyle" xmi:id="_ny6XIq6_EeybpKCV4eI_mA" name="stereotype" stringValue="I4.0 Profile::Topic"/>
			          <element xmi:type="uml:Stereotype" href="pathmap://I40_PROFILES/i40.profile.uml#_c5kQUGGiEeyTgIN4Smg6_Q"/>
			          <layoutConstraint xmi:type="notation:Bounds" xmi:id="_ny6XI66_EeybpKCV4eI_mA"/>
			        </children>
			        <element xmi:type="uml:Signal" href="I40.uml#_lafHMK6_EeybpKCV4eI_mA"/>
			        <layoutConstraint xmi:type="notation:Bounds" xmi:id="_lao4Ma6_EeybpKCV4eI_mA" x="14" y="12" width="261" height="181"/>
			      </children>
			      <children xmi:type="notation:Shape" xmi:id="_QgxbcK7BEeybpKCV4eI_mA" type="Signal_Shape_CN">
			        <children xmi:type="notation:DecorationNode" xmi:id="_Qgxbcq7BEeybpKCV4eI_mA" type="Signal_NameLabel_CN"/>
			        <children xmi:type="notation:DecorationNode" xmi:id="_Qgxbc67BEeybpKCV4eI_mA" type="Signal_FloatingNameLabel_CN">
			          <layoutConstraint xmi:type="notation:Location" xmi:id="_QgxbdK7BEeybpKCV4eI_mA" y="15"/>
			        </children>
			        <children xmi:type="notation:BasicCompartment" xmi:id="_Qgxbda7BEeybpKCV4eI_mA" type="Signal_AttributeCompartment_CN">
			          <styles xmi:type="notation:TitleStyle" xmi:id="_Qgxbdq7BEeybpKCV4eI_mA"/>
			          <styles xmi:type="notation:SortingStyle" xmi:id="_Qgxbd67BEeybpKCV4eI_mA"/>
			          <styles xmi:type="notation:FilteringStyle" xmi:id="_QgxbeK7BEeybpKCV4eI_mA"/>
			          <layoutConstraint xmi:type="notation:Bounds" xmi:id="_Qgxbea7BEeybpKCV4eI_mA"/>
			        </children>
			        <children xmi:type="notation:BasicCompartment" xmi:id="_S_UhgK7BEeybpKCV4eI_mA" type="StereotypeCompartment">
			          <eAnnotations xmi:type="ecore:EAnnotation" xmi:id="_faj6MK7BEeybpKCV4eI_mA" source="PapyrusCSSForceValue">
			            <details xmi:type="ecore:EStringToStringMapEntry" xmi:id="_faj6Ma7BEeybpKCV4eI_mA" key="visible" value="true"/>
			          </eAnnotations>
			          <styles xmi:type="notation:TitleStyle" xmi:id="_S_Uhga7BEeybpKCV4eI_mA"/>
			          <styles xmi:type="notation:StringValueStyle" xmi:id="_S_Uhgq7BEeybpKCV4eI_mA" name="stereotype" stringValue="I4.0 Profile::Topic"/>
			          <element xmi:type="uml:Stereotype" href="pathmap://I40_PROFILES/i40.profile.uml#_c5kQUGGiEeyTgIN4Smg6_Q"/>
			          <layoutConstraint xmi:type="notation:Bounds" xmi:id="_S_Uhg67BEeybpKCV4eI_mA"/>
			        </children>
			        <element xmi:type="uml:Signal" href="I40.uml#_QgUvgK7BEeybpKCV4eI_mA"/>
			        <layoutConstraint xmi:type="notation:Bounds" xmi:id="_Qgxbca7BEeybpKCV4eI_mA" x="294" y="12" width="261" height="181"/>
			      </children>
			      <children xmi:type="notation:Shape" xmi:id="_IYZEALG_Eey86v2jwzb-qA" type="StereotypeComment">
			        <styles xmi:type="notation:TitleStyle" xmi:id="_IYZEAbG_Eey86v2jwzb-qA"/>
			        <styles xmi:type="notation:EObjectValueStyle" xmi:id="_IYZrELG_Eey86v2jwzb-qA" name="BASE_ELEMENT">
			          <eObjectValue xmi:type="uml:Signal" href="I40.uml#_QgUvgK7BEeybpKCV4eI_mA"/>
			        </styles>
			        <element xsi:nil="true"/>
			        <layoutConstraint xmi:type="notation:Bounds" xmi:id="_IYZEArG_Eey86v2jwzb-qA" x="494" y="12"/>
			      </children>
			      <styles xmi:type="notation:TitleStyle" xmi:id="_jWUQBa6_EeybpKCV4eI_mA"/>
			      <layoutConstraint xmi:type="notation:Bounds" xmi:id="_jWUQBq6_EeybpKCV4eI_mA"/>
			    </children>
			    <element xmi:type="uml:Package" href="I40.uml#_jWUQAK6_EeybpKCV4eI_mA"/>
			    <layoutConstraint xmi:type="notation:Bounds" xmi:id="_jWUQAq6_EeybpKCV4eI_mA" x="60" y="20" width="581" height="241"/>
			  </children>
			  <children xmi:type="notation:Shape" xmi:id="_xt8c4K6_EeybpKCV4eI_mA" type="Package_Shape">
			    <children xmi:type="notation:DecorationNode" xmi:id="_xt8c4q6_EeybpKCV4eI_mA" type="Package_NameLabel"/>
			    <children xmi:type="notation:BasicCompartment" xmi:id="_xt8c466_EeybpKCV4eI_mA" type="Package_PackagedElementCompartment">
			      <children xmi:type="notation:Shape" xmi:id="_zwpUcK6_EeybpKCV4eI_mA" type="Class_Shape_CN">
			        <children xmi:type="notation:DecorationNode" xmi:id="_zwpUcq6_EeybpKCV4eI_mA" type="Class_NameLabel_CN"/>
			        <children xmi:type="notation:DecorationNode" xmi:id="_zwpUc66_EeybpKCV4eI_mA" type="Class_FloatingNameLabel_CN">
			          <layoutConstraint xmi:type="notation:Location" xmi:id="_zwpUdK6_EeybpKCV4eI_mA" y="15"/>
			        </children>
			        <children xmi:type="notation:BasicCompartment" xmi:id="_zwpUda6_EeybpKCV4eI_mA" type="Class_AttributeCompartment_CN">
			          <children xmi:type="notation:Shape" xmi:id="_4OYrEK6_EeybpKCV4eI_mA" type="Property_ClassAttributeLabel">
			            <element xmi:type="uml:Property" href="I40.uml#_4OFJEK6_EeybpKCV4eI_mA"/>
			            <layoutConstraint xmi:type="notation:Location" xmi:id="_4OYrEa6_EeybpKCV4eI_mA"/>
			          </children>
			          <styles xmi:type="notation:TitleStyle" xmi:id="_zwpUdq6_EeybpKCV4eI_mA"/>
			          <styles xmi:type="notation:SortingStyle" xmi:id="_zwpUd66_EeybpKCV4eI_mA"/>
			          <styles xmi:type="notation:FilteringStyle" xmi:id="_zwpUeK6_EeybpKCV4eI_mA"/>
			          <layoutConstraint xmi:type="notation:Bounds" xmi:id="_zwpUea6_EeybpKCV4eI_mA"/>
			        </children>
			        <children xmi:type="notation:BasicCompartment" xmi:id="_zwpUeq6_EeybpKCV4eI_mA" visible="false" type="Class_OperationCompartment_CN">
			          <styles xmi:type="notation:TitleStyle" xmi:id="_zwpUe66_EeybpKCV4eI_mA"/>
			          <styles xmi:type="notation:SortingStyle" xmi:id="_zwpUfK6_EeybpKCV4eI_mA"/>
			          <styles xmi:type="notation:FilteringStyle" xmi:id="_zwpUfa6_EeybpKCV4eI_mA"/>
			          <layoutConstraint xmi:type="notation:Bounds" xmi:id="_zwpUfq6_EeybpKCV4eI_mA"/>
			        </children>
			        <children xmi:type="notation:BasicCompartment" xmi:id="_zwpUf66_EeybpKCV4eI_mA" visible="false" type="Class_NestedClassifierCompartment_CN">
			          <styles xmi:type="notation:TitleStyle" xmi:id="_zwpUgK6_EeybpKCV4eI_mA"/>
			          <styles xmi:type="notation:SortingStyle" xmi:id="_zwpUga6_EeybpKCV4eI_mA"/>
			          <styles xmi:type="notation:FilteringStyle" xmi:id="_zwpUgq6_EeybpKCV4eI_mA"/>
			          <layoutConstraint xmi:type="notation:Bounds" xmi:id="_zwpUg66_EeybpKCV4eI_mA"/>
			        </children>
			        <children xmi:type="notation:BasicCompartment" xmi:id="_1CpH7a6_EeybpKCV4eI_mA" type="StereotypeCompartment">
			          <eAnnotations xmi:type="ecore:EAnnotation" xmi:id="_-iROgK7AEeybpKCV4eI_mA" source="PapyrusCSSForceValue">
			            <details xmi:type="ecore:EStringToStringMapEntry" xmi:id="_-iROga7AEeybpKCV4eI_mA" key="visible" value="true"/>
			          </eAnnotations>
			          <styles xmi:type="notation:TitleStyle" xmi:id="_1CpH7q6_EeybpKCV4eI_mA"/>
			          <styles xmi:type="notation:StringValueStyle" xmi:id="_1CpH766_EeybpKCV4eI_mA" name="stereotype" stringValue="I4.0 Profile::Message"/>
			          <element xmi:type="uml:Stereotype" href="pathmap://I40_PROFILES/i40.profile.uml#_UjHiwGGiEeyTgIN4Smg6_Q"/>
			          <layoutConstraint xmi:type="notation:Bounds" xmi:id="_1CpH8K6_EeybpKCV4eI_mA"/>
			        </children>
			        <element xmi:type="uml:Class" href="I40.uml#_zwbSAK6_EeybpKCV4eI_mA"/>
			        <layoutConstraint xmi:type="notation:Bounds" xmi:id="_zwpUca6_EeybpKCV4eI_mA" x="34" y="12" width="161" height="161"/>
			      </children>
			      <children xmi:type="notation:Shape" xmi:id="_FrUKQa7AEeybpKCV4eI_mA" type="Class_Shape">
			        <children xmi:type="notation:DecorationNode" xmi:id="_FrUKQ67AEeybpKCV4eI_mA" type="Class_NameLabel"/>
			        <children xmi:type="notation:DecorationNode" xmi:id="_FrUKRK7AEeybpKCV4eI_mA" type="Class_FloatingNameLabel">
			          <layoutConstraint xmi:type="notation:Location" xmi:id="_FrUKRa7AEeybpKCV4eI_mA" y="15"/>
			        </children>
			        <children xmi:type="notation:BasicCompartment" xmi:id="_FrUKRq7AEeybpKCV4eI_mA" type="Class_AttributeCompartment">
			          <children xmi:type="notation:Shape" xmi:id="_K6834K7AEeybpKCV4eI_mA" type="Property_ClassAttributeLabel">
			            <element xmi:type="uml:Property" href="I40.uml#_K6Wa8K7AEeybpKCV4eI_mA"/>
			            <layoutConstraint xmi:type="notation:Location" xmi:id="_K6834a7AEeybpKCV4eI_mA"/>
			          </children>
			          <children xmi:type="notation:Shape" xmi:id="_O0i_oK7AEeybpKCV4eI_mA" type="Property_ClassAttributeLabel">
			            <children xmi:type="notation:BasicCompartment" xmi:id="_KfPbwLG_Eey86v2jwzb-qA" type="StereotypeBrace">
			              <eAnnotations xmi:type="ecore:EAnnotation" xmi:id="_OqeGELG_Eey86v2jwzb-qA" source="PapyrusCSSForceValue">
			                <details xmi:type="ecore:EStringToStringMapEntry" xmi:id="_OqetILG_Eey86v2jwzb-qA" key="visible" value="true"/>
			              </eAnnotations>
			              <styles xmi:type="notation:TitleStyle" xmi:id="_KfPbwbG_Eey86v2jwzb-qA"/>
			              <styles xmi:type="notation:StringValueStyle" xmi:id="_KfPbwrG_Eey86v2jwzb-qA" name="stereotype" stringValue="I4.0 Profile::RedefinableProperty"/>
			              <element xmi:type="uml:Stereotype" href="pathmap://I40_PROFILES/i40.profile.uml#__rpy0LG9Eeyi6s85rgESaA"/>
			              <layoutConstraint xmi:type="notation:Bounds" xmi:id="_KfPbw7G_Eey86v2jwzb-qA"/>
			            </children>
			            <element xmi:type="uml:Property" href="I40.uml#_O0GTsK7AEeybpKCV4eI_mA"/>
			            <layoutConstraint xmi:type="notation:Location" xmi:id="_O0i_oa7AEeybpKCV4eI_mA"/>
			          </children>
			          <children xmi:type="notation:Shape" xmi:id="_RdQHQK7AEeybpKCV4eI_mA" type="Property_ClassAttributeLabel">
			            <element xmi:type="uml:Property" href="I40.uml#_Rc464K7AEeybpKCV4eI_mA"/>
			            <layoutConstraint xmi:type="notation:Location" xmi:id="_RdQHQa7AEeybpKCV4eI_mA"/>
			          </children>
			          <styles xmi:type="notation:TitleStyle" xmi:id="_FrUKR67AEeybpKCV4eI_mA"/>
			          <styles xmi:type="notation:SortingStyle" xmi:id="_FrUKSK7AEeybpKCV4eI_mA"/>
			          <styles xmi:type="notation:FilteringStyle" xmi:id="_FrUKSa7AEeybpKCV4eI_mA"/>
			          <layoutConstraint xmi:type="notation:Bounds" xmi:id="_FrUKSq7AEeybpKCV4eI_mA"/>
			        </children>
			        <children xmi:type="notation:BasicCompartment" xmi:id="_FrUKS67AEeybpKCV4eI_mA" visible="false" type="Class_OperationCompartment">
			          <styles xmi:type="notation:TitleStyle" xmi:id="_FrUKTK7AEeybpKCV4eI_mA"/>
			          <styles xmi:type="notation:SortingStyle" xmi:id="_FrUKTa7AEeybpKCV4eI_mA"/>
			          <styles xmi:type="notation:FilteringStyle" xmi:id="_FrUKTq7AEeybpKCV4eI_mA"/>
			          <layoutConstraint xmi:type="notation:Bounds" xmi:id="_FrUKT67AEeybpKCV4eI_mA"/>
			        </children>
			        <children xmi:type="notation:BasicCompartment" xmi:id="_FrUKUK7AEeybpKCV4eI_mA" visible="false" type="Class_NestedClassifierCompartment">
			          <styles xmi:type="notation:TitleStyle" xmi:id="_FrUKUa7AEeybpKCV4eI_mA"/>
			          <styles xmi:type="notation:SortingStyle" xmi:id="_FrUKUq7AEeybpKCV4eI_mA"/>
			          <styles xmi:type="notation:FilteringStyle" xmi:id="_FrUKU67AEeybpKCV4eI_mA"/>
			          <layoutConstraint xmi:type="notation:Bounds" xmi:id="_FrUKVK7AEeybpKCV4eI_mA"/>
			        </children>
			        <element xmi:type="uml:Class" href="I40.uml#_FrUKQK7AEeybpKCV4eI_mA"/>
			        <layoutConstraint xmi:type="notation:Bounds" xmi:id="_FrUKQq7AEeybpKCV4eI_mA" x="374" y="52" height="81"/>
			      </children>
			      <children xmi:type="notation:Shape" xmi:id="_r9iIAK7AEeybpKCV4eI_mA" type="Class_Shape_CN">
			        <children xmi:type="notation:DecorationNode" xmi:id="_r9iIAq7AEeybpKCV4eI_mA" type="Class_NameLabel_CN"/>
			        <children xmi:type="notation:DecorationNode" xmi:id="_r9iIA67AEeybpKCV4eI_mA" type="Class_FloatingNameLabel_CN">
			          <layoutConstraint xmi:type="notation:Location" xmi:id="_r9iIBK7AEeybpKCV4eI_mA" y="15"/>
			        </children>
			        <children xmi:type="notation:BasicCompartment" xmi:id="_r9iIBa7AEeybpKCV4eI_mA" type="Class_AttributeCompartment_CN">
			          <styles xmi:type="notation:TitleStyle" xmi:id="_r9iIBq7AEeybpKCV4eI_mA"/>
			          <styles xmi:type="notation:SortingStyle" xmi:id="_r9iIB67AEeybpKCV4eI_mA"/>
			          <styles xmi:type="notation:FilteringStyle" xmi:id="_r9iICK7AEeybpKCV4eI_mA"/>
			          <layoutConstraint xmi:type="notation:Bounds" xmi:id="_r9iICa7AEeybpKCV4eI_mA"/>
			        </children>
			        <children xmi:type="notation:BasicCompartment" xmi:id="_r9iICq7AEeybpKCV4eI_mA" visible="false" type="Class_OperationCompartment_CN">
			          <styles xmi:type="notation:TitleStyle" xmi:id="_r9iIC67AEeybpKCV4eI_mA"/>
			          <styles xmi:type="notation:SortingStyle" xmi:id="_r9iIDK7AEeybpKCV4eI_mA"/>
			          <styles xmi:type="notation:FilteringStyle" xmi:id="_r9iIDa7AEeybpKCV4eI_mA"/>
			          <layoutConstraint xmi:type="notation:Bounds" xmi:id="_r9iIDq7AEeybpKCV4eI_mA"/>
			        </children>
			        <children xmi:type="notation:BasicCompartment" xmi:id="_r9iID67AEeybpKCV4eI_mA" visible="false" type="Class_NestedClassifierCompartment_CN">
			          <styles xmi:type="notation:TitleStyle" xmi:id="_r9iIEK7AEeybpKCV4eI_mA"/>
			          <styles xmi:type="notation:SortingStyle" xmi:id="_r9iIEa7AEeybpKCV4eI_mA"/>
			          <styles xmi:type="notation:FilteringStyle" xmi:id="_r9iIEq7AEeybpKCV4eI_mA"/>
			          <layoutConstraint xmi:type="notation:Bounds" xmi:id="_r9iIE67AEeybpKCV4eI_mA"/>
			        </children>
			        <children xmi:type="notation:BasicCompartment" xmi:id="_8MGBba7AEeybpKCV4eI_mA" type="StereotypeCompartment">
			          <eAnnotations xmi:type="ecore:EAnnotation" xmi:id="_-bbmsK7AEeybpKCV4eI_mA" source="PapyrusCSSForceValue">
			            <details xmi:type="ecore:EStringToStringMapEntry" xmi:id="_-bbmsa7AEeybpKCV4eI_mA" key="visible" value="true"/>
			          </eAnnotations>
			          <styles xmi:type="notation:TitleStyle" xmi:id="_8MGBbq7AEeybpKCV4eI_mA"/>
			          <styles xmi:type="notation:StringValueStyle" xmi:id="_8MGBb67AEeybpKCV4eI_mA" name="stereotype" stringValue="I4.0 Profile::Message"/>
			          <element xmi:type="uml:Stereotype" href="pathmap://I40_PROFILES/i40.profile.uml#_UjHiwGGiEeyTgIN4Smg6_Q"/>
			          <layoutConstraint xmi:type="notation:Bounds" xmi:id="_8MGBcK7AEeybpKCV4eI_mA"/>
			        </children>
			        <element xmi:type="uml:Class" href="I40.uml#_r9BxsK7AEeybpKCV4eI_mA"/>
			        <layoutConstraint xmi:type="notation:Bounds" xmi:id="_r9iIAa7AEeybpKCV4eI_mA" x="34" y="192" width="181" height="141"/>
			      </children>
			      <children xmi:type="notation:Shape" xmi:id="_wZLz8K7AEeybpKCV4eI_mA" type="Class_Shape_CN">
			        <children xmi:type="notation:DecorationNode" xmi:id="_wZLz8q7AEeybpKCV4eI_mA" type="Class_NameLabel_CN"/>
			        <children xmi:type="notation:DecorationNode" xmi:id="_wZLz867AEeybpKCV4eI_mA" type="Class_FloatingNameLabel_CN">
			          <layoutConstraint xmi:type="notation:Location" xmi:id="_wZLz9K7AEeybpKCV4eI_mA" y="15"/>
			        </children>
			        <children xmi:type="notation:BasicCompartment" xmi:id="_wZLz9a7AEeybpKCV4eI_mA" type="Class_AttributeCompartment_CN">
			          <children xmi:type="notation:Shape" xmi:id="_0w9sgK7AEeybpKCV4eI_mA" type="Property_ClassAttributeLabel">
			            <element xmi:type="uml:Property" href="I40.uml#_0whAkK7AEeybpKCV4eI_mA"/>
			            <layoutConstraint xmi:type="notation:Location" xmi:id="_0w9sga7AEeybpKCV4eI_mA"/>
			          </children>
			          <children xmi:type="notation:Shape" xmi:id="_lch0wLETEeyBt5AVblrBtA" type="Property_ClassAttributeLabel">
			            <element xmi:type="uml:Property" href="I40.uml#_lbTFsLETEeyBt5AVblrBtA"/>
			            <layoutConstraint xmi:type="notation:Location" xmi:id="_lch0wbETEeyBt5AVblrBtA"/>
			          </children>
			          <styles xmi:type="notation:TitleStyle" xmi:id="_wZLz9q7AEeybpKCV4eI_mA"/>
			          <styles xmi:type="notation:SortingStyle" xmi:id="_wZLz967AEeybpKCV4eI_mA"/>
			          <styles xmi:type="notation:FilteringStyle" xmi:id="_wZLz-K7AEeybpKCV4eI_mA"/>
			          <layoutConstraint xmi:type="notation:Bounds" xmi:id="_wZLz-a7AEeybpKCV4eI_mA"/>
			        </children>
			        <children xmi:type="notation:BasicCompartment" xmi:id="_wZLz-q7AEeybpKCV4eI_mA" visible="false" type="Class_OperationCompartment_CN">
			          <styles xmi:type="notation:TitleStyle" xmi:id="_wZLz-67AEeybpKCV4eI_mA"/>
			          <styles xmi:type="notation:SortingStyle" xmi:id="_wZLz_K7AEeybpKCV4eI_mA"/>
			          <styles xmi:type="notation:FilteringStyle" xmi:id="_wZLz_a7AEeybpKCV4eI_mA"/>
			          <layoutConstraint xmi:type="notation:Bounds" xmi:id="_wZLz_q7AEeybpKCV4eI_mA"/>
			        </children>
			        <children xmi:type="notation:BasicCompartment" xmi:id="_wZLz_67AEeybpKCV4eI_mA" visible="false" type="Class_NestedClassifierCompartment_CN">
			          <styles xmi:type="notation:TitleStyle" xmi:id="_wZL0AK7AEeybpKCV4eI_mA"/>
			          <styles xmi:type="notation:SortingStyle" xmi:id="_wZL0Aa7AEeybpKCV4eI_mA"/>
			          <styles xmi:type="notation:FilteringStyle" xmi:id="_wZL0Aq7AEeybpKCV4eI_mA"/>
			          <layoutConstraint xmi:type="notation:Bounds" xmi:id="_wZL0A67AEeybpKCV4eI_mA"/>
			        </children>
			        <element xmi:type="uml:Class" href="I40.uml#_wY45AK7AEeybpKCV4eI_mA"/>
			        <layoutConstraint xmi:type="notation:Bounds" xmi:id="_wZLz8a7AEeybpKCV4eI_mA" x="334" y="232" height="61"/>
			      </children>
			      <children xmi:type="notation:Shape" xmi:id="_H3rl4LEKEeyyJ9apTmcH_g" type="Enumeration_Shape">
			        <children xmi:type="notation:DecorationNode" xmi:id="_H3vQQLEKEeyyJ9apTmcH_g" type="Enumeration_NameLabel"/>
			        <children xmi:type="notation:DecorationNode" xmi:id="_H3v3ULEKEeyyJ9apTmcH_g" type="Enumeration_FloatingNameLabel">
			          <layoutConstraint xmi:type="notation:Location" xmi:id="_H3v3UbEKEeyyJ9apTmcH_g" y="15"/>
			        </children>
			        <children xmi:type="notation:BasicCompartment" xmi:id="_H3v3UrEKEeyyJ9apTmcH_g" type="Enumeration_LiteralCompartment">
			          <children xmi:type="notation:Shape" xmi:id="_O6ceALEKEeyyJ9apTmcH_g" type="EnumerationLiteral_LiteralLabel">
			            <element xmi:type="uml:EnumerationLiteral" href="I40.uml#_O48CILEKEeyyJ9apTmcH_g"/>
			            <layoutConstraint xmi:type="notation:Location" xmi:id="_O6ceAbEKEeyyJ9apTmcH_g"/>
			          </children>
			          <children xmi:type="notation:Shape" xmi:id="_Pv7UgLEKEeyyJ9apTmcH_g" type="EnumerationLiteral_LiteralLabel">
			            <element xmi:type="uml:EnumerationLiteral" href="I40.uml#_Pu4ysLEKEeyyJ9apTmcH_g"/>
			            <layoutConstraint xmi:type="notation:Location" xmi:id="_Pv7UgbEKEeyyJ9apTmcH_g"/>
			          </children>
			          <styles xmi:type="notation:TitleStyle" xmi:id="_H3v3U7EKEeyyJ9apTmcH_g"/>
			          <styles xmi:type="notation:SortingStyle" xmi:id="_H3v3VLEKEeyyJ9apTmcH_g"/>
			          <styles xmi:type="notation:FilteringStyle" xmi:id="_H3v3VbEKEeyyJ9apTmcH_g"/>
			          <layoutConstraint xmi:type="notation:Bounds" xmi:id="_H3v3VrEKEeyyJ9apTmcH_g"/>
			        </children>
			        <element xmi:type="uml:Enumeration" href="I40.uml#_H2TF0LEKEeyyJ9apTmcH_g"/>
			        <layoutConstraint xmi:type="notation:Bounds" xmi:id="_H3rl4bEKEeyyJ9apTmcH_g" x="614" y="212"/>
			      </children>
			      <children xmi:type="notation:Shape" xmi:id="_IYyFkLG_Eey86v2jwzb-qA" type="StereotypeComment">
			        <styles xmi:type="notation:TitleStyle" xmi:id="_IYyFkbG_Eey86v2jwzb-qA"/>
			        <styles xmi:type="notation:EObjectValueStyle" xmi:id="_IYysoLG_Eey86v2jwzb-qA" name="BASE_ELEMENT">
			          <eObjectValue xmi:type="uml:Class" href="I40.uml#_zwbSAK6_EeybpKCV4eI_mA"/>
			        </styles>
			        <element xsi:nil="true"/>
			        <layoutConstraint xmi:type="notation:Bounds" xmi:id="_IYyFkrG_Eey86v2jwzb-qA" x="234" y="12"/>
			      </children>
			      <children xmi:type="notation:Shape" xmi:id="_IZdbALG_Eey86v2jwzb-qA" type="StereotypeComment">
			        <styles xmi:type="notation:TitleStyle" xmi:id="_IZdbAbG_Eey86v2jwzb-qA"/>
			        <styles xmi:type="notation:EObjectValueStyle" xmi:id="_IZdbA7G_Eey86v2jwzb-qA" name="BASE_ELEMENT">
			          <eObjectValue xmi:type="uml:Class" href="I40.uml#_r9BxsK7AEeybpKCV4eI_mA"/>
			        </styles>
			        <element xsi:nil="true"/>
			        <layoutConstraint xmi:type="notation:Bounds" xmi:id="_IZdbArG_Eey86v2jwzb-qA" x="234" y="192"/>
			      </children>
			      <styles xmi:type="notation:TitleStyle" xmi:id="_xt8c5K6_EeybpKCV4eI_mA"/>
			      <layoutConstraint xmi:type="notation:Bounds" xmi:id="_xt8c5a6_EeybpKCV4eI_mA"/>
			    </children>
			    <element xmi:type="uml:Package" href="I40.uml#_xtzS8K6_EeybpKCV4eI_mA"/>
			    <layoutConstraint xmi:type="notation:Bounds" xmi:id="_xt8c4a6_EeybpKCV4eI_mA" x="660" y="20" width="741" height="381"/>
			  </children>
			  <children xmi:type="notation:Shape" xmi:id="_uUwBka7BEeybpKCV4eI_mA" type="Component_Shape">
			    <children xmi:type="notation:DecorationNode" xmi:id="_uUwBk67BEeybpKCV4eI_mA" type="Component_NameLabel"/>
			    <children xmi:type="notation:DecorationNode" xmi:id="_uUwBlK7BEeybpKCV4eI_mA" type="Component_FloatingNameLabel">
			      <layoutConstraint xmi:type="notation:Location" xmi:id="_uUwBla7BEeybpKCV4eI_mA" y="15"/>
			    </children>
			    <children xmi:type="notation:BasicCompartment" xmi:id="_uUwBlq7BEeybpKCV4eI_mA" type="Component_AttributeCompartment">
			      <children xmi:type="notation:Shape" xmi:id="_NBw4wK7TEey-46jH0ooPYA" type="Property_ComponentAttributeLabel">
			        <element xmi:type="uml:Property" href="I40.uml#_NAz2gK7TEey-46jH0ooPYA"/>
			        <layoutConstraint xmi:type="notation:Location" xmi:id="_NBw4wa7TEey-46jH0ooPYA"/>
			      </children>
			      <styles xmi:type="notation:TitleStyle" xmi:id="_uUwBl67BEeybpKCV4eI_mA"/>
			      <styles xmi:type="notation:SortingStyle" xmi:id="_uUwBmK7BEeybpKCV4eI_mA"/>
			      <styles xmi:type="notation:FilteringStyle" xmi:id="_uUwBma7BEeybpKCV4eI_mA"/>
			      <layoutConstraint xmi:type="notation:Bounds" xmi:id="_uUwBmq7BEeybpKCV4eI_mA"/>
			    </children>
			    <children xmi:type="notation:BasicCompartment" xmi:id="_uUwBm67BEeybpKCV4eI_mA" type="Component_OperationCompartment">
			      <children xmi:type="notation:Shape" xmi:id="_PT3G8K7CEeybpKCV4eI_mA" type="Operation_ComponentOperationLabel">
			        <children xmi:type="notation:BasicCompartment" xmi:id="_XMFnc67CEeybpKCV4eI_mA" type="StereotypeBrace">
			          <eAnnotations xmi:type="ecore:EAnnotation" xmi:id="_p1lSIK7CEeybpKCV4eI_mA" source="PapyrusCSSForceValue">
			            <details xmi:type="ecore:EStringToStringMapEntry" xmi:id="_p1lSIa7CEeybpKCV4eI_mA" key="visible" value="true"/>
			          </eAnnotations>
			          <styles xmi:type="notation:TitleStyle" xmi:id="_XMFndK7CEeybpKCV4eI_mA"/>
			          <styles xmi:type="notation:StringValueStyle" xmi:id="_XMFnda7CEeybpKCV4eI_mA" name="stereotype" stringValue="I4.0 Profile::Publisher"/>
			          <element xmi:type="uml:Stereotype" href="pathmap://I40_PROFILES/i40.profile.uml#_EyBzIGGjEeyTgIN4Smg6_Q"/>
			          <layoutConstraint xmi:type="notation:Bounds" xmi:id="_XMFndq7CEeybpKCV4eI_mA"/>
			        </children>
			        <element xmi:type="uml:Operation" href="I40.uml#_PTabAK7CEeybpKCV4eI_mA"/>
			        <layoutConstraint xmi:type="notation:Location" xmi:id="_PT3G8a7CEeybpKCV4eI_mA"/>
			      </children>
			      <children xmi:type="notation:Shape" xmi:id="_QMoiAK7CEeybpKCV4eI_mA" type="Operation_ComponentOperationLabel">
			        <children xmi:type="notation:BasicCompartment" xmi:id="_Wh4z467CEeybpKCV4eI_mA" type="StereotypeBrace">
			          <eAnnotations xmi:type="ecore:EAnnotation" xmi:id="_qS2c8K7CEeybpKCV4eI_mA" source="PapyrusCSSForceValue">
			            <details xmi:type="ecore:EStringToStringMapEntry" xmi:id="_qS2c8a7CEeybpKCV4eI_mA" key="visible" value="true"/>
			          </eAnnotations>
			          <styles xmi:type="notation:TitleStyle" xmi:id="_Wh4z5K7CEeybpKCV4eI_mA"/>
			          <styles xmi:type="notation:StringValueStyle" xmi:id="_Wh4z5a7CEeybpKCV4eI_mA" name="stereotype" stringValue="I4.0 Profile::Subscriber"/>
			          <element xmi:type="uml:Stereotype" href="pathmap://I40_PROFILES/i40.profile.uml#_KGYosGGjEeyTgIN4Smg6_Q"/>
			          <layoutConstraint xmi:type="notation:Bounds" xmi:id="_Wh4z5q7CEeybpKCV4eI_mA"/>
			        </children>
			        <styles xmi:type="notation:StringListValueStyle" xmi:id="_UXyEEK7TEey-46jH0ooPYA" name="maskLabel">
			          <stringListValue>parametersName</stringListValue>
			          <stringListValue>visibility</stringListValue>
			          <stringListValue>name</stringListValue>
			          <stringListValue>parametersType</stringListValue>
			          <stringListValue>returnType</stringListValue>
			        </styles>
			        <element xmi:type="uml:Operation" href="I40.uml#_QMILsK7CEeybpKCV4eI_mA"/>
			        <layoutConstraint xmi:type="notation:Location" xmi:id="_QMoiAa7CEeybpKCV4eI_mA"/>
			      </children>
			      <styles xmi:type="notation:TitleStyle" xmi:id="_uUwBnK7BEeybpKCV4eI_mA"/>
			      <styles xmi:type="notation:SortingStyle" xmi:id="_uUwBna7BEeybpKCV4eI_mA"/>
			      <styles xmi:type="notation:FilteringStyle" xmi:id="_uUwBnq7BEeybpKCV4eI_mA"/>
			      <layoutConstraint xmi:type="notation:Bounds" xmi:id="_uUwBn67BEeybpKCV4eI_mA"/>
			    </children>
			    <children xmi:type="notation:BasicCompartment" xmi:id="_uUwBoK7BEeybpKCV4eI_mA" visible="false" type="Component_NestedClassifierCompartment">
			      <styles xmi:type="notation:TitleStyle" xmi:id="_uUwBoa7BEeybpKCV4eI_mA"/>
			      <styles xmi:type="notation:SortingStyle" xmi:id="_uUwBoq7BEeybpKCV4eI_mA"/>
			      <styles xmi:type="notation:FilteringStyle" xmi:id="_uUwBo67BEeybpKCV4eI_mA"/>
			      <layoutConstraint xmi:type="notation:Bounds" xmi:id="_uUwBpK7BEeybpKCV4eI_mA"/>
			    </children>
			    <children xmi:type="notation:BasicCompartment" xmi:id="_2yAh2a7BEeybpKCV4eI_mA" type="StereotypeCompartment">
			      <eAnnotations xmi:type="ecore:EAnnotation" xmi:id="_-JklMK7BEeybpKCV4eI_mA" source="PapyrusCSSForceValue">
			        <details xmi:type="ecore:EStringToStringMapEntry" xmi:id="_-JklMa7BEeybpKCV4eI_mA" key="visible" value="true"/>
			      </eAnnotations>
			      <styles xmi:type="notation:TitleStyle" xmi:id="_2yAh2q7BEeybpKCV4eI_mA"/>
			      <styles xmi:type="notation:StringValueStyle" xmi:id="_2yAh267BEeybpKCV4eI_mA" name="stereotype" stringValue="I4.0 Profile::I4.0 Component"/>
			      <element xmi:type="uml:Stereotype" href="pathmap://I40_PROFILES/i40.profile.uml#_dHR00GGlEeyTgIN4Smg6_Q"/>
			      <layoutConstraint xmi:type="notation:Bounds" xmi:id="_2yAh3K7BEeybpKCV4eI_mA"/>
			    </children>
			    <element xmi:type="uml:Component" href="I40.uml#_uUwBkK7BEeybpKCV4eI_mA"/>
			    <layoutConstraint xmi:type="notation:Bounds" xmi:id="_uUwBkq7BEeybpKCV4eI_mA" x="420" y="440" width="441"/>
			  </children>
			  <children xmi:type="notation:Shape" xmi:id="_vmf9Ua7BEeybpKCV4eI_mA" type="Component_Shape">
			    <children xmi:type="notation:DecorationNode" xmi:id="_vmf9U67BEeybpKCV4eI_mA" type="Component_NameLabel"/>
			    <children xmi:type="notation:DecorationNode" xmi:id="_vmf9VK7BEeybpKCV4eI_mA" type="Component_FloatingNameLabel">
			      <layoutConstraint xmi:type="notation:Location" xmi:id="_vmf9Va7BEeybpKCV4eI_mA" y="15"/>
			    </children>
			    <children xmi:type="notation:BasicCompartment" xmi:id="_vmf9Vq7BEeybpKCV4eI_mA" type="Component_AttributeCompartment">
			      <children xmi:type="notation:Shape" xmi:id="__0fO4K7BEeybpKCV4eI_mA" type="Property_ComponentAttributeLabel">
			        <element xmi:type="uml:Property" href="I40.uml#__0Ci8K7BEeybpKCV4eI_mA"/>
			        <layoutConstraint xmi:type="notation:Location" xmi:id="__0fO4a7BEeybpKCV4eI_mA"/>
			      </children>
			      <styles xmi:type="notation:TitleStyle" xmi:id="_vmf9V67BEeybpKCV4eI_mA"/>
			      <styles xmi:type="notation:SortingStyle" xmi:id="_vmf9WK7BEeybpKCV4eI_mA"/>
			      <styles xmi:type="notation:FilteringStyle" xmi:id="_vmf9Wa7BEeybpKCV4eI_mA"/>
			      <layoutConstraint xmi:type="notation:Bounds" xmi:id="_vmf9Wq7BEeybpKCV4eI_mA"/>
			    </children>
			    <children xmi:type="notation:BasicCompartment" xmi:id="_vmf9W67BEeybpKCV4eI_mA" type="Component_OperationCompartment">
			      <styles xmi:type="notation:TitleStyle" xmi:id="_vmf9XK7BEeybpKCV4eI_mA"/>
			      <styles xmi:type="notation:SortingStyle" xmi:id="_vmf9Xa7BEeybpKCV4eI_mA"/>
			      <styles xmi:type="notation:FilteringStyle" xmi:id="_vmf9Xq7BEeybpKCV4eI_mA"/>
			      <layoutConstraint xmi:type="notation:Bounds" xmi:id="_vmf9X67BEeybpKCV4eI_mA"/>
			    </children>
			    <children xmi:type="notation:BasicCompartment" xmi:id="_vmf9YK7BEeybpKCV4eI_mA" type="Component_NestedClassifierCompartment">
			      <styles xmi:type="notation:TitleStyle" xmi:id="_vmf9Ya7BEeybpKCV4eI_mA"/>
			      <styles xmi:type="notation:SortingStyle" xmi:id="_vmf9Yq7BEeybpKCV4eI_mA"/>
			      <styles xmi:type="notation:FilteringStyle" xmi:id="_vmf9Y67BEeybpKCV4eI_mA"/>
			      <layoutConstraint xmi:type="notation:Bounds" xmi:id="_vmf9ZK7BEeybpKCV4eI_mA"/>
			    </children>
			    <element xmi:type="uml:Component" href="I40.uml#_vmf9UK7BEeybpKCV4eI_mA"/>
			    <layoutConstraint xmi:type="notation:Bounds" xmi:id="_vmf9Uq7BEeybpKCV4eI_mA" x="420" y="700"/>
			  </children>
			  <children xmi:type="notation:Shape" xmi:id="_wtTNUa7BEeybpKCV4eI_mA" type="Component_Shape">
			    <children xmi:type="notation:DecorationNode" xmi:id="_wtTNU67BEeybpKCV4eI_mA" type="Component_NameLabel"/>
			    <children xmi:type="notation:DecorationNode" xmi:id="_wtTNVK7BEeybpKCV4eI_mA" type="Component_FloatingNameLabel">
			      <layoutConstraint xmi:type="notation:Location" xmi:id="_wtTNVa7BEeybpKCV4eI_mA" y="15"/>
			    </children>
			    <children xmi:type="notation:BasicCompartment" xmi:id="_wtTNVq7BEeybpKCV4eI_mA" type="Component_AttributeCompartment">
			      <children xmi:type="notation:Shape" xmi:id="_B6ocAK7CEeybpKCV4eI_mA" type="Property_ComponentAttributeLabel">
			        <element xmi:type="uml:Property" href="I40.uml#_B6LwEK7CEeybpKCV4eI_mA"/>
			        <layoutConstraint xmi:type="notation:Location" xmi:id="_B6ocAa7CEeybpKCV4eI_mA"/>
			      </children>
			      <children xmi:type="notation:Shape" xmi:id="_Dj2ckK7CEeybpKCV4eI_mA" type="Property_ComponentAttributeLabel">
			        <element xmi:type="uml:Property" href="I40.uml#_DjXUYK7CEeybpKCV4eI_mA"/>
			        <layoutConstraint xmi:type="notation:Location" xmi:id="_Dj2cka7CEeybpKCV4eI_mA"/>
			      </children>
			      <styles xmi:type="notation:TitleStyle" xmi:id="_wtTNV67BEeybpKCV4eI_mA"/>
			      <styles xmi:type="notation:SortingStyle" xmi:id="_wtTNWK7BEeybpKCV4eI_mA"/>
			      <styles xmi:type="notation:FilteringStyle" xmi:id="_wtTNWa7BEeybpKCV4eI_mA"/>
			      <layoutConstraint xmi:type="notation:Bounds" xmi:id="_wtTNWq7BEeybpKCV4eI_mA"/>
			    </children>
			    <children xmi:type="notation:BasicCompartment" xmi:id="_wtTNW67BEeybpKCV4eI_mA" type="Component_OperationCompartment">
			      <styles xmi:type="notation:TitleStyle" xmi:id="_wtTNXK7BEeybpKCV4eI_mA"/>
			      <styles xmi:type="notation:SortingStyle" xmi:id="_wtTNXa7BEeybpKCV4eI_mA"/>
			      <styles xmi:type="notation:FilteringStyle" xmi:id="_wtTNXq7BEeybpKCV4eI_mA"/>
			      <layoutConstraint xmi:type="notation:Bounds" xmi:id="_wtTNX67BEeybpKCV4eI_mA"/>
			    </children>
			    <children xmi:type="notation:BasicCompartment" xmi:id="_wtTNYK7BEeybpKCV4eI_mA" type="Component_NestedClassifierCompartment">
			      <styles xmi:type="notation:TitleStyle" xmi:id="_wtTNYa7BEeybpKCV4eI_mA"/>
			      <styles xmi:type="notation:SortingStyle" xmi:id="_wtTNYq7BEeybpKCV4eI_mA"/>
			      <styles xmi:type="notation:FilteringStyle" xmi:id="_wtTNY67BEeybpKCV4eI_mA"/>
			      <layoutConstraint xmi:type="notation:Bounds" xmi:id="_wtTNZK7BEeybpKCV4eI_mA"/>
			    </children>
			    <element xmi:type="uml:Component" href="I40.uml#_wtTNUK7BEeybpKCV4eI_mA"/>
			    <layoutConstraint xmi:type="notation:Bounds" xmi:id="_wtTNUq7BEeybpKCV4eI_mA" x="680" y="700" width="181"/>
			  </children>
			  <children xmi:type="notation:Shape" xmi:id="_xuTXUa7BEeybpKCV4eI_mA" type="Component_Shape">
			    <children xmi:type="notation:DecorationNode" xmi:id="_xuTXU67BEeybpKCV4eI_mA" type="Component_NameLabel"/>
			    <children xmi:type="notation:DecorationNode" xmi:id="_xuTXVK7BEeybpKCV4eI_mA" type="Component_FloatingNameLabel">
			      <layoutConstraint xmi:type="notation:Location" xmi:id="_xuTXVa7BEeybpKCV4eI_mA" y="15"/>
			    </children>
			    <children xmi:type="notation:BasicCompartment" xmi:id="_xuTXVq7BEeybpKCV4eI_mA" type="Component_AttributeCompartment">
			      <styles xmi:type="notation:TitleStyle" xmi:id="_xuTXV67BEeybpKCV4eI_mA"/>
			      <styles xmi:type="notation:SortingStyle" xmi:id="_xuTXWK7BEeybpKCV4eI_mA"/>
			      <styles xmi:type="notation:FilteringStyle" xmi:id="_xuTXWa7BEeybpKCV4eI_mA"/>
			      <layoutConstraint xmi:type="notation:Bounds" xmi:id="_xuTXWq7BEeybpKCV4eI_mA"/>
			    </children>
			    <children xmi:type="notation:BasicCompartment" xmi:id="_xuTXW67BEeybpKCV4eI_mA" type="Component_OperationCompartment">
			      <children xmi:type="notation:Shape" xmi:id="_RBYYsK7CEeybpKCV4eI_mA" type="Operation_ComponentOperationLabel">
			        <children xmi:type="notation:BasicCompartment" xmi:id="_YEtRg67CEeybpKCV4eI_mA" type="StereotypeBrace">
			          <eAnnotations xmi:type="ecore:EAnnotation" xmi:id="_o7EKoK7CEeybpKCV4eI_mA" source="PapyrusCSSForceValue">
			            <details xmi:type="ecore:EStringToStringMapEntry" xmi:id="_o7EKoa7CEeybpKCV4eI_mA" key="visible" value="true"/>
			          </eAnnotations>
			          <styles xmi:type="notation:TitleStyle" xmi:id="_YEtRhK7CEeybpKCV4eI_mA"/>
			          <styles xmi:type="notation:StringValueStyle" xmi:id="_YEtRha7CEeybpKCV4eI_mA" name="stereotype" stringValue="I4.0 Profile::Publisher"/>
			          <element xmi:type="uml:Stereotype" href="pathmap://I40_PROFILES/i40.profile.uml#_EyBzIGGjEeyTgIN4Smg6_Q"/>
			          <layoutConstraint xmi:type="notation:Bounds" xmi:id="_YEtRhq7CEeybpKCV4eI_mA"/>
			        </children>
			        <styles xmi:type="notation:StringListValueStyle" xmi:id="_nz1c0K7CEeybpKCV4eI_mA" name="maskLabel">
			          <stringListValue>parametersName</stringListValue>
			          <stringListValue>visibility</stringListValue>
			          <stringListValue>name</stringListValue>
			          <stringListValue>parametersType</stringListValue>
			          <stringListValue>returnType</stringListValue>
			        </styles>
			        <element xmi:type="uml:Operation" href="I40.uml#_RA4CYK7CEeybpKCV4eI_mA"/>
			        <layoutConstraint xmi:type="notation:Location" xmi:id="_RBYYsa7CEeybpKCV4eI_mA"/>
			      </children>
			      <styles xmi:type="notation:TitleStyle" xmi:id="_xuTXXK7BEeybpKCV4eI_mA"/>
			      <styles xmi:type="notation:SortingStyle" xmi:id="_xuTXXa7BEeybpKCV4eI_mA"/>
			      <styles xmi:type="notation:FilteringStyle" xmi:id="_xuTXXq7BEeybpKCV4eI_mA"/>
			      <layoutConstraint xmi:type="notation:Bounds" xmi:id="_xuTXX67BEeybpKCV4eI_mA"/>
			    </children>
			    <children xmi:type="notation:BasicCompartment" xmi:id="_xuTXYK7BEeybpKCV4eI_mA" visible="false" type="Component_NestedClassifierCompartment">
			      <styles xmi:type="notation:TitleStyle" xmi:id="_xuTXYa7BEeybpKCV4eI_mA"/>
			      <styles xmi:type="notation:SortingStyle" xmi:id="_xuTXYq7BEeybpKCV4eI_mA"/>
			      <styles xmi:type="notation:FilteringStyle" xmi:id="_xuTXY67BEeybpKCV4eI_mA"/>
			      <layoutConstraint xmi:type="notation:Bounds" xmi:id="_xuTXZK7BEeybpKCV4eI_mA"/>
			    </children>
			    <children xmi:type="notation:BasicCompartment" xmi:id="_6itzWa7BEeybpKCV4eI_mA" type="StereotypeCompartment">
			      <eAnnotations xmi:type="ecore:EAnnotation" xmi:id="_-SKggK7BEeybpKCV4eI_mA" source="PapyrusCSSForceValue">
			        <details xmi:type="ecore:EStringToStringMapEntry" xmi:id="_-SKgga7BEeybpKCV4eI_mA" key="visible" value="true"/>
			      </eAnnotations>
			      <styles xmi:type="notation:TitleStyle" xmi:id="_6itzWq7BEeybpKCV4eI_mA"/>
			      <styles xmi:type="notation:StringValueStyle" xmi:id="_6itzW67BEeybpKCV4eI_mA" name="stereotype" stringValue="I4.0 Profile::I4.0 Component"/>
			      <element xmi:type="uml:Stereotype" href="pathmap://I40_PROFILES/i40.profile.uml#_dHR00GGlEeyTgIN4Smg6_Q"/>
			      <layoutConstraint xmi:type="notation:Bounds" xmi:id="_6itzXK7BEeybpKCV4eI_mA"/>
			    </children>
			    <element xmi:type="uml:Component" href="I40.uml#_xuTXUK7BEeybpKCV4eI_mA"/>
			    <layoutConstraint xmi:type="notation:Bounds" xmi:id="_xuTXUq7BEeybpKCV4eI_mA" x="880" y="440" width="521"/>
			  </children>
			  <children xmi:type="notation:Shape" xmi:id="_bALjNa7NEeygZ9ijIBRV9g" visible="false" type="StereotypeComment">
			    <eAnnotations xmi:type="ecore:EAnnotation" xmi:id="_edqWoK7NEeygZ9ijIBRV9g" source="PapyrusCSSForceValue">
			      <details xmi:type="ecore:EStringToStringMapEntry" xmi:id="_edqWoa7NEeygZ9ijIBRV9g" key="visible" value="true"/>
			    </eAnnotations>
			    <children xmi:type="notation:BasicCompartment" xmi:id="_bALjP67NEeygZ9ijIBRV9g" visible="false" type="StereotypeCompartment">
			      <eAnnotations xmi:type="ecore:EAnnotation" xmi:id="_edpvkK7NEeygZ9ijIBRV9g" source="PapyrusCSSForceValue">
			        <details xmi:type="ecore:EStringToStringMapEntry" xmi:id="_edpvka7NEeygZ9ijIBRV9g" key="visible" value="true"/>
			      </eAnnotations>
			      <styles xmi:type="notation:TitleStyle" xmi:id="_bALjQK7NEeygZ9ijIBRV9g"/>
			      <styles xmi:type="notation:StringValueStyle" xmi:id="_bALjQa7NEeygZ9ijIBRV9g" name="stereotype" stringValue="I4.0 Profile::Topic"/>
			      <element xmi:type="uml:Stereotype" href="pathmap://I40_PROFILES/i40.profile.uml#_c5kQUGGiEeyTgIN4Smg6_Q"/>
			      <layoutConstraint xmi:type="notation:Bounds" xmi:id="_bALjQq7NEeygZ9ijIBRV9g"/>
			    </children>
			    <styles xmi:type="notation:TitleStyle" xmi:id="_bALjNq7NEeygZ9ijIBRV9g"/>
			    <styles xmi:type="notation:EObjectValueStyle" xmi:id="_bALjOK7NEeygZ9ijIBRV9g" name="BASE_ELEMENT">
			      <eObjectValue xmi:type="uml:Signal" href="I40.uml#_lafHMK6_EeybpKCV4eI_mA"/>
			    </styles>
			    <element xsi:nil="true"/>
			    <layoutConstraint xmi:type="notation:Bounds" xmi:id="_bALjN67NEeygZ9ijIBRV9g" x="-80" y="360"/>
			  </children>
			  <children xmi:type="notation:Shape" xmi:id="__rFoBa7REey-46jH0ooPYA" visible="false" type="StereotypeComment">
			    <eAnnotations xmi:type="ecore:EAnnotation" xmi:id="_4ovKIq7SEey-46jH0ooPYA" source="PapyrusCSSForceValue">
			      <details xmi:type="ecore:EStringToStringMapEntry" xmi:id="_4ovKI67SEey-46jH0ooPYA" key="visible" value="true"/>
			    </eAnnotations>
			    <children xmi:type="notation:BasicCompartment" xmi:id="__rLuoK7REey-46jH0ooPYA" visible="false" type="StereotypeCompartment">
			      <eAnnotations xmi:type="ecore:EAnnotation" xmi:id="_4ovKIK7SEey-46jH0ooPYA" source="PapyrusCSSForceValue">
			        <details xmi:type="ecore:EStringToStringMapEntry" xmi:id="_4ovKIa7SEey-46jH0ooPYA" key="visible" value="true"/>
			      </eAnnotations>
			      <styles xmi:type="notation:TitleStyle" xmi:id="__rLuoa7REey-46jH0ooPYA"/>
			      <styles xmi:type="notation:StringValueStyle" xmi:id="__rLuoq7REey-46jH0ooPYA" name="stereotype" stringValue="I4.0 Profile::I4.0 Component"/>
			      <element xmi:type="uml:Stereotype" href="pathmap://I40_PROFILES/i40.profile.uml#_dHR00GGlEeyTgIN4Smg6_Q"/>
			      <layoutConstraint xmi:type="notation:Bounds" xmi:id="__rLuo67REey-46jH0ooPYA"/>
			    </children>
			    <styles xmi:type="notation:TitleStyle" xmi:id="__rFoBq7REey-46jH0ooPYA"/>
			    <styles xmi:type="notation:EObjectValueStyle" xmi:id="__rFoCK7REey-46jH0ooPYA" name="BASE_ELEMENT">
			      <eObjectValue xmi:type="uml:Component" href="I40.uml#_XJKWoK6_EeybpKCV4eI_mA"/>
			    </styles>
			    <element xsi:nil="true"/>
			    <layoutConstraint xmi:type="notation:Bounds" xmi:id="__rFoB67REey-46jH0ooPYA" x="260" y="540"/>
			  </children>
			  <children xmi:type="notation:Shape" xmi:id="_IXJG0LG_Eey86v2jwzb-qA" type="StereotypeComment">
			    <styles xmi:type="notation:TitleStyle" xmi:id="_IXJG0bG_Eey86v2jwzb-qA"/>
			    <styles xmi:type="notation:EObjectValueStyle" xmi:id="_IXJt4LG_Eey86v2jwzb-qA" name="BASE_ELEMENT">
			      <eObjectValue xmi:type="uml:Class" href="I40.uml#_yLcIEKvIEeybpKCV4eI_mA"/>
			    </styles>
			    <element xsi:nil="true"/>
			    <layoutConstraint xmi:type="notation:Bounds" xmi:id="_IXJG0rG_Eey86v2jwzb-qA" x="260" y="280"/>
			  </children>
			  <children xmi:type="notation:Shape" xmi:id="_IaEfALG_Eey86v2jwzb-qA" type="StereotypeComment">
			    <styles xmi:type="notation:TitleStyle" xmi:id="_IaEfAbG_Eey86v2jwzb-qA"/>
			    <styles xmi:type="notation:EObjectValueStyle" xmi:id="_IaFGELG_Eey86v2jwzb-qA" name="BASE_ELEMENT">
			      <eObjectValue xmi:type="uml:Component" href="I40.uml#_uUwBkK7BEeybpKCV4eI_mA"/>
			    </styles>
			    <element xsi:nil="true"/>
			    <layoutConstraint xmi:type="notation:Bounds" xmi:id="_IaEfArG_Eey86v2jwzb-qA" x="620" y="440"/>
			  </children>
			  <children xmi:type="notation:Shape" xmi:id="_IbGZwLG_Eey86v2jwzb-qA" type="StereotypeComment">
			    <styles xmi:type="notation:TitleStyle" xmi:id="_IbGZwbG_Eey86v2jwzb-qA"/>
			    <styles xmi:type="notation:EObjectValueStyle" xmi:id="_IbGZw7G_Eey86v2jwzb-qA" name="BASE_ELEMENT">
			      <eObjectValue xmi:type="uml:Component" href="I40.uml#_xuTXUK7BEeybpKCV4eI_mA"/>
			    </styles>
			    <element xsi:nil="true"/>
			    <layoutConstraint xmi:type="notation:Bounds" xmi:id="_IbGZwrG_Eey86v2jwzb-qA" x="1080" y="440"/>
			  </children>
			  <styles xmi:type="notation:StringValueStyle" xmi:id="_v2tFUavIEeybpKCV4eI_mA" name="diagram_compatibility_version" stringValue="1.4.0"/>
			  <styles xmi:type="notation:DiagramStyle" xmi:id="_v2tFUqvIEeybpKCV4eI_mA"/>
			  <styles xmi:type="style:PapyrusDiagramStyle" xmi:id="_v2tFU6vIEeybpKCV4eI_mA" diagramKindId="org.eclipse.papyrus.uml.diagram.class">
			    <owner xmi:type="uml:Model" href="I40.uml#_v02EIKvIEeybpKCV4eI_mA"/>
			  </styles>
			  <element xmi:type="uml:Model" href="I40.uml#_v02EIKvIEeybpKCV4eI_mA"/>
			  <edges xmi:type="notation:Connector" xmi:id="_I42dQK7AEeybpKCV4eI_mA" type="Association_Edge" source="_zwpUcK6_EeybpKCV4eI_mA" target="_FrUKQa7AEeybpKCV4eI_mA" routing="Rectilinear">
			    <children xmi:type="notation:DecorationNode" xmi:id="_I42dQ67AEeybpKCV4eI_mA" type="Association_StereotypeLabel">
			      <styles xmi:type="notation:BooleanValueStyle" xmi:id="_L8Qj4K7AEeybpKCV4eI_mA" name="IS_UPDATED_POSITION" booleanValue="true"/>
			      <layoutConstraint xmi:type="notation:Location" xmi:id="_I42dRK7AEeybpKCV4eI_mA" y="-20"/>
			    </children>
			    <children xmi:type="notation:DecorationNode" xmi:id="_I42dRa7AEeybpKCV4eI_mA" type="Association_NameLabel">
			      <styles xmi:type="notation:BooleanValueStyle" xmi:id="_L8tP0K7AEeybpKCV4eI_mA" name="IS_UPDATED_POSITION" booleanValue="true"/>
			      <layoutConstraint xmi:type="notation:Location" xmi:id="_I42dRq7AEeybpKCV4eI_mA" y="20"/>
			    </children>
			    <children xmi:type="notation:DecorationNode" xmi:id="_I42dR67AEeybpKCV4eI_mA" type="Association_TargetRoleLabel">
			      <styles xmi:type="notation:BooleanValueStyle" xmi:id="_L9NmIK7AEeybpKCV4eI_mA" name="IS_UPDATED_POSITION" booleanValue="true"/>
			      <layoutConstraint xmi:type="notation:Location" xmi:id="_I42dSK7AEeybpKCV4eI_mA" x="43" y="-20"/>
			    </children>
			    <children xmi:type="notation:DecorationNode" xmi:id="_I42dSa7AEeybpKCV4eI_mA" type="Association_SourceRoleLabel">
			      <styles xmi:type="notation:BooleanValueStyle" xmi:id="_L90DEK7AEeybpKCV4eI_mA" name="IS_UPDATED_POSITION" booleanValue="true"/>
			      <layoutConstraint xmi:type="notation:Location" xmi:id="_I42dSq7AEeybpKCV4eI_mA" x="-44" y="20"/>
			    </children>
			    <children xmi:type="notation:DecorationNode" xmi:id="_I42dS67AEeybpKCV4eI_mA" type="Association_SourceMultiplicityLabel">
			      <styles xmi:type="notation:BooleanValueStyle" xmi:id="_L-KoYK7AEeybpKCV4eI_mA" name="IS_UPDATED_POSITION" booleanValue="true"/>
			      <layoutConstraint xmi:type="notation:Location" xmi:id="_I42dTK7AEeybpKCV4eI_mA" x="43" y="20"/>
			    </children>
			    <children xmi:type="notation:DecorationNode" xmi:id="_I42dTa7AEeybpKCV4eI_mA" type="Association_TargetMultiplicityLabel">
			      <styles xmi:type="notation:BooleanValueStyle" xmi:id="_L-nUUK7AEeybpKCV4eI_mA" name="IS_UPDATED_POSITION" booleanValue="true"/>
			      <layoutConstraint xmi:type="notation:Location" xmi:id="_I42dTq7AEeybpKCV4eI_mA" x="-44" y="-20"/>
			    </children>
			    <styles xmi:type="notation:FontStyle" xmi:id="_I42dQa7AEeybpKCV4eI_mA"/>
			    <element xmi:type="uml:Association" href="I40.uml#_I4WG8K7AEeybpKCV4eI_mA"/>
			    <bendpoints xmi:type="notation:RelativeBendpoints" xmi:id="_I42dQq7AEeybpKCV4eI_mA" points="[846, 160, -643984, -643984]$[1040, 160, -643984, -643984]"/>
			    <sourceAnchor xmi:type="notation:IdentityAnchor" xmi:id="_I6xI0K7AEeybpKCV4eI_mA" id="(1.0,0.6211180124223602)"/>
			    <targetAnchor xmi:type="notation:IdentityAnchor" xmi:id="_I6xI0a7AEeybpKCV4eI_mA" id="(0.0,0.7407407407407407)"/>
			  </edges>
			  <edges xmi:type="notation:Connector" xmi:id="_33mtUK7AEeybpKCV4eI_mA" type="Association_Edge" source="_r9iIAK7AEeybpKCV4eI_mA" target="_wZLz8K7AEeybpKCV4eI_mA" routing="Rectilinear">
			    <children xmi:type="notation:DecorationNode" xmi:id="_33mtU67AEeybpKCV4eI_mA" type="Association_StereotypeLabel">
			      <styles xmi:type="notation:BooleanValueStyle" xmi:id="_4xwocK7AEeybpKCV4eI_mA" name="IS_UPDATED_POSITION" booleanValue="true"/>
			      <layoutConstraint xmi:type="notation:Location" xmi:id="_33mtVK7AEeybpKCV4eI_mA" y="-20"/>
			    </children>
			    <children xmi:type="notation:DecorationNode" xmi:id="_33mtVa7AEeybpKCV4eI_mA" type="Association_NameLabel">
			      <styles xmi:type="notation:BooleanValueStyle" xmi:id="_4yDjYK7AEeybpKCV4eI_mA" name="IS_UPDATED_POSITION" booleanValue="true"/>
			      <layoutConstraint xmi:type="notation:Location" xmi:id="_33mtVq7AEeybpKCV4eI_mA" y="20"/>
			    </children>
			    <children xmi:type="notation:DecorationNode" xmi:id="_33mtV67AEeybpKCV4eI_mA" type="Association_TargetRoleLabel">
			      <styles xmi:type="notation:BooleanValueStyle" xmi:id="_4yWeUK7AEeybpKCV4eI_mA" name="IS_UPDATED_POSITION" booleanValue="true"/>
			      <layoutConstraint xmi:type="notation:Location" xmi:id="_33mtWK7AEeybpKCV4eI_mA" x="32" y="-20"/>
			    </children>
			    <children xmi:type="notation:DecorationNode" xmi:id="_33mtWa7AEeybpKCV4eI_mA" type="Association_SourceRoleLabel">
			      <styles xmi:type="notation:BooleanValueStyle" xmi:id="_4y3bsK7AEeybpKCV4eI_mA" name="IS_UPDATED_POSITION" booleanValue="true"/>
			      <layoutConstraint xmi:type="notation:Location" xmi:id="_33mtWq7AEeybpKCV4eI_mA" x="-37" y="27"/>
			    </children>
			    <children xmi:type="notation:DecorationNode" xmi:id="_33mtW67AEeybpKCV4eI_mA" type="Association_SourceMultiplicityLabel">
			      <styles xmi:type="notation:BooleanValueStyle" xmi:id="_4zKWoK7AEeybpKCV4eI_mA" name="IS_UPDATED_POSITION" booleanValue="true"/>
			      <layoutConstraint xmi:type="notation:Location" xmi:id="_33mtXK7AEeybpKCV4eI_mA" x="32" y="20"/>
			    </children>
			    <children xmi:type="notation:DecorationNode" xmi:id="_33mtXa7AEeybpKCV4eI_mA" type="Association_TargetMultiplicityLabel">
			      <styles xmi:type="notation:BooleanValueStyle" xmi:id="_4zdRkK7AEeybpKCV4eI_mA" name="IS_UPDATED_POSITION" booleanValue="true"/>
			      <layoutConstraint xmi:type="notation:Location" xmi:id="_33v3QK7AEeybpKCV4eI_mA" x="-33" y="-20"/>
			    </children>
			    <styles xmi:type="notation:FontStyle" xmi:id="_33mtUa7AEeybpKCV4eI_mA"/>
			    <element xmi:type="uml:Association" href="I40.uml#_33RWIK7AEeybpKCV4eI_mA"/>
			    <bendpoints xmi:type="notation:RelativeBendpoints" xmi:id="_33mtUq7AEeybpKCV4eI_mA" points="[863, 320, -643984, -643984]$[1000, 320, -643984, -643984]"/>
			    <sourceAnchor xmi:type="notation:IdentityAnchor" xmi:id="_34tgkK7AEeybpKCV4eI_mA" id="(1.0,0.5673758865248227)"/>
			    <targetAnchor xmi:type="notation:IdentityAnchor" xmi:id="_34tgka7AEeybpKCV4eI_mA" id="(0.0,0.6557377049180327)"/>
			  </edges>
			  <edges xmi:type="notation:Connector" xmi:id="_Hp-kcK7CEeybpKCV4eI_mA" type="Association_Edge" source="_vmf9Ua7BEeybpKCV4eI_mA" target="_wtTNUa7BEeybpKCV4eI_mA">
			    <children xmi:type="notation:DecorationNode" xmi:id="_Hp-kc67CEeybpKCV4eI_mA" type="Association_StereotypeLabel">
			      <styles xmi:type="notation:BooleanValueStyle" xmi:id="_yVQZ4K7SEey-46jH0ooPYA" name="IS_UPDATED_POSITION" booleanValue="true"/>
			      <layoutConstraint xmi:type="notation:Location" xmi:id="_Hp-kdK7CEeybpKCV4eI_mA" y="-20"/>
			    </children>
			    <children xmi:type="notation:DecorationNode" xmi:id="_Hp-kda7CEeybpKCV4eI_mA" type="Association_NameLabel">
			      <styles xmi:type="notation:BooleanValueStyle" xmi:id="_yWJxwK7SEey-46jH0ooPYA" name="IS_UPDATED_POSITION" booleanValue="true"/>
			      <layoutConstraint xmi:type="notation:Location" xmi:id="_Hp-kdq7CEeybpKCV4eI_mA" y="20"/>
			    </children>
			    <children xmi:type="notation:DecorationNode" xmi:id="_Hp-kd67CEeybpKCV4eI_mA" type="Association_TargetRoleLabel">
			      <styles xmi:type="notation:BooleanValueStyle" xmi:id="_yXKeYK7SEey-46jH0ooPYA" name="IS_UPDATED_POSITION" booleanValue="true"/>
			      <layoutConstraint xmi:type="notation:Location" xmi:id="_Hp-keK7CEeybpKCV4eI_mA" x="37" y="-20"/>
			    </children>
			    <children xmi:type="notation:DecorationNode" xmi:id="_Hp-kea7CEeybpKCV4eI_mA" type="Association_SourceRoleLabel">
			      <styles xmi:type="notation:BooleanValueStyle" xmi:id="_yYRRoK7SEey-46jH0ooPYA" name="IS_UPDATED_POSITION" booleanValue="true"/>
			      <layoutConstraint xmi:type="notation:Location" xmi:id="_Hp-keq7CEeybpKCV4eI_mA" x="-38" y="20"/>
			    </children>
			    <children xmi:type="notation:DecorationNode" xmi:id="_Hp-ke67CEeybpKCV4eI_mA" type="Association_SourceMultiplicityLabel">
			      <styles xmi:type="notation:BooleanValueStyle" xmi:id="_yZOT4K7SEey-46jH0ooPYA" name="IS_UPDATED_POSITION" booleanValue="true"/>
			      <layoutConstraint xmi:type="notation:Location" xmi:id="_Hp-kfK7CEeybpKCV4eI_mA" x="37" y="20"/>
			    </children>
			    <children xmi:type="notation:DecorationNode" xmi:id="_Hp-kfa7CEeybpKCV4eI_mA" type="Association_TargetMultiplicityLabel">
			      <styles xmi:type="notation:BooleanValueStyle" xmi:id="_yaLWIK7SEey-46jH0ooPYA" name="IS_UPDATED_POSITION" booleanValue="true"/>
			      <layoutConstraint xmi:type="notation:Location" xmi:id="_Hp-kfq7CEeybpKCV4eI_mA" x="-38" y="-20"/>
			    </children>
			    <styles xmi:type="notation:FontStyle" xmi:id="_Hp-kca7CEeybpKCV4eI_mA"/>
			    <element xmi:type="uml:Association" href="I40.uml#_HpeOIK7CEeybpKCV4eI_mA"/>
			    <bendpoints xmi:type="notation:RelativeBendpoints" xmi:id="_Hp-kcq7CEeybpKCV4eI_mA" points="[647, 860, -643984, -643984]$[900, 860, -643984, -643984]"/>
			    <sourceAnchor xmi:type="notation:IdentityAnchor" xmi:id="_HrFXsK7CEeybpKCV4eI_mA" id="(1.0,0.5405405405405406)"/>
			    <targetAnchor xmi:type="notation:IdentityAnchor" xmi:id="_HrFXsa7CEeybpKCV4eI_mA" id="(0.0,0.47244094488188976)"/>
			  </edges>
			  <edges xmi:type="notation:Connector" xmi:id="_M0kaAK7CEeybpKCV4eI_mA" type="Association_Edge" source="_uUwBka7BEeybpKCV4eI_mA" target="_vmf9Ua7BEeybpKCV4eI_mA">
			    <children xmi:type="notation:DecorationNode" xmi:id="_M0kaA67CEeybpKCV4eI_mA" type="Association_StereotypeLabel">
			      <styles xmi:type="notation:BooleanValueStyle" xmi:id="_xWHREK7SEey-46jH0ooPYA" name="IS_UPDATED_POSITION" booleanValue="true"/>
			      <layoutConstraint xmi:type="notation:Location" xmi:id="_M0kaBK7CEeybpKCV4eI_mA" y="-20"/>
			    </children>
			    <children xmi:type="notation:DecorationNode" xmi:id="_M0kaBa7CEeybpKCV4eI_mA" type="Association_NameLabel">
			      <styles xmi:type="notation:BooleanValueStyle" xmi:id="_xXNdQK7SEey-46jH0ooPYA" name="IS_UPDATED_POSITION" booleanValue="true"/>
			      <layoutConstraint xmi:type="notation:Location" xmi:id="_M0kaBq7CEeybpKCV4eI_mA" y="20"/>
			    </children>
			    <children xmi:type="notation:DecorationNode" xmi:id="_M0kaB67CEeybpKCV4eI_mA" type="Association_TargetRoleLabel">
			      <styles xmi:type="notation:BooleanValueStyle" xmi:id="_xYUQgK7SEey-46jH0ooPYA" name="IS_UPDATED_POSITION" booleanValue="true"/>
			      <layoutConstraint xmi:type="notation:Location" xmi:id="_M0kaCK7CEeybpKCV4eI_mA" x="11" y="-20"/>
			    </children>
			    <children xmi:type="notation:DecorationNode" xmi:id="_M0kaCa7CEeybpKCV4eI_mA" type="Association_SourceRoleLabel">
			      <styles xmi:type="notation:BooleanValueStyle" xmi:id="_xZmC4K7SEey-46jH0ooPYA" name="IS_UPDATED_POSITION" booleanValue="true"/>
			      <layoutConstraint xmi:type="notation:Location" xmi:id="_M0kaCq7CEeybpKCV4eI_mA" x="-12" y="20"/>
			    </children>
			    <children xmi:type="notation:DecorationNode" xmi:id="_M0kaC67CEeybpKCV4eI_mA" type="Association_SourceMultiplicityLabel">
			      <styles xmi:type="notation:BooleanValueStyle" xmi:id="_xa5DYK7SEey-46jH0ooPYA" name="IS_UPDATED_POSITION" booleanValue="true"/>
			      <layoutConstraint xmi:type="notation:Location" xmi:id="_M0kaDK7CEeybpKCV4eI_mA" x="11" y="20"/>
			    </children>
			    <children xmi:type="notation:DecorationNode" xmi:id="_M0kaDa7CEeybpKCV4eI_mA" type="Association_TargetMultiplicityLabel">
			      <styles xmi:type="notation:BooleanValueStyle" xmi:id="_xcMq8K7SEey-46jH0ooPYA" name="IS_UPDATED_POSITION" booleanValue="true"/>
			      <layoutConstraint xmi:type="notation:Location" xmi:id="_M0kaDq7CEeybpKCV4eI_mA" x="-12" y="-20"/>
			    </children>
			    <styles xmi:type="notation:FontStyle" xmi:id="_M0kaAa7CEeybpKCV4eI_mA"/>
			    <element xmi:type="uml:Association" href="I40.uml#_M0EDsK7CEeybpKCV4eI_mA"/>
			    <bendpoints xmi:type="notation:RelativeBendpoints" xmi:id="_M0kaAq7CEeybpKCV4eI_mA" points="[540, 620, -643984, -643984]$[540, 840, -643984, -643984]"/>
			    <sourceAnchor xmi:type="notation:IdentityAnchor" xmi:id="_M14BkK7CEeybpKCV4eI_mA" id="(0.1360544217687075,1.0)"/>
			    <targetAnchor xmi:type="notation:IdentityAnchor" xmi:id="_M14Bka7CEeybpKCV4eI_mA" id="(0.5607476635514018,0.0)"/>
			  </edges>
			  <edges xmi:type="notation:Connector" xmi:id="_bALjOa7NEeygZ9ijIBRV9g" type="StereotypeCommentLink" source="_lao4MK6_EeybpKCV4eI_mA" target="_bALjNa7NEeygZ9ijIBRV9g">
			    <styles xmi:type="notation:FontStyle" xmi:id="_bALjOq7NEeygZ9ijIBRV9g"/>
			    <styles xmi:type="notation:EObjectValueStyle" xmi:id="_bALjPq7NEeygZ9ijIBRV9g" name="BASE_ELEMENT">
			      <eObjectValue xmi:type="uml:Signal" href="I40.uml#_lafHMK6_EeybpKCV4eI_mA"/>
			    </styles>
			    <element xsi:nil="true"/>
			    <bendpoints xmi:type="notation:RelativeBendpoints" xmi:id="_bALjO67NEeygZ9ijIBRV9g" points="[0, 0, 0, 0]$[0, 0, 0, 0]"/>
			    <sourceAnchor xmi:type="notation:IdentityAnchor" xmi:id="_bALjPK7NEeygZ9ijIBRV9g"/>
			    <targetAnchor xmi:type="notation:IdentityAnchor" xmi:id="_bALjPa7NEeygZ9ijIBRV9g"/>
			  </edges>
			  <edges xmi:type="notation:Connector" xmi:id="__rFoCa7REey-46jH0ooPYA" type="StereotypeCommentLink" source="_XJ0d8K6_EeybpKCV4eI_mA" target="__rFoBa7REey-46jH0ooPYA">
			    <styles xmi:type="notation:FontStyle" xmi:id="__rFoCq7REey-46jH0ooPYA"/>
			    <styles xmi:type="notation:EObjectValueStyle" xmi:id="__rKggq7REey-46jH0ooPYA" name="BASE_ELEMENT">
			      <eObjectValue xmi:type="uml:Component" href="I40.uml#_XJKWoK6_EeybpKCV4eI_mA"/>
			    </styles>
			    <element xsi:nil="true"/>
			    <bendpoints xmi:type="notation:RelativeBendpoints" xmi:id="__rFoC67REey-46jH0ooPYA" points="[0, 0, 0, 0]$[0, 0, 0, 0]"/>
			    <sourceAnchor xmi:type="notation:IdentityAnchor" xmi:id="__rKggK7REey-46jH0ooPYA"/>
			    <targetAnchor xmi:type="notation:IdentityAnchor" xmi:id="__rKgga7REey-46jH0ooPYA"/>
			  </edges>
			  <edges xmi:type="notation:Connector" xmi:id="_IXJt4bG_Eey86v2jwzb-qA" type="StereotypeCommentLink" source="_yLkq8KvIEeybpKCV4eI_mA" target="_IXJG0LG_Eey86v2jwzb-qA">
			    <styles xmi:type="notation:FontStyle" xmi:id="_IXJt4rG_Eey86v2jwzb-qA"/>
			    <styles xmi:type="notation:EObjectValueStyle" xmi:id="_IXKU8rG_Eey86v2jwzb-qA" name="BASE_ELEMENT">
			      <eObjectValue xmi:type="uml:Class" href="I40.uml#_yLcIEKvIEeybpKCV4eI_mA"/>
			    </styles>
			    <element xsi:nil="true"/>
			    <bendpoints xmi:type="notation:RelativeBendpoints" xmi:id="_IXJt47G_Eey86v2jwzb-qA" points="[0, 0, 0, 0]$[0, 0, 0, 0]"/>
			    <sourceAnchor xmi:type="notation:IdentityAnchor" xmi:id="_IXKU8LG_Eey86v2jwzb-qA"/>
			    <targetAnchor xmi:type="notation:IdentityAnchor" xmi:id="_IXKU8bG_Eey86v2jwzb-qA"/>
			  </edges>
			  <edges xmi:type="notation:Connector" xmi:id="_IYZrEbG_Eey86v2jwzb-qA" type="StereotypeCommentLink" source="_QgxbcK7BEeybpKCV4eI_mA" target="_IYZEALG_Eey86v2jwzb-qA">
			    <styles xmi:type="notation:FontStyle" xmi:id="_IYZrErG_Eey86v2jwzb-qA"/>
			    <styles xmi:type="notation:EObjectValueStyle" xmi:id="_IYZrFrG_Eey86v2jwzb-qA" name="BASE_ELEMENT">
			      <eObjectValue xmi:type="uml:Signal" href="I40.uml#_QgUvgK7BEeybpKCV4eI_mA"/>
			    </styles>
			    <element xsi:nil="true"/>
			    <bendpoints xmi:type="notation:RelativeBendpoints" xmi:id="_IYZrE7G_Eey86v2jwzb-qA" points="[0, 0, 0, 0]$[0, 0, 0, 0]"/>
			    <sourceAnchor xmi:type="notation:IdentityAnchor" xmi:id="_IYZrFLG_Eey86v2jwzb-qA"/>
			    <targetAnchor xmi:type="notation:IdentityAnchor" xmi:id="_IYZrFbG_Eey86v2jwzb-qA"/>
			  </edges>
			  <edges xmi:type="notation:Connector" xmi:id="_IYysobG_Eey86v2jwzb-qA" type="StereotypeCommentLink" source="_zwpUcK6_EeybpKCV4eI_mA" target="_IYyFkLG_Eey86v2jwzb-qA">
			    <styles xmi:type="notation:FontStyle" xmi:id="_IYysorG_Eey86v2jwzb-qA"/>
			    <styles xmi:type="notation:EObjectValueStyle" xmi:id="_IYysprG_Eey86v2jwzb-qA" name="BASE_ELEMENT">
			      <eObjectValue xmi:type="uml:Class" href="I40.uml#_zwbSAK6_EeybpKCV4eI_mA"/>
			    </styles>
			    <element xsi:nil="true"/>
			    <bendpoints xmi:type="notation:RelativeBendpoints" xmi:id="_IYyso7G_Eey86v2jwzb-qA" points="[0, 0, 0, 0]$[0, 0, 0, 0]"/>
			    <sourceAnchor xmi:type="notation:IdentityAnchor" xmi:id="_IYyspLG_Eey86v2jwzb-qA"/>
			    <targetAnchor xmi:type="notation:IdentityAnchor" xmi:id="_IYyspbG_Eey86v2jwzb-qA"/>
			  </edges>
			  <edges xmi:type="notation:Connector" xmi:id="_IZeCELG_Eey86v2jwzb-qA" type="StereotypeCommentLink" source="_r9iIAK7AEeybpKCV4eI_mA" target="_IZdbALG_Eey86v2jwzb-qA">
			    <styles xmi:type="notation:FontStyle" xmi:id="_IZeCEbG_Eey86v2jwzb-qA"/>
			    <styles xmi:type="notation:EObjectValueStyle" xmi:id="_IZepILG_Eey86v2jwzb-qA" name="BASE_ELEMENT">
			      <eObjectValue xmi:type="uml:Class" href="I40.uml#_r9BxsK7AEeybpKCV4eI_mA"/>
			    </styles>
			    <element xsi:nil="true"/>
			    <bendpoints xmi:type="notation:RelativeBendpoints" xmi:id="_IZeCErG_Eey86v2jwzb-qA" points="[0, 0, 0, 0]$[0, 0, 0, 0]"/>
			    <sourceAnchor xmi:type="notation:IdentityAnchor" xmi:id="_IZeCE7G_Eey86v2jwzb-qA"/>
			    <targetAnchor xmi:type="notation:IdentityAnchor" xmi:id="_IZeCFLG_Eey86v2jwzb-qA"/>
			  </edges>
			  <edges xmi:type="notation:Connector" xmi:id="_IaFGEbG_Eey86v2jwzb-qA" type="StereotypeCommentLink" source="_uUwBka7BEeybpKCV4eI_mA" target="_IaEfALG_Eey86v2jwzb-qA">
			    <styles xmi:type="notation:FontStyle" xmi:id="_IaFGErG_Eey86v2jwzb-qA"/>
			    <styles xmi:type="notation:EObjectValueStyle" xmi:id="_IaFGFrG_Eey86v2jwzb-qA" name="BASE_ELEMENT">
			      <eObjectValue xmi:type="uml:Component" href="I40.uml#_uUwBkK7BEeybpKCV4eI_mA"/>
			    </styles>
			    <element xsi:nil="true"/>
			    <bendpoints xmi:type="notation:RelativeBendpoints" xmi:id="_IaFGE7G_Eey86v2jwzb-qA" points="[0, 0, 0, 0]$[0, 0, 0, 0]"/>
			    <sourceAnchor xmi:type="notation:IdentityAnchor" xmi:id="_IaFGFLG_Eey86v2jwzb-qA"/>
			    <targetAnchor xmi:type="notation:IdentityAnchor" xmi:id="_IaFGFbG_Eey86v2jwzb-qA"/>
			  </edges>
			  <edges xmi:type="notation:Connector" xmi:id="_IbGZxLG_Eey86v2jwzb-qA" type="StereotypeCommentLink" source="_xuTXUa7BEeybpKCV4eI_mA" target="_IbGZwLG_Eey86v2jwzb-qA">
			    <styles xmi:type="notation:FontStyle" xmi:id="_IbGZxbG_Eey86v2jwzb-qA"/>
			    <styles xmi:type="notation:EObjectValueStyle" xmi:id="_IbGZybG_Eey86v2jwzb-qA" name="BASE_ELEMENT">
			      <eObjectValue xmi:type="uml:Component" href="I40.uml#_xuTXUK7BEeybpKCV4eI_mA"/>
			    </styles>
			    <element xsi:nil="true"/>
			    <bendpoints xmi:type="notation:RelativeBendpoints" xmi:id="_IbGZxrG_Eey86v2jwzb-qA" points="[0, 0, 0, 0]$[0, 0, 0, 0]"/>
			    <sourceAnchor xmi:type="notation:IdentityAnchor" xmi:id="_IbGZx7G_Eey86v2jwzb-qA"/>
			    <targetAnchor xmi:type="notation:IdentityAnchor" xmi:id="_IbGZyLG_Eey86v2jwzb-qA"/>
			  </edges>
			</notation:Diagram>
			'''
}
