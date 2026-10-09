package com.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExample {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "D:\\9 AM JAVA\\CoreJavaPrograms\\BrowserDriverFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		
		//ID
		//Method 1
		//driver.findElement(By.id("username")).sendKeys("Livetech");
		
		//Method 2
//       WebElement userName=driver.findElement(By.id("username"));
//       userName.sendKeys("Testing");
		
		//Method 3
//		String username="Manual Testing";
//		By user=By.id("username");
//		WebElement user1=driver.findElement(user);
//		user1.sendKeys(username);
		
		//Name
//		   WebElement user=driver.findElement(By.name("username"));
//		   user.sendKeys("Full Stack Testing");
		   
		   
	      //ClassName
		   //WebElement user=driver.findElement(By.className("input"));
		   //user.sendKeys("LiveTraining");
		
	     
		  //LinkText
//		   WebElement link=driver.findElement(By.linkText("Use Custom Domain"));
//           link.click();	
	
//		   //Partial LinkText
//		   WebElement link=driver.findElement(By.partialLinkText("?"));
//		   link.click();
		   
		   //TagName
		   //List<WebElement>links=driver.findElements(By.tagName("a"));
		   //int link=links.size();
		   //System.out.println(link);
		   //System.out.println(links.size());
		   
		   //XPath
//		   WebElement user=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/div[1]/div/input[1]"));
//		   user.sendKeys("Java");
	
		   //Relative Xpath
//		     WebElement user=driver.findElement(By.xpath("//*[@id=\"username\"]"));
//		     user.sendKeys("SQL");
		
//		WebElement user=driver.findElement(By.xpath("//input[@id='username']"));
//		user.sendKeys("AI Testing");
		
		//CSS Selector
//		WebElement user=driver.findElement(By.cssSelector("#username"));
//		user.sendKeys("API Testing");
		   
		
		WebElement user=driver.findElement(By.cssSelector("input[id='username']"));
		user.sendKeys("PlayWright Testing");

	}

}
