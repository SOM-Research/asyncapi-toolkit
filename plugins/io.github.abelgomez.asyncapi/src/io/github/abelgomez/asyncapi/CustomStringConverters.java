package io.github.abelgomez.asyncapi;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.impl.STRINGValueConverter;

import com.google.inject.Inject;

public class CustomStringConverters extends DefaultTerminalConverters {

	// FIXME: This converter will raise a warning when used with a non-terminal
	// rule, but for the moment, it works...
	@Inject
	private STRINGValueConverter stringValueConverter;

	@ValueConverter(rule = "AnyStringButRef")
	public IValueConverter<String> AnyStringButRef() {
		return stringValueConverter;
	}

	@ValueConverter(rule = "AnyString")
	public IValueConverter<String> AnyString() {
		return stringValueConverter;
	}
}
