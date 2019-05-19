package Selenium;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchtoBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\arpit\\Downloads\\movies\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
		
		Thread.sleep(2000);
		
		Set<String> handler = driver.getWindowHandles();
		
		java.util.Iterator<String> it = handler.iterator();
		
		String parentWindowid = it.next();
		System.out.println("parent window id" +parentWindowid);
		
		String childWindowid = it.next();
		System.out.println("child window id" +childWindowid);
		
		driver.switchTo().window(childWindowid);
		Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowid);
		System.out.println(driver.getTitle());
		System.out.println();
	}

}
