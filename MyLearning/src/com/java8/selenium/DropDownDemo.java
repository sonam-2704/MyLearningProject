package com.java8.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownDemo {
	@Test
	public void linksTest() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.facebook.com/");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total Links : " + links.size());
		
		/*for(WebElement ele : links){
			
			if(ele.isDisplayed()){
				
				
			}
		}
*/
		long count = links.stream().filter(item -> item.isDisplayed()).count();
		
		links.stream().filter(item -> item.isDisplayed()).map(ele->ele.getText()).forEach(System.out::println);
		
		links.stream().filter(item -> item.isDisplayed()).filter(ele->ele.getText().contains("Facebook Lite")).forEach(ele->ele.click());;
		
		System.out.println("Total Link visible " + count);
	}

	//@Test
	public void selectDropDownTest() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.facebook.com/");

		Select select = new Select(driver.findElement(By.id("month")));

		select.getOptions().stream().filter(ele -> ele.getText().contains("Jan")).forEach(ele -> ele.click());

	}

}
