package io.github.abelgomez.asyncapi.i40.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class I40UiPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "io.github.abelgomez.asyncapi.i40.ui"; //$NON-NLS-1$

	// The shared instance
	private static I40UiPlugin plugin;
	
	/**
	 * The constructor
	 */
	public I40UiPlugin() {
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static I40UiPlugin getDefault() {
		return plugin;
	}

}
