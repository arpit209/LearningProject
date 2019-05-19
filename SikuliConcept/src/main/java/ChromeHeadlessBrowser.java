import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class ChromeHeadlessBrowser {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arpit\\Downloads\\movies\\Compressed\\ChromeDriver\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://facebook.com");
		System.out.println("title before login ===" +driver.getTitle());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("ranirk9@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("ranirk9");
		
		driver.findElement(By.id("u_0_8")).click();
	
		System.out.println("title after login ===" +driver.getTitle());
		

	}

}
