package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Broken_Link {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "Resources/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/broken");
		Thread.sleep(2000);
		
		WebElement VALID_LINK=driver.findElement(By.cssSelector("a[href=\"http://demoqa.com\"]"));
		VALID_LINK.click();
		Thread.sleep(2000);

		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		JavascriptExecutor JSE=(JavascriptExecutor) driver;
		JSE.executeScript("window.scrollBy(0,200);");
		Thread.sleep(2000);
		
		WebElement BROKEN_LINK=driver.findElement(By.xpath("//a[text()='Click Here for Broken Link']"));
		BROKEN_LINK.click();
		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.quit();
	}

}
