package org.tnsif.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@SuppressWarnings("unused")

@TestInstance(Lifecycle.PER_CLASS)


class JunitAnnotationsDemo {

	

	@Test
	@DisplayName(" simple junit testing method ")
	void test() {
		System.out.println(" First junit test case");
	}
	@Test

	
	@BeforeAll
	/* if we make this method as static 
	 * 
	 */
	 void display() {
		System.out.println(" welcome to junit5 testing ");
	}
	@Test
	@AfterEach
	@Disabled
	  void accept() {
		System.out.println(" after ecah method demo ");
	}


}
