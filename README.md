[![DOI](https://zenodo.org/badge/DOI/10.5281/zenodo.6417533.svg)](https://doi.org/10.5281/zenodo.6417533)

# AsyncAPI Toolkit
Repository to host the grammar, metamodel, and code generation tools for [AsyncAPI](https://www.asyncapi.com). 

> _AsyncAPI provides a specification that allows you to define Message-Driven APIs in a machine-readable format. It's protocol-agnostic, so you can use it for APIs that work over Kafka, MQTT, AMQP, WebSockets, STOMP, etc. The spec is very similar to OpenAPI/Swagger so, if you're familiar with it, AsyncAPI should be easy for you._

The tools hosted in this repository aim to provide the toolset necessary to develop Message-Driven APIs following a Model-based approach starting from AsyncAPI specifications.

# Browse the AsyncAPI Toolkit documentation

* [Installation instructions](doc/Installation.md)
* [_Quick Start_ guide](doc/QuickStart.md)
* [Generating an AsyncAPI Specification from an Ecore model](doc/AsyncApiFromEcore.md)
* [Generating an AsyncAPI Specification from an annotated UML model](doc/AsyncApiFromUml.md)
* [AsyncAPI metamodel and grammar](doc/MetamodelAndGrammar.md)
* [Extended AsyncAPI metamodel with Service Level Agreement (SLA) primitives](doc/SlaMetamodelAndGrammar.md) :new:
* [Project contents](doc/Contents.md)
* [Building instructions](doc/Building.md)
* [Changelog](doc/Changelog.md)

# Want to learn more?

Check our publications and other resources about the AsyncAPI Toolkit!

* Abel Gómez, Markel Iglesias-Urkia, Lorea Belategi, Xabier Mendialdua, Jordi Cabot. _Model-driven development of asynchronous message-driven architectures with AsyncAPI_. Software and Systems Modeling (2021). https://doi.org/10.1007/s10270-021-00945-3. <br/>
[ [Open access publication](https://doi.org/10.1007/s10270-021-00945-3) ]

* Abel Gómez, Markel Iglesias-Urkia, Aitor Urbieta, Jordi Cabot. _A model-based approach for developing event-driven architectures with AsyncAPI_. Proceedings of the 23rd ACM/IEEE International Conference on Model Driven Engineering Languages and Systems, Association for Computing Machinery, Virtual Event, Canada, 2020, ISBN: 9781450370196. https://doi.org/10.1145/3365438.3410948. <br/>
[ [Archived preprint](https://abel.gomez.llana.me/wp-content/uploads/2020/10/gomez-models-2020.pdf) | [Archived HD presentation](https://www.youtube.com/watch?v=QA90H4uqfa8) ]

* Abel Gómez. _A model-based AsyncAPI code generator for IoT environments_. AsyncAPI Conference 2020. https://conference.2020.asyncapi.com/#abel-gomez. <br/>
[ [Conference video](https://youtu.be/oMSzGc5bDr4?t=3221) | [Archived HD presentation](https://www.youtube.com/watch?v=ModM3EPpFEs) ]

* Abel Gómez, Iker Fernandez de Larrea, Markel Iglesias-Urkia, Beatriz Lopez-Davalillo, Aitor Urbieta, Jordi Cabot. _Una Aproximación Basada en Modelos para la Definición de Arquitecturas Asíncronas_. Actas de las XXIV Jornadas de Ingeniería del Software y Bases de Datos (JISBD 2019), Sistedes, 2019. http://hdl.handle.net/11705/JISBD/2019/035 **(only in Spanish)**.<br/>
[ [Open access publication](http://hdl.handle.net/11705/JISBD/2019/035) ]

* Marc Oriol, Abel Gómez, and Jordi Cabot. AsyncSLA: Towards a Service Level Agreement for Asynchronous Services. In The 39th ACM/SIGAPP Symposium on Applied Computing (SAC ’24), April 8–12, 2024, Avila, Spain. ACM, New York, NY, USA, Article 4, 8 pages. https://doi.org/10.1145/3605098.3636074. <br/>
[ [Archived preprint](https://abel.gomez.llana.me/wp-content/uploads/2024/04/oriol-sac-2024.pdf) ]

# License

This project is licensed under the [EPL v2.0 license](LICENSE.txt).

The AsyncAPI logo and AsyncAPI specification are property of the AsyncAPI Initiative.
The AsyncAPI Specification is licensed under [The Apache License, Version 2.0](https://www.apache.org/licenses/LICENSE-2.0.html).