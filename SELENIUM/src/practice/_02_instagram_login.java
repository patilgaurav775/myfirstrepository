package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class _02_instagram_login {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.edge.driver", "Resources/msedgedriver.exe");
		
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.instagram.com");
		Thread.sleep(3000);
		
		WebElement email=driver.findElement(By.cssSelector("input[aria-label=\"Phone number, username, or email\"]"));
		email.sendKeys("patilgaurav775@gmail.com");
		Thread.sleep(3000);
		
		WebElement password=driver.findElement(By.cssSelector("input[aria-label=\"Password\"]"));
		password.sendKeys("Gaurav@123");
		Thread.sleep(3000);
		
		WebElement show=driver.findElement(By.cssSelector("button[class=\"sqdOP yWX7d     _8A5w5    \"]"));
		show.click();
		Thread.sleep(3000);
		
		
		WebElement login_with_facebook=driver.findElement(By.className("KPnG0"));
		login_with_facebook.click();
		Thread.sleep(3000);
		
		
		WebElement facebook_mail=driver.findElement(By.cssSelector("input[placeholder='Email address or phone number']"));
		facebook_mail.sendKeys("patilgaurav775@gmail.com");
		Thread.sleep(3000);
		
		WebElement facebook_password=driver.findElement(By.cssSelector("input[placeholder='Password']"));
		facebook_password.sendKeys("Gaurav@123");
		Thread.sleep(3000);
				
		WebElement facebook_login_button=driver.findElement(By.id("loginbutton"));
		facebook_login_button.click();
		Thread.sleep(3000);
		//driver.quit();
		
		WebElement not_now_button=driver.findElement(By.xpath("//div[@class='piCib']//button[@class='aOOlW  bIiDR  ']"));
		not_now_button.click();
		Thread.sleep(3000);
		
		/*Alert obj=driver.switchTo().alert();
		obj.dismiss();*/
		
		
		
	
		
		
		
	}

}
