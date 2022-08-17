import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./Resources/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 driver.manage().window().maximize();
		 System.out.println(driver.getTitle());
		 JavascriptExecutor jsv=(JavascriptExecutor)driver;
		 jsv.executeScript("window.scrollBy(0,300);");
		 String a=driver.getWindowHandle();
		 driver.findElement(By.xpath("//a[@href='http://www.linkedin.com/groups?home=&gid=891077']")).click();
		 driver.findElement(By.xpath("//a[@href='http://www.facebook.com/OrangeHRM']")).click();
		 driver.findElement(By.xpath("//a[@href='http://twitter.com/orangehrm']")).click();
		 driver.findElement(By.xpath("//a[@href='http://www.youtube.com/orangehrm']")).click();
		 
		 Set<String> b=driver.getWindowHandles();
		 List<String> c=new ArrayList<String>(b);
		 Iterator<String> itr=c.iterator();
		 
		 for(int i=0;i<c.size();i++) {
			 if (itr.hasNext()) {
				String d=itr.next();
				if (!a.equalsIgnoreCase(d)) {
					driver.switchTo().window(c.get(i));
					System.out.println(driver.getTitle());
					driver.close();
				}
			}
			 
		 }
		 
		 //driver.close();
		

	}

}
