package com.VisibilityOfAnApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VisibilityExample1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\9 AM JAVA\\CoreJavaPrograms\\BrowserDriverFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		WebElement swaglabsLogo=driver.findElement(By.className("login_logo"));
		boolean displayed=swaglabsLogo.isDisplayed();
		System.out.println(displayed);
		
		
		WebElement username=driver.findElement(By.id("user-name"));
		boolean enabled=username.isEnabled();
		System.out.println(enabled);
		username.sendKeys("LiveTechTrainingInstitute");
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\9 AM JAVA\\CoreJavaPrograms\\BrowserDriverFiles\\chromedriver.exe");
		ChromeDriver login=new ChromeDriver();
		login.get("https://login.salesforce.com/");
		login.manage().window().maximize();
		
		WebElement remember=login.findElement(By.id("rememberUn"));
		boolean selected=remember.isSelected();
		System.out.println(selected);
		
		
		
		
		
		
		

	}

}
