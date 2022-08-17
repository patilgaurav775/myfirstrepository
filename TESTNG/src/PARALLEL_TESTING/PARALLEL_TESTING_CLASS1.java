package PARALLEL_TESTING;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import LISTNERS.custom_listner;

public class PARALLEL_TESTING_CLASS1 extends custom_listner{
	WebDriver driver;
	
	@Test(priority = 3)
	public void logo() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		WebElement user=driver.findElement(By.id("txtUsername"));
		user.sendKeys("Admin");
		System.out.println(user.getAttribute("id"));
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		Thread.sleep(5000);
		
	}
	

	
	@AfterMethod
	public void tear_Down() {
		driver.quit();
	}
}
