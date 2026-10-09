package com.TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionExample {
	
	
	
	@Test
	public void testSoftAssert()
	{SoftAssert soft=new SoftAssert();
		
		System.out.println("Hard Assertion1 is successful");
		soft.assertEquals("A", "B");
		System.out.println("Hard Assertion2 is successful");
		
		soft.assertAll();
		
	}

}
