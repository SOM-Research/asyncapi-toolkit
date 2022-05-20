## AsyncAPI Toolkit v0.6.0

Major release, with few but breaking changes:

* Change the metaclass the Broker stereotype extends (Class vs Component) (breaking change!)
* Minor fixes in the New Project wizard window.
* Improve documentation for the UML to AsyncAPI feature (i.e., _Industry 4.0_ support).

## AsyncAPI Toolkit v0.5.0

Major release with important changes:

* Include support for QoS and SLA (as `x-...` extensions) in the Grammar.
* Refactor the old single-file template, by multiple modular files.
* Rework the old templates, to allow the generation of Servers, Channels, Operation, Messages, and Payloads (among other things).
* Add support for multiple AsyncAPI Servers, with multiple subscriptions to different topics.
* Update Target platform to latest Eclipse release (2022-03), and update related dependencies (Xtext, EMF, etc.).
* Ensure that all plug-ins are consistent and require Java-11 as the Execution Environment.
* Migrate the build system from Eclipse legacy to maven/Tycho.
* Add setup files for Oomph installations.
* Add setup files to prepare a development environment.
* Refactor the Ecore to AsyncAPI transformation to a dedicated class.
* Rework and reorganize code generators and creation wizards to generate maven-based projects, rather than Eclipse Java projects.
* Get rid of Ivy-related stuff, since it is no longer needed (rely en maven and m2e projects).
* Migrate from old-style Eclipse Update Site to Tycho `category.xml`.
* Improve Javadoc of generated source code.
* Add UML profile for Industry 4.0 modeling.
* Create extension point to allow contributing 3rd-party/external project templates.
* Ask for the activation of the Java perspective when creating new projects.
* Implement I4.0 UML model to AsyncAPI M2M transformation.
* Add wizard for _Example AsyncAPI Project from I4.0 UML model_ and _AsyncAPI Project from I4.0 UML model_.
* Add Papyrus as a dependency if the I4.0 plug-ins are installed.
* Implement automatic deployment of generated Update Sites.
* Add product definitions for pre-built AsyncAPI Toolkit distributions.
* Improve and refactor project documentation.
* Many other code clean-ups and fixes.


## AsyncAPI Toolkit v0.4.6

Minor bugfixes:

* Update code in main method for the streetlights example to comply with the latest generation templates.
* Minor changes in some Eclipse labels (AsyncApi -> AsyncAPI).

## AsyncAPI Toolkit v0.4.5

Multiple minor changes:

* Fix bug in Example Ecore-based proyect due to NPE.
* Force the Payload builder to be called from the publish class.
* Use operationId in the publish/subscribe classes when available.
* Update Example Ecore-based proyect to support parameters and operation IDs.
* Reorder arguments when receiving a message with parameters.
* Update README to reflect latest changes in the Ecore-based example project.

## AsyncAPI Toolkit v0.4.4

Bugfixes and improvements:

* Fix Java code generation when title is used to generate a friendly name

* Multiple changes in the Ecore2AsyncApi transformation:
  * Add annotation and support custom names for Messages and Schemas.
  * Add annotation and support for titles in Schemas and properties.
  * Add annotation and support for parameters in Channel names.
  * Update README.md file to keep it consistent with new annotations.

## AsyncAPI Toolkit v0.4.3

Minor fixes:

* Fix regex for calculating wildcards for subscribing to topics (incorrect replacement when the parameter was at the end of the topic name without a trailing slash)

## AsyncAPI Toolkit v0.4.2

Minor modifications:

* Modify the naming conventions: do not append an extra underscore when a Java identifier already starts with _.

## AsyncAPI Toolkit v0.4.1

Changes:

* Fix bug where enums in the "components" section were not generated. This bug was evident after fixing the duplicate generation of classes fixed in v0.4.0.

## AsyncAPI Toolkit v0.4.0

Changes:

* Fix bug where classes in the "components" section were generate twice (both in the components package and within the classes using them).
* Add support for enumerations for APIs imported from Ecore models.
* Add a new project type to the AsyncAPI wizard with an example of project imported from an Ecore file.

## AsyncAPI Toolkit v0.3.0

Changes:

* Add partial support for typed collections (i.e., obey the schema specified in "items" for "arrays"). Only primitive types or schemas defined as "components" are supported.
* Code generation now generates a addTo<array>(...) method for these many-valued properties.

## AsyncAPI Toolkit v0.2.5

Minor changes:

* Generate servers, channels, and messages sections only if defined


## AsyncAPI Toolkit v0.2.4

Add support for the generation of AsyncAPI specifications out of Ecore metamodels.

Minor changes:

* Add support in the AsynAPI grammar for minItemsand maxItems in JSON Schema arrays.


## AsyncAPI Toolkit v0.2.3

Minor fixes:

* Fix to allow parameters to not span over a complete level name.
* Remove ivy generation from template.
* Make some fields optional to limit the number of errors reported.
* Add template for empty projects.
* Add support for the embedded Moquette server.
* Add autocompletion for JSON types.
* Remove support for generic JSON expressions.

## AsyncAPI Toolkit v0.2.2

Minor fixes:

* Generate separate methods for publishing and subscribing when channels
* have/don't have parameters.
* Fix naming issue in parameters.
* Cleanup unused methods.
* Fix uncatched CloneNotSupportedException in generated code.
* Add custom icons using the AsyncAPI logo.
* Fix typos in README.

## AsyncAPI Toolkit v0.2.1

Minor fixes:

* Fix spacing issues in generated code.
* Improve generated Javadoc.



## AsyncAPI Toolkit v0.2.0

First release supporting publishing messages and subscribing to topics.

* Support for AsyncAPI 2.0.0
* Allow publication and subscription.
* Update wizard with a fully working sample code.

## AsyncAPI Toolkit v0.1.0

Initial release, first minimally functional product:

* Support AsyncAPI 1.2.0
* Generate internal DSL to build payload messages.
