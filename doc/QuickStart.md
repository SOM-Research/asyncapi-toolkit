## Quick Start Guide

To get started with the _AsyncAPI Toolkit_, simply use the dedicated wizard in the `New Project` dialog:

![New Project Wizard - Step 1](img/wizard1.png)

Select _AsyncAPI Project_, set a project name, and continue.

![New Project Wizard - Step 2](img/wizard2.png)

After that, select a project template. We recommend you to start with the  _Streetlights API Example Project_. The _Streetlights API Example Project_ template contains a fully working example demonstrating the capabilities of the framework.

![New Project Wizard - Step 3](img/wizard3.png)

Finally, the wizard can be completed.

![New Project Wizard - Step 4](img/wizard4.png)

After that, a new Maven project with the following contents will appear in the workspace.

![Streetlights API Project Contents](img/project_contents.png)

Pay special attention to the following files:

* [`src/main/java/streetlights/StreetlightsAPI.asyncapi`](/plugins/io.github.abelgomez.asyncapi.ui/resources/streetlights.project/StreetlightsAPI.asyncapi) is an example specification (see below) of an API using the JSON format of the AsyncAPI specification. Code and other resourcs in the `gen` directory will be generated from the specification contained in this file.

* [`src/main/java/main/MainExample.java`](/plugins/io.github.abelgomez.asyncapi.ui/resources/streetlights.project/MainExample.java) is an example program demonstrating how to use the generated code, which provides an internal DSL based on fluent APIs to generate messages, and to publish and subscribe them.

* [`src/test/java/main/TestMainExample.java`](/plugins/io.github.abelgomez.asyncapi.ui/resources/streetlights.project/TestMainExample.java) is an example test suite that uses an embedded MQTT server to show how the `MainExample.java` class can be executed.
