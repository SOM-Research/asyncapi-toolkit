package io.github.abelgomez.asyncapi.generator.target

import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI
import io.github.abelgomez.asyncapi.generator.target.monitor.guaranteeterms.GuaranteeTermAbstractClass
import io.github.abelgomez.asyncapi.generator.target.monitor.guaranteeterms.GuaranteeTermClass
import io.github.abelgomez.asyncapi.generator.target.monitor.guaranteeterms.GuaranteeTermInterface
import java.util.ArrayList
import java.util.List
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*

class GuaranteeTermsPackage extends AbstractPackage {

	GuaranteeTermInterface guaranteeTermInterface
	GuaranteeTermAbstractClass guaranteeTermAbstractClass
	
	AsyncAPI api
	List<GuaranteeTermClass> guaranteeTermsClasses = new ArrayList

	static def createFrom(AsyncAPI api) {
		return new GuaranteeTermsPackage(api)
	}

	private new(AsyncAPI api) {
		this.api = api
		initialize()
	}

	def initialize() {
		guaranteeTermInterface = GuaranteeTermInterface.createFrom(api)
		guaranteeTermAbstractClass = GuaranteeTermAbstractClass.createFrom(api)
		if (api.sla !== null) {
			guaranteeTermsClasses += api.sla.guaranteeTerms.map[transform]
		}
	}
	
	override name() {
		return "guaranteeterms"
	}
	
	override fqn() {
		return api.transform.monitoringPackage.fqn + "." + name
	}
	
	def guaranteeTermInterface() {
		return guaranteeTermInterface
	}
	
	def guaranteeTermAbstractClass() {
		return guaranteeTermAbstractClass
	}
	
	override saveContents(IFileSystemAccess2 fsa, IGeneratorContext context) {
		guaranteeTermInterface?.generate(fsa)
		guaranteeTermAbstractClass?.generate(fsa)
		guaranteeTermsClasses.forEach[c | c?.generate(fsa)]
	}
}
