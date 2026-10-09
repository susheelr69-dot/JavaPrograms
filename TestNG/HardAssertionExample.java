package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionExample {
	
	
	
	@Test
	public void testHardAssert()
	{
		
		System.out.println("Hard Assertion1 is successful");
		Assert.assertEquals("A", "B");
		System.out.println("Hard Assertion2 is successful");
		
	}

}
