package DOM.INFOSYS.COMMONFUNCTIONALITY;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import synchronization.fluent_wait;

public class WaitCondition extends BROWSER_LAUNCH {
	
	
	public WaitCondition() {
			wait=new WebDriverWait(driver, 10);
			wait.ignoring(TimeoutException.class, NoSuchElementException.class);
	}
	
	public void IsDisplay( WebElement element) {
		wait.until(new ExpectedCondition<Boolean>() {

			@Override
			public Boolean apply(WebDriver input) {
				// TODO Auto-generated method stub
				return null;
			

			}
		});
	}
	
/*public static boolean is_display(final WebElement element) {
	
	wait.until(new ExpectedCondition<Boolean>() {

		@Override
		public Boolean apply(WebDriver input) {
			// TODO Auto-generated method stub
			return element.isDisplayed();
		}
	});
	
	return element.isDisplayed();
	}*/
	
	

	
	public void WaitForClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	
	}
	
	public boolean WaitForNavigation(String url) {
		return wait.until(ExpectedConditions.urlContains(url));
	}
	
	public WebElement isVisible(WebElement webElement, WebDriver driver) {
	       return wait.until(ExpectedConditions.visibilityOf(webElement));
	   
	}
}
