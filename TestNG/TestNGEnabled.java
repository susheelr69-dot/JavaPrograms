package com.TestNG;

import org.testng.annotations.Test;

public class TestNGEnabled {

	
	
	@Test(enabled=false)
	public void deleteEmployee()
	{
		System.out.println("Delete Employee");
	}
	@Test
	public void addEmployee()
	{
		System.out.println("Add Employee");
	}
	@Test(enabled=false)
	public void updateEmployee()
	{
		System.out.println("Update Employee");
	}
	@Test
	public void selectEmployee()
	{
		System.out.println("Select Employee");
	}
	@Test(enabled=false)
	public void editEmployee()
	{
		System.out.println("Edit Employee");
	}
	
	
}
