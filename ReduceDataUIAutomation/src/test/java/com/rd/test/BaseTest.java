package com.rd.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class BaseTest {

	public WebDriver driver;

	public void setDriver(String browser) {
		if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("chrome")){
			driver = new ChromeDriver();
		}
	}

	public void quitDriver() {
		if (driver != null)
			driver.quit();
	}
}