package io.github.abelgomez.asyncapi.generator.utils

class Assertions {
	static def assertTrue(boolean value, String message) {
		if (!value) {
			throw new RuntimeException(message);
		}
	}

	static def assertFalse(boolean value, String message) {
		if (value) {
			throw new RuntimeException(message);
		}
	}

	static def <T> T fail(String message) {
		// We define the method as generic to avoid errors
		// when return types are inferred. Anyway, calling
		// this method will make the M2T transformation fail 
		throw new RuntimeException(message);
	}
}
