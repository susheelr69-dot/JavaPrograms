package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SalesforceMainTest extends SalesforceBaseTest {
	
	
	
	@Test 
	public void testing()
	{
		WebElement userName=driver.findElement(By.id("username"));
		userName.sendKeys("LiveTechTraining");
		
		
		WebElement login=driver.findElement(By.id("Login"));
		login.click();
		
		
		
	}
	

}
