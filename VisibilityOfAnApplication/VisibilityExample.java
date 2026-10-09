package com.VisibilityOfAnApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VisibilityExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\9 AM JAVA\\CoreJavaPrograms\\BrowserDriverFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		
		WebElement salesforceLogo=driver.findElement(By.id("logo"));
		boolean displayed=salesforceLogo.isDisplayed();
		System.out.println(displayed);
		
		WebElement userName=driver.findElement(By.id("username"));
		boolean enabled=userName.isEnabled();
		System.out.println(enabled);
		userName.sendKeys("LiveTech Institute");
		
		WebElement remember=driver.findElement(By.id("rememberUn"));
		boolean selected=remember.isSelected();
		System.out.println(selected);
		remember.click();
		boolean select=remember.isSelected();
		System.out.println(select);
		
		

	}

}
