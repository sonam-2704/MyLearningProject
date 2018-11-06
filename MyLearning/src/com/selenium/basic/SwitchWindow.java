package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {

	public static void main(String[] args) {



		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.com");

		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");

		driver.get("http://www.bing.com");
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"a");


	}

}
