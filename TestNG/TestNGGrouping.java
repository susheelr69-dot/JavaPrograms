package com.TestNG;

import org.testng.annotations.Test;

public class TestNGGrouping {
	
	@Test(groups="Sanity")
	public void test1()
	{
		System.out.println("Sanity test is successful");
	}
	
	@Test(groups="Regression")
	public void test2()
	{
		
		System.out.println("Regression test is successful"); 
	}
	
	@Test(groups="Sanity,Regression")
	public void test3()
	{
		System.out.println("Both sanity and regression tests are successful");
	}
	
	

}
