package com.TestNG;

import org.testng.annotations.Test;

public class TestNGPrioritization {

	
	
	@Test(priority=1)
	public void deleteEmployee()
	{
		System.out.println("Delete Employee");
	}
	@Test(priority=2)
	public void addEmployee()
	{
		System.out.println("Add Employee");
	}
	@Test(priority=3)
	public void updateEmployee()
	{
		System.out.println("Update Employee");
	}
	@Test(priority=4)
	public void selectEmployee()
	{
		System.out.println("Select Employee");
	}
	@Test(priority=5)
	public void editEmployee()
	{
		System.out.println("Edit Employee");
	}
	
	
}
