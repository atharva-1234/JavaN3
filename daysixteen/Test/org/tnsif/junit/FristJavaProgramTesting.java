package org.tnsif.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
// 
@SuppressWarnings("unused")
class FristJavaProgramTesting {

	@Test
	@DisplayName(" simple junit testing method ")
	void test() {
		System.out.println(" First junit test case");
	}
	@Test
	
	void display() {
		System.out.println(" welcome to junit5 testing ");
	}


}
