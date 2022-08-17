package PRACTICE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class PARALLEL_TESTING {
	WebDriver driver;
	
	@Test(priority = 1,groups = "logo")
	public void logo()   {
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement logo=driver.findElement(By.xpath("//div[@id='divLogo']"));
		Assert.assertEquals(logo.isDisplayed(), true);
		driver.quit();
	}
	
	@Test(priority = 2)
	public void title() {
	
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Assert.assertEquals(driver.getTitle(), "OrangeHRM", "title test case is passed");
		driver.quit();
	}
	
/*	@AfterMethod
	public void tear_Down() {
		driver.quit();
	}*/
	
}
