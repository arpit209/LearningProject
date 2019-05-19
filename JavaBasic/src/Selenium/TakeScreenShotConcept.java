package Selenium;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenShotConcept {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\arpit\\Downloads\\movies\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
		// code to take screen shot and save it
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File DestFile = new File("f:\\google.jpg");
		Files.copy(scrFile,DestFile);
		System.out.println("screenshot took pass");
		driver.close();
		//FileUtils.copyFile(scrFile, new File("F:/google.png"));
		
	}

}
