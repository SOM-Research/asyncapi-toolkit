package main;

import java.text.MessageFormat;
import java.util.function.Consumer;

import example.architecture.infra.IServer;
import example.architecture.infra.IServer.Received;
import example.architecture.iotbox._id_.monitor.MonitorChannel;
import example.architecture.servers.ProductionServer;

public class SubscribeExample {
	public static void main(String[] args) throws Exception {
		
		// Create Server
		IServer production = ProductionServer.create();
		
		Consumer<Received> consumer = null;

		try {
			
			// Subscribe to channel on server, and set the callback function
			consumer = MonitorChannel.ReceiveStatusOperation.subscribe(production, (message, params) -> {
				System.out.println(MessageFormat.format(
					"Message received from IoTBox ''{0}''!",
					params.getId()
				));
				System.out.println(MessageFormat.format(
					"Info about production line ''{0}'':", 
					message.getPayload().orElseThrow().getId()
				));
				message.getPayload().orElseThrow().getBeltInfos().stream().forEach(
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
			MonitorChannel.ReceiveStatusOperation.unsubscribe(production, consumer);
			production.disconnect();
		}
	}
}