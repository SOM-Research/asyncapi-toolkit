package io.github.abelgomez.asyncapi.ui.wizard

import org.eclipse.xtext.ui.util.PluginProjectFactory

final class StreetlightsApiProject extends AbstractAsyncApiProjectTemplate {
	def StreetlightsApiProject() {
		path.value = "streetlights"
	}

	override getLabel() {
		"Streetlights API Example Project"
	}

	override getDescription() {
		"<p><b>Streetlights API</b></p><p>This is an example for AsyncApi v2.0.0. You can set the package the file is created in.</p>"
	}

	override protected updateVariables() {
		super.updateVariables
		if (!advanced.value) {
			path.value = "streetlights"
		}
	}


	override createProjectFactory() {
		super.createProjectFactory => [
			addFile('''«SRC_JAVA»/«path»/StreetlightsAPI.asyncapi''', '''
				{
				  "asyncapi": "2.0.0",
				  "info": {
				    "title": "Streetlights API",
				    "version": "1.0.0",
				       "description": "The Smartylighting Streetlights API allows you to remotely manage the city lights.\n\n### Check out its awesome features:\n\n* Turn a specific streetlight on/off 🌃\n* Dim a specific streetlight 😎\n* Receive real-time information about environmental lighting conditions 📈\n",
				    "license": {
				      "name": "Apache 2.0",
				      "url": "https://www.apache.org/licenses/LICENSE-2.0"
				    }
				  },
				  "servers": {
				    "production": {
				      "url": "localhost:{port}",
				      "protocol": "mqtt",
				      "description": "Test broker",
				      "variables": {
				        "port": {
				          "description": "Secure connection (TLS) is available through port 8883.",
				          "default": "1883",
				          "enum": [
				            "1883",
				            "8883"
				          ]
				        }
				      },
				    }
				  },
				  "channels": {
				    "smartylighting/streetlights/1/0/event/{streetlightId}/lighting/measured": {
				      "description": "The topic on which measured values may be produced and consumed.",
				      "parameters": {
				        "streetlightId": {
				          "$ref": "#/components/parameters/streetlightId"
				        }
				      },
				      "subscribe": {
				        "summary": "Receive information about environmental lighting conditions of a particular streetlight.",
				        "operationId": "receiveLightMeasurement",
				        "message": {
				          "$ref": "#/components/messages/lightMeasured"
				        }
				      },
					  "publish": {
				        "summary": "Publish information about environmental lighting conditions of a particular streetlight.",
				        "operationId": "sendLightMeasurement",
				        "message": {
				          "$ref": "#/components/messages/lightMeasured"
				        }
				      }
				    },
				    "smartylighting/streetlights/1/0/action/{streetlightId}/turn/on": {
				      "parameters": {
				        "streetlightId": {
				          "$ref": "#/components/parameters/streetlightId"
				        }
				      },
				      "publish": {
				        "operationId": "turnOn",
				        "message": {
				          "$ref": "#/components/messages/turnOnOff"
				        }
				      }
				    },
				    "smartylighting/streetlights/1/0/action/{streetlightId}/turn/off": {
				      "parameters": {
				        "streetlightId": {
				          "$ref": "#/components/parameters/streetlightId"
				        }
				      },
				      "publish": {
				        "operationId": "turnOff",
				        "message": {
				          "$ref": "#/components/messages/turnOnOff"
				        }
				      }
				    },
				    "smartylighting/streetlights/1/0/action/{streetlightId}/dim": {
				      "parameters": {
				        "streetlightId": {
				          "$ref": "#/components/parameters/streetlightId"
				        }
				      },
				      "publish": {
				        "operationId": "dimLight",
				        "message": {
				          "$ref": "#/components/messages/dimLight"
				        }
				      }
				    }
				  },
				  "components": {
				    "messages": {
				      "lightMeasured": {
				        "name": "lightMeasured",
				        "title": "Light measured",
				        "summary": "Inform about environmental lighting conditions for a particular streetlight.",
				        "payload": {
				          "$ref": "#/components/schemas/lightMeasuredPayload"
				        }
				      },
				      "turnOnOff": {
				        "name": "turnOnOff",
				        "title": "Turn on/off",
				        "summary": "Command a particular streetlight to turn the lights on or off.",
				        "payload": {
				          "$ref": "#/components/schemas/turnOnOffPayload"
				        }
				      },
				      "dimLight": {
				        "name": "dimLight",
				        "title": "Dim light",
				        "summary": "Command a particular streetlight to dim the lights.",
				        "payload": {
				          "$ref": "#/components/schemas/dimLightPayload"
				        }
				      }
				    },
				    "schemas": {
				      "lightMeasuredPayload": {
				        "type": "object",
				        "properties": {
				          "lumens": {
				            "type": "integer",
				            "minimum": 0,
				            "description": "Light intensity measured in lumens."
				          },
				          "sentAt": {
				            "$ref": "#/components/schemas/sentAt"
				          }
				        }
				      },
				      "turnOnOffPayload": {
				        "type": "object",
				        "properties": {
				          "command": {
				            "type": "string",
				            "enum": [
				              "on",
				              "off"
				            ],
				            "description": "Whether to turn on or off the light."
				          },
				          "sentAt": {
				            "$ref": "#/components/schemas/sentAt"
				          }
				        }
				      },
				      "dimLightPayload": {
				        "type": "object",
				        "properties": {
				          "percentage": {
				            "type": "integer",
				            "description": "Percentage to which the light should be dimmed to.",
				            "minimum": 0,
				            "maximum": 100
				          },
				          "sentAt": {
				            "$ref": "#/components/schemas/sentAt"
				          }
				        }
				      },
				      "sentAt": {
				        "type": "string",
				        "format": "date-time",
				        "description": "Date and time when the message was sent."
				      }
				    },
				    "parameters": {
				      "streetlightId": {
				        "description": "The ID of the streetlight.",
				        "schema": {
				          "type": "string"
				        }
				      }
				    }
				  }
				}
			''')
			addFile('''«SRC_JAVA»/main/MainExample.java''', '''
				package main;
				
				import java.text.MessageFormat;
				import java.time.LocalDateTime;
				import java.util.UUID;
				
				import streetlights.api.components.schemas.LightMeasuredPayload;
				import streetlights.api.infra.IChannel.IChannelPublishConfiguration;
				import streetlights.api.infra.IServer;
				import streetlights.api.servers.ProductionServer;
				import streetlights.api.smartylighting.streetlights._1._0.event._streetlightId_.lighting.measured.MeasuredChannel;
				import streetlights.api.smartylighting.streetlights._1._0.event._streetlightId_.lighting.measured.MeasuredChannel.MeasuredChannelParameters;
				import streetlights.api.smartylighting.streetlights._1._0.event._streetlightId_.lighting.measured.ReceiveLightMeasurementOperation;
				import streetlights.api.smartylighting.streetlights._1._0.event._streetlightId_.lighting.measured.SendLightMeasurementOperation;
				
				/**
				 * Example program demonstrating how the generated code can be used. To execute
				 * this example program using an embedded Moquette MQTT server, see the
				 * <code>src/test/java</code> directory and execute the {@link TestMainExample}
				 * Junit class.
				 * 
				 * @author agomez
				 *
				 */
				public class MainExample {
					public static void main(String[] args) throws Exception {
						// Create a connection to the Production server
						IServer production = ProductionServer.create();
						try {
							// Register a new subscription to the LightMeasured operation
							ReceiveLightMeasurementOperation.subscribe(production, 
									(message, params) -> {
								// Inform about the message received
								System.err.println(MessageFormat.format(
										"Subscription to ''{0}'' with ID ''{1}'':\n{2} lumens at {3}",
										MeasuredChannel.TOPIC_ID,
										// Notice that both the params and the payload fields can be
										// queried via getters that know about the domain being modeled 
										params.getStreetlightId(),
										message.getPayload().getLumens(), 
										message.getPayload().getSentAt()));
							});
					
							// Prepare to publish several messages
							for (int i = 0; i < 5; i++) {
								// Create the payload via the payloadBuiler offered by the publish  operation
								LightMeasuredPayload payload = LightMeasuredPayload.newBuilder()
										// Notice that the properties of the payload can be set via
										// setter that know about the domain (e.g., name and type of
										// the property
										.withLumens(10)
										.withSentAt(LocalDateTime.now().toString())
										.build();
								
								// Set the value of the parameters. Notice that a setter is also provided
								MeasuredChannelParameters params = SendLightMeasurementOperation.newParametersBuilder()
										.withStreetlightId(UUID.randomUUID().toString()).build();
				
								// Create an IChannelPublishConfiguration so that we can query the actual topic name in the IServer
								IChannelPublishConfiguration config = SendLightMeasurementOperation.newConfiguration(params);
				
								// Inform about the message to be sent
								System.out.println(MessageFormat.format(
										"Publishing at ''{0}'':\n{1}",
										ProductionServer.retrieveTopicName(config),
										payload.toJson(true)));
								
								SendLightMeasurementOperation.publish(production, config, payload);
							}
						} finally {
							// Unsubscribe from the topic and disconnect
							ReceiveLightMeasurementOperation.unsubscribe(production);
							production.disconnect();
						}
					}
				}
			''')
			addFile('''«TEST_JAVA»/main/TestMainExample.java''', '''
				package main;
				
				import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
				
				import java.io.IOException;
				
				import org.junit.jupiter.api.BeforeEach;
				import org.junit.jupiter.api.AfterEach;
				import org.junit.jupiter.api.Test;
				
				import io.moquette.broker.Server;
				
				class TestMainExample {
					
					Server server;
					
					@BeforeEach
					void setup() throws IOException {
						// Create an embedded Moquette server and start it
						server = new Server();
						server.startServer();
					}
				
					@Test
					void test() {
						// Assert that the main program runs without throwing exceptions
						assertDoesNotThrow(() -> MainExample.main(new String[] {}));
					}
					
					@AfterEach
					void tearDown() {
						// Stop the embedded Moquette Server
						server.stopServer();
						server = null;
					}
				}
			''')
			addFile('''config/moquette.conf''', '''
				port 1883
				host 0.0.0.0
				allow_anonymous true
			''')
		]
	}
	
	override pomDependencies() '''
		<dependency>
		      <groupId>io.moquette</groupId>
		      <artifactId>moquette-broker</artifactId>
		      <version>0.15</version>
		</dependency>
		«super.pomDependencies»
	'''
}
