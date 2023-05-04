package io.github.abelgomez.asyncapi.generator

import io.github.abelgomez.asyncapi.asyncApi.AbstractParameter
import io.github.abelgomez.asyncapi.asyncApi.AbstractSchema
import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI
import io.github.abelgomez.asyncapi.asyncApi.Channel
import io.github.abelgomez.asyncapi.asyncApi.Components
import io.github.abelgomez.asyncapi.asyncApi.Info
import io.github.abelgomez.asyncapi.asyncApi.JsonType
import io.github.abelgomez.asyncapi.asyncApi.NamedMessage
import io.github.abelgomez.asyncapi.asyncApi.NamedParameter
import io.github.abelgomez.asyncapi.asyncApi.NamedSchema
import io.github.abelgomez.asyncapi.asyncApi.Operation
import io.github.abelgomez.asyncapi.asyncApi.Parameter
import io.github.abelgomez.asyncapi.asyncApi.Reference
import io.github.abelgomez.asyncapi.asyncApi.Schema
import io.github.abelgomez.asyncapi.asyncApi.Server
import io.github.abelgomez.asyncapi.asyncApi.Message

class AsyncApi2Json {
	/**
	 * Generate the textual representation of an AsyncAPI instance. Although
	 * we can use an XtextResource for the serialization, until we have a
	 * proper formatter this is the most direct way to get a properly
	 * formatted specification
	 */
	static def CharSequence generate(AsyncAPI asyncAPI) '''
		{
			"asyncapi": «asyncAPI.version»,
			"info": «asyncAPI.info.generate»,
			«IF !asyncAPI.servers.empty»
			"servers": {
				«asyncAPI.servers.map[generate].join(",\n")»
			},
			«ENDIF»
			«IF !asyncAPI.channels.empty»
			"channels": {
				«asyncAPI.channels.map[generate].join(",\n")»
			},
			«ENDIF»
			«IF asyncAPI.components !== null»
			"components": «asyncAPI.components.generate»
			«ENDIF»
		}
	'''

	private static def CharSequence generate(Info i) '''
	{
		"title" : "«i.title»",
		"version" : "«i.version»"
	}'''

	private static def CharSequence generate(Server s) '''
	"«s.name»" : {
		"url" : "«s.url»",
		"protocol" : "«s.protocol.getName.replaceAll("_", "-")»"
	}'''

	private static def CharSequence generate(Channel c) '''
	"«c.name»" : {
		«IF c.description !== null»
		"description" : "«c.description»",«ENDIF»
		«IF !c.parameters.empty»
		"parameters" : {
			«c.parameters.map[generate].join(",\n")»
		},«ENDIF»«
		IF c.publish !== null»
		"publish" : «c.publish.generate»«
			IF c.subscribe !== null»,«ENDIF»«
		ENDIF»«
		IF c.subscribe !== null»
		"subscribe" : «c.subscribe.generate»«ENDIF»
	}'''

	private static def CharSequence generate(NamedParameter np) '''
	"«np.name»" : «np.parameter.generate»'''

	static def CharSequence generate(AbstractParameter abp) '''
		«if (abp instanceof Parameter)
			abp.generate
		else if (abp instanceof Reference)
			abp.generate
		»'''

	private static def CharSequence generate(Parameter p) '''
	{
		"schema" : «p.schema.generate»«
		IF p.description !== null»,
		"description" : "«p.description»"«ENDIF»«
		IF p.location !== null»,
		"location" : «p.location»«ENDIF»
	}'''

	private static def CharSequence generate(Operation o) '''
	{
		"operationId" : "«o.operationId»",
		«IF o.message instanceof Reference»
		"message": {
			"$ref" : "«(o.message as Reference).uri»"
		}
		«ENDIF»
	}'''

	private static def CharSequence generate(Components c) '''
	{
		«IF !c.messages.empty»
		"messages": {
			«c.messages.map[generate].join(",\n")»
		},
		«ENDIF»
		«IF !c.messages.empty»
		"schemas": {
			«c.schemas.map[generate].join(",\n")»
		}
		«ENDIF»
	}'''

	private static def CharSequence generate(NamedMessage nm) '''
	"«nm.name»" : {
		"name" : "«nm.name»",
		"payload" : {
			"$ref" : "«((nm.message as Message).payload as Reference).uri»"
		}
	}'''

	private static def CharSequence generate(NamedSchema ns) '''
	"«ns.name»" : «ns.schema.generate»'''
	
	private static def CharSequence generate(AbstractSchema abs) '''
		«if (abs instanceof Schema)
			abs.generate
		else if (abs instanceof Reference)
			abs.generate
		»'''
	
	private static def CharSequence generate(Schema s) '''
	{
		"type" : "«s.type.getName»"«
		IF s.title !== null»,
		"title" : "«s.title»"«ENDIF»«
		IF !s.properties.empty»,
		"properties" : {
			«s.properties.map[generate].join(",\n")»
		}«ENDIF»«
		IF !s.enum.empty»,
		"enum" : «s.enum.join("[\n\t", ",\n\t", "\n]", [quote])»«ENDIF»«
		IF s.items !== null»,
		"items" : «s.items.generate»«ENDIF»«
		IF s.type === JsonType.ARRAY && s.minItems > 0»,
		"minItems" : «s.minItems»«ENDIF»«
		IF s.type === JsonType.ARRAY && s.maxItems >= 0»,
		"maxItems" : «s.maxItems»«ENDIF»
	}'''
	
	private static def CharSequence quote(String s) '''
	"«s»"'''
	
	private static def CharSequence generate(Reference r) '''
	{
		"$ref" : "«r.uri»"
	}'''
}