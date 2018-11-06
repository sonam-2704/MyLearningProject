package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zoom {


	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.com");

		WebElement ele= driver.findElement(By.cssSelector("body"));
		ele.sendKeys(Keys.F5);

		driver.navigate().refresh();
	}
}
