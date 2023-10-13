package main;

import java.text.MessageFormat;
import java.time.LocalDateTime;
import java.util.UUID;
import java.util.function.Consumer;

import streetlights.api.components.schemas.LightMeasuredPayload;
import streetlights.api.infra.IChannel.IChannelPublishConfiguration;
import streetlights.api.infra.IServer;
import streetlights.api.infra.IServer.Received;
import streetlights.api.servers.ProductionServer;
import streetlights.api.smartylighting.streetlights._1._0.event._streetlightId_.lighting.measured.MeasuredChannel;
import streetlights.api.smartylighting.streetlights._1._0.event._streetlightId_.lighting.measured.MeasuredChannel.MeasuredChannelParameters;

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
		Consumer<Received> consumer = null;
		try {
			// Register a new subscription to the LightMeasured operation
			consumer = MeasuredChannel.ReceiveLightMeasurementOperation.subscribe(production, 
					(message, params) -> {
				// Inform about the message received
				System.err.println(MessageFormat.format(
						"Subscription to ''{0}'' with ID ''{1}'':\n{2} lumens at {3}",
						MeasuredChannel.TOPIC_ID,
						// Notice that both the params and the payload fields can be
						// queried via getters that know about the domain being modeled 
						params.getStreetlightId(),
						message.getPayload().orElseThrow().getLumens(), 
						message.getPayload().orElseThrow().getSentAt()));
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
				MeasuredChannelParameters params = MeasuredChannel.SendLightMeasurementOperation.newParametersBuilder()
						.withStreetlightId(UUID.randomUUID().toString()).build();

				// Create an IChannelPublishConfiguration so that we can query the actual topic name in the IServer
				IChannelPublishConfiguration config = MeasuredChannel.SendLightMeasurementOperation.newConfiguration(params);

				// Inform about the message to be sent
				System.out.println(MessageFormat.format(
						"Publishing at ''{0}'':\n{1}",
						config.getActualChannelName(),
						payload.toJson(true)));
				
				MeasuredChannel.SendLightMeasurementOperation.publish(production, config, payload);
			}
		} finally {
			// Unsubscribe from the topic and disconnect
			MeasuredChannel.ReceiveLightMeasurementOperation.unsubscribe(production, consumer);
			production.disconnect();
		}
	}
}