package COLLECTION_REAL;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_handle_by_arraylist {
	public static WebDriver driver;
	 public static void main(String[] args) throws InterruptedException  {
	  System.setProperty("webdriver.chrome.driver",".\\Resources\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://demoqa.com/links");
	  driver.manage().window().maximize();
	  String ID=driver.getWindowHandle();
	  
	  driver.findElement(By.id("simpleLink")).click();
	  
	  Set<String> ID2=driver.getWindowHandles();
	  ArrayList<String> list=new ArrayList<String>(ID2);
	  driver.switchTo().window(list.get(1));
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//a[contains(@href,'www.toolsqa.com/')]")).click();
	     driver.close();
	 Thread.sleep(4000);
	 
	  Set<String> ID3=driver.getWindowHandles();
	  ArrayList<String> latestlist=new ArrayList<String>(ID3);
	  Thread.sleep(4000);
	  driver.switchTo().window(latestlist.get(0));
	  
	 }
}
