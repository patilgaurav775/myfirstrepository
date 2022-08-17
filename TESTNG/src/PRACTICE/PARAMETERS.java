package PRACTICE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PARAMETERS {
	WebDriver driver;
	@BeforeClass
	@Parameters({"browser","url"})
	public void browserlaunch(String browser,String url) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("gecko")) {
			System.setProperty("webdriver.gecko.driver", "resources\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.get(url);
	}
	
	
	@Test(priority = 1, enabled = true)
	public void logo() {
		
		WebElement logo=driver.findElement(By.xpath("//div[@id='divLogo']"));
		Assert.assertEquals(logo.isDisplayed(), true);
	}
	
	@Test(priority = 2)
	public void login_successful() throws InterruptedException {
		
		 
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		Thread.sleep(5000);
		
	}
	
@AfterClass
	public void tear_down() {
		driver.quit();
	}
}
