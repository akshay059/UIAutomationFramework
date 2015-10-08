package com.rd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.rd.utils.Config;

public class Login {
	private WebDriver driver;

	private Login(WebDriver driver) {
		this.driver = driver;
		AjaxElementLocatorFactory aelf = new AjaxElementLocatorFactory(driver,
				20);
		PageFactory.initElements(aelf, this);
	}

	public static Login getInstance(WebDriver driver) {
		return new Login(driver);
	}

	@FindBy(name = "email")
	private WebElement email;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(tagName = "button")
	private WebElement submit;

	@FindBy(name = "remember")
	private WebElement rememberCB;

	@FindBy(linkText = "/forgot_password")
	private WebElement forgotPW;

	@FindBy(linkText = "/registernew/d")
	private WebElement signup;

	public void setEmail(String email) {
		this.email.sendKeys(email);
	}

	public void setPassword(String password) {
		this.password.sendKeys(password);
	}

	public void submit() {
		this.submit.click();
	}

	public void toggleRemember() {
		rememberCB.click();
	}

	public void clickForgotPassword() {
		forgotPW.click();
	}

	public void clickSignUp() {
		signup.click();
	}

	public void login(String email, String password) {
		setEmail(email);
		setPassword(password);
		submit();
	}

	public void goTo() {
		String url = Config.getInstance().testConfig.getProperty("base_url");
		driver.get(url);
	}
}
