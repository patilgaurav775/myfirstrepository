package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SYNCHRONIZATION {
public static WebDriver driver; 
	public static void main(String[] args) {
		
		//THEIR ARE TWO MAIN TYPES OF SYNCHRONIZATION 1) IMPLICIT WAIT  
		//																							2) EXPLICIT WAIT
		
		///////////////////////////////////////////////////IMPLICIT WAIT//////////////////////////////////////////////////////////////////////
		
	
		
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id(""))));
		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}

}
