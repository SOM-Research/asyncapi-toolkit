package io.github.abelgomez.asyncapi.generator.utils

class StringUtils {
	
	static def String emptyString() {
		return ""
	}

	static def boolean empty(CharSequence s) {
		return s === null || s.toString.trim.length == 0
	}
	
	static def boolean notEmpty(CharSequence s) {
		return s !== null && !s.empty
	}
	
	static def String asJavaIdentifier(String s) {
		val builder = new StringBuilder();
		var nextUpper = false;
		for (char c : s.toCharArray) {
			if (Character.isDigit(c)) {
				builder.append(c);
			} else if (Character.isAlphabetic(c)) {
				if (nextUpper) {
					builder.append(Character.toUpperCase(c));
					nextUpper = false;
				} else {
					builder.append(c);
				}
			} else if (c == Character.valueOf('-') || c == Character.valueOf('_')) {
				nextUpper = true;
			} else {
				builder.append("_");
			}
		}
		var retVal = builder.toString()
		retVal = if (retVal.length > 0 && (Character.isLowerCase(retVal.charAt(0)) || (retVal.startsWith("_") && !s.startsWith("_")))) retVal else "_" + retVal
		return retVal;	
	}

	static def String asJavaClassName(String s) {
		val builder = new StringBuilder();
		var nextUpper = true;
		for (char c : s.toCharArray) {
			if (Character.isDigit(c)) {
				builder.append(c);
				nextUpper = true;
			} else if (Character.isAlphabetic(c)) {
				if (nextUpper) {
					builder.append(Character.toUpperCase(c));
					nextUpper = false;
				} else {
					builder.append(c);
				}
			} else if (c == Character.valueOf(' ') || c == Character.valueOf('-') || c == Character.valueOf('_')) {
				nextUpper = true;
			} else {
				nextUpper = true;
				builder.append("_");
			}
		}
		val retVal = builder.toString()
		return if (retVal.length > 0 && Character.isDigit(retVal.charAt(0))) "_" + retVal else retVal;	
	}
	
	static def String asJavaConstantName(String s) {
		val builder = new StringBuilder();
		var lastUppercase = true
		for (char c : s.toCharArray) {
			if (!Character.isLetterOrDigit(c)) {
				builder.append('_');
			} else {
				if (Character.isUpperCase(c) && !lastUppercase) {
					builder.append('_');
				}
				builder.append(Character.toUpperCase(c));
			}
			lastUppercase = Character.isUpperCase(c)
		}
		val retVal = builder.toString()
		return if (retVal.length > 0 && (Character.isUpperCase(retVal.charAt(0)) || (retVal.startsWith("_") && !s.startsWith("_")))) retVal else "_" + retVal;	
	}
	
	static def String asPackageName(String s) {
		var segments = s.split("[/ ]");
		return segments.filter[segment | s.length > 0].map[segment | segment.asJavaIdentifier].join(".");
	}
}
