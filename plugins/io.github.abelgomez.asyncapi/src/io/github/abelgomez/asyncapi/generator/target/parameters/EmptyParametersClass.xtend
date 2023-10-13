package io.github.abelgomez.asyncapi.generator.target.parameters

import io.github.abelgomez.asyncapi.asyncApi.Channel
import io.github.abelgomez.asyncapi.generator.infra.IBuildableType
import io.github.abelgomez.asyncapi.generator.infra.IBuilder
import io.github.abelgomez.asyncapi.generator.target.AbstractType
import java.util.Collections
import java.util.TreeSet

import static extension io.github.abelgomez.asyncapi.generator.ModelExtensions.*
import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*

class EmptyParametersClass extends AbstractType implements IBuildableType {
	
		
	static class ParametersBuilder implements IBuilder {
		protected Channel channel

		new(Channel channel) {
			this.channel = channel
		}

		def parametersClass() {
			return channel.transform.channelClass.parametersClass
		}

		override pkg() {
			return parametersClass.pkg
		}

		override name() { 
			return parametersClass.name + "Builder"
		}
		
		override fqn() {
			return parametersClass.fqn + "." + name
		}

		override type() { 
			return parametersClass.name
		}

		override serialize() '''
			/**
			 * Builder class for «parametersClass.name»
			 */
			public static class «name» {
			
				/**
				 * A {@link «type»} to hold temporal data
				 */
				private «type» instance = new «type»();
			
				/**
				 * Create a new {@link «name»} to build new {@link «type»}
				 *
				 * @return A {@link «name»}
				 */
				private static «name» newBuilder() {
					return new «name»();
				}
			
				/**
				 * Builds a new instance of {@link «type»}
				 * 
				 * @return A {@link «type»}
				 */ 
				public «type» build() {
					return instance;
				}
			}
		'''
	}
	
	protected Channel channel
	
	static def ParametersClass createFrom(Channel channel) {
		return new ParametersClass(channel)
	}
	
	protected new(Channel channel) {
		this.channel = channel
	}
	
	override name() {
		return channel.transform.channelClass.name + "Parameters"
	}
	
	override pkg() {
		return channel.transform.channelClass.pkg
	}
	
	override fqn() {
		return channel.transform.channelClass.fqn + "." + name
	}
	
	private def parametersInterface() {
		return channel.api.transform.parametersInterface
	}
	
	override imports() {
		val result = new TreeSet
		result += "java.util.Map"
		result += "java.util.HashMap"
		result += "java.util.Collections"
		result += "java.util.List"
		result += "java.util.Arrays"
		result += channel.api.transform.parametersInterface.fqn
		return Collections.unmodifiableNavigableSet(result)
	}

	override asBuilder() {
		return new ParametersBuilder(channel);
	}

	override serialize()  '''
		/**
		 *
		 * «name», parameters of the <code>«channel.name»</code> 
		 * {@link IChannel}
		 *
		 * Please note that <b>only parameters of primitive types are supported</p>
		 *
		 */
		public static class «name» implements «parametersInterface.name» {

			/**
			 * Private constructor.
			 */ 
			private «name»() {
			}
			
						
			@Override
			public List<«parametersInterface.parameterLiteralInterface.name»> getParameterLiterals() {
				return Collections.emptyList();
			}
			
			@Override
			public Map<String, String> asMap() {
				return Collections.emptyMap();
			}
			
			/**
			 * Return a new {@link «asBuilder.name»}
			 *
			 * @return A new instance of {@link «asBuilder.name»}
			 */
			private static final «asBuilder.name» newBuilder() {
				return «asBuilder.name».newBuilder();
			}
			
			«asBuilder.serialize»
		}
	'''
}









