package com.selenium.basic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToBottom {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://wikipedia.org");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("scrollBy(0,2500)");
		
		
	}

}
