package io.github.abelgomez.asyncapi.i40;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class I40Plugin implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		I40Plugin.context = bundleContext;
	}

	public void stop(BundleContext bundleContext) throws Exception {
		I40Plugin.context = null;
	}

}
