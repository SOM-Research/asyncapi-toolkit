package io.github.abelgomez.asyncapi.ui.wizard

final class EmptyAsyncApiProject extends AbstractAsyncApiProjectTemplate {
	
	override getLabel() {
		"Empty AsyncAPI Project"
	}
	
	override getDescription() {
		"<p><b>Empty project</b></p><p>This an empty project to start designing with AsyncAPI v2.0.0. You can set the package the file is created in.</p>"
	}
	
	override createProjectFactory() {
		super.createProjectFactory => [
			addFile('''«SRC_JAVA»/«path»/example.asyncapi''', '''
				{
				  "asyncapi": "2.0.0",
				  "info": {
				    "title": "Example API",
				    "version": "1.0.0"
				  },
				  "servers": {
				    "production": {
				      "url": "localhost:1883",
				      "protocol": "mqtt"
				    }
				  }
				}
			''')
			addFile('''«SRC_JAVA»/main/Main.java''', '''
				package main;
				
				public class Main {
					public static void main(String[] args) throws Exception {
						// TODO: Put your code here
					}
				}
			''')

		]
	}
}
