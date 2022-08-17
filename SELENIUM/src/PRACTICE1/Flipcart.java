package PRACTICE1;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flipcart {
public static WebDriver driver;

	
	@Test
	public  static void launch_browser_and_link() {
	System.setProperty("webdriver.chome.driver",".\\Resources\\chromedriver.exe");	
	driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	
	
	
	
	
	
	}
	
	
}
