package com.selenium.practise;

import java.util.HashSet;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RetrieveUniqueTextFromListOfElementUsingStreamAPICollect {
	
	@Test
	public void RetrieveTextFromListOfElementWithStremAPI()
	{
		// Auto setup of chrome executable file
		//WebDriverManager.chromedriver().setup();
		
		// Setup of chrome executable file
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		
		// Launching browser
		WebDriver driver = new ChromeDriver();
		
		// Load the URL
		driver.get("http://automationpractice.com/index.php");
		
		// Creating a Set to store only unique names
		Set<String> uniqueProductName = new HashSet<String>();
		
		// Locating all product names at home page
		
		driver.findElements(By.xpath("//ul[contains(@class,'active')]//a[@class='product-name']"))
		.stream()
		.forEach(product -> uniqueProductName.add(product.getText()));
		
		// Print count of product found
		System.out.println("Total unique product found : "+uniqueProductName.size());
		
		// Printing product names
		System.out.println("All product names are : ");
		uniqueProductName.forEach(name -> System.out.println(name));

		// closing the browser
		driver.quit();
	}
	
	
	

}