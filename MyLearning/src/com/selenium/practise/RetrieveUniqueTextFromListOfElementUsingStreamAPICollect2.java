package com.selenium.practise;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RetrieveUniqueTextFromListOfElementUsingStreamAPICollect2 {

	@Test
	public void RetrieveTextFromListOfElementWithStremAPI() {
		
		// Auto setup of chrome executable file
		// WebDriverManager.chromedriver().setup();

		// Setup of chrome executable file
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");

		// Launching browser
		WebDriver driver = new ChromeDriver();

		// Load the URL
		driver.get("http://automationpractice.com/index.php");

		// Locating all product names at home page
		/*
		 * map() is used to replace stream with text. If stream consists of
		 * {webelement1, webelement2}, after map operation it will be their
		 * inner text {textOfWebelement1, textOfWebElement2}. Using collect()
		 * method to store resultant stream to a set directly to remove
		 * duplicates.
		 */
		Set<String> uniqueProductNames = driver
				.findElements(By.xpath("//ul[contains(@class,'active')]//a[@class='product-name']")).stream()
				.map(productWebElement -> productWebElement.getText()).collect(Collectors.toSet());

		// Print count of product found
		System.out.println("Total unique product found : " + uniqueProductNames.size());

		// Printing product names
		System.out.println("All product names are : ");
		uniqueProductNames.forEach(name -> System.out.println(name));

		// closing the browser
		driver.quit();
		
		
		
		
		
		
	}

}