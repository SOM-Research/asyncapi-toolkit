package io.github.abelgomez.asyncapi.generator.target.channels

import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI
import io.github.abelgomez.asyncapi.generator.infra.IType
import io.github.abelgomez.asyncapi.generator.target.AbstractType
import java.util.Collections
import java.util.TreeSet

import static extension io.github.abelgomez.asyncapi.generator.TransformationContext.*
import static extension java.text.MessageFormat.*

class ChannelInterface extends AbstractType implements IType {

	static class ChannelConfigurationInterface extends AbstractType implements IType {
	
		ChannelInterface channelInterface
	
		private new(ChannelInterface channelInterface) {
			this.channelInterface = channelInterface
		}
	
		override name() {
			return "IChannelConfiguration"
		}
		
		override pkg() {
			return channelInterface.api.transform.pkg + "." + "infra"
		}
		
		override fqn() {
			return channelInterface.fqn + "." + name
		}
		
		override imports() {
			val result = new TreeSet		
			result.add(channelInterface.api.transform.parametersInterface.parameterLiteralInterface.fqn)
			return Collections.unmodifiableNavigableSet(result)
		}
		
		override serialize() '''
			/**
			 * Base interface for channel configurations
			 */
			public interface «name» {
				String getChannelName();
				«channelInterface.api.transform.parametersInterface.parameterLiteralInterface.name»[] getParameterLiterals();
			}
		'''
	}
	
	static class ChannelPublishConfigurationInterface extends AbstractType implements IType {
	
		ChannelInterface channelInterface
	
		private new(ChannelInterface channelInterface) {
			this.channelInterface = channelInterface
		}
	
		override name() {
			return "IChannelPublishConfiguration"
		}
		
		override pkg() {
			return channelInterface.api.transform.pkg + "." + "infra"
		}
		
		override fqn() {
			return channelInterface.fqn + "." + name
		}
		
		override imports() {
			val result = new TreeSet		
			result.add("java.util.Map")
			return Collections.unmodifiableNavigableSet(result)
		}
		
		override serialize() '''
			/**
			 * Base interface for publishing channel configurations
			 */
			public interface «name» extends «channelInterface.channelConfigurationInterface.name» {
				Map<String, String> getParameters();
			}
		'''
	}

	static class ChannelSubscribeConfigurationInterface extends AbstractType implements IType {
	
		ChannelInterface channelInterface
	
		private new(ChannelInterface channelInterface) {
			this.channelInterface = channelInterface
		}
	
		override name() {
			return "IChannelSubscribeConfiguration"
		}
		
		override pkg() {
			return channelInterface.api.transform.pkg + "." + "infra"
		}
		
		override fqn() {
			return channelInterface.fqn + "." + name
		}
		
		override serialize() '''
			/**
			 * Base interface for subscribing channel configurations
			 */
			public interface «name» extends «channelInterface.channelConfigurationInterface.name» {
				String getSubscriptionPattern();
			}
		'''
	}

	AsyncAPI api
	ChannelConfigurationInterface channelConfigurationInterface
	ChannelPublishConfigurationInterface channelPublishConfigurationInterface
	ChannelSubscribeConfigurationInterface channelSubscribeConfigurationInterface

	static def ChannelInterface createFrom(AsyncAPI api) {
		return new ChannelInterface(api)
	}

	private new(AsyncAPI api) {
		this.api = api
		channelConfigurationInterface = new ChannelConfigurationInterface(this);
		channelPublishConfigurationInterface = new ChannelPublishConfigurationInterface(this);
		channelSubscribeConfigurationInterface = new ChannelSubscribeConfigurationInterface(this);
	}

	override name() {
		return "IChannel"
	}
	
	override pkg() {
		return api.transform.pkg + "." + "infra"
	}
	
	override fqn() {
		return pkg + "." + name
	}
	
	def channelConfigurationInterface() {
		return channelConfigurationInterface
	}
	
	def channelPublishConfigurationInterface() {
		return channelPublishConfigurationInterface
	}
	
	def channelSubscribeConfigurationInterface() {
		return channelSubscribeConfigurationInterface
	}
	
	override imports() {
		val result = new TreeSet		
		result.addAll(channelConfigurationInterface.imports)
		result.addAll(channelPublishConfigurationInterface.imports)
		result.addAll(channelSubscribeConfigurationInterface.imports)
		return Collections.unmodifiableNavigableSet(result)
	}
	
	override serialize() '''
		package «pkg»;
		
		«imports.join(System.lineSeparator, [i | "import {0};".format(i)])»
		
		/**
		 * Base interface for Channels 
		 */
		public interface «name» {
			
			«channelConfigurationInterface.serialize»
			
			«channelPublishConfigurationInterface.serialize»
			
			«channelSubscribeConfigurationInterface.serialize»
			
		}
	'''
}
