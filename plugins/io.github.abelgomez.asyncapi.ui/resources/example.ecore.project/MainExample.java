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

public class MainExample {
	public static void main(String[] args) throws Exception {
		// Create a connection to the Production server
		IServer production = ProductionServer.create();
		try {
			// Register a new subscription to the LightMeasured operation
			SubscribeOperation.subscribe(production, (message, params) -> {
				// Inform about the message received
				System.err.println(MessageFormat.format("Received message from sensor ''{0}'' in group ''{1}'':\n{2}",
						message.getPayload().orElseThrow().getName(), params.getGroup(), message.getPayload().orElseThrow().getEvents().stream()
								.map(e -> e.toJson(true)).collect(Collectors.toList())));
			});

			// Prepare to publish several messages
			for (int i = 0; i < 5; i++) {
				// Create the payload via the its builder
				Sensor payload = Sensor.newBuilder()
						// Notice that the properties of the payload can be set via
						// setter that know about the domain (e.g., name and type of
						// the property
						.withName(
								"Sensor " + i)
						.addToEvents(Event.newBuilder().withType(Event.Type.DIED)
								.withTimestamp(Timestamp.newBuilder().withYear(1970).withMonth(01).withDay(01)
										.withHour(00).withMinute(00).withSecond(00).build())
								.build())
						.build();

				// Create the parameters
				EventsChannelParameters params = PublishOperation.newParametersBuilder().withGroup("MyGroup").build();
				IChannelPublishConfiguration configuration = PublishOperation.newConfiguration(params);
				// Inform about the message to be sent
				// Note that the "retrieveTopicName" method allows getting the topic (channel)
				// with the parameters set to
				// their actual values
				System.out.println(MessageFormat.format("Publishing at topic ''{0}'' (''{1}''):\n{2}",
						configuration.getChannel().getName(), configuration.getActualChannelName(),
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