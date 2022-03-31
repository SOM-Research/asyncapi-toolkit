package io.github.abelgomez.asyncapi.ui.wizard

import java.io.ByteArrayInputStream

import static extension io.github.abelgomez.asyncapi.generator.AsyncApi2Json.*
import static extension io.github.abelgomez.asyncapi.m2m.Ecore2AsyncApi.*

final class ExampleEcoreAsyncApiProject extends AbstractAsyncApiProjectTemplate {
	
	override getLabel() {
		"Example AsyncAPI Project from Ecore"
	}

	override getDescription() {
		"<p><b>Example Ecore project</b></p><p>Creates a new AsyncAPI v2.0.0 project from using an example Ecore file. You can set the package the file is created in.</p>"
	}

	override createProjectFactory() {
		super.createProjectFactory => [
			addFile('''«SRC_JAVA»/«path»/Events.ecore''', ecoreFileContents())
			addFile('''«SRC_JAVA»/«path»/Events.asyncapi''', new ByteArrayInputStream(ecoreFileContents.toString.bytes).loadEPackage.asyncApi.generate)
			addFile('''«SRC_JAVA»/main/MainExample.java''', '''
				package main;
				
				import java.text.MessageFormat;
				import java.util.stream.Collectors;
				
				import events.components.schemas.Event;
				import events.components.schemas.Sensor;
				import events.components.schemas.Timestamp;
				import events.infra.IChannel.IChannelPublishConfiguration;
				import events.infra.IServer;
				import events.sensors._group_.events.EventsChannel.EventsChannelParameters;
				import events.sensors._group_.events.PublishOperation;
				import events.sensors._group_.events.SubscribeOperation;
				import events.servers.ProductionServer;
				
				public class MainExample  {
					public static void main(String[] args) throws Exception {
						// Create a connection to the Production server
						IServer production = ProductionServer.create();
						try {
							// Register a new subscription to the LightMeasured operation
							SubscribeOperation.subscribe(production, (message, params) -> {
								// Inform about the message received
								System.err.println(MessageFormat.format(
										"Received message from sensor ''{0}'' in group ''{1}'':\n{2}",
										message.getPayload().getName(),
										params.getGroup(),
										message.getPayload().getEvents().stream().map(e -> e.toJson(true)).collect(Collectors.toList())));
							});
					
							// Prepare to publish several messages
							for (int i = 0; i < 5; i++) {
								// Create the payload via the its builder
								Sensor payload = Sensor.newBuilder()
										// Notice that the properties of the payload can be set via
										// setter that know about the domain (e.g., name and type of
										// the property
										.withName("Sensor " + i)
										.addToEvents(
											Event.newBuilder()
												.withType(Event.Type.DIED)
												.withTimestamp(
													Timestamp.newBuilder()
														.withYear(1970)
														.withMonth(01)
														.withDay(01)
														.withHour(00)
														.withMinute(00)
														.withSecond(00)
														.build()
												).build()
										).build();
								
								// Create the parameters
								EventsChannelParameters params = PublishOperation.newParametersBuilder().withGroup("MyGroup").build();
								IChannelPublishConfiguration configuration = PublishOperation.newConfiguration(params);
								// Inform about the message to be sent
								// Note that the "retrieveTopicName" method allows getting the topic (channel) with the parameters set to 
								// their actual values
								System.out.println(MessageFormat.format(
										"Publishing at topic ''{0}'' (''{1}''):\n{2}",
										configuration.getChannel().getName(),
										configuration.getActualChannelName(),
										payload.toJson(true)));
								
								// Publish the LightMeasured message
								PublishOperation.publish(production, configuration, payload);
							}
						} finally {
							// Unsubscribe from the topic and disconnect
							SubscribeOperation.unsubscribe(production);
							production.disconnect();
						}
					}
				}
			''')
		]
	}
	
	def ecoreFileContents() '''
			<?xml version="1.0" encoding="UTF-8"?>
			<ecore:EPackage xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
			    xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore" name="Events" nsURI="http://org.example/Events" nsPrefix="Events">
			  <eAnnotations source="http://io.github.abelgomez/asyncapi/eAnnotations/Server">
			    <details key="name" value="production"/>
			    <details key="url" value="localhost:1883"/>
			    <details key="protocol" value="mqtt"/>
			  </eAnnotations>
			  <eClassifiers xsi:type="ecore:EClass" name="Sensor">
			    <eAnnotations source="http://io.github.abelgomez/asyncapi/eAnnotations/Channel">
			      <details key="name" value="sensors/{group}/events"/>
			      <details key="description" value="Description"/>
			      <details key="publish" value="publish"/>
			      <details key="subscribe" value="subscribe"/>
			      <details key="parameters" value="group"/>
			    </eAnnotations>
			    <eStructuralFeatures xsi:type="ecore:EAttribute" name="name" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString"/>
			    <eStructuralFeatures xsi:type="ecore:EReference" name="events" upperBound="-1"
			        eType="#//Event" containment="true"/>
			  </eClassifiers>
			  <eClassifiers xsi:type="ecore:EClass" name="Event">
			    <eStructuralFeatures xsi:type="ecore:EAttribute" name="type" lowerBound="1" eType="#//EventType"/>
			    <eStructuralFeatures xsi:type="ecore:EReference" name="timestamp" lowerBound="1"
			        eType="#//Timestamp" containment="true"/>
			  </eClassifiers>
			  <eClassifiers xsi:type="ecore:EClass" name="Timestamp">
			    <eStructuralFeatures xsi:type="ecore:EAttribute" name="year" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EInt"/>
			    <eStructuralFeatures xsi:type="ecore:EAttribute" name="month" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EInt"/>
			    <eStructuralFeatures xsi:type="ecore:EAttribute" name="day" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EInt"/>
			    <eStructuralFeatures xsi:type="ecore:EAttribute" name="hour" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EInt"/>
			    <eStructuralFeatures xsi:type="ecore:EAttribute" name="minute" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EInt"/>
			    <eStructuralFeatures xsi:type="ecore:EAttribute" name="second" eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EInt"/>
			  </eClassifiers>
			  <eClassifiers xsi:type="ecore:EEnum" name="EventType">
			    <eLiterals name="UNDEFINED"/>
			    <eLiterals name="STATE_CHANGED" value="1"/>
			    <eLiterals name="DIED" value="2"/>
			  </eClassifiers>
			</ecore:EPackage>
			'''
}
