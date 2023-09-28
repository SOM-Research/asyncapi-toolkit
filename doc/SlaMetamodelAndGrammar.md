## AsyncAPI Metamodel

Below you can find the extended [AsyncAPI v2.0.0](https://www.asyncapi.com/docs/specifications/2.0.0/) Metamodel Derived from the AsyncAPI Xtext Grammar with Service Level Agreement (SLA) primitives.

![AsyncAPI Metamodel](/plugins/io.github.abelgomez.asyncapi/model/AsyncApiSla.png)

## AsyncAPI Grammar

See the AsyncAPI/JSON Xtext Grammar (including the SLA extensions) in the file [`/plugins/io.github.abelgomez.asyncapi/src/io/github/abelgomez/asyncapi/AsyncApi.xtext`](/plugins/io.github.abelgomez.asyncapi/src/io/github/abelgomez/asyncapi/AsyncApi.xtext).

Rules starting with `x-` prefix are those representing the extensions to describe SLAs. Sections without the `x-`prefix represent a subset of the _AsyncAPI_ specification.
