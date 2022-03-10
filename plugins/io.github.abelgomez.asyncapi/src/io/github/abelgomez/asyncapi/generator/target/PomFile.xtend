package io.github.abelgomez.asyncapi.generator.target

import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI
import io.github.abelgomez.asyncapi.generator.infra.IGenerable
import io.github.abelgomez.asyncapi.generator.infra.ISerializable
import org.eclipse.xtext.generator.IFileSystemAccess2

import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*

class PomFile implements IGenerable, ISerializable {

	AsyncAPI api;
	RootPomFile rootPomFile;
	
	static def createFrom(AsyncAPI api) {
		return new PomFile(api)
	}
	
	private new(AsyncAPI api) {
		this.api = api
		this.rootPomFile = RootPomFile.create()
	}

	override filename() {
		"pom.xml"
	}
		
	override generate(IFileSystemAccess2 fsa) {
		fsa.generateFile(filename, serialize)
		rootPomFile.generate(fsa)
	}
	
	override serialize() '''
		<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
			<modelVersion>4.0.0</modelVersion>
			<parent>
				<groupId>io.github.abelgomez.asyncapi.generated</groupId>
				<artifactId>root</artifactId>
				<version>0.0.0-SNAPSHOT</version>
				<relativePath>root.pom.xml</relativePath>
			</parent>
			<groupId>«api?.transform.fqn»</groupId>
			<artifactId>generated</artifactId>
			<version>«api?.info?.version ?: "0.1.0"»-SNAPSHOT</version>
			<packaging>pom</packaging>
		</project>
	'''
}

class RootPomFile implements IGenerable, ISerializable {

	static def create() {
		return new RootPomFile()
	}
	
	override filename() {
		"root.pom.xml"
	}
		
	override generate(IFileSystemAccess2 fsa) {
		fsa.generateFile(filename, serialize)
	}
	
	override serialize() '''
		<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
			<modelVersion>4.0.0</modelVersion>
			<properties>
		        <com.google.code.gson.version>2.8.9</com.google.code.gson.version>
		        <org.eclipse.paho.version>1.2.5</org.eclipse.paho.version>
			</properties>
			<groupId>io.github.abelgomez.asyncapi.generated</groupId>
			<artifactId>root</artifactId>
			<version>0.0.0-SNAPSHOT</version>
			<packaging>pom</packaging>
			<dependencies>
				<dependency>
					<groupId>com.google.code.gson</groupId>
					<artifactId>gson</artifactId>
					<version>${com.google.code.gson.version}</version>
				</dependency>
				<dependency>
					<groupId>org.eclipse.paho</groupId>
					<artifactId>org.eclipse.paho.client.mqttv3</artifactId>
					<version>${org.eclipse.paho.version}</version>
				</dependency>
			</dependencies>
		</project>
	'''
}
