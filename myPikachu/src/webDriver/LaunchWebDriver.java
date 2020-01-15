package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchWebDriver {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91790\\eclipse-workspace\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("joshyjoy7");
		
	}
}
