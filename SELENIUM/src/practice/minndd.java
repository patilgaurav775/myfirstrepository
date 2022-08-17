package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class minndd {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://demoqa.com/links");
		driver.manage().window().maximize();
		
		WebElement HOME=driver.findElement(By.cssSelector("a#simpleLink"));
		
		String current=driver.getWindowHandle();
		
		HOME.click();
		
		Set<String> home1=driver.getWindowHandles();
		
		Iterator<String> itr=home1.iterator();
		
		while(itr.hasNext()) {
			String next=itr.next().toString();
			if (!current.equalsIgnoreCase(next)) {
				driver.switchTo().window(next);
			
				WebElement link=driver.findElement(By.cssSelector("img.banner-image"));
				
				link.click();
				
			Set<String> home2=driver.getWindowHandles();
				
				Iterator<String> itr1=home2.iterator();
				while(itr1.hasNext()) {
					String next1=itr1.next().toString();
					if (!next.equalsIgnoreCase(next1)) {
						driver.switchTo().window(next1);
						Thread.sleep(5000);
						driver.close();
						break;
						
				
			}
			
		}
			
		
			
			
				
			}
		}
	}

}
