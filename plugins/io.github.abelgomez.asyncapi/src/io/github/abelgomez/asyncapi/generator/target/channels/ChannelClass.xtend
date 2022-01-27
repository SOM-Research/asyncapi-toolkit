package io.github.abelgomez.asyncapi.generator.target.channels

import io.github.abelgomez.asyncapi.asyncApi.Channel
import io.github.abelgomez.asyncapi.generator.infra.IClass
import io.github.abelgomez.asyncapi.generator.infra.ISerializable
import io.github.abelgomez.asyncapi.generator.target.AbstractType
import io.github.abelgomez.asyncapi.generator.target.parameters.ParametersClass
import java.util.Collections
import java.util.TreeSet

import static extension io.github.abelgomez.asyncapi.generator.ModelExtensions.*
import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*
import static extension io.github.abelgomez.asyncapi.generator.utils.StringUtils.*
import static extension java.text.MessageFormat.*

class ChannelClass extends AbstractType implements IClass, ISerializable {
	

	Channel channel
	ParametersClass parametersClass
		
	static def createFrom(Channel channel) {
		return new ChannelClass(channel)
	}	
	
	private new(Channel channel) {
		this.channel = channel
		initialize()
	}
	
	def initialize() {
		if (!channel.parameters.isEmpty) {
			parametersClass = ParametersClass.createFrom(channel)
		}
	}
	
	override name() {
		return (channel?.title ?: channel.name.asPackageName.split("\\.").last ?: "").asJavaClassName + "Channel" 
	}
	
	override pkg() {
		channel.transform.fqn
	}
	
	override fqn() {
		pkg + "." + name
	}
	
	def parametersClass() {
		return parametersClass
	}
	
	override imports() {
		val result = new TreeSet
		result.add(channelInterface.fqn)
		result.add(parametersInterface.parameterLiteralInterface.fqn)
		if (parametersClass !== null) {
			result.add(parametersInterface.fqn)
			result.add(parametersClass.asBuilder.fqn)
			result.addAll(parametersClass.imports)
		}
		return Collections.unmodifiableNavigableSet(result)
	}
	
	private def parametersInterface() {
		return channel.api.transform.parametersInterface
	}
	
	private def channelInterface() {
		return channel.api.transform.channelInterface
	}
	
	private def channelPublishConfigurationInterface() {
		return channel.api.transform.channelInterface.channelPublishConfigurationInterface
	}
	
	private def channelSubscribeConfigurationInterface() {
		return channel.api.transform.channelInterface.channelSubscribeConfigurationInterface
	}
	
	override serialize() '''
		package «pkg»;

		«imports.join(System.lineSeparator, [i | "import {0};".format(i)])»
		
		/**
		 «IF channel.title !== null»
		 * «channel.title»
		 *
		 «ENDIF»
		 * «channel.description ?: "<No description provided>"»
		 */
		public final class «name» implements «channelInterface.name» {
		
			public static final String TOPIC_ID = "«channel.name»";
			
			public static final String TOPIC_PATTERN = "«channel.wildcardify»";
			
			/**
			 * Private constructor. This class only holds constants and static 
			 * methods and classes and should not be extended or instantiated
			 */
			private «name»() {
			}
			
			/**
			 * Creates a new {@link «channelSubscribeConfigurationInterface.name»} for this {@link IChannel} 
			 */
			static «channelSubscribeConfigurationInterface.name» newSubscribeConfiguration() {
				return new  «channelSubscribeConfigurationInterface.name»() {
					@Override
					public «parametersInterface.parameterLiteralInterface.name»[] getParameterLiterals() {
						«IF channel.parameters.isEmpty»
						return new «parametersInterface.parameterLiteralInterface.name»[] {};
						«ELSE»
						return «parametersClass.name».LITERALS.values();
						«ENDIF»
					}
					@Override
					public String getTopic() {
						return TOPIC_ID;
					}
					@Override
					public String getTopicPattern() {
						return TOPIC_PATTERN;
					}
				}; 
			}

			«IF channel.parameters.isEmpty»
			/**
			 * Creates a new {@link «channelPublishConfigurationInterface.name»} for this {@link IChannel} 
			 */
			static «channelPublishConfigurationInterface.name» newPublishConfiguration() {
				return new  «channelPublishConfigurationInterface.name»() {
					@Override
					public «parametersInterface.parameterLiteralInterface.name»[] getParameterLiterals() {
						return new «parametersInterface.parameterLiteralInterface.name»[] {};
					}
					@Override
					public String getTopic() {
						return TOPIC_ID;
					}
				}; 
			}
			«ELSE»
			/**
			 * Creates a new {@link «channelPublishConfigurationInterface.name»} for this {@link IChannel} for the 
			 * given {@link «parametersClass.name»} 
			 */
			static «channelPublishConfigurationInterface.name» newPublishConfiguration(«parametersClass.name» params) {
				return new  «channelPublishConfigurationInterface.name»() {
					public «parametersInterface.parameterLiteralInterface.name»[] getParameterLiterals() {
						return «parametersClass.name».LITERALS.values();
					}
					public String getTopic() {
						return params.apply(TOPIC_ID);
					}
				}; 
				
			}
			
			/**
			 * Creates a new {@link «parametersClass.asBuilder.name»} for this {@link IChannel} 
			 */
			static «parametersClass.asBuilder.name» newParametersBuilder() {
				return «parametersClass.name».newBuilder();
			}
			
			«parametersClass.serialize»
			«ENDIF»
		}
	'''
}
