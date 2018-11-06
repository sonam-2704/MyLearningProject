package com.selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirefoxProfile {

	public static void main(String[] args) {

		DesiredCapabilities dc = DesiredCapabilities.firefox();

		org.openqa.selenium.firefox.FirefoxProfile profile = new org.openqa.selenium.firefox.FirefoxProfile();

		profile.setPreference("browser.download.dir", "D:\\WebDriverDownloads");
		profile.setPreference("browser.download.folderList", 2);

		dc.setCapability(FirefoxDriver.PROFILE, profile);

		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");
		@SuppressWarnings("deprecation")
		WebDriver driver = new FirefoxDriver(dc);

		driver.get("http://demo.guru99.com/test/drag_drop.html");

	}

}
