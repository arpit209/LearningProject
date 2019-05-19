package com.Ezshield.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Ezshield.qa.base.TestBase;

public class LoginPage extends TestBase {

	//object repository
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="pass")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Log In']")
	WebElement loginbtn;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[1]/h1/a/i")
	WebElement logo;
	
	//Initializing the page object 
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validatepagetitle() {
		return driver.getTitle();
	}
	
	public boolean validateimage() {
		return logo.isDisplayed();
	}
	
		public HomePage login (String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
		
		return new HomePage();
		}
	}
	


