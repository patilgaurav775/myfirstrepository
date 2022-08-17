package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class New_Tab_with_multiple_while_loop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
		String current_window=driver.getWindowHandle();                                                      //NEW TAB
		
		WebElement NewTab=driver.findElement(By.id("tabButton"));
		NewTab.click();
		
		Set<String> handles=driver.getWindowHandles();
		
		Iterator<String> itr=handles.iterator();
		
		while(itr.hasNext()) {
			String both_window=itr.next().toString();
			if (!both_window.equalsIgnoreCase(current_window)) {
				driver.switchTo().window(both_window);
				Thread.sleep(3000);
				driver.close();
			}
		}
		
		driver.switchTo().window(current_window);
		
		WebElement obj=driver.findElement(By.id("windowButton"));                                  //NEW WINDOW
		obj.click();
		
		Set<String> handle=driver.getWindowHandles();
		
		Iterator itr1=handle.iterator();
		
		while(itr1.hasNext()) {
			String next_window=itr1.next().toString();
			if(!current_window.equalsIgnoreCase(next_window)) {
				driver.switchTo().window(next_window);
				Thread.sleep(3000);
				driver.close();
			}
		}
		
driver.switchTo().window(current_window);
		
		WebElement obj1=driver.findElement(By.id("messageWindowButton"));                //NEW WINDOW MESSAGE
		obj1.click();
		
		Set<String> handle1=driver.getWindowHandles();
		
		Iterator itr2=handle1.iterator();
		
		while(itr2.hasNext()) {
			String next_window1=itr2.next().toString();
			if(!current_window.equalsIgnoreCase(next_window1)) {
				driver.switchTo().window(next_window1);
				Thread.sleep(3000);
				driver.close();
				System.out.println("test case is passed");
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*String parentwindow=driver.getWindowHandle();
		 
		System.out.println(driver.getWindowHandle()+"is the unique key");
		
		WebElement NewTab=driver.findElement(By.id("tabButton"));
		NewTab.click();
		
		Set<String> handles=driver.getWindowHandles();
		
		Iterator<String> handlesitr=handles.iterator();
		
		while(handlesitr.hasNext()) {
		//System.out.println(handlesitr.next().toString());
		
			String child=handlesitr.next().toString();
				if (!parentwindow.equalsIgnoreCase(child)) {
				driver.switchTo().window(parentwindow);
		}
			
		}*/
		
		
		

	}

}
