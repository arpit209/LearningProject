package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class HeadlessBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\arpit\\Downloads\\movies\\Compressed\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();

		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).click();
		 driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ranirk9@gmail.com");
		 driver.findElement(By.name("pass")).click();
		 driver.findElement(By.name("pass")).sendKeys("ranirk9");
		 System.out.println(driver.getTitle());
		 driver.findElement(By.name("firstname")).sendKeys("aaaa");
		 driver.findElement(By.xpath("//*[@id=\"u_0_8\"]")).click();
	}

}
