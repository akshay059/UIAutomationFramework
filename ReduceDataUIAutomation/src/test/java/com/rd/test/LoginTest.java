package com.rd.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.rd.pages.CommonPageElements;
import com.rd.pages.Login;

public class LoginTest extends BaseTest {
	
	@BeforeTest
	@Parameters("browser")
	public void before(String browser) {
		setDriver(browser);
		// TODO Auto-generated constructor stub
	}

	@Test
	public void loginTest(){
		Login.getInstance(driver).goTo();
		Login.getInstance(driver).login("sddemo", "sddemo");
		CommonPageElements.getInstance(driver).logout();
	}
	
	@AfterTest
	public void after(){
		quitDriver();
	}
}
