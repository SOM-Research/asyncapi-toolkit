# AsyncAPI Toolkit
Repository to host the grammar, metamodel, and code generation tools for [AsyncAPI](https://www.asyncapi.com). 

> _AsyncAPI provides a specification that allows you to define Message-Driven APIs in a machine-readable format. It's protocol-agnostic, so you can use it for APIs that work over Kafka, MQTT, AMQP, WebSockets, STOMP, etc. The spec is very similar to OpenAPI/Swagger so, if you're familiar with it, AsyncAPI should be easy for you._

The tools hosted in this repository aim to provide the toolset necessary to develop Message-Driven APIs following a Model-based approach starting from AsyncAPI specifications.

## AsyncAPI Metamodel

Below you can find the simplified AsyncAPI Metamodel Derived from the AsyncAPI Xtext Grammar.

![AsyncAPI Metamodel](io.github.abelgomez.asyncapi/model/AsyncApi.png)

## AsyncAPI Grammar

See the simplified AsyncAPI/JSON Xtext Grammar in the file [`io.github.abelgomez.asyncapi/src/io/github/abelgomez/asyncapi/AsyncApi.xtext`](io.github.abelgomez.asyncapi/src/io/github/abelgomez/asyncapi/AsyncApi.xtext).

## Project Contents

This project contains the following plug-ins:

* `io.github.abelgomez.asyncapi`: Base plug-in with the [Xtext Grammar](io.github.abelgomez.asyncapi/src/io/github/abelgomez/asyncapi/AsyncApi.xtext), generator scripts, and AsyncAPI parser.

* `io.github.abelgomez.asyncapi.ide`: Automatically generated plug-in providing the platform-independent IDE integration (e.g., services for content assist).

* `io.github.abelgomez.asyncapi.tests`: Automatically generated tests plug-in for basic language features.

*  `io.github.abelgomez.asyncapi.ui`: Automatically generated plug-in providing the Eclipse UI integration (editor, wizards, etc.).

* `io.github.abelgomez.asyncapi.ui.tests`: Automatically generated tests plug-in for the Eclipse UI integration.