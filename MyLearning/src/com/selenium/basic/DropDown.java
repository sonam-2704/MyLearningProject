package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.facebook.com/");

		Select select = new Select(driver.findElement(By.id("month")));

		WebElement dropdown = driver.findElement(By.id("month"));

		Actions action = new Actions(driver);

		action.moveToElement(dropdown).click().build().perform();
		
		action.sendKeys(Keys.ARROW_DOWN).click().build().perform();
	}

}
