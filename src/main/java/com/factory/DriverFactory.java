package com.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {
	
	
	public WebDriver driver;
	
	public static ThreadLocal<WebDriver> tlDriver= new ThreadLocal<WebDriver>(); /*Using ThreadLocal<WebDriver> in Selenium helps manage WebDriver instances in parallel execution scenarios. 
	                                                                              This ensures that each thread (test case) gets its own WebDriver instance, avoiding concurrency issues.*/
	
	public WebDriver init_Driver(String browser) {
	
		
		if(browser.equals("chrome")) {
			tlDriver.set(new ChromeDriver());
		}
		else if(browser.equals("firefox")) {
			tlDriver.set(new FirefoxDriver());
		}
		else if(browser.equals("safari")) {
			tlDriver.set(new SafariDriver());
		}
		else
		{
			System.out.println("Please pass the correct browser value "+ browser);
		}
		
		getDriver().manage().window().maximize();
		return getDriver();
	}
	
	/*This below method is used to retrieve the WebDriver instance stored in the ThreadLocal<WebDriver> variable.
	 The synchronized keyword ensures that only one thread at a time can execute the getDriver() method.
	*/
	
	public static synchronized WebDriver getDriver()
	{
		 return tlDriver.get();    
		
	}
}
