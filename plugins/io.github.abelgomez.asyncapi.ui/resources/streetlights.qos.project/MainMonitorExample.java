package main;

import streetlights.api.infra.IMonitoredServer;
import streetlights.api.infra.IServer;
import streetlights.api.infra.IServer.ServerException;
import streetlights.api.infra.monitoring.Monitor;
import streetlights.api.servers.MonitoringServer;
import streetlights.api.servers.ProductionServer;

public class MainMonitorExample {

	static {
		System.setProperty("java.util.logging.SimpleFormatter.format", "[%1$tF %1$tT] [%4$-7s] %5$s %n");
	}

	public static void main(String[] args) throws ServerException {

		IServer monitoringServer = MonitoringServer.create();
		IMonitoredServer server = ProductionServer.create(monitoringServer);

		Monitor monitor = new Monitor(server);
		monitor.start();
	}

}
