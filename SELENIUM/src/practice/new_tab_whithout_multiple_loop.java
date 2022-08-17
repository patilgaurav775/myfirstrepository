package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class new_tab_whithout_multiple_loop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
		String current_window=driver.getWindowHandle();                                                      //NEW TAB
		
		WebElement NewTab=driver.findElement(By.id("tabButton"));
		NewTab.click();
		Thread.sleep(3000);
		
		WebElement obj=driver.findElement(By.id("windowButton"));                                 	   //NEW WINDOW
		obj.click();
		Thread.sleep(3000);
		 
		WebElement obj1=driver.findElement(By.id("messageWindowButton"));                    //NEW WINDOW MESSAGE
		obj1.click();
		Thread.sleep(3000);
		
		Set<String> handles=driver.getWindowHandles();
		
		Iterator<String> itr=handles.iterator();
		
		while(itr.hasNext()) {
			String both_window=itr.next().toString();
			if (!both_window.equalsIgnoreCase(current_window)) {
				driver.switchTo().window(both_window);
				Thread.sleep(3000);
				driver.close();
				System.out.println("test case run successfully");
			}
		}

	}

}
