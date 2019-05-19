package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arpit\\Downloads\\movies\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	/*	
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@name='proceed']")).click();

		Thread.sleep(1000);
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
		alert.accept();
		System.out.println("Handle alert is done, now attach file");
		Thread.sleep(2000);
		*/
		driver.get("https://html.com/input-type-file/");
		
		driver.findElement(By.xpath("//input[@name='fileupload']")).sendKeys("F:\\test.jpg");
		
		
	}

}
