package com.Ezshield.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Ezshield.qa.base.TestBase;
import com.Ezshield.qa.pages.HomePage;
import com.Ezshield.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test(priority=1)
	public void verifyhomepagetitle() {
		String homepagetitle = homepage.getHomePagetitle();
		Assert.assertEquals(homepagetitle, "(17) Facebook", "Home page title not match");
	}
	
	@Test(priority=2)
	public void verifyusernametest() {
		Assert.assertTrue(homepage.verifyusernamelink());
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
