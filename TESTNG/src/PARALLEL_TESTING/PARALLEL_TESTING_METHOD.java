package PARALLEL_TESTING;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class PARALLEL_TESTING_METHOD {
	WebDriver driver;
	
	@Test(priority = 1)
	public void logo() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		WebElement logo=driver.findElement(By.xpath("//div[@id='divLogo']"));
		Assert.assertEquals(logo.isDisplayed(), true);
	}
	
	@Test(priority = 2)
	public void title() {
		
		System.setProperty("webdriver.gecko.driver", "resources\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Assert.assertEquals(driver.getTitle(), "OrangeHRM", "title test case is passed");
	}
	
	@AfterMethod
	public void tear_Down() {
		driver.quit();
	}
	
}
