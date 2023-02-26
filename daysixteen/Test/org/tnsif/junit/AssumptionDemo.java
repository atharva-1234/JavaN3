package org.tnsif.junit;

import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

@SuppressWarnings("unused")
class AssumptionDemo {

	@Test
	void test() {
		Assumptions.assumeTrue(3>2);
	}
	@Test
	void display() {
		Assumptions.assumeFalse(3<2);
	}


}
