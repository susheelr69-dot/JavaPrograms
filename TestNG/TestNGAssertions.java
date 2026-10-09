package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertions {
	
	int Expected=5;
	int Actual=6;
	
	
	@Test
	public void assertionTest()
	{
		
		//Assert.assertEquals(Expected,Actual, "Both are equal");
		//Assert.assertNotEquals(Expected,Actual, "Both are not equal");
		//Assert.assertTrue(Actual>5, "True");
		//Assert.assertFalse(Actual<5, "False");
		//Assert.assertNull(Actual, "Object is null");
		Assert.assertNotNull(Actual, "Object is not null");
		
		
	}
	
	
	

}
