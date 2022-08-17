package LInkedIn_course;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class switch_to_window {
public static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\Resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://formy-project.herokuapp.com/switch-window");
		String base_window=driver.getWindowHandle();
		WebElement open_new_window=driver.findElement(By.id("new-tab-button"));
		open_new_window.click();
		
		Set<String> next_window=driver.getWindowHandles();
		
	/*	Iterator<String> itr=next_window.iterator();
		
		while(itr.hasNext()) {
			String a=itr.next();
			if (!a.equalsIgnoreCase(base_window)) {
				driver.switchTo().window(base_window);
			}
		}*/
		
		
		for(String nextwindow:driver.getWindowHandles()) {
			driver.switchTo().window(nextwindow);
		}
		driver.switchTo().window(base_window);
		
		driver.quit();

	}

}
