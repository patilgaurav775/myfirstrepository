import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import graphql.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class orange_hrm {
	public static WebDriver driver;
	
	@BeforeSuite()
	public static void launch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(("https://opensource-demo.orangehrmlive.com/"));
		driver.manage().window().maximize();
	}
	
	@Test(priority = -1)
	public static void login() {
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input#btnLogin")).click();
		boolean dashboard_is_selected=driver.findElement(By.xpath("//h1[text()=\"Dashboard\"]")).isDisplayed();
		assertEquals(dashboard_is_selected, true);
	}
	
	@Test(priority = 0)
	public static void new_window() {
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
		
		JavascriptExecutor jsv=(JavascriptExecutor) driver;
		jsv.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("(//span[@class=\"col l12 vacancy-name\"])[11]")));
		
		driver.findElement(By.xpath("(//span[@class=\"col l12 vacancy-name\"])[11]")).click();
}
			
		
		
	}

}
