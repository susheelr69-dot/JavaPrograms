package com.WaitMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class WaitMethodsExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\9 AM JAVA\\CoreJavaPrograms\\BrowserDriverFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();  

	}

}
