package PRACTICE2;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/links");
		driver.manage().window().maximize();
		/*
		System.out.println( driver.findElements(By.tagName("a")).size());
		
		List<WebElement> link=driver.findElements(By.tagName("a"));
		Iterator<WebElement> itr=link.iterator();
		
		while(itr.hasNext()) {
			System.out.println( itr.next().getText());
		}*/
		List<WebElement> aa=driver.findElements(By.tagName("a"));
		
		System.out.println(aa);

	}

}
