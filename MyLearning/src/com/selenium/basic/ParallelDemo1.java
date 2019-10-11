package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ParallelDemo1  {
	
	@Test
	public void login(){
		
		TestBase obj = new TestBase();
		
		
	/*	obj.setDriver("chrome");
		obj.getDriver().get("http://www.google.com");
		obj.getDriver().findElement(By.linkText("Gmail")).click();
		obj.getDriver().manage().window().maximize();
		
	*/
		
		WebDriver driver = obj.setDriver("chrome");
		driver.get("http://www.google.com");
		
		driver.findElement(By.linkText("Gmail")).click();
	}

}
