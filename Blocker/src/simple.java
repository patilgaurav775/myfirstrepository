import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class simple {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(("https://opensource-demo.orangehrmlive.com/"));
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input#btnLogin")).click();
		boolean dashboard_is_selected=driver.findElement(By.xpath("//h1[text()=\"Dashboard\"]")).isDisplayed();
		assertEquals(dashboard_is_selected, true);		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String a=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[@href='http://www.orangehrm.com']")).click();
		Set<String> st=driver.getWindowHandles();
		List<String> lst=new LinkedList<String>(st);
		driver.switchTo().window(lst.get(1));
		if(driver.findElement(By.xpath("(//a[@class='link'])[4]")).isDisplayed()){
			Actions act=new Actions(driver);
		WebElement link=driver.findElement(By.xpath("(//a[@class='link'])[4]"));
		act.clickAndHold(link).build().perform();		
		driver.findElement(By.cssSelector("a[href='company/careers/current-vacancies/']")).click();		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Accept Cookies']")).click();
		JavascriptExecutor jsv=(JavascriptExecutor) driver;		
		jsv.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//a[@class='btn-orange trial-btn pulse ']")));		
		driver.findElement(By.xpath("//a[@class='btn-orange trial-btn pulse ']")).click();
		if (driver.findElement(By.cssSelector("h3[class='center']")).isDisplayed()) {
			//driver.findElement(By.cssSelector("h3[class='center']")).sendKeys("Gaurav");
			jsv.executeScript("document.getElementById('Form_submitForm_FirstName').value='Gaurav'");
			jsv.executeScript("document.getElementById('Form_submitForm_LastName').value='Patil'");
			jsv.executeScript("document.getElementById('Form_submitForm_Email').value='patilgaurav775@gmail.com'");
			jsv.executeScript("document.getElementById('Form_submitForm_Contact').value='88066699608'");
			Select sl=new Select(driver.findElement(By.cssSelector("select[name='Country']")));
			sl.selectByValue("India");
			driver.findElement(By.xpath("(//a[@href=\"/hris-hr-software-demo/#\"])[3]")).click();
			jsv.executeScript("argument[0].scrollIntoView();",driver.findElement(By.xpath("//a[@href=\"http://api.orangehrm.com\"]")));
		}
	}
	}
	}
