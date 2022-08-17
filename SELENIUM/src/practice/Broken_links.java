package practice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_links {

	public static void main(String[] args) {
		try {
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/broken");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("p"));
		
		Iterator<WebElement> itr=links.iterator();
	
		
		while(itr.hasNext()) {
			
			WebElement child=itr.next();
			
			if (child.getAttribute("href")==null || child.getAttribute("href").isEmpty()) {
				System.out.println("Link is Broken "+child.getText());
				continue;
			}
		}
		}
		catch (Exception e) {
			// TODO: handle exception
		}

	}

}
