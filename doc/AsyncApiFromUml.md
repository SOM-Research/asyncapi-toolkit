## Generating an AsyncAPI Specification from an annotated UML model

It is possible to generate an skeleton _AsyncAPI Specification_ from an annotated UML model.
We provide an _Industry 4.0_ (I4.0) UML profile as shown below:

[![I4.0 UML Profile](/plugins/io.github.abelgomez.asyncapi.i40.profile/model/i40.profile.png)](/plugins/io.github.abelgomez.asyncapi.i40.profile/model/i40.profile.png)

For example, starting from the following I4.0 UML model:

[![I4.0 UML model](/plugins/io.github.abelgomez.asyncapi.i40.ui/resources/example.i40.project/I40.png)](/plugins/io.github.abelgomez.asyncapi.i40.ui/resources/example.i40.project/I40.png)

It is possible to obtain the following AsyncAPI specification:

```js
{
	"asyncapi": "2.0.0",
	"info": {
		"title" : "Example Architecture",
		"version" : "0.1.0"
	},
	"servers": {
		"production" : {
			"url" : "example.com:1883",
			"protocol" : "mqtt"
		}
	},
	"channels": {
		"iotbox/{id}/monitor" : {
			"parameters" : {
				"id" : {
					"schema" : {
						"type" : "string"
					}
				}
			},
			"publish" : {
				"operationId" : "sendStatus",
				"message": {
					"$ref" : "#/components/messages/MonitorMessage"
				}
			},
			"subscribe" : {
				"operationId" : "receiveStatus",
				"message": {
					"$ref" : "#/components/messages/MonitorMessage"
				}
			}
		},
		"iotbox/{id}/configure" : {
			"parameters" : {
				"id" : {
					"schema" : {
						"type" : "string"
					}
				}
			},
			"publish" : {
				"operationId" : "sendServiceConfiguration",
				"message": {
					"$ref" : "#/components/messages/ConfigurationMessage"
				}
			},
			"subscribe" : {
				"operationId" : "receiveServiceConfiguration",
				"message": {
					"$ref" : "#/components/messages/ConfigurationMessage"
				}
			}
		}
	},
	"components": {
		"messages": {
			"MonitorMessage" : {
				"name" : "MonitorMessage",
				"payload" : {
					"$ref" : "#/components/schemas/PathInfo"
				}
			},
			"ConfigurationMessage" : {
				"name" : "ConfigurationMessage",
				"payload" : {
					"$ref" : "#/components/schemas/Configuration"
				}
			}
		},
		"schemas": {
			"Configuration" : {
				"type" : "object",
				"properties" : {
					"monitoringfrequency" : {
						"$ref" : "#/components/schemas/MonitoringFrequency"
					}
				}
			},
			"MonitoringFrequency" : {
				"type" : "object",
				"properties" : {
					"value" : {
						"type" : "integer"
					},
					"unit" : {
						"type" : "string",
						"enum" : [
							"seconds",
							"minutes"
						]
					}
				}
			},
			"PathInfo" : {
				"type" : "object",
				"properties" : {
					"id" : {
						"type" : "string"
					},
					"beltInfos" : {
						"type" : "array",
						"items" : {
							"$ref" : "#/components/schemas/BeltInfo"
						}
					}
				}
			},
			"BeltInfo" : {
				"type" : "object",
				"properties" : {
					"id" : {
						"type" : "string"
					},
					"ts" : {
						"type" : "string",
						"title" : "timestamp"
					},
					"speed" : {
						"type" : "integer"
					}
				}
			}
		}
	}
}
```

Run the _Example AsyncAPI Project from I4.0 UML model_ wizard to see how it works!
