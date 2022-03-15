package TEST_CASE;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_VALIDATION_OF_LINK {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		WebElement login_panel=driver.findElement(By.id("logInPanelHeading"));
	
		if (login_panel.isDisplayed()) {
			System.out.println("LINK IS SUCCESSFULLY OPEN TEST CASE IS PASS");
		}
		else {
			System.out.println("LINK CAN'T SUCCESSFULLY OPEN TEST CASE IS FAILED");
		}
		
		///////////////////////////////////////////////////SAMPLE TEXT CHECK//////////////////////////////////////////////////
		
		
		WebElement sample_text=driver.findElement(By.cssSelector("span[style=\"color:red; font-weight:bold; z-index:100;\"]"));
		
		if (sample_text.getText().equalsIgnoreCase("( Username : Admin | Password : admin123 )")) {
			System.out.println("TEST CASE OF SAMPLE TEXT IS PASSED");
		}
		else {
			System.out.println("TEST CASE OF SAMPLE TEXT IS FAILED");
		}
		
		//////////////////////////////////////////////////SOCIAL MEDIA ICONS CHECK///////////////////////////////////////////
		
		JavascriptExecutor jsv = (JavascriptExecutor) driver;
		jsv.executeScript("window.scrollBy(0,400);");
		Thread.sleep(3000);
		
		
		
	    WebElement FACEBOOK=driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/OrangeHRM\"]"));	
		
		WebElement TWITTER=driver.findElement(By.cssSelector("a[href=\"http://twitter.com/orangehrm\"]"));	
		
		WebElement YOUTUBE=driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/orangehrm\"]"));	
		
		WebElement LINKED_IN=driver.findElement(By.cssSelector("a[href=\"http://www.linkedin.com/groups?home=&gid=891077\"]"));
		

		
String handle=driver.getWindowHandle();
		if (LINKED_IN.isDisplayed()) {
			LINKED_IN.click();
			driver.switchTo().window(handle);
			
			if (FACEBOOK.isDisplayed()) {
				FACEBOOK.click();
				driver.switchTo().window(handle);
				
				if (TWITTER.isDisplayed()) {
					TWITTER.click();
					driver.switchTo().window(handle);
					
					if (YOUTUBE.isDisplayed()) {
						TWITTER.click();
						driver.switchTo().window(handle);	
						System.out.println("ALL SOCIAL MEDIA ICONS ARE PRESENT IN FOOTER SECTION AND CLICKABLE");
					}
				}
			}
		}
		else {
			System.out.println("ALL SOCIAL MEDIA ICONS ARE NOT DISPLYED OR CLICKABLE");
		}
	}
		
	
		
		
		
		
				
	}


