package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Text_Box {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "Resources\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		////////////////////////////////////////////////////////TEXTBOX/////////////////////////////////////////////////////////////////////////////

		//obj.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.navigate().to("http://demoqa.com");
		System.out.println(driver.getTitle());
		
		WebElement element=driver.findElement(By.cssSelector("div[class='card mt-4 top-card']"));
		element.click();
		Thread.sleep(3000);
		
		WebElement Textbox=driver.findElement(By.cssSelector("ul[class='menu-list'] li[id='item-0'][class='btn btn-light ']"));
		Textbox.click();
		Thread.sleep(3000);
		
		WebElement Username=driver.findElement(By.id("userName"));
		Username.sendKeys("GAURAV SANJAY PATIL");
		Thread.sleep(3000);
		
		WebElement Email=driver.findElement(By.cssSelector("input[type='email']"));
		Email.sendKeys("PATILGAURAV775@GMAIL.COM");
		Thread.sleep(3000);
		
		WebElement Current_Address=driver.findElement(By.id("currentAddress"));
		Current_Address.sendKeys("953, vivekanand nagar bhadgaon road tal-pachora,Dist-jalgaon,State-maharastra");
		Thread.sleep(3000);
		
		WebElement Permanant_Address=driver.findElement(By.id("permanentAddress"));
	//	Permanant_Address.sendKeys("953, vivekanand nagar bhadgaon road tal-pachora,Dist-jalgaon,State-maharastra");
		JavascriptExecutor jsv=(JavascriptExecutor) driver;
		jsv.executeScript("document.getElementById('permanentAddress').value='953, ,Dist-jalgaon,State-maharastra'");
		Thread.sleep(3000);
		
		Username.clear();
		Username.sendKeys("gaurav patil");
		Thread.sleep(3000);
		
		//JavascriptExecutor jsv=(JavascriptExecutor) driver;
		jsv.executeScript("window.scrollBy(0,300);");
		Thread.sleep(3000);
		
		WebElement Submit=driver.findElement(By.id("submit"));
		Submit.click();
		Thread.sleep(3000);
		
		System.out.println(Username.getTagName());                  //TAG NAME
		System.out.println(Submit.getText());							//
		System.out.println(Username.getAttribute("id"));				//ATTRITBUTE VALUE
		
	
		
		
	}

}
