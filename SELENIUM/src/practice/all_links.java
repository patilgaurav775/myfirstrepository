package practice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class all_links {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/links");
		
		List<WebElement> list=driver.findElements(By.tagName("a"));
		
		Iterator<WebElement> itr=list.iterator();
		
		/*int i=0;
		while(i<list.size()) {
			System.out.println(list.get(i).getText());
			i++;
		}*/
		
		while(itr.hasNext()) {
			System.out.println(itr.next().getText());
		}
		

	}

}
