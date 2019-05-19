package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\arpit\\Downloads\\movies\\Compressed\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://www.freecrm.com/");

	}

}
