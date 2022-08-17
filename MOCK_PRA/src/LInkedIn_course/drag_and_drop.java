package LInkedIn_course;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_and_drop {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://formy-project.herokuapp.com/dragdrop");
		
		WebElement logo=driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
		
		
		
		WebElement box=driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable']"));
		
		Actions action=new Actions(driver);
		
		action.dragAndDrop(logo, box).build().perform();
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
