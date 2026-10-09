package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SalesforceBaseTest {
	
	public static WebDriver driver;
	String applicationURLAddress="https://login.salesforce.com";
	
	@BeforeMethod
	public void applicationLaunch()
	{
		driver=new ChromeDriver();
		driver.get(applicationURLAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
	}
	
	
	@AfterMethod
	public void applicationClose()
	{
		
		driver.close();
	}


}
