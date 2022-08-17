package fffff;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Bluetooth_Earphone {
	public static WebDriver driver;
	public static String a;

	@BeforeSuite
	public static void launch()  {
		System.setProperty("webdriver.chrome.driver",".\\Resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}
	
	
	@Test()
	public static void M1() throws InterruptedException  {
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Actions atn=new Actions(driver);
		atn.clickAndHold(driver.findElement(By.xpath("//img[@alt='Electronics']"))).perform();
		
		/*List<WebElement> electronic_subitem=driver.findElements(By.xpath("//a[@class='_6WOcW9 _3YpNQe']"));
		Iterator<WebElement> itr=electronic_subitem.iterator();
		
		while(itr.hasNext()) {
			WebElement a=itr.next();
			driver.navigate().refresh();
			if (a.getText().equalsIgnoreCase("Bluetooth Headphones")) {
				a.click();
			}
			
		}*/
		
		
		driver.findElement(By.xpath("//a[text()='Bluetooth Headphones']")).click();
		Thread.sleep(3000);
		
		WebElement select1=driver.findElement(By.xpath("//div[@class='_1YAKP4']//select[@class='_2YxCDZ']"));
		/*WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000))*/
				
	//	wait.until(ExpectedConditions.visibilityOf(select1));
		Select sltmin=new Select(select1);
		sltmin.selectByValue("500");
		Thread.sleep(3000);
		
		Select sltmax=new Select(driver.findElement(By.xpath("//div[@class='_3uDYxP']//select[@class='_2YxCDZ']")));
		sltmax.selectByValue("2000");
		Thread.sleep(3000);
		
		//wait.until(ExpectedConditions.visibilityOf(select1));
		WebElement true_wireless=driver.findElement(By.xpath("//div[@title='True Wireless']//div[@class='_24_Dny']"));
	//	wait.until(ExpectedConditions.visibilityOf(true_wireless));
		true_wireless.click();
		 a=driver.getWindowHandle();
	Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	WebElement earphone=driver.findElement(By.xpath("(//img[contains(@alt,'Mivi DuoPods F60 ENC with 50')])[1]"));
	jse.executeScript("arguments[0].scrollIntoView();",earphone);
	earphone.click();
	
	
	
	}
	
	@Test(dependsOnMethods = "M1")
	public static void M2() throws InterruptedException  {
	
Set<String> b=driver.getWindowHandles();
	
	Iterator<String> itr=b.iterator();
	
	while(itr.hasNext()) {
		String c=itr.next();
		if(!a.equalsIgnoreCase(c)) {
			driver.switchTo().window(c);
			String name=driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
			System.out.println("model name is "+name);
			
			String price=driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']")).getText();
			System.out.println("model price is "+price);
			
			
			driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2U9uOA i')]")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[contains(@class,'_2IX_2- _17N0em')]")).sendKeys("8806699604");
			Thread.sleep(2000);
			
			driver.close();
			
		}
	}
	
	driver.switchTo().window(a);
		driver.close();
		
	}

}
