package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class OHRMMainTest extends OHRMBaseTest{

	
	
	@Test
	public void LoginTest()
	{
		WebElement userName=driver.findElement(By.id("txtUsername"));
		userName.sendKeys("Admin");
		
		userName.sendKeys("LiveTech@123");
		
		WebElement login=driver.findElement(By.id("btnLogin"));
		login.click();
		
		
	}
	
}
