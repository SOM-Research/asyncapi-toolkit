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
		result += "java.util.Arrays"
		result += "java.util.List"
		result += channelInterface.fqn
		result += parametersInterface.parameterLiteralInterface.fqn
		if (channel.publish !== null || channel.subscribe !== null) {
			result += operationInterface.fqn
		}
		if (channel.publish !== null) {
			result += "java.util.Collections"
			result += "java.util.Map"
		}
		if (!channel.parameters.isEmpty) {
			result += "java.util.Map.Entry"
		}
		if (parametersClass !== null) {
			result += parametersInterface.fqn
			result += parametersClass.asBuilder.fqn
			result += parametersClass.imports
		}
		return Collections.unmodifiableNavigableSet(result)
	}
	
	private def parametersInterface() {
		return channel.api.transform.parametersInterface
	}
	
	private def channelInterface() {
		return channel.api.transform.channelInterface
	}
	
	private def operationInterface() {
		return channel.api.transform.operationInterface
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
		
			static final «name» INSTANCE = new «name»();

			public static final String TOPIC_ID = "«channel.name»";
			
			static final String TOPIC_PATTERN = "«channel.wildcardify»";
			
			/**
			 * Private constructor. This class is a singleton and should not be extended or instantiated
			 */
			private «name»() {
			}
			
			@Override
			public String getName() {
				return TOPIC_ID;
			}
			
			«IF channel.subscribe !== null»
			/**
			 * Creates a new {@link «channelSubscribeConfigurationInterface.name»} for this {@link IChannel} 
			 */
			«channelSubscribeConfigurationInterface.name» newSubscribeConfiguration() {
				return new  «channelSubscribeConfigurationInterface.name»() {
					@Override
					public String getSubscriptionPattern() {
						return TOPIC_PATTERN;
					}
					@Override
					public «name» getChannel() {
						return «name».this;
					}
					@Override
					public Class<? extends «channelInterface.operationInterface.name»> getOperation() {
						return «channel.subscribe.transform.name».class;
					}
				}; 
			}
			«ENDIF»
			
			«IF channel.publish !== null»
			«IF channel.parameters.isEmpty»
			/**
			 * Creates a new {@link «channelPublishConfigurationInterface.name»} for this {@link IChannel} 
			 */
			«channelPublishConfigurationInterface.name» newPublishConfiguration() {
				return new  «channelPublishConfigurationInterface.name»() {
					@Override
					public Map<String, String> getParameters() {
						return Collections.emptyMap();
					}
					@Override
					public «name» getChannel() {
						return «name».this;
					}
					@Override
					public String getActualChannelName() {
						return getChannel().getName();
					}
					@Override
					public Class<? extends «channelInterface.operationInterface.name»> getOperation() {
						return «channel.publish.transform.name».class;
					}
				}; 
			}
			«ELSE»
			/**
			 * Creates a new {@link «channelPublishConfigurationInterface.name»} for this {@link IChannel} for the 
			 * given {@link «parametersClass.name»} 
			 */
			«channelPublishConfigurationInterface.name» newPublishConfiguration(«parametersClass.name» params) {
				return new  «channelPublishConfigurationInterface.name»() {
					@Override
					public Map<String, String> getParameters() {
						return Collections.unmodifiableMap(params.asMap());
					}
					@Override
					public «name» getChannel() {
						return «name».this;
					}
					@Override
					public String getActualChannelName() {
						String topic = getChannel().getName();
						Map<String, String> parameters = this.getParameters();
						for (Entry<String, String> entry : parameters.entrySet()) {
							topic = topic.replaceAll("\\{" + entry.getKey() + "\\}", entry.getValue());
						}
						return topic;
					}
					@Override
					public Class<? extends «channelInterface.operationInterface.name»> getOperation() {
						return «channel.publish.transform.name».class;
					}
				}; 
				
			}
			
			/**
			 * Creates a new {@link «parametersClass.asBuilder.name»} for this {@link IChannel} 
			 */
			«parametersClass.asBuilder.name» newParametersBuilder() {
				return «parametersClass.name».newBuilder();
			}
			
			«parametersClass.serialize»
			«ENDIF»
			«ENDIF»
			
			@Override
			public List<«parametersInterface.parameterLiteralInterface.name»> getParameterLiterals() {
				«IF channel.parameters.isEmpty»
				return Arrays.asList(new «parametersInterface.parameterLiteralInterface.name»[] {});
				«ELSE»
				return Arrays.asList(«parametersClass.name».LITERALS.values());
				«ENDIF»
			}
		}
	'''
}
