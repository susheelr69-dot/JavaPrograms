package com.BrowserInteractionCommands;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserInteractionCommandsExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\9 AM JAVA\\CoreJavaPrograms\\BrowserDriverFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		//get()
		driver.get("https://www.flipkart.com/");
		
		
		//maximize()
		driver.manage().window().maximize();
		
		
		//getPageSource
		String code=driver.getPageSource();
		System.out.println(code);
		
		//getTitle()
		String title=driver.getTitle();
		System.out.println("The title of the flipkart is:"+title);
		
		
		//getCurrentUrl();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//navigate().to();
		driver.navigate().to("https://www.myntra.com/");
		
		
		driver.navigate().back();
		driver.navigate().back();
		
		
		//navigate().forward();
		driver.navigate().forward();
		Thread.sleep(5000);
		
		//navigate().refresh();
		driver.navigate().refresh();
		
		//Close();
		driver.close();
		
		
		//Quit();
		driver.quit();

	}

}
