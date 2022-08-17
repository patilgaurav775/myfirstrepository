package fffff;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class earphone {

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
	    
		driver.findElement(By.xpath("//div[text()='Furniture']")).click();
		Thread.sleep(3000);
		
		JavascriptExecutor jsv=(JavascriptExecutor) driver;
		WebElement furniture=driver.findElement(By.xpath("//img[@alt='NAKODA Plastic Free Standing Chest of Drawers']"));
		jsv.executeScript("arguments[0].scrollIntoView();",furniture);
		Thread.sleep(3000);
		furniture.click();
		Thread.sleep(3000);
	
		WebElement slt=driver.findElement(By.xpath("//div[@class='_1YAKP4']//select[@class='_2YxCDZ']"));
		Select sltmin=new Select(slt);
		sltmin.selectByValue("500");
		Thread.sleep(3000);
	
		WebElement slt1=driver.findElement(By.xpath("//div[@class='_3uDYxP']//select[@class='_2YxCDZ']"));
		Select sltmax=new Select(slt1);
		sltmax.selectByValue("3000");
		
			
		Thread.sleep(3000);
		WebElement furniture1=driver.findElement(By.xpath("//div[@data-id='RSFEZ9SKGANWJKFX']//img[@alt='Wud Kraft Plastic Free Standing Chest of Drawers']"));
		jsv.executeScript("arguments[0].scrollIntoView();",furniture1);
		Thread.sleep(3000);
		furniture1.click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();
		Thread.sleep(5000);
	}
	

}
