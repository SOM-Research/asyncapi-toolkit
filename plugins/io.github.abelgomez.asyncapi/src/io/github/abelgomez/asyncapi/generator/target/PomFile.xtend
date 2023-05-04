package io.github.abelgomez.asyncapi.generator.target

import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI
import io.github.abelgomez.asyncapi.generator.infra.IGenerable
import io.github.abelgomez.asyncapi.generator.infra.ISerializable
import org.eclipse.xtext.generator.IFileSystemAccess2

import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*
import io.github.abelgomez.asyncapi.asyncApi.Protocol

class PomFile implements IGenerable, ISerializable {

	public static final String POM_FILE = "pom.xml"

	AsyncAPI api
	RootPomFile rootPomFile
	
	static def createFrom(AsyncAPI api) {
		return new PomFile(api)
	}
	
	private new(AsyncAPI api) {
		this.api = api
		this.rootPomFile = RootPomFile.create(api)
	}

	override filename() {
		POM_FILE
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
	
	public static final String ROOT_POM_FILE = "root.pom.xml"

	AsyncAPI api

	static def create(AsyncAPI api) {
		return new RootPomFile(api)
	}
	
	private new(AsyncAPI api) {
		this.api = api
	}
	
	override filename() {
		ROOT_POM_FILE
	}
		
	override generate(IFileSystemAccess2 fsa) {
		fsa.generateFile(filename, serialize)
	}
	
	override serialize() '''
		<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
			<modelVersion>4.0.0</modelVersion>
			<properties>
		        <com.google.code.gson.version>2.8.9</com.google.code.gson.version>
		        <com.google.guava.version>31.1-jre</com.google.guava.version>
		        <org.eclipse.paho.version>1.2.5</org.eclipse.paho.version>
		        <org.apache.kafka.version>3.2.0</org.apache.kafka.version>
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
				«IF api.servers.exists[s | s.protocol == Protocol.MQTT || s.protocol == Protocol.SECURE_MQTT]»
				<dependency>
					<groupId>org.eclipse.paho</groupId>
					<artifactId>org.eclipse.paho.client.mqttv3</artifactId>
					<version>${org.eclipse.paho.version}</version>
				</dependency>
				«ENDIF»
				«IF api.servers.exists[s | s.protocol == Protocol.KAFKA || s.protocol == Protocol.KAFKA_SECURE]»
				<dependency>
				    <groupId>org.apache.kafka</groupId>
				    <artifactId>kafka-clients</artifactId>
				    <version>${org.apache.kafka.version}</version>
				</dependency>
				«ENDIF»
			</dependencies>
			<build>
				<plugins>
					<plugin>
						<artifactId>maven-dependency-plugin</artifactId>
						<executions>
							<execution>
								<phase>prepare-package</phase>
								<goals>
									<goal>copy-dependencies</goal>
								</goals>
								<configuration>
									<outputDirectory>${project.build.directory}/lib</outputDirectory>
									<includeScope>runtime</includeScope>
								</configuration>
							</execution>
						</executions>
					</plugin>
				</plugins>
			</build>
		</project>
	'''
}
