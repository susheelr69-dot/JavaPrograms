package com.TestNG;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestNG {

	
	@DataProvider(name="logindata")
	public Object[][] getdata(){
	return new Object[][] {
		
		{"Admin","Laddu"},
		{"Laddu","Livetech@123"},
		{"Laddu","jamoon"},
		{"Admin","admin123"},
		
		
	};
		
		
	}
	
	
	
	
	@Test(dataProvider="logindata")
	public void LoginTest(String username,String password)
	{
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(
			    Duration.ofSeconds(10)
			);
		System.out.println("Username:"+username);
		System.out.println("Password:"+password);
		
		WebElement userName=driver.findElement(By.name("username"));
		userName.sendKeys(username);
		
		WebElement password1=driver.findElement(By.name("password"));
		password1.sendKeys(password);
		
		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
		
	}
	
	
	
	
}
