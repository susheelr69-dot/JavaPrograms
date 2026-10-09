package com.WorkingWithEditBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditBoxExample1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\9 AM JAVA\\CoreJavaPrograms\\BrowserDriverFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("LiveTechTrainingInstitute");
		
		String user=username.getAttribute("value");
		System.out.println(user);
		
		String user1=username.getAttribute("name");
		System.out.println(user1);
		
		String user2=username.getAttribute("type");
		System.out.println(user2);
		
		WebElement forgot=driver.findElement(By.linkText("Forgot Your Password?"));
		String forgetten=forgot.getText();
		System.out.println("forgetten");
		
		
		String value=forgot.getAttribute("href");
		System.out.println(value);
		
		
		
		
	}

}
