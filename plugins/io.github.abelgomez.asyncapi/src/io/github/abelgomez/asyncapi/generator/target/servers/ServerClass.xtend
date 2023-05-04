package io.github.abelgomez.asyncapi.generator.target.servers

import io.github.abelgomez.asyncapi.asyncApi.Protocol
import io.github.abelgomez.asyncapi.asyncApi.Server
import io.github.abelgomez.asyncapi.generator.infra.IClass
import io.github.abelgomez.asyncapi.generator.target.AbstractType
import io.github.abelgomez.asyncapi.generator.utils.Assertions

import static extension java.text.MessageFormat.*

abstract class ServerClass extends AbstractType implements IClass {

	protected Server server

	static def ServerClass createFrom(Server server) {
		switch (server.protocol) {
			case Protocol.MQTT,
			case Protocol.SECURE_MQTT:
				return new MqttServerClass(server)
			case Protocol.KAFKA,
			case Protocol.KAFKA_SECURE:
				return new KafkaServerClass(server)
			default:
				Assertions.fail("Unsupported protocol ''{0}'' for server ''{1}''".format(server.protocol, server))		
		}
	}

	protected new(Server server) {
		this.server = server
	}
}
