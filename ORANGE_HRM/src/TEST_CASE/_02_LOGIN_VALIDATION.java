package TEST_CASE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_LOGIN_VALIDATION {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.id("txtUsername"));
		WebElement password=driver.findElement(By.id("txtPassword"));
		WebElement login=driver.findElement(By.id("btnLogin"));
		
	if (username.isDisplayed()&&password.isDisplayed()) {
		username.sendKeys("Admin");
		Thread.sleep(3000);
		password.sendKeys("admin123");
		Thread.sleep(3000);
		login.click();
		System.out.println("login button is clickable");
		}
		
		WebElement dashboard=driver.findElement(By.id("menu_dashboard_index"));
		if (dashboard.isDisplayed()) {
			System.out.println("LOGIN SUCCESSFULLY TEST CASE IS PASSED");
		}
		else {
			System.out.println("CAN'T LOGIN SUCCESSFULLY TEST CASE IS FAILED");
		}

	}

}
