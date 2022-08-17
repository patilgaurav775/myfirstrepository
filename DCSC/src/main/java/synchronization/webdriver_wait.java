 package synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import DOM.INFOSYS.COMMONFUNCTIONALITY.BROWSER_LAUNCH;

public class webdriver_wait extends BROWSER_LAUNCH{
	public static WebDriver driver;
	public static int timeout;
	public static WebDriverWait wait;
	
	public webdriver_wait(WebDriver driver,int timeout) {
		wait = new WebDriverWait(driver, timeout);
	
	}

public static WebElement waitForElementSelected( WebElement element) {
wait.until(ExpectedConditions.elementToBeSelected(element));
		
		 return element;
		}

public static WebElement wait_for_clickable( WebElement element) {
	
	 wait.until(ExpectedConditions.elementToBeClickable(element));
	
	 return element;
	}

public static WebElement wait_for_visible( WebElement element) {
	
	 wait.until(ExpectedConditions.visibilityOf(element));
	
	 return element;
	}
 
public static void implicit_wait() {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

}
