package DOM.INFOSYS.ORANGE_HRM;

import java.sql.DriverManager;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class wait {

	// explicit wait
	// 2.fluent wait
	// fluent wait adding some more point
	// 1st is polling time means u change the polling time, default time is
	// 500milisecond so can do 200milisecond
	// 2nd is ignoring exception/, this concept is not present in webdriver wait.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		 WebDriver Driver = new ChromeDriver();

		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.

		// this is declaration part
		 FluentWait<WebDriver> wait = new FluentWait<WebDriver>(Driver).withTimeout(Duration.ofSeconds(10))
			// polling use for changing the polling time
			.pollingEvery(Duration.ofSeconds(2))
			// ignoring use for ignoring the exception
			.ignoring(NoSuchElementException.class,TimeoutException.class);

		Driver.manage().window().maximize();
		Driver.get("https://www.google.com/");
		System.out.println(Driver.getTitle());

		WebElement elememt = Driver.findElement(By.name("q"));
		elememt.sendKeys("selenium");
		elememt.sendKeys(Keys.ENTER);

		// Driver.findElement(By.xpath("//h3[text()='Selenium']"));
		// new Function<WebDriver, WebElement>() this is java script function
		// this is usages of fluent wait
		
		WebElement element2 =  wait.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver Driver) {
				return Driver.findElement(By.xpath("//h3[text()='Selenium']"));
			}
		    });

		element2.click();
		System.out.println(Driver.getTitle());
		Driver.quit();

	}

}
 class explicitwaitGenricMethod {

	public static WebDriver Driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.firefoxdriver().setup();
		Driver = new FirefoxDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.google.com/");
		System.out.println(Driver.getTitle());

		WebElement elememt = Driver.findElement(By.name("q"));
		elememt.sendKeys("selenium");
		elememt.sendKeys(Keys.ENTER);

		By element1 = By.xpath("//h3[text()='Selenium']");
		//only pass three things 1st driver, 2nd locator, 3rd time
		WebElement element2=waitForElementPressent(Driver, element1, 10);
		element2.click();
		
		System.out.println(Driver.getTitle());
		Driver.quit();
		
		// explicit wait
		// 1.webdriver wait
		// if u want perform this explicitwait condition on multiple webelement again & again
		//so we need to create one generic condition/ one commen method
		//so we only pass the locater and driver and time for this method
	}
		public static WebElement waitForElementPressent(WebDriver Driver, By locator, int timeout) {
		
		WebDriverWait wait = new WebDriverWait(Driver, timeout);
		 wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		 return Driver.findElement(locator);
		}
		
		

		
	
}
