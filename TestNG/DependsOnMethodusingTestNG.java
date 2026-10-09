package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodusingTestNG {
	
	
	@Test
	public void Test1()
	{
		
		System.out.println("Test1 Successful");
		Assert.fail("Login Failed");
	}
	
	@Test(dependsOnMethods="Test1")
	public void Test2()
	{
		
		System.out.println("Test2 Successful");
		
	}

	
	@Test(dependsOnMethods="Test2")
	public void Test3()
	{
		System.out.println("Test3 Successful");
	}
}
