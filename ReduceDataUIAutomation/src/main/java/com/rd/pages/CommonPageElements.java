package com.rd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class CommonPageElements {

	private CommonPageElements(WebDriver driver) {
		AjaxElementLocatorFactory aelf = new AjaxElementLocatorFactory(driver,
				20);
		PageFactory.initElements(aelf, this);
	}

	public static CommonPageElements getInstance(WebDriver driver) {
		return new CommonPageElements(driver);
	}

	@FindBy(xpath = ".//*[@id='ember845']/div[1]/div/div/ul/li[8]")
	private WebElement logoutButton;

	public void clickLogoutButton() {
		logoutButton.click();
	}

	public void logout() {
		clickLogoutButton();
	}
}
