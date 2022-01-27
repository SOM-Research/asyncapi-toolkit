package io.github.abelgomez.asyncapi.generator.target

import io.github.abelgomez.asyncapi.asyncApi.Server
import io.github.abelgomez.asyncapi.generator.target.servers.ServerClass
import java.util.ArrayList
import java.util.Collection
import java.util.List
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

import static extension io.github.abelgomez.asyncapi.generator.ModelExtensions.*
import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*

class ServersPackage extends AbstractPackage {

	Collection<Server> servers
	List<ServerClass> serverClasses = new ArrayList

	static def createFrom(Collection<Server> servers) {
		return new ServersPackage(servers)
	}

	private new(Collection<Server> servers) {
		this.servers = servers
		initialize()
	}

	def initialize() {
		serverClasses.addAll(servers.map[s | s.transform])
	}
	
	override name() {
		return "servers"
	}
	
	override fqn() {
		return servers.get(0).api.transform.fqn + "." + name
	}
	
	override saveContents(IFileSystemAccess2 fsa, IGeneratorContext context) {
		serverClasses.forEach[c | c?.generate(fsa)]
	}
}
