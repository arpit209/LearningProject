package Selenium;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinkonPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\arpit\\Downloads\\movies\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List <WebElement> linklist = driver.findElements(By.tagName("a"));
		
		System.out.println(linklist.size());
		
		for (int i=0; i<linklist.size(); i++) {
			String linktext = linklist.get(i).getText();
			System.out.println(linktext);
		}
		
		 
	}
	

}
