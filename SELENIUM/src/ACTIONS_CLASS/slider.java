package ACTIONS_CLASS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://demoqa.com/slider");
		 driver.manage().window().maximize();
		 
		 Actions action=new Actions(driver);
		 
		 WebElement pointer=driver.findElement(By.cssSelector("input[type='range']"));
		
		action.clickAndHold(pointer).moveByOffset(25, 0).build().perform();
		Thread.sleep(3000);
		 
		 action.clickAndHold(pointer).moveToElement(pointer, -25, 0).release().build().perform();
		 Thread.sleep(3000);
		 
	}

}
