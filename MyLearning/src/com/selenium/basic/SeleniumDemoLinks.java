package com.selenium.basic;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemoLinks {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		List <WebElement> links = driver.findElements(By.tagName("a"));

		for(WebElement ele: links){

			System.out.println(ele.getAttribute("href"));
			System.out.println(ele.getText());
		}

		
	}

}
