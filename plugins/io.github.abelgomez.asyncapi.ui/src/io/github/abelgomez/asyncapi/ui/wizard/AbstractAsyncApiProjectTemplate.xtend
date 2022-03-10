package io.github.abelgomez.asyncapi.ui.wizard

import org.eclipse.core.resources.IResourceDelta
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.resources.WorkspaceJob
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.SubMonitor
import org.eclipse.m2e.core.MavenPlugin
import org.eclipse.m2e.core.project.ResolverConfiguration
import org.eclipse.swt.widgets.Shell
import org.eclipse.xtext.ui.XtextProjectHelper
import org.eclipse.xtext.ui.util.PluginProjectFactory
import org.eclipse.xtext.ui.wizard.template.AbstractProjectTemplate
import org.eclipse.xtext.ui.wizard.template.IProjectGenerator

import static org.eclipse.core.runtime.IStatus.*

abstract class AbstractAsyncApiProjectTemplate extends AbstractProjectTemplate {
	protected val advanced = check("Advanced:", false)
	protected val advancedGroup = group("Properties")
	protected val path = text("Package:", "example", "The package path to place the files in", advancedGroup)

	override protected updateVariables() {
		path.enabled = advanced.value
		if (!advanced.value) {
			path.value = "example"
		}
	}

	override protected validate() {
		if (path.value.matches('[a-z][a-z0-9_]*(/[a-z][a-z0-9_]*)*'))
			null
		else
			new Status(ERROR, "Wizard", "'" + path + "' is not a valid package name")
	}

	override generateProjects(IProjectGenerator generator) {
		val factory = createProjectFactory()
		generator.generate(factory)
	}
	
	protected def PluginProjectFactory createProjectFactory() {
		new PluginProjectFactory() {
			override createProject(IProgressMonitor monitor, Shell shell) {
				val project = super.createProject(monitor, shell)
				ResourcesPlugin.workspace.addResourceChangeListener([ e | 
					/*
					 * The parent pom, which is generated from the AsyncAPI specification,
					 * is not available at this point yet. We listen for it to be created
					 * to force a an update of the project configuration that will set up
					 * the dependencies, the classpath, and the source directories, among
					 * other things
					 */
					val delta = e.delta.findMember(project.getFile("generated/root.pom.xml").fullPath)
					if (delta !== null && delta.kind == IResourceDelta.ADDED) {
						// Once the file is created for the first time, we unregister this listener 
						// to avoid loops when the code is recreated
						ResourcesPlugin.workspace.removeResourceChangeListener(self)
						WorkspaceJob.create("Setting up new project...", [ m |
							val subMonitor = SubMonitor.convert(m, 3);
							val configurationManager = MavenPlugin.getProjectConfigurationManager();
							configurationManager.enableMavenNature(project, new ResolverConfiguration(), subMonitor.split(1));
							configurationManager.updateProjectConfiguration(project, subMonitor.split(2));
							project.getFolder("bin")?.delete(false, true, subMonitor.split(3))
						]).schedule
					}]
				)
				return project
			}
		} => [
			projectName = projectInfo.projectName
			location = projectInfo.locationPath
			projectDefaultCharset = "UTF-8"
			projectNatures += XtextProjectHelper.NATURE_ID
			builderIds += XtextProjectHelper.BUILDER_ID
			// Manually create folders
			folders += "src/main/java"
			folders += "src/main/resources"
			folders += "src/test/java"
			folders += "src/test/resources"
			folders += "generated/src/main/java"
			folders += "generated/src/main/resources"
			addFile("pom.xml", pomXml)
		]
	}
	
	override getIcon() {
		return "asyncapi_project_template.png"
	}
	
	protected def pomXml() '''
		«pomHeader»
			«pomProperties»
			«pomParent»
			«IF pomDependencies !== ""»
			<dependencies>
				«pomDependencies»
			</dependencies>
			«ENDIF»
			<build>
				<plugins>
					«pomPlugins»
				</plugins>
				<resources>
					<resource>
						<directory>src/main/resources</directory>
					</resource>
					<resource>
						<directory>generated/src/main/resources</directory>
					</resource>
				</resources>
			</build>
		«pomFooter»
	'''
	
	protected def pomHeader() '''
		<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
			<modelVersion>4.0.0</modelVersion>
			<groupId>«projectInfo.projectName»</groupId>
			<artifactId>«projectInfo.projectName»</artifactId>
			<version>0.1.0-SNAPSHOT</version>
	'''

	protected def pomFooter() '''
		</project>
	'''
	
	protected def pomProperties() '''
		<properties>
			<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
			<maven.compiler.plugin.version>3.10.0</maven.compiler.plugin.version>
			<maven.surefire.plugin.version>2.22.1</maven.surefire.plugin.version>
			<build.helper.maven.plugin.version>3.3.0</build.helper.maven.plugin.version>
			<junit.jupiter.version>5.8.2</junit.jupiter.version>
			<junit.platform.version>1.8.2</junit.platform.version>
		</properties>
	'''

	protected def pomParent() '''
		<parent>
			<groupId>io.github.abelgomez.asyncapi.generated</groupId>
			<artifactId>root</artifactId>
			<version>0.0.0-SNAPSHOT</version>
			<relativePath>generated/root.pom.xml</relativePath>
		</parent>
	'''

	protected def pomDependencies() '''
		<dependency>
		      <groupId>org.junit.jupiter</groupId>
		      <artifactId>junit-jupiter-engine</artifactId>
		      <version>${junit.jupiter.version}</version>
		      <scope>test</scope>
		</dependency>
		<dependency>
		      <groupId>org.junit.jupiter</groupId>
		      <artifactId>junit-jupiter-api</artifactId>
		      <version>${junit.jupiter.version}</version>
		      <scope>test</scope>
		</dependency>
		<dependency>
		      <groupId>org.junit.jupiter</groupId>
		      <artifactId>junit-jupiter-params</artifactId>
		      <version>${junit.jupiter.version}</version>
		      <scope>test</scope>
		</dependency>
		<dependency>
		      <groupId>org.junit.platform</groupId>
		      <artifactId>junit-platform-suite</artifactId>
		      <version>${junit.platform.version}</version>
		      <scope>test</scope>
		</dependency>
	'''
	
	protected def pomPlugins() '''
		<plugin>
		    <groupId>org.apache.maven.plugins</groupId>
		    <artifactId>maven-surefire-plugin</artifactId>
		    <version>${maven.surefire.plugin.version}</version>
		</plugin>
		<plugin>
			<artifactId>maven-compiler-plugin</artifactId>
			<version>${maven.compiler.plugin.version}</version>
			<configuration>
				<release>11</release>
				<source>11</source>
				<target>11</target>
			</configuration>
		</plugin>
		<plugin>
			<groupId>org.codehaus.mojo</groupId>
			<artifactId>build-helper-maven-plugin</artifactId>
			<version>${build.helper.maven.plugin.version}</version>
			<executions>
				<execution>
					<phase>generate-sources</phase>
					<goals>
						<goal>add-source</goal>
					</goals>
					<configuration>
						<sources>
							<source>generated/src/main/java/</source>
						</sources>
					</configuration>
				</execution>
			</executions>
		</plugin>
		'''
}