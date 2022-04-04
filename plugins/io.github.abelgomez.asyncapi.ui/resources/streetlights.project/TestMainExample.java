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
