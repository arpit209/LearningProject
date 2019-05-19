package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enroll {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arpit\\Downloads\\movies\\Compressed\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("auto");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("auto");
		
		

	}

}
