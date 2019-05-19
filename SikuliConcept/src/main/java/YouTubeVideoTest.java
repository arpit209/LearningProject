import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class YouTubeVideoTest {

	public static void main(String[] args) throws FindFailed {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\arpit\\Downloads\\movies\\Compressed\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//runtime polymorphism
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");  //get used to hit url in browser
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getCurrentUrl());
		
		Screen s = new Screen();
		
		Pattern pauseImg = new Pattern("SearchButton.png");
		s.wait(pauseImg,2000);
		s.click();
		s.click();
		System.out.println("pause image done");
		
		
	}

}
