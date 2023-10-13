package main;

import java.text.MessageFormat;
import java.time.Instant;

import example.architecture.components.schemas.BeltInfo;
import example.architecture.components.schemas.PathInfo;
import example.architecture.infra.IChannel.IChannelPublishConfiguration;
import example.architecture.infra.IServer;
import example.architecture.iotbox._id_.monitor.MonitorChannel;
import example.architecture.iotbox._id_.monitor.MonitorChannel.MonitorChannelParameters;
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
			MonitorChannelParameters params = MonitorChannel.SendStatusOperation.newParametersBuilder()
					.withId("box1")
				.build();
			
			// Create configuration
			IChannelPublishConfiguration config = MonitorChannel.SendStatusOperation.newConfiguration(params);

			// Publish message
			MonitorChannel.SendStatusOperation.publish(production, config, payload);
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