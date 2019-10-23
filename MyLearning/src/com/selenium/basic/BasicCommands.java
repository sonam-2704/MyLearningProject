package com.selenium.basic;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicCommands {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.manage().window().getSize());
		
		Dimension d =driver.manage().window().getSize();
		System.out.println(d.getHeight());
		System.out.println(d.getWidth());
		
		
		WebElement ele= driver.findElement(By.id("lst-ib"));
		
		Dimension dim = ele.getSize();
		
		System.out.println(dim.height);
		System.out.println(dim.width);
		
		System.out.println();
		
		// move window to X-Y coordinates
		Point point = new Point(300,200);
		
		driver.manage().window().setPosition(point);
		//open url in new tab
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
		
		// Write page sorce to file
		String source = driver.getPageSource();

		File file = new File("D:/selenium.txt");

		FileWriter fw = new FileWriter(file);
		
		fw.write(source);
		
		fw.close();
		
		// switch browser tabs
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
		
		driver.get("http://www.bing.com");
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"\t");
	}

}
