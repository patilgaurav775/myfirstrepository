package synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fluent_wait {
public static WebDriver driver;
	
public void name() {
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Wait wait=new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(""))));
	
	wait.until(new ExpectedCondition<Boolean>() {

		@Override
		public Boolean apply(WebDriver input) {
			// TODO Auto-generated method stub
			return null;
		}
		
		
	});
	
	FluentWait<WebDriver> waitt=new FluentWait<WebDriver>(driver);


	
}



}
