package com.selenium.basic;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TextBox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com");
		
		WebElement textBox = driver.findElement(By.id("email"));
		
		//textBox.sendKeys("abcdefgh");
		
		Actions action = new Actions(driver);
		
		//action.moveToElement(textBox).click().sendKeys("smsonammittal@gmail.com").build().perform();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;

		//js.executeScript("document.getElementById('email').value='new value'");
		
		js.executeScript("arguments[0].value='smsonammittal@gmail.com'", textBox);
	}

}
