package com.rd.test;

import java.net.MalformedURLException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public abstract class BaseTest {

	public WebDriver driver;

	public void setDriver(String browser) throws MalformedURLException {
		if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("phantom")) {
			DesiredCapabilities dCaps = new DesiredCapabilities();
			dCaps.setJavascriptEnabled(true);
			dCaps.setCapability("webStorageEnabled", true);
			driver = new PhantomJSDriver(dCaps);
		}
		driver.manage().window().setSize(new Dimension(1920, 1080));
	}

	public void quitDriver() {
		if (driver != null)
			driver.quit();
	}
}