/*
 * generated by Xtext 2.17.0
 */
package io.github.abelgomez.asyncapi.ui.tests;

import com.google.inject.Injector;
import io.github.abelgomez.asyncapi.ui.internal.AsyncapiActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class AsyncApiUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return AsyncapiActivator.getInstance().getInjector("io.github.abelgomez.asyncapi.AsyncApi");
	}

}