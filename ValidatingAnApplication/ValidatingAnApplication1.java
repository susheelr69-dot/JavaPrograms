package com.ValidatingAnApplication;

import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingAnApplication1 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\9 AM JAVA\\CoreJavaPrograms\\BrowserDriverFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.bing.com");
		driver.manage().window().maximize();
		
		String Expected_Title="Search - Microsoft Bing";
		System.out.println(Expected_Title);
		
		String Actual_Title=driver.getTitle();
		System.out.println(Actual_Title);
		
		if(Expected_Title.equals(Actual_Title))
		{
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("Both are not equal");
		}
		System.out.println("@@@@@@@@@@@@@@");
		if(Expected_Title.contains(Actual_Title))
		{
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("Both are not equal");
		}
		

	}

}
