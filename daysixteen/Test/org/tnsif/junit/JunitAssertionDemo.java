package org.tnsif.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
// program on assertion annotations 

@SuppressWarnings("unused")

class JunitAssertionDemo
{

	@Test
	void test()
	{
		assertEquals(12,12);
	}
	@Test
	void display()
	{
		// fails when expression is not false 
		assertFalse(12==1);
	}

}
