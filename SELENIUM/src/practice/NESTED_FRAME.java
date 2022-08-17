package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NESTED_FRAME {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();

		WebElement parent=driver.findElement(By.cssSelector("iframe[id='frame1']"));
		
		driver.switchTo().frame(parent);
		
		WebElement child=driver.findElement(By.cssSelector("iframe[srcdoc='<p>Child Iframe</p>']"));
		
		driver.switchTo().frame(child);
		
		WebElement locator=driver.findElement(By.xpath("//p[text()='Child Iframe']"));
		
		System.out.println(locator.getText());
		
	}

}
