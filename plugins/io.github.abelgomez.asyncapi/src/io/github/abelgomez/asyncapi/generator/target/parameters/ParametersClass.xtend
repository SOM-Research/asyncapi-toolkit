package io.github.abelgomez.asyncapi.generator.target.parameters

import io.github.abelgomez.asyncapi.asyncApi.Channel
import io.github.abelgomez.asyncapi.generator.infra.IBuildableType
import io.github.abelgomez.asyncapi.generator.infra.IBuilder
import io.github.abelgomez.asyncapi.generator.target.AbstractType
import java.util.Collections
import java.util.TreeSet

import static extension io.github.abelgomez.asyncapi.generator.ModelExtensions.*
import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*
import static extension io.github.abelgomez.asyncapi.generator.utils.StringUtils.*
import static extension java.text.MessageFormat.*

class ParametersClass extends AbstractType implements IBuildableType {
	
		
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
				«channel.parameters.join(System.lineSeparator, System.lineSeparator, "", [ np | '''
				public «name» with«np.name.asJavaClassName»(«np.resolve.schema.resolve.transform.name» «np.name») {
					this.instance.parameters.put("«np.name»",  String.valueOf(«np.name»));
					return this;
				}
				'''])»
								
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
		
			public static enum LITERALS implements «parametersInterface.parameterLiteralInterface.name» {
				«channel.parameters.join("," + System.lineSeparator, [ np | "{0}(\"{1}\")".format(np.name.asJavaConstantName, np.name) ])»;
				private final String name;
				LITERALS(String name) {
					this.name = name;
				}
				public String getName() {
					return name;
				}
			}
			
			/**
			 * Map of parameters
			 */
			private Map<String, String> parameters = new HashMap<>();
			
			/**
			 * Private constructor. Client code must use {@link «asBuilder.name»} to
			 * instantiate {@link «name»}.
			 */ 
			private «name»() {
			}
			
						
			@Override
			public List<«parametersInterface.parameterLiteralInterface.name»> getParameterLiterals() {
				return Arrays.asList(LITERALS.values());
			}
			/**
			 * Returns the parameters as a {@link Map}
			 */
			protected Map<String, String> asMap() {
				return Collections.unmodifiableMap(parameters);
			}
			
			/**
			 * Private constructor that initializes the parameters.
			 * Client code must use {@link «asBuilder.name»} to
			 * instantiate {@link «name»}.
			 */
			protected «name»(Map<String, String> parameters) {
				for (IParameterLiteral l : getParameterLiterals()) {
					if (parameters.containsKey(l.getName())) {
						this.parameters.put(l.getName(), parameters.get(l.getName()));
					}
				}
			}
			
			/**
			 * Return a new {@link «asBuilder.name»}
			 *
			 * @return A new instance of {@link «asBuilder.name»}
			 */
			private static final «asBuilder.name» newBuilder() {
				return «asBuilder.name».newBuilder();
			}
			«channel.parameters.join(System.lineSeparator, System.lineSeparator, "", [ np | '''
			/**
			 * «np.resolve?.description ?: '''<no description provided for <code>«np.name»</code>>'''»
			 * 
			 * @return «np.name»
			 */ 
			public «np.parameter.resolve.schema.resolve.transform.name» get«np.name.asJavaClassName»() {
				return «np.parameter.resolve.schema.resolve.transform.name».valueOf(this.parameters.get("«np.name»"));
			}
			'''])»
			
			«asBuilder.serialize»
		}
	'''
}









