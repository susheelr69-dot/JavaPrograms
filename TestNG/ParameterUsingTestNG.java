package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterUsingTestNG {
	
	
	
	@Test
	@Parameters({"Username","Password"})
	public void loginTest(String user,String pass)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println("Username"+user);
		System.out.println("Password"+pass);
		
		WebElement userName=driver.findElement(By.name("username"));
		userName.sendKeys(user);
		
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys(pass);
		
		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
		
	}

}
