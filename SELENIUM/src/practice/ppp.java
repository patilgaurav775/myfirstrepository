package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ppp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/links");
		driver.manage().window().maximize();
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		String current_page=driver.getWindowHandle();                 					         //command current page la dili
		
		WebElement home=driver.findElement(By.id("simpleLink")) ;
		home.click();
		
		Set<String> page=driver.getWindowHandles();
		
		Iterator<String> itr1=page.iterator();                                   
		
		while(itr1.hasNext()) {  
			String next_page=itr1.next().toString();
			if (!current_page.equalsIgnoreCase(next_page)) {
					Thread.sleep(3000);
					driver.switchTo().window(current_page);
					Thread.sleep(3000);
					driver.close();
				}
		}
		driver.switchTo().window(current_page);
		WebElement home2=driver.findElement(By.id("dynamicLink")) ;
		home.click();
		
		Set<String> page1=driver.getWindowHandles();	
		Iterator<String> itr2=page1.iterator();
		
		while(itr2.hasNext()) {  
			String next_page=itr2.next().toString();
				if (!current_page.equalsIgnoreCase(next_page)) {
					Thread.sleep(3000);
					driver.switchTo().window(current_page);
					Thread.sleep(3000);
					driver.close();
			}
		}
	}
}
