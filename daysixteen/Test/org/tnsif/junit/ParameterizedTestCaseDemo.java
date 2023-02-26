package org.tnsif.junit;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
// program on parameterized test
class ParameterizedTestCaseDemo {

	//@Test
	@ParameterizedTest
	@ValueSource(strings={" nia","diya"})
	
	void test() {
		System.out.println("hello");
	}
	@ParameterizedTest
	@ValueSource(strings={" nia","diya"})
	
	void display(String str) {
		assertNotNull(str);
	}

}
