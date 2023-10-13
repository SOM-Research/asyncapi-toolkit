package io.github.abelgomez.asyncapi.generator.target

import io.github.abelgomez.asyncapi.asyncApi.Sla
import io.github.abelgomez.asyncapi.generator.target.monitor.guaranteeterms.GuaranteeTermAbstractClass
import io.github.abelgomez.asyncapi.generator.target.monitor.guaranteeterms.GuaranteeTermClass
import io.github.abelgomez.asyncapi.generator.target.monitor.guaranteeterms.GuaranteeTermInterface
import java.util.ArrayList
import java.util.List
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

import static extension io.github.abelgomez.asyncapi.generator.ModelExtensions.*
import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*

class GuaranteeTermsPackage extends AbstractPackage {

	GuaranteeTermInterface guaranteeTermInterface
	GuaranteeTermAbstractClass guaranteeTermAbstractClass
	
	Sla sla
	List<GuaranteeTermClass> guaranteeTermsClasses = new ArrayList

	static def createFrom(Sla sla) {
		return new GuaranteeTermsPackage(sla)
	}

	private new(Sla sla) {
		this.sla = sla
		initialize()
	}

	def initialize() {
		guaranteeTermInterface = GuaranteeTermInterface.createFrom(sla.api)
		guaranteeTermAbstractClass = GuaranteeTermAbstractClass.createFrom(sla.api)
		guaranteeTermsClasses.addAll(sla.guaranteeTerms.map[transform])
	}
	
	override name() {
		return "guaranteeterms"
	}
	
	override fqn() {
		return sla.api.transform.monitoringPackage.fqn + "." + name
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
