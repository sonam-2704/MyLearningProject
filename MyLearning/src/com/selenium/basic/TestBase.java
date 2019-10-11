package com.selenium.basic;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public WebDriver driver;
	ThreadLocal<WebDriver> webdriver = new ThreadLocal<WebDriver>();
	
/*	public void setDriver(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {

			// Create object of HashMap Class
			Map<String, Object> prefs = new HashMap<String, Object>();

			// Set the notification setting it will override the default setting
			prefs.put("profile.default_content_setting_values.notifications", 2);

			// Create object of ChromeOption class
			ChromeOptions options = new ChromeOptions();

			// Set the experimental option
			options.setExperimentalOption("prefs", prefs);
			options.addArguments("disable-infobars");
			
			//WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/drivers/chromedriver.exe");
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			
			webdriver.set(driver);
		}
	}*/

	public WebDriver setDriver(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {

			// Create object of HashMap Class
			Map<String, Object> prefs = new HashMap<String, Object>();

			// Set the notification setting it will override the default setting
			prefs.put("profile.default_content_setting_values.notifications", 2);

			// Create object of ChromeOption class
			ChromeOptions options = new ChromeOptions();

			// Set the experimental option
			options.setExperimentalOption("prefs", prefs);
			options.addArguments("disable-infobars");
			
			//WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/drivers/chromedriver.exe");
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			
			webdriver.set(driver);
		}
		
		return driver;
	}
	
	public WebDriver getDriver(){
		
		return webdriver.get();
		
	}
	
}
