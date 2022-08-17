package BOOK_APP;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_LOGIN {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor jsv = (JavascriptExecutor) driver;
		jsv.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		WebElement ELEMENT=driver.findElement(By.cssSelector("div[class=\"avatar mx-auto white\"] svg[viewBox=\"0 0 512 512\"]"));
		ELEMENT.click();
		Thread.sleep(3000);
		
		jsv.executeScript("window.scrollBy(0,600);");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		WebElement login=driver.findElement(By.xpath("//span[text()='Login']"));
		login.click();
		Thread.sleep(3000);
		
		WebElement new_user=driver.findElement(By.id("newUser"));
		new_user.click();
		Thread.sleep(3000);
		
		WebElement first_name=driver.findElement(By.id("firstname"));
		first_name.sendKeys("GAURAV");
		Thread.sleep(3000);
		
		WebElement last_name=driver.findElement(By.id("lastname"));
		last_name.sendKeys("PATIL");
		Thread.sleep(3000);

		WebElement user_name=driver.findElement(By.id("userName"));
		user_name.sendKeys("patilgaurav775");
		Thread.sleep(3000);
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Gaurav@123");
		Thread.sleep(3000);
		
		WebElement checkbox=driver.findElement(By.className("recaptcha-checkbox-border"));
		checkbox.click();
		Thread.sleep(6000);
		
		WebElement register=driver.findElement(By.id("register"));
		register.click();
		Thread.sleep(3000);
		
	}

}
