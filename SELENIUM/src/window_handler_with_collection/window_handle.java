package window_handler_with_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class window_handle {
	
	public static WebDriver driver;
	 
	 public static void main(String[] args) throws InterruptedException {
	  // TODO Auto-generated method stub
	  System.setProperty("webdriver.chrome.driver", ".\\Resources\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.manage().window().maximize();
	  String parent_Id=driver.getWindowHandle();
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//a[contains(@href,'linkedin.com')]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[contains(@href,'facebook.com')]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[contains(@href,'twitter.com')]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[contains(@href,'youtube.com')]")).click();
	 
	  
	  Set<String> AllId=driver.getWindowHandles();
	  List<String> list1=new ArrayList<String>(AllId);
	  
	  if(switchToChoiseWindow("Facebook",list1)) {
	   System.out.println(driver.getCurrentUrl()+" :> "+driver.getTitle());
	   
	  }
	  
	//  closeAllWindow(parent_Id,list);
	  
	 // MoveToParent(parent_Id);
	  

	 }
	 
	 public static boolean switchToChoiseWindow(String titles,List<String> list) {
	  for(String e:list) {
	   driver.switchTo().window(e);
	   String title= driver.getTitle();
	   if(title.contains(titles)) {
	    return true;
	    
	   }
	   
	  }
	  return false;
	  
	 }
	 
	 public static void closeAllWindow(String parentID,List<String> list) {
	  for(String r:list) {
	   if(!r.equals(parentID)) {
	    driver.switchTo().window(r);
	    driver.close();
	   }
	   
	  }
	  
	 }
	 
	 
	 public static void MoveToParent(String parentId) {
	  driver.switchTo().window(parentId);
	  System.out.println(driver.getTitle()+" :> "+driver.getCurrentUrl()); 
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin ");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123 ");
	  driver.findElement(By.id("btnLogin")).click();
	  
	 }

	}
