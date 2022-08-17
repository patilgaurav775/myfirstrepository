package TCS;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class colour_testing {
	
	public static WebDriver driver;

	@BeforeSuite
	public void common() {
		System.setProperty("webdriver.chrome.driver", ".\\Resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@BeforeMethod
	public void preq() {
		
		
		try {
			Alert alt=	driver.switchTo().alert();
			alt.accept();
			
			}catch(NoAlertPresentException g) {
			System.out.println("Alert is not preset");
		}
		
		
		try {
			WebDriverWait wte=new WebDriverWait(driver,Duration.ofSeconds(20));
		List<WebElement> adds=driver.findElements(By.xpath("//iframe[contains(@id,'google_ads_iframe')]"));
		Iterator<WebElement> itr=adds.iterator();
		while(itr.hasNext()) {
		if(wte.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(itr.next()))!=null) {
		driver.findElement(By.cssSelector("path[d='M3.25,3.25l8.5,8.5M11.75,3.25l-8.5,8.5']")).click();
		driver.switchTo().defaultContent();
	}else{
		System.out.println("frame is not available");
	}	
		}	
		}catch(Exception f) {
			f.printStackTrace();
		}
	}

	@Test(description="verify colour of submit btn")
	public void TC1() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement submit=driver.findElement(By.xpath("//button[@id='submit']"));
		js.executeScript("arguments[0].scrollIntoView();", submit);
	String c1=submit.getCssValue("color");
	System.out.println("colour without hex code : "+c1);
	String c2=Color.fromString(c1).asHex();
	System.out.println("colour with hex code : "+c2);
	}
	}


