package io.github.abelgomez.asyncapi.generator.target.parameters

import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI
import io.github.abelgomez.asyncapi.generator.infra.IType
import io.github.abelgomez.asyncapi.generator.target.AbstractType

import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*

class ParametersInterface extends AbstractType implements IType {

	static class ParameterLiteralInterface extends AbstractType implements IType {
		
		ParametersInterface parametersInterface	

		private new(ParametersInterface parametersInterface) {
			this.parametersInterface = parametersInterface
		}
	
		override name() {
			return "IParameterLiteral"
		}
		
		override pkg() {
			parametersInterface.pkg + "." + "infra"
		}
		
		override fqn() {
			parametersInterface.fqn + "." + name
		}
		
		override serialize() '''
			/**
			 * Base interface for parameter literals
			 */
			public interface «name» {
				String getName();
			}
		'''
	}


	AsyncAPI api
	ParameterLiteralInterface parameterLiteralInterface

	static def ParametersInterface createFrom(AsyncAPI api) {
		return new ParametersInterface(api)
	}

	private new(AsyncAPI api) {
		this.api = api
		parameterLiteralInterface = new ParameterLiteralInterface(this)
	}

	override name() {
		return "IParameters"
	}
	
	override pkg() {
		api.transform.pkg + "." + "infra"
	}
	
	override fqn() {
		pkg + "." + name
	}
	
	def parameterLiteralInterface() {
		return parameterLiteralInterface
	}
	
	override serialize() '''
		package «pkg»;
		
		/**
		 * Base interface for parameters
		 */
		public interface «name» {
			
			«parameterLiteralInterface.serialize»
			
			IParameterLiteral[] getParameterLiterals();
		}
	'''
}
