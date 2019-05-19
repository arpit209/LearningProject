package com.Ezshield.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Ezshield.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//span[@class=\"_1vp5\"]")
	WebElement userNameLabel;
	
	
	@FindBy(xpath="//a[@id='findFriendsNav']")
	WebElement findfriend;
	
	@FindBy(xpath="//span[@class='_2s25 _6a67 _4j0c _p']")
	WebElement Createlink;
	
	//Initializing the page object 
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		
		public String getHomePagetitle() {
			return driver.getTitle();
		}
		
		public FindFriend clickonFindFriendlink() {
			findfriend.click();
			return new FindFriend();
		}
		
		public CreatePage clickoncreatelink() {
			Createlink.click();
			return new CreatePage();
		}
		
		public boolean verifyusernamelink() {
			return userNameLabel.isDisplayed();
		}
}

