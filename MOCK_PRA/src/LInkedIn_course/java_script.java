package LInkedIn_course;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class java_script {
public static WebDriver driver;



	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", ".\\Resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://formy-project.herokuapp.com/modal");

		WebElement modal_button=driver.findElement(By.id("modal-button"));
		modal_button.click();
		
		driver.manage().deleteAllCookies();
		
		JavascriptExecutor jsv=(JavascriptExecutor) driver;
		WebElement close_button=driver.findElement(By.id("close-button"));
	//	jsv.executeScript("document.getElementById('close-button').click();");
		jsv.executeScript("arguments[0].click();",close_button);
		
		//driver.quit();
		
		
		
		
		
			
	}

}
