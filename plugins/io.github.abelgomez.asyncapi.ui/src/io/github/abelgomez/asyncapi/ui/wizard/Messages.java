package io.github.abelgomez.asyncapi.ui.wizard;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "io.github.abelgomez.asyncapi.ui.wizard.messages"; //$NON-NLS-1$
	
	public static String EmptyAsyncAPIProject_Label;
	public static String EmptyAsyncAPIProject_Description;
	public static String StreetlightsAPIProject_Label;
	public static String StreetlightsAPIProject_Description;
	public static String EcoreAsyncAPIProject_Label;
	public static String EcoreAsyncAPIProject_Description;
	
	static {
	// initialize resource bundle
	NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
