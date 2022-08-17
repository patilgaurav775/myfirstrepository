package ACTIONS_CLASS;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://demoqa.com/resizable");
		 driver.manage().window().maximize();
		 
		 Actions action=new Actions(driver);
		 WebElement resize=driver.findElement(By.cssSelector("div[id='resizableBoxWithRestriction'] span[class='react-resizable-handle react-resizable-handle-se']"));
		 
		 Thread.sleep(3000);
		 action.clickAndHold(resize).moveByOffset(100, 50).release().build().perform();
		 
	
		JavascriptExecutor jsv=(JavascriptExecutor) driver;
		jsv.executeScript("window.scrollBy(0,200)");
		 
		 
		 WebElement resize_below=driver.findElement(By.cssSelector("div[id='resizable'] span[class='react-resizable-handle react-resizable-handle-se']"));
		 
		 Thread.sleep(3000);
		 action.clickAndHold(resize_below).moveByOffset(400, 10).release().build().perform();
	}

}
