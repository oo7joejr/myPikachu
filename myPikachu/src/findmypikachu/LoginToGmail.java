package findmypikachu;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginToGmail {
   public static void main(String[] args) throws InterruptedException   
   {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91790\\eclipse-workspace\\Drivers\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
      driver.get("https://www.gmail.com");
      driver.findElement(By.id("identifierId")).sendKeys("joshyjoy123",Keys.ENTER);
      Thread.sleep(3000);
      driver.findElement(By.name("password")).sendKeys("ohjesushelpus",Keys.ENTER);
      Thread.sleep(4000);
      driver.close();
   }
}