package com.CookiesExample;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesData {

	public static void main(String[] args) {
		
		
		
				System.setProperty("webdriver.chrome.driver", "D:\\9 AM JAVA\\CoreJavaPrograms\\BrowserDriverFiles1\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		
		Set<Cookie>cookie=driver.manage().getCookies();
//		int cookies=cookie.size();
//		System.out.println(cookies);
		
		System.out.println(cookie.size());
		
		
		
		for(Cookie cookies:cookie)
		{
			
			System.out.println(cookies.getName()+" "+cookies.getValue());
			
			
		}
		
		System.out.println(driver.manage().getCookieNamed("vw"));
		
		Cookie obj=new Cookie("MyCookie","123456789");
		driver.manage().addCookie(obj);	
		cookie=driver.manage().getCookies();
//		int cookies=cookie.size();
//		System.out.println(cookies);
		
		System.out.println(cookie.size());
			
		for(Cookie cookies:cookie)
		{
		 
			System.out.println(cookies.getName()+" "+cookies.getValue());

		}
		
		driver.manage().deleteCookie(obj);
		cookie=driver.manage().getCookies();
//		int cookies=cookie.size();
//		System.out.println(cookies);
		
		System.out.println(cookie.size());
		
		
		
		for(Cookie cookies:cookie)
		{
			
			System.out.println(cookies.getName()+" "+cookies.getValue());
	}
		
		driver.manage().deleteAllCookies();
		cookie=driver.manage().getCookies();
//		int cookies=cookie.size();
//		System.out.println(cookies);
		
		System.out.println(cookie.size());

}
}