package ACTIONS_CLASS;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class key_up_key_down {
public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 driver.manage().window().maximize();
		
		WebElement username= driver.findElement(By.id("txtUsername"));
		WebElement password=driver.findElement(By.id("txtPassword"));
	    username.sendKeys("Admin");
		
	/*	JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('txtUsername').value='Admin'");
		jse.executeScript("document.getElementById('txtPassword').value=('admin123')");*/
		
		
		Thread.sleep(3000);
		
		driver.close();
		
	/*	Actions atn=new Actions(driver);
		atn.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		atn.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		password.click();
		atn.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();*/
		
		
		String a=Keys.chord(Keys.CONTROL,"a",Keys.CONTROL,"c");
		//String b=Keys.chord(Keys.CONTROL,"c");
		String c=Keys.chord(Keys.CONTROL,"v");
		username.sendKeys(a);
		//username.sendKeys(b);
		password.click();
		password.sendKeys(c);
		
		
		
		
		WebElement submit=driver.findElement(By.name("Submit"));
		 

		 
		 
	}

}
