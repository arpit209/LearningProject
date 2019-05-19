package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadPropFile {
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Properties prop = new Properties();
		
		FileInputStream ip = new FileInputStream("/Users/arpit/git/LearningProject/JavaBasic/src/Selenium/config.properties");

		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
		
		System.out.println(prop.getProperty("age"));
		
		String url = prop.getProperty("URL");
		
		System.out.println(url);
		
		String browsername = prop.getProperty("browser");
		
		System.out.println(browsername);
		
		if (browsername.equals("chrome")) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arpit\\Downloads\\movies\\Compressed\\chromedriver.exe");
		 driver = new ChromeDriver();
		}
		  else if 
			(browsername.equals("ff")){
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\arpit\\Downloads\\movies\\Compressed\\gekodriver.exe");
				 driver = new FirefoxDriver();	
		}else if
			(browsername.equals("ie")){
			System.setProperty("webdriver.ie.driver", "C:\\Users\\arpit\\Downloads\\movies\\Compressed\\IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
			
			 driver.get(url);
			 Thread.sleep(2000);
			 System.out.println("url navigate and wait time complete");
			 driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("name"));
			 
			 driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("name"));
			 
			 driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("a");
			 driver.findElement(By.xpath("//*[@id=\"u_0_8\"]")).click();
		}
		
	}
}
