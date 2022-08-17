package SYNCHRONIZATION;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IMPLICIT_WAIT {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/bus-tickets/"); // GET METHOD OF WEBDRIVER
		driver.manage().window().maximize();
		
		
	//WebElement bus1 = driver.findElement(By.xpath("//span[text()='Buses']"));
	//WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
      

		  /*wait1.until(new ExpectedCondition<Boolean>(){
			@Override
			public Boolean apply(WebDriver driver) {
				// TODO Auto-generated method stub
				return bus1.isDisplayed();
			}
        });*/
	

		
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		


		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// wait.until(ExpectedConditions.urlContains("https://www.makemytrip.com/bus-tickets/"));
		

		WebElement bus = driver.findElement(By.xpath("//span[text()='Buses']"));
		// wait.until(ExpectedConditions.elementToBeClickable(bus));
		bus.click();

		WebElement from = driver.findElement(By.xpath("//input[@id='fromCity']"));
		// wait.until(ExpectedConditions.elementToBeClickable(from));
		from.click();

		WebElement frombox = driver.findElement(By.xpath("//input[@placeholder='From']"));
		frombox.sendKeys("jalgaon");
		Thread.sleep(3000);
		
		WebElement jalgaon = driver.findElement(By.id("react-autowhatever-1-section-0-item-0"));
		jalgaon.click();
		
		Thread.sleep(3000);
		WebElement to = driver.findElement(By.xpath("//span[text()='To']"));
		to.click();
		Thread.sleep(3000);

		WebElement tobox = driver.findElement(By.cssSelector("input[placeholder='To']"));
		tobox.click();
		tobox.sendKeys("mumbai");
		Thread.sleep(3000);
		
		WebElement mumbai = driver.findElement(By.id("react-autowhatever-1-section-0-item-0"));
		mumbai.click();
		

	}

}
