package com.selenium.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com");
		
		List <WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
	
		System.out.println(checkbox.size());
		
		List <WebElement> dropdown = driver.findElements(By.tagName("select"));
		
		System.out.println(dropdown.size());
		
		List <WebElement> button = driver.findElements(By.xpath("//button"));
		
		System.out.println(button.size());
		
		List <WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));
		
		System.out.println(radio.size());
		
		List <WebElement> frames = driver.findElements(By.tagName("iframe"));
		
		System.out.println(frames.size());
		
		List <WebElement> textbox = driver.findElements(By.xpath("//input[@type='text']"));
		
		System.out.println(textbox.size());
		
        driver.switchTo().defaultContent();
		
	}

}
