package com.Ezshield.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Ezshield.qa.base.TestBase;
import com.Ezshield.qa.pages.HomePage;
import com.Ezshield.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		 loginpage = new LoginPage();
		 
		
	}
/*
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title = loginpage.validatepagetitle();
		Assert.assertEquals(title, "Facebook – log in or sign up");
		
	}
	
	@Test(priority=2)
	public void logotest() {
		Boolean flag = loginpage.validateimage();
		Assert.assertTrue(flag);
	}
	*/
	
	@Test(priority=1)
	public void logintest() {
		homepage  = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
