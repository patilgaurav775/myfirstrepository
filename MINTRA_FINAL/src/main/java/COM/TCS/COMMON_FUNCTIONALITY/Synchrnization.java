package COM.TCS.COMMON_FUNCTIONALITY;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchrnization extends Browser_Launch{
	public static WebDriverWait wait;
	
	public Synchrnization(WebDriver driver,int timeout){
		wait=new WebDriverWait(driver,timeout);
	}
	
	public void Wait_for_element_to_be_clickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void Wait_for_element_to_be_visible(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void Wait_for_element_to_be_selectable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeSelected(element));
	}
	
}
