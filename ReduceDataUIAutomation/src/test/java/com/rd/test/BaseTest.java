package com.rd.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public abstract class BaseTest {

	public WebDriver driver;

	public void setDriver(String browser) throws MalformedURLException {
		if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("chrome")){
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("phantom")){
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setJavascriptEnabled(true);
			driver  = new RemoteWebDriver(new URL("http://localhost:9999"), capabilities);
		}
	}

	public void quitDriver() {
		if (driver != null)
			driver.quit();
	}
}